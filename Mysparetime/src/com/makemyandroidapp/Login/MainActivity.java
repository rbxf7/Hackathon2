package com.example.mysparetime;

import android.R.string;
import android.support.v7.app.ActionBarActivity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends ActionBarActivity implements OnClickListener{
    EditText Name;
    EditText Password;
    Button Login;
    Button Cancel;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Name =(EditText ) findViewById(R.id.textView1);
        Password =(EditText) findViewById(R.id.textView2);
        Login=(Button)findViewById(R.id.button1);
        Cancel=(Button)findViewById(R.id.button2);
        Login.setOnClickListener((android.view.View.OnClickListener) this);
        Cancel.setOnClickListener((android.view.View.OnClickListener) this);
        
        
    } 

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
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


	@Override
	public void onClick(DialogInterface arg0, int arg1) {
		
		
		   String Na=Name.getText().toString();
		   String Pa=Password.getText().toString();
		// TODO Auto-generated method stub
		   
		
	}

}

