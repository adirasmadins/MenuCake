package android.github.thiagonascimento.com.menucake;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Thiago on 02/11/2016.
 */

public class BoloBanana extends AppCompatActivity {

    ImageView imageViewbanana;
    TextView   txtbanana;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bolobanana);
        imageViewbanana = (ImageView) findViewById(R.id.imageView2);
        txtbanana = (TextView) findViewById(R.id.textbanana);
    }
}
