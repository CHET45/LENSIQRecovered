package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class eaa<T> extends AbstractC15397y2<T, T> {

    /* JADX INFO: renamed from: b */
    public final woe f32347b;

    /* JADX INFO: renamed from: eaa$a */
    public static final class C5214a<T> extends AtomicReference<lf4> implements k9a<T>, lf4 {
        private static final long serialVersionUID = 8571289934935992137L;

        /* JADX INFO: renamed from: a */
        public final a0f f32348a = new a0f();

        /* JADX INFO: renamed from: b */
        public final k9a<? super T> f32349b;

        public C5214a(k9a<? super T> downstream) {
            this.f32349b = downstream;
        }

        @Override // p000.lf4
        public void dispose() {
            zf4.dispose(this);
            this.f32348a.dispose();
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return zf4.isDisposed(get());
        }

        @Override // p000.k9a
        public void onComplete() {
            this.f32349b.onComplete();
        }

        @Override // p000.k9a
        public void onError(Throwable e) {
            this.f32349b.onError(e);
        }

        @Override // p000.k9a
        public void onSubscribe(lf4 d) {
            zf4.setOnce(this, d);
        }

        @Override // p000.k9a
        public void onSuccess(T value) {
            this.f32349b.onSuccess(value);
        }
    }

    /* JADX INFO: renamed from: eaa$b */
    public static final class RunnableC5215b<T> implements Runnable {

        /* JADX INFO: renamed from: a */
        public final k9a<? super T> f32350a;

        /* JADX INFO: renamed from: b */
        public final z9a<T> f32351b;

        public RunnableC5215b(k9a<? super T> observer, z9a<T> source) {
            this.f32350a = observer;
            this.f32351b = source;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f32351b.subscribe(this.f32350a);
        }
    }

    public eaa(z9a<T> source, woe scheduler) {
        super(source);
        this.f32347b = scheduler;
    }

    @Override // p000.r4a
    public void subscribeActual(k9a<? super T> observer) {
        C5214a c5214a = new C5214a(observer);
        observer.onSubscribe(c5214a);
        c5214a.f32348a.replace(this.f32347b.scheduleDirect(new RunnableC5215b(c5214a, this.f100099a)));
    }
}
