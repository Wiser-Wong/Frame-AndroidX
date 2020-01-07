package com.wiser.frame_androidx;

import com.wiser.library.base.WISERBiz;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Wiser Created on 2020-01-07
 *         <p>
 *         描述
 */
public class MainActivityBiz extends WISERBiz<MainActivity> {

	public List<MainModel> getModels() {
		List<MainModel> models = new ArrayList<>();
		for (int i = 0; i < 20; i++) {
			MainModel mainModel = new MainModel();
			mainModel.s = "测试列表" + i;
			models.add(mainModel);
		}
		return models;
	}

}
