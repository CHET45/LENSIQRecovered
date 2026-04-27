package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class f6a<T> extends AbstractC15921z2<T, T> {

    /* JADX INFO: renamed from: b */
    public final f11<? super T, ? super Throwable> f35487b;

    /* JADX INFO: renamed from: f6a$a */
    public static final class C5635a<T> implements l9a<T>, mf4 {

        /* JADX INFO: renamed from: a */
        public final l9a<? super T> f35488a;

        /* JADX INFO: renamed from: b */
        public final f11<? super T, ? super Throwable> f35489b;

        /* JADX INFO: renamed from: c */
        public mf4 f35490c;

        public C5635a(l9a<? super T> l9aVar, f11<? super T, ? super Throwable> f11Var) {
            this.f35488a = l9aVar;
            this.f35489b = f11Var;
        }

        @Override // p000.mf4
        public void dispose() {
            this.f35490c.dispose();
            this.f35490c = ag4.DISPOSED;
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f35490c.isDisposed();
        }

        @Override // p000.l9a
        public void onComplete() {
            this.f35490c = ag4.DISPOSED;
            try {
                this.f35489b.accept(null, null);
                this.f35488a.onComplete();
            } catch (Throwable th) {
                n75.throwIfFatal(th);
                this.f35488a.onError(th);
            }
        }

        @Override // p000.l9a
        public void onError(Throwable th) {
            this.f35490c = ag4.DISPOSED;
            try {
                this.f35489b.accept(null, th);
            } catch (Throwable th2) {
                n75.throwIfFatal(th2);
                th = new pm2(th, th2);
            }
            this.f35488a.onError(th);
        }

        @Override // p000.l9a
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.validate(this.f35490c, mf4Var)) {
                this.f35490c = mf4Var;
                this.f35488a.onSubscribe(this);
            }
        }

        @Override // p000.l9a
        public void onSuccess(T t) {
            this.f35490c = ag4.DISPOSED;
            try {
                this.f35489b.accept(t, null);
                this.f35488a.onSuccess(t);
            } catch (Throwable th) {
                n75.throwIfFatal(th);
                this.f35488a.onError(th);
            }
        }
    }

    public f6a(aaa<T> aaaVar, f11<? super T, ? super Throwable> f11Var) {
        super(aaaVar);
        this.f35487b = f11Var;
    }

    @Override // p000.s4a
    public void subscribeActual(l9a<? super T> l9aVar) {
        this.f103681a.subscribe(new C5635a(l9aVar, this.f35487b));
    }
}
