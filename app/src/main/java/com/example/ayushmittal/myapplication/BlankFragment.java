package com.example.ayushmittal.myapplication;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class BlankFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    Button add,subtract,multi,divide;
    TextView result;
    EditText edit1,edit2;
    float num1,num2,res;



    public BlankFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.fragment_blank, container, false);



        result = (TextView)v.findViewById(R.id.txt1);
        add=(Button)v.findViewById(R.id.plus);
        subtract=(Button)v.findViewById(R.id.minus);
        multi=(Button)v.findViewById(R.id.multiply);
        divide=(Button)v.findViewById(R.id.divide);

        edit1=(EditText)v.findViewById(R.id.edit1);
        edit2=(EditText)v.findViewById(R.id.edit2);


        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=Float.parseFloat(edit1.getText().toString());
                num2=Float.parseFloat(edit2.getText().toString());
                res=num1+num2;
                result.setText(String.valueOf(res));
            }
        });


        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=Float.parseFloat(edit1.getText().toString());
                num2=Float.parseFloat(edit2.getText().toString());
                res=num1-num2;
                result.setText(String.valueOf(res));
            }
        });


        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=Float.parseFloat(edit1.getText().toString());
                num2=Float.parseFloat(edit2.getText().toString());
                res=num1*num2;
                result.setText(String.valueOf(res));
            }
        });


        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=Float.parseFloat(edit1.getText().toString());
                num2=Float.parseFloat(edit2.getText().toString());

               float resu=num1/num2;
                result.setText(String.valueOf(resu));
            }
        });


        return v;
    }
}
