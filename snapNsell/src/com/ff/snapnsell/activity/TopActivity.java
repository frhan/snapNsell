package com.ff.snapnsell.activity;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;

public abstract class TopActivity extends Activity{

	protected ActionBar actionBar;
	protected Activity activity;
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{	
		super.onCreate(savedInstanceState);
		
		actionBar = getActionBar();
		activity = TopActivity.this;
	}
}
