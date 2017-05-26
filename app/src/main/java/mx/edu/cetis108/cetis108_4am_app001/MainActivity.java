package mx.edu.cetis108.cetis108_4am_app001;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        saludo=(TextView) findViewById(R.id.txtViewSaludo);
        nombre=(EditText) findViewById(R.id.txtNombre);
    }
    TextView saludo;
    EditText nombre;
    Button aceptar;

    public void  aceptar(View view)
    {
       saludo.setText("Hola"+nombre.getText());
    }
}
