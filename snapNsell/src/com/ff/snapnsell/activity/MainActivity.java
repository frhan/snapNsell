package com.ff.snapnsell.activity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.ff.snapnsell.R;

public class MainActivity extends TopActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.log_in);
		actionBar.setTitle(getResources().getString(R.string.login));
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.log_in, menu);
		return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) 
	{
		switch (item.getItemId()) {
		case R.id.action_register:
			
			return true;			

		default:
			return super.onOptionsItemSelected(item);
			
		}
		
	}

}
