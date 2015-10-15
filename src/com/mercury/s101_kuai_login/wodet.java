package com.mercury.s101_kuai_login;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.mercury.s101_kuai.R;

public class wodet extends Fragment implements View.OnClickListener{
	private Button wodeselect;
	private Button wodepayfor;
	private Button wodeallgoods;
	private Button wodegoods;
	private Button wodemessage;
	private Button wodeattention;
	private Button wodeabout;
	private Button wodeadvice;
	private Button wodequit;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View v = inflater.inflate(R.layout.wode, container, false);
		wodeselect = (Button) v.findViewById(R.id.wodeSelect);
		wodepayfor = (Button) v.findViewById(R.id.wodepayfor);
		wodeallgoods = (Button) v.findViewById(R.id.wodeallgoods);
		wodemessage = (Button) v.findViewById(R.id.wodemessage);
		wodegoods = (Button) v.findViewById(R.id.wodegoods);
		wodeattention = (Button) v.findViewById(R.id.wodeattention);
		wodeabout = (Button) v.findViewById(R.id.wodeabout);
		wodeadvice = (Button) v.findViewById(R.id.wodeadvice);
		wodequit = (Button) v.findViewById(R.id.wodequit);
		return v;
	}
	
	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.wodeSelect:
			System.out.println();
			Toast.makeText(getActivity(), "shousuo", Toast.LENGTH_SHORT).show();
			break;
		case R.id.wodepayfor:
			
			break;
		case R.id.wodeallgoods:
			
			break;
		case R.id.wodegoods:
			
			break;
		case R.id.wodemessage:
			
			break;
		case R.id.wodeattention:
			
			break;
		case R.id.wodeabout:
			
			break;
		case R.id.wodeadvice:
			
			break;		
		case R.id.wodequit:
				
			break;
				
			
			

		default:
			break;
		}
		
	}
}
