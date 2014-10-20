package com.edu.gdmec.s07131041.interdemo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends Activity {
	TextView myTv;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.second);
		myTv=(TextView) findViewById(R.id.textView1);
		String msg = getIntent().getExtras().getString("para1");
		myTv.setText(msg);
	}

}
