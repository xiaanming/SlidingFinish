package com.example.slidingfinish;

import java.util.ArrayList;
import java.util.List;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class AbsActivity extends SwipeBackActivity {
	private List<String> list = new ArrayList<String>();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_abslistview);
		
		
		ListView mListView = (ListView) findViewById(R.id.listView);
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(
				AbsActivity.this, android.R.layout.simple_list_item_1, list){

					@Override
					public int getCount() {
						return super.getCount();
					}

					@Override
					public View getView(int position, View convertView,
							ViewGroup parent) {
						
						System.out.println("getView");
						return super.getView(position, convertView, parent);
					}
			
		};
		mListView.setAdapter(adapter);
		
		for (int i = 0; i <= 30; i++) {
			list.add("²âÊÔÊý¾Ý" + i);
		}


		mListView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {

				startActivity(new Intent(AbsActivity.this, NormalActivity.class));
			}
		});
	}


}
