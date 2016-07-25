package com.shravyagarlapati.android.flickster.adapters;

import android.content.Context;
import android.content.res.Configuration;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.shravyagarlapati.android.flickster.R;
import com.shravyagarlapati.android.flickster.models.Movie;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by shravyagarlapati on 7/20/16.
 */
public class MovieAdapter extends ArrayAdapter<Movie> {

    private static class ViewHolder {
        TextView title;
        TextView overview;
        ImageView posterImage;
        ImageView backdropImage;
    }

    public MovieAdapter(Context context, List<Movie> list){
            super(context, android.R.layout.simple_list_item_1, list);
        }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //Get the item
        Movie movie = getItem(position);

        //Check if existing view is being reused
        ViewHolder viewHolder; // view lookup cache stored in tag
        if(convertView == null) {
            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.item_movie, parent, false);

            viewHolder.title = (TextView) convertView.findViewById(R.id.tvTitle);
            viewHolder.overview = (TextView) convertView.findViewById(R.id.tvOverview);
            viewHolder.posterImage = (ImageView) convertView.findViewById(R.id.iVMovie);
            viewHolder.backdropImage = (ImageView) convertView.findViewById(R.id.iVMovie);
            convertView.setTag(viewHolder);
        }
        else
            viewHolder = (ViewHolder) convertView.getTag();

        viewHolder.posterImage.setImageResource(0);
        viewHolder.backdropImage.setImageResource(0);

        int orientation = getContext().getResources().getConfiguration().orientation;
        if(orientation == Configuration.ORIENTATION_LANDSCAPE || orientation == Configuration.ORIENTATION_PORTRAIT) {
            Log.d("Movie Rating:", movie.getOriginalTitle() +":"+movie.getAverageRating());
            if (movie.getAverageRating() > 5) {
                Picasso.with(getContext()).load(movie.getBackdropPath()).fit().centerInside()
                        .placeholder(R.drawable.movieimage).error(R.drawable.oops).into(viewHolder.backdropImage);
                viewHolder.title.setText("");
                viewHolder.overview.setText("");
            } else {
                Picasso.with(getContext()).load(movie.getPosterPath()).fit().centerInside()
                        .placeholder(R.drawable.movieimage).error(R.drawable.oops).into(viewHolder.posterImage);
                viewHolder.title.setText(movie.getOriginalTitle());
                viewHolder.overview.setText(movie.getOverview());
            }
        }

        /*
        int orientation = getContext().getResources().getConfiguration().orientation;
        if(orientation == Configuration.ORIENTATION_LANDSCAPE) {
            //Log.d("Backdroppath",movie.getBackdropPath());
            Picasso.with(getContext()).load(movie.getBackdropPath()).fit().centerInside()
                    .placeholder(R.drawable.movieimage).error(R.drawable.oops).into(viewHolder.backdropImage);
        }
        else if (orientation == Configuration.ORIENTATION_PORTRAIT) {
            //Log.d("Poster_",movie.getPosterPath());
            Picasso.with(getContext()).load(movie.getPosterPath()).fit().centerInside()
                    .placeholder(R.drawable.movieimage).error(R.drawable.oops).into(viewHolder.posterImage);
        }
        */

        return convertView;
    }



    /*
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //Get the item
        Movie movie = getItem(position);

        //Check if existing view is being reused
        if(convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.item_movie, parent, false);
        }

        //Find the image view
        ImageView imageView = (ImageView) convertView.findViewById(R.id.iVMovie);
        //Clear the image from convertview
        imageView.setImageResource(0);

        TextView tvTitle = (TextView) convertView.findViewById(R.id.tvTitle);
        TextView tvOverview = (TextView) convertView.findViewById(R.id.tvOverview);
        tvTitle.setText(movie.getOriginalTitle());
        tvOverview.setText(movie.getOverview());

        int orientation = getContext().getResources().getConfiguration().orientation;
        if(orientation == Configuration.ORIENTATION_LANDSCAPE) {
            //Log.d("Backdroppath",movie.getBackdropPath());
            Picasso.with(getContext()).load(movie.getBackdropPath()).into(imageView);
        }
        else if (orientation == Configuration.ORIENTATION_PORTRAIT) {
            //Log.d("Poster_",movie.getPosterPath());
            Picasso.with(getContext()).load(movie.getPosterPath()).into(imageView);
        }

        return convertView;
    }

    */



}
