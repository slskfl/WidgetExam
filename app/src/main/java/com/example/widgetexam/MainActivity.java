package com.example.widgetexam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    btnShow=findViewById(R.id.btnShow);
        btnWho=findViewById(R.id.btnWho);
        ivjeju=findViewById(R.id.ivjeju);

        btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ivjeju.setImageResource(R.drawable.jeju);
            }
        });

        btnWho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnWho.setText("버튼");
                btnWho.setTextColor(Color.YELLOW);
                btnShow.setEnabled(true);
            }
        });
    }
}
