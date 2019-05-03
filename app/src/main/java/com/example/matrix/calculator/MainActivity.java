package com.example.matrix.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText display;
   Float mv1,mv2;
    boolean madd,msub,mmul,mdiv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        display = findViewById(R.id.display1);
        Button num9 = (Button) findViewById(R.id.num_9);
        Button num8 = (Button) findViewById(R.id.num_8);
        Button num7 = (Button) findViewById(R.id.num_7);
        Button num6 = (Button) findViewById(R.id.num_6);
        Button num5 = (Button) findViewById(R.id.num_5);
        Button num4 = (Button) findViewById(R.id.num_4);
        Button num3 = (Button) findViewById(R.id.num_3);
        Button num2 = (Button) findViewById(R.id.num_2);
        Button num1 = (Button) findViewById(R.id.num_1);
        Button num0 = (Button) findViewById(R.id.num_0);
        Button add = (Button) findViewById(R.id.num_add);
        Button sub = (Button) findViewById(R.id.num_sub);
        Button mul = (Button) findViewById(R.id.num_mul);
        Button dec = (Button) findViewById(R.id.num_dec);
        Button div = (Button) findViewById(R.id.num_div);
        Button equal = (Button) findViewById(R.id.num_equal);
        Button clear = (Button) findViewById(R.id.num_clear);


         num9.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 display.setText(display.getText()+"9");
             }
         });

        num8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText()+ "8");
            }
        });

        num7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText()+"7");
            }
        });

        num6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText()+"6");
            }
        });

        num5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText()+"5");
            }
        });

        num4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText()+"4");
            }
        });

        num3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText()+"3");
            }
        });

        num2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText()+"2");
            }
        });

        num1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText()+"1");
            }
        });

        num0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText()+"0");
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (display == null) {
                    display.setText("");
                }
                else {
                    mv1=Float.parseFloat(display.getText() + "");
                    madd=true;
                    display.setText("");
                }
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mv1=Float.parseFloat(display.getText() + "");
                msub=true;
                display.setText("");

            }
        });

mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mv1=Float.parseFloat(display.getText() + "");
                mmul=true;
                display.setText("");
            }
        });


        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mv1=Float.parseFloat(display.getText() + "");
                mdiv=true;
                display.setText("");
            }
        });

        dec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText()+ ".");
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText("");
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mv2 = Float.parseFloat(display.getText() + "");

                if (madd == true) {
                    display.setText(mv1 + mv2 + "");
                    madd = false;
                }
                if (msub == true) {
                    display.setText(mv1 - mv2 + "");
                    madd = false;

                }
                if (mmul == true) {
                    display.setText(mv1 * mv2 + "");
                    madd = false;
                }
                if (mdiv == true) {
                    display.setText(mv1 / mv2 + "");
                    madd = false;
                }
            }

                    });
        }

}
