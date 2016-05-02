package com.example.android.formulario;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText nombre,telefono,descripcion,email;
    private DatePicker myDatePicker;
    private Button Bu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        nombre = (EditText) findViewById(R.id.input_name);
        email = (EditText) findViewById(R.id.input_email);
        telefono = (EditText) findViewById(R.id.input_telefono);
        descripcion = (EditText) findViewById(R.id.input_descripcion);

        myDatePicker = (DatePicker) findViewById(R.id.datePicker);

        Bu = (Button) findViewById(R.id.button);
        Bu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String nom,ema,tel,des,fe;

                nom = String.valueOf(nombre.getText().toString());
                ema = String.valueOf(email.getText().toString());
                tel = String.valueOf(telefono.getText().toString());
                des = String.valueOf(descripcion.getText().toString());


                final int mes2 = myDatePicker.getMonth();
                final int uno = 1;

                fe = myDatePicker.getDayOfMonth()+ "/" +(mes2+uno) + "/"+ myDatePicker.getYear();



                Intent intent = new Intent(MainActivity.this, Confirmar.class);
                intent.putExtra("nom",nom);
                intent.putExtra("ema",ema);
                intent.putExtra("tel",tel);
                intent.putExtra("des",des);
                intent.putExtra("fe",fe);
                startActivity(intent);
                //startActivityForResult(intent, 1234);
            }
        });

    }

   /* @Override protected void onActivityResult (int requestCode,
                                               int resultCode, Intent data){
        if (requestCode==1234 && resultCode==RESULT_OK) {
            nombre.setText(data.getExtras().getString("nom"));
            email.setText(data.getExtras().getString("ema"));
            telefono.setText(data.getExtras().getString("tel"));
            descripcion.setText(data.getExtras().getString("des"));
           // myDatePicker.set.setText(data.getExtras().getString("nom"));


        }
    }*/
}
