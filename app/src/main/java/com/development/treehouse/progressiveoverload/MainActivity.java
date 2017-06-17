package com.development.treehouse.progressiveoverload;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    Button button;
    EditText userName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.btnEnterUserName);

        userName = (EditText) findViewById(R.id.etUserName);
    }

    public void onEnterUserName(View view) {
        Toast toast = Toast.makeText(this, userName.getText(), Toast.LENGTH_SHORT);
        toast.show();

        Intent getExercisesScreenIntent = new Intent(this, ExcercisesScreen.class);

        getExercisesScreenIntent.putExtra("userName", userName.getText());
        startActivity(getExercisesScreenIntent);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        TextView userNameTV = (TextView) findViewById(R.id.tvUserName);
        String nameSentBack = data.getStringExtra("userName");

        userNameTV.append(nameSentBack);
    }
}
