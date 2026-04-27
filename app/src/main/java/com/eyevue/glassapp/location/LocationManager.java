package com.eyevue.glassapp.location;

import android.content.Context;
import android.location.Location;
import com.blankj.utilcode.util.C2473f;
import com.eyevue.glassapp.utils.CoordinateConverter;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.OnSuccessListener;
import com.watchfun.base.BaseApplication;
import p000.igg;
import p000.vfe;
import p000.zi9;

/* JADX INFO: loaded from: classes4.dex */
public class LocationManager {
    private static final String TAG = "LocationManager";
    private static volatile LocationManager instance;
    private FusedLocationProviderClient fusedLocationClient;

    private LocationManager(Context context) {
        this.fusedLocationClient = LocationServices.getFusedLocationProviderClient(context);
    }

    public static LocationManager getInstance() {
        if (instance == null) {
            synchronized (LocationManager.class) {
                try {
                    if (instance == null) {
                        instance = new LocationManager(BaseApplication.getInstance());
                    }
                } finally {
                }
            }
        }
        return instance;
    }

    @igg({"MissingPermission"})
    public void startLocation() {
        this.fusedLocationClient.getLastLocation().addOnSuccessListener(new OnSuccessListener<Location>() { // from class: com.eyevue.glassapp.location.LocationManager.1
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public void onSuccess(Location location) {
                String strValueOf;
                String strValueOf2;
                if (location != null) {
                    double latitude = location.getLatitude();
                    double longitude = location.getLongitude();
                    double[] dArrWgs84ToGcj02 = CoordinateConverter.wgs84ToGcj02(longitude, latitude);
                    if (dArrWgs84ToGcj02.length == 2) {
                        strValueOf = String.valueOf(dArrWgs84ToGcj02[1]);
                        strValueOf2 = String.valueOf(dArrWgs84ToGcj02[0]);
                    } else {
                        strValueOf = String.valueOf(latitude);
                        strValueOf2 = String.valueOf(longitude);
                    }
                    zi9.m26852e(LocationManager.TAG, "google latitude原始: " + latitude + ", longitude: " + longitude);
                    zi9.m26852e(LocationManager.TAG, "google latitude: " + strValueOf + ", longitude: " + strValueOf2);
                    C2473f.m4168e(LocationManager.TAG, "google latitude: " + strValueOf + ", longitude: " + strValueOf2);
                    vfe.getInstance().putString("SP_KEY_LOCATION_LATITUDE", strValueOf);
                    vfe.getInstance().putString("SP_KEY_LOCATION_LONGITUDE", strValueOf2);
                }
            }
        });
    }
}
