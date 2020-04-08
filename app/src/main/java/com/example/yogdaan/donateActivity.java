package com.example.yogdaan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class donateActivity extends AppCompatActivity {
    private Button donateMoneyBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donate);

        donateMoneyBtn=(Button)findViewById(R.id.donate_money_btn);

        donateMoneyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(donateActivity.this,PaymentActivity.class);
                startActivity(intent);
            }
        });
    }
}
