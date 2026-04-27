package p000;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public final class zjf<T> extends ljf<T> {

    /* JADX INFO: renamed from: a */
    public final pof<? extends T> f105312a;

    /* JADX INFO: renamed from: b */
    public final long f105313b;

    /* JADX INFO: renamed from: c */
    public final TimeUnit f105314c;

    /* JADX INFO: renamed from: d */
    public final voe f105315d;

    /* JADX INFO: renamed from: e */
    public final boolean f105316e;

    /* JADX INFO: renamed from: zjf$a */
    public final class C16161a implements inf<T> {

        /* JADX INFO: renamed from: a */
        public final b0f f105317a;

        /* JADX INFO: renamed from: b */
        public final inf<? super T> f105318b;

        /* JADX INFO: renamed from: zjf$a$a */
        public final class a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final Throwable f105320a;

            public a(Throwable th) {
                this.f105320a = th;
            }

            @Override // java.lang.Runnable
            public void run() {
                C16161a.this.f105318b.onError(this.f105320a);
            }
        }

        /* JADX INFO: renamed from: zjf$a$b */
        public final class b implements Runnable {

            /* JADX INFO: renamed from: a */
            public final T f105322a;

            public b(T t) {
                this.f105322a = t;
            }

            @Override // java.lang.Runnable
            public void run() {
                C16161a.this.f105318b.onSuccess(this.f105322a);
            }
        }

        public C16161a(b0f b0fVar, inf<? super T> infVar) {
            this.f105317a = b0fVar;
            this.f105318b = infVar;
        }

        @Override // p000.inf
        public void onError(Throwable th) {
            b0f b0fVar = this.f105317a;
            voe voeVar = zjf.this.f105315d;
            a aVar = new a(th);
            zjf zjfVar = zjf.this;
            b0fVar.replace(voeVar.scheduleDirect(aVar, zjfVar.f105316e ? zjfVar.f105313b : 0L, zjfVar.f105314c));
        }

        @Override // p000.inf
        public void onSubscribe(mf4 mf4Var) {
            this.f105317a.replace(mf4Var);
        }

        @Override // p000.inf
        public void onSuccess(T t) {
            b0f b0fVar = this.f105317a;
            voe voeVar = zjf.this.f105315d;
            b bVar = new b(t);
            zjf zjfVar = zjf.this;
            b0fVar.replace(voeVar.scheduleDirect(bVar, zjfVar.f105313b, zjfVar.f105314c));
        }
    }

    public zjf(pof<? extends T> pofVar, long j, TimeUnit timeUnit, voe voeVar, boolean z) {
        this.f105312a = pofVar;
        this.f105313b = j;
        this.f105314c = timeUnit;
        this.f105315d = voeVar;
        this.f105316e = z;
    }

    @Override // p000.ljf
    public void subscribeActual(inf<? super T> infVar) {
        b0f b0fVar = new b0f();
        infVar.onSubscribe(b0fVar);
        this.f105312a.subscribe(new C16161a(b0fVar, infVar));
    }
}
