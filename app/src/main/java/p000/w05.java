package p000;

/* JADX INFO: loaded from: classes7.dex */
public enum w05 implements bod<Object> {
    INSTANCE;

    public static void complete(ycg<?> s) {
        s.onSubscribe(INSTANCE);
        s.onComplete();
    }

    public static void error(Throwable e, ycg<?> s) {
        s.onSubscribe(INSTANCE);
        s.onError(e);
    }

    @Override // p000.fdg
    public void cancel() {
    }

    @Override // p000.zif
    public void clear() {
    }

    @Override // p000.zif
    public boolean isEmpty() {
        return true;
    }

    @Override // p000.zif
    public boolean offer(Object value) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // p000.zif
    @dib
    public Object poll() {
        return null;
    }

    @Override // p000.fdg
    public void request(long n) {
        ldg.validate(n);
    }

    @Override // p000.vnd
    public int requestFusion(int mode) {
        return mode & 2;
    }

    @Override // java.lang.Enum
    public String toString() {
        return "EmptySubscription";
    }

    @Override // p000.zif
    public boolean offer(Object v1, Object v2) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
