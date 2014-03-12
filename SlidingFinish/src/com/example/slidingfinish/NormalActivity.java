package com.example.slidingfinish;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

import com.example.view.SildingFinishLayout;
import com.example.view.SildingFinishLayout.OnSildingFinishListener;

public class NormalActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_normal);

		SildingFinishLayout mSildingFinishLayout = (SildingFinishLayout) findViewById(R.id.sildingFinishLayout);
		mSildingFinishLayout
				.setOnSildingFinishListener(new OnSildingFinishListener() {

					@Override
					public void onSildingFinish() {
						NormalActivity.this.finish();
					}
				});

		mSildingFinishLayout.setTouchView(mSildingFinishLayout);
	}
	
	// Press the back button in mobile phone
	@Override
	public void onBackPressed() {
		super.onBackPressed();
		overridePendingTransition(0, R.anim.base_slide_right_out);
	}

}
