package android.github.thiagonascimento.com.menucake;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Thiago on 02/11/2016.
 */

public class Rocambole extends AppCompatActivity {

    ImageView imageViewRocambole;
    TextView txtrocambole;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rocambole);
        imageViewRocambole = (ImageView) findViewById(R.id.imagerocambole);
        txtrocambole = (TextView) findViewById(R.id.textViewrocambole);
    }
}
