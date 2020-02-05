package com.example.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private CheckBox mJava,mPython,mKotlin,mC,mPearl;
    private Button show;
    private TextView showText;
    private ArrayList<String>mResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mJava=findViewById(R.id.check_java);
        mPython=findViewById(R.id.check_python);
        mKotlin=findViewById(R.id.check_kotlin);
        mC=findViewById(R.id.check_c);
        mPearl=findViewById(R.id.check_pearl);

        showText=findViewById(R.id.txtResult);
        mResult=new ArrayList<>();

        show=findViewById(R.id.btnResult);

        showText.setEnabled(false);

        mJava.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mJava.isChecked())
                {
                    mResult.add("Java");
                }
                else
                {
                    mResult.remove("Java");
                }
            }
        });


        mPython.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mPython.isChecked())
                {
                    mResult.add("Python");
                }
                else
                {
                    mResult.remove("Python");
                }
            }
        });


        mKotlin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mKotlin.isChecked())
                {
                    mResult.add("Kotlin");
                }
                else
                {
                    mResult.remove("Kotlin");
                }
            }
        });


        mJava.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mJava.isChecked())
                {
                    mResult.add("Java");
                }
                else
                {
                    mResult.remove("Java");
                }
            }
        });


        mC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mC.isChecked())
                {
                    mResult.add("C");
                }
                else
                {
                    mResult.remove("C");
                }
            }
        });

        mPearl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mPearl.isChecked())
                {
                    mResult.add("Pearl");
                }
                else
                {
                    mResult.remove("Pearl");
                }
            }
        });

        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder stringBuilder=new StringBuilder();
                for(String s:mResult)
                    stringBuilder.append(s).append("\n");

                showText.setText(stringBuilder.toString());
                showText.setEnabled(false);
            }
        });



    }
}
