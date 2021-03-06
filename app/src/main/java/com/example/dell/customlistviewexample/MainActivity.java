package com.example.dell.customlistviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private int [] picture = {R.drawable.person_one, R.drawable.person_2, R.drawable.person_3, R.drawable.person_4, R.drawable.person_5};

    private String[] name = {"Salman Khan", "Seikh Hasina", "Khaleda Zia", "Sakib Khan", "Opu Biswas"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        listView = findViewById(R.id.lvId);

        final CustomAdapter adapter = new CustomAdapter(this, name, picture);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String title = name[position];
                Toast.makeText(MainActivity.this, "" + title, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
