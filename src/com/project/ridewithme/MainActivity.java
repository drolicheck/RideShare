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

public class MainActivity extends Activity {
	
	private EditText enterEmail;
	private EditText enterPassword;
	private Button loginButton;
	private Button signUp;
	@Override
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	public void signUpAction(View v)
	 {
	   Intent intent = new Intent(this, SignUpActivity.class);
	   startActivity(intent);
	 }
	
	public void loginAction(View v)
	 {
	   Intent intent = new Intent(this, MyCarpoolActivity.class);
	   startActivity(intent);
	 }
	

}
