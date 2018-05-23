package com.example.sabuj.freelancer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FrontActivity extends AppCompatActivity {

    private Button btn_login_with_phone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_front);

        btn_login_with_phone = (Button)findViewById(R.id.activity_front_btn_login_with_phone_number);

        btn_login_with_phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FrontActivity.this,LogInActivity.class);
                startActivity(intent);
            }
        });
    }
}
