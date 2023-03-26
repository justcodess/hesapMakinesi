package com.zeynep.myapplication;

import android.widget.TextView;

public class sayiClick {

    TextView resultText;

    public void sayiClick(char sayi){
        if(resultText.getText().toString() == "0"){
            resultText.setText("");
        }
        else if(
                resultText.getText().toString() == "+" ||
                resultText.getText().toString() == "-" ||
                resultText.getText().toString() == "*"||
                resultText.getText().toString() == "/" )
        {
            resultText.setText("");
        }
        resultText.setText(resultText.getText() + String.valueOf(sayi));

    };
}
