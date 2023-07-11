package com.example.simple_calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    float f1,f2,f;
    int add,sub,mul,div;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bc=findViewById(R.id.clr);
        Button bsqr=findViewById(R.id.sqr);
        Button bsqt=findViewById(R.id.sqt);
        Button badd=findViewById(R.id.add);
        Button bsub=findViewById(R.id.sub);
        Button bmul=findViewById(R.id.mul);
        Button bdiv=findViewById(R.id.div);
        Button beql=findViewById(R.id.eql);
        Button b1=findViewById(R.id.num1);
        Button b2=findViewById(R.id.num2);
        Button b3=findViewById(R.id.num3);
        Button b4=findViewById(R.id.num4);
        Button b5=findViewById(R.id.num5);
        Button b6=findViewById(R.id.num6);
        Button b7=findViewById(R.id.num7);
        Button b8=findViewById(R.id.num8);
        Button b9=findViewById(R.id.num9);
        Button b0=findViewById(R.id.num0);
        Button bd=findViewById(R.id.dot);
        Button bctr=findViewById(R.id.nthg);
        EditText et1=findViewById(R.id.data);
        EditText et2=findViewById(R.id.output);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                et1.setText(et1.getText()+"1");
                et2.setText("0");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                et1.setText(et1.getText()+"2");
                et2.setText("0");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                et1.setText(et1.getText()+"3");
                et2.setText("0");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                et1.setText(et1.getText()+"4");
                et2.setText("0");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                et1.setText(et1.getText()+"5");
                et2.setText("0");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                et1.setText(et1.getText()+"6");
                et2.setText("0");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                et1.setText(et1.getText()+"7");
                et2.setText("0");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                et1.setText(et1.getText()+"8");
                et2.setText("0");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                et1.setText(et1.getText()+"9");
                et2.setText("0");
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                et1.setText(et1.getText()+"0");
                et2.setText("0");
            }
        });
        bc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                et1.setText("");
                et2.setText("0");
            }
        });

        bd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                et1.setText(et1.getText()+".");
                et2.setText("0");
            }
        });
        bsqr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                f1=Float.parseFloat(et1.getText().toString());
                f=f1*f1;
                String res = String.valueOf(f);
                et1.setText("");
                et2.setText(res);
            }
        });
        bsqt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                f1=Float.parseFloat(et1.getText().toString());
                double pf= Math.sqrt(f1);
                String res = String.valueOf(pf);
                et1.setText("");
                et2.setText(res);
            }
        });
        badd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                f1=Float.parseFloat(et1.getText().toString());
                et1.setText("");
                add=1;
            }
        });
        bsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                f1=Float.parseFloat(et1.getText().toString());
                et1.setText("");
                sub=1;
            }
        });
        bmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                f1=Float.parseFloat(et1.getText().toString());
                et1.setText("");
                mul=1;
            }
        });
        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                f1=Float.parseFloat(et1.getText().toString());
                et1.setText("");
                div=1;
            }
        });
        beql.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                if(add==1)
                {
                    f2=Float.parseFloat(et1.getText().toString());
                    f=f1+f2;
                    String res = String.valueOf(f);
                    et1.setText("");
                    et2.setText(res);
                    add=0;
                }
                else if (sub==1)
                {
                    f2=Float.parseFloat(et1.getText().toString());
                    f=f1-f2;
                    String res = String.valueOf(f);
                    et1.setText("");
                    et2.setText(res);
                    sub=0;
                }
                else if (mul==1)
                {
                    f2=Float.parseFloat(et1.getText().toString());
                    f=f1*f2;
                    String res = String.valueOf(f);
                    et1.setText("");
                    et2.setText(res);
                    mul=0;
                }
                else if (div==1)
                {
                    f2=Float.parseFloat(et1.getText().toString());
                    f=f1/f2;
                    String res = String.valueOf(f);
                    et1.setText("");
                    et2.setText(res);
                    div=0;
                }
            }
        });


    }

    public void creator(View view)
    {
        Toast.makeText(this,"Developed by:Tharun.S.K",Toast.LENGTH_SHORT).show();
    }
}