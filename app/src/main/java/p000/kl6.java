package p000;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes7.dex */
public final class kl6<T, D> extends l86<T> {

    /* JADX INFO: renamed from: b */
    public final nfg<? extends D> f54607b;

    /* JADX INFO: renamed from: c */
    public final sy6<? super D, ? extends zjd<? extends T>> f54608c;

    /* JADX INFO: renamed from: d */
    public final uu2<? super D> f54609d;

    /* JADX INFO: renamed from: e */
    public final boolean f54610e;

    /* JADX INFO: renamed from: kl6$a */
    public static final class C8443a<T, D> extends AtomicBoolean implements kj6<T>, fdg {
        private static final long serialVersionUID = 5904473792286235046L;

        /* JADX INFO: renamed from: a */
        public final ycg<? super T> f54611a;

        /* JADX INFO: renamed from: b */
        public final D f54612b;

        /* JADX INFO: renamed from: c */
        public final uu2<? super D> f54613c;

        /* JADX INFO: renamed from: d */
        public final boolean f54614d;

        /* JADX INFO: renamed from: e */
        public fdg f54615e;

        public C8443a(ycg<? super T> actual, D resource, uu2<? super D> disposer, boolean eager) {
            this.f54611a = actual;
            this.f54612b = resource;
            this.f54613c = disposer;
            this.f54614d = eager;
        }

        /* JADX INFO: renamed from: a */
        public void m14818a() {
            if (compareAndSet(false, true)) {
                try {
                    this.f54613c.accept(this.f54612b);
                } catch (Throwable th) {
                    o75.throwIfFatal(th);
                    ofe.onError(th);
                }
            }
        }

        @Override // p000.fdg
        public void cancel() {
            if (this.f54614d) {
                m14818a();
                this.f54615e.cancel();
                this.f54615e = ldg.CANCELLED;
            } else {
                this.f54615e.cancel();
                this.f54615e = ldg.CANCELLED;
                m14818a();
            }
        }

        @Override // p000.ycg
        public void onComplete() {
            if (!this.f54614d) {
                this.f54611a.onComplete();
                m14818a();
                return;
            }
            if (compareAndSet(false, true)) {
                try {
                    this.f54613c.accept(this.f54612b);
                } catch (Throwable th) {
                    o75.throwIfFatal(th);
                    this.f54611a.onError(th);
                    return;
                }
            }
            this.f54611a.onComplete();
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            if (!this.f54614d) {
                this.f54611a.onError(th);
                m14818a();
                return;
            }
            if (compareAndSet(false, true)) {
                try {
                    this.f54613c.accept(this.f54612b);
                    th = null;
                } catch (Throwable th2) {
                    th = th2;
                    o75.throwIfFatal(th);
                }
            } else {
                th = null;
            }
            if (th != null) {
                this.f54611a.onError(new qm2(th, th));
            } else {
                this.f54611a.onError(th);
            }
        }

        @Override // p000.ycg
        public void onNext(T t) {
            this.f54611a.onNext(t);
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            if (ldg.validate(this.f54615e, s)) {
                this.f54615e = s;
                this.f54611a.onSubscribe(this);
            }
        }

        @Override // p000.fdg
        public void request(long n) {
            this.f54615e.request(n);
        }
    }

    public kl6(nfg<? extends D> resourceSupplier, sy6<? super D, ? extends zjd<? extends T>> sourceSupplier, uu2<? super D> disposer, boolean eager) {
        this.f54607b = resourceSupplier;
        this.f54608c = sourceSupplier;
        this.f54609d = disposer;
        this.f54610e = eager;
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super T> s) {
        try {
            D d = this.f54607b.get();
            try {
                zjd<? extends T> zjdVarApply = this.f54608c.apply(d);
                Objects.requireNonNull(zjdVarApply, "The sourceSupplier returned a null Publisher");
                zjdVarApply.subscribe(new C8443a(s, d, this.f54609d, this.f54610e));
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                try {
                    this.f54609d.accept(d);
                    w05.error(th, s);
                } catch (Throwable th2) {
                    o75.throwIfFatal(th2);
                    w05.error(new qm2(th, th2), s);
                }
            }
        } catch (Throwable th3) {
            o75.throwIfFatal(th3);
            w05.error(th3, s);
        }
    }
}
