package p000;

import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class qaa<T, U> extends AbstractC15921z2<T, T> {

    /* JADX INFO: renamed from: b */
    public final zjd<U> f73743b;

    /* JADX INFO: renamed from: c */
    public final aaa<? extends T> f73744c;

    /* JADX INFO: renamed from: qaa$a */
    public static final class C11397a<T> extends AtomicReference<mf4> implements l9a<T> {
        private static final long serialVersionUID = 8663801314800248617L;

        /* JADX INFO: renamed from: a */
        public final l9a<? super T> f73745a;

        public C11397a(l9a<? super T> l9aVar) {
            this.f73745a = l9aVar;
        }

        @Override // p000.l9a
        public void onComplete() {
            this.f73745a.onComplete();
        }

        @Override // p000.l9a
        public void onError(Throwable th) {
            this.f73745a.onError(th);
        }

        @Override // p000.l9a
        public void onSubscribe(mf4 mf4Var) {
            ag4.setOnce(this, mf4Var);
        }

        @Override // p000.l9a
        public void onSuccess(T t) {
            this.f73745a.onSuccess(t);
        }
    }

    /* JADX INFO: renamed from: qaa$b */
    public static final class C11398b<T, U> extends AtomicReference<mf4> implements l9a<T>, mf4 {
        private static final long serialVersionUID = -5955289211445418871L;

        /* JADX INFO: renamed from: a */
        public final l9a<? super T> f73746a;

        /* JADX INFO: renamed from: b */
        public final C11399c<T, U> f73747b = new C11399c<>(this);

        /* JADX INFO: renamed from: c */
        public final aaa<? extends T> f73748c;

        /* JADX INFO: renamed from: d */
        public final C11397a<T> f73749d;

        public C11398b(l9a<? super T> l9aVar, aaa<? extends T> aaaVar) {
            this.f73746a = l9aVar;
            this.f73748c = aaaVar;
            this.f73749d = aaaVar != null ? new C11397a<>(l9aVar) : null;
        }

        @Override // p000.mf4
        public void dispose() {
            ag4.dispose(this);
            mdg.cancel(this.f73747b);
            C11397a<T> c11397a = this.f73749d;
            if (c11397a != null) {
                ag4.dispose(c11397a);
            }
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return ag4.isDisposed(get());
        }

        @Override // p000.l9a
        public void onComplete() {
            mdg.cancel(this.f73747b);
            ag4 ag4Var = ag4.DISPOSED;
            if (getAndSet(ag4Var) != ag4Var) {
                this.f73746a.onComplete();
            }
        }

        @Override // p000.l9a
        public void onError(Throwable th) {
            mdg.cancel(this.f73747b);
            ag4 ag4Var = ag4.DISPOSED;
            if (getAndSet(ag4Var) != ag4Var) {
                this.f73746a.onError(th);
            } else {
                pfe.onError(th);
            }
        }

        @Override // p000.l9a
        public void onSubscribe(mf4 mf4Var) {
            ag4.setOnce(this, mf4Var);
        }

        @Override // p000.l9a
        public void onSuccess(T t) {
            mdg.cancel(this.f73747b);
            ag4 ag4Var = ag4.DISPOSED;
            if (getAndSet(ag4Var) != ag4Var) {
                this.f73746a.onSuccess(t);
            }
        }

        public void otherComplete() {
            if (ag4.dispose(this)) {
                aaa<? extends T> aaaVar = this.f73748c;
                if (aaaVar == null) {
                    this.f73746a.onError(new TimeoutException());
                } else {
                    aaaVar.subscribe(this.f73749d);
                }
            }
        }

        public void otherError(Throwable th) {
            if (ag4.dispose(this)) {
                this.f73746a.onError(th);
            } else {
                pfe.onError(th);
            }
        }
    }

    /* JADX INFO: renamed from: qaa$c */
    public static final class C11399c<T, U> extends AtomicReference<fdg> implements lj6<Object> {
        private static final long serialVersionUID = 8663801314800248617L;

        /* JADX INFO: renamed from: a */
        public final C11398b<T, U> f73750a;

        public C11399c(C11398b<T, U> c11398b) {
            this.f73750a = c11398b;
        }

        @Override // p000.ycg
        public void onComplete() {
            this.f73750a.otherComplete();
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            this.f73750a.otherError(th);
        }

        @Override // p000.ycg
        public void onNext(Object obj) {
            get().cancel();
            this.f73750a.otherComplete();
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            mdg.setOnce(this, fdgVar, Long.MAX_VALUE);
        }
    }

    public qaa(aaa<T> aaaVar, zjd<U> zjdVar, aaa<? extends T> aaaVar2) {
        super(aaaVar);
        this.f73743b = zjdVar;
        this.f73744c = aaaVar2;
    }

    @Override // p000.s4a
    public void subscribeActual(l9a<? super T> l9aVar) {
        C11398b c11398b = new C11398b(l9aVar, this.f73744c);
        l9aVar.onSubscribe(c11398b);
        this.f73743b.subscribe(c11398b.f73747b);
        this.f103681a.subscribe(c11398b);
    }
}
