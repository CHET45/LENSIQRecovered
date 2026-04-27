package p000;

/* JADX INFO: loaded from: classes7.dex */
public enum b05 implements tmd<Object> {
    INSTANCE,
    NEVER;

    public static void complete(pxb<?> observer) {
        observer.onSubscribe(INSTANCE);
        observer.onComplete();
    }

    public static void error(Throwable e, pxb<?> observer) {
        observer.onSubscribe(INSTANCE);
        observer.onError(e);
    }

    @Override // p000.zif
    public void clear() {
    }

    @Override // p000.lf4
    public void dispose() {
    }

    @Override // p000.lf4
    public boolean isDisposed() {
        return this == INSTANCE;
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

    @Override // p000.vnd
    public int requestFusion(int mode) {
        return mode & 2;
    }

    @Override // p000.zif
    public boolean offer(Object v1, Object v2) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public static void complete(k9a<?> observer) {
        observer.onSubscribe(INSTANCE);
        observer.onComplete();
    }

    public static void error(Throwable e, ch2 observer) {
        observer.onSubscribe(INSTANCE);
        observer.onError(e);
    }

    public static void complete(ch2 observer) {
        observer.onSubscribe(INSTANCE);
        observer.onComplete();
    }

    public static void error(Throwable e, hnf<?> observer) {
        observer.onSubscribe(INSTANCE);
        observer.onError(e);
    }

    public static void error(Throwable e, k9a<?> observer) {
        observer.onSubscribe(INSTANCE);
        observer.onError(e);
    }
}
