package p000;

import android.location.GnssStatus;
import android.os.Build;
import p000.p7e;

/* JADX INFO: loaded from: classes.dex */
@c5e(24)
@p7e({p7e.EnumC10826a.f69934a})
public class y77 extends x77 {

    /* JADX INFO: renamed from: i */
    public final GnssStatus f100693i;

    /* JADX INFO: renamed from: y77$a */
    @c5e(26)
    public static class C15536a {
        private C15536a() {
        }

        @ih4
        /* JADX INFO: renamed from: a */
        public static float m25673a(GnssStatus gnssStatus, int i) {
            return gnssStatus.getCarrierFrequencyHz(i);
        }

        @ih4
        /* JADX INFO: renamed from: b */
        public static boolean m25674b(GnssStatus gnssStatus, int i) {
            return gnssStatus.hasCarrierFrequencyHz(i);
        }
    }

    /* JADX INFO: renamed from: y77$b */
    @c5e(30)
    public static class C15537b {
        private C15537b() {
        }

        @ih4
        /* JADX INFO: renamed from: a */
        public static float m25675a(GnssStatus gnssStatus, int i) {
            return gnssStatus.getBasebandCn0DbHz(i);
        }

        @ih4
        /* JADX INFO: renamed from: b */
        public static boolean m25676b(GnssStatus gnssStatus, int i) {
            return gnssStatus.hasBasebandCn0DbHz(i);
        }
    }

    public y77(Object obj) {
        this.f100693i = (GnssStatus) z7d.checkNotNull((GnssStatus) obj);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof y77) {
            return this.f100693i.equals(((y77) obj).f100693i);
        }
        return false;
    }

    @Override // p000.x77
    public float getAzimuthDegrees(int i) {
        return this.f100693i.getAzimuthDegrees(i);
    }

    @Override // p000.x77
    public float getBasebandCn0DbHz(int i) {
        if (Build.VERSION.SDK_INT >= 30) {
            return C15537b.m25675a(this.f100693i, i);
        }
        throw new UnsupportedOperationException();
    }

    @Override // p000.x77
    public float getCarrierFrequencyHz(int i) {
        return C15536a.m25673a(this.f100693i, i);
    }

    @Override // p000.x77
    public float getCn0DbHz(int i) {
        return this.f100693i.getCn0DbHz(i);
    }

    @Override // p000.x77
    public int getConstellationType(int i) {
        return this.f100693i.getConstellationType(i);
    }

    @Override // p000.x77
    public float getElevationDegrees(int i) {
        return this.f100693i.getElevationDegrees(i);
    }

    @Override // p000.x77
    public int getSatelliteCount() {
        return this.f100693i.getSatelliteCount();
    }

    @Override // p000.x77
    public int getSvid(int i) {
        return this.f100693i.getSvid(i);
    }

    @Override // p000.x77
    public boolean hasAlmanacData(int i) {
        return this.f100693i.hasAlmanacData(i);
    }

    @Override // p000.x77
    public boolean hasBasebandCn0DbHz(int i) {
        if (Build.VERSION.SDK_INT >= 30) {
            return C15537b.m25676b(this.f100693i, i);
        }
        return false;
    }

    @Override // p000.x77
    public boolean hasCarrierFrequencyHz(int i) {
        return C15536a.m25674b(this.f100693i, i);
    }

    @Override // p000.x77
    public boolean hasEphemerisData(int i) {
        return this.f100693i.hasEphemerisData(i);
    }

    public int hashCode() {
        return this.f100693i.hashCode();
    }

    @Override // p000.x77
    public boolean usedInFix(int i) {
        return this.f100693i.usedInFix(i);
    }
}
