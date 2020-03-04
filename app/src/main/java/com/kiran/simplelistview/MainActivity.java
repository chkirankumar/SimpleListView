package com.kiran.simplelistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.lv);
        String fruitsNames[] = {"Apple", "Apricot", "Avocado", "Banana", "Black Berry",
                                "Black Currant", "Blue Berry", "Boysen Berry", "Cherry", "Fig",
                                "Grapes", "Kiwi", "Mango", "Orange", "Papaya", "Pine Apple"};
        ArrayAdapter<String> fruits = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,fruitsNames);
        listView.setAdapter(fruits);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String clickedItem = (String) listView.getItemAtPosition(position);
                Toast.makeText(MainActivity.this,clickedItem,Toast.LENGTH_SHORT).show();
            }
        });
    }
}
