package com.app.levyv.levy;

import android.content.Intent;
import android.content.SharedPreferences;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.RadioButton;
import android.widget.ArrayAdapter;


public class MainActivity extends AppCompatActivity {
    //    ArrayAdapter adapter1 = ArrayAdapter.createFromResource(getApplicationContext(), R.array.dogs,android.R.layout.simple_spinner_item);
//    private RadioGroup rg;
    private Spinner racas;
    //    int pos;
    private EditText nome;
    private RadioButton dog;
    private RadioButton cat;
    private RadioGroup animal;
    private RadioButton macho;
    RadioButton fem;
    RadioButton ate5kg;
    RadioButton entre610;
    RadioButton acima10;
    RadioButton ate7;
    RadioButton entre811;
    RadioButton acima11;
    RadioGroup sexo;
    ImageView botaoNext;
    int valor,mensal;
    RadioGroup peso;
    RadioGroup idade;
    String sexy;
    String pesoi;
    String idadei;
    String namei;
//    SharedPreferences pref = getApplicationContext().getSharedPreferences("MYPREF",0);
//    Editor ed
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registropet);

        macho = (RadioButton) findViewById(R.id.macho);
        fem = (RadioButton) findViewById(R.id.fem);
        ate5kg = (RadioButton) findViewById(R.id.ate5);
        entre610 = (RadioButton) findViewById(R.id.entre610);
        acima10 = (RadioButton) findViewById(R.id.acima10);
        ate7 = (RadioButton) findViewById(R.id.ate7);
        entre811 = (RadioButton) findViewById(R.id.entre811);
        acima11 = (RadioButton) findViewById(R.id.acima11);
        botaoNext = (ImageView) findViewById(R.id.button1);
        sexo = (RadioGroup) findViewById(R.id.sexo);
        animal = (RadioGroup) findViewById(R.id.animal);
        peso = (RadioGroup) findViewById(R.id.peso);
        idade = (RadioGroup) findViewById(R.id.idade);
        dog = (RadioButton) findViewById(R.id.dogButton);
        cat = (RadioButton) findViewById(R.id.catButton);
        macho = (RadioButton) findViewById(R.id.macho);
        nome = (EditText) findViewById(R.id.nomePet);
//        Spinner racas = (Spinner) findViewById(R.id.spinner);

        animal.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                Spinner racas = (Spinner) findViewById(R.id.spinner);
                ArrayAdapter adp;
                if (animal.getCheckedRadioButtonId() == R.id.dogButton) {
                    adp = ArrayAdapter.createFromResource(getApplicationContext(), R.array.dogs, android.R.layout.simple_spinner_item);
                    racas.setAdapter(adp);
                } else {
                    adp = ArrayAdapter.createFromResource(getApplicationContext(), R.array.cats, android.R.layout.simple_spinner_item);
                    racas.setAdapter(adp);
                }

            }
        });
        sexo.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                if (macho.isChecked()){
                    sexy = "Macho";
                }else{
                    sexy = "Fêmea";
                }
            }
        });
        peso.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if(ate5kg.isChecked()){
                    pesoi = "Ate 5kg";
                }else if (entre610.isChecked()){
                    pesoi = "Entre 6 e 10";
                }else{
                    pesoi = "Acima de 10";
                }
            }
        });
        idade.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (ate7.isChecked()){
                    idadei = "Ate 7";
                }else if (entre811.isChecked()){
                    idadei = "Entre 8 e 11";
                }else{
                    idadei = "Acima de 11";
                }
            }
        });
        botaoNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                namei = nome.getText().toString();
//                Toast.makeText(getApplicationContext(), "Nome: "+name, Toast.LENGTH_SHORT).show();
                int sex = sexo.getCheckedRadioButtonId();
                int weight;
                Bundle bd = new Bundle();

                if(namei.isEmpty()) {
                    nome.setError("Campo Obrigatório!");
                    nome.requestFocus();
                }else if (dog.isChecked()) {
                    Intent createIntent = new Intent(getApplicationContext(), doggo.class);
                    bd.putString("nome",namei);
                    bd.putString("sexo",sexy);
                    bd.putString("idade",idadei);
                    bd.putString("peso",pesoi);
                    createIntent.putExtras(bd);
                    startActivityForResult(createIntent, 0);
                }else if (cat.isChecked()) {
                    Intent typeIntent = new Intent(getApplicationContext(), catto.class);
                    bd.putString("nome",namei);
                    bd.putString("sexo",sexy);
                    bd.putString("idade",idadei);
                    bd.putString("peso",pesoi);
                    typeIntent.putExtras(bd);
                    startActivityForResult(typeIntent, 0);
                }else {
                    Toast.makeText(getApplicationContext(), "Preencha todos os campos!", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
