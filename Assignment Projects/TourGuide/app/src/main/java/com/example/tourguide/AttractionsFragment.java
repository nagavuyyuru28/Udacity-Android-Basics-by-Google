package com.example.tourguide;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class AttractionsFragment extends Fragment {

    public AttractionsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       View rootView = inflater.inflate(R.layout.list_view, container, false);

        //Create a list of attractions
       final ArrayList<Location> attractions = new ArrayList<>();
       attractions.add(new Location(getString(R.string.attraction_charminar), getString(R.string.attraction_historical), R.drawable.attraction_charminar));
       attractions.add(new Location(getString(R.string.attraction_golconda), getString(R.string.attraction_historical), R.drawable.attraction_golconda));
       attractions.add(new Location(getString(R.string.attraction_birlamandir), getString(R.string.attraction_temple), R.drawable.attraction_birlamandir));
       attractions.add(new Location(getString(R.string.attraction_hussainsagar), getString(R.string.attraction_lake), R.drawable.attraction_hussainsagar));
       attractions.add(new Location(getString(R.string.attraction_qutubshahi), getString(R.string.attraction_historical), R.drawable.attraction_qutubshahitombs));
       attractions.add(new Location(getString(R.string.attraction_tajfalaknuma), getString(R.string.attraction_historical), R.drawable.attraction_tajfalaknuma));
        attractions.add(new Location(getString(R.string.attraction_taramatibaradari), getString(R.string.attraction_historical), R.drawable.attraction_taramatibaradari));

        // Create an {@link LocationAdapter}, whose data source is a list of {@link attraction}s. The
        // adapter knows how to create list items for each item in the list.
        LocationAdapter adapter = new LocationAdapter(getActivity(), attractions);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // list_view.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link LocationAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link attraction} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }
}
