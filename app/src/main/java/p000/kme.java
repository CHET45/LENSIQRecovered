package p000;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes7.dex */
public final class kme<T> extends AtomicInteger implements cod<T> {

    /* JADX INFO: renamed from: c */
    public static final int f54745c = 0;

    /* JADX INFO: renamed from: d */
    public static final int f54746d = 1;

    /* JADX INFO: renamed from: e */
    public static final int f54747e = 2;
    private static final long serialVersionUID = -3830916580126663321L;

    /* JADX INFO: renamed from: a */
    public final T f54748a;

    /* JADX INFO: renamed from: b */
    public final ycg<? super T> f54749b;

    public kme(ycg<? super T> ycgVar, T t) {
        this.f54749b = ycgVar;
        this.f54748a = t;
    }

    @Override // p000.fdg
    public void cancel() {
        lazySet(2);
    }

    @Override // p000.ajf
    public void clear() {
        lazySet(1);
    }

    public boolean isCancelled() {
        return get() == 2;
    }

    @Override // p000.ajf
    public boolean isEmpty() {
        return get() != 0;
    }

    @Override // p000.ajf
    public boolean offer(T t) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // p000.ajf
    @cib
    public T poll() {
        if (get() != 0) {
            return null;
        }
        lazySet(1);
        return this.f54748a;
    }

    @Override // p000.fdg
    public void request(long j) {
        if (mdg.validate(j) && compareAndSet(0, 1)) {
            ycg<? super T> ycgVar = this.f54749b;
            ycgVar.onNext(this.f54748a);
            if (get() != 2) {
                ycgVar.onComplete();
            }
        }
    }

    @Override // p000.wnd
    public int requestFusion(int i) {
        return i & 1;
    }

    @Override // p000.ajf
    public boolean offer(T t, T t2) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
