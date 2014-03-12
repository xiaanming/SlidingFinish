package com.example.slidingfinish;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;

import com.example.slidingfinish.R;

public class MainActivity extends Activity implements OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Button mButtonNormal = (Button) findViewById(R.id.normal_activity);
		mButtonNormal.setOnClickListener(this);

		Button mButtonAbs = (Button) findViewById(R.id.absListview_activity);
		mButtonAbs.setOnClickListener(this);

		Button mButtonScroll = (Button) findViewById(R.id.scrollview_activity);
		mButtonScroll.setOnClickListener(this);

	}

	@Override
	public void onClick(View v) {
		Intent mIntent = null;
		switch (v.getId()) {
		case R.id.normal_activity:
			mIntent = new Intent(MainActivity.this, NormalActivity.class);
			break;
		case R.id.absListview_activity:
			mIntent = new Intent(MainActivity.this, AbsActivity.class);
			break;
		case R.id.scrollview_activity:
			mIntent = new Intent(MainActivity.this, ScrollActivity.class);
			break;
		}

		startActivity(mIntent);
		overridePendingTransition(R.anim.base_slide_right_in, R.anim.base_slide_remain);
	}
	
	//Press the back button in mobile phone
	@Override
	public void onBackPressed() {
		super.onBackPressed();
		overridePendingTransition(0, R.anim.base_slide_right_out);
	}

}
