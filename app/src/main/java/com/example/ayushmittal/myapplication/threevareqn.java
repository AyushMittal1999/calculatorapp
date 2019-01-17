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


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link threevareqn.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link threevareqn#newInstance} factory method to
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



    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public threevareqn() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment threevareqn.
     */
    // TODO: Rename and change types and number of parameters
    public static threevareqn newInstance(String param1, String param2) {
        threevareqn fragment = new threevareqn();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
         View v = inflater.inflate(R.layout.fragment_threevareqn, container, false);




        ea1=(EditText)v.findViewById(R.id.a1);
        eb1=(EditText)v.findViewById(R.id.b1);
        ec1=(EditText)v.findViewById(R.id.c1);
        ea2=(EditText)v.findViewById(R.id.a2);
        eb2=(EditText)v.findViewById(R.id.b2);
        ec2=(EditText)v.findViewById(R.id.c2);
        ed1=(EditText)v.findViewById((R.id.d1));
        ed2=(EditText)v.findViewById(R.id.d2);
        tx=(TextView)v.findViewById(R.id.valx);
        ty=(TextView)v.findViewById(R.id.valy);

        solve1 = (Button)v.findViewById(R.id.solve);
        hel = (TextView)v.findViewById(R.id.help) ;

        float A1= Float.parseFloat(ea1.getText().toString());
        float B1= Float.parseFloat((eb1.getText().toString()));
        float C1 = Float.parseFloat(ec1.getText().toString());




                return v;
    }

    // TODO: Rename method, update argument and hook method into UI event
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
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
