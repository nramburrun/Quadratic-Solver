package com.example.quadraticsolver;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
  
	Button evaluate;
	TextView answer1,answer2;
	EditText firstCoefficient,secondCoefficient,constantValue;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		evaluate =(Button) findViewById(R.id.evaluate);
		answer1 = (TextView) findViewById(R.id.answer1);
		answer2 = (TextView) findViewById(R.id.answer2);
		firstCoefficient = (EditText) findViewById(R.id.firstCoefficient);
		secondCoefficient = (EditText) findViewById(R.id.secondCoefficient);
		constantValue = (EditText) findViewById(R.id.constantValue);
		
		evaluate.setOnClickListener(new quadSolver());
	}
	
	public class quadSolver implements Button.OnClickListener{

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			
			double gamma1=0, gamma2=0;
			double alpha =0, beta=0;
			
			double a = Double.parseDouble(firstCoefficient.getText().toString());
			double b = Double.parseDouble(secondCoefficient.getText().toString());
			double c = Double.parseDouble(constantValue.getText().toString());
			
			beta = ((b*b) - (4*a*c));
			alpha = Math.sqrt(beta);
			
			gamma1 = (-b + alpha)/(2*a);
			gamma2 = (-b - alpha)/(2*a);
			
			answer1.setText(Double.toString(gamma1));
			answer2.setText(Double.toString(gamma2));
		}
		
	}

}
