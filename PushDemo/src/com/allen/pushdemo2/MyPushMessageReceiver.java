package com.allen.pushdemo2;

import cn.bmob.push.PushConstants;
import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class MyPushMessageReceiver extends BroadcastReceiver {
	@Override
	public void onReceive(Context context, Intent intent) {
		if (intent.getAction().equals(PushConstants.ACTION_MESSAGE)) {
				
			Log.d("intentpack", intent.getPackage());
			Log.d("contextpack", context.getPackageName());
				
				Log.d("bmob", "客户端收到推送内容：" + "demo1"+intent.getStringExtra("msg"));
				Toast.makeText(context, intent.getStringExtra("msg"), Toast.LENGTH_SHORT).show();
				
		}
	}

}
