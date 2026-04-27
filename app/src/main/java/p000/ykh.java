package p000;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Calendar;

/* JADX INFO: loaded from: classes.dex */
public class ykh {

    /* JADX INFO: renamed from: d */
    public static final String f101936d = "TwilightManager";

    /* JADX INFO: renamed from: e */
    public static final int f101937e = 6;

    /* JADX INFO: renamed from: f */
    public static final int f101938f = 22;

    /* JADX INFO: renamed from: g */
    public static ykh f101939g;

    /* JADX INFO: renamed from: a */
    public final Context f101940a;

    /* JADX INFO: renamed from: b */
    public final LocationManager f101941b;

    /* JADX INFO: renamed from: c */
    public final C15709a f101942c = new C15709a();

    /* JADX INFO: renamed from: ykh$a */
    public static class C15709a {

        /* JADX INFO: renamed from: a */
        public boolean f101943a;

        /* JADX INFO: renamed from: b */
        public long f101944b;
    }

    @fdi
    public ykh(@efb Context context, @efb LocationManager locationManager) {
        this.f101940a = context;
        this.f101941b = locationManager;
    }

    /* JADX INFO: renamed from: a */
    public static ykh m26164a(@efb Context context) {
        if (f101939g == null) {
            Context applicationContext = context.getApplicationContext();
            f101939g = new ykh(applicationContext, (LocationManager) applicationContext.getSystemService(FirebaseAnalytics.C3552d.f23227s));
        }
        return f101939g;
    }

    @fdi
    /* JADX INFO: renamed from: c */
    public static void m26165c(ykh ykhVar) {
        f101939g = ykhVar;
    }

    @igg({"MissingPermission"})
    private Location getLastKnownLocation() {
        Location lastKnownLocationForProvider = aoc.checkSelfPermission(this.f101940a, xnc.f98584I) == 0 ? getLastKnownLocationForProvider("network") : null;
        Location lastKnownLocationForProvider2 = aoc.checkSelfPermission(this.f101940a, xnc.f98583H) == 0 ? getLastKnownLocationForProvider("gps") : null;
        return (lastKnownLocationForProvider2 == null || lastKnownLocationForProvider == null) ? lastKnownLocationForProvider2 != null ? lastKnownLocationForProvider2 : lastKnownLocationForProvider : lastKnownLocationForProvider2.getTime() > lastKnownLocationForProvider.getTime() ? lastKnownLocationForProvider2 : lastKnownLocationForProvider;
    }

    @j5e(anyOf = {xnc.f98584I, xnc.f98583H})
    private Location getLastKnownLocationForProvider(String str) {
        try {
            if (this.f101941b.isProviderEnabled(str)) {
                return this.f101941b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    private boolean isStateValid() {
        return this.f101942c.f101944b > System.currentTimeMillis();
    }

    private void updateState(@efb Location location) {
        long j;
        C15709a c15709a = this.f101942c;
        long jCurrentTimeMillis = System.currentTimeMillis();
        xkh xkhVarM25262a = xkh.m25262a();
        xkhVarM25262a.calculateTwilight(jCurrentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        xkhVarM25262a.calculateTwilight(jCurrentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z = xkhVarM25262a.f98326c == 1;
        long j2 = xkhVarM25262a.f98325b;
        long j3 = xkhVarM25262a.f98324a;
        xkhVarM25262a.calculateTwilight(jCurrentTimeMillis + 86400000, location.getLatitude(), location.getLongitude());
        long j4 = xkhVarM25262a.f98325b;
        if (j2 == -1 || j3 == -1) {
            j = jCurrentTimeMillis + 43200000;
        } else {
            if (jCurrentTimeMillis <= j3) {
                j4 = jCurrentTimeMillis > j2 ? j3 : j2;
            }
            j = j4 + 60000;
        }
        c15709a.f101943a = z;
        c15709a.f101944b = j;
    }

    /* JADX INFO: renamed from: b */
    public boolean m26166b() {
        C15709a c15709a = this.f101942c;
        if (isStateValid()) {
            return c15709a.f101943a;
        }
        Location lastKnownLocation = getLastKnownLocation();
        if (lastKnownLocation != null) {
            updateState(lastKnownLocation);
            return c15709a.f101943a;
        }
        Log.i(f101936d, "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i = Calendar.getInstance().get(11);
        return i < 6 || i >= 22;
    }
}
