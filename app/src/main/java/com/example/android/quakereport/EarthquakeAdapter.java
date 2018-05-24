package com.example.android.quakereport;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by Tony on 2018-05-23.
 */

public class EarthquakeAdapter extends ArrayAdapter<Earthquake>{

    /**
     * EarthquakeAdapter Constructor
     * @param context of the app
     * @param earthquakes is the list of earthquakes, which is the data source of the earthquake
     */
    public EarthquakeAdapter(Context context, List<Earthquake> earthquakes) {
        super(context, 0,earthquakes);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){

        //Check if there is an existing list item view (called convert view) that we can reuse,
        //otherwise, if convertView is null, then inflate a new list item layout.
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.earthquake_list_item, parent, false);
        }

        //Find the earthquake at the given position in the list of earthquakes
        Earthquake currentEarthquake = getItem(position);

        //Find the TextView of ID magnitude
        TextView magnitudeView = (TextView)listItemView.findViewById(R.id.magnitude);
        //Display the magnitude of the current earthquake in that TextView
        magnitudeView.setText(currentEarthquake.getmMagnitude());

        //Find the TextView of ID location
        TextView locationView = (TextView)listItemView.findViewById(R.id.location);
        //Display the location of the current earthquake in that TextView
        locationView.setText(currentEarthquake.getmLocation());

        //convert the date in milliseconds into a Date object
        Date dateObject = new Date(currentEarthquake.getmTimeInMilliseconds());
        // Format the date string (i.e. "Mar 3, 1984")
        String formattedDate = formatDate(dateObject);

        //Find the TextView of ID date
        TextView dateView = (TextView)listItemView.findViewById(R.id.date);
        //Display the date of the current earthquake in that TextView
        dateView.setText(formattedDate);

        // Find the TextView with view ID time
        TextView timeView = (TextView) listItemView.findViewById(R.id.time);
        // Format the time string (i.e. "4:30PM")
        String formattedTime = formatTime(dateObject);
        // Display the time of the current earthquake in that TextView
        timeView.setText(formattedTime);

        return listItemView;

    }

    /**
     * Return the formatted date string (i.e. "Mar 3, 1984") from a Date object.
     */
    private String formatDate(Date dateObject) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMM dd, yyyy");
        return dateFormat.format(dateObject);
    }

    /**
     * Return the formatted date string (i.e. "4:30 PM") from a Date object.
     */
    private String formatTime(Date dateObject) {
        SimpleDateFormat timeFormat = new SimpleDateFormat("h:mm a");
        return timeFormat.format(dateObject);
    }
}
