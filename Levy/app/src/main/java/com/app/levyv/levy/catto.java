package com.app.levyv.levy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class catto extends AppCompatActivity {
    TextView valor;
    TextView mensal;
    TextView titulari;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.catto);


        valor = findViewById(R.id.valordoggo);
        mensal = findViewById(R.id.mensaldoggo);
        titulari = findViewById(R.id.titulardoggo);


        Intent intent = getIntent();
        Bundle bd = intent.getExtras();

        if(bd != null) {
            String sexo = bd.getString("sexo");
            String peso = bd.getString("peso");
            String idade = bd.getString("idade");
            String titular = bd.getString("nome");
            titulari.setText(titular);

            if (peso.equalsIgnoreCase("Ate 5kg") && idade.equalsIgnoreCase("Ate 7")){
                valor.setText("19,90\n");
                mensal.setText(" 4,98\n por pet");
            }else if (peso.equalsIgnoreCase("Entre 6 e 10") && idade.equalsIgnoreCase("Ate 7")){
                valor.setText("25,50\n");
                mensal.setText(" 6.38\n por pet");
            }else if (peso.equalsIgnoreCase("Acima de 10") && idade.equalsIgnoreCase("Ate 7")){
                valor.setText("39,90\n");
                mensal.setText("8,98\n por pet");
            }else if (peso.equalsIgnoreCase("Ate 5kg") && idade.equalsIgnoreCase("Entre 8 e 11")){
                valor.setText("32,30");
                mensal.setText("8,10\n por pet");
            }else if (peso.equalsIgnoreCase("Entre 6 e 10") && idade.equalsIgnoreCase("Entre 8 e 11")){
                valor.setText("32,30\n");
                mensal.setText(" 8,10\n por pet");
            }else if (peso.equalsIgnoreCase("Acima de 10") && idade.equalsIgnoreCase("Entre 8 e 11")){
                valor.setText("39,90");
                mensal.setText(" 8,98\n por pet");
            }else if (peso.equalsIgnoreCase("Ate 5kg") && idade.equalsIgnoreCase("Acima de 11")){
                valor.setText("32,30");
                mensal.setText(" 8,10\n por pet");
            }else if (peso.equalsIgnoreCase("Entre 6 e 10") && idade.equalsIgnoreCase("Acima de 11")){
                valor.setText("39,90");
                mensal.setText(" 8,98\n por pet");
            }else if (peso.equalsIgnoreCase("Acima de 10") && idade.equalsIgnoreCase("Acima de 11")){
                valor.setText("80,77");
                mensal.setText(" 20,20\n por pet");
            }
        }
    }
}
