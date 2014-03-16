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
import android.widget.Spinner;
import android.widget.ArrayAdapter;

public class StartCarpoolActivity extends Activity{
	private EditText pickupTextBox;
	private EditText dropoffTextBox;
	private Spinner pickupTimeSpinner;
	private Spinner dropoffTimeSpinner;
	private Spinner carCapacitySpinner;
	private Button createCarpoolButton;
	
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_start_carpool);
		
	
		Spinner spinnerPickup = (Spinner) findViewById(R.id.pickupTimeSpinner);
		// Create an ArrayAdapter using the string array and a default spinner layout
		ArrayAdapter<CharSequence> adapterPickup = ArrayAdapter.createFromResource(this,
		        R.array.time_array, android.R.layout.simple_spinner_item);
		// Specify the layout to use when the list of choices appears
		adapterPickup.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		// Apply the adapter to the spinner
		spinnerPickup.setAdapter(adapterPickup);
		
		Spinner spinnerDropoff = (Spinner) findViewById(R.id.dropoffTimeSpinner);
		// Create an ArrayAdapter using the string array and a default spinner layout
		ArrayAdapter<CharSequence> adapterDropoff = ArrayAdapter.createFromResource(this,
		        R.array.time_array, android.R.layout.simple_spinner_item);
		// Specify the layout to use when the list of choices appears
		adapterDropoff.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		// Apply the adapter to the spinner
		spinnerDropoff.setAdapter(adapterDropoff);
		
		Spinner spinnerCapacity = (Spinner) findViewById(R.id.carCapacitySpinner);
		// Create an ArrayAdapter using the string array and a default spinner layout
		ArrayAdapter<CharSequence> adapterCapacity = ArrayAdapter.createFromResource(this,
		        R.array.car_capacity_array, android.R.layout.simple_spinner_item);
		// Specify the layout to use when the list of choices appears
		adapterCapacity.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		// Apply the adapter to the spinner
		spinnerCapacity.setAdapter(adapterCapacity);
		
		
		
	}
	
	
	public void createAction(View v)
	{
	   Intent intent = new Intent(this, MyCarpoolActivity.class);
	//   Bundle b = new Bundle();
	//   b = toBundle(spinnerCapacity.getSelectedItem().toString());
	 //  intent.putExtra(name, value)
	   startActivity(intent);
	}
	
}


