package com.example.puzzlegame;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class ChooseDifficultActivity extends AppCompatActivity {

    private Button howToPlayBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_difficult);

        ImageButton imageButton1 = findViewById(R.id.btn1);
        ImageButton imageButton2 = findViewById(R.id.btn2);
        ImageButton imageButton3 = findViewById(R.id.btn3);
        howToPlayBtn = (Button) findViewById(R.id.howToPlayBtn);
        imageButtonClickListener imageButtonClickListener = new imageButtonClickListener();
        imageButton1.setOnClickListener(imageButtonClickListener);
        imageButton2.setOnClickListener(imageButtonClickListener);
        imageButton3.setOnClickListener(imageButtonClickListener);

        howToPlayBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialog();
            }
        });
    }
    private class imageButtonClickListener implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            Intent intent = new Intent();
            //Intent pupUpWindow = new Intent(ChooseDifficultActivity.this,PupUpWindowActivity.class);
            if(view.getId()== R.id.btn1)
            {
                intent = new Intent(ChooseDifficultActivity.this, GameActivity9.class);
                //pupUpWindow.putExtra("image", R.drawable.image3);
                //pupUpWindow.putExtra("difficult", R.string.begginer);
            }
            if(view.getId()== R.id.btn2)
            {
                intent = new Intent(ChooseDifficultActivity.this, GameActivity15.class);
                //pupUpWindow.putExtra("image", R.drawable.image1);
                //pupUpWindow.putExtra("difficult", R.string.amature);
            }
            if(view.getId()== R.id.btn3)
            {
                intent = new Intent(ChooseDifficultActivity.this, GameActivity24.class);
                //pupUpWindow.putExtra("image", R.drawable.image2);
                //pupUpWindow.putExtra("difficult", R.string.professional);
            }
            startActivity(intent);
        }
    }
    public void openDialog(){
        HowToPlayDialog howToPlayDialog = new HowToPlayDialog();
        howToPlayDialog.show(getSupportFragmentManager(), "how to play");
    }
}