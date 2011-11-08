package com.agilevent.hennepin.lazyload;


import com.agilevent.hennepin.ManagedOverlay;

public interface LazyLoadListener {

    public void onBegin(ManagedOverlay overlay);
    public void onSuccess(ManagedOverlay overlay);
    public void onError(LazyLoadException exception, ManagedOverlay overlay);
    
}
