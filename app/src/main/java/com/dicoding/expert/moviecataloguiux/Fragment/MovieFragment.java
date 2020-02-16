package com.dicoding.expert.moviecataloguiux.Fragment;


import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;

import com.dicoding.expert.moviecataloguiux.Activity.MovieDetail;
import com.dicoding.expert.moviecataloguiux.Adapter.MovieAdapter;
import com.dicoding.expert.moviecataloguiux.POJO.PojoMovie;
import com.dicoding.expert.moviecataloguiux.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class MovieFragment extends Fragment  {
    RecyclerView rvmovie;  //recylerview
    MovieAdapter movieAdapter;  //adapter movie

    //data array judul dan deaac
//    String[] desc = new String[](
//            "aaaaaaa.",
//            );

    int[] dataImage = new int[]{
            R.drawable.poster_a_star,
        R.drawable.poster_aquaman,
        R.drawable.poster_avengerinfinity,
        R.drawable.poster_birdbox,
        R.drawable.poster_bohemian,
        R.drawable.poster_bumblebee,
        R.drawable.poster_creed,
        R.drawable.poster_deadpool,
        R.drawable.poster_dragon,
        R.drawable.poster_dragonball


    };
    String[] datadesc = new String[]{
            "A musician helps a young singer find fame as age and alcoholism send his own career into a downward spiral.",
            "Arthur Curry, the human-born heir to the underwater kingdom of Atlantis, goes on a quest to prevent a war between the worlds of ocean and land.",
            "The Avengers and their allies must be willing to sacrifice all in an attempt to defeat the powerful Thanos before his blitz of devastation and ruin puts an end to the universe.",
            "Five years after an ominous unseen presence drives most of society to suicide, a mother and her two children make a desperate bid to reach safety.",
            "The story of the legendary rock band Queen and lead singer Freddie Mercury, leading up to their famous performance at Live Aid (1985).",
            "On the run in the year 1987, Bumblebee finds refuge in a junkyard in a small California beach town. On the cusp of turning 18 and trying to find her place in the world, Charlie Watson discovers Bumblebee, battle-scarred and broken.",
            "Under the tutelage of Rocky Balboa, newly crowned heavyweight champion Adonis Creed faces off against Viktor Drago, the son of Ivan Drago.",
            "Foul-mouthed mutant mercenary Wade Wilson (AKA. Deadpool), brings together a team of fellow mutant rogues to protect a young boy with supernatural abilities from the brutal, time-traveling cyborg, Cable.",
            "When Hiccup discovers Toothless isn\\'t the only Night Fury, he must seek The Hidden World, a secret Dragon Utopia before a hired tyrant named Grimmel finds it first.",
            "Goku and Vegeta encounter Broly, a Saiyan warrior unlike any fighter they\\'ve faced before."
    };

    String[] datajudul = new String[]{
            "A Star",
            "Aquaman",
        "Avenger Infinity",
        "Bird Box",
        "Boehemian",
        "Bumbelbee",
        "Creed II",
        "DeadPool",
        "How To Train Your Dragon III",
        "DragonBall Super: Brolly"

    };
    int[] datarating = new int[]{
            7,7,8,6,8,7,7,7,7,8
    };






    public MovieFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_movie, container, false);

        rvmovie = view.findViewById(R.id.rcmovie);
        rvmovie.setLayoutManager(new LinearLayoutManager(getActivity()));  // membuat data diurutkan ke bawah

        movieAdapter = new MovieAdapter(getActivity(),getListData());
        movieAdapter.notifyDataSetChanged();

        rvmovie.setAdapter(movieAdapter);
//        return inflater.inflate(R.layout.fragment_movie, container, false);

//        rvmovie.setOnClickListener(this);
        return view;
    }

    public ArrayList<PojoMovie> getListData() {
        ArrayList<PojoMovie> daftarmobil = new ArrayList<>();
        for (int i = 0; i < datajudul.length; i++) {
            daftarmobil.add(new PojoMovie( dataImage[i],datarating[i],datadesc[i],datajudul[i]));
        }
        return daftarmobil;
    }

//    @Override
//    public void onClick(View view) {
//        if(view == null){
//            Intent intent = new Intent(MovieFragment.this,MovieDetail);
//            intent.putExtra(MovieDetail.EXTRA_MOVIE,)
//        }
//
//    }


//    private void addItem(){
//        pojoMovieArrayList = new ArrayList<>();
//
//        for (int i = 0; i < namadata.length; i++) {
//
//            PojoMovie pojoMovie = new PojoMovie();
//            pojoMovie.setIvmovie(Photodata.getResourceId(i,-1));
//            pojoMovie.setTvjudul(namadata[i]);
//            pojoMovie.setTvdescmovie(Descriptiondata[i]);
//            pojoMovie.setTvrating(ratingdata[i]);
//            pojoMovieArrayList.add(pojoMovie);
//
//        }
//
//        movieAdapter.
//    }
//
//    private void prepare(){
//        namadata = getResources().getStringArray(R.array.data_title);
//        Descriptiondata = getResources().getStringArray(R.array.data_desc);
//        Photodata = getResources().obtainTypedArray(R.array.data_image);
//        ratingdata = getResources().getStringArray(R.array.data_rating);
//
//    }


}
