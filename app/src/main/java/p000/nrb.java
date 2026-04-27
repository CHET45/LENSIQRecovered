package p000;

import io.reactivex.Observable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class nrb<T> extends AbstractC10162o3<T, T> {

    /* JADX INFO: renamed from: b */
    public final qh2 f65379b;

    /* JADX INFO: renamed from: nrb$a */
    public static final class C10024a<T> extends AtomicInteger implements oxb<T>, mf4 {
        private static final long serialVersionUID = -4592979584110982903L;

        /* JADX INFO: renamed from: a */
        public final oxb<? super T> f65380a;

        /* JADX INFO: renamed from: b */
        public final AtomicReference<mf4> f65381b = new AtomicReference<>();

        /* JADX INFO: renamed from: c */
        public final a f65382c = new a(this);

        /* JADX INFO: renamed from: d */
        public final cc0 f65383d = new cc0();

        /* JADX INFO: renamed from: e */
        public volatile boolean f65384e;

        /* JADX INFO: renamed from: f */
        public volatile boolean f65385f;

        /* JADX INFO: renamed from: nrb$a$a */
        public static final class a extends AtomicReference<mf4> implements dh2 {
            private static final long serialVersionUID = -2935427570954647017L;

            /* JADX INFO: renamed from: a */
            public final C10024a<?> f65386a;

            public a(C10024a<?> c10024a) {
                this.f65386a = c10024a;
            }

            @Override // p000.dh2
            public void onComplete() {
                this.f65386a.m18097a();
            }

            @Override // p000.dh2
            public void onError(Throwable th) {
                this.f65386a.m18098b(th);
            }

            @Override // p000.dh2
            public void onSubscribe(mf4 mf4Var) {
                ag4.setOnce(this, mf4Var);
            }
        }

        public C10024a(oxb<? super T> oxbVar) {
            this.f65380a = oxbVar;
        }

        /* JADX INFO: renamed from: a */
        public void m18097a() {
            this.f65385f = true;
            if (this.f65384e) {
                yd7.onComplete(this.f65380a, this, this.f65383d);
            }
        }

        /* JADX INFO: renamed from: b */
        public void m18098b(Throwable th) {
            ag4.dispose(this.f65381b);
            yd7.onError(this.f65380a, th, this, this.f65383d);
        }

        @Override // p000.mf4
        public void dispose() {
            ag4.dispose(this.f65381b);
            ag4.dispose(this.f65382c);
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return ag4.isDisposed(this.f65381b.get());
        }

        @Override // p000.oxb
        public void onComplete() {
            this.f65384e = true;
            if (this.f65385f) {
                yd7.onComplete(this.f65380a, this, this.f65383d);
            }
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            ag4.dispose(this.f65382c);
            yd7.onError(this.f65380a, th, this, this.f65383d);
        }

        @Override // p000.oxb
        public void onNext(T t) {
            yd7.onNext(this.f65380a, t, this, this.f65383d);
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
            ag4.setOnce(this.f65381b, mf4Var);
        }
    }

    public nrb(Observable<T> observable, qh2 qh2Var) {
        super(observable);
        this.f65379b = qh2Var;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(oxb<? super T> oxbVar) {
        C10024a c10024a = new C10024a(oxbVar);
        oxbVar.onSubscribe(c10024a);
        this.f66354a.subscribe(c10024a);
        this.f65379b.subscribe(c10024a.f65382c);
    }
}
