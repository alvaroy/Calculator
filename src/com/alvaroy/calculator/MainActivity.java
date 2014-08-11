package com.alvaroy.calculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

	EditText text;
	Button num0;
	Button num1;
	Button num2;
	Button num3;
	Button num4;
	Button num5;
	Button num6;
	Button num7;
	Button num8;
	Button num9;
	Button ac;
	Button mult;
	Button div;
	Button sub;
	Button add;
	Button sign;
	Button dot;
	Button equal;
	Double first;
	String op;
	Double second;
	Boolean proc;
	Boolean append;
	Boolean secv;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        text = (EditText) findViewById(R.id.result);
        num0 = (Button) findViewById(R.id.Num0);
        num1 = (Button) findViewById(R.id.Num1);
        num2 = (Button) findViewById(R.id.Num2);
        num3 = (Button) findViewById(R.id.Num3);
        num4 = (Button) findViewById(R.id.Num4);
        num5 = (Button) findViewById(R.id.Num5);
        num6 = (Button) findViewById(R.id.Num6);
        num7 = (Button) findViewById(R.id.Num7);
        num8 = (Button) findViewById(R.id.Num8);
        num9 = (Button) findViewById(R.id.Num9);
        ac = (Button) findViewById(R.id.AC);
        mult = (Button) findViewById(R.id.Mult);
        div = (Button) findViewById(R.id.Div);
        sub = (Button) findViewById(R.id.Sub);
        add = (Button) findViewById(R.id.Add);
        dot = (Button) findViewById(R.id.Dot);
        sign = (Button) findViewById(R.id.Sign);
        equal = (Button) findViewById(R.id.Eql);
        first = Double.valueOf(0);
        second = Double.valueOf(0);
        proc = false;
        append = false;
        secv = true;
        
        num0.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(proc == false)
				{
					if(text.getText().toString().equals("0") || text.getText().toString().equals("Error"))
					{
						text.setText("0");
					}
					else if(text.getText().toString().equals("-0"))
					{
						//Do Nothing
					}
					else
					{
						text.append("0");
					}	
				}
				else
				{
					if(append == false)
					{
						text.setText("0");
						append = true;
					}
					else
					{
						text.append("0");
					}
				}				
			}
		});
        
        num1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(proc == false)
				{
					if(text.getText().toString().equals("0") || text.getText().toString().equals("Error"))
					{
						text.setText("1");
					}
					else if(text.getText().toString().equals("-0"))
					{
						text.setText("-1");
					}
					else
					{
						text.append("1");
					}	
				}
				else
				{
					if(append == false)
					{
						text.setText("1");
						append = true;
					}
					else
					{
						text.append("1");
					}
				}	
			}
		});
        
        num2.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(proc == false)
				{
					if(text.getText().toString().equals("0") || text.getText().toString().equals("Error"))
					{
						text.setText("2");
					}
					else if(text.getText().toString().equals("-0"))
					{
						text.setText("-2");
					}
					else
					{
						text.append("2");
					}	
				}
				else
				{
					if(append == false)
					{
						text.setText("2");
						append = true;
					}
					else
					{
						text.append("2");
					}
				}
			}
		});
        
        num3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(proc == false)
				{
					if(text.getText().toString().equals("0") || text.getText().toString().equals("Error"))
					{
						text.setText("3");
					}
					else if(text.getText().toString().equals("-0"))
					{
						text.setText("-3");
					}
					else
					{
						text.append("3");
					}	
				}
				else
				{
					if(append == false)
					{
						text.setText("3");
						append = true;
					}
					else
					{
						text.append("3");
					}
				}
			}
		});
        
        num4.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(proc == false)
				{
					if(text.getText().toString().equals("0") || text.getText().toString().equals("Error"))
					{
						text.setText("4");
					}
					else if(text.getText().toString().equals("-0"))
					{
						text.setText("-4");
					}
					else
					{
						text.append("4");
					}	
				}
				else
				{
					if(append == false)
					{
						text.setText("4");
						append = true;
					}
					else
					{
						text.append("4");
					}
				}
			}
		});
        
        num5.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(proc == false)
				{
					if(text.getText().toString().equals("0") || text.getText().toString().equals("Error"))
					{
						text.setText("5");
					}
					else if(text.getText().toString().equals("-0"))
					{
						text.setText("-5");
					}
					else
					{
						text.append("5");
					}	
				}
				else
				{
					if(append == false)
					{
						text.setText("5");
						append = true;
					}
					else
					{
						text.append("5");
					}
				}
			}
		});
        
        num6.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(proc == false)
				{
					if(text.getText().toString().equals("0") || text.getText().toString().equals("Error"))
					{
						text.setText("6");
					}
					else if(text.getText().toString().equals("-0"))
					{
						text.setText("-6");
					}
					else
					{
						text.append("6");
					}	
				}
				else
				{
					if(append == false)
					{
						text.setText("6");
						append = true;
					}
					else
					{
						text.append("6");
					}
				}
			}
		});
        
        num7.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(proc == false)
				{
					if(text.getText().toString().equals("0") || text.getText().toString().equals("Error"))
					{
						text.setText("7");
					}
					else if(text.getText().toString().equals("-0"))
					{
						text.setText("-7");
					}
					else
					{
						text.append("7");
					}	
				}
				else
				{
					if(append == false)
					{
						text.setText("7");
						append = true;
					}
					else
					{
						text.append("7");
					}
				}
			}
		});
        
        num8.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(proc == false)
				{
					if(text.getText().toString().equals("0") || text.getText().toString().equals("Error"))
					{
						text.setText("8");
					}
					else if(text.getText().toString().equals("-0"))
					{
						text.setText("-8");
					}
					else
					{
						text.append("8");
					}	
				}
				else
				{
					if(append == false)
					{
						text.setText("8");
						append = true;
					}
					else
					{
						text.append("8");
					}
				}
			}
		});
        
        num9.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(proc == false)
				{
					if(text.getText().toString().equals("0") || text.getText().toString().equals("Error"))
					{
						text.setText("9");
					}
					else if(text.getText().toString().equals("-0"))
					{
						text.setText("-9");
					}
					else
					{
						text.append("9");
					}	
				}
				else
				{
					if(append == false)
					{
						text.setText("9");
						append = true;
					}
					else
					{
						text.append("9");
					}
				}
			}
		});
        
        sign.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(proc == true && append == false)
				{
					text.setText("-0");
				}
				else
				{
					if(text.getText().toString().equals("Error"))
					{
						text.setText(-0);
					}
					else if(text.getText().toString().startsWith("-"))
					{
						text.setText(text.getText().toString().replace("-", ""));
					}
					else
					{
						text.setText("-"+text.getText().toString());
					}
				}
			}
		});
        
        ac.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				text.setText("0");
				first = Double.valueOf(0);
				op = "";
				second = Double.valueOf(0);
				proc = false;
				append = false;
				secv = true;
			}
		});
        
        dot.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(!text.getText().toString().contains("."))
				{
					text.append(".");
				}
			}
		});
        
        add.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				op = "a";
				if(proc==false)
				{
					proc = true;
					first = Double.valueOf(text.getText().toString());
					append = false;
				}
				else
				{
					append = false;
					secv = true;
					second = Double.valueOf(text.getText().toString());
					first = first + second;
					text.setText(String.valueOf(first));
				}
			}
		});
        
        sub.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				op = "s";
				if(proc==false)
				{
					proc = true;
					first = Double.valueOf(text.getText().toString());
					append = false;
				}
				else
				{
					append = false;
					secv = true;
					second = Double.valueOf(text.getText().toString());
					first = first - second;
					text.setText(String.valueOf(first));
				}
			}
		});
        
        mult.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				op = "m";
				if(proc==false)
				{
					proc = true;
					first = Double.valueOf(text.getText().toString());
					append = false;
				}
				else
				{
					append = false;
					secv = true;
					second = Double.valueOf(text.getText().toString());
					first = first * second;
					text.setText(String.valueOf(first));
				}
			}
		});
        
        div.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				op = "d";
				if(proc==false)
				{
					proc = true;
					first = Double.valueOf(text.getText().toString());
					append = false;
				}
				else
				{
					append = false;
					secv = true;
					second = Double.valueOf(text.getText().toString());
					if(second.equals(Double.valueOf(0)))
					{
						text.setText("Error");
						first = Double.valueOf(0);
						second = Double.valueOf(0);
						op = "";
						proc = false;
						append = false;
						secv = true;
					}
					else
					{
						first = first / second;
					}	
					text.setText(String.valueOf(first));
				}
			}
		});
        
        equal.setOnClickListener(new OnClickListener() {
			
        	Double result;        	
        	
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(secv == true)
				{
					second = Double.valueOf(text.getText().toString());
					secv = false;
				}
				if(op.equals("a"))
				{
					//Add
					result = first + second;
				}
				else if(op.equals("s"))
				{
					//Subtract
					result = first - second;
				}
				else if(op.equals("m"))
				{
					//Multiply
					result = first * second;
				}
				else if(op.equals("d"))
				{
					//Divide
					if(second.equals(Double.valueOf(0)))
					{
						text.setText("Error");
						first = Double.valueOf(0);
						second = Double.valueOf(0);
						op = "";
						proc = false;
						append = false;
					}
					else
					{
						result = first / second;
					}					
				}
				else
				{
					//Do Nothing
					if(text.getText().toString().equals("Error"))
					{
						result = Double.valueOf(0);
					}
					else
					{
						result = Double.valueOf(text.getText().toString());
					}					
				}
				text.setText(String.valueOf(result));
				first = result;
				proc = false;
				append = false;
			}
		});
        
        
        
        
    }
}
