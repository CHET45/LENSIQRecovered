package p000;

import io.reactivex.Observable;

/* JADX INFO: loaded from: classes7.dex */
public final class di2<T> extends Observable<T> {

    /* JADX INFO: renamed from: a */
    public final qh2 f29688a;

    /* JADX INFO: renamed from: di2$a */
    public static final class C4790a extends aw0<Void> implements dh2 {

        /* JADX INFO: renamed from: a */
        public final oxb<?> f29689a;

        /* JADX INFO: renamed from: b */
        public mf4 f29690b;

        public C4790a(oxb<?> oxbVar) {
            this.f29689a = oxbVar;
        }

        @Override // p000.ajf
        public void clear() {
        }

        @Override // p000.mf4
        public void dispose() {
            this.f29690b.dispose();
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f29690b.isDisposed();
        }

        @Override // p000.ajf
        public boolean isEmpty() {
            return true;
        }

        @Override // p000.dh2
        public void onComplete() {
            this.f29689a.onComplete();
        }

        @Override // p000.dh2
        public void onError(Throwable th) {
            this.f29689a.onError(th);
        }

        @Override // p000.dh2
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.validate(this.f29690b, mf4Var)) {
                this.f29690b = mf4Var;
                this.f29689a.onSubscribe(this);
            }
        }

        @Override // p000.wnd
        public int requestFusion(int i) {
            return i & 2;
        }

        @Override // p000.ajf
        public Void poll() throws Exception {
            return null;
        }
    }

    public di2(qh2 qh2Var) {
        this.f29688a = qh2Var;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(oxb<? super T> oxbVar) {
        this.f29688a.subscribe(new C4790a(oxbVar));
    }
}
