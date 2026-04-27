package p000;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public abstract class xca extends fz1 {

    /* JADX INFO: renamed from: j */
    public final long f97520j;

    public xca(ih3 ih3Var, yh3 yh3Var, kq6 kq6Var, int i, @hib Object obj, long j, long j2, long j3) {
        super(ih3Var, yh3Var, 1, kq6Var, i, obj, j, j2);
        u80.checkNotNull(kq6Var);
        this.f97520j = j3;
    }

    public long getNextChunkIndex() {
        long j = this.f97520j;
        if (j != -1) {
            return 1 + j;
        }
        return -1L;
    }

    public abstract boolean isLoadCompleted();
}
