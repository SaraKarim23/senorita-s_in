package com.example.senoritasin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private CardView healthCard,parentCard,socialCard,careerCard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        healthCard = (CardView) findViewById(R.id.healthCardId);
        parentCard = (CardView) findViewById(R.id.parentCardId);
        socialCard = (CardView) findViewById(R.id.socialCardId);
        careerCard = (CardView) findViewById(R.id.careerCardId);


        ImageSlider imageSlider=findViewById(R.id.slider);
        List<SlideModel> slideModels=new ArrayList<>();
        slideModels.add(new SlideModel("https://image.freepik.com/free-vector/healthy-people-carrying-different-icons_53876-64658.jpg"));
        slideModels.add(new SlideModel("https://www.wilma.org.au/centre/wp-content/uploads/2018/07/home-slider_v2c.png"));
        slideModels.add(new SlideModel("https://www.holyrood.com/siteimg/big/ugc-1/fullnews/news/7272/6366_original.jpg"));
        slideModels.add(new SlideModel("https://aifs.gov.au/cfca/sites/default/files/styles/front_page_slider/public/featured5.png?itok=Og7pfBbx"));
        imageSlider.setImageList(slideModels,true);

        healthCard.setOnClickListener(this);
        parentCard.setOnClickListener(this);
        socialCard.setOnClickListener(this);
        careerCard.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent intent;
        switch (view.getId()){
            case R.id.healthCardId:
            {
                intent=new Intent(this,Health_In.class);
                startActivity(intent);
                break;
            }
            case R.id.parentCardId: {
                intent=new Intent(this, Parent_In.class);
                startActivity(intent);
                break;
            }
            case R.id.socialCardId: {
                intent=new Intent(this, Social_In.class);
                startActivity(intent);
                break;
            }
            case R.id.careerCardId: {
                intent = new Intent(this, Career_In.class);
                startActivity(intent);
                break;
            }

            default:break;
        }
    }
}
