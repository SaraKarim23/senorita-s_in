package com.example.senoritasin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Career_In extends AppCompatActivity implements View.OnClickListener{

    private CardView jobsIn,expertInCard,jobPreparationCard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_career__in);

        jobsIn = (CardView) findViewById(R.id.jobsIn_cardId);
        expertInCard = (CardView) findViewById(R.id.expart_cardId);
        jobPreparationCard = (CardView) findViewById(R.id.preparationID);

        jobsIn.setOnClickListener(this);
        expertInCard.setOnClickListener(this);
        jobPreparationCard.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent;
        switch (view.getId()) {
            case R.id.jobsIn_cardId: {
                intent = new Intent(this, JobIn_Activity.class);
                startActivity(intent);
                break;
            }
            default:
                break;
        }
    }
}