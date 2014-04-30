package com.example.slidingfinish;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ViewPagerActivity extends SwipeBackActivity {
	private ViewPager viewPager;
	private List<View> list = new ArrayList<View>();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_viewpager);
		
		viewPager = (ViewPager) findViewById(R.id.frame_main_viewpage);
		
		for(int i=0; i<5; i++){
			View v = LayoutInflater.from(this).inflate(R.layout.activity_normal, null);
			list.add(v);
		}
		
		System.out.println(list.size());
		
		viewPager.setAdapter(new Adapter(this, list));
	}
	
	
	
	public class Adapter extends PagerAdapter{
		private List<View> list;
		
		public Adapter(Context context, List<View> list){
			this.list = list;
		}

		@Override
		public int getCount() {
			return list.size();
		}

		@Override
		public boolean isViewFromObject(View arg0, Object arg1) {
			return arg0 == arg1;
		}

		@Override
		public void destroyItem(ViewGroup container, int position, Object object) {
			((ViewPager)container).removeView(list.get(position));
		}

		@Override
		public Object instantiateItem(ViewGroup container, int position) {
			View v = list.get(position);
			((ViewPager)container).addView(v);
			return v;
		}

		
		
	}


}
