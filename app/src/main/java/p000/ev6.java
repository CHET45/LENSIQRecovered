package p000;

import androidx.media3.common.C1213a;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public class ev6 {

    /* JADX INFO: renamed from: a */
    public final C1213a f34134a;

    /* JADX INFO: renamed from: b */
    public final long f34135b;

    public ev6(C1213a c1213a, long j) {
        v80.checkArgument(c1213a.f8264E != null, "format colorInfo must be set");
        v80.checkArgument(c1213a.f8298v > 0, "format width must be positive, but is: " + c1213a.f8298v);
        v80.checkArgument(c1213a.f8299w > 0, "format height must be positive, but is: " + c1213a.f8299w);
        this.f34134a = c1213a;
        this.f34135b = j;
    }
}
