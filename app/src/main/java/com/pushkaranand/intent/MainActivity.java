package com.pushkaranand.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MyApp";
    Button button;
    Button button1;
    EditText etmain;
    EditText etnum1;
    EditText etnum2;
    String dataToSend;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button)findViewById(R.id.btn_button);
        button1 = (Button)findViewById(R.id.btn_button1);
        etmain = (EditText)findViewById(R.id.et_text);
        etnum1 = (EditText)findViewById(R.id.et_num1);
        etnum2 = (EditText)findViewById(R.id.et_num2);


        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                dataToSend = etmain.getText().toString();
                Integer num1 = Integer.valueOf(etnum1.getText().toString());
                Integer num2 = Integer.valueOf(etnum2.getText().toString());

                Intent i = new Intent(MainActivity.this,OtherActivity.class);
                i.putExtra("data",dataToSend);
                i.putExtra("num1",num1);
                i.putExtra("num2",num2);
                startActivity(i);
                //finish();  // To destroy the current activity. Note: destroy the activity at the end.


            }
        });

        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity.this,activity_new_intent_example.class);
                startActivity(i);

            }
        });



        Log.d(TAG, "onCreate: =======");
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.d(TAG, "onStart: =======");
    }

    @Override
    protected void onResume(){
        super.onResume();

        Log.d(TAG, "onResume: =======");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.d(TAG, "onPause: =======");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.d(TAG, "onStop: =======");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.d(TAG, "onCreate: =======");
    }
}
