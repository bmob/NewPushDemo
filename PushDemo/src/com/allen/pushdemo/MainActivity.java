package com.allen.pushdemo;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import cn.bmob.push.BmobPush;
import cn.bmob.v3.Bmob;
import cn.bmob.v3.BmobInstallation;

public class MainActivity extends Activity {

	private Context mContext;
	private Button mStopButton;
	private Button mStartButton;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		mContext = getApplicationContext();
		setContentView(R.layout.activity_main);
		mStopButton = (Button) findViewById(R.id.btn_stop);
		mStartButton = (Button) findViewById(R.id.btn_start);
//		Bmob.initialize(this, "1dc0c1bccb4b57e045ddddb82ee33aff");
//		BmobInstallation.getCurrentInstallation(this).save();
//		BmobPush.startWork(this);
		mStopButton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				BmobPush.stopWork();
			}
		});
		mStartButton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				BmobPush.startWork(mContext);
			}
		});
		
		
	}

}
