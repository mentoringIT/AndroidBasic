package com.exploreca.tourfinder;

import android.app.ListActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;

public class MainActivity extends ListActivity {
	
	public static final String LOGTAG="EXPLORECA";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
        Log.i(LOGTAG,"onCreated executed.!!");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}
}