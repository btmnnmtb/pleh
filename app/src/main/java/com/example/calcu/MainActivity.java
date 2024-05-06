package com.example.calcu;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.lang.Math;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button plus, minus, multiply, divide , odin , dva , vubor  , pit , shest , sem  , vosem , devat , nulll , tri , chetiri , chisto , koren , logg , stepen , procent;
    TextView output1, input1;
    EditText output, input;
    private EditText per = output;
    private boolean vuborPressed = false;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tri = findViewById(R.id.tri) ;
        chisto = findViewById(R.id.chisto);
        logg = findViewById(R.id.logg);
        chetiri = findViewById(R.id.chetiri);
        plus = findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
        multiply = findViewById(R.id.multiply);
        divide = findViewById(R.id.divide);
        procent = findViewById(R.id.procent);
        output = findViewById(R.id.output);
        output1 = findViewById(R.id.output1);
        input = findViewById(R.id.input);
        input1 = findViewById(R.id.input1);
        odin = findViewById(R.id.odin);
        dva = findViewById(R.id.dva);
        per = output;
        vubor = findViewById(R.id.vubor);
        pit = findViewById(R.id.pit);
        shest = findViewById(R.id.shest);
        sem = findViewById(R.id.sem);
        vosem = findViewById(R.id.vosem);
        devat = findViewById(R.id.devat);
        nulll = findViewById(R.id.nulll);
        stepen = findViewById(R.id.stepen);
        koren = findViewById(R.id.koren);



        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation(Double.parseDouble(output.getText().toString()), Double.parseDouble(input.getText().toString()), "+");
                {

                }
            }

        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation(Double.parseDouble(output.getText().toString()), Double.parseDouble(input.getText().toString()), "-");

            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation(Double.parseDouble(output.getText().toString()), Double.parseDouble(input.getText().toString()), "*");

            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation(Double.parseDouble(output.getText().toString()), Double.parseDouble(input.getText().toString()), "/");

            }
        });
        stepen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation(Double.parseDouble(output.getText().toString()), Double.parseDouble(input.getText().toString()), "^");

            }
        });
        logg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation(Double.parseDouble(output.getText().toString()), Double.parseDouble(input.getText().toString()), "log");
             }
        });
        koren.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operationn(Double.parseDouble(output.getText().toString()),  "корень");
            }
        });
        procent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                operationn(Double.parseDouble(output.getText().toString()), "%");

            }
        });
        odin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num  = per.getText().toString();


                 per.setText(num + "1");







            }
        });
        dva.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num  = per.getText().toString();


                per.setText(num + "2");







            }
        });
        tri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num  = per.getText().toString();


                per.setText(num + "3");







            }
        });
        chetiri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num  = per.getText().toString();


                per.setText(num + "4");







            }
        });
        pit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num  = per.getText().toString();


                per.setText(num + "5");







            }
        });
        shest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num  = per.getText().toString();


                per.setText(num + "6");







            }
        });
        sem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num  = per.getText().toString();


                per.setText(num + "7");







            }
        });
        vosem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num  = per.getText().toString();


                per.setText(num + "8");







            }
        });
        devat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num  = per.getText().toString();


                per.setText(num + "9");







            }
        });
        nulll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num  = per.getText().toString();


                per.setText(num + "0");







            }
        });
        chisto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num  = per.getText().toString();


                per.setText(" ");







            }
        });

        vubor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!vuborPressed) {
                    per = input;
                    vuborPressed = true;
                } else {
                    per = output;
                    vuborPressed = false;
                }
            }
        });

    }


    private void operation(double a, double b, String operation) {
        double result = 0;
        switch (operation) {
            case "+":
                result = a + b;
                break;



            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                result = a / b;
                break;
            case "^":

                result = (int) Math.pow(a, b) ;

                break;
            case "log":

                result = Math.log(a) / Math.log(b) ;
                break;





        }


        output1.setText(operation);
        input1.setText(String.valueOf(result))  ;
    }
    private void operationn(double a, String operation){
        double result = 0;
        switch (operation) {
            case "корень":

                result = Math.sqrt(a);
                break;
            case "%":

                result = a / 100;
                break;
        }
        output1.setText(operation);
        input1.setText(String.valueOf(result));

    }
}