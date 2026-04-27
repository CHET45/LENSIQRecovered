package p000;

import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public final class vec<T> extends eec<T> {

    /* JADX INFO: renamed from: a */
    public final eec<T> f90797a;

    /* JADX INFO: renamed from: b */
    public final uu2<? super T> f90798b;

    /* JADX INFO: renamed from: c */
    public final uu2<? super T> f90799c;

    /* JADX INFO: renamed from: d */
    public final uu2<? super Throwable> f90800d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC7776j8 f90801e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC7776j8 f90802f;

    /* JADX INFO: renamed from: g */
    public final uu2<? super fdg> f90803g;

    /* JADX INFO: renamed from: h */
    public final xk9 f90804h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC7776j8 f90805i;

    /* JADX INFO: renamed from: vec$a */
    public static final class C14019a<T> implements kj6<T>, fdg {

        /* JADX INFO: renamed from: a */
        public final ycg<? super T> f90806a;

        /* JADX INFO: renamed from: b */
        public final vec<T> f90807b;

        /* JADX INFO: renamed from: c */
        public fdg f90808c;

        /* JADX INFO: renamed from: d */
        public boolean f90809d;

        public C14019a(ycg<? super T> actual, vec<T> parent) {
            this.f90806a = actual;
            this.f90807b = parent;
        }

        @Override // p000.fdg
        public void cancel() {
            try {
                this.f90807b.f90805i.run();
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                ofe.onError(th);
            }
            this.f90808c.cancel();
        }

        @Override // p000.ycg
        public void onComplete() {
            if (this.f90809d) {
                return;
            }
            this.f90809d = true;
            try {
                this.f90807b.f90801e.run();
                this.f90806a.onComplete();
                try {
                    this.f90807b.f90802f.run();
                } catch (Throwable th) {
                    o75.throwIfFatal(th);
                    ofe.onError(th);
                }
            } catch (Throwable th2) {
                o75.throwIfFatal(th2);
                this.f90806a.onError(th2);
            }
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            if (this.f90809d) {
                ofe.onError(t);
                return;
            }
            this.f90809d = true;
            try {
                this.f90807b.f90800d.accept(t);
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                t = new qm2(t, th);
            }
            this.f90806a.onError(t);
            try {
                this.f90807b.f90802f.run();
            } catch (Throwable th2) {
                o75.throwIfFatal(th2);
                ofe.onError(th2);
            }
        }

        @Override // p000.ycg
        public void onNext(T t) {
            if (this.f90809d) {
                return;
            }
            try {
                this.f90807b.f90798b.accept(t);
                this.f90806a.onNext(t);
                try {
                    this.f90807b.f90799c.accept(t);
                } catch (Throwable th) {
                    o75.throwIfFatal(th);
                    onError(th);
                }
            } catch (Throwable th2) {
                o75.throwIfFatal(th2);
                onError(th2);
            }
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            if (ldg.validate(this.f90808c, s)) {
                this.f90808c = s;
                try {
                    this.f90807b.f90803g.accept(s);
                    this.f90806a.onSubscribe(this);
                } catch (Throwable th) {
                    o75.throwIfFatal(th);
                    s.cancel();
                    this.f90806a.onSubscribe(w05.INSTANCE);
                    onError(th);
                }
            }
        }

        @Override // p000.fdg
        public void request(long n) {
            try {
                this.f90807b.f90804h.accept(n);
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                ofe.onError(th);
            }
            this.f90808c.request(n);
        }
    }

    public vec(eec<T> source, uu2<? super T> onNext, uu2<? super T> onAfterNext, uu2<? super Throwable> onError, InterfaceC7776j8 onComplete, InterfaceC7776j8 onAfterTerminated, uu2<? super fdg> onSubscribe, xk9 onRequest, InterfaceC7776j8 onCancel) {
        this.f90797a = source;
        Objects.requireNonNull(onNext, "onNext is null");
        this.f90798b = onNext;
        Objects.requireNonNull(onAfterNext, "onAfterNext is null");
        this.f90799c = onAfterNext;
        Objects.requireNonNull(onError, "onError is null");
        this.f90800d = onError;
        Objects.requireNonNull(onComplete, "onComplete is null");
        this.f90801e = onComplete;
        Objects.requireNonNull(onAfterTerminated, "onAfterTerminated is null");
        this.f90802f = onAfterTerminated;
        Objects.requireNonNull(onSubscribe, "onSubscribe is null");
        this.f90803g = onSubscribe;
        Objects.requireNonNull(onRequest, "onRequest is null");
        this.f90804h = onRequest;
        Objects.requireNonNull(onCancel, "onCancel is null");
        this.f90805i = onCancel;
    }

    @Override // p000.eec
    public int parallelism() {
        return this.f90797a.parallelism();
    }

    @Override // p000.eec
    public void subscribe(ycg<? super T>[] subscribers) {
        ycg<?>[] ycgVarArrOnSubscribe = ofe.onSubscribe(this, subscribers);
        if (m9902a(ycgVarArrOnSubscribe)) {
            int length = ycgVarArrOnSubscribe.length;
            ycg<? super T>[] ycgVarArr = new ycg[length];
            for (int i = 0; i < length; i++) {
                ycgVarArr[i] = new C14019a(ycgVarArrOnSubscribe[i], this);
            }
            this.f90797a.subscribe(ycgVarArr);
        }
    }
}
