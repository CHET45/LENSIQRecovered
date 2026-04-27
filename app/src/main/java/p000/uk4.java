package p000;

import com.google.android.exoplayer2.offline.DownloadRequest;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class uk4 {

    /* JADX INFO: renamed from: i */
    public static final int f88207i = 0;

    /* JADX INFO: renamed from: j */
    public static final int f88208j = 1;

    /* JADX INFO: renamed from: k */
    public static final int f88209k = 2;

    /* JADX INFO: renamed from: l */
    public static final int f88210l = 3;

    /* JADX INFO: renamed from: m */
    public static final int f88211m = 4;

    /* JADX INFO: renamed from: n */
    public static final int f88212n = 5;

    /* JADX INFO: renamed from: o */
    public static final int f88213o = 7;

    /* JADX INFO: renamed from: p */
    public static final int f88214p = 0;

    /* JADX INFO: renamed from: q */
    public static final int f88215q = 1;

    /* JADX INFO: renamed from: r */
    public static final int f88216r = 0;

    /* JADX INFO: renamed from: a */
    public final DownloadRequest f88217a;

    /* JADX INFO: renamed from: b */
    public final int f88218b;

    /* JADX INFO: renamed from: c */
    public final long f88219c;

    /* JADX INFO: renamed from: d */
    public final long f88220d;

    /* JADX INFO: renamed from: e */
    public final long f88221e;

    /* JADX INFO: renamed from: f */
    public final int f88222f;

    /* JADX INFO: renamed from: g */
    public final int f88223g;

    /* JADX INFO: renamed from: h */
    public final rm4 f88224h;

    /* JADX INFO: renamed from: uk4$a */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC13564a {
    }

    /* JADX INFO: renamed from: uk4$b */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC13565b {
    }

    public uk4(DownloadRequest downloadRequest, int i, long j, long j2, long j3, int i2, int i3) {
        this(downloadRequest, i, j, j2, j3, i2, i3, new rm4());
    }

    public long getBytesDownloaded() {
        return this.f88224h.f78717a;
    }

    public float getPercentDownloaded() {
        return this.f88224h.f78718b;
    }

    public boolean isTerminalState() {
        int i = this.f88218b;
        return i == 3 || i == 4;
    }

    public uk4(DownloadRequest downloadRequest, int i, long j, long j2, long j3, int i2, int i3, rm4 rm4Var) {
        u80.checkNotNull(rm4Var);
        boolean z = false;
        u80.checkArgument((i3 == 0) == (i != 4));
        if (i2 != 0) {
            if (i != 2 && i != 0) {
                z = true;
            }
            u80.checkArgument(z);
        }
        this.f88217a = downloadRequest;
        this.f88218b = i;
        this.f88219c = j;
        this.f88220d = j2;
        this.f88221e = j3;
        this.f88222f = i2;
        this.f88223g = i3;
        this.f88224h = rm4Var;
    }
}
