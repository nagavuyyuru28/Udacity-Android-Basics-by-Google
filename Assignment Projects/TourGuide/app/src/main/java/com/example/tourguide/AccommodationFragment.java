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
public class AccommodationFragment extends Fragment {

    public AccommodationFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_view, container, false);

        //Create a list of accommodations
        final ArrayList<Location> accommodation = new ArrayList<>();
        accommodation.add(new Location( getString(R.string.accommodation_hyatt), getString(R.string.accommodation_description), R.drawable.accommodation_hyatt));
        accommodation.add(new Location(getString(R.string.accommodation_itc), getString(R.string.accommodation_description), R.drawable.accommodation_itc));
        accommodation.add(new Location(getString(R.string.accommodation_lemeridian), getString(R.string.accommodation_description), R.drawable.accommodation_lemeridien));
        accommodation.add(new Location(getString(R.string.accommodation_marriott), getString(R.string.accommodation_description), R.drawable.accommodation_marriott));
        accommodation.add(new Location(getString(R.string.accommodation_novotel), getString(R.string.accommodation_description), R.drawable.accommodation_novotel));
        accommodation.add(new Location(getString(R.string.accommodation_sheraton), getString(R.string.accommodation_description), R.drawable.accommodation_sheraton));
        accommodation.add(new Location(getString(R.string.accommodation_tajkrishna), getString(R.string.accommodation_description), R.drawable.accommodation_tajkrishna));
        accommodation.add(new Location(getString(R.string.accommodation_trident), getString(R.string.accommodation_description), R.drawable.accommodation_trident));

        // Create an {@link LocationAdapter}, whose data source is a list of {@link accommodation}s. The
        // adapter knows how to create list items for each item in the list.
        LocationAdapter adapter = new LocationAdapter(getActivity(), accommodation);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // list_view.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link LocationAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link accommodation} in the list.
        listView.setAdapter(adapter);

        return rootView;

    }
}
