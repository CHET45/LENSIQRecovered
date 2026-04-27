package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class x9a<T> extends AbstractC15397y2<T, T> {

    /* JADX INFO: renamed from: b */
    public final uu2<? super lf4> f97291b;

    /* JADX INFO: renamed from: c */
    public final uu2<? super T> f97292c;

    /* JADX INFO: renamed from: d */
    public final uu2<? super Throwable> f97293d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC7776j8 f97294e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC7776j8 f97295f;

    /* JADX INFO: renamed from: m */
    public final InterfaceC7776j8 f97296m;

    /* JADX INFO: renamed from: x9a$a */
    public static final class C15006a<T> implements k9a<T>, lf4 {

        /* JADX INFO: renamed from: a */
        public final k9a<? super T> f97297a;

        /* JADX INFO: renamed from: b */
        public final x9a<T> f97298b;

        /* JADX INFO: renamed from: c */
        public lf4 f97299c;

        public C15006a(k9a<? super T> actual, x9a<T> parent) {
            this.f97297a = actual;
            this.f97298b = parent;
        }

        /* JADX INFO: renamed from: a */
        public void m25067a() {
            try {
                this.f97298b.f97295f.run();
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                ofe.onError(th);
            }
        }

        /* JADX INFO: renamed from: b */
        public void m25068b(Throwable e) {
            try {
                this.f97298b.f97293d.accept(e);
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                e = new qm2(e, th);
            }
            this.f97299c = zf4.DISPOSED;
            this.f97297a.onError(e);
            m25067a();
        }

        @Override // p000.lf4
        public void dispose() {
            try {
                this.f97298b.f97296m.run();
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                ofe.onError(th);
            }
            this.f97299c.dispose();
            this.f97299c = zf4.DISPOSED;
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f97299c.isDisposed();
        }

        @Override // p000.k9a
        public void onComplete() {
            lf4 lf4Var = this.f97299c;
            zf4 zf4Var = zf4.DISPOSED;
            if (lf4Var == zf4Var) {
                return;
            }
            try {
                this.f97298b.f97294e.run();
                this.f97299c = zf4Var;
                this.f97297a.onComplete();
                m25067a();
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                m25068b(th);
            }
        }

        @Override // p000.k9a
        public void onError(Throwable e) {
            if (this.f97299c == zf4.DISPOSED) {
                ofe.onError(e);
            } else {
                m25068b(e);
            }
        }

        @Override // p000.k9a
        public void onSubscribe(lf4 d) {
            if (zf4.validate(this.f97299c, d)) {
                try {
                    this.f97298b.f97291b.accept(d);
                    this.f97299c = d;
                    this.f97297a.onSubscribe(this);
                } catch (Throwable th) {
                    o75.throwIfFatal(th);
                    d.dispose();
                    this.f97299c = zf4.DISPOSED;
                    b05.error(th, this.f97297a);
                }
            }
        }

        @Override // p000.k9a
        public void onSuccess(T value) {
            lf4 lf4Var = this.f97299c;
            zf4 zf4Var = zf4.DISPOSED;
            if (lf4Var == zf4Var) {
                return;
            }
            try {
                this.f97298b.f97292c.accept(value);
                this.f97299c = zf4Var;
                this.f97297a.onSuccess(value);
                m25067a();
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                m25068b(th);
            }
        }
    }

    public x9a(z9a<T> source, uu2<? super lf4> onSubscribeCall, uu2<? super T> onSuccessCall, uu2<? super Throwable> onErrorCall, InterfaceC7776j8 onCompleteCall, InterfaceC7776j8 onAfterTerminate, InterfaceC7776j8 onDispose) {
        super(source);
        this.f97291b = onSubscribeCall;
        this.f97292c = onSuccessCall;
        this.f97293d = onErrorCall;
        this.f97294e = onCompleteCall;
        this.f97295f = onAfterTerminate;
        this.f97296m = onDispose;
    }

    @Override // p000.r4a
    public void subscribeActual(k9a<? super T> observer) {
        this.f100099a.subscribe(new C15006a(observer, this));
    }
}
