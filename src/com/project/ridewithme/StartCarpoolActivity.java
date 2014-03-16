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
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.ArrayAdapter;

public class StartCarpoolActivity extends Activity implements OnItemSelectedListener{
	private EditText upZipEditText;
	private EditText downZipEditText;
	private Spinner spinnerPickup;
	private Spinner spinnerDropoff;
	private Spinner spinnerCapacity;
	private String pickUpZip;
	private String pickUpTime;
	private String dropOffZip;
	private String dropOffTime;
	private String carCapacity;
	private String allText;
	
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_start_carpool);
		
		upZipEditText = (EditText) findViewById(R.id.upZipEditText);
		
		
		downZipEditText = (EditText) findViewById(R.id.downZipEditText);
		dropOffZip = upZipEditText.getText().toString();
	
		spinnerPickup = (Spinner) findViewById(R.id.pickupTimeSpinner);
		// Create an ArrayAdapter using the string array and a default spinner layout
		ArrayAdapter<CharSequence> adapterPickup = ArrayAdapter.createFromResource(this,
		        R.array.time_array, android.R.layout.simple_spinner_item);
		// Specify the layout to use when the list of choices appears
		adapterPickup.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		// Apply the adapter to the spinner
		spinnerPickup.setAdapter(adapterPickup);
		spinnerPickup.setOnItemSelectedListener(this);
		
		spinnerDropoff = (Spinner) findViewById(R.id.dropoffTimeSpinner);
		// Create an ArrayAdapter using the string array and a default spinner layout
		ArrayAdapter<CharSequence> adapterDropoff = ArrayAdapter.createFromResource(this,
		        R.array.time_array, android.R.layout.simple_spinner_item);
		// Specify the layout to use when the list of choices appears
		adapterDropoff.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		// Apply the adapter to the spinner
		spinnerDropoff.setAdapter(adapterDropoff);
		spinnerDropoff.setOnItemSelectedListener(this);
		
		spinnerCapacity = (Spinner) findViewById(R.id.carCapacitySpinner);
		// Create an ArrayAdapter using the string array and a default spinner layout
		ArrayAdapter<CharSequence> adapterCapacity = ArrayAdapter.createFromResource(this,
		        R.array.car_capacity_array, android.R.layout.simple_spinner_item);
		// Specify the layout to use when the list of choices appears
		adapterCapacity.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		// Apply the adapter to the spinner
		spinnerCapacity.setAdapter(adapterCapacity);
		spinnerCapacity.setOnItemSelectedListener(this);
	}
	
	
	public void createAction(View v)
	{
		pickUpZip = upZipEditText.getText().toString();
		dropOffZip = downZipEditText.getText().toString();
		allText = "Pick Up Zip Code: " + pickUpZip + "\nPick Up Time: " + pickUpTime + "\nDrop Off Zip Code: " + dropOffZip + "\nDrop Off Time: " + dropOffTime +"\nCar Capacity: " + carCapacity;
		Intent intent = new Intent(this, MyCarpoolActivity.class);
		Bundle b = new Bundle();
		b.putString("allText", allText);
		intent.putExtras(b);
		startActivity(intent);
	}


	@Override
	public void onItemSelected(AdapterView<?> parent, View view, int position,
			long id) {
		int id2 = parent.getId();
        switch (id2) 
        {
        	case R.id.pickupTimeSpinner:
        		pickUpTime = spinnerPickup.getSelectedItem().toString();
                break;
            case R.id.dropoffTimeSpinner:
            	dropOffTime = spinnerDropoff.getSelectedItem().toString();
            	break;
            case R.id.carCapacitySpinner:
            	carCapacity = spinnerCapacity.getSelectedItem().toString();
            	break;
        }
	}


	@Override
	public void onNothingSelected(AdapterView<?> parent) {
		// TODO Auto-generated method stub
		
	}
	
}


