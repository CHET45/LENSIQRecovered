package p000;

import android.location.GnssStatus;
import android.location.GpsStatus;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import p000.p7e;

/* JADX INFO: loaded from: classes.dex */
public abstract class x77 {

    /* JADX INFO: renamed from: a */
    @igg({"InlinedApi"})
    public static final int f97069a = 0;

    /* JADX INFO: renamed from: b */
    @igg({"InlinedApi"})
    public static final int f97070b = 1;

    /* JADX INFO: renamed from: c */
    @igg({"InlinedApi"})
    public static final int f97071c = 2;

    /* JADX INFO: renamed from: d */
    @igg({"InlinedApi"})
    public static final int f97072d = 3;

    /* JADX INFO: renamed from: e */
    @igg({"InlinedApi"})
    public static final int f97073e = 4;

    /* JADX INFO: renamed from: f */
    @igg({"InlinedApi"})
    public static final int f97074f = 5;

    /* JADX INFO: renamed from: g */
    @igg({"InlinedApi"})
    public static final int f97075g = 6;

    /* JADX INFO: renamed from: h */
    @igg({"InlinedApi"})
    public static final int f97076h = 7;

    /* JADX INFO: renamed from: x77$a */
    public static abstract class AbstractC14964a {
        public void onFirstFix(@h78(from = 0) int i) {
        }

        public void onSatelliteStatusChanged(@efb x77 x77Var) {
        }

        public void onStarted() {
        }

        public void onStopped() {
        }
    }

    /* JADX INFO: renamed from: x77$b */
    @Retention(RetentionPolicy.SOURCE)
    @p7e({p7e.EnumC10826a.f69934a})
    public @interface InterfaceC14965b {
    }

    @c5e(24)
    @efb
    public static x77 wrap(@efb GnssStatus gnssStatus) {
        return new y77(gnssStatus);
    }

    @y46(from = 0.0d, m25645to = 360.0d)
    public abstract float getAzimuthDegrees(@h78(from = 0) int i);

    @y46(from = 0.0d, m25645to = 63.0d)
    public abstract float getBasebandCn0DbHz(@h78(from = 0) int i);

    @y46(from = 0.0d)
    public abstract float getCarrierFrequencyHz(@h78(from = 0) int i);

    @y46(from = 0.0d, m25645to = 63.0d)
    public abstract float getCn0DbHz(@h78(from = 0) int i);

    public abstract int getConstellationType(@h78(from = 0) int i);

    @y46(from = -90.0d, m25645to = 90.0d)
    public abstract float getElevationDegrees(@h78(from = 0) int i);

    @h78(from = 0)
    public abstract int getSatelliteCount();

    @h78(from = 1, m12174to = 200)
    public abstract int getSvid(@h78(from = 0) int i);

    public abstract boolean hasAlmanacData(@h78(from = 0) int i);

    public abstract boolean hasBasebandCn0DbHz(@h78(from = 0) int i);

    public abstract boolean hasCarrierFrequencyHz(@h78(from = 0) int i);

    public abstract boolean hasEphemerisData(@h78(from = 0) int i);

    public abstract boolean usedInFix(@h78(from = 0) int i);

    @efb
    @igg({"ReferencesDeprecated"})
    public static x77 wrap(@efb GpsStatus gpsStatus) {
        return new l87(gpsStatus);
    }
}
