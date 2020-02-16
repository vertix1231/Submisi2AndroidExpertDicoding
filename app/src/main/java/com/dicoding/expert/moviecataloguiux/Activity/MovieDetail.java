package com.dicoding.expert.moviecataloguiux.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.dicoding.expert.moviecataloguiux.POJO.PojoMovie;
import com.dicoding.expert.moviecataloguiux.R;

public class MovieDetail extends AppCompatActivity {

    private TextView tvjudul,tvdesc,tvrating;
    private ImageView ivgambar;

    String judul,desc,rating;
    int Gambar;

    public static final String EXTRA_MOVIE = "extra_movie";
    private PojoMovie pojoMovie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_detail);

        tvjudul = findViewById(R.id.tv_item_title);
        tvdesc = findViewById(R.id.tv_item_overview);
        ivgambar = findViewById(R.id.poster);
        tvrating = findViewById(R.id.tv_item_userScore);
    }
}
