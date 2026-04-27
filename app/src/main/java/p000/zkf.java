package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class zkf<T> extends kjf<T> {

    /* JADX INFO: renamed from: a */
    public final kjf<T> f105353a;

    /* JADX INFO: renamed from: b */
    public final uu2<? super lf4> f105354b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC7776j8 f105355c;

    /* JADX INFO: renamed from: zkf$a */
    public static final class C16168a<T> implements hnf<T>, lf4 {

        /* JADX INFO: renamed from: a */
        public final hnf<? super T> f105356a;

        /* JADX INFO: renamed from: b */
        public final uu2<? super lf4> f105357b;

        /* JADX INFO: renamed from: c */
        public final InterfaceC7776j8 f105358c;

        /* JADX INFO: renamed from: d */
        public lf4 f105359d;

        public C16168a(hnf<? super T> downstream, uu2<? super lf4> onSubscribe, InterfaceC7776j8 onDispose) {
            this.f105356a = downstream;
            this.f105357b = onSubscribe;
            this.f105358c = onDispose;
        }

        @Override // p000.lf4
        public void dispose() {
            try {
                this.f105358c.run();
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                ofe.onError(th);
            }
            this.f105359d.dispose();
            this.f105359d = zf4.DISPOSED;
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f105359d.isDisposed();
        }

        @Override // p000.hnf
        public void onError(@cfb Throwable e) {
            lf4 lf4Var = this.f105359d;
            zf4 zf4Var = zf4.DISPOSED;
            if (lf4Var == zf4Var) {
                ofe.onError(e);
            } else {
                this.f105359d = zf4Var;
                this.f105356a.onError(e);
            }
        }

        @Override // p000.hnf
        public void onSubscribe(@cfb lf4 d) {
            try {
                this.f105357b.accept(d);
                if (zf4.validate(this.f105359d, d)) {
                    this.f105359d = d;
                    this.f105356a.onSubscribe(this);
                }
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                d.dispose();
                this.f105359d = zf4.DISPOSED;
                b05.error(th, this.f105356a);
            }
        }

        @Override // p000.hnf
        public void onSuccess(@cfb T t) {
            lf4 lf4Var = this.f105359d;
            zf4 zf4Var = zf4.DISPOSED;
            if (lf4Var != zf4Var) {
                this.f105359d = zf4Var;
                this.f105356a.onSuccess(t);
            }
        }
    }

    public zkf(kjf<T> upstream, uu2<? super lf4> onSubscribe, InterfaceC7776j8 onDispose) {
        this.f105353a = upstream;
        this.f105354b = onSubscribe;
        this.f105355c = onDispose;
    }

    @Override // p000.kjf
    public void subscribeActual(hnf<? super T> observer) {
        this.f105353a.subscribe(new C16168a(observer, this.f105354b, this.f105355c));
    }
}
