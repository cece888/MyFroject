package com.example.myfroject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.pm.PackageInfoCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    //buat object berupa edittext dan button
    EditText Username, Password;
    Button button;

    String username, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //lakukan proses dati binding
        Username = findViewById(R.id.txt_Username);
        Password = findViewById(R.id.txt_Password);
        button = findViewById(R.id.btn_button);

        username = "ujang";
        password = "ujang";

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Username.getText().toString().equals(username) && Password.getText().toString().equals(password)){
                    Intent intent = new Intent( Login.this, Hompage.class);
                }else{
                    Toast.makeText(Login.this, "username / Password Salah", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
