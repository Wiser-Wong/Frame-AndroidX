package com.wiser.library.model;

import com.wiser.library.adapter.WISERRVAdapter;

import androidx.annotation.LayoutRes;

/**
 * @author Wiser
 * @version 版本
 */
public class WISERFooterModel {

	@LayoutRes public int							footerLayoutId;

	public WISERRVAdapter.OnFooterCustomListener	onFooterCustomListener;

}
