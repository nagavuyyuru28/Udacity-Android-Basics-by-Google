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
public class ParksFragment extends Fragment {

    public ParksFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_view, container, false);

        //Create a list of parks
        final ArrayList<Location> parks = new ArrayList<>();
        parks.add(new Location(getString(R.string.park_zoopark), getString(R.string.park_zoo), R.drawable.park_nehruzoologicalpark));
        parks.add(new Location(getString(R.string.park_oceanpark), getString(R.string.park_water), R.drawable.park_oceanpark));
        parks.add(new Location(getString(R.string.park_wonderla), getString(R.string.park_amusement), R.drawable.park_wonderla));
        parks.add(new Location(getString(R.string.park_wildwaters), getString(R.string.park_water), R.drawable.park_wildwaters));

        // Create an {@link LocationAdapter}, whose data source is a list of {@link park}s. The
        // adapter knows how to create list items for each item in the list.
        LocationAdapter adapter = new LocationAdapter(getActivity(), parks);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // list_view.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link LocationAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link park} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }
}
