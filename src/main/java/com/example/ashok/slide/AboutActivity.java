package com.example.ashok.slide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AboutActivity extends AppCompatActivity
{
    EditText mobileno,message;
    Button sendsms;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        mobileno=(EditText)findViewById(R.id.editText);
        message=(EditText)findViewById(R.id.editText1);
        sendsms=(Button)findViewById(R.id.button);

        //Performing action on button click
        sendsms.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View arg0)
            {
                String no=mobileno.getText().toString();
                String msg=message.getText().toString();

                android.telephony.SmsManager sm=android.telephony.SmsManager.getDefault();

                sm.sendTextMessage(no,null,msg,null, null);
                mobileno.setText("");
                message.setText("");

                Toast.makeText(getApplicationContext(), "Message Sent successfully!",
                        Toast.LENGTH_LONG).show();

            }

        });
    }
}
