package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class mh2 extends xd2 {

    /* JADX INFO: renamed from: a */
    public final ph2 f60994a;

    /* JADX INFO: renamed from: b */
    public final uu2<? super lf4> f60995b;

    /* JADX INFO: renamed from: c */
    public final uu2<? super Throwable> f60996c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC7776j8 f60997d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC7776j8 f60998e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC7776j8 f60999f;

    /* JADX INFO: renamed from: m */
    public final InterfaceC7776j8 f61000m;

    /* JADX INFO: renamed from: mh2$a */
    public final class C9353a implements ch2, lf4 {

        /* JADX INFO: renamed from: a */
        public final ch2 f61001a;

        /* JADX INFO: renamed from: b */
        public lf4 f61002b;

        public C9353a(ch2 downstream) {
            this.f61001a = downstream;
        }

        /* JADX INFO: renamed from: a */
        public void m17312a() {
            try {
                mh2.this.f60999f.run();
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                ofe.onError(th);
            }
        }

        @Override // p000.lf4
        public void dispose() {
            try {
                mh2.this.f61000m.run();
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                ofe.onError(th);
            }
            this.f61002b.dispose();
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f61002b.isDisposed();
        }

        @Override // p000.ch2, p000.k9a
        public void onComplete() {
            if (this.f61002b == zf4.DISPOSED) {
                return;
            }
            try {
                mh2.this.f60997d.run();
                mh2.this.f60998e.run();
                this.f61001a.onComplete();
                m17312a();
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                this.f61001a.onError(th);
            }
        }

        @Override // p000.ch2
        public void onError(Throwable e) {
            if (this.f61002b == zf4.DISPOSED) {
                ofe.onError(e);
                return;
            }
            try {
                mh2.this.f60996c.accept(e);
                mh2.this.f60998e.run();
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                e = new qm2(e, th);
            }
            this.f61001a.onError(e);
            m17312a();
        }

        @Override // p000.ch2
        public void onSubscribe(final lf4 d) {
            try {
                mh2.this.f60995b.accept(d);
                if (zf4.validate(this.f61002b, d)) {
                    this.f61002b = d;
                    this.f61001a.onSubscribe(this);
                }
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                d.dispose();
                this.f61002b = zf4.DISPOSED;
                b05.error(th, this.f61001a);
            }
        }
    }

    public mh2(ph2 source, uu2<? super lf4> onSubscribe, uu2<? super Throwable> onError, InterfaceC7776j8 onComplete, InterfaceC7776j8 onTerminate, InterfaceC7776j8 onAfterTerminate, InterfaceC7776j8 onDispose) {
        this.f60994a = source;
        this.f60995b = onSubscribe;
        this.f60996c = onError;
        this.f60997d = onComplete;
        this.f60998e = onTerminate;
        this.f60999f = onAfterTerminate;
        this.f61000m = onDispose;
    }

    @Override // p000.xd2
    public void subscribeActual(final ch2 observer) {
        this.f60994a.subscribe(new C9353a(observer));
    }
}
