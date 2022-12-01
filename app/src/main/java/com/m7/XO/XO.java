package com.m7.XO;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class XO extends AppCompatActivity {
  TextView resultview;
  Button btn1;
  Button btn2;
  Button btn3;
  Button btn4;
  Button btn5;
  Button btn6;
  Button btn7;
  Button btn8;
  Button btn9;
  int xoCounter=0;
  boolean endOFGame=false;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xo);
        resultview=findViewById(R.id.screen1);
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
       //--------------------
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);
        btn6=findViewById(R.id.btn6);
        ///
        btn7=findViewById(R.id.btn7);
        btn8=findViewById(R.id.btn8);
        btn9=findViewById(R.id.btn9);
       }
       public void onClick(View view){
        Button onClick=((Button) view);
        if (onClick.getText().equals("")&&endOFGame==false){

            if (xoCounter==0){
                onClick.setText("X");
                xoCounter=1;}
            else {
                onClick.setText("O");
                xoCounter = 0;
        }}

           claculateResulte();



       }

    public void claculateResulte(){


        String res1 =btn1.getText().toString();
        String res2=btn2.getText().toString();
        String res3=btn3.getText().toString();

        String res4 =btn4.getText().toString();
        String res5=btn5.getText().toString();
        String res6=btn6.getText().toString();

        String res7 =btn7.getText().toString();
        String res8=btn8.getText().toString();
        String res9=btn9.getText().toString();


        if (res1=="X"){
                if (res1==res2&&res1==res3) {

                    resultview.setText("x win");
                    endOFGame=true;
                }
           else if (res1==res4&&res1==res7) {

                resultview.setText("X win");
                    endOFGame=true;

                }}
        else if(res1=="O"){
            if (res1==res2&&res1==res3) {

                resultview.setText("o win");
                endOFGame=true;

            }
            else if (res1==res4&&res1==res7) {

                resultview.setText("o win");
                endOFGame=true;

            }
        }

        if (res5=="X"){
             if (res5==res4&&res5==res6){

                 resultview.setText("X win");
                 endOFGame=true;


             }
             else if(res5==res2&&res5==res8){

                 resultview.setText("X win");
                 endOFGame=true;



             }
             else if (res5==res1&&res5==res9){
                 resultview.setText("X win");
                 endOFGame=true;



             }
             else if (res5==res3&&res5==res7){
                 resultview.setText("X win");
                 endOFGame=true;



             }
        }
        else if (res5=="O"){

            if (res5==res4&&res5==res6){

                resultview.setText("O win");
                endOFGame=true;


            }
            else if(res5==res2&&res5==res8){

                resultview.setText("O win");
                endOFGame=true;

            }

            else if (res5==res1&&res5==res9){
                resultview.setText("O win");
                endOFGame=true;


            }
            else if (res5==res3&&res5==res7){
                resultview.setText("O win");
                endOFGame=true;

            }}

         if (res9=="X"){
            if (res9==res6&&res9==res3){

                resultview.setText("X win");
                endOFGame=true;

            }
            else if(res9==res8&&res9==res7){

                resultview.setText("X win");
                endOFGame=true;


            }


        }
        else if (res9=="O"){

            if (res9==res6&&res9==res3){

                resultview.setText("O win");
                endOFGame=true;


            }
            else if(res9==res8&&res9==res7){

                resultview.setText("O win");
                endOFGame=true;



            }
        }



        }
    public void onClickRest(View view){
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");
        resultview.setText("");
        endOFGame=false;
    }
    public void onClickExit(View view){
        finish();
    }
}
