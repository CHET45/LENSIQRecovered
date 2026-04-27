package p000;

import androidx.media3.exoplayer.offline.DownloadRequest;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class tk4 {

    /* JADX INFO: renamed from: i */
    public static final int f85106i = 0;

    /* JADX INFO: renamed from: j */
    public static final int f85107j = 1;

    /* JADX INFO: renamed from: k */
    public static final int f85108k = 2;

    /* JADX INFO: renamed from: l */
    public static final int f85109l = 3;

    /* JADX INFO: renamed from: m */
    public static final int f85110m = 4;

    /* JADX INFO: renamed from: n */
    public static final int f85111n = 5;

    /* JADX INFO: renamed from: o */
    public static final int f85112o = 7;

    /* JADX INFO: renamed from: p */
    public static final int f85113p = 0;

    /* JADX INFO: renamed from: q */
    public static final int f85114q = 1;

    /* JADX INFO: renamed from: r */
    public static final int f85115r = 0;

    /* JADX INFO: renamed from: a */
    public final DownloadRequest f85116a;

    /* JADX INFO: renamed from: b */
    public final int f85117b;

    /* JADX INFO: renamed from: c */
    public final long f85118c;

    /* JADX INFO: renamed from: d */
    public final long f85119d;

    /* JADX INFO: renamed from: e */
    public final long f85120e;

    /* JADX INFO: renamed from: f */
    public final int f85121f;

    /* JADX INFO: renamed from: g */
    public final int f85122g;

    /* JADX INFO: renamed from: h */
    public final sm4 f85123h;

    /* JADX INFO: renamed from: tk4$a */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC13081a {
    }

    /* JADX INFO: renamed from: tk4$b */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC13082b {
    }

    public tk4(DownloadRequest downloadRequest, int i, long j, long j2, long j3, int i2, int i3) {
        this(downloadRequest, i, j, j2, j3, i2, i3, new sm4());
    }

    public long getBytesDownloaded() {
        return this.f85123h.f82223a;
    }

    public float getPercentDownloaded() {
        return this.f85123h.f82224b;
    }

    public boolean isTerminalState() {
        int i = this.f85117b;
        return i == 3 || i == 4;
    }

    public tk4(DownloadRequest downloadRequest, int i, long j, long j2, long j3, int i2, int i3, sm4 sm4Var) {
        v80.checkNotNull(sm4Var);
        boolean z = false;
        v80.checkArgument((i3 == 0) == (i != 4));
        if (i2 != 0) {
            if (i != 2 && i != 0) {
                z = true;
            }
            v80.checkArgument(z);
        }
        this.f85116a = downloadRequest;
        this.f85117b = i;
        this.f85118c = j;
        this.f85119d = j2;
        this.f85120e = j3;
        this.f85121f = i2;
        this.f85122g = i3;
        this.f85123h = sm4Var;
    }
}
