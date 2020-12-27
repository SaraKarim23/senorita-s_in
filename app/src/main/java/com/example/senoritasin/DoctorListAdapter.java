package com.example.senoritasin;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

public class DoctorListAdapter extends RecyclerView.Adapter<DoctorListAdapter.DoctorsViewHolder> {

    String data1[],data2[],data3[];
    Context context;
    int image[];
    public DoctorListAdapter(Context ct, String s1[], String s2[], String s3[],int img[]) {

        context=ct;
        data1=s1;
        data2=s2;
        data3=s3;
        image=img;
    }
    @NonNull
    @Override
    public DoctorsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(context);
        inflater.inflate(R.layout.doctor_list_item,parent,false);
        View view=inflater.inflate(R.layout.doctor_list_item,parent,false);
        return new DoctorsViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull DoctorsViewHolder holder, int position) {
        holder.text1.setText(data1[position]);
        holder.text2.setText(data2[position]);
        holder.text3.setText(data3[position]);
        holder.image.setImageResource(image[position]);
    }

    @Override
    public int getItemCount() {
        return image.length;
    }

    public static class DoctorsViewHolder extends RecyclerView.ViewHolder {
        TextView text1,text2,text3;
        ImageView image;

        public DoctorsViewHolder(@NonNull View itemView) {
            super(itemView);
            text1=itemView.findViewById(R.id.doctor_name_tv);
            text2=itemView.findViewById(R.id.detals_tv);
            text3=itemView.findViewById(R.id.contact_tv);
            image=itemView.findViewById(R.id.imageIv);
        }
    }
}
