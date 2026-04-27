package p000;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes7.dex */
public final class we6<T> extends ljf<T> {

    /* JADX INFO: renamed from: a */
    public final zjd<T> f94024a;

    /* JADX INFO: renamed from: b */
    public final T f94025b;

    /* JADX INFO: renamed from: we6$a */
    public static final class C14564a<T> implements lj6<T>, mf4 {

        /* JADX INFO: renamed from: a */
        public final inf<? super T> f94026a;

        /* JADX INFO: renamed from: b */
        public final T f94027b;

        /* JADX INFO: renamed from: c */
        public fdg f94028c;

        /* JADX INFO: renamed from: d */
        public T f94029d;

        public C14564a(inf<? super T> infVar, T t) {
            this.f94026a = infVar;
            this.f94027b = t;
        }

        @Override // p000.mf4
        public void dispose() {
            this.f94028c.cancel();
            this.f94028c = mdg.CANCELLED;
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f94028c == mdg.CANCELLED;
        }

        @Override // p000.ycg
        public void onComplete() {
            this.f94028c = mdg.CANCELLED;
            T t = this.f94029d;
            if (t != null) {
                this.f94029d = null;
                this.f94026a.onSuccess(t);
                return;
            }
            T t2 = this.f94027b;
            if (t2 != null) {
                this.f94026a.onSuccess(t2);
            } else {
                this.f94026a.onError(new NoSuchElementException());
            }
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            this.f94028c = mdg.CANCELLED;
            this.f94029d = null;
            this.f94026a.onError(th);
        }

        @Override // p000.ycg
        public void onNext(T t) {
            this.f94029d = t;
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            if (mdg.validate(this.f94028c, fdgVar)) {
                this.f94028c = fdgVar;
                this.f94026a.onSubscribe(this);
                fdgVar.request(Long.MAX_VALUE);
            }
        }
    }

    public we6(zjd<T> zjdVar, T t) {
        this.f94024a = zjdVar;
        this.f94025b = t;
    }

    @Override // p000.ljf
    public void subscribeActual(inf<? super T> infVar) {
        this.f94024a.subscribe(new C14564a(infVar, this.f94025b));
    }
}
