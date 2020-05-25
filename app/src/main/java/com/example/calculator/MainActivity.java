package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    TextView input,signbox;
    View views;
    String sign,value1,value2,SpecialFunction;
    Double num1,num2,result;
    boolean hasdot, isSpecialFunctionOn;
    DecimalFormat decimalFormat=new DecimalFormat("#.######");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input=findViewById(R.id.input);
        signbox=findViewById(R.id.sign);
        hasdot=false;
        isSpecialFunctionOn=false;
    }
    @SuppressLint("SetTextI18n")
    public void button0(View view) {
        if (!input.getText().equals("0"))
            input.setText(input.getText()+"0");
        else
            input.setText("0");
    }
    @SuppressLint("SetTextI18n")
    public void button1(View view) {
        if(!input.getText().equals("0"))
            input.setText(input.getText()+"1");
        else{
            input.setText("1");
        }

    }
    @SuppressLint("SetTextI18n")
    public void button2(View view) {
        if(!input.getText().equals("0"))
            input.setText(input.getText()+"2");
        else{
            input.setText("2");
        }
    }
    @SuppressLint("SetTextI18n")
    public void button3(View view) {
        if(!input.getText().equals("0"))
            input.setText(input.getText()+"3");
        else{
            input.setText("3");
        }
    }
    @SuppressLint("SetTextI18n")
    public void button4(View view) {
        if(!input.getText().equals("0"))
            input.setText(input.getText()+"4");
        else{
            input.setText("4");
        }
    }
    @SuppressLint("SetTextI18n")
    public void button5(View view) {
        if(!input.getText().equals("0"))
            input.setText(input.getText()+"5");
        else{
            input.setText("5");
        }
    }@SuppressLint("SetTextI18n")
    public void button6(View view) {
        if(!input.getText().equals("0"))
            input.setText(input.getText()+"6");
        else{
            input.setText("6");
        }
    }
    @SuppressLint("SetTextI18n")
    public void button7(View view) {
        if(!input.getText().equals("0"))
            input.setText(input.getText()+"7");
        else{
            input.setText("7");
        }
    }
    @SuppressLint("SetTextI18n")
    public void button8(View view) {
        if(!input.getText().equals("0"))
            input.setText(input.getText()+"8");
        else{
            input.setText("8");
        }
    }
    @SuppressLint("SetTextI18n")
    public void button9(View view) {
        if(!input.getText().equals("0"))
            input.setText(input.getText()+"9");
        else{
            input.setText("9");
        }
    }
    @SuppressLint("SetTextI18n")
    public void buttonPi(View view) {
        input.setText(decimalFormat.format(Math.PI));
    }
    @SuppressLint("SetTextI18n")
    public void buttonE(View view) {
        input.setText(decimalFormat.format(Math.exp(1)));
    }

    @SuppressLint("SetTextI18n")
    public void buttonDot(View view){
        if(!hasdot){
            if(input.getText().equals("")){
                input.setText("0.");
            }
            else{
                input.setText(input.getText()+".");
            }
            hasdot=true;
        }
    }

    public void buttonPlus(View view){
        sign="+";
        value1=input.getText().toString();
        input.setText(null);
        signbox.setText("+");
    }
    public void buttonMinus(View view){
        sign="-";
        value1=input.getText().toString();
        input.setText(null);
        signbox.setText("-");
    }
    public void buttonMultiply(View view){
        sign="*";
        value1=input.getText().toString();
        input.setText(null);
        signbox.setText("×");
    }
    public void buttonDivision(View view){
        sign="/";
        value1=input.getText().toString();
        input.setText(null);
        signbox.setText("÷");
    }
    public void buttonLog(View view){
        SpecialFunction="log";
        value1=input.getText().toString();
        input.setText(null);
        signbox.setText("log");
    }
    public void buttonLn(View view){
        SpecialFunction="ln";
        value1=input.getText().toString();
        input.setText(null);
        signbox.setText("ln");
    }
    public void buttonPower(View view){
        SpecialFunction="power";
        value1=input.getText().toString();
        input.setText(null);
        signbox.setText("xⁿ");
    }
    public void buttonSqrt(View view){
        SpecialFunction="sqrt";
        value1=input.getText().toString();
        input.setText(null);
        signbox.setText("√");
    }
    public void buttonFact(View view){
        SpecialFunction="factorial";
        value1=input.getText().toString();
        input.setText(null);
        signbox.setText("!");
    }
    public void buttonSin(View view){
        SpecialFunction="sin";
        value1=input.getText().toString();
        input.setText(null);
        signbox.setText("sin");
    }
    public void buttonCos(View view){
        SpecialFunction="cos";
        value1=input.getText().toString();
        input.setText(null);
        signbox.setText("cos");
    }
    public void buttonTan(View view){
        SpecialFunction="tan";
        value1=input.getText().toString();
        input.setText(null);
        signbox.setText("tan");
    }
    public void buttonEqual(View view){
        if((SpecialFunction==null && sign==null)||input.getText().equals("")){
            signbox.setText("Error!");
        }else if(SpecialFunction!=null){
            switch (SpecialFunction){
                default:
                    break;
                case "log":
                    value1=input.getText().toString();
                    num1=Double.parseDouble(value1);
                    input.setText(decimalFormat.format(Math.log10(num1)));
                    SpecialFunction=null;
                    isSpecialFunctionOn=false;
                    signbox.setText(null);
                    break;
                case "ln":
                    value1=input.getText().toString();
                    num1=Double.parseDouble(value1);
                    input.setText(decimalFormat.format(Math.log(num1)));
                    SpecialFunction=null;
                    isSpecialFunctionOn=false;
                    signbox.setText(null);
                    break;
                case "power":
                    value1=input.getText().toString();
                    num1=Double.parseDouble(value1);
                    input.setText(Math.pow(num1,num2)+"");
                    SpecialFunction=null;
                    isSpecialFunctionOn=false;
                    signbox.setText(null);
                    break;
                case "sqrt":
                    value1=input.getText().toString();
                    num1=Double.parseDouble(value1);
                    input.setText(Math.sqrt(num1)+"");
                    SpecialFunction=null;
                    isSpecialFunctionOn=false;
                    signbox.setText(null);
                    break;
                case "factorial":
                    value1=input.getText().toString();
                    num1=Double.parseDouble(value1);
                    int value=Integer.parseInt(value1);
                    for(int i=1;i<value;i++){
                        num1*=i;
                    }
                    input.setText(num1+"");
                    SpecialFunction=null;
                    isSpecialFunctionOn=false;
                    signbox.setText(null);
                    break;
                case "sin":
                    value1=input.getText().toString();
                    num1=Double.parseDouble(value1);
                    input.setText(decimalFormat.format(Math.sin(num1)));
                    SpecialFunction=null;
                    isSpecialFunctionOn=false;
                    signbox.setText(null);
                    break;
                case "cos":
                    value1=input.getText().toString();
                    num1=Double.parseDouble(value1);
                    input.setText(decimalFormat.format(Math.cos(num1)));
                    SpecialFunction=null;
                    isSpecialFunctionOn=false;
                    signbox.setText(null);
                    break;
                case "tan":
                    value1=input.getText().toString();
                    num1=Double.parseDouble(value1);
                    input.setText(decimalFormat.format(Math.tan(num1)));
                    SpecialFunction=null;
                    isSpecialFunctionOn=false;
                    signbox.setText(null);
                    break;
            }
        } else if(sign!=null){
            value2=input.getText().toString();
            num1=Double.parseDouble(value1);
            num2=Double.parseDouble(value2);
            input.setText(null);

            switch (sign){
                default:
                    break;
                case "+":
                    result=num1+num2;
                    input.setText(result+"");
                    sign=null;
                    signbox.setText(null);
                    break;
                case "-":
                    result=num1-num2;
                    input.setText(result+"");
                    sign=null;
                    signbox.setText(null);
                    break;
                case "*":
                    result=num1*num2;
                    input.setText(result+"");
                    sign=null;
                    signbox.setText(null);
                    break;
                case "/":
                    result=num1/num2;
                    input.setText(result+"");
                    sign=null;
                    signbox.setText(null);
                    break;
            }
        }
        else{
            input.setText("Error!");
            if(!hasdot){
                if(input.getText().equals("")){
                    input.setText("0.");
                }
                else{
                    input.setText(input.getText()+".");
                }
                hasdot=true;
            }

        }
    }

    public void buttonDelete(View view){
        if(input.getText().equals("0")){
            input.setText("0");
        }
        else{
            int len=input.getText().length();
            String s=input.getText().toString();
            if(s.charAt(len-1)=='.'){
                hasdot=false;
                input.setText(input.getText().subSequence(0,input.getText().length()-1));
                if(input.getText().equals("")){
                    input.setText("0");
                }
            }
            else{
                input.setText(input.getText().subSequence(0,input.getText().length()-1));
                if(input.getText().equals("")){
                    input.setText("0");
                }
            }
        }
    }

    public void buttonClear(View view){
       input.setText("0");
       signbox.setText(null);
       sign=null;
       value1=null;
       value2=null;
       hasdot=false;
       isSpecialFunctionOn=false;
    }

}

