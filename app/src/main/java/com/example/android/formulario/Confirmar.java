package com.example.android.formulario;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Confirmar extends AppCompatActivity {


    private TextView nombre,telefono,descripcion,email,fecha;

    private Button Bu2;
    private String nom,ema,tel,des,fe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmar);

        nombre = (TextView) findViewById(R.id.tv1nombre);
        email = (TextView) findViewById(R.id.tv4email);
        telefono = (TextView) findViewById(R.id.tv2telefono);
        descripcion = (TextView) findViewById(R.id.tv5descripcion);
        fecha = (TextView) findViewById(R.id.tv3fecha);

        Bu2 = (Button) findViewById(R.id.button2);



        Bundle extras = getIntent().getExtras();
        nom = extras.getString("nom");
        ema = extras.getString("ema");
        tel = extras.getString("tel");
        des = extras.getString("des");
        fe = extras.getString("fe");

        nombre.setText(nom);
        email.setText(ema);
        telefono.setText(tel);
        descripcion.setText(des);
        fecha.setText(fe);


        Bu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            /*  Intent intent = new Intent();
                intent.putExtra("nom",nom);
                intent.putExtra("ema",ema);
                intent.putExtra("tel",tel);
                intent.putExtra("des",des);
                intent.putExtra("fe",fe);
                setResult(RESULT_OK, intent); */
                finish();
            }
        });
    }
}
