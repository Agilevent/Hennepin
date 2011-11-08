package de.android1.overlaymanager.lazyload;

import com.google.android.maps.GeoPoint;

import java.util.List;

import de.android1.overlaymanager.ManagedOverlay;
import de.android1.overlaymanager.ManagedOverlayItem;


public interface LazyLoadCallback {

	public List<? extends ManagedOverlayItem> lazyload(GeoPoint topLeft, GeoPoint bottomRight, ManagedOverlay overlay) throws LazyLoadException;

}


