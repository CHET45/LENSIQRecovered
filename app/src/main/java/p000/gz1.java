package p000;

import android.net.Uri;
import androidx.media3.common.C1213a;
import java.util.List;
import java.util.Map;
import p000.uc9;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public abstract class gz1 implements uc9.InterfaceC13493e {

    /* JADX INFO: renamed from: a */
    public final long f41842a = kc9.getNewId();

    /* JADX INFO: renamed from: b */
    public final xh3 f41843b;

    /* JADX INFO: renamed from: c */
    public final int f41844c;

    /* JADX INFO: renamed from: d */
    public final C1213a f41845d;

    /* JADX INFO: renamed from: e */
    public final int f41846e;

    /* JADX INFO: renamed from: f */
    @hib
    public final Object f41847f;

    /* JADX INFO: renamed from: g */
    public final long f41848g;

    /* JADX INFO: renamed from: h */
    public final long f41849h;

    /* JADX INFO: renamed from: i */
    public final j4g f41850i;

    public gz1(gh3 gh3Var, xh3 xh3Var, int i, C1213a c1213a, int i2, @hib Object obj, long j, long j2) {
        this.f41850i = new j4g(gh3Var);
        this.f41843b = (xh3) v80.checkNotNull(xh3Var);
        this.f41844c = i;
        this.f41845d = c1213a;
        this.f41846e = i2;
        this.f41847f = obj;
        this.f41848g = j;
        this.f41849h = j2;
    }

    public final long bytesLoaded() {
        return this.f41850i.getBytesRead();
    }

    public final long getDurationUs() {
        return this.f41849h - this.f41848g;
    }

    public final Map<String, List<String>> getResponseHeaders() {
        return this.f41850i.getLastResponseHeaders();
    }

    public final Uri getUri() {
        return this.f41850i.getLastOpenedUri();
    }
}
