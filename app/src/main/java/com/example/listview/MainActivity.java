package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    int[] limages = {R.drawable.baseline_airplane_ticket_24,R.drawable.baseline_airplay_24,
            R.drawable.baseline_apartment_24,R.drawable.baseline_attach_money_24,
            R.drawable.baseline_bubble_chart_24,R.drawable.baseline_color_lens_24,
            R.drawable.baseline_currency_bitcoin_24,R.drawable.baseline_explore_24,
            R.drawable.baseline_fastfood_24,R.drawable.baseline_forest_24 };
    String[] country;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.listView);
        country = getResources().getStringArray(R.array.countryNames);



        listAdapter adapter = new listAdapter(this , country , limages);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                Intent intent = new Intent(getApplicationContext() , mainAct2.class);
                intent.putExtra("name" , country[position]);
                startActivity(intent);

            }
        });



    }
}