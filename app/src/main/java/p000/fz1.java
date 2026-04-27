package p000;

import android.net.Uri;
import java.util.List;
import java.util.Map;
import p000.vc9;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public abstract class fz1 implements vc9.InterfaceC13997e {

    /* JADX INFO: renamed from: a */
    public final long f38043a = jc9.getNewId();

    /* JADX INFO: renamed from: b */
    public final yh3 f38044b;

    /* JADX INFO: renamed from: c */
    public final int f38045c;

    /* JADX INFO: renamed from: d */
    public final kq6 f38046d;

    /* JADX INFO: renamed from: e */
    public final int f38047e;

    /* JADX INFO: renamed from: f */
    @hib
    public final Object f38048f;

    /* JADX INFO: renamed from: g */
    public final long f38049g;

    /* JADX INFO: renamed from: h */
    public final long f38050h;

    /* JADX INFO: renamed from: i */
    public final i4g f38051i;

    public fz1(ih3 ih3Var, yh3 yh3Var, int i, kq6 kq6Var, int i2, @hib Object obj, long j, long j2) {
        this.f38051i = new i4g(ih3Var);
        this.f38044b = (yh3) u80.checkNotNull(yh3Var);
        this.f38045c = i;
        this.f38046d = kq6Var;
        this.f38047e = i2;
        this.f38048f = obj;
        this.f38049g = j;
        this.f38050h = j2;
    }

    public final long bytesLoaded() {
        return this.f38051i.getBytesRead();
    }

    public final long getDurationUs() {
        return this.f38050h - this.f38049g;
    }

    public final Map<String, List<String>> getResponseHeaders() {
        return this.f38051i.getLastResponseHeaders();
    }

    public final Uri getUri() {
        return this.f38051i.getLastOpenedUri();
    }
}
