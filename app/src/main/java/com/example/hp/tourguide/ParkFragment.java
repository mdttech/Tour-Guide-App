package com.example.hp.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class ParkFragment extends Fragment {


    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        // Create a list of words
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(getString(R.string.first_park_place_title),
                getString(R.string.first_park_place_info),
                getString(R.string.first_park_place_address),
                getString(R.string.first_park_place_timing),
                getString(R.string.first_park_place_phone),
                R.drawable.first_park_place_image));

        places.add(new Place(getString(R.string.second_park_place_title),
                getString(R.string.second_park_place_info),
                getString(R.string.second_park_place_address),
                getString(R.string.second_park_place_timing),
                getString(R.string.second_park_place_phone),
                R.drawable.second_park_place_image));

        places.add(new Place(getString(R.string.third_park_place_title),
                getString(R.string.third_park_place_info),
                getString(R.string.third_park_place_address),
                getString(R.string.third_park_place_timing),
                getString(R.string.third_park_place_phone),
                R.drawable.third_park_place_image));

        places.add(new Place(getString(R.string.fourth_park_place_title),
                getString(R.string.fourth_park_place_info),
                getString(R.string.fourth_park_place_address),
                getString(R.string.fourth_park_place_timing),
                getString(R.string.fourth_park_place_phone),
                R.drawable.fourth_park_place_image));

        places.add(new Place(getString(R.string.fifth_park_place_title),
                getString(R.string.fifth_park_place_info),
                getString(R.string.fifth_park_place_address),
                getString(R.string.fifth_park_place_timing),
                getString(R.string.fifth_park_place_phone),
                R.drawable.fifth_park_place_image));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        PlaceAdapter
                adapter = new PlaceAdapter(getActivity(), places);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView
                listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

        return rootView;


    }


}
