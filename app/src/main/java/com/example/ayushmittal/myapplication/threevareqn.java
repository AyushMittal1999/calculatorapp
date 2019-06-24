package com.example.ayushmittal.myapplication;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link threevareqn.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * create an instance of this fragment.
 */
public class threevareqn extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";



    float a1,b1,c1,a2,b2,c2,d1,d2,x,y,z;
    EditText ea1,ea2,eb1,eb2,ec1,ec2,ed1,ed2;
    TextView tx,ty,tz,hel;
    Button solve1;
    EditText first , second , third ;



    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public threevareqn() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

         View v = inflater.inflate(R.layout.fragment_threevareqn, container, false);




        ea1=(EditText)v.findViewById(R.id.a1);
        eb1=(EditText)v.findViewById(R.id.b1);
        ec1=(EditText)v.findViewById(R.id.c1);
        ea2=(EditText)v.findViewById(R.id.a2);
        eb2=(EditText)v.findViewById(R.id.b2);
        ec2=(EditText)v.findViewById(R.id.c2);

        tx=(TextView)v.findViewById(R.id.valx);
        ty=(TextView)v.findViewById(R.id.valy);
        tz=(TextView) v.findViewById(R.id.valz);

        solve1 = (Button)v.findViewById(R.id.solve);
        hel = (TextView)v.findViewById(R.id.help) ;

        first = (EditText) v.findViewById(R.id.first_eqn);
        second = (EditText) v.findViewById(R.id.second_eqn);
        third = (EditText) v.findViewById(R.id.third_eqn);


    solve1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            try {


                Float va1 = Float.parseFloat(first.getText().toString().toUpperCase().split("X")[0]);
                Float vb1 = Float.parseFloat(first.getText().toString().toUpperCase().split("X")[1].split("Y")[0]);
                Float vc1 = Float.parseFloat(first.getText().toString().toUpperCase().split("X")[1].split("Y")[1].split("Z")[0]);
                Float vd1 = Float.parseFloat(first.getText().toString().toUpperCase().split("X")[1].split("Y")[1].split("Z")[1].split("=")[0]);


                Log.d("val", String.valueOf(a1) + " " + String.valueOf(b1) + " " + String.valueOf(c1) + " " + String.valueOf(d1));

                Float va2 = Float.parseFloat(second.getText().toString().toUpperCase().split("X")[0]);
                Float vb2 = Float.parseFloat(second.getText().toString().toUpperCase().split("X")[1].split("Y")[0]);
                Float vc2 = Float.parseFloat(second.getText().toString().toUpperCase().split("X")[1].split("Y")[1].split("Z")[0]);
                Float vd2 = Float.parseFloat(second.getText().toString().toUpperCase().split("X")[1].split("Y")[1].split("Z")[1].split("=")[0]);


                Float va3 = Float.parseFloat(third.getText().toString().toUpperCase().split("X")[0]);
                Float vb3 = Float.parseFloat(third.getText().toString().toUpperCase().split("X")[1].split("Y")[0]);
                Float vc3 = Float.parseFloat(third.getText().toString().toUpperCase().split("X")[1].split("Y")[1].split("Z")[0]);
                Float vd3 = Float.parseFloat(third.getText().toString().toUpperCase().split("X")[1].split("Y")[1].split("Z")[1].split("=")[0]);


                a1=(vb1*va2)-(vb2*va1);
                a2=(vb3*va2)-(vb2*va3);
                b1=(va2*vc1)-(vc2*va1);
                b2=(vc3*va2)-(vc2*va3);
                c1=(vd1*va2)-(vd2*va1);
                c2=(vd3*va2)-(vd2*va3);



                if(((b1*a2)-(b2*a1))==0)
                    if(((c2*a1)-(c1*a2))==0)
                    { hel.setText("INFINITELY MANY SOLUTION EXISTS");
                        tx.setText("--"); ty.setText("--");tz.setText("--");}
                    else
                    { hel.setText(" NO SOLUTION EXIST");  tx.setText("--"); ty.setText("--");}
                else {
                    y = ((c2 * a1) - (c1 * a2)) / ((b1 * a2) - (b2 * a1));
                    x = ((c2 * b1) - (c1 * b2)) / ((b2 * a1) - (b1 * a2));

                    ty.setText(String.valueOf(x));
                    tz.setText(String.valueOf(y));
                    tx.setText(String.valueOf(-1*((vb1*x+vc1*y+vd1)/va1)));
                    hel.setText("SOLVED !!");
                }

            }catch (Exception e){
                Snackbar.make(getView(),"Wrong Format of equation !!",Snackbar.LENGTH_LONG).show();
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
        void onFragmentInteraction(Uri uri);
    }
}
