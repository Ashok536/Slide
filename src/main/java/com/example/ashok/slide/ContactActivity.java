package com.example.ashok.slide;

import android.content.ContentResolver;
import android.database.Cursor;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

public class ContactActivity extends AppCompatActivity
{
    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        lv = (ListView) findViewById(R.id.listView);
        ContentResolver cr = getContentResolver();
        Cursor cur = cr.query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI,null, null, null, null);
        String[] fr ={ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME, ContactsContract.CommonDataKinds.Phone.NUMBER,ContactsContract.CommonDataKinds.Phone._ID};
        int [] to={android.R.id.text1,android.R.id.text2};
        SimpleCursorAdapter listadapter=new SimpleCursorAdapter(this,android.R.layout.simple_list_item_1,cur,fr,to);
        lv.setAdapter(listadapter);
        //lv.setOnItemClickListener(this);
    }
    //@Override
    //public void onItemClick(AdapterView<?> parent, View view, int position, long id)
    //{}
}
