package com.supe.supertest.home;

import android.os.Bundle;

import com.supe.supertest.R;
import com.supermax.base.common.widget.toast.QsToast;
import com.supermax.base.mvp.fragment.QsPullFragment;

/**
 * @Author yinzh
 * @Date   2018/10/17 20:30
 * @Description
 */public class  ShouYueFragment extends QsPullFragment {

//    @Bind(R.id.iv_image)
//    ImageView iv_image;

//    @Override
//    public int layoutId() {
//        return R.layout.user_fragment;
//    }

    @Override
    public void initData(Bundle bundle) {
//        iv_image.setImageResource(R.drawable.shouyue);
    }

    @Override
    public int viewLayoutId() {
        return R.layout.shouye_fragment;
    }

    @Override
    public void onRefresh() {
        QsToast.show("刷新");
        stopRefreshing();
    }

}
