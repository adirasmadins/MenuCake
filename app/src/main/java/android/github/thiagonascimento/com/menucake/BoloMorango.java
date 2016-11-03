package android.github.thiagonascimento.com.menucake;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Thiago on 02/11/2016.
 */

public class BoloMorango extends AppCompatActivity {

    ImageView imageViewmorango;
    TextView txtmorango;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bolomorango);
        imageViewmorango = (ImageView) findViewById(R.id.imagemorango);
        txtmorango = (TextView) findViewById(R.id.textmorango);
    }
}
