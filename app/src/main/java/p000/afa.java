package p000;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class afa extends IOException {

    /* JADX INFO: renamed from: a */
    public final xh3 f1332a;

    /* JADX INFO: renamed from: b */
    public final Uri f1333b;

    /* JADX INFO: renamed from: c */
    public final Map<String, List<String>> f1334c;

    /* JADX INFO: renamed from: d */
    public final long f1335d;

    public afa(xh3 xh3Var, Uri uri, Map<String, List<String>> map, long j, Throwable th) {
        super(th);
        this.f1332a = xh3Var;
        this.f1333b = uri;
        this.f1334c = map;
        this.f1335d = j;
    }
}
