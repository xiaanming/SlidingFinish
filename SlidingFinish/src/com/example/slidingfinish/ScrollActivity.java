package com.example.slidingfinish;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

import com.example.view.SildingFinishLayout;
import com.example.view.SildingFinishLayout.OnSildingFinishListener;

public class ScrollActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_scroll);


		SildingFinishLayout mSildingFinishLayout = (SildingFinishLayout) findViewById(R.id.sildingFinishLayout);
		mSildingFinishLayout
				.setOnSildingFinishListener(new OnSildingFinishListener() {

					@Override
					public void onSildingFinish() {
						ScrollActivity.this.finish();
					}
				});

	}
	
	
	// Press the back button in mobile phone
	@Override
	public void onBackPressed() {
		super.onBackPressed();
		overridePendingTransition(0, R.anim.base_slide_right_out);
	}

}
