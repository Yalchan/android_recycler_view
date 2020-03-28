package com.example.task6yhn17621653.view.holder;

import android.view.View;
import android.widget.TextView;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.task6yhn17621653.R;

public class MovieViewHolder extends RecyclerView.ViewHolder {
    private TextView textViewMovieTitle;
    private TextView textViewMovieGenre;
    private TextView textViewMovieYear;
    private ImageView imageViewPictureId;

    public MovieViewHolder(@NonNull View itemView) {
        super(itemView);
        this.textViewMovieTitle=itemView.findViewById(R.id.tv_movie_title);
        this.textViewMovieGenre=itemView.findViewById(R.id.tv_movie_genre);
        this.textViewMovieYear=itemView.findViewById(R.id.tv_movie_year);
        this.imageViewPictureId=itemView.findViewById(R.id.movieImage);
    }

    public TextView getTextViewMovieTitle() {
        return textViewMovieTitle;
    }

    public void setTextViewMovieTitle(String title) {
        this.textViewMovieTitle.setText(title);
    }

    public TextView getTextViewMovieGenre() {
        return textViewMovieGenre;
    }

    public void setTextViewMovieGenre(String genre) {
        this.textViewMovieGenre.setText(genre);
    }

    public TextView getTextViewMovieYear() {
        return textViewMovieYear;
    }

    public void setTextViewMovieYear(String year) {
        this.textViewMovieYear.setText(year);
    }

    public ImageView getImageViewPictureId() {
        return imageViewPictureId;
    }

    public void setImageViewPictureId(int imageViewPictureId) {
        this.imageViewPictureId.setImageResource(imageViewPictureId);
    }
}
