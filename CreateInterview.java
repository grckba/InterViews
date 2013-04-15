package com.example.interviews;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.*;

import com.example.interviews.*;

public class CreateInterview extends Activity{
  
	private ImageButton home1;
	
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.create_interview);
		
		home1 = (ImageButton) findViewById(R.id.imageButton1);
		
		//Escuchador home1
		home1.setOnClickListener(new OnClickListener()
		{
			public void onClick(View view){
				lanzarMainActivity();
			}
		});
	}
	
	public void lanzarMainActivity() {
	    Intent i = new Intent(this, MainActivity.class);
	    startActivity(i);
	}
	
}
