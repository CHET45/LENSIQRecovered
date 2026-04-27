package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class w5a<T> extends s4a<T> {

    /* JADX INFO: renamed from: a */
    public final aaa<T> f93288a;

    /* JADX INFO: renamed from: b */
    public final qh2 f93289b;

    /* JADX INFO: renamed from: w5a$a */
    public static final class C14395a<T> implements l9a<T> {

        /* JADX INFO: renamed from: a */
        public final AtomicReference<mf4> f93290a;

        /* JADX INFO: renamed from: b */
        public final l9a<? super T> f93291b;

        public C14395a(AtomicReference<mf4> atomicReference, l9a<? super T> l9aVar) {
            this.f93290a = atomicReference;
            this.f93291b = l9aVar;
        }

        @Override // p000.l9a
        public void onComplete() {
            this.f93291b.onComplete();
        }

        @Override // p000.l9a
        public void onError(Throwable th) {
            this.f93291b.onError(th);
        }

        @Override // p000.l9a
        public void onSubscribe(mf4 mf4Var) {
            ag4.replace(this.f93290a, mf4Var);
        }

        @Override // p000.l9a
        public void onSuccess(T t) {
            this.f93291b.onSuccess(t);
        }
    }

    /* JADX INFO: renamed from: w5a$b */
    public static final class C14396b<T> extends AtomicReference<mf4> implements dh2, mf4 {
        private static final long serialVersionUID = 703409937383992161L;

        /* JADX INFO: renamed from: a */
        public final l9a<? super T> f93292a;

        /* JADX INFO: renamed from: b */
        public final aaa<T> f93293b;

        public C14396b(l9a<? super T> l9aVar, aaa<T> aaaVar) {
            this.f93292a = l9aVar;
            this.f93293b = aaaVar;
        }

        @Override // p000.mf4
        public void dispose() {
            ag4.dispose(this);
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return ag4.isDisposed(get());
        }

        @Override // p000.dh2
        public void onComplete() {
            this.f93293b.subscribe(new C14395a(this, this.f93292a));
        }

        @Override // p000.dh2
        public void onError(Throwable th) {
            this.f93292a.onError(th);
        }

        @Override // p000.dh2
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.setOnce(this, mf4Var)) {
                this.f93292a.onSubscribe(this);
            }
        }
    }

    public w5a(aaa<T> aaaVar, qh2 qh2Var) {
        this.f93288a = aaaVar;
        this.f93289b = qh2Var;
    }

    @Override // p000.s4a
    public void subscribeActual(l9a<? super T> l9aVar) {
        this.f93289b.subscribe(new C14396b(l9aVar, this.f93288a));
    }
}
