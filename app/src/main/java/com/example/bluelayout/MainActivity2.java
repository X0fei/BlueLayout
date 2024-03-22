package com.example.bluelayout;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import com.example.bluelayout.models.User;

public class MainActivity2 extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button button4 = (Button) findViewById(R.id.button4);
        EditText name = (EditText) findViewById(R.id.name);
        EditText name2 = (EditText) findViewById(R.id.name2);
        Bundle arguments = getIntent().getExtras();
        User user;
        if(arguments!=null)
        {
            user = (User) arguments.getSerializable(User.class.getSimpleName());
            name.setText(user.getEmail());
            name2.setText(user.getPassword());
        }
        button4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(getBaseContext(), MainActivity3.class);
                startActivity(i);
            }
        });
    }
}