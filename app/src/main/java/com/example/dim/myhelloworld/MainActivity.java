package com.example.dim.myhelloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String UserName = "User";
    public static final String Psw = "test";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void sendMessage (View view )
    {
        EditText editText = (EditText) findViewById(R.id.editText);
        EditText editText2 = (EditText) findViewById(R.id.editText2);
        String user = editText.getText().toString();
        String pass = editText2.getText().toString();
        if (UserName.equals(user) && Psw.equals(pass)){
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        startActivity(intent);
        }

    }
}
