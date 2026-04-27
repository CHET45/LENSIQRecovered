package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class i9a<T> extends AbstractC15921z2<T, T> {

    /* JADX INFO: renamed from: b */
    public final voe f46141b;

    /* JADX INFO: renamed from: i9a$a */
    public static final class RunnableC7196a<T> extends AtomicReference<mf4> implements l9a<T>, mf4, Runnable {
        private static final long serialVersionUID = 8571289934935992137L;

        /* JADX INFO: renamed from: a */
        public final l9a<? super T> f46142a;

        /* JADX INFO: renamed from: b */
        public final voe f46143b;

        /* JADX INFO: renamed from: c */
        public T f46144c;

        /* JADX INFO: renamed from: d */
        public Throwable f46145d;

        public RunnableC7196a(l9a<? super T> l9aVar, voe voeVar) {
            this.f46142a = l9aVar;
            this.f46143b = voeVar;
        }

        @Override // p000.mf4
        public void dispose() {
            ag4.dispose(this);
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return ag4.isDisposed(get());
        }

        @Override // p000.l9a
        public void onComplete() {
            ag4.replace(this, this.f46143b.scheduleDirect(this));
        }

        @Override // p000.l9a
        public void onError(Throwable th) {
            this.f46145d = th;
            ag4.replace(this, this.f46143b.scheduleDirect(this));
        }

        @Override // p000.l9a
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.setOnce(this, mf4Var)) {
                this.f46142a.onSubscribe(this);
            }
        }

        @Override // p000.l9a
        public void onSuccess(T t) {
            this.f46144c = t;
            ag4.replace(this, this.f46143b.scheduleDirect(this));
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable th = this.f46145d;
            if (th != null) {
                this.f46145d = null;
                this.f46142a.onError(th);
                return;
            }
            T t = this.f46144c;
            if (t == null) {
                this.f46142a.onComplete();
            } else {
                this.f46144c = null;
                this.f46142a.onSuccess(t);
            }
        }
    }

    public i9a(aaa<T> aaaVar, voe voeVar) {
        super(aaaVar);
        this.f46141b = voeVar;
    }

    @Override // p000.s4a
    public void subscribeActual(l9a<? super T> l9aVar) {
        this.f103681a.subscribe(new RunnableC7196a(l9aVar, this.f46141b));
    }
}
