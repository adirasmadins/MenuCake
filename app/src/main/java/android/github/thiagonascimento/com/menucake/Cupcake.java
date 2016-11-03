package android.github.thiagonascimento.com.menucake;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by Thiago on 02/11/2016.
 */

public class Cupcake extends AppCompatActivity {

    ImageView imageViewcupcake;
    TextView txtcupcake;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cupcake);
        imageViewcupcake = (ImageView) findViewById(R.id.imagecupcake);
        txtcupcake = (TextView) findViewById(R.id.textViewcupcake);
    }
}
