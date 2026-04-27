package p000;

import io.reactivex.Observable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class fvb<T> extends yd2 {

    /* JADX INFO: renamed from: a */
    public final Observable<T> f37813a;

    /* JADX INFO: renamed from: b */
    public final py6<? super T, ? extends qh2> f37814b;

    /* JADX INFO: renamed from: c */
    public final boolean f37815c;

    /* JADX INFO: renamed from: fvb$a */
    public static final class C5998a<T> implements oxb<T>, mf4 {

        /* JADX INFO: renamed from: C */
        public static final a f37816C = new a(null);

        /* JADX INFO: renamed from: a */
        public final dh2 f37817a;

        /* JADX INFO: renamed from: b */
        public final py6<? super T, ? extends qh2> f37818b;

        /* JADX INFO: renamed from: c */
        public final boolean f37819c;

        /* JADX INFO: renamed from: d */
        public final cc0 f37820d = new cc0();

        /* JADX INFO: renamed from: e */
        public final AtomicReference<a> f37821e = new AtomicReference<>();

        /* JADX INFO: renamed from: f */
        public volatile boolean f37822f;

        /* JADX INFO: renamed from: m */
        public mf4 f37823m;

        /* JADX INFO: renamed from: fvb$a$a */
        public static final class a extends AtomicReference<mf4> implements dh2 {
            private static final long serialVersionUID = -8003404460084760287L;

            /* JADX INFO: renamed from: a */
            public final C5998a<?> f37824a;

            public a(C5998a<?> c5998a) {
                this.f37824a = c5998a;
            }

            /* JADX INFO: renamed from: a */
            public void m11192a() {
                ag4.dispose(this);
            }

            @Override // p000.dh2
            public void onComplete() {
                this.f37824a.m11190b(this);
            }

            @Override // p000.dh2
            public void onError(Throwable th) {
                this.f37824a.m11191c(this, th);
            }

            @Override // p000.dh2
            public void onSubscribe(mf4 mf4Var) {
                ag4.setOnce(this, mf4Var);
            }
        }

        public C5998a(dh2 dh2Var, py6<? super T, ? extends qh2> py6Var, boolean z) {
            this.f37817a = dh2Var;
            this.f37818b = py6Var;
            this.f37819c = z;
        }

        /* JADX INFO: renamed from: a */
        public void m11189a() {
            AtomicReference<a> atomicReference = this.f37821e;
            a aVar = f37816C;
            a andSet = atomicReference.getAndSet(aVar);
            if (andSet == null || andSet == aVar) {
                return;
            }
            andSet.m11192a();
        }

        /* JADX INFO: renamed from: b */
        public void m11190b(a aVar) {
            if (v7b.m23844a(this.f37821e, aVar, null) && this.f37822f) {
                Throwable thTerminate = this.f37820d.terminate();
                if (thTerminate == null) {
                    this.f37817a.onComplete();
                } else {
                    this.f37817a.onError(thTerminate);
                }
            }
        }

        /* JADX INFO: renamed from: c */
        public void m11191c(a aVar, Throwable th) {
            if (!v7b.m23844a(this.f37821e, aVar, null) || !this.f37820d.addThrowable(th)) {
                pfe.onError(th);
                return;
            }
            if (this.f37819c) {
                if (this.f37822f) {
                    this.f37817a.onError(this.f37820d.terminate());
                    return;
                }
                return;
            }
            dispose();
            Throwable thTerminate = this.f37820d.terminate();
            if (thTerminate != j75.f49698a) {
                this.f37817a.onError(thTerminate);
            }
        }

        @Override // p000.mf4
        public void dispose() {
            this.f37823m.dispose();
            m11189a();
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f37821e.get() == f37816C;
        }

        @Override // p000.oxb
        public void onComplete() {
            this.f37822f = true;
            if (this.f37821e.get() == null) {
                Throwable thTerminate = this.f37820d.terminate();
                if (thTerminate == null) {
                    this.f37817a.onComplete();
                } else {
                    this.f37817a.onError(thTerminate);
                }
            }
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            if (!this.f37820d.addThrowable(th)) {
                pfe.onError(th);
                return;
            }
            if (this.f37819c) {
                onComplete();
                return;
            }
            m11189a();
            Throwable thTerminate = this.f37820d.terminate();
            if (thTerminate != j75.f49698a) {
                this.f37817a.onError(thTerminate);
            }
        }

        @Override // p000.oxb
        public void onNext(T t) {
            a aVar;
            try {
                qh2 qh2Var = (qh2) xjb.requireNonNull(this.f37818b.apply(t), "The mapper returned a null CompletableSource");
                a aVar2 = new a(this);
                do {
                    aVar = this.f37821e.get();
                    if (aVar == f37816C) {
                        return;
                    }
                } while (!v7b.m23844a(this.f37821e, aVar, aVar2));
                if (aVar != null) {
                    aVar.m11192a();
                }
                qh2Var.subscribe(aVar2);
            } catch (Throwable th) {
                n75.throwIfFatal(th);
                this.f37823m.dispose();
                onError(th);
            }
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.validate(this.f37823m, mf4Var)) {
                this.f37823m = mf4Var;
                this.f37817a.onSubscribe(this);
            }
        }
    }

    public fvb(Observable<T> observable, py6<? super T, ? extends qh2> py6Var, boolean z) {
        this.f37813a = observable;
        this.f37814b = py6Var;
        this.f37815c = z;
    }

    @Override // p000.yd2
    public void subscribeActual(dh2 dh2Var) {
        if (nme.m18009a(this.f37813a, this.f37814b, dh2Var)) {
            return;
        }
        this.f37813a.subscribe(new C5998a(dh2Var, this.f37814b, this.f37815c));
    }
}
