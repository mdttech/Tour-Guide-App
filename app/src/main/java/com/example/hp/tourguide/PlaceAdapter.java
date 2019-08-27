package com.example.hp.tourguide;

import android.app.Activity;
import android.content.Context;
import android.location.Location;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class PlaceAdapter extends ArrayAdapter<Place> {

    /**
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     * @param context The current context. Used to inflate the layout file.
     * @param places  A List of Word objects to display in a list
     */


    public PlaceAdapter(Activity context, ArrayList<Place> places) {

        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for 4 TextViews and an ImageViewthe adapter is not
        //            // going to use this second argument, so it can be any value. Here, we used 0.
        //
        super(context, 0, places);
    }

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position    The position in the list of data that should be displayed in the
     *                    list item view.
     * @param convertView The recycled view to populate.
     * @param parent      The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Word} object located at this position in the list
        Place currentPlace = getItem(position);

        // Find the ImageView in the list_item.xml layout with the ID image.
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image_view);
        imageView.setImageResource(currentPlace.getImageResourceId());

        // Find the TextView in the list_item.xml layout with the ID title_text
        TextView titleTextView = (TextView) listItemView.findViewById(R.id.title_text);
        // Get the title from the current place object and
        // set this text on the title TextView
        titleTextView.setText(currentPlace.getTitle());

        // Find the TextView in the list_item.xml layout with the ID info_text
        TextView infoTextView = (TextView) listItemView.findViewById(R.id.info_text);
        // Get the info from the current place object and
        // set this text on the info TextView
        infoTextView.setText(currentPlace.getInfo());

        // Find the TextView in the list_item.xml layout with the ID address_text
        TextView addressTextView = (TextView) listItemView.findViewById(R.id.address_text);
        // Get the info from the current place object and
        // set this text on the info TextView
        addressTextView.setText(currentPlace.getAddress());
        // Check if an address is provided for this place or not
        if (currentPlace.hasAddress()){
            // If an address is available, display the provided address based on the resource ID
            addressTextView.setVisibility(View.VISIBLE);
        } else {
            addressTextView.setVisibility(View.GONE);
        }

        // Find the TextView in the list_item.xml layout with the ID timimg_text
        TextView timingTextView = (TextView) listItemView.findViewById(R.id.timing_text);
        // Get the timing from the current place object and
        // set this text on the timing TextView
        timingTextView.setText(currentPlace.getTiming());
        // Check if an address is provided for this place or not
        if (currentPlace.hasTiming()){
            // If an TIMING is available, display the provided TIMIMG based on the resource ID
           timingTextView.setVisibility(View.VISIBLE);
        } else {
            timingTextView.setVisibility(View.GONE);
        }

        // Find the TextView in the list_item.xml layout with the ID phone_text
        TextView phoneTextView = (TextView) listItemView.findViewById(R.id.phone_text);
        // Get the phone text from the current place object and
        // set this text on the phone TextView
        phoneTextView.setText(currentPlace.getPhone());
        // Check if an address is provided for this place or not
        if (currentPlace.hasPhone()){
            // If an phone is available, display the provided phone based on the resource ID
            phoneTextView.setVisibility(View.VISIBLE);
        } else {
            phoneTextView.setVisibility(View.GONE);
        }

        // Return the whole list item layout (containing 4 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;

    }
}
