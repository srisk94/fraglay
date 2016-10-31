package com.srima.fragmentlayouts;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void selectFrag(View view) {

        Fragment fr;

        if(view == findViewById(R.id.btn2)) {
            fr = new fragment2();

        }else if(view == findViewById(R.id.btn3)){
            fr = new fragment3();

        }else if(view == findViewById(R.id.btn1)){
            fr=new fragment1();
        }else{
            fr=new fragm();
        }

        FragmentManager fm = getFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.frag, fr);
        fragmentTransaction.commit();

    }
}
