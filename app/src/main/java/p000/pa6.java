package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class pa6<T> extends AbstractC7714j1<T, T> {

    /* JADX INFO: renamed from: c */
    public final z9a<? extends T> f70152c;

    /* JADX INFO: renamed from: pa6$a */
    public static final class C10868a<T> extends unf<T, T> implements k9a<T> {
        private static final long serialVersionUID = -7346385463600070225L;

        /* JADX INFO: renamed from: C */
        public z9a<? extends T> f70153C;

        /* JADX INFO: renamed from: F */
        public boolean f70154F;

        /* JADX INFO: renamed from: m */
        public final AtomicReference<lf4> f70155m;

        public C10868a(ycg<? super T> actual, z9a<? extends T> other) {
            super(actual);
            this.f70153C = other;
            this.f70155m = new AtomicReference<>();
        }

        @Override // p000.unf, p000.fdg
        public void cancel() {
            super.cancel();
            zf4.dispose(this.f70155m);
        }

        @Override // p000.ycg
        public void onComplete() {
            if (this.f70154F) {
                this.f88628a.onComplete();
                return;
            }
            this.f70154F = true;
            this.f88629b = ldg.CANCELLED;
            z9a<? extends T> z9aVar = this.f70153C;
            this.f70153C = null;
            z9aVar.subscribe(this);
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            this.f88628a.onError(t);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // p000.ycg
        public void onNext(T t) {
            this.f88631d++;
            this.f88628a.onNext((Object) t);
        }

        @Override // p000.k9a
        public void onSubscribe(lf4 d) {
            zf4.setOnce(this.f70155m, d);
        }

        @Override // p000.k9a
        public void onSuccess(T t) {
            m23463a(t);
        }
    }

    public pa6(l86<T> source, z9a<? extends T> other) {
        super(source);
        this.f70152c = other;
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super T> s) {
        this.f49321b.subscribe((kj6) new C10868a(s, this.f70152c));
    }
}
