package p000;

import java.io.FileNotFoundException;
import java.io.IOException;
import p000.en7;
import p000.ic9;
import p000.vc9;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class nw3 implements ic9 {

    /* JADX INFO: renamed from: d */
    public static final int f65876d = 3;

    /* JADX INFO: renamed from: e */
    public static final int f65877e = 6;

    /* JADX INFO: renamed from: f */
    public static final long f65878f = 60000;

    /* JADX INFO: renamed from: g */
    @Deprecated
    public static final long f65879g = 60000;

    /* JADX INFO: renamed from: h */
    public static final long f65880h = 300000;

    /* JADX INFO: renamed from: i */
    public static final int f65881i = -1;

    /* JADX INFO: renamed from: c */
    public final int f65882c;

    public nw3() {
        this(-1);
    }

    /* JADX INFO: renamed from: a */
    public boolean m18166a(IOException iOException) {
        if (!(iOException instanceof en7.C5410f)) {
            return false;
        }
        int i = ((en7.C5410f) iOException).f33595C;
        return i == 403 || i == 404 || i == 410 || i == 416 || i == 500 || i == 503;
    }

    @Override // p000.ic9
    @hib
    public ic9.C7230b getFallbackSelectionFor(ic9.C7229a c7229a, ic9.C7232d c7232d) {
        if (!m18166a(c7232d.f46496c)) {
            return null;
        }
        if (c7229a.isFallbackAvailable(1)) {
            return new ic9.C7230b(1, 300000L);
        }
        if (c7229a.isFallbackAvailable(2)) {
            return new ic9.C7230b(2, 60000L);
        }
        return null;
    }

    @Override // p000.ic9
    public int getMinimumLoadableRetryCount(int i) {
        int i2 = this.f65882c;
        return i2 == -1 ? i == 7 ? 6 : 3 : i2;
    }

    @Override // p000.ic9
    public long getRetryDelayMsFor(ic9.C7232d c7232d) {
        IOException iOException = c7232d.f46496c;
        if ((iOException instanceof xhc) || (iOException instanceof FileNotFoundException) || (iOException instanceof en7.C5406b) || (iOException instanceof vc9.C14000h) || rh3.isCausedByPositionOutOfRange(iOException)) {
            return -9223372036854775807L;
        }
        return Math.min((c7232d.f46497d - 1) * 1000, 5000);
    }

    public nw3(int i) {
        this.f65882c = i;
    }
}
