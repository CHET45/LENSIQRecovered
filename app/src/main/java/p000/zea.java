package p000;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class zea extends IOException {

    /* JADX INFO: renamed from: a */
    public final yh3 f104926a;

    /* JADX INFO: renamed from: b */
    public final Uri f104927b;

    /* JADX INFO: renamed from: c */
    public final Map<String, List<String>> f104928c;

    /* JADX INFO: renamed from: d */
    public final long f104929d;

    public zea(yh3 yh3Var, Uri uri, Map<String, List<String>> map, long j, Throwable th) {
        super(th);
        this.f104926a = yh3Var;
        this.f104927b = uri;
        this.f104928c = map;
        this.f104929d = j;
    }
}
