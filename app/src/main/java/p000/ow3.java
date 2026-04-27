package p000;

import java.io.FileNotFoundException;
import java.io.IOException;
import p000.dn7;
import p000.hc9;
import p000.uc9;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public class ow3 implements hc9 {

    /* JADX INFO: renamed from: d */
    public static final int f69000d = 3;

    /* JADX INFO: renamed from: e */
    public static final int f69001e = 6;

    /* JADX INFO: renamed from: f */
    public static final long f69002f = 60000;

    /* JADX INFO: renamed from: g */
    @Deprecated
    public static final long f69003g = 60000;

    /* JADX INFO: renamed from: h */
    public static final long f69004h = 300000;

    /* JADX INFO: renamed from: i */
    public static final int f69005i = -1;

    /* JADX INFO: renamed from: c */
    public final int f69006c;

    public ow3() {
        this(-1);
    }

    /* JADX INFO: renamed from: a */
    public boolean m19065a(IOException iOException) {
        if (!(iOException instanceof dn7.C4882f)) {
            return false;
        }
        int i = ((dn7.C4882f) iOException).f30195C;
        return i == 403 || i == 404 || i == 410 || i == 416 || i == 500 || i == 503;
    }

    @Override // p000.hc9
    @hib
    public hc9.C6793b getFallbackSelectionFor(hc9.C6792a c6792a, hc9.C6795d c6795d) {
        if (!m19065a(c6795d.f43141c)) {
            return null;
        }
        if (c6792a.isFallbackAvailable(1)) {
            return new hc9.C6793b(1, 300000L);
        }
        if (c6792a.isFallbackAvailable(2)) {
            return new hc9.C6793b(2, 60000L);
        }
        return null;
    }

    @Override // p000.hc9
    public int getMinimumLoadableRetryCount(int i) {
        int i2 = this.f69006c;
        return i2 == -1 ? i == 7 ? 6 : 3 : i2;
    }

    @Override // p000.hc9
    public long getRetryDelayMsFor(hc9.C6795d c6795d) {
        IOException iOException = c6795d.f43141c;
        if ((iOException instanceof yhc) || (iOException instanceof FileNotFoundException) || (iOException instanceof dn7.C4878b) || (iOException instanceof uc9.C13496h) || sh3.isCausedByPositionOutOfRange(iOException)) {
            return -9223372036854775807L;
        }
        return Math.min((c6795d.f43142d - 1) * 1000, 5000);
    }

    public ow3(int i) {
        this.f69006c = i;
    }
}
