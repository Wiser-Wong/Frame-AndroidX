package com.wiser.frame_androidx;

import com.wiser.library.adapter.WISERHolder;
import com.wiser.library.adapter.WISERRVAdapter;
import com.wiser.library.base.WISERActivity;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;

import butterknife.BindView;

/**
 * @author Wiser Created on 2020-01-07
 *         <p>
 *         描述
 */
public class MainAdapter extends WISERRVAdapter<MainModel, MainAdapter.MainHolder> {

	public MainAdapter(WISERActivity mWiserActivity) {
		super(mWiserActivity);
	}

	@Override public MainHolder newViewHolder(ViewGroup viewGroup, int type) {
		return new MainHolder(inflate(viewGroup, R.layout.main_item));
	}

	class MainHolder extends WISERHolder<MainModel> {

		@BindView(R.id.tv_name) TextView tvName;

		public MainHolder(@NonNull View itemView) {
			super(itemView);
		}

		@Override public void bindData(MainModel mainModel, int position) {
			if (mainModel == null) return;
			tvName.setText(mainModel.s);
		}
	}

}
