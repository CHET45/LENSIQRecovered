package p000;

/* JADX INFO: renamed from: h6 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC6718h6 {

    /* JADX INFO: renamed from: h6$a */
    public static final class a {
    }

    static /* synthetic */ long calculateRecommendedTimeoutMillis$default(InterfaceC6718h6 interfaceC6718h6, long j, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if (obj == null) {
            return interfaceC6718h6.calculateRecommendedTimeoutMillis(j, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? false : z3);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: calculateRecommendedTimeoutMillis");
    }

    long calculateRecommendedTimeoutMillis(long j, boolean z, boolean z2, boolean z3);
}
