package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class j9a<T> extends AbstractC15397y2<T, T> {

    /* JADX INFO: renamed from: b */
    public final woe f50002b;

    /* JADX INFO: renamed from: j9a$a */
    public static final class RunnableC7816a<T> extends AtomicReference<lf4> implements k9a<T>, lf4, Runnable {
        private static final long serialVersionUID = 8571289934935992137L;

        /* JADX INFO: renamed from: a */
        public final k9a<? super T> f50003a;

        /* JADX INFO: renamed from: b */
        public final woe f50004b;

        /* JADX INFO: renamed from: c */
        public T f50005c;

        /* JADX INFO: renamed from: d */
        public Throwable f50006d;

        public RunnableC7816a(k9a<? super T> actual, woe scheduler) {
            this.f50003a = actual;
            this.f50004b = scheduler;
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
            zf4.replace(this, this.f50004b.scheduleDirect(this));
        }

        @Override // p000.k9a
        public void onError(Throwable e) {
            this.f50006d = e;
            zf4.replace(this, this.f50004b.scheduleDirect(this));
        }

        @Override // p000.k9a
        public void onSubscribe(lf4 d) {
            if (zf4.setOnce(this, d)) {
                this.f50003a.onSubscribe(this);
            }
        }

        @Override // p000.k9a
        public void onSuccess(T value) {
            this.f50005c = value;
            zf4.replace(this, this.f50004b.scheduleDirect(this));
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable th = this.f50006d;
            if (th != null) {
                this.f50006d = null;
                this.f50003a.onError(th);
                return;
            }
            T t = this.f50005c;
            if (t == null) {
                this.f50003a.onComplete();
            } else {
                this.f50005c = null;
                this.f50003a.onSuccess(t);
            }
        }
    }

    public j9a(z9a<T> source, woe scheduler) {
        super(source);
        this.f50002b = scheduler;
    }

    @Override // p000.r4a
    public void subscribeActual(k9a<? super T> observer) {
        this.f100099a.subscribe(new RunnableC7816a(observer, this.f50002b));
    }
}
