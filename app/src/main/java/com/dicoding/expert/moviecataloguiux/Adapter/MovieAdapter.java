package com.dicoding.expert.moviecataloguiux.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.dicoding.expert.moviecataloguiux.Fragment.MovieFragment;
import com.dicoding.expert.moviecataloguiux.POJO.PojoMovie;
import com.dicoding.expert.moviecataloguiux.R;

import java.util.ArrayList;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.ViewHolder> {

    Context context;
    ArrayList<PojoMovie> datamovie;

    public MovieAdapter(Context context, ArrayList<PojoMovie> datamovie) {
        this.context = context;
        this.datamovie = datamovie;
    }



    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_movie, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.setData(datamovie.get(position));

    }

    @Override
    public int getItemCount() {
        return datamovie.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView gambar;
        TextView judul,desc,rating;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            gambar = itemView.findViewById(R.id.ivImage);
            judul = itemView.findViewById(R.id.tvTitle);
            desc = itemView.findViewById(R.id.tvDesc);
            rating = itemView.findViewById(R.id.tvRating);
        }

        public void setData(PojoMovie pojoMovie){
            Glide.with(itemView).load(pojoMovie.getIvmovie()).into(gambar);
            judul.setText(pojoMovie.getTvjudul());
            desc.setText(pojoMovie.getTvdescmovie());
            rating.setText(String.valueOf(pojoMovie.getTvrating()));
        }
    }




}
