package com.example.yvtc.my032304;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout layout = new LinearLayout(MainActivity.this);
        layout.setOrientation(LinearLayout.VERTICAL);
        //設定layout寬度 高度 比重
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT,1);

        Button btn = new Button(MainActivity.this);
        btn.setText("Click ME");
        btn.setLayoutParams(params);
        layout.addView(btn);

        Button btn2 = new Button(MainActivity.this);
        btn2.setText("BTN2");
        btn2.setLayoutParams(params);
        layout.addView(btn2);

        Button btn3 = new Button(MainActivity.this);
        btn3.setText("BTN3");
        btn3.setLayoutParams(params);
        layout.addView(btn3);
        setContentView(layout);
    }
}
