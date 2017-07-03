package com.example.walter.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText text,text2;
    private TextView texto;
    int num1,num2,total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text=(EditText)findViewById(R.id.editText2);
        text2=(EditText)findViewById(R.id.editText);
        texto=(TextView)findViewById(R.id.textView);
    }

    public void sumar(View view){
        if (text.getText().toString().equals("") || text2.getText().toString().equals("")){
            Toast.makeText(this,"Debe ingresar un numero",Toast.LENGTH_SHORT).show();
            texto.setText("");
        }else {
            num1=Integer.parseInt(text.getText().toString());
            num2=Integer.parseInt(text2.getText().toString());
            total=num1+num2;
            texto.setText("Resultado: " +total);
        }
    }
    public void restar(View v){
        if (text.getText().toString().equals("") || text2.getText().toString().equals("")){
            Toast.makeText(this,"Debe ingresar un numero",Toast.LENGTH_SHORT).show();
            texto.setText("");
        }else {
            num1=Integer.parseInt(text.getText().toString());
            num2=Integer.parseInt(text2.getText().toString());
            total=num1-num2;
            texto.setText("Resultado: " +total);
        }
    }
    public void dividir(View v){
        if (text.getText().toString().equals("") || text2.getText().toString().equals("")){
            Toast.makeText(this,"Debe ingresar un numero",Toast.LENGTH_SHORT).show();
            texto.setText("");
        }else {
            if (text2.getText().toString().equals("0")){
                Toast.makeText(this,"Num2 debe ser mayor a cero",Toast.LENGTH_SHORT).show();
                texto.setText("");
            }else{
                num1=Integer.parseInt(text.getText().toString());
                num2=Integer.parseInt(text2.getText().toString());
                total=num1/num2;
                texto.setText("Resultado: " +total);
            }
        }
    }
    public void multiplicar(View v){
        if (text.getText().toString().equals("") || text2.getText().toString().equals("")){
            Toast.makeText(this,"Debe ingresar un numero",Toast.LENGTH_SHORT).show();
            texto.setText("");
        }else {
            num1=Integer.parseInt(text.getText().toString());
            num2=Integer.parseInt(text2.getText().toString());
            total=num1*num2;
            texto.setText("Resultado: " +total);
        }
    }
}
