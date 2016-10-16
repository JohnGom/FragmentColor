package com.herprogramacion.fragmentcolor;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements FragmentAzul.OnFragmentInteractionListener,
        FragmentVerde.OnFragmentInteractionListener, FragmentRojo.OnFragmentInteractionListener, FragmentAmarillo.OnFragmentInteractionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();


        switch (item.getItemId()) {
            case R.id.amarillo:
                Fragment currentFragment = getFragmentManager().findFragmentById(R.id.activity_main);
                FragmentAmarillo fragment = new FragmentAmarillo();
                if(currentFragment == null) {
                    transaction.add(R.id.activity_main, fragment);
                }else{
                    transaction.replace(R.id.activity_main, fragment);}
                transaction.commit();
                return true;
            case R.id.azul:
                Fragment currentFragment1 = getFragmentManager().findFragmentById(R.id.activity_main);
                FragmentAzul fragment1 = new FragmentAzul();
                if(currentFragment1 == null) {
                    transaction.add(R.id.activity_main, fragment1);
                }else{
                    transaction.replace(R.id.activity_main, fragment1);}
                transaction.commit();
                return true;
            case R.id.rojo:
                Fragment currentFragment2 = getFragmentManager().findFragmentById(R.id.activity_main);
                FragmentRojo fragment2 = new FragmentRojo();
                if(currentFragment2 == null) {
                    transaction.add(R.id.activity_main, fragment2);
                }else{
                    transaction.replace(R.id.activity_main, fragment2);}
                transaction.commit();
                return true;

            case R.id.verde:
                Fragment currentFragment3 = getFragmentManager().findFragmentById(R.id.activity_main);
                FragmentVerde fragment3 = new FragmentVerde();
                if(currentFragment3 == null) {
                    transaction.add(R.id.activity_main, fragment3);
                }else{
                    transaction.replace(R.id.activity_main, fragment3);}
                transaction.commit();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }


    public void onFragmentInteraction(Uri uri) {

    }
}
