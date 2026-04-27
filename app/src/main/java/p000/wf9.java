package p000;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface wf9 extends LocationListener {
    @Override // android.location.LocationListener
    default void onFlushComplete(int i) {
    }

    @Override // android.location.LocationListener
    default void onLocationChanged(@efb List<Location> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            onLocationChanged(list.get(i));
        }
    }

    @Override // android.location.LocationListener
    default void onProviderDisabled(@efb String str) {
    }

    @Override // android.location.LocationListener
    default void onProviderEnabled(@efb String str) {
    }

    @Override // android.location.LocationListener
    default void onStatusChanged(@efb String str, int i, @hib Bundle bundle) {
    }
}
