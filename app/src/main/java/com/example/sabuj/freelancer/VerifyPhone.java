package com.example.sabuj.freelancer;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/*

For each edit text, we write keylistner for all corresponding buttons, we did not write listener
for non neumeric buttons, so if anyone press those buttons they will not appear. We keep a flag
for each edittext named status which will indicate if there is any text in that edittext. If we
press on a button then the status flag will be set. If we press del button then the status flag
will clear. If the status flag is clear and someone press del again the we will focus previous one.

*/

public class VerifyPhone extends AppCompatActivity {

    private TextView tv_mobile_no;
    private EditText et_code1;
    private EditText et_code2;
    private EditText et_code3;
    private EditText et_code4;
    private EditText et_code5;
    private Button btn_continue;
    private Button btn_resend;

    private int status1 = 0;
    private int status2 = 0;
    private int status3 = 0;
    private int status4 = 0;
    private int status5 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify_phone);
        final Intent intent = getIntent();
        String mobile_no = intent.getExtras().getString("mobile_no");

        tv_mobile_no = (TextView) findViewById(R.id.verify_phone_tv_mobile_no);
        tv_mobile_no.setText(mobile_no);

        et_code1 = (EditText) findViewById(R.id.verify_phone_et_code1);
        et_code2 = (EditText) findViewById(R.id.verify_phone_et_code2);
        et_code3 = (EditText) findViewById(R.id.verify_phone_et_code3);
        et_code4 = (EditText) findViewById(R.id.verify_phone_et_code4);
        et_code5 = (EditText) findViewById(R.id.verify_phone_et_code5);
        btn_continue = (Button) findViewById(R.id.verify_phone_btn_continue);
        btn_resend = (Button) findViewById(R.id.verify_phone_btn_resend);

        et_code1.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if (event.getAction() == KeyEvent.ACTION_DOWN && event.getKeyCode() == KeyEvent.KEYCODE_DEL) {
                    et_code1.setText("");
                    return true;
                } else if (event.getAction() == KeyEvent.ACTION_DOWN && event.getKeyCode() == KeyEvent.KEYCODE_0) {
                    et_code1.setText("0");
                    et_code2.requestFocus();
                    status1 = 1;
                    return true;
                } else if (event.getAction() == KeyEvent.ACTION_DOWN && event.getKeyCode() == KeyEvent.KEYCODE_1) {
                    et_code1.setText("1");
                    et_code2.requestFocus();
                    status1 = 1;
                    return true;
                } else if (event.getAction() == KeyEvent.ACTION_DOWN && event.getKeyCode() == KeyEvent.KEYCODE_2) {
                    et_code1.setText("2");
                    et_code2.requestFocus();
                    status1 = 1;
                    return true;
                } else if (event.getAction() == KeyEvent.ACTION_DOWN && event.getKeyCode() == KeyEvent.KEYCODE_3) {
                    et_code1.setText("3");
                    et_code2.requestFocus();
                    status1 = 1;
                    return true;
                } else if (event.getAction() == KeyEvent.ACTION_DOWN && event.getKeyCode() == KeyEvent.KEYCODE_4) {
                    et_code1.setText("4");
                    et_code2.requestFocus();
                    status1 = 1;
                    return true;
                } else if (event.getAction() == KeyEvent.ACTION_DOWN && event.getKeyCode() == KeyEvent.KEYCODE_5) {
                    et_code1.setText("5");
                    et_code2.requestFocus();
                    status1 = 1;
                    return true;
                } else if (event.getAction() == KeyEvent.ACTION_DOWN && event.getKeyCode() == KeyEvent.KEYCODE_6) {
                    et_code1.setText("6");
                    et_code2.requestFocus();
                    status1 = 1;
                    return true;
                } else if (event.getAction() == KeyEvent.ACTION_DOWN && event.getKeyCode() == KeyEvent.KEYCODE_7) {
                    et_code1.setText("7");
                    et_code2.requestFocus();
                    status1 = 1;
                    return true;
                } else if (event.getAction() == KeyEvent.ACTION_DOWN && event.getKeyCode() == KeyEvent.KEYCODE_8) {
                    et_code1.setText("8");
                    et_code2.requestFocus();
                    status1 = 1;
                    return true;
                } else if (event.getAction() == KeyEvent.ACTION_DOWN && event.getKeyCode() == KeyEvent.KEYCODE_9) {
                    et_code1.setText("9");
                    et_code2.requestFocus();
                    status1 = 1;
                    return true;
                }
                return false;
            }
        });

        et_code2.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if (event.getAction() == KeyEvent.ACTION_DOWN && event.getKeyCode() == KeyEvent.KEYCODE_DEL) {
                    if (status2 == 1) {
                        et_code2.setText("");
                        status2 = 0;
                    } else {
                        et_code1.requestFocus();
                    }
                    return true;
                } else if (event.getAction() == KeyEvent.ACTION_DOWN && event.getKeyCode() == KeyEvent.KEYCODE_0) {
                    et_code2.setText("0");
                    et_code3.requestFocus();
                    status2 = 1;
                    return true;
                } else if (event.getAction() == KeyEvent.ACTION_DOWN && event.getKeyCode() == KeyEvent.KEYCODE_1) {
                    et_code2.setText("1");
                    et_code3.requestFocus();
                    status2 = 1;
                    return true;
                } else if (event.getAction() == KeyEvent.ACTION_DOWN && event.getKeyCode() == KeyEvent.KEYCODE_2) {
                    et_code2.setText("2");
                    et_code3.requestFocus();
                    status2 = 1;
                    return true;
                } else if (event.getAction() == KeyEvent.ACTION_DOWN && event.getKeyCode() == KeyEvent.KEYCODE_3) {
                    et_code2.setText("3");
                    et_code3.requestFocus();
                    status2 = 1;
                    return true;
                } else if (event.getAction() == KeyEvent.ACTION_DOWN && event.getKeyCode() == KeyEvent.KEYCODE_4) {
                    et_code2.setText("4");
                    et_code3.requestFocus();
                    status2 = 1;
                    return true;
                } else if (event.getAction() == KeyEvent.ACTION_DOWN && event.getKeyCode() == KeyEvent.KEYCODE_5) {
                    et_code2.setText("5");
                    et_code3.requestFocus();
                    status2 = 1;
                    return true;
                } else if (event.getAction() == KeyEvent.ACTION_DOWN && event.getKeyCode() == KeyEvent.KEYCODE_6) {
                    et_code2.setText("6");
                    et_code3.requestFocus();
                    status2 = 1;
                    return true;
                } else if (event.getAction() == KeyEvent.ACTION_DOWN && event.getKeyCode() == KeyEvent.KEYCODE_7) {
                    et_code2.setText("7");
                    et_code3.requestFocus();
                    status2 = 1;
                    return true;
                } else if (event.getAction() == KeyEvent.ACTION_DOWN && event.getKeyCode() == KeyEvent.KEYCODE_8) {
                    et_code2.setText("8");
                    et_code3.requestFocus();
                    status2 = 1;
                    return true;
                } else if (event.getAction() == KeyEvent.ACTION_DOWN && event.getKeyCode() == KeyEvent.KEYCODE_9) {
                    et_code2.setText("9");
                    et_code3.requestFocus();
                    status2 = 1;
                    return true;
                }
                return false;
            }
        });

        et_code3.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if (event.getAction() == KeyEvent.ACTION_DOWN && event.getKeyCode() == KeyEvent.KEYCODE_DEL) {
                    if (status3 == 1) {
                        et_code3.setText("");
                        status3 = 0;
                    } else {
                        et_code2.requestFocus();
                    }
                    return true;
                } else if (event.getAction() == KeyEvent.ACTION_DOWN && event.getKeyCode() == KeyEvent.KEYCODE_0) {
                    et_code3.setText("0");
                    et_code4.requestFocus();
                    status3 = 1;
                    return true;
                } else if (event.getAction() == KeyEvent.ACTION_DOWN && event.getKeyCode() == KeyEvent.KEYCODE_1) {
                    et_code3.setText("1");
                    et_code4.requestFocus();
                    status3 = 1;
                    return true;
                } else if (event.getAction() == KeyEvent.ACTION_DOWN && event.getKeyCode() == KeyEvent.KEYCODE_2) {
                    et_code3.setText("2");
                    et_code4.requestFocus();
                    status3 = 1;
                    return true;
                } else if (event.getAction() == KeyEvent.ACTION_DOWN && event.getKeyCode() == KeyEvent.KEYCODE_3) {
                    et_code3.setText("3");
                    et_code4.requestFocus();
                    status3 = 1;
                    return true;
                } else if (event.getAction() == KeyEvent.ACTION_DOWN && event.getKeyCode() == KeyEvent.KEYCODE_4) {
                    et_code3.setText("4");
                    et_code4.requestFocus();
                    status3 = 1;
                    return true;
                } else if (event.getAction() == KeyEvent.ACTION_DOWN && event.getKeyCode() == KeyEvent.KEYCODE_5) {
                    et_code3.setText("5");
                    et_code4.requestFocus();
                    status3 = 1;
                    return true;
                } else if (event.getAction() == KeyEvent.ACTION_DOWN && event.getKeyCode() == KeyEvent.KEYCODE_6) {
                    et_code3.setText("6");
                    et_code4.requestFocus();
                    status3 = 1;
                    return true;
                } else if (event.getAction() == KeyEvent.ACTION_DOWN && event.getKeyCode() == KeyEvent.KEYCODE_7) {
                    et_code3.setText("7");
                    et_code4.requestFocus();
                    status3 = 1;
                    return true;
                } else if (event.getAction() == KeyEvent.ACTION_DOWN && event.getKeyCode() == KeyEvent.KEYCODE_8) {
                    et_code3.setText("8");
                    et_code4.requestFocus();
                    status3 = 1;
                    return true;
                } else if (event.getAction() == KeyEvent.ACTION_DOWN && event.getKeyCode() == KeyEvent.KEYCODE_9) {
                    et_code3.setText("9");
                    et_code4.requestFocus();
                    status3 = 1;
                    return true;
                }
                return false;
            }
        });

        et_code4.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if (event.getAction() == KeyEvent.ACTION_DOWN && event.getKeyCode() == KeyEvent.KEYCODE_DEL) {
                    if (status4 == 1) {
                        et_code4.setText("");
                        status4 = 0;
                    } else {
                        et_code3.requestFocus();
                    }
                    return true;
                } else if (event.getAction() == KeyEvent.ACTION_DOWN && event.getKeyCode() == KeyEvent.KEYCODE_0) {
                    et_code4.setText("0");
                    et_code5.requestFocus();
                    status4 = 1;
                    return true;
                } else if (event.getAction() == KeyEvent.ACTION_DOWN && event.getKeyCode() == KeyEvent.KEYCODE_1) {
                    et_code4.setText("1");
                    et_code5.requestFocus();
                    status4 = 1;
                    return true;
                } else if (event.getAction() == KeyEvent.ACTION_DOWN && event.getKeyCode() == KeyEvent.KEYCODE_2) {
                    et_code4.setText("2");
                    et_code5.requestFocus();
                    status4 = 1;
                    return true;
                } else if (event.getAction() == KeyEvent.ACTION_DOWN && event.getKeyCode() == KeyEvent.KEYCODE_3) {
                    et_code4.setText("3");
                    et_code5.requestFocus();
                    status4 = 1;
                    return true;
                } else if (event.getAction() == KeyEvent.ACTION_DOWN && event.getKeyCode() == KeyEvent.KEYCODE_4) {
                    et_code4.setText("4");
                    et_code5.requestFocus();
                    status4 = 1;
                    return true;
                } else if (event.getAction() == KeyEvent.ACTION_DOWN && event.getKeyCode() == KeyEvent.KEYCODE_5) {
                    et_code4.setText("5");
                    et_code5.requestFocus();
                    status4 = 1;
                    return true;
                } else if (event.getAction() == KeyEvent.ACTION_DOWN && event.getKeyCode() == KeyEvent.KEYCODE_6) {
                    et_code4.setText("6");
                    et_code5.requestFocus();
                    status4 = 1;
                    return true;
                } else if (event.getAction() == KeyEvent.ACTION_DOWN && event.getKeyCode() == KeyEvent.KEYCODE_7) {
                    et_code4.setText("7");
                    et_code5.requestFocus();
                    status4 = 1;
                    return true;
                } else if (event.getAction() == KeyEvent.ACTION_DOWN && event.getKeyCode() == KeyEvent.KEYCODE_8) {
                    et_code4.setText("8");
                    et_code5.requestFocus();
                    status4 = 1;
                    return true;
                } else if (event.getAction() == KeyEvent.ACTION_DOWN && event.getKeyCode() == KeyEvent.KEYCODE_9) {
                    et_code4.setText("9");
                    et_code5.requestFocus();
                    status4 = 1;
                    return true;
                }
                return false;
            }
        });

        et_code5.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if (event.getAction() == KeyEvent.ACTION_DOWN && event.getKeyCode() == KeyEvent.KEYCODE_DEL) {
                    if (status5 == 1) {
                        et_code5.setText("");
                        status5 = 0;
                    } else {
                        et_code4.requestFocus();
                    }
                    return true;
                } else if (event.getAction() == KeyEvent.ACTION_DOWN && event.getKeyCode() == KeyEvent.KEYCODE_0) {
                    et_code5.setText("0");
                    status5 = 1;
                    return true;
                } else if (event.getAction() == KeyEvent.ACTION_DOWN && event.getKeyCode() == KeyEvent.KEYCODE_1) {
                    et_code5.setText("1");
                    status5 = 1;
                    return true;
                } else if (event.getAction() == KeyEvent.ACTION_DOWN && event.getKeyCode() == KeyEvent.KEYCODE_2) {
                    et_code5.setText("2");
                    status5 = 1;
                    return true;
                } else if (event.getAction() == KeyEvent.ACTION_DOWN && event.getKeyCode() == KeyEvent.KEYCODE_3) {
                    et_code5.setText("3");
                    status5 = 1;
                    return true;
                } else if (event.getAction() == KeyEvent.ACTION_DOWN && event.getKeyCode() == KeyEvent.KEYCODE_4) {
                    et_code5.setText("4");
                    status5 = 1;
                    return true;
                } else if (event.getAction() == KeyEvent.ACTION_DOWN && event.getKeyCode() == KeyEvent.KEYCODE_5) {
                    et_code5.setText("5");
                    status5 = 1;
                    return true;
                } else if (event.getAction() == KeyEvent.ACTION_DOWN && event.getKeyCode() == KeyEvent.KEYCODE_6) {
                    et_code5.setText("6");
                    status5 = 1;
                    return true;
                } else if (event.getAction() == KeyEvent.ACTION_DOWN && event.getKeyCode() == KeyEvent.KEYCODE_7) {
                    et_code5.setText("7");
                    status5 = 1;
                    return true;
                } else if (event.getAction() == KeyEvent.ACTION_DOWN && event.getKeyCode() == KeyEvent.KEYCODE_8) {
                    et_code5.setText("8");
                    status5 = 1;
                    return true;
                } else if (event.getAction() == KeyEvent.ACTION_DOWN && event.getKeyCode() == KeyEvent.KEYCODE_9) {
                    et_code5.setText("9");
                    status5 = 1;
                    return true;
                }
                return false;
            }
        });

        btn_continue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String key = et_code1.getText().toString() + et_code2.getText().toString() + et_code3.getText().toString()
                        + et_code4.getText().toString() + et_code5.getText().toString();

                //Toast.makeText(getApplicationContext(),key,Toast.LENGTH_LONG).show();
                Intent intent1 = new Intent(VerifyPhone.this,HomeActivity.class);
                startActivity(intent1);
            }
        });

        btn_resend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
