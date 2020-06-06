package com.example.tourguide;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class RestaurantsFragment extends Fragment {

    public RestaurantsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_view, container, false);

        final ArrayList<Location> restaurants = new ArrayList<>();
        restaurants.add(new Location(getString(R.string.restaurant_broadway), getString(R.string.restaurant_casualbrew), R.drawable.restaurant_broadway));
        restaurants.add(new Location(getString(R.string.restaurant_olivebistro), getString(R.string.restaurant_cafe), R.drawable.restaurant_olivebistro));
        restaurants.add(new Location(getString(R.string.restaurant_10downing), getString(R.string.restaurant_casualbar), R.drawable.restaurant_10downing));
        restaurants.add(new Location(getString(R.string.restaurant_abs), getString(R.string.restaurant_casualdining), R.drawable.restaurant_abs));
        restaurants.add(new Location(getString(R.string.restaurant_jewelofnizam), getString(R.string.restaurant_casualbar), R.drawable.restaurant_jewelofnizam));
        restaurants.add(new Location(getString(R.string.restaurant_ohris), getString(R.string.restaurant_casualdining), R.drawable.restaurant_ohris));
        restaurants.add(new Location(getString(R.string.restaurant_paradise ), getString(R.string.restaurant_casualdining), R.drawable.restaurant_paradise));
        restaurants.add(new Location(getString(R.string.restaurant_unitedkitchensofindia), getString(R.string.restaurant_cafe), R.drawable.restaurant_unitedkitchens));

        // Create an {@link LocationAdapter}, whose data source is a list of {@link restaurant}s. The
        // adapter knows how to create list items for each item in the list.
        LocationAdapter adapter = new LocationAdapter(getActivity(), restaurants);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // list_view.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link LocationAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link restaurant} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }
}
