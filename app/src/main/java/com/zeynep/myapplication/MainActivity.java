package com.zeynep.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity  {

     private TextView resultText,cozumText;
     private String sayi="";
     private String sembol="";



    Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnNokta;
    Button btnArti,btnEksi,btnCarpi,btnBolme,btnYuzde,btnEsit,btnSil,btnTers;
    Boolean div=false,multi=false,minus=false,plus=false;

    Double num1,num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultText = findViewById(R.id.resultText);
        cozumText=findViewById(R.id.cozumText);


        btn0=findViewById(R.id.button0);
        btn1=findViewById(R.id.button1);
        btn2=findViewById(R.id.button2);
        btn3=findViewById(R.id.button3);
        btn4=findViewById(R.id.button4);
        btn5=findViewById(R.id.button5);
        btn6=findViewById(R.id.button6);
        btn7=findViewById(R.id.button7);
        btn8=findViewById(R.id.button8);
        btn9=findViewById(R.id.button9);
        btnArti=findViewById(R.id.buttonArti);
        btnEksi=findViewById(R.id.buttonEksi);
        btnCarpi=findViewById(R.id.buttonCarpi);
        btnBolme =findViewById(R.id.buttonBol);
        btnYuzde=findViewById(R.id.buttonYuzde);
        btnEsit=findViewById(R.id.buttonEsit);
        btnSil=findViewById(R.id.buttonAC);
        btnTers=findViewById(R.id.buttonTers);
        btnNokta=findViewById(R.id.buttonNokta);




    }

       public void btn0(View view){
        sayiClick('0');
        }
        public void btn1(View view){
        sayiClick('1');
    }
        public void btn2(View view){
        sayiClick('2');
    }
        public void btn3(View view){
        sayiClick('3');
    }
        public void btn4(View view){
        sayiClick('4');
    }
        public void btn5(View view){
        sayiClick('5');
    }
        public void btn6(View view){
        sayiClick('6');
    }
        public void btn7(View view){
        sayiClick('7');
    }
        public void btn8(View view){
        sayiClick('8');
    }
        public void btn9(View view){
        sayiClick('9');
    }
    public void btnArti(View view){
        sembolClick("+");
    }

    public void btnEksi(View view){
        sembolClick("-");
    }
    public void btnCarpma(View view){
        sembolClick("*");
    }
    public void btnBolme(View view){

        sembolClick("/");
    }
    public void btnYuzde(View view){
        sembolClick("%");
    }
    public void btnAC(View view){
        sembolClick("AC");
    }
    public void btnTers(View view){
        sembolClick("+/-");
    }
    public void btnNokta(View view){
        sembolClick(".");
    }
    public void btnEsit(View view){
        sembolClick("=");
    }



        public void sayiClick(char sayi){
            if(resultText.getText().toString() == "0"){
                resultText.setText("");
            }

            resultText.setText(resultText.getText() + String.valueOf(sayi));

        };


        public void sembolClick(String sembol){
            switch (sembol)
            {


                case "AC": {
                    num1 = 0.0;
                    resultText.setText("0");
                    cozumText.setText(resultText.getText());
                    }
                break;

                case "%": {
                    num1 = Double.parseDouble(resultText.getText().toString())/100;
                    resultText.setText(num1.toString());
                    cozumText.setText(resultText.getText());}
                break;

                case "+/-": {
                    num1 = (-1)* Double.parseDouble(resultText.getText().toString());
                    resultText.setText(num1.toString());
                    cozumText.setText(resultText.getText());
                break;}

                case "." :{
                    resultText.setText(resultText.getText()+".");
                    cozumText.setText(resultText.getText());}
                break;
                case"+":{
                    if (resultText== null) {
                        resultText.setText("");
                    } else {
                        num1 = Double.parseDouble(resultText.getText().toString() + "");
                        plus=true;
                        resultText.setText(null);
                    }
                }break;

                case"-":{
                    num1 = Double.parseDouble(resultText.getText() + "");
                    minus = true;
                    resultText.setText(null);}
                break;

                case"/":{
                    num1 = Double.parseDouble(resultText.getText() + "");
                    div = true;
                    resultText.setText(null);}
                break;

                case"*":{
                    num1 = Double.parseDouble(resultText.getText() + "");
                    multi = true;
                    resultText.setText(null);}
                break;

                case "=":
                {


                     num2 = Double.parseDouble(resultText.getText() + "");
                     if (plus == true) {
                     resultText.setText(num1 + num2 + "");
                     cozumText.setText(num1 + "+" + num2);
                     plus = false;
                                }
                    if (minus == true) {
                        resultText.setText(num1 - num2 + "");
                        cozumText.setText(num1 + "-" + num2);
                        minus = false;
                    }
                    if (multi == true) {
                        resultText.setText(num1 * num2 + "");
                        cozumText.setText(num1 + "*" + num2);
                        multi = false;
                    }
                    if (div == true) {
                        resultText.setText(num1 / num2 + "");
                        cozumText.setText(num1 + "/" + num2);
                        div = false;
                    }



                }

            }
        }}















