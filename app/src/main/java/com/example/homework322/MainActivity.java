package com.example.homework322;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
    private Button btn_switch;
    private RelativeLayout main_layout;
    private RelativeLayout eng_layout;
    private boolean main_lay = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        btn_switch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (main_lay) {
                    main_layout.setVisibility(View.GONE);
                    eng_layout.setVisibility(View.VISIBLE);
                    main_lay = false;
                    btn_switch.setText(getString(R.string.btn_switch));
                } else {
                    main_layout.setVisibility(View.VISIBLE);
                    eng_layout.setVisibility(View.GONE);
                    main_lay = true;
                    btn_switch.setText(getString(R.string.btn_switch_en));
                }
            }
        });
    }

    private void initView() {
        btn_switch = findViewById(R.id.btn_switch);
        main_layout = findViewById(R.id.main_layout);
        eng_layout = findViewById(R.id.eng_layout);
    }
}
