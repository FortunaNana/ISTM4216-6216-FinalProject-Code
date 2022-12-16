package com.example.finalproject;

import android.app.Activity;
import android.app.assist.AssistStructure;
import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class ShopActivity extends Activity {
    RadioGroup radioGroup1;
    RadioButton radioButton1;
    RadioGroup radioGroup2;
    RadioButton radioButton2;
    RadioGroup radioGroup3;
    RadioButton radioButton3;
    RadioGroup radioGroup4;
    RadioButton radioButton4;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop);
        radioGroup1 = findViewById(R.id.skinRadioGroup1);
        radioGroup2 = findViewById(R.id.skinRadioGroup2);
        radioGroup3 = findViewById(R.id.skinRadioGroup3);
        radioGroup4 = findViewById(R.id.skinRadioGroup4);


    }
    public void CheckOut(View view){
        Intent intent=new Intent(ShopActivity.this, CheckActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
        startActivity(intent);
    }

    public void previousLayout(View view){
        Intent intent=new Intent(ShopActivity.this, HomeActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
        startActivity(intent);
    }

    public void checkButton1(View v) {
        int radioId = radioGroup1.getCheckedRadioButtonId();
        radioButton1 = findViewById(radioId);

            Toast.makeText(this, "Selected Product: " + radioButton1.getText(),
                    Toast.LENGTH_SHORT).show();

    }
    public void checkButton2(View v) {
        int radioId2 = radioGroup2.getCheckedRadioButtonId();
        radioButton2 = findViewById(radioId2);
        Toast.makeText(this, "Selected Product: " + radioButton2.getText(),
                Toast.LENGTH_SHORT).show();
    }
    public void checkButton3(View v) {
        int radioId3 = radioGroup3.getCheckedRadioButtonId();
        radioButton3 = findViewById(radioId3);
        Toast.makeText(this, "Selected Product: " + radioButton3.getText(),
                Toast.LENGTH_SHORT).show();
    }
    public void checkButton4(View v) {
        int radioId4 = radioGroup4.getCheckedRadioButtonId();
        radioButton4 = findViewById(radioId4);
        Toast.makeText(this, "Selected Product: " + radioButton4.getText(),
                Toast.LENGTH_SHORT).show();
    }

    }




