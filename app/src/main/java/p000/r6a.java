package p000;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class r6a<T> extends ljf<Boolean> {

    /* JADX INFO: renamed from: a */
    public final aaa<? extends T> f77128a;

    /* JADX INFO: renamed from: b */
    public final aaa<? extends T> f77129b;

    /* JADX INFO: renamed from: c */
    public final m11<? super T, ? super T> f77130c;

    /* JADX INFO: renamed from: r6a$a */
    public static final class C11904a<T> extends AtomicInteger implements mf4 {

        /* JADX INFO: renamed from: a */
        public final inf<? super Boolean> f77131a;

        /* JADX INFO: renamed from: b */
        public final C11905b<T> f77132b;

        /* JADX INFO: renamed from: c */
        public final C11905b<T> f77133c;

        /* JADX INFO: renamed from: d */
        public final m11<? super T, ? super T> f77134d;

        public C11904a(inf<? super Boolean> infVar, m11<? super T, ? super T> m11Var) {
            super(2);
            this.f77131a = infVar;
            this.f77134d = m11Var;
            this.f77132b = new C11905b<>(this);
            this.f77133c = new C11905b<>(this);
        }

        /* JADX INFO: renamed from: a */
        public void m21071a() {
            if (decrementAndGet() == 0) {
                Object obj = this.f77132b.f77136b;
                Object obj2 = this.f77133c.f77136b;
                if (obj == null || obj2 == null) {
                    this.f77131a.onSuccess(Boolean.valueOf(obj == null && obj2 == null));
                    return;
                }
                try {
                    this.f77131a.onSuccess(Boolean.valueOf(this.f77134d.test(obj, obj2)));
                } catch (Throwable th) {
                    n75.throwIfFatal(th);
                    this.f77131a.onError(th);
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public void m21072b(C11905b<T> c11905b, Throwable th) {
            if (getAndSet(0) <= 0) {
                pfe.onError(th);
                return;
            }
            C11905b<T> c11905b2 = this.f77132b;
            if (c11905b == c11905b2) {
                this.f77133c.dispose();
            } else {
                c11905b2.dispose();
            }
            this.f77131a.onError(th);
        }

        /* JADX INFO: renamed from: c */
        public void m21073c(aaa<? extends T> aaaVar, aaa<? extends T> aaaVar2) {
            aaaVar.subscribe(this.f77132b);
            aaaVar2.subscribe(this.f77133c);
        }

        @Override // p000.mf4
        public void dispose() {
            this.f77132b.dispose();
            this.f77133c.dispose();
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return ag4.isDisposed(this.f77132b.get());
        }
    }

    /* JADX INFO: renamed from: r6a$b */
    public static final class C11905b<T> extends AtomicReference<mf4> implements l9a<T> {
        private static final long serialVersionUID = -3031974433025990931L;

        /* JADX INFO: renamed from: a */
        public final C11904a<T> f77135a;

        /* JADX INFO: renamed from: b */
        public Object f77136b;

        public C11905b(C11904a<T> c11904a) {
            this.f77135a = c11904a;
        }

        public void dispose() {
            ag4.dispose(this);
        }

        @Override // p000.l9a
        public void onComplete() {
            this.f77135a.m21071a();
        }

        @Override // p000.l9a
        public void onError(Throwable th) {
            this.f77135a.m21072b(this, th);
        }

        @Override // p000.l9a
        public void onSubscribe(mf4 mf4Var) {
            ag4.setOnce(this, mf4Var);
        }

        @Override // p000.l9a
        public void onSuccess(T t) {
            this.f77136b = t;
            this.f77135a.m21071a();
        }
    }

    public r6a(aaa<? extends T> aaaVar, aaa<? extends T> aaaVar2, m11<? super T, ? super T> m11Var) {
        this.f77128a = aaaVar;
        this.f77129b = aaaVar2;
        this.f77130c = m11Var;
    }

    @Override // p000.ljf
    public void subscribeActual(inf<? super Boolean> infVar) {
        C11904a c11904a = new C11904a(infVar, this.f77130c);
        infVar.onSubscribe(c11904a);
        c11904a.m21073c(this.f77128a, this.f77129b);
    }
}
