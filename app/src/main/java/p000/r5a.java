package p000;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class r5a<T> extends AbstractC15397y2<T, T> {

    /* JADX INFO: renamed from: b */
    public final long f77084b;

    /* JADX INFO: renamed from: c */
    public final TimeUnit f77085c;

    /* JADX INFO: renamed from: d */
    public final woe f77086d;

    /* JADX INFO: renamed from: e */
    public final boolean f77087e;

    /* JADX INFO: renamed from: r5a$a */
    public static final class RunnableC11894a<T> extends AtomicReference<lf4> implements k9a<T>, lf4, Runnable {
        private static final long serialVersionUID = 5566860102500855068L;

        /* JADX INFO: renamed from: a */
        public final k9a<? super T> f77088a;

        /* JADX INFO: renamed from: b */
        public final long f77089b;

        /* JADX INFO: renamed from: c */
        public final TimeUnit f77090c;

        /* JADX INFO: renamed from: d */
        public final woe f77091d;

        /* JADX INFO: renamed from: e */
        public final boolean f77092e;

        /* JADX INFO: renamed from: f */
        public T f77093f;

        /* JADX INFO: renamed from: m */
        public Throwable f77094m;

        public RunnableC11894a(k9a<? super T> actual, long delay, TimeUnit unit, woe scheduler, boolean delayError) {
            this.f77088a = actual;
            this.f77089b = delay;
            this.f77090c = unit;
            this.f77091d = scheduler;
            this.f77092e = delayError;
        }

        /* JADX INFO: renamed from: a */
        public void m21023a(long delay) {
            zf4.replace(this, this.f77091d.scheduleDirect(this, delay, this.f77090c));
        }

        @Override // p000.lf4
        public void dispose() {
            zf4.dispose(this);
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return zf4.isDisposed(get());
        }

        @Override // p000.k9a
        public void onComplete() {
            m21023a(this.f77089b);
        }

        @Override // p000.k9a
        public void onError(Throwable e) {
            this.f77094m = e;
            m21023a(this.f77092e ? this.f77089b : 0L);
        }

        @Override // p000.k9a
        public void onSubscribe(lf4 d) {
            if (zf4.setOnce(this, d)) {
                this.f77088a.onSubscribe(this);
            }
        }

        @Override // p000.k9a
        public void onSuccess(T value) {
            this.f77093f = value;
            m21023a(this.f77089b);
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable th = this.f77094m;
            if (th != null) {
                this.f77088a.onError(th);
                return;
            }
            T t = this.f77093f;
            if (t != null) {
                this.f77088a.onSuccess(t);
            } else {
                this.f77088a.onComplete();
            }
        }
    }

    public r5a(z9a<T> source, long delay, TimeUnit unit, woe scheduler, boolean delayError) {
        super(source);
        this.f77084b = delay;
        this.f77085c = unit;
        this.f77086d = scheduler;
        this.f77087e = delayError;
    }

    @Override // p000.r4a
    public void subscribeActual(k9a<? super T> observer) {
        this.f100099a.subscribe(new RunnableC11894a(observer, this.f77084b, this.f77085c, this.f77086d, this.f77087e));
    }
}
