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

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    ListView listView;
    private Adaptador adaptador;
    private ArrayList<InformacaoListView1> arrayEntidad = new ArrayList<>();

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

                listView = (ListView) findViewById(R.id.listview);

                Conteudos();
                break;


            }
                return true;

    }

    private void Conteudos(){
        arrayEntidad.add(new InformacaoListView1(R.drawable.ingredientesbolo,
                "1. Passo --> Preparação de ingredientes:",
                "1) 2 colheres de açúcar;\n" +
                        "2) 3 colheres de farinha de trigo;\n" +
                        "3) 4 colheres de margarina;\n" +
                        "4) 3 ovos;\n" +
                        "5) 3 colheres de leite;\n" +
                        "6) 1 colher bem cheia de fermento em pó."));
        arrayEntidad.add(new InformacaoListView1(R.drawable.misturaingredientesbolo,
                "2. Passo --> Mistura de ingredientes:",
                "1) Bata as claras em neve e reserve;\n" +
                        "\n" +
                        "2) Misture as gemas, a margarina e o açúcar até obter uma massa homogênea;\n" +
                        "\n" +
                        "3) Acrescente o leite e a farinha de trigo aos poucos, sem parar de bater;\n" +
                        "\n" +
                        "4) Adicione as claras em neve e o fermento."));
        arrayEntidad.add(new InformacaoListView1(R.drawable.colocarbolonaforma,
                "3. Passo --> Colocar o bolo na forma:",
                "Despeje a massa em uma forma."));
        arrayEntidad.add(new InformacaoListView1(R.drawable.bolocolocadoforno,
                "4. Passo --> Coloque o bolo no forno:",
                "Asse em forno médio 180 °C, preaquecido, por aproximadamente 40 " +
                        "minutos ou ao furar o bolo com um garfo, este saia limpo."));
        arrayEntidad.add(new InformacaoListView1(R.drawable.boloobtido,
                "5. Passo --> Finalizar o bolo", "1) Retire o bolo do forno;\n" +
                "\n" +
                "2) Coloque o bolo num prato;\n" +
                "\n" +
                "3) Corte o bolo e prove-o"));

        adaptador = new Adaptador(this, arrayEntidad);
        listView.setAdapter(adaptador);
    }
}