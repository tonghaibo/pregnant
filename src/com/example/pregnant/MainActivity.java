package com.example.pregnant;


import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.content.Intent;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener {
	Button yqzb, hyxz, tlbj, about;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);
		yqzb = (Button) findViewById(R.id.yqzbbtn);
		hyxz = (Button) findViewById(R.id.hyxzbtn);
		tlbj = (Button) findViewById(R.id.tlbjbtn);
		about = (Button) findViewById(R.id.aboutbtn);
		
		yqzb.setOnClickListener(this);
		hyxz.setOnClickListener(this);
		tlbj.setOnClickListener(this);
		about.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View v) {		
		// TODO Auto-generated method stub
		if (v.getId() == R.id.yqzbbtn) {
			Intent intent = new Intent();
			intent.setClass(MainActivity.this, YqzbView.class);
			startActivity(intent);
//			Toast.makeText(getApplicationContext(), "正在开发中，敬请期待！",
//				     Toast.LENGTH_SHORT).show();
		} 
		else if (v.getId() == R.id.hyxzbtn) {
			Intent intent = new Intent(this, HyxzView.class);
			startActivity(intent);
		}
		else if (v.getId() == R.id.tlbjbtn) {
			Intent intent = new Intent(this, TlbjView.class);
			startActivity(intent);
		}
		else if (v.getId() == R.id.aboutbtn) {
			Intent intent = new Intent(this, About.class);
			startActivity(intent);
		}
	}

}
