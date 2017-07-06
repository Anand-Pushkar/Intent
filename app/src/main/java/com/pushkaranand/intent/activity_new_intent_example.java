package com.pushkaranand.intent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class activity_new_intent_example extends AppCompatActivity {

    EditText etWebAddr;
    Button btnOpenLink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_intent_example);

        etWebAddr = (EditText)findViewById(R.id.et_newText);
        btnOpenLink = (Button)findViewById(R.id.btn_newButton);

        btnOpenLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String linkToGo = etWebAddr.getText().toString();
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(linkToGo));
                startActivity(i);
            }
        });


    }
}
