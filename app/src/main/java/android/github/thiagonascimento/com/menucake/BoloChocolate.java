package android.github.thiagonascimento.com.menucake;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by Thiago on 02/11/2016.
 */

public class BoloChocolate extends AppCompatActivity {

    ImageView imageViewchocoloate;
    TextView txtchocolate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bolochocolate);
        imageViewchocoloate = (ImageView) findViewById(R.id.imageViewchocolate);
        txtchocolate = (TextView) findViewById(R.id.textViewchocolate);
    }
}
