package p000;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class jc9 {

    /* JADX INFO: renamed from: h */
    public static final AtomicLong f50293h = new AtomicLong();

    /* JADX INFO: renamed from: a */
    public final long f50294a;

    /* JADX INFO: renamed from: b */
    public final yh3 f50295b;

    /* JADX INFO: renamed from: c */
    public final Uri f50296c;

    /* JADX INFO: renamed from: d */
    public final Map<String, List<String>> f50297d;

    /* JADX INFO: renamed from: e */
    public final long f50298e;

    /* JADX INFO: renamed from: f */
    public final long f50299f;

    /* JADX INFO: renamed from: g */
    public final long f50300g;

    public jc9(long j, yh3 yh3Var, long j2) {
        this(j, yh3Var, yh3Var.f101485a, Collections.emptyMap(), j2, 0L, 0L);
    }

    public static long getNewId() {
        return f50293h.getAndIncrement();
    }

    public jc9(long j, yh3 yh3Var, Uri uri, Map<String, List<String>> map, long j2, long j3, long j4) {
        this.f50294a = j;
        this.f50295b = yh3Var;
        this.f50296c = uri;
        this.f50297d = map;
        this.f50298e = j2;
        this.f50299f = j3;
        this.f50300g = j4;
    }
}
