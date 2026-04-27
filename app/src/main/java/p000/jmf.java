package p000;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes7.dex */
public final class jmf<T> extends ljf<T> {

    /* JADX INFO: renamed from: a */
    public final zjd<? extends T> f51263a;

    /* JADX INFO: renamed from: jmf$a */
    public static final class C7984a<T> implements lj6<T>, mf4 {

        /* JADX INFO: renamed from: a */
        public final inf<? super T> f51264a;

        /* JADX INFO: renamed from: b */
        public fdg f51265b;

        /* JADX INFO: renamed from: c */
        public T f51266c;

        /* JADX INFO: renamed from: d */
        public boolean f51267d;

        /* JADX INFO: renamed from: e */
        public volatile boolean f51268e;

        public C7984a(inf<? super T> infVar) {
            this.f51264a = infVar;
        }

        @Override // p000.mf4
        public void dispose() {
            this.f51268e = true;
            this.f51265b.cancel();
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f51268e;
        }

        @Override // p000.ycg
        public void onComplete() {
            if (this.f51267d) {
                return;
            }
            this.f51267d = true;
            T t = this.f51266c;
            this.f51266c = null;
            if (t == null) {
                this.f51264a.onError(new NoSuchElementException("The source Publisher is empty"));
            } else {
                this.f51264a.onSuccess(t);
            }
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            if (this.f51267d) {
                pfe.onError(th);
                return;
            }
            this.f51267d = true;
            this.f51266c = null;
            this.f51264a.onError(th);
        }

        @Override // p000.ycg
        public void onNext(T t) {
            if (this.f51267d) {
                return;
            }
            if (this.f51266c == null) {
                this.f51266c = t;
                return;
            }
            this.f51265b.cancel();
            this.f51267d = true;
            this.f51266c = null;
            this.f51264a.onError(new IndexOutOfBoundsException("Too many elements in the Publisher"));
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            if (mdg.validate(this.f51265b, fdgVar)) {
                this.f51265b = fdgVar;
                this.f51264a.onSubscribe(this);
                fdgVar.request(Long.MAX_VALUE);
            }
        }
    }

    public jmf(zjd<? extends T> zjdVar) {
        this.f51263a = zjdVar;
    }

    @Override // p000.ljf
    public void subscribeActual(inf<? super T> infVar) {
        this.f51263a.subscribe(new C7984a(infVar));
    }
}
