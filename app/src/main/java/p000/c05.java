package p000;

/* JADX INFO: loaded from: classes7.dex */
public enum c05 implements umd<Object> {
    INSTANCE,
    NEVER;

    public static void complete(oxb<?> oxbVar) {
        oxbVar.onSubscribe(INSTANCE);
        oxbVar.onComplete();
    }

    public static void error(Throwable th, oxb<?> oxbVar) {
        oxbVar.onSubscribe(INSTANCE);
        oxbVar.onError(th);
    }

    @Override // p000.ajf
    public void clear() {
    }

    @Override // p000.mf4
    public void dispose() {
    }

    @Override // p000.mf4
    public boolean isDisposed() {
        return this == INSTANCE;
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
    public Object poll() throws Exception {
        return null;
    }

    @Override // p000.wnd
    public int requestFusion(int i) {
        return i & 2;
    }

    @Override // p000.ajf
    public boolean offer(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public static void complete(l9a<?> l9aVar) {
        l9aVar.onSubscribe(INSTANCE);
        l9aVar.onComplete();
    }

    public static void error(Throwable th, dh2 dh2Var) {
        dh2Var.onSubscribe(INSTANCE);
        dh2Var.onError(th);
    }

    public static void complete(dh2 dh2Var) {
        dh2Var.onSubscribe(INSTANCE);
        dh2Var.onComplete();
    }

    public static void error(Throwable th, inf<?> infVar) {
        infVar.onSubscribe(INSTANCE);
        infVar.onError(th);
    }

    public static void error(Throwable th, l9a<?> l9aVar) {
        l9aVar.onSubscribe(INSTANCE);
        l9aVar.onError(th);
    }
}
