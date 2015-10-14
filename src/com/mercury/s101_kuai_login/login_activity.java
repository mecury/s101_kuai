package com.mercury.s101_kuai_login;



import com.mercury.s101_kuai.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class login_activity extends Activity implements OnClickListener,TextWatcher,OnFocusChangeListener{
	
	private static EditText login_edit_account,login_edit_key; 
	private Button login_btn;
	private TextView login_regist,login_forget;
	private ImageView login_edit_account_clear,login_edit_key_clear,login_user,login_key;

	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		
		login_edit_account=(EditText)findViewById(R.id.login_edit_account);
		login_edit_key=(EditText)findViewById(R.id.login_edit_key);
		login_btn=(Button)findViewById(R.id.login_btn);
		login_regist=(TextView)findViewById(R.id.login_regist);
		login_forget=(TextView)findViewById(R.id.login_forget);
		login_edit_account_clear=(ImageView)findViewById(R.id.login_edit_account_clear);
		login_edit_key_clear=(ImageView)findViewById(R.id.login_edit_key_clear);
		login_user=(ImageView)findViewById(R.id.login_user);
		login_user=(ImageView)findViewById(R.id.login_key);
		
		login_edit_account.setOnFocusChangeListener(this);
		login_edit_key.setOnFocusChangeListener(this);
		login_btn.setOnClickListener(this);
		login_regist.setOnClickListener(this);
		login_forget.setOnClickListener(this);
		login_edit_account_clear.setOnClickListener(this);
		login_edit_key_clear.setOnClickListener(this);
		login_regist.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		//µ«¬Ω∞¥≈•
		case R.id.login_btn:
			Intent intent = new Intent();
			intent.setClass(login_activity.this, allHome.class);
			startActivity(intent);
			break;
		//Õ¸º«√‹¬Î
		case R.id.login_forget:
			Toast.makeText(this, "Œ¥∂®", Toast.LENGTH_SHORT).show();
			break;
		//◊¢≤·’À∫≈
		case R.id.login_regist:
			Toast.makeText(this, "Œ¥∂®", Toast.LENGTH_SHORT).show();
			break;
		//«Â≥˝’À∫≈ ‰»Î¿∏
		case R.id.login_edit_account_clear:
			login_edit_account.setText("");
			break;
		//«Â≥˝√‹¬Î ‰»Î¿∏
		case R.id.login_edit_key_clear:
			login_edit_key.setText("");
			break;

		default:
			break;
		}
		
	}

	@Override
	public void beforeTextChanged(CharSequence s, int start, int count,
			int after) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTextChanged(CharSequence s, int start, int before, int count) {
		if (s!=null) {
			if (s.equals(login_edit_account.getText())) {
				login_user.setBackgroundResource(R.drawable.login_user_hightlighted);
			}
			if(s.equals(login_edit_key.getContext())){
				login_edit_key.setBackgroundResource(R.drawable.login_key_hightlighted);
			}
		}
		if (s.length()==0) {
			if (login_edit_account.getText().length()==0) {
				login_user.setBackgroundResource(R.drawable.login_user);
			}
			if (login_edit_key.getText().length()==0) {
				login_key.setBackgroundResource(R.drawable.login_key);
			}
		}
	}

	@Override
	public void afterTextChanged(Editable s) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFocusChange(View v, boolean hasFocus) {
		switch (v.getId()) {
		case R.id.login_edit_account:
			if (hasFocus) {
				login_edit_account_clear.setVisibility(View.VISIBLE);
			}else {
				login_edit_account_clear.setVisibility(View.GONE);
			}
		case R.id.login_edit_key:
			if (hasFocus) {
				login_edit_key_clear.setVisibility(View.VISIBLE);
			}else {
				login_edit_key_clear.setVisibility(View.GONE);
			}
			break;

		default:
			break;
		}
		
	}
	
}