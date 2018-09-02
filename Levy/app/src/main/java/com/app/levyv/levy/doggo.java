package com.app.levyv.levy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class doggo extends AppCompatActivity {
    TextView valor;
    TextView mensal;
    TextView titulari;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.doggo);


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
            String a57 = "R$19,90";
            titulari.setText(titular);
//            valor.setText("19,90");
            if (peso.equalsIgnoreCase("Ate 5kg") && idade.equalsIgnoreCase("Ate 7")){
                valor.setText("19,90");
                mensal.setText(" 4,98\n por pet");
            }else if (peso.equalsIgnoreCase("Entre 6 e 10") && idade.equalsIgnoreCase("Ate 7")){
                valor.setText("R$25,50");
                mensal.setText("R$6.38");
            }else if (peso.equalsIgnoreCase("Acima de 10") && idade.equalsIgnoreCase("Ate 7")){
                valor.setText("R$39,90");
                mensal.setText("R$8,98");
            }else if (peso.equalsIgnoreCase("Ate 5kg") && idade.equalsIgnoreCase("Entre 8 e 11")){
                valor.setText("R$32,30");
                mensal.setText("R$8,10");
            }else if (peso.equalsIgnoreCase("Entre 6 e 10") && idade.equalsIgnoreCase("Entre 8 e 11")){
                valor.setText("R$32,30");
                mensal.setText("R$8,10");
            }else if (peso.equalsIgnoreCase("Acima de 10") && idade.equalsIgnoreCase("Entre 8 e 11")){
                valor.setText("R$39,90");
                mensal.setText("R$8,98");
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
