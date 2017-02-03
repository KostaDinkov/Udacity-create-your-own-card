package com.example.android.babamarta;

public enum ModelObject {
    FIRST(R.layout.view_first),
    SECOND(R.layout.view_second),
    THIRD(R.layout.view_third);

    private int mLayoutResourceId;

    ModelObject(int layoutResourceId) {
        mLayoutResourceId = layoutResourceId;
    }

    public int getLayoutResourceId() {
        return mLayoutResourceId;
    }
}
