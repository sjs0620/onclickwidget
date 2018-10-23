package com.sjs.edu.onclickwidget;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onclickwidget1(View view){
        String str = "button1을 클릭하였습니다.";
        Toast.makeText(view.getContext(),str,Toast.LENGTH_SHORT).show();
    }
    public void onclickwidget2(View view){
        String str = "button2를 클릭하였습니다.";
        Toast.makeText(view.getContext(),str,Toast.LENGTH_SHORT).show();
    }
}
