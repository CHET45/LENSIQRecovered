package p000;

import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class oaa<T, U> extends AbstractC15921z2<T, T> {

    /* JADX INFO: renamed from: b */
    public final aaa<U> f66982b;

    /* JADX INFO: renamed from: c */
    public final aaa<? extends T> f66983c;

    /* JADX INFO: renamed from: oaa$a */
    public static final class C10280a<T> extends AtomicReference<mf4> implements l9a<T> {
        private static final long serialVersionUID = 8663801314800248617L;

        /* JADX INFO: renamed from: a */
        public final l9a<? super T> f66984a;

        public C10280a(l9a<? super T> l9aVar) {
            this.f66984a = l9aVar;
        }

        @Override // p000.l9a
        public void onComplete() {
            this.f66984a.onComplete();
        }

        @Override // p000.l9a
        public void onError(Throwable th) {
            this.f66984a.onError(th);
        }

        @Override // p000.l9a
        public void onSubscribe(mf4 mf4Var) {
            ag4.setOnce(this, mf4Var);
        }

        @Override // p000.l9a
        public void onSuccess(T t) {
            this.f66984a.onSuccess(t);
        }
    }

    /* JADX INFO: renamed from: oaa$b */
    public static final class C10281b<T, U> extends AtomicReference<mf4> implements l9a<T>, mf4 {
        private static final long serialVersionUID = -5955289211445418871L;

        /* JADX INFO: renamed from: a */
        public final l9a<? super T> f66985a;

        /* JADX INFO: renamed from: b */
        public final C10282c<T, U> f66986b = new C10282c<>(this);

        /* JADX INFO: renamed from: c */
        public final aaa<? extends T> f66987c;

        /* JADX INFO: renamed from: d */
        public final C10280a<T> f66988d;

        public C10281b(l9a<? super T> l9aVar, aaa<? extends T> aaaVar) {
            this.f66985a = l9aVar;
            this.f66987c = aaaVar;
            this.f66988d = aaaVar != null ? new C10280a<>(l9aVar) : null;
        }

        @Override // p000.mf4
        public void dispose() {
            ag4.dispose(this);
            ag4.dispose(this.f66986b);
            C10280a<T> c10280a = this.f66988d;
            if (c10280a != null) {
                ag4.dispose(c10280a);
            }
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return ag4.isDisposed(get());
        }

        @Override // p000.l9a
        public void onComplete() {
            ag4.dispose(this.f66986b);
            ag4 ag4Var = ag4.DISPOSED;
            if (getAndSet(ag4Var) != ag4Var) {
                this.f66985a.onComplete();
            }
        }

        @Override // p000.l9a
        public void onError(Throwable th) {
            ag4.dispose(this.f66986b);
            ag4 ag4Var = ag4.DISPOSED;
            if (getAndSet(ag4Var) != ag4Var) {
                this.f66985a.onError(th);
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
            ag4.dispose(this.f66986b);
            ag4 ag4Var = ag4.DISPOSED;
            if (getAndSet(ag4Var) != ag4Var) {
                this.f66985a.onSuccess(t);
            }
        }

        public void otherComplete() {
            if (ag4.dispose(this)) {
                aaa<? extends T> aaaVar = this.f66987c;
                if (aaaVar == null) {
                    this.f66985a.onError(new TimeoutException());
                } else {
                    aaaVar.subscribe(this.f66988d);
                }
            }
        }

        public void otherError(Throwable th) {
            if (ag4.dispose(this)) {
                this.f66985a.onError(th);
            } else {
                pfe.onError(th);
            }
        }
    }

    /* JADX INFO: renamed from: oaa$c */
    public static final class C10282c<T, U> extends AtomicReference<mf4> implements l9a<Object> {
        private static final long serialVersionUID = 8663801314800248617L;

        /* JADX INFO: renamed from: a */
        public final C10281b<T, U> f66989a;

        public C10282c(C10281b<T, U> c10281b) {
            this.f66989a = c10281b;
        }

        @Override // p000.l9a
        public void onComplete() {
            this.f66989a.otherComplete();
        }

        @Override // p000.l9a
        public void onError(Throwable th) {
            this.f66989a.otherError(th);
        }

        @Override // p000.l9a
        public void onSubscribe(mf4 mf4Var) {
            ag4.setOnce(this, mf4Var);
        }

        @Override // p000.l9a
        public void onSuccess(Object obj) {
            this.f66989a.otherComplete();
        }
    }

    public oaa(aaa<T> aaaVar, aaa<U> aaaVar2, aaa<? extends T> aaaVar3) {
        super(aaaVar);
        this.f66982b = aaaVar2;
        this.f66983c = aaaVar3;
    }

    @Override // p000.s4a
    public void subscribeActual(l9a<? super T> l9aVar) {
        C10281b c10281b = new C10281b(l9aVar, this.f66983c);
        l9aVar.onSubscribe(c10281b);
        this.f66982b.subscribe(c10281b.f66986b);
        this.f103681a.subscribe(c10281b);
    }
}
