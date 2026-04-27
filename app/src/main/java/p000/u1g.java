package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class u1g extends ur6 {

    /* JADX INFO: renamed from: c */
    public final long f86572c;

    public u1g(ak5 ak5Var, long j) {
        super(ak5Var);
        v80.checkArgument(ak5Var.getPosition() >= j);
        this.f86572c = j;
    }

    @Override // p000.ur6, p000.ak5
    public long getLength() {
        return super.getLength() - this.f86572c;
    }

    @Override // p000.ur6, p000.ak5
    public long getPeekPosition() {
        return super.getPeekPosition() - this.f86572c;
    }

    @Override // p000.ur6, p000.ak5
    public long getPosition() {
        return super.getPosition() - this.f86572c;
    }

    @Override // p000.ur6, p000.ak5
    public <E extends Throwable> void setRetryPosition(long j, E e) throws Throwable {
        super.setRetryPosition(j + this.f86572c, e);
    }
}
