package com.example.ashok.slide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity
{
    TextView tv,tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        tv=(TextView)findViewById(R.id.txtViw);

        tv.setText("Xiaomi has taken a different approach for the Indian market this year as it launched three smartphones catering to three different price segments, form factor as well as consumer needs. The most popular of the lot has been the Redmi Note 3 and at the time of writing this, it is arguably the best smartphone to buy under Rs 15,000.\n");
        //tv1.setText("At its price, the Xiaomi Redmi 3S Prime is quite a feature packed smartphone. Yes, it looks small and that is exactly why we appreciate Xiaomi’s efforts in stuffing the smartphone to its limits. There is a 5-inch HD IPS LCD display which looks neat and inside, there is a new Qualcomm Snapdragon 430 octa-core processor which is clocked at 1.4GHz. You also get 3GB RAM and 32GB of internal storage. The storage can be expanded further using a microSD card of up to 256GB in size. The camera department comprises a 13MP f/2.0 aperture camera with PDAF and an LED flash and at the front there is a 5MP unit with an f/2.0 aperture.");

    }
}
