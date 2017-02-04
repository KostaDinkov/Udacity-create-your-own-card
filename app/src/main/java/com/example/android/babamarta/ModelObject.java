package com.example.android.babamarta;

public enum ModelObject {
    FIRST(R.layout.page_layout, R.drawable.bm1, R.string.first_info),
    SECOND(R.layout.page_layout, R.drawable.bm5, R.string.second_info),
    THIRD(R.layout.page_layout, R.drawable.bm7, R.string.third_info);

    private int mLayoutResourceId;
    private int mImgId;
    private int mInfoId;

    ModelObject(int layoutResourceId, int imgId, int infoId) {
        mLayoutResourceId = layoutResourceId;
        mImgId = imgId;
        mInfoId = infoId;
    }

    public int getLayoutResourceId() {
        return mLayoutResourceId;
    }

    public int getImageId() {
        return mImgId;
    }

    public int getmInfoId() {
        return mInfoId;
    }
}
