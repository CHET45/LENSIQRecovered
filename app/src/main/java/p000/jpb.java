package p000;

import io.reactivex.Observable;

/* JADX INFO: loaded from: classes7.dex */
public final class jpb<T> extends Observable<T> {

    /* JADX INFO: renamed from: a */
    public final T[] f51414a;

    /* JADX INFO: renamed from: jpb$a */
    public static final class C8006a<T> extends aw0<T> {

        /* JADX INFO: renamed from: a */
        public final oxb<? super T> f51415a;

        /* JADX INFO: renamed from: b */
        public final T[] f51416b;

        /* JADX INFO: renamed from: c */
        public int f51417c;

        /* JADX INFO: renamed from: d */
        public boolean f51418d;

        /* JADX INFO: renamed from: e */
        public volatile boolean f51419e;

        public C8006a(oxb<? super T> oxbVar, T[] tArr) {
            this.f51415a = oxbVar;
            this.f51416b = tArr;
        }

        /* JADX INFO: renamed from: a */
        public void m14229a() {
            T[] tArr = this.f51416b;
            int length = tArr.length;
            for (int i = 0; i < length && !isDisposed(); i++) {
                T t = tArr[i];
                if (t == null) {
                    this.f51415a.onError(new NullPointerException("The element at index " + i + " is null"));
                    return;
                }
                this.f51415a.onNext(t);
            }
            if (isDisposed()) {
                return;
            }
            this.f51415a.onComplete();
        }

        @Override // p000.ajf
        public void clear() {
            this.f51417c = this.f51416b.length;
        }

        @Override // p000.mf4
        public void dispose() {
            this.f51419e = true;
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f51419e;
        }

        @Override // p000.ajf
        public boolean isEmpty() {
            return this.f51417c == this.f51416b.length;
        }

        @Override // p000.ajf
        @cib
        public T poll() {
            int i = this.f51417c;
            T[] tArr = this.f51416b;
            if (i == tArr.length) {
                return null;
            }
            this.f51417c = i + 1;
            return (T) xjb.requireNonNull(tArr[i], "The array element is null");
        }

        @Override // p000.wnd
        public int requestFusion(int i) {
            if ((i & 1) == 0) {
                return 0;
            }
            this.f51418d = true;
            return 1;
        }
    }

    public jpb(T[] tArr) {
        this.f51414a = tArr;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(oxb<? super T> oxbVar) {
        C8006a c8006a = new C8006a(oxbVar, this.f51414a);
        oxbVar.onSubscribe(c8006a);
        if (c8006a.f51418d) {
            return;
        }
        c8006a.m14229a();
    }
}
