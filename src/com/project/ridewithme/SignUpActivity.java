package com.project.ridewithme;

//import com.deitel.favoritetwittersearches.R;


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

public class SignUpActivity extends Activity {
	
	private EditText enterUsernames;
	private EditText enterPassword;
	private Button signupButton1;
	@Override
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sign_up);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	public void returnAction(View v)
	 {
	   Intent intent = new Intent(this, MainActivity.class);
	   startActivity(intent);
	 }
	

}
