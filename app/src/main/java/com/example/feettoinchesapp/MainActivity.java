package com.example.feettoinchesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.feettoinchesapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        binding = ActivityMainBinding.inflate (getLayoutInflater ());
        setContentView (binding.getRoot ());

        convertingFeetToInches ();
    }

    private void convertingFeetToInches() {

        binding.feetConverterBtn.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                    String userValue = binding.inputFeet.getText ().toString ();
                    int value;
                    value = Integer.parseInt (userValue);
                    int afterCalculatingInches = value * 12;
                    Toast.makeText (MainActivity.this, "Inches is : " + afterCalculatingInches, Toast.LENGTH_LONG).show ();
            }
        });
    }
}