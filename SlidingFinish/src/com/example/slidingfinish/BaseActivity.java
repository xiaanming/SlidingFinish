package com.example.slidingfinish;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;

import com.example.view.SildingFinishLayout;

public class BaseActivity extends Activity {
	protected SildingFinishLayout layout;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		layout = (SildingFinishLayout) LayoutInflater.from(this).inflate(
				R.layout.base, null);
		layout.attachToActivity(this);
	}


}
