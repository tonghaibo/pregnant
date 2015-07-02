package com.example.pregnant;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

public class About extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		//requestWindowFeature(Window.FEATURE_CUSTOM_TITLE); // 注意顺序  
		setContentView(R.layout.about);		// 注意顺序   		
       // getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE,      // 注意顺序   
       // R.layout.titlebtn);
	}
}
