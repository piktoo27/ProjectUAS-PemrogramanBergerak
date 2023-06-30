package com.example.quranapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.quranapp.Models.AyatModel.VersesItem;
import com.example.quranapp.Models.TerjemahanModel.TranslateItem;

import java.util.List;

public class AdapterAyat extends RecyclerView.Adapter<AdapterAyat.ViewHolder>{
    private static List<VersesItem> list1;
    private static List<TranslateItem> list2;
    public AdapterAyat(List<VersesItem> list1, List<TranslateItem> list2){
        this.list1 = list1;
        this.list2 = list2;
    }
    @NonNull
    @Override
    public AdapterAyat.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(
                LayoutInflater.from(parent.getContext()).inflate(R.layout.ayat, parent, false)
        );
    }
    @Override
    public void onBindViewHolder(@NonNull AdapterAyat.ViewHolder holder, int position) {
        VersesItem list = list1.get(position);
        TranslateItem list_ = list2.get(position);

        holder.textViewAyat.setText(list.getTextUthmani());
        holder.textViewTerjemahanAyat.setText(list_.getText());
        holder.textViewNomorAyat.setText(String.valueOf(position + 1));
    }
    @Override
    public int getItemCount() {
        return list2.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView textViewAyat, textViewNomorAyat, textViewTerjemahanAyat;

        public ViewHolder(View itemView){
            super(itemView);

            textViewAyat = itemView.findViewById(R.id.tvAyat);
            textViewNomorAyat = itemView.findViewById(R.id.tvNomorAyat);
            textViewTerjemahanAyat = itemView.findViewById(R.id.tvTerjemahanAyat);
        }
    }
    public void setData(List<VersesItem> data, List<TranslateItem> data1) {
        // Ayat
        list1.clear();
        list1.addAll(data);
        // Terjemahan
        list2.clear();
        list2.addAll(data1);
        notifyDataSetChanged();
    }

}
