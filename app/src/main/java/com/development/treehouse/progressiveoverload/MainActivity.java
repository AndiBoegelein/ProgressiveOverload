package com.development.treehouse.progressiveoverload;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView welcomeText = (TextView) findViewById(R.id.txtWelcome);

        Button button = (Button) findViewById(R.id.btnContinue);

        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                welcomeText.setText(R.string.msg_click);
            }
        });
    }
}
