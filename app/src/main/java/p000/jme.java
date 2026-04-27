package p000;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes7.dex */
public final class jme<T> extends AtomicInteger implements bod<T> {

    /* JADX INFO: renamed from: c */
    public static final int f51258c = 0;

    /* JADX INFO: renamed from: d */
    public static final int f51259d = 1;

    /* JADX INFO: renamed from: e */
    public static final int f51260e = 2;
    private static final long serialVersionUID = -3830916580126663321L;

    /* JADX INFO: renamed from: a */
    public final T f51261a;

    /* JADX INFO: renamed from: b */
    public final ycg<? super T> f51262b;

    public jme(ycg<? super T> subscriber, T value) {
        this.f51262b = subscriber;
        this.f51261a = value;
    }

    @Override // p000.fdg
    public void cancel() {
        lazySet(2);
    }

    @Override // p000.zif
    public void clear() {
        lazySet(1);
    }

    public boolean isCancelled() {
        return get() == 2;
    }

    @Override // p000.zif
    public boolean isEmpty() {
        return get() != 0;
    }

    @Override // p000.zif
    public boolean offer(T e) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // p000.zif
    @dib
    public T poll() {
        if (get() != 0) {
            return null;
        }
        lazySet(1);
        return this.f51261a;
    }

    @Override // p000.fdg
    public void request(long j) {
        if (ldg.validate(j) && compareAndSet(0, 1)) {
            ycg<? super T> ycgVar = this.f51262b;
            ycgVar.onNext(this.f51261a);
            if (get() != 2) {
                ycgVar.onComplete();
            }
        }
    }

    @Override // p000.vnd
    public int requestFusion(int mode) {
        return mode & 1;
    }

    @Override // p000.zif
    public boolean offer(T v1, T v2) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
