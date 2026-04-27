package p000;

/* JADX INFO: loaded from: classes7.dex */
public enum vdc implements j11<Long, Throwable, vdc> {
    STOP,
    ERROR,
    SKIP,
    RETRY;

    @Override // p000.j11
    public vdc apply(Long l, Throwable th) {
        return this;
    }
}
