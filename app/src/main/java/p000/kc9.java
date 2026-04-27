package p000;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class kc9 {

    /* JADX INFO: renamed from: h */
    public static final AtomicLong f53590h = new AtomicLong();

    /* JADX INFO: renamed from: a */
    public final long f53591a;

    /* JADX INFO: renamed from: b */
    public final xh3 f53592b;

    /* JADX INFO: renamed from: c */
    public final Uri f53593c;

    /* JADX INFO: renamed from: d */
    public final Map<String, List<String>> f53594d;

    /* JADX INFO: renamed from: e */
    public final long f53595e;

    /* JADX INFO: renamed from: f */
    public final long f53596f;

    /* JADX INFO: renamed from: g */
    public final long f53597g;

    public kc9(long j, xh3 xh3Var, long j2) {
        this(j, xh3Var, xh3Var.f97800a, Collections.emptyMap(), j2, 0L, 0L);
    }

    public static long getNewId() {
        return f53590h.getAndIncrement();
    }

    public kc9(long j, xh3 xh3Var, Uri uri, Map<String, List<String>> map, long j2, long j3, long j4) {
        this.f53591a = j;
        this.f53592b = xh3Var;
        this.f53593c = uri;
        this.f53594d = map;
        this.f53595e = j2;
        this.f53596f = j3;
        this.f53597g = j4;
    }
}
