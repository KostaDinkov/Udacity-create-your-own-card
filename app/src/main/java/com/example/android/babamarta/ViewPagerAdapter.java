package com.example.android.babamarta;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


public class ViewPagerAdapter extends PagerAdapter {

    private Context mContext;

    ViewPagerAdapter(Context context) {
        mContext = context;
    }

    @Override
    public Object instantiateItem(ViewGroup collection, int position) {
        ModelObject modelObject = ModelObject.values()[position];
        LayoutInflater inflater = LayoutInflater.from(mContext);

        ViewGroup layout = (ViewGroup) inflater.inflate(modelObject.getLayoutResourceId(), collection, false);

        ImageView imageView = (ImageView) layout.findViewById(R.id.imageBackground);
        TextView textView = (TextView) layout.findViewById(R.id.info_text);

        imageView.setImageResource(modelObject.getImageId());
        textView.setText(modelObject.getmInfoId());

        collection.addView(layout);
        return layout;
    }

    @Override
    public int getCount() {
        return ModelObject.values().length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public void destroyItem(ViewGroup collection, int position, Object view) {

        collection.removeView((View) view);
    }
}
