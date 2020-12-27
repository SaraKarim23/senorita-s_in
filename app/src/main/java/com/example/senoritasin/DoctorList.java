package com.example.senoritasin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class DoctorList extends AppCompatActivity {

    RecyclerView recyclerView;
    String s1[],s2[],s3[];
    int image[]={R.drawable.female_doc,R.drawable.female_doc,R.drawable.female_doc,R.drawable.female_doc,
            R.drawable.female_doc,R.drawable.female_doc,R.drawable.female_doc,
            R.drawable.female_doc,R.drawable.female_doc,R.drawable.female_doc,};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_list);

        recyclerView=findViewById(R.id.recycler_doctor);
        s1=getResources().getStringArray(R.array.female_doctors_list);
        s2=getResources().getStringArray(R.array.details);
        s3=getResources().getStringArray(R.array.appointment_number);

        DoctorListAdapter doctorListAdapter=new DoctorListAdapter(this, s1,s2,s3,image);

        recyclerView.setAdapter(doctorListAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


    }
}