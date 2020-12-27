package com.example.senoritasin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Health_In extends AppCompatActivity implements View.OnClickListener{

    private CardView doctorAppoinment,beautyTips,mentalHealth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health__in);

        doctorAppoinment = (CardView) findViewById(R.id.dr_appId);
        mentalHealth = (CardView) findViewById(R.id.m_health_Id);
        beautyTips = (CardView) findViewById(R.id.beauty_tipsId);

        doctorAppoinment.setOnClickListener(this);
        mentalHealth.setOnClickListener(this);
        beautyTips.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
            Intent intent;
            switch (view.getId()){
                case R.id.dr_appId:
                {
                    intent=new Intent(this,DoctorList.class);
                    startActivity(intent);
                    break;
                }
                case R.id.m_health_Id: {
                    intent=new Intent(this, Mental_health.class);
                    startActivity(intent);
                    break;
                }
                case R.id.beauty_tipsId: {
                    intent=new Intent(this, BeautyTipsActivity.class);
                    startActivity(intent);
                    break;
                }

                default:break;
            }
        }
    }