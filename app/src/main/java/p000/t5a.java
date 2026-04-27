package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class t5a<T, U> extends AbstractC15397y2<T, T> {

    /* JADX INFO: renamed from: b */
    public final zjd<U> f83745b;

    /* JADX INFO: renamed from: t5a$a */
    public static final class C12916a<T, U> implements k9a<T>, lf4 {

        /* JADX INFO: renamed from: a */
        public final C12917b<T> f83746a;

        /* JADX INFO: renamed from: b */
        public final zjd<U> f83747b;

        /* JADX INFO: renamed from: c */
        public lf4 f83748c;

        public C12916a(k9a<? super T> actual, zjd<U> otherSource) {
            this.f83746a = new C12917b<>(actual);
            this.f83747b = otherSource;
        }

        /* JADX INFO: renamed from: a */
        public void m22374a() {
            this.f83747b.subscribe(this.f83746a);
        }

        @Override // p000.lf4
        public void dispose() {
            this.f83748c.dispose();
            this.f83748c = zf4.DISPOSED;
            ldg.cancel(this.f83746a);
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f83746a.get() == ldg.CANCELLED;
        }

        @Override // p000.k9a
        public void onComplete() {
            this.f83748c = zf4.DISPOSED;
            m22374a();
        }

        @Override // p000.k9a
        public void onError(Throwable e) {
            this.f83748c = zf4.DISPOSED;
            this.f83746a.f83751c = e;
            m22374a();
        }

        @Override // p000.k9a
        public void onSubscribe(lf4 d) {
            if (zf4.validate(this.f83748c, d)) {
                this.f83748c = d;
                this.f83746a.f83749a.onSubscribe(this);
            }
        }

        @Override // p000.k9a
        public void onSuccess(T value) {
            this.f83748c = zf4.DISPOSED;
            this.f83746a.f83750b = value;
            m22374a();
        }
    }

    /* JADX INFO: renamed from: t5a$b */
    public static final class C12917b<T> extends AtomicReference<fdg> implements kj6<Object> {
        private static final long serialVersionUID = -1215060610805418006L;

        /* JADX INFO: renamed from: a */
        public final k9a<? super T> f83749a;

        /* JADX INFO: renamed from: b */
        public T f83750b;

        /* JADX INFO: renamed from: c */
        public Throwable f83751c;

        public C12917b(k9a<? super T> downstream) {
            this.f83749a = downstream;
        }

        @Override // p000.ycg
        public void onComplete() {
            Throwable th = this.f83751c;
            if (th != null) {
                this.f83749a.onError(th);
                return;
            }
            T t = this.f83750b;
            if (t != null) {
                this.f83749a.onSuccess(t);
            } else {
                this.f83749a.onComplete();
            }
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            Throwable th = this.f83751c;
            if (th == null) {
                this.f83749a.onError(t);
            } else {
                this.f83749a.onError(new qm2(th, t));
            }
        }

        @Override // p000.ycg
        public void onNext(Object t) {
            fdg fdgVar = get();
            ldg ldgVar = ldg.CANCELLED;
            if (fdgVar != ldgVar) {
                lazySet(ldgVar);
                fdgVar.cancel();
                onComplete();
            }
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            ldg.setOnce(this, s, Long.MAX_VALUE);
        }
    }

    public t5a(z9a<T> source, zjd<U> other) {
        super(source);
        this.f83745b = other;
    }

    @Override // p000.r4a
    public void subscribeActual(k9a<? super T> observer) {
        this.f100099a.subscribe(new C12916a(observer, this.f83745b));
    }
}
