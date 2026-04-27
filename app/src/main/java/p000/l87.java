package p000;

import android.location.GpsSatellite;
import android.location.GpsStatus;
import java.util.Iterator;
import p000.p7e;

/* JADX INFO: loaded from: classes.dex */
@p7e({p7e.EnumC10826a.f69934a})
public class l87 extends x77 {

    /* JADX INFO: renamed from: n */
    public static final int f56755n = 0;

    /* JADX INFO: renamed from: o */
    public static final int f56756o = 32;

    /* JADX INFO: renamed from: p */
    public static final int f56757p = 33;

    /* JADX INFO: renamed from: q */
    public static final int f56758q = 64;

    /* JADX INFO: renamed from: r */
    public static final int f56759r = -87;

    /* JADX INFO: renamed from: s */
    public static final int f56760s = 64;

    /* JADX INFO: renamed from: t */
    public static final int f56761t = 24;

    /* JADX INFO: renamed from: u */
    public static final int f56762u = 193;

    /* JADX INFO: renamed from: v */
    public static final int f56763v = 200;

    /* JADX INFO: renamed from: w */
    public static final int f56764w = 200;

    /* JADX INFO: renamed from: x */
    public static final int f56765x = 35;

    /* JADX INFO: renamed from: i */
    public final GpsStatus f56766i;

    /* JADX INFO: renamed from: j */
    @xc7("mWrapped")
    public int f56767j;

    /* JADX INFO: renamed from: k */
    @xc7("mWrapped")
    public Iterator<GpsSatellite> f56768k;

    /* JADX INFO: renamed from: l */
    @xc7("mWrapped")
    public int f56769l;

    /* JADX INFO: renamed from: m */
    @xc7("mWrapped")
    public GpsSatellite f56770m;

    public l87(GpsStatus gpsStatus) {
        GpsStatus gpsStatus2 = (GpsStatus) z7d.checkNotNull(gpsStatus);
        this.f56766i = gpsStatus2;
        this.f56767j = -1;
        this.f56768k = gpsStatus2.getSatellites().iterator();
        this.f56769l = -1;
        this.f56770m = null;
    }

    private static int getConstellationFromPrn(int i) {
        if (i > 0 && i <= 32) {
            return 1;
        }
        if (i >= 33 && i <= 64) {
            return 2;
        }
        if (i > 64 && i <= 88) {
            return 3;
        }
        if (i <= 200 || i > 235) {
            return (i < 193 || i > 200) ? 0 : 4;
        }
        return 5;
    }

    private GpsSatellite getSatellite(int i) {
        GpsSatellite gpsSatellite;
        synchronized (this.f56766i) {
            try {
                if (i < this.f56769l) {
                    this.f56768k = this.f56766i.getSatellites().iterator();
                    this.f56769l = -1;
                }
                while (true) {
                    int i2 = this.f56769l;
                    if (i2 >= i) {
                        break;
                    }
                    this.f56769l = i2 + 1;
                    if (!this.f56768k.hasNext()) {
                        this.f56770m = null;
                        break;
                    }
                    this.f56770m = this.f56768k.next();
                }
                gpsSatellite = this.f56770m;
            } catch (Throwable th) {
                throw th;
            }
        }
        return (GpsSatellite) z7d.checkNotNull(gpsSatellite);
    }

    private static int getSvidFromPrn(int i) {
        int constellationFromPrn = getConstellationFromPrn(i);
        return constellationFromPrn != 2 ? constellationFromPrn != 3 ? constellationFromPrn != 5 ? i : i - 200 : i - 64 : i + 87;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l87) {
            return this.f56766i.equals(((l87) obj).f56766i);
        }
        return false;
    }

    @Override // p000.x77
    public float getAzimuthDegrees(int i) {
        return getSatellite(i).getAzimuth();
    }

    @Override // p000.x77
    public float getBasebandCn0DbHz(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.x77
    public float getCarrierFrequencyHz(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.x77
    public float getCn0DbHz(int i) {
        return getSatellite(i).getSnr();
    }

    @Override // p000.x77
    public int getConstellationType(int i) {
        return getConstellationFromPrn(getSatellite(i).getPrn());
    }

    @Override // p000.x77
    public float getElevationDegrees(int i) {
        return getSatellite(i).getElevation();
    }

    @Override // p000.x77
    public int getSatelliteCount() {
        int i;
        synchronized (this.f56766i) {
            try {
                if (this.f56767j == -1) {
                    for (GpsSatellite gpsSatellite : this.f56766i.getSatellites()) {
                        this.f56767j++;
                    }
                    this.f56767j++;
                }
                i = this.f56767j;
            } catch (Throwable th) {
                throw th;
            }
        }
        return i;
    }

    @Override // p000.x77
    public int getSvid(int i) {
        return getSvidFromPrn(getSatellite(i).getPrn());
    }

    @Override // p000.x77
    public boolean hasAlmanacData(int i) {
        return getSatellite(i).hasAlmanac();
    }

    @Override // p000.x77
    public boolean hasBasebandCn0DbHz(int i) {
        return false;
    }

    @Override // p000.x77
    public boolean hasCarrierFrequencyHz(int i) {
        return false;
    }

    @Override // p000.x77
    public boolean hasEphemerisData(int i) {
        return getSatellite(i).hasEphemeris();
    }

    public int hashCode() {
        return this.f56766i.hashCode();
    }

    @Override // p000.x77
    public boolean usedInFix(int i) {
        return getSatellite(i).usedInFix();
    }
}
