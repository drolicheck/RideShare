package com.project.ridewithme;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;

public class MyCarpoolActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_my_carpool);
		
		Intent intent;
		intent = getIntent();
		if(intent.getStringExtra("result") != null)
		{
			TextView text = (TextView) findViewById(R.id.MyCarpool);
			text.setText(intent.getStringExtra("result"));
		}
		else if(intent.getStringExtra("allText") != null)
		{
			TextView text = (TextView) findViewById(R.id.MyCarpool);
			text.setText(intent.getStringExtra("allText"));
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	/** Called when the user clicks the Send button */
	public void MapAction(View v) {
	    Intent intent = new Intent(this, MapActivity.class);
	    startActivity(intent);
	}

	public void startAction(View v)
	 {
	   Intent intent = new Intent(this, StartCarpoolActivity.class);
	   startActivity(intent);
	 }

}

