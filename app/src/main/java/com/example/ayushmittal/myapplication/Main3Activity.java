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


    FragmentManager fragmentManager=getSupportFragmentManager();
    FragmentTransaction transaction= fragmentManager.beginTransaction();



    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {

            switch (item.getItemId()) {

                case R.id.navigation_three:
                    if(getSupportFragmentManager().findFragmentById(R.id.content)!=null) {
                        FragmentManager fragmentManager = getSupportFragmentManager();
                        FragmentTransaction transaction0 = fragmentManager.beginTransaction();
                        transaction0.remove(getSupportFragmentManager().findFragmentById(R.id.content)).commit();
                    }
                    FragmentManager fragmentManager22 = getSupportFragmentManager();
                    FragmentTransaction transaction22 = fragmentManager22.beginTransaction();

                    transaction22.replace(R.id.content,new threevareqn()).commit();


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



                    return true;
                case R.id.navigation_dashboard:
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
                    if(getSupportFragmentManager().findFragmentById(R.id.content)!=null) {
                       // FragmentManager fragmentManager = getSupportFragmentManager();
                        fragmentManager=getSupportFragmentManager();
                        FragmentTransaction transaction2 = fragmentManager.beginTransaction();

                        transaction2.remove(getSupportFragmentManager().findFragmentById(R.id.content)).commit();
                    }

                    FragmentManager fragmentManager12 = getSupportFragmentManager();
                    FragmentTransaction transaction12 = fragmentManager12.beginTransaction();

                    transaction12.replace(R.id.content,new developerfrag()).commit();
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);


        getSupportActionBar().setTitle("Calculation");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);


        if(getSupportFragmentManager().findFragmentById(R.id.content)!=null) {
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction transaction = fragmentManager.beginTransaction();

            transaction.remove(getSupportFragmentManager().findFragmentById(R.id.content)).commit();
        }
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();

        transaction.replace(R.id.content,new BlankFragment()).commit();


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:

                Intent intent = new Intent(Main3Activity.this, MainActivity.class);
                startActivity(intent);
                finish();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
