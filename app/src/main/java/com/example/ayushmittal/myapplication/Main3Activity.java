package com.example.ayushmittal.myapplication;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {


    Button but;
    private TextView mTextMessage;
    FragmentManager fragmentManager=getSupportFragmentManager();
    FragmentTransaction transaction= fragmentManager.beginTransaction();


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {

            switch (item.getItemId()) {

                case R.id.navigation_three:
                    mTextMessage.setText("three equation mode");
                    if(getSupportFragmentManager().findFragmentById(R.id.content)!=null) {
                        FragmentManager fragmentManager = getSupportFragmentManager();
                        FragmentTransaction transaction0 = fragmentManager.beginTransaction();
                        transaction0.remove(getSupportFragmentManager().findFragmentById(R.id.content)).commit();
                    }
                    FragmentManager fragmentManager22 = getSupportFragmentManager();
                    FragmentTransaction transaction22 = fragmentManager22.beginTransaction();




                  return true;
                case R.id.navigation_home:
                    if(getSupportFragmentManager().findFragmentById(R.id.content)!=null) {
                        FragmentManager fragmentManager = getSupportFragmentManager();
                        FragmentTransaction transaction = fragmentManager.beginTransaction();

                        transaction.remove(getSupportFragmentManager().findFragmentById(R.id.content)).commit();
                    }
                    FragmentManager fragmentManager = getSupportFragmentManager();
                    FragmentTransaction transaction = fragmentManager.beginTransaction();

                    transaction.replace(R.id.content,new BlankFragment()).commit();


                    mTextMessage.setText("basic");

                    return true;
                case R.id.navigation_dashboard:
                    mTextMessage.setText("equation");
                    if(getSupportFragmentManager().findFragmentById(R.id.content)!=null) {
                        FragmentManager fragmentManager1 = getSupportFragmentManager();
                        FragmentTransaction transaction1 = fragmentManager1.beginTransaction();

                        transaction1.remove(getSupportFragmentManager().findFragmentById(R.id.content)).commit();
                    }
                    FragmentManager fragmentManager1 = getSupportFragmentManager();
                    FragmentTransaction transaction1 = fragmentManager1.beginTransaction();

                    transaction1.replace(R.id.content,new twovareqn()).commit();


                    return true;
                case R.id.navigation_notifications:
                    mTextMessage.setText("contact developer @  AYUSH MITTAL");
                    if(getSupportFragmentManager().findFragmentById(R.id.content)!=null) {
                       // FragmentManager fragmentManager = getSupportFragmentManager();
                        fragmentManager=getSupportFragmentManager();
                        FragmentTransaction transaction2 = fragmentManager.beginTransaction();

                        transaction2.remove(getSupportFragmentManager().findFragmentById(R.id.content)).commit();
                    }
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

            but=(Button)findViewById(R.id.but);
        transaction.replace(R.id.content,new BlankFragment()).commit();
                    but.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent a=new Intent(Main3Activity.this,MainActivity.class);
                            startActivity(a);

                        }
                    });

    }

}
