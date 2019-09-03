package com.example.basiccalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etNum1;
    EditText etNum2;
    Button btnMult;
    Button btnadd;
    TextView tvResult;
    String oper = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNum1=(EditText)findViewById(R.id.etNum1);
        etNum2=(EditText)findViewById(R.id.etNum2);
        btnMult=(Button)findViewById(R.id.btnMult);
        btnadd=(Button)findViewById(R.id.btnadd);
        tvResult=(TextView)findViewById(R.id.tvResult);

        btnMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float num1=0;
                float num2=0;
                float result=0;

                if (TextUtils.isEmpty(etNum1.getText().toString()) || TextUtils.isEmpty(etNum2.getText().toString())){
                    return;
                }
                num1=Float.parseFloat(etNum1.getText().toString());
                num2=Float.parseFloat(etNum2.getText().toString());
                switch (v.getId())
                {
                    case R.id.btnMult:
                    oper="*";
                    result=num1*num2;
                    break;
                    default:
                        break;

                }
                tvResult.setText("Result = "+ result);
            }
        });
        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float num1=0;
                float num2=0;
                float result=0;

                if (TextUtils.isEmpty(etNum1.getText().toString()) || TextUtils.isEmpty(etNum2.getText().toString())){
                    return;
                }
                num1=Float.parseFloat(etNum1.getText().toString());
                num2=Float.parseFloat(etNum2.getText().toString());
                switch (v.getId())
                {
                    case R.id.btnadd:
                        oper="+";
                        result=num1+num2;
                        break;
                    default:
                        break;

                }
                tvResult.setText("Result = "+result);
            }
        });

    }
}
