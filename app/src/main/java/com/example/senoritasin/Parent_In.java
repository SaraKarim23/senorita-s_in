package com.example.senoritasin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Parent_In extends AppCompatActivity implements View.OnClickListener{
    private CardView parentingId,pregnencyId,deliveryId;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parent__in);
        pregnencyId = (CardView) findViewById(R.id.pregnencyId);
        deliveryId = (CardView) findViewById(R.id.deliveryID);
        parentingId = (CardView) findViewById(R.id.parentingId);

        parentingId.setOnClickListener(this);
        deliveryId.setOnClickListener(this);
        pregnencyId.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent;
        switch (view.getId()){
            case R.id.parentingId:
            {
                intent=new Intent(this,ParentingActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.deliveryID: {
                intent=new Intent(this, Delivery_Activity.class);
                startActivity(intent);
                break;
            }
            case R.id.pregnencyId: {
                intent=new Intent(this, Pregnancy_Activity.class);
                startActivity(intent);
                break;
            }

            default:break;
        }
    }
}