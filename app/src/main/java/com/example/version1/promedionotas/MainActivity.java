package com.example.version1.promedionotas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private EditText primeranota;
    private EditText segundanota;
    private EditText terceranota;
    private EditText cuartanota;
    private Button calcular;
    private EditText resultado;

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(newBase);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        primeranota = findViewById(R.id.txtnota1);
        segundanota = findViewById(R.id.txtnota2);
        terceranota = findViewById(R.id.txtnota3);
        cuartanota = findViewById(R.id.txtnota4);
        calcular = findViewById(R.id.btncalcular);
        final TextView resultado = findViewById(R.id.lblresultado);


        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                float n1 = new Float(primeranota.getText().toString());
                float n2 = new Float(segundanota.getText().toString());
                float n3 = new Float(terceranota.getText().toString());
                float n4 = new Float(cuartanota.getText().toString());

                float promedio = ((n1 + n2 + n3 +n4)/4);

                String result = String.valueOf(promedio);

                resultado.setText("Su promedio es: " + result);


                if (promedio>= 3) {

                    Toast.makeText(MainActivity.this,
                            "Aprobaste el curso, ¡FELICIDADES!",
                            Toast.LENGTH_LONG).show();


                } else {

                    Toast.makeText(MainActivity.this,
                            "Reprobaste el curso",
                            Toast.LENGTH_LONG).show();
                }







            }


        });

    }
}