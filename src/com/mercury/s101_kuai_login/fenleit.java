package com.mercury.s101_kuai_login;
import com.mercury.s101_kuai.R;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v4.widget.SimpleCursorAdapter.ViewBinder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class fenleit extends Fragment implements View.OnClickListener{
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View v = inflater.inflate(R.layout.fenlei, container, false);
		Button appliance = (Button) v.findViewById(R.id.fenleiappliance);
		Button book = (Button) v.findViewById(R.id.fenleibook);
		Button cloth = (Button) v.findViewById(R.id.fenleicloth);
		Button compute = (Button) v.findViewById(R.id.fenleicompute);
		Button digitcamer = (Button) v.findViewById(R.id.fenleidigtcamer);
		Button furniture = (Button) v.findViewById(R.id.fenleifurnitrue);
		Button mobile = (Button) v.findViewById(R.id.fenleimobile);
		Button skincare = (Button) v.findViewById( R.id.fenleiskincare);
		return v;
	}

	@Override
	public void onClick(View v) {
		
		
	}
}
