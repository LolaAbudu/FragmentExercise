package org.pursuit.fragmentreviewexercise;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.pursuit.fragmentreviewexercise.fragments.MainFragment;
import org.pursuit.fragmentreviewexercise.fragments.NextFragment;

public class MainActivity extends AppCompatActivity{



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MainFragment mainFragment = MainFragment.newInstance();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.main_container, mainFragment);
        fragmentTransaction.commit();
    }

//    @Override
//    public void showFirstFragment(String text) {
//        getSupportFragmentManager().beginTransaction()
//                .replace(R.id.main_container, NextFragment.newInstance(""))
//                .addToBackStack(null)
//                .commit();
//    }
}
