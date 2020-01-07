package com.wiser.frame_androidx;

import com.wiser.library.base.WISERActivity;
import com.wiser.library.base.WISERBuilder;

import android.content.Intent;

import androidx.recyclerview.widget.LinearLayoutManager;

public class MainActivity extends WISERActivity<MainActivityBiz> {

    private MainAdapter mainAdapter;

    @Override
    protected WISERBuilder build(WISERBuilder builder) {
        builder.layoutId(R.layout.activity_main);
        builder.tintStateBarColor(getResources().getColor(R.color.yellow));

        builder.recycleView().recycleViewId(R.id.rlv);
        builder.recycleView().recycleViewLinearManager(LinearLayoutManager.VERTICAL,null);
        builder.recycleView().recycleAdapter(mainAdapter = new MainAdapter(this));
        return builder;
    }

    @Override
    protected void initData(Intent intent) {
        mainAdapter.setItems(biz().getModels());
    }
}
