package com.example.interviews;

import com.example.interviews.*;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

  private Button createI;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		createI =(Button) findViewById(R.id.CreateInterview);
		
		//Escuchador createI
		createI.setOnClickListener(new OnClickListener()
		{
			public void onClick(View view){
				lanzarCreateInterview();
			}
		});
	}

	public void lanzarCreateInterview() {
	    Intent i = new Intent(this, CreateInterview.class);
	    startActivity(i);
	}
}
