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

public class twovareqn extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;


    float a1,b1,c1,a2,b2,c2,x,y;
    EditText ea1,ea2,eb1,eb2,ec1,ec2;
    TextView tx,ty,hel;
    Button solve1;
    private OnFragmentInteractionListener mListener;

    public twovareqn() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View v = inflater.inflate(R.layout.fragment_twovareqn, container, false);

            ea1=(EditText)v.findViewById(R.id.a1);
            eb1=(EditText)v.findViewById(R.id.b1);
            ec1=(EditText)v.findViewById(R.id.c1);
            ea2=(EditText)v.findViewById(R.id.a2);
            eb2=(EditText)v.findViewById(R.id.b2);
            ec2=(EditText)v.findViewById(R.id.c2);

            tx=(TextView)v.findViewById(R.id.valx);
            ty=(TextView)v.findViewById(R.id.valy);

            solve1 = (Button)v.findViewById(R.id.solve);
            hel = (TextView)v.findViewById(R.id.help) ;

            solve1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {



                    a1=Float.parseFloat(ea1.getText().toString());
                    a2=Float.parseFloat(ea2.getText().toString());
                    b1=Float.parseFloat(eb1.getText().toString());
                    b2=Float.parseFloat(eb2.getText().toString());
                    c1=Float.parseFloat(ec1.getText().toString());
                    c2=Float.parseFloat(ec2.getText().toString());


                    c1=-1*c1;
                    c2=-1*c2;

                    if(((b1*a2)-(b2*a1))==0)
                        if(((c2*a1)-(c1*a2))==0)
                          { hel.setText("INFINITELY MANY SOLUTION EXISTS");
                            tx.setText("--"); ty.setText("--");}
                        else
                          { hel.setText(" NO SOLUTION EXIST");  tx.setText("--"); ty.setText("--");}
                    else {
                        y = ((c2 * a1) - (c1 * a2)) / ((b1 * a2) - (b2 * a1));
                        x = ((c2 * b1) - (c1 * b2)) / ((b2 * a1) - (b1 * a2));

                        tx.setText(String.valueOf(x));
                        ty.setText(String.valueOf(y));
                        hel.setText("SOLVED !!");
                    }
                }
            });


        return v;
    }

    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }



    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
