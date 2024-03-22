package com.example.bluelayout;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import com.example.bluelayout.models.User;

public class MainActivity3 extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Button button3 = findViewById(R.id.button3);
        Button but = findViewById(R.id.but);
        EditText name2Text = findViewById(R.id.name2);
        String password = name2Text.getText().toString();
        EditText name3Text = findViewById(R.id.name3);
        String confirmPassword = name3Text.getText().toString();
        button3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent i;
                EditText name2Text = findViewById(R.id.name2);
                EditText name4Text = findViewById(R.id.name4);
                EditText name5Text = findViewById(R.id.name5);
                EditText name3Text = findViewById(R.id.name3);
                String email = name4Text.getText().toString();
                String password = name2Text.getText().toString();
                String name = name5Text.getText().toString();
                String confirmPassword = name3Text.getText().toString();
                if (name2Text.getText().toString().equals(name3Text.getText().toString()))
                {
                    User user = new User(email, password, name, confirmPassword);
                    i = new Intent(getBaseContext(), MainActivity2.class);
                    i.putExtra(User.class.getSimpleName(), user);
                    startActivity(i);
                }
            }
        });
        but.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent b;
                b = new Intent(getBaseContext(),MainActivity2.class);
                startActivity(b);
            }
        });
    }
}