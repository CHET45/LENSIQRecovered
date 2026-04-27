package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class zb6<T> extends AbstractC7714j1<T, T> {

    /* JADX INFO: renamed from: c */
    public final uu2<? super fdg> f104674c;

    /* JADX INFO: renamed from: d */
    public final xk9 f104675d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC7776j8 f104676e;

    /* JADX INFO: renamed from: zb6$a */
    public static final class C16063a<T> implements kj6<T>, fdg {

        /* JADX INFO: renamed from: a */
        public final ycg<? super T> f104677a;

        /* JADX INFO: renamed from: b */
        public final uu2<? super fdg> f104678b;

        /* JADX INFO: renamed from: c */
        public final xk9 f104679c;

        /* JADX INFO: renamed from: d */
        public final InterfaceC7776j8 f104680d;

        /* JADX INFO: renamed from: e */
        public fdg f104681e;

        public C16063a(ycg<? super T> actual, uu2<? super fdg> onSubscribe, xk9 onRequest, InterfaceC7776j8 onCancel) {
            this.f104677a = actual;
            this.f104678b = onSubscribe;
            this.f104680d = onCancel;
            this.f104679c = onRequest;
        }

        @Override // p000.fdg
        public void cancel() {
            fdg fdgVar = this.f104681e;
            ldg ldgVar = ldg.CANCELLED;
            if (fdgVar != ldgVar) {
                this.f104681e = ldgVar;
                try {
                    this.f104680d.run();
                } catch (Throwable th) {
                    o75.throwIfFatal(th);
                    ofe.onError(th);
                }
                fdgVar.cancel();
            }
        }

        @Override // p000.ycg
        public void onComplete() {
            if (this.f104681e != ldg.CANCELLED) {
                this.f104677a.onComplete();
            }
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            if (this.f104681e != ldg.CANCELLED) {
                this.f104677a.onError(t);
            } else {
                ofe.onError(t);
            }
        }

        @Override // p000.ycg
        public void onNext(T t) {
            this.f104677a.onNext(t);
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            try {
                this.f104678b.accept(s);
                if (ldg.validate(this.f104681e, s)) {
                    this.f104681e = s;
                    this.f104677a.onSubscribe(this);
                }
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                s.cancel();
                this.f104681e = ldg.CANCELLED;
                w05.error(th, this.f104677a);
            }
        }

        @Override // p000.fdg
        public void request(long n) {
            try {
                this.f104679c.accept(n);
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                ofe.onError(th);
            }
            this.f104681e.request(n);
        }
    }

    public zb6(l86<T> source, uu2<? super fdg> onSubscribe, xk9 onRequest, InterfaceC7776j8 onCancel) {
        super(source);
        this.f104674c = onSubscribe;
        this.f104675d = onRequest;
        this.f104676e = onCancel;
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super T> s) {
        this.f49321b.subscribe((kj6) new C16063a(s, this.f104674c, this.f104675d, this.f104676e));
    }
}
