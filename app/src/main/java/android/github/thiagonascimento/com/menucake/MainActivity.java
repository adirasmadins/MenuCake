package android.github.thiagonascimento.com.menucake;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Cake> cakes;
    BoloAdaptaer adapter;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = new ListView(MainActivity.this);
        setContentView(listView);

        cakes = new ArrayList<Cake>();
        cakes.add(new Cake("Bolo de Banana","100 Gramas",0));
        cakes.add(new Cake("Bolo de Chocolate","500 Gramas",1));
        cakes.add(new Cake("Bolo de Morango","400 Gramas",2));
        cakes.add(new Cake("Cupcake","300 Gramas",3));
        cakes.add(new Cake("Rocambole","350 Gramas",4));

        adapter = new BoloAdaptaer(MainActivity.this,cakes);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:
                        Intent intent = new Intent(MainActivity.this, BoloBanana.class );
                        startActivity(intent);
                        break;
                    case 1:
                        Intent intentchocolate = new Intent(MainActivity.this, BoloChocolate.class );
                        startActivity(intentchocolate);
                        break;
                    case 2:
                        Intent intentmorango = new Intent(MainActivity.this, BoloMorango.class );
                        startActivity(intentmorango);
                        break;
                    case 3:
                        Intent intentcupcake = new Intent(MainActivity.this, Cupcake.class );
                        startActivity(intentcupcake);
                        break;
                    case 4:
                        Intent intentrocambole = new Intent(MainActivity.this, Rocambole.class );
                        startActivity(intentrocambole);
                        break;
                    default:
                        Toast.makeText(MainActivity.this,"Não existe esse item",Toast.LENGTH_LONG).show();

                }
           // AQUI OS COLCHETES ESTÃO CEERTOS!!
            }
        });


        }}
