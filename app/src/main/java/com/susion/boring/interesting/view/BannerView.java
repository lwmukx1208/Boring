package com.susion.boring.interesting.view;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;
import com.susion.boring.R;
import com.susion.boring.interesting.model.Banner;

/**
 * Created by susion on 17/3/9.
 */
public class BannerView extends LinearLayout{

    private SimpleDraweeView mSdvImag;
    private TextView mTvTitle;

    public BannerView(Context context) {
        super(context);
        initView();
    }

    public BannerView(Context context, Banner banner) {
        super(context);
        initView();
    }

    private void initView() {
        View.inflate(getContext(), R.layout.view_banner, this);
        mSdvImag = (SimpleDraweeView) findViewById(R.id.view_banner_iv_img);
        mTvTitle = (TextView) findViewById(R.id.view_banner_tv_title);
    }

    public void setTitle(String title){
        mTvTitle.setText(title+"");
    }

    public void setImgUrl(String url){
        mSdvImag.setImageURI(url);
    }

}
