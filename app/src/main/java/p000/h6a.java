package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class h6a<T> extends AbstractC15397y2<T, T> {

    /* JADX INFO: renamed from: b */
    public final uu2<? super lf4> f42498b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC7776j8 f42499c;

    /* JADX INFO: renamed from: h6a$a */
    public static final class C6727a<T> implements k9a<T>, lf4 {

        /* JADX INFO: renamed from: a */
        public final k9a<? super T> f42500a;

        /* JADX INFO: renamed from: b */
        public final uu2<? super lf4> f42501b;

        /* JADX INFO: renamed from: c */
        public final InterfaceC7776j8 f42502c;

        /* JADX INFO: renamed from: d */
        public lf4 f42503d;

        public C6727a(k9a<? super T> downstream, uu2<? super lf4> onSubscribe, InterfaceC7776j8 onDispose) {
            this.f42500a = downstream;
            this.f42501b = onSubscribe;
            this.f42502c = onDispose;
        }

        @Override // p000.lf4
        public void dispose() {
            try {
                this.f42502c.run();
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                ofe.onError(th);
            }
            this.f42503d.dispose();
            this.f42503d = zf4.DISPOSED;
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f42503d.isDisposed();
        }

        @Override // p000.k9a
        public void onComplete() {
            lf4 lf4Var = this.f42503d;
            zf4 zf4Var = zf4.DISPOSED;
            if (lf4Var != zf4Var) {
                this.f42503d = zf4Var;
                this.f42500a.onComplete();
            }
        }

        @Override // p000.k9a
        public void onError(@cfb Throwable e) {
            lf4 lf4Var = this.f42503d;
            zf4 zf4Var = zf4.DISPOSED;
            if (lf4Var == zf4Var) {
                ofe.onError(e);
            } else {
                this.f42503d = zf4Var;
                this.f42500a.onError(e);
            }
        }

        @Override // p000.k9a
        public void onSubscribe(@cfb lf4 d) {
            try {
                this.f42501b.accept(d);
                if (zf4.validate(this.f42503d, d)) {
                    this.f42503d = d;
                    this.f42500a.onSubscribe(this);
                }
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                d.dispose();
                this.f42503d = zf4.DISPOSED;
                b05.error(th, this.f42500a);
            }
        }

        @Override // p000.k9a
        public void onSuccess(@cfb T t) {
            lf4 lf4Var = this.f42503d;
            zf4 zf4Var = zf4.DISPOSED;
            if (lf4Var != zf4Var) {
                this.f42503d = zf4Var;
                this.f42500a.onSuccess(t);
            }
        }
    }

    public h6a(r4a<T> upstream, uu2<? super lf4> onSubscribe, InterfaceC7776j8 onDispose) {
        super(upstream);
        this.f42498b = onSubscribe;
        this.f42499c = onDispose;
    }

    @Override // p000.r4a
    public void subscribeActual(k9a<? super T> observer) {
        this.f100099a.subscribe(new C6727a(observer, this.f42498b, this.f42499c));
    }
}
