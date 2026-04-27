package p000;

import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public class ba3 {

    /* JADX INFO: renamed from: a */
    public final kx7<n93> f13111a;

    /* JADX INFO: renamed from: b */
    public final long f13112b;

    /* JADX INFO: renamed from: c */
    public final long f13113c;

    /* JADX INFO: renamed from: d */
    public final long f13114d;

    public ba3(List<n93> list, long j, long j2) {
        this.f13111a = kx7.copyOf((Collection) list);
        this.f13112b = j;
        this.f13113c = j2;
        long j3 = -9223372036854775807L;
        if (j != -9223372036854775807L && j2 != -9223372036854775807L) {
            j3 = j + j2;
        }
        this.f13114d = j3;
    }
}
