package com.matveyporoshin.taxistick.Modules;

import com.google.android.gms.maps.model.LatLng;

import java.util.ArrayList;
import java.util.List;

import com.matveyporoshin.taxistick.Modules.Route;

/**
 * Created by Matv1 on 25/10/2016.
 */
public interface DirectionFinderListener {
    void onDirectionFinderStart();
    void onDirectionFinderSuccess(List<Route> route);
}

