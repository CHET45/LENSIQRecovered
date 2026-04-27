package p000;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class lf6<T> extends AbstractC8162k1<T, T> {

    /* JADX INFO: renamed from: c */
    public final qh2 f57475c;

    /* JADX INFO: renamed from: lf6$a */
    public static final class C8805a<T> extends AtomicInteger implements lj6<T>, fdg {
        private static final long serialVersionUID = -4592979584110982903L;

        /* JADX INFO: renamed from: a */
        public final ycg<? super T> f57476a;

        /* JADX INFO: renamed from: b */
        public final AtomicReference<fdg> f57477b = new AtomicReference<>();

        /* JADX INFO: renamed from: c */
        public final a f57478c = new a(this);

        /* JADX INFO: renamed from: d */
        public final cc0 f57479d = new cc0();

        /* JADX INFO: renamed from: e */
        public final AtomicLong f57480e = new AtomicLong();

        /* JADX INFO: renamed from: f */
        public volatile boolean f57481f;

        /* JADX INFO: renamed from: m */
        public volatile boolean f57482m;

        /* JADX INFO: renamed from: lf6$a$a */
        public static final class a extends AtomicReference<mf4> implements dh2 {
            private static final long serialVersionUID = -2935427570954647017L;

            /* JADX INFO: renamed from: a */
            public final C8805a<?> f57483a;

            public a(C8805a<?> c8805a) {
                this.f57483a = c8805a;
            }

            @Override // p000.dh2
            public void onComplete() {
                this.f57483a.m16115a();
            }

            @Override // p000.dh2
            public void onError(Throwable th) {
                this.f57483a.m16116b(th);
            }

            @Override // p000.dh2
            public void onSubscribe(mf4 mf4Var) {
                ag4.setOnce(this, mf4Var);
            }
        }

        public C8805a(ycg<? super T> ycgVar) {
            this.f57476a = ycgVar;
        }

        /* JADX INFO: renamed from: a */
        public void m16115a() {
            this.f57482m = true;
            if (this.f57481f) {
                yd7.onComplete(this.f57476a, this, this.f57479d);
            }
        }

        /* JADX INFO: renamed from: b */
        public void m16116b(Throwable th) {
            mdg.cancel(this.f57477b);
            yd7.onError(this.f57476a, th, this, this.f57479d);
        }

        @Override // p000.fdg
        public void cancel() {
            mdg.cancel(this.f57477b);
            ag4.dispose(this.f57478c);
        }

        @Override // p000.ycg
        public void onComplete() {
            this.f57481f = true;
            if (this.f57482m) {
                yd7.onComplete(this.f57476a, this, this.f57479d);
            }
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            ag4.dispose(this.f57478c);
            yd7.onError(this.f57476a, th, this, this.f57479d);
        }

        @Override // p000.ycg
        public void onNext(T t) {
            yd7.onNext(this.f57476a, t, this, this.f57479d);
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            mdg.deferredSetOnce(this.f57477b, this.f57480e, fdgVar);
        }

        @Override // p000.fdg
        public void request(long j) {
            mdg.deferredRequest(this.f57477b, this.f57480e, j);
        }
    }

    public lf6(m86<T> m86Var, qh2 qh2Var) {
        super(m86Var);
        this.f57475c = qh2Var;
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super T> ycgVar) {
        C8805a c8805a = new C8805a(ycgVar);
        ycgVar.onSubscribe(c8805a);
        this.f52360b.subscribe((lj6) c8805a);
        this.f57475c.subscribe(c8805a.f57478c);
    }
}
