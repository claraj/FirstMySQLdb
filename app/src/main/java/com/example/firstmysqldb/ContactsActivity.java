package com.example.firstmysqldb;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ContactsActivity extends Activity {

	//Simple app which uses a SQLite Database
	//"Contact info" database
	//User types in a phone number (int) and a name (string) and presses a button to save
	//App records these in a database
	//App has a search button to look for a specific contact
	//And another button which fetches and shows all contacts

	EditText nameET;
	EditText phoneET;
	EditText searchNameET;

	TextView displayAllContactsTV;
	TextView displaySearchContactTV;

	Button addContactButton;
	Button showAllContactsButton;
	Button searchContactsButton;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_contacts);

		//TODO create database

		nameET = (EditText)findViewById(R.id.name_et);
		phoneET = (EditText)findViewById(R.id.phone_et);
		searchNameET = (EditText)findViewById(R.id.search_et);

		addContactButton = (Button)findViewById(R.id.add_contact_button);
		showAllContactsButton = (Button)findViewById(R.id.show_all_contacts_button);
		searchContactsButton = (Button)findViewById(R.id.search_contacts_button);

		displayAllContactsTV = (TextView)findViewById(R.id.all_contacts_tv);
		displaySearchContactTV = (TextView)findViewById(R.id.search_contact_tv);

		addContactButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Add this new contact to the database
				String newName = nameET.getText().toString();
				String newPhone = phoneET.getText().toString();
			}

		});

		showAllContactsButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				//TODO Fetch everything, and display in showAllContactsTV
			}

		});


		searchContactsButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				String searchName = searchNameET.getText().toString();
				if ( searchName.equals("")) {
					return;
				}
				//TODO Otherwise, find name from DB and display name and phone number in displaySearchContactTV
			}

		});
	}



	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu_main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();

		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}

