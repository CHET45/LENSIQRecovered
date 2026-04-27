package p000;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class t1g extends tr6 {

    /* JADX INFO: renamed from: c */
    public final long f83384c;

    public t1g(zj5 zj5Var, long j) {
        super(zj5Var);
        u80.checkArgument(zj5Var.getPosition() >= j);
        this.f83384c = j;
    }

    @Override // p000.tr6, p000.zj5
    public long getLength() {
        return super.getLength() - this.f83384c;
    }

    @Override // p000.tr6, p000.zj5
    public long getPeekPosition() {
        return super.getPeekPosition() - this.f83384c;
    }

    @Override // p000.tr6, p000.zj5
    public long getPosition() {
        return super.getPosition() - this.f83384c;
    }

    @Override // p000.tr6, p000.zj5
    public <E extends Throwable> void setRetryPosition(long j, E e) throws Throwable {
        super.setRetryPosition(j + this.f83384c, e);
    }
}
