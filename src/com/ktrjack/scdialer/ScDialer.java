package com.ktrjack.scdialer;

import android.app.Activity;
import android.os.Bundle;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;
import android.content.Intent;
import android.net.Uri;

public class ScDialer extends Activity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
	Button bt_techmode=(Button)findViewById(R.id.techmode_button);
	Button bt_serviceinfo=(Button)findViewById(R.id.serviceinfo_button);
	Button bt_testmode=(Button)findViewById(R.id.testmode_button);

	//techmode event
	bt_techmode.setOnClickListener(new OnClickListener(){
         @Override
           public void onClick(View v) {
               Intent intent = new Intent(Intent.ACTION_DIAL,Uri.parse("tel:%2A%23%2A%23386%23%2A%23%2A"));
             startActivity(intent);
          }
        });
	//serviceinfo event
	bt_serviceinfo.setOnClickListener(new OnClickListener(){
         @Override
           public void onClick(View v) {
               Intent intent = new Intent(Intent.ACTION_DIAL,Uri.parse("tel:%2A%23%2A%237378423%23%2A%23%2A"));
             startActivity(intent);
          }
        });
	//testmode event
	bt_testmode.setOnClickListener(new OnClickListener(){
         @Override
           public void onClick(View v) {
               Intent intent = new Intent(Intent.ACTION_DIAL,Uri.parse("tel:%2A%23%2A%234636%23%2A%23%2A"));
             startActivity(intent);
          }
        });

    }
}
