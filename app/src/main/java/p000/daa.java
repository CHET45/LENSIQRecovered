package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class daa<T> extends AbstractC15921z2<T, T> {

    /* JADX INFO: renamed from: b */
    public final voe f29073b;

    /* JADX INFO: renamed from: daa$a */
    public static final class C4703a<T> extends AtomicReference<mf4> implements l9a<T>, mf4 {
        private static final long serialVersionUID = 8571289934935992137L;

        /* JADX INFO: renamed from: a */
        public final b0f f29074a = new b0f();

        /* JADX INFO: renamed from: b */
        public final l9a<? super T> f29075b;

        public C4703a(l9a<? super T> l9aVar) {
            this.f29075b = l9aVar;
        }

        @Override // p000.mf4
        public void dispose() {
            ag4.dispose(this);
            this.f29074a.dispose();
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return ag4.isDisposed(get());
        }

        @Override // p000.l9a
        public void onComplete() {
            this.f29075b.onComplete();
        }

        @Override // p000.l9a
        public void onError(Throwable th) {
            this.f29075b.onError(th);
        }

        @Override // p000.l9a
        public void onSubscribe(mf4 mf4Var) {
            ag4.setOnce(this, mf4Var);
        }

        @Override // p000.l9a
        public void onSuccess(T t) {
            this.f29075b.onSuccess(t);
        }
    }

    /* JADX INFO: renamed from: daa$b */
    public static final class RunnableC4704b<T> implements Runnable {

        /* JADX INFO: renamed from: a */
        public final l9a<? super T> f29076a;

        /* JADX INFO: renamed from: b */
        public final aaa<T> f29077b;

        public RunnableC4704b(l9a<? super T> l9aVar, aaa<T> aaaVar) {
            this.f29076a = l9aVar;
            this.f29077b = aaaVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f29077b.subscribe(this.f29076a);
        }
    }

    public daa(aaa<T> aaaVar, voe voeVar) {
        super(aaaVar);
        this.f29073b = voeVar;
    }

    @Override // p000.s4a
    public void subscribeActual(l9a<? super T> l9aVar) {
        C4703a c4703a = new C4703a(l9aVar);
        l9aVar.onSubscribe(c4703a);
        c4703a.f29074a.replace(this.f29073b.scheduleDirect(new RunnableC4704b(c4703a, this.f103681a)));
    }
}
