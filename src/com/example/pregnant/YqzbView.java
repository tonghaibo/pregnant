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

public class YqzbView extends Activity {
	
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
		
//		String[] from = { "image", "title" };
//		int[] to = { R.id.imageView1, R.id.textView1 };
		adapter = new SimpleAdapter(getApplicationContext(), getdate(),
				R.layout.list_view_row, new String[]{ "image", "title" },
				new int[]{ R.id.imageView1, R.id.textView1 });
		listView.setAdapter(adapter);
		
		listView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				// TODO Auto-generated method stub
				Intent intent;
				switch (position) {
				case 0:
					intent=new Intent(YqzbView.this, Detail.class);
					intent.putExtra("url", "file:///android_asset/html/yunqianzhunbei/yqzb1.html");
		            startActivity(intent);
					break;
				case 1:
					intent=new Intent(YqzbView.this, Detail.class);
					intent.putExtra("url", "file:///android_asset/html/yunqianzhunbei/yqzb2.html");
		            startActivity(intent);
					break;
				case 2:
					intent=new Intent(YqzbView.this, Detail.class);
					intent.putExtra("url", "file:///android_asset/html/yunqianzhunbei/yqzb3.html");
		            startActivity(intent);
					break;
				case 3:
					intent=new Intent(YqzbView.this, Detail.class);
					intent.putExtra("url", "file:///android_asset/html/yunqianzhunbei/yqzb4.html");
		            startActivity(intent);
					break;
				case 4:
					intent=new Intent(YqzbView.this, Detail.class);
					intent.putExtra("url", "file:///android_asset/html/yunqianzhunbei/yqzb5.html");
		            startActivity(intent);
					break;
				case 5:
					intent=new Intent(YqzbView.this, Detail.class);
					intent.putExtra("url", "file:///android_asset/html/yunqianzhunbei/yqzb6.html");
		            startActivity(intent);
					break;
				case 6:
					intent=new Intent(YqzbView.this, Detail.class);
					intent.putExtra("url", "file:///android_asset/html/yunqianzhunbei/yqzb7.html");
		            startActivity(intent);
					break;
				case 7:
					intent=new Intent(YqzbView.this, Detail.class);
					intent.putExtra("url", "file:///android_asset/html/yunqianzhunbei/yqzb8.html");
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
		map.put("image", R.drawable.yqi1);
		map.put("title", "哪些人需要做孕前检查");
		list.add(map);

		map = new HashMap<String, Object>();
		map.put("image", R.drawable.yqi2);
		map.put("title", "未准妈妈必备孕前自检表");
		list.add(map);

		map = new HashMap<String, Object>();
		map.put("image", R.drawable.yqi3);
		map.put("title", "未做婚检者准备怀孕前须知");
		list.add(map);
		map = new HashMap<String, Object>();
		map.put("image", R.drawable.yqi4);
		map.put("title", "大龄妈妈完美备孕小贴士");
		list.add(map);
		map = new HashMap<String, Object>();
		map.put("image", R.drawable.yqi5);
		map.put("title", "大龄妈妈的孕前检查");
		list.add(map);
		map = new HashMap<String, Object>();
		map.put("image", R.drawable.yqi6);
		map.put("title", "男性也要做孕前检查");
		list.add(map);
		map = new HashMap<String, Object>();
		map.put("image", R.drawable.yqi7);
		map.put("title", "孕前检查发现问题怎么办");
		list.add(map);
		map = new HashMap<String, Object>();
		map.put("image", R.drawable.yqi8);
		map.put("title", "女人怀孕前准备");
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
			Toast.makeText(YqzbView.this, "已成功删除第" + (position + 1) + "项",
					0).show();
			break;
		case 2:			
			Toast.makeText(YqzbView.this, "暂时无法分享！！！", 0).show();
			break;

		default:
			break;
		}
		return true;
	}
	

}