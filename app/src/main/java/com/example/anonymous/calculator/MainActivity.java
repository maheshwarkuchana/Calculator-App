package com.example.anonymous.calculator;

import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;


public class MainActivity extends AppCompatActivity {

    String s;
    float result;
    TextView editText;
    TextView textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textview = (TextView) findViewById(R.id.textbox);
        editText = (TextView) findViewById(R.id.edittext);
        editText.setText(null);

//       s


        TextView C = (TextView) findViewById(R.id.C);
        C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s = "";
                editText.setText(s);
                textview.setText(s);
                result = 0;
            }
        });


        TextView openbrace = (TextView) findViewById(R.id.openbrace);
        openbrace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText().toString() + "(");
            }
        });


        TextView closebrace = (TextView) findViewById(R.id.closebrace);
        closebrace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText().toString() + ")");
            }
        });


        TextView multiply = (TextView) findViewById(R.id.mult);
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText().toString() + "*");
            }
        });


        TextView seven = (TextView) findViewById(R.id.seven);
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText() + "7");
            }
        });


        TextView eight = (TextView) findViewById(R.id.eight);
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText() + "8");
            }
        });


        TextView nine = (TextView) findViewById(R.id.nine);
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText() + "9");
            }
        });


        TextView divide = (TextView) findViewById(R.id.divide);
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText().toString() + "/");
            }
        });


        TextView four = (TextView) findViewById(R.id.four);
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText() + "4");
            }
        });


        TextView five = (TextView) findViewById(R.id.five);
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText() + "5");
            }
        });


        TextView six = (TextView) findViewById(R.id.six);
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText() + "6");
            }
        });


        TextView minus = (TextView) findViewById(R.id.minus);
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText().toString() + "-");
            }
        });


        TextView one = (TextView) findViewById(R.id.one);
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText() + "1");
            }
        });


        TextView two = (TextView) findViewById(R.id.two);
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText() + "2");
            }
        });


        TextView three = (TextView) findViewById(R.id.three);
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText() + "3");
            }
        });


        TextView plus = (TextView) findViewById(R.id.plus);
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText().toString() + "+");
            }
        });


        TextView zero = (TextView) findViewById(R.id.zero);
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText() + "0");
            }
        });


        TextView doublezero = (TextView) findViewById(R.id.doubleZero);
        doublezero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText() + "00");
            }
        });


        TextView decimal = (TextView) findViewById(R.id.decimal);
        decimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText() + ".");
            }
        });


        TextView backspace = (TextView) findViewById(R.id.backspace);
        backspace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = editText.getText().toString();
                if (str.length() >= 1) {
                    str = str.substring(0, str.length() - 1);
                    editText.setText(str);
                }
                if (str.length() < 1) {
                    editText.setText("");
                }
            }
        });

        Button equalto = (Button) findViewById(R.id.equals);
        equalto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    String express = editText.getText().toString();

                    // Create an Expression (A class from exp4j library)
                    Expression expression = new ExpressionBuilder(express).build();
                    try {

                        double result = expression.evaluate();
                        textview.setText(Double.toString(result));

                    } catch (Exception ex) {
                        textview.setText("Error");
                    }

                } catch (Exception e) {
                    textview.setText("Error");
                }
            }
        });
    }
}
