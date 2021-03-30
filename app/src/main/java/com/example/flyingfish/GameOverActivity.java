package com.example.flyingfish;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GameOverActivity extends AppCompatActivity {
    private Button startGameAgain;
    private TextView gameScore;
    private String scoregot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_over);
        startGameAgain=findViewById(R.id.play_again_button);
        gameScore=findViewById(R.id.score_text);
        scoregot=getIntent().getExtras().get("score").toString();
        startGameAgain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainIntent=new Intent(GameOverActivity.this,MainActivity.class);
                startActivity(mainIntent);
            }
        });
        gameScore.setText("Your Score ="+scoregot);
    }
}
