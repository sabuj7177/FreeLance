package com.example.sabuj.freelancer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class LogInActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    String[] countryNames={"+54","+880","+55","+33"};
    int flags[] = {R.drawable.ar, R.drawable.bd, R.drawable.br, R.drawable.fr};

    String finalSelectedCode;

    private Spinner spnr_codes;
    private EditText et_phone;
    private Button btn_done;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        et_phone = (EditText)findViewById(R.id.login_et_phone);
        btn_done = (Button)findViewById(R.id.login_btn_done);
        spnr_codes = (Spinner) findViewById(R.id.login_spinner);
        spnr_codes.setOnItemSelectedListener(LogInActivity.this);

        CustomAdapterSpinnerCountry customAdapter=new CustomAdapterSpinnerCountry(getApplicationContext(),flags,countryNames);
        spnr_codes.setAdapter(customAdapter);

        btn_done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mobile_no = finalSelectedCode+et_phone.getText().toString();
              //  Toast.makeText(getApplicationContext(), mobile_no, Toast.LENGTH_LONG).show();
                Intent i = new Intent(LogInActivity.this, VerifyPhone.class);
                i.putExtra("mobile_no", mobile_no);
                startActivity(i);
            }
        });

    }

    @Override
    public void onItemSelected(AdapterView<?> arg0, View arg1, int position, long id) {
        finalSelectedCode = countryNames[position];
    }

    @Override
    public void onNothingSelected(AdapterView<?> arg0) {
    }
}
