package com.example.task6yhn17621653;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.task6yhn17621653.adapter.MovieAdapter;
import com.example.task6yhn17621653.model.Movie;

import java.util.LinkedList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.recyclerView = this.findViewById(R.id.recycler_view_yhn);
        MovieAdapter movieAdapter = new MovieAdapter(createMovieList());
        recyclerView.setAdapter(movieAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private List<Movie> createMovieList() {
    List<Movie> movieList =  new LinkedList<>();

    Movie movieOne = new Movie(R.drawable.m1,"The Shawshank Redemption","Drama",1994);
    Movie movieTwo = new Movie(R.drawable.m2,"The Godfather","Crime, Drama ",1972);
    Movie movieThree = new Movie(R.drawable.m3,"The Godfather: Part II","Crime, Drama ",1974);
    Movie movieFour = new Movie(R.drawable.m4,"The Dark Knight","Action, Crime, Drama ",2008);
    Movie movieFive = new Movie(R.drawable.m5,"12 Angry Men","Drama ",1957);
    Movie movieSix = new Movie(R.drawable.m6,"Schindler's List","Biography, Drama, History",1993);
    Movie movieSeven = new Movie(R.drawable.m7,"The Lord of the Rings: The Return of the King","Adventure, Drama, Fantasy",2003);
    Movie movieEight = new Movie(R.drawable.m8,"Pulp Fiction","Crime, Drama ",1994);
    Movie movieNine = new Movie(R.drawable.m9,"Il buono, il brutto, il cattivo","Western",1966);
    Movie movieTen = new Movie(R.drawable.m10,"The Lord of the Rings: The Fellowship of the Ring","Action, Adventure, Drama ",2001);
    Movie movie11 = new Movie(R.drawable.m11,"Fight Club","Drama ",1999);
    movieList.add(movieOne);
        movieList.add(movieTwo);
        movieList.add(movieThree);
        movieList.add(movieFour);
        movieList.add(movieFive);
        movieList.add(movieSix);
        movieList.add(movieSeven);
        movieList.add(movieEight);
        movieList.add(movieNine);
        movieList.add(movieTen);
        movieList.add(movie11);
        return movieList;
    }

}
