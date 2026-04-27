package p000;

import androidx.media3.common.C1213a;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public abstract class yca extends gz1 {

    /* JADX INFO: renamed from: j */
    public final long f101115j;

    public yca(gh3 gh3Var, xh3 xh3Var, C1213a c1213a, int i, @hib Object obj, long j, long j2, long j3) {
        super(gh3Var, xh3Var, 1, c1213a, i, obj, j, j2);
        v80.checkNotNull(c1213a);
        this.f101115j = j3;
    }

    public long getNextChunkIndex() {
        long j = this.f101115j;
        if (j != -1) {
            return 1 + j;
        }
        return -1L;
    }

    public abstract boolean isLoadCompleted();
}
