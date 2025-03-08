package com.example.communitypaint;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });



    }

    public void onBtnClick(View view){
        TextView name = findViewById(R.id.firstNamePrint);
        EditText firstName = findViewById(R.id.firstNameTextInput);
        name.setText(firstName.getText().toString());

        TextView name2 = findViewById(R.id.secondNamePrint);
        EditText lastName = findViewById(R.id.secondNameTextInput);
        name2.setText(lastName.getText().toString());

        TextView name3 = findViewById(R.id.emailPrint);
        EditText email = findViewById(R.id.emailTextInput);
        name3.setText(email.getText().toString());
    }
}