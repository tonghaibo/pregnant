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

public class TlbjView extends Activity {
	
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
					intent=new Intent(TlbjView.this, Detail.class);
					intent.putExtra("url", "file:///android_asset/html/tiaolibaojian/tlbj1.html");
		            startActivity(intent);
					break;
				case 1:
					intent=new Intent(TlbjView.this, Detail.class);
					intent.putExtra("url", "file:///android_asset/html/tiaolibaojian/tlbj2.html");
		            startActivity(intent);
					break;
				case 2:
					intent=new Intent(TlbjView.this, Detail.class);
					intent.putExtra("url", "file:///android_asset/html/tiaolibaojian/tlbj3.html");
		            startActivity(intent);
					break;
				case 3:
					intent=new Intent(TlbjView.this, Detail.class);
					intent.putExtra("url", "file:///android_asset/html/tiaolibaojian/tlbj4.html");
		            startActivity(intent);
					break;
				case 4:
					intent=new Intent(TlbjView.this, Detail.class);
					intent.putExtra("url", "file:///android_asset/html/tiaolibaojian/tlbj5.html");
		            startActivity(intent);
					break;
				case 5:
					intent=new Intent(TlbjView.this, Detail.class);
					intent.putExtra("url", "file:///android_asset/html/tiaolibaojian/tlbj6.html");
		            startActivity(intent);
					break;
				case 6:
					intent=new Intent(TlbjView.this, Detail.class);
					intent.putExtra("url", "file:///android_asset/html/tiaolibaojian/tlbj7.html");
		            startActivity(intent);
					break;
				case 7:
					intent=new Intent(TlbjView.this, Detail.class);
					intent.putExtra("url", "file:///android_asset/html/tiaolibaojian/tlbj8.html");
		            startActivity(intent);
					break;
				case 8:
					intent=new Intent(TlbjView.this, Detail.class);
					intent.putExtra("url", "file:///android_asset/html/tiaolibaojian/tlbj9.html");
		            startActivity(intent);
					break;
				case 9:
					intent=new Intent(TlbjView.this, Detail.class);
					intent.putExtra("url", "file:///android_asset/html/tiaolibaojian/tlbj10.html");
		            startActivity(intent);
					break;
				case 10:
					intent=new Intent(TlbjView.this, Detail.class);
					intent.putExtra("url", "file:///android_asset/html/tiaolibaojian/tlbj11.html");
		            startActivity(intent);
					break;
				case 11:
					intent=new Intent(TlbjView.this, Detail.class);
					intent.putExtra("url", "file:///android_asset/html/tiaolibaojian/tlbj12.html");
		            startActivity(intent);
					break;
				case 12:
					intent=new Intent(TlbjView.this, Detail.class);
					intent.putExtra("url", "file:///android_asset/html/tiaolibaojian/tlbj13.html");
		            startActivity(intent);
					break;
				case 13:
					intent=new Intent(TlbjView.this, Detail.class);
					intent.putExtra("url", "file:///android_asset/html/tiaolibaojian/tlbj14.html");
		            startActivity(intent);
					break;
				case 14:
					intent=new Intent(TlbjView.this, Detail.class);
					intent.putExtra("url", "file:///android_asset/html/tiaolibaojian/tlbj15.html");
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
		map.put("image", R.drawable.tli1);
		map.put("title", "警惕 超重孕妈可能面临的危险");
		list.add(map);

		map = new HashMap<String, Object>();
		map.put("image", R.drawable.tli2);
		map.put("title", "孕妈体重要合理 五谣言不可信");
		list.add(map);

		map = new HashMap<String, Object>();
		map.put("image", R.drawable.tli3);
		map.put("title", "揭秘：孕吐越厉害 宝宝越聪明？");
		list.add(map);
		map = new HashMap<String, Object>();
		map.put("image", R.drawable.tli4);
		map.put("title", "怀孕期间 四种妊娠不适要警惕");
		list.add(map);
		map = new HashMap<String, Object>();
		map.put("image", R.drawable.tli5);
		map.put("title", "孕期乳房升级 选对胸罩防下垂");
		list.add(map);
		map = new HashMap<String, Object>();
		map.put("image", R.drawable.tli6);
		map.put("title", "孕早期身体变化 从胸部痒开始");
		list.add(map);
		map = new HashMap<String, Object>();
		map.put("image", R.drawable.tli7);
		map.put("title", "孕期教你四招 赶走烦人抑郁症");
		list.add(map);
		map = new HashMap<String, Object>();
		map.put("image", R.drawable.tli8);
		map.put("title", "孕妇感冒与用药禁忌");
		list.add(map);
		map = new HashMap<String, Object>();
		map.put("image", R.drawable.tli9);
		map.put("title", "4种情况孕妈乱用药 宝宝很受伤");
		list.add(map);
		map = new HashMap<String, Object>();
		map.put("image", R.drawable.tli10);
		map.put("title", "孕期身体大变化 重点呵护4部位");
		list.add(map);
		map = new HashMap<String, Object>();
		map.put("image", R.drawable.tli11);
		map.put("title", "职场妈妈手册解答上班4大问题");
		list.add(map);
		map = new HashMap<String, Object>();
		map.put("image", R.drawable.tli12);
		map.put("title", "留心四种行为 一不小心易伤胎");
		list.add(map);
		map = new HashMap<String, Object>();
		map.put("image", R.drawable.tli13);
		map.put("title", "四大恶行伤子宫 孕妈积极护宫");
		list.add(map);
		map = new HashMap<String, Object>();
		map.put("image", R.drawable.tli14);
		map.put("title", "早产更聪明？科学解读胎儿发育");
		list.add(map);
		map = new HashMap<String, Object>();
		map.put("image", R.drawable.tli15);
		map.put("title", "孕妈常熬夜 生出的baby长得慢");
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
			Toast.makeText(TlbjView.this, "已成功删除第" + (position + 1) + "项",
					0).show();
			break;
		case 2:			
			Toast.makeText(TlbjView.this, "暂时无法分享！！！", 0).show();
			break;

		default:
			break;
		}
		return true;
	}
	

}