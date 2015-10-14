package com.mercury.s101_kuai_login;


import com.mercury.s101_kuai.R;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class allHome extends Activity implements android.view.View.OnClickListener{

	private LinearLayout shouye;
	private LinearLayout fenlei;
	private LinearLayout shaomiao;
	private LinearLayout gowuche;
	private LinearLayout wode; 
	
	private Fragment shouyet;
	private Fragment fenleit;
	private Fragment shaomiaot;
	private Fragment gouwuchet;
	private Fragment wodet;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		System.out.println("测试1");
		setContentView(R.layout.top);
		
		System.out.println("测试2");
		initLinear();
		System.out.println("测试3");
		initonClick();
		System.out.println("测试4");
		selected(0);
		System.out.println("测试5");
	}
	private void initLinear(){
		System.out.println("测试6");
		shouye = (LinearLayout) findViewById(R.id.shouye);
		fenlei = (LinearLayout) findViewById(R.id.fenlei);
		shaomiao = (LinearLayout) findViewById(R.id.shaomiao);
		gowuche = (LinearLayout) findViewById(R.id.gouwuche);
		wode = (LinearLayout) findViewById(R.id.wode);
	}
	private void initonClick(){
		System.out.println("测试7");
		shouye.setOnClickListener(this);
		fenlei.setOnClickListener(this);
		shaomiao.setOnClickListener(this);
		gowuche.setOnClickListener(this);
		wode.setOnClickListener(this);
	}
	
	//实现点击时间的响应
	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.shouye:
			System.out.println("测试11");
			selected(0);
			break;
		case R.id.fenlei:
			System.out.println("测试12");
			selected(1);
			break;
		case R.id.shaomiao:
			System.out.println("测试13");
			selected(2);
			break;
		case R.id.gouwuche:
			System.out.println("测试14");
			selected(3);
			break;
		case R.id.wode:
			System.out.println("测试15");
			selected(4);
			break;

		default:
			break;
		}
	}
	
	private void selected(int i){
		FragmentManager fragment = getFragmentManager();      //获取Fragment事物管理器
		FragmentTransaction ft = fragment.beginTransaction(); //开启一个事物
		
		hideFragment(ft);
		switch (i) {
		case 0:
			//shouye.setBackgroundResource(R.drawable.login_key_hightlighted);
			System.out.println("测试21");
			if (shouyet == null) {
			shouyet = new shouyet();
				ft.replace(R.id.fragment_container, shouyet);
			}else {
				ft.show(shouyet);
			}
			break;
		case 1:
			//fenlei.setBackgroundResource(R.drawable.login_key_hightlighted);
			System.out.println("测试22");
			if (fenleit == null) {
				fenleit = new fenleit();
				ft.add(R.id.fragment_container, fenleit);
			}else {
				ft.show(fenleit);
			}			
			break;
		case 2:
			//shaomiao.setBackgroundResource(R.drawable.login_key_hightlighted);
			if (shaomiaot == null) {
				shaomiaot = new shaomiaot();
				ft.add(R.id.fragment_container, shaomiaot);
			}else {
				ft.show(shaomiaot);
			}			
			break;
		case 3:
			//gowuche.setBackgroundResource(R.drawable.login_key_hightlighted);
			if (gouwuchet == null) {
				gouwuchet = new gouwuchet();
				ft.add(R.id.fragment_container, gouwuchet);
			}else {
				ft.show(gouwuchet);
			}			
			break;
		case 4:
			//wode.setBackgroundResource(R.drawable.login_key_hightlighted);
			if (wodet == null) {
				wodet = new wodet();
				ft.add(R.id.fragment_container, wodet);
			}else {
				ft.show(wodet);
			}			
			break;
		}
		ft.commit();   //提交事物
	}
	
	//隐藏所有fragment
	private void hideFragment(FragmentTransaction fragmentTransaction){
		if (shouyet != null) {
			fragmentTransaction.hide(shouyet);
		}
		if (fenleit != null) {
			fragmentTransaction.hide(fenleit);
		}
		if (shaomiaot != null) {
			fragmentTransaction.hide(shaomiaot);
		}
		if (gouwuchet != null) {
			fragmentTransaction.hide(gouwuchet);
		}
		if (wodet != null) {
			fragmentTransaction.hide(wodet);
		}
	}
}
