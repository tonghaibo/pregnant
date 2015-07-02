package com.example.pregnant;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

public class HyxzView extends Activity {
	
	ListView listView;
	SimpleAdapter adapter;
	List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();

	int position;
	View tempView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.list);
	    
		listView = (ListView) findViewById(R.id.listView1);
		
		String[] from = { "image", "title" };
		int[] to = { R.id.imageView1, R.id.textView1 };
		adapter = new SimpleAdapter(getApplicationContext(), getdate(),
				R.layout.list_view_row, from, to);
		listView.setAdapter(adapter);
		
		listView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				// TODO Auto-generated method stub
				Toast.makeText(getApplicationContext(),
						"您选择的是"+list.get(position).get("title").toString(),
					     Toast.LENGTH_SHORT).show();
				Intent intent;				
				switch (position) {
				case 0:
					intent=new Intent(HyxzView.this, Detail.class);
					intent.putExtra("url", "file:///android_asset/html/huaiyunxuzhi/hyxz1.html");
					startActivity(intent);
					break;
				case 1:
					intent=new Intent(HyxzView.this, Detail.class);
					intent.putExtra("url", "file:///android_asset/html/huaiyunxuzhi/hyxz2.html");
		            startActivity(intent);
					break;
				case 2:
					intent=new Intent(HyxzView.this, Detail.class);
					intent.putExtra("url", "file:///android_asset/html/huaiyunxuzhi/hyxz3.html");
		            startActivity(intent);
					break;
				case 3:
					intent=new Intent(HyxzView.this, Detail.class);
					intent.putExtra("url", "file:///android_asset/html/huaiyunxuzhi/hyxz4.html");
		            startActivity(intent);
					break;
				case 4:
					intent=new Intent(HyxzView.this, Detail.class);
					intent.putExtra("url", "file:///android_asset/html/huaiyunxuzhi/hyxz5.html");
		            startActivity(intent);
					break;
				case 5:
					intent=new Intent(HyxzView.this, Detail.class);
					intent.putExtra("url", "file:///android_asset/html/huaiyunxuzhi/hyxz6.html");
		            startActivity(intent);
					break;
				case 6:
					intent=new Intent(HyxzView.this, Detail.class);
					intent.putExtra("url", "file:///android_asset/html/huaiyunxuzhi/hyxz7.html");
		            startActivity(intent);
					break;
				case 7:
					intent=new Intent(HyxzView.this, Detail.class);
					intent.putExtra("url", "file:///android_asset/html/huaiyunxuzhi/hyxz8.html");
		            startActivity(intent);
					break;
				case 8:
					intent=new Intent(HyxzView.this, Detail.class);
					intent.putExtra("url", "file:///android_asset/html/huaiyunxuzhi/hyxz9.html");
		            startActivity(intent);
					break;
				case 9:
					intent=new Intent(HyxzView.this, Detail.class);
					intent.putExtra("url", "file:///android_asset/html/huaiyunxuzhi/hyxz10.html");
		            startActivity(intent);
					break;
				case 10:
					intent=new Intent(HyxzView.this, Detail.class);
					intent.putExtra("url", "file:///android_asset/html/huaiyunxuzhi/hyxz11.html");
		            startActivity(intent);
					break;
				case 11:
					intent=new Intent(HyxzView.this, Detail.class);
					intent.putExtra("url", "file:///android_asset/html/huaiyunxuzhi/hyxz12.html");
		            startActivity(intent);
					break;
				default:
					break;
				}
				
				
				
			}
			
		});
		
		listView.setOnItemLongClickListener(new OnItemLongClickListener() {

			@Override
			public boolean onItemLongClick(AdapterView<?> arg0, View arg1,
					int arg2, long arg3) {
				// TODO Auto-generated method stub
				position = arg2;			
				registerForContextMenu(listView);
				return false;
			}
		});

	}

	List<Map<String, Object>> getdate() {

		Map<String, Object> map = new HashMap<String, Object>();
		map.put("image", R.drawable.hyi1);
		map.put("title", "妊娠第一个月");
		list.add(map);

		map = new HashMap<String, Object>();
		map.put("image", R.drawable.hyi2);
		map.put("title", "妊娠第二个月");
		list.add(map);

		map = new HashMap<String, Object>();
		map.put("image", R.drawable.hyi3);
		map.put("title", "妊娠第三个月");
		list.add(map);
		map = new HashMap<String, Object>();
		map.put("image", R.drawable.hyi4);
		map.put("title", "妊娠第四个月");
		list.add(map);
		map = new HashMap<String, Object>();
		map.put("image", R.drawable.hyi5);
		map.put("title", "妊娠第五个月");
		list.add(map);
		map = new HashMap<String, Object>();
		map.put("image", R.drawable.hyi6);
		map.put("title", "妊娠第六个月");
		list.add(map);
		map = new HashMap<String, Object>();
		map.put("image", R.drawable.hyi7);
		map.put("title", "妊娠第七个月");
		list.add(map);
		map = new HashMap<String, Object>();
		map.put("image", R.drawable.hyi8);
		map.put("title", "妊娠第八个月");
		list.add(map);
		map = new HashMap<String, Object>();
		map.put("image", R.drawable.hyi9);
		map.put("title", "妊娠第九个月");
		list.add(map);
		map = new HashMap<String, Object>();
		map.put("image", R.drawable.hyi10);
		map.put("title", "妊娠第十个月");
		list.add(map);
		map = new HashMap<String, Object>();
		map.put("image", R.drawable.hyi11);
		map.put("title", "省时省力 孕妈咪产检五大攻略");
		list.add(map);
		map = new HashMap<String, Object>();
		map.put("image", R.drawable.hyi12);
		map.put("title", "孕期锻炼 4项运动助准妈妈好孕");
		list.add(map);
		return list;

	};

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onCreateContextMenu(ContextMenu menu, View v,
			ContextMenuInfo menuInfo) {
		// 设置Title
		menu.setHeaderTitle("快捷菜单");

		// 第一种“添加子菜单”的方式
		// 获取菜单 Inflater
		// MenuInflater inflater = getMenuInflater();
		// //加载快捷菜单的数据
		// inflater.inflate(R.menu.shortcut_menu,menu);
		menu.addSubMenu(0, Menu.FIRST, 1, "删除");
		menu.addSubMenu(0, Menu.FIRST + 1, 2, "分享");
		

	}
	
	@Override
	public boolean onContextItemSelected(MenuItem item) {
		// 记录item的ID
		Log.i("xgh:item's id：", "" + item.getItemId());
		switch (item.getItemId()) {
		case 1:
			list.remove(position);
			adapter.notifyDataSetChanged();
			Toast.makeText(HyxzView.this, "已成功删除第" + (position + 1) + "项",
					0).show();
			break;
		case 2:			
			Toast.makeText(HyxzView.this, "暂时无法分享！！！", 0).show();
			break;

		default:
			break;
		}
		return true;
	}
	

}