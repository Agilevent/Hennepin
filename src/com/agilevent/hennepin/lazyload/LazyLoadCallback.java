package com.agilevent.hennepin.lazyload;

import com.agilevent.hennepin.ManagedOverlay;
import com.agilevent.hennepin.ManagedOverlayItem;
import com.google.android.maps.GeoPoint;

import java.util.List;


public interface LazyLoadCallback {

	public List<? extends ManagedOverlayItem> lazyload(GeoPoint topLeft, GeoPoint bottomRight, ManagedOverlay overlay) throws LazyLoadException;

}


