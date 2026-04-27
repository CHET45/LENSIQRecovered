package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class j6a<T> extends r4a<T> {

    /* JADX INFO: renamed from: a */
    public final z9a<T> f49625a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC7776j8 f49626b;

    /* JADX INFO: renamed from: j6a$a */
    public final class C7756a implements k9a<T> {

        /* JADX INFO: renamed from: a */
        public final k9a<? super T> f49627a;

        public C7756a(k9a<? super T> observer) {
            this.f49627a = observer;
        }

        @Override // p000.k9a
        public void onComplete() {
            try {
                j6a.this.f49626b.run();
                this.f49627a.onComplete();
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                this.f49627a.onError(th);
            }
        }

        @Override // p000.k9a
        public void onError(Throwable e) {
            try {
                j6a.this.f49626b.run();
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                e = new qm2(e, th);
            }
            this.f49627a.onError(e);
        }

        @Override // p000.k9a
        public void onSubscribe(lf4 d) {
            this.f49627a.onSubscribe(d);
        }

        @Override // p000.k9a
        public void onSuccess(T value) {
            try {
                j6a.this.f49626b.run();
                this.f49627a.onSuccess(value);
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                this.f49627a.onError(th);
            }
        }
    }

    public j6a(z9a<T> source, InterfaceC7776j8 onTerminate) {
        this.f49625a = source;
        this.f49626b = onTerminate;
    }

    @Override // p000.r4a
    public void subscribeActual(k9a<? super T> observer) {
        this.f49625a.subscribe(new C7756a(observer));
    }
}
