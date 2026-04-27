package p000;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class j7a<T, R> extends AbstractC15921z2<T, R> {

    /* JADX INFO: renamed from: b */
    public final py6<? super T, ? extends aaa<? extends R>> f49701b;

    /* JADX INFO: renamed from: c */
    public final py6<? super Throwable, ? extends aaa<? extends R>> f49702c;

    /* JADX INFO: renamed from: d */
    public final Callable<? extends aaa<? extends R>> f49703d;

    /* JADX INFO: renamed from: j7a$a */
    public static final class C7772a<T, R> extends AtomicReference<mf4> implements l9a<T>, mf4 {
        private static final long serialVersionUID = 4375739915521278546L;

        /* JADX INFO: renamed from: a */
        public final l9a<? super R> f49704a;

        /* JADX INFO: renamed from: b */
        public final py6<? super T, ? extends aaa<? extends R>> f49705b;

        /* JADX INFO: renamed from: c */
        public final py6<? super Throwable, ? extends aaa<? extends R>> f49706c;

        /* JADX INFO: renamed from: d */
        public final Callable<? extends aaa<? extends R>> f49707d;

        /* JADX INFO: renamed from: e */
        public mf4 f49708e;

        /* JADX INFO: renamed from: j7a$a$a */
        public final class a implements l9a<R> {
            public a() {
            }

            @Override // p000.l9a
            public void onComplete() {
                C7772a.this.f49704a.onComplete();
            }

            @Override // p000.l9a
            public void onError(Throwable th) {
                C7772a.this.f49704a.onError(th);
            }

            @Override // p000.l9a
            public void onSubscribe(mf4 mf4Var) {
                ag4.setOnce(C7772a.this, mf4Var);
            }

            @Override // p000.l9a
            public void onSuccess(R r) {
                C7772a.this.f49704a.onSuccess(r);
            }
        }

        public C7772a(l9a<? super R> l9aVar, py6<? super T, ? extends aaa<? extends R>> py6Var, py6<? super Throwable, ? extends aaa<? extends R>> py6Var2, Callable<? extends aaa<? extends R>> callable) {
            this.f49704a = l9aVar;
            this.f49705b = py6Var;
            this.f49706c = py6Var2;
            this.f49707d = callable;
        }

        @Override // p000.mf4
        public void dispose() {
            ag4.dispose(this);
            this.f49708e.dispose();
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return ag4.isDisposed(get());
        }

        @Override // p000.l9a
        public void onComplete() {
            try {
                ((aaa) xjb.requireNonNull(this.f49707d.call(), "The onCompleteSupplier returned a null MaybeSource")).subscribe(new a());
            } catch (Exception e) {
                n75.throwIfFatal(e);
                this.f49704a.onError(e);
            }
        }

        @Override // p000.l9a
        public void onError(Throwable th) {
            try {
                ((aaa) xjb.requireNonNull(this.f49706c.apply(th), "The onErrorMapper returned a null MaybeSource")).subscribe(new a());
            } catch (Exception e) {
                n75.throwIfFatal(e);
                this.f49704a.onError(new pm2(th, e));
            }
        }

        @Override // p000.l9a
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.validate(this.f49708e, mf4Var)) {
                this.f49708e = mf4Var;
                this.f49704a.onSubscribe(this);
            }
        }

        @Override // p000.l9a
        public void onSuccess(T t) {
            try {
                ((aaa) xjb.requireNonNull(this.f49705b.apply(t), "The onSuccessMapper returned a null MaybeSource")).subscribe(new a());
            } catch (Exception e) {
                n75.throwIfFatal(e);
                this.f49704a.onError(e);
            }
        }
    }

    public j7a(aaa<T> aaaVar, py6<? super T, ? extends aaa<? extends R>> py6Var, py6<? super Throwable, ? extends aaa<? extends R>> py6Var2, Callable<? extends aaa<? extends R>> callable) {
        super(aaaVar);
        this.f49701b = py6Var;
        this.f49702c = py6Var2;
        this.f49703d = callable;
    }

    @Override // p000.s4a
    public void subscribeActual(l9a<? super R> l9aVar) {
        this.f103681a.subscribe(new C7772a(l9aVar, this.f49701b, this.f49702c, this.f49703d));
    }
}
