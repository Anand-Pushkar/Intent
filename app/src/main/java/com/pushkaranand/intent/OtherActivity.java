package com.pushkaranand.intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class OtherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);

        String dataReceived = getIntent().getStringExtra("data");
        Integer num1 = getIntent().getIntExtra("num1",0);
        Integer num2 = getIntent().getIntExtra("num2",0);

        ((TextView)findViewById(R.id.tv_other)).setText(dataReceived);
        ((TextView)findViewById(R.id.tv_sum)).setText(""+(num1+num2));
    }
}
