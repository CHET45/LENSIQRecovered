package p000;

import android.content.ContentResolver;
import android.location.LocationManager;
import android.os.Build;
import android.provider.Settings;

/* JADX INFO: loaded from: classes6.dex */
public class my1 {

    /* JADX INFO: renamed from: a */
    public final ContentResolver f62772a;

    /* JADX INFO: renamed from: b */
    public final LocationManager f62773b;

    @b28
    public my1(ContentResolver contentResolver, LocationManager locationManager) {
        this.f62772a = contentResolver;
        this.f62773b = locationManager;
    }

    private boolean isLocationProviderEnabledBelowApi19() {
        return this.f62773b.isProviderEnabled("network") || this.f62773b.isProviderEnabled("gps");
    }

    @c5e(19)
    private boolean isLocationProviderEnabledBelowApi28() {
        try {
            return Settings.Secure.getInt(this.f62772a, "location_mode") != 0;
        } catch (Settings.SettingNotFoundException e) {
            kfe.m14731w(e, "Could not use LOCATION_MODE check. Falling back to a legacy/heuristic function.", new Object[0]);
            return isLocationProviderEnabledBelowApi19();
        }
    }

    public boolean isLocationProviderEnabled() {
        return Build.VERSION.SDK_INT >= 28 ? this.f62773b.isLocationEnabled() : isLocationProviderEnabledBelowApi28();
    }
}
