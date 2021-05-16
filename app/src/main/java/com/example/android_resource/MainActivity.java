package com.example.android_resource;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menudeopciones,menu);

        return true  ;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){

            case R.id.mQRCODE:
                Intent anterior = new Intent(this, Q_R_CODE.class);
                startActivity(anterior);
                return true;

            case R.id.mVOZ:
                Intent anterior11 = new Intent(this,AtivaRechonecimentoVoz.class);
                startActivity(anterior11);
                break;
            case R.id.mTarefas:

                setContentView(R.layout.activity_listview);

                listView = findViewById(R.id.listview);

                String[] values = new String[] {
                        "1. Passo", "2. Passo", "3. Passo"};

                        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                                android.R.layout.simple_list_item_1,
                                android.R.id.text1, values);

                listView.setAdapter(adapter);


                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        if(position == 0){
                            Intent intent = new Intent(view.getContext(),
                                    Activity_facebook.class);
                            startActivity(intent);
                        }
                        if(position == 1){
                                Intent intent = new Intent(view.getContext(),
                                        Activity_facebook.class);
                                startActivity(intent);
                            }
                        if(position == 2){
                            Intent intent = new Intent(view.getContext(),
                                    Activity_facebook.class);
                            startActivity(intent);
                        }
                    }
                });

            }
                return true;

    }
}