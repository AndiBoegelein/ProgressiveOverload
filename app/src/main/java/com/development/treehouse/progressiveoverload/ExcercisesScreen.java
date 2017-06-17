package com.development.treehouse.progressiveoverload;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


/**
 * Created by andi- on 17.06.2017.
 */

public class ExcercisesScreen extends Activity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_exercises);

        Intent userNameFromCallingActivity = getIntent();

        String userName = userNameFromCallingActivity.getExtras().getString("userName");

        TextView userNameTV = (TextView) findViewById(R.id.tvUserName);
        userNameTV.setText(userName);
    }

    public void backToMenu(View view) {

        TextView userNameTv = (TextView) findViewById(R.id.tvUserName);
        String userName = String.valueOf(userNameTv.getText());

        Intent goingToMenu = new Intent();

        goingToMenu.putExtra("userName", userName);

        setResult(RESULT_OK, goingToMenu);

        finish();
    }
}
