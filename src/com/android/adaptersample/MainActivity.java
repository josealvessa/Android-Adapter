package com.android.adaptersample;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ListView;

import com.android.adapter.Adapter;
import com.android.models.Mail;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		ListView mailsListView = (ListView) findViewById(R.id.mailsListView);

		mailsListView.setAdapter(getAdapter());

	}

	public Adapter getAdapter(){
		
		List<Mail> mails = new ArrayList<Mail>();
		
		for(int i = 0; i < 200; i++){
		mails.add(new Mail("Message " + i,"Subject " + i,
				"Friend " + i,"18:20"));
		}
		
		return  new Adapter(this,mails);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
