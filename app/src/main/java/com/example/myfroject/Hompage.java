package com.example.myfroject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Toast;

public class Hompage extends AppCompatActivity {

    RatingBar ratingBar;
    Spinner spinMakanan;
    Button btnSpin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hompage);

        ratingBar = findViewById(R.id.rating);
        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                Toast.makeText(Hompage.this, "Nilai"+rating, Toast.LENGTH_SHORT).show();
            }
        });
        btnSpin = findViewById(R.id.btn_spin);
        btnSpin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Hompage.this, ""+
                        spinMakanan.getSelectedItem().toString(), Toast.LENGTH_SHORT).show();
            }
        });

//        spinMakanan.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Toast.makeText(Hompage.this, "Anda Makan"+parent.getItemAtPosition(position), Toast.LENGTH_SHORT).show();
//            }
//        });
    }
}
