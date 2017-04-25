package com.allen.pushdemo;

import cn.bmob.push.BmobPush;
import cn.bmob.v3.Bmob;
import cn.bmob.v3.BmobInstallation;
import android.app.Application;

public class MyApplication extends Application {
	@Override
	public void onCreate() {
		super.onCreate();
		Bmob.initialize(this, "");
		BmobInstallation.getCurrentInstallation(this).save();
		BmobPush.startWork(this);
	}

}
