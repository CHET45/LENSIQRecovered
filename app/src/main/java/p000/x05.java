package p000;

/* JADX INFO: loaded from: classes7.dex */
public enum x05 implements cod<Object> {
    INSTANCE;

    public static void complete(ycg<?> ycgVar) {
        ycgVar.onSubscribe(INSTANCE);
        ycgVar.onComplete();
    }

    public static void error(Throwable th, ycg<?> ycgVar) {
        ycgVar.onSubscribe(INSTANCE);
        ycgVar.onError(th);
    }

    @Override // p000.fdg
    public void cancel() {
    }

    @Override // p000.ajf
    public void clear() {
    }

    @Override // p000.ajf
    public boolean isEmpty() {
        return true;
    }

    @Override // p000.ajf
    public boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // p000.ajf
    @cib
    public Object poll() {
        return null;
    }

    @Override // p000.fdg
    public void request(long j) {
        mdg.validate(j);
    }

    @Override // p000.wnd
    public int requestFusion(int i) {
        return i & 2;
    }

    @Override // java.lang.Enum
    public String toString() {
        return "EmptySubscription";
    }

    @Override // p000.ajf
    public boolean offer(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
