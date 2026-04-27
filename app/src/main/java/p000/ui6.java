package p000;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes7.dex */
public final class ui6<T> extends ljf<T> implements v07<T> {

    /* JADX INFO: renamed from: a */
    public final m86<T> f88043a;

    /* JADX INFO: renamed from: b */
    public final T f88044b;

    /* JADX INFO: renamed from: ui6$a */
    public static final class C13544a<T> implements lj6<T>, mf4 {

        /* JADX INFO: renamed from: a */
        public final inf<? super T> f88045a;

        /* JADX INFO: renamed from: b */
        public final T f88046b;

        /* JADX INFO: renamed from: c */
        public fdg f88047c;

        /* JADX INFO: renamed from: d */
        public boolean f88048d;

        /* JADX INFO: renamed from: e */
        public T f88049e;

        public C13544a(inf<? super T> infVar, T t) {
            this.f88045a = infVar;
            this.f88046b = t;
        }

        @Override // p000.mf4
        public void dispose() {
            this.f88047c.cancel();
            this.f88047c = mdg.CANCELLED;
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f88047c == mdg.CANCELLED;
        }

        @Override // p000.ycg
        public void onComplete() {
            if (this.f88048d) {
                return;
            }
            this.f88048d = true;
            this.f88047c = mdg.CANCELLED;
            T t = this.f88049e;
            this.f88049e = null;
            if (t == null) {
                t = this.f88046b;
            }
            if (t != null) {
                this.f88045a.onSuccess(t);
            } else {
                this.f88045a.onError(new NoSuchElementException());
            }
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            if (this.f88048d) {
                pfe.onError(th);
                return;
            }
            this.f88048d = true;
            this.f88047c = mdg.CANCELLED;
            this.f88045a.onError(th);
        }

        @Override // p000.ycg
        public void onNext(T t) {
            if (this.f88048d) {
                return;
            }
            if (this.f88049e == null) {
                this.f88049e = t;
                return;
            }
            this.f88048d = true;
            this.f88047c.cancel();
            this.f88047c = mdg.CANCELLED;
            this.f88045a.onError(new IllegalArgumentException("Sequence contains more than one element!"));
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            if (mdg.validate(this.f88047c, fdgVar)) {
                this.f88047c = fdgVar;
                this.f88045a.onSubscribe(this);
                fdgVar.request(Long.MAX_VALUE);
            }
        }
    }

    public ui6(m86<T> m86Var, T t) {
        this.f88043a = m86Var;
        this.f88044b = t;
    }

    @Override // p000.v07
    public m86<T> fuseToFlowable() {
        return pfe.onAssembly(new qi6(this.f88043a, this.f88044b, true));
    }

    @Override // p000.ljf
    public void subscribeActual(inf<? super T> infVar) {
        this.f88043a.subscribe((lj6) new C13544a(infVar, this.f88044b));
    }
}
