package p000;

import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes7.dex */
public final class pub<T> extends AbstractC9666n3<T, T> {

    /* JADX INFO: renamed from: b */
    public final int f72130b;

    /* JADX INFO: renamed from: pub$a */
    public static final class C11127a<T> extends ArrayDeque<T> implements pxb<T>, lf4 {
        private static final long serialVersionUID = -3807491841935125653L;

        /* JADX INFO: renamed from: a */
        public final pxb<? super T> f72131a;

        /* JADX INFO: renamed from: b */
        public final int f72132b;

        /* JADX INFO: renamed from: c */
        public lf4 f72133c;

        public C11127a(pxb<? super T> actual, int skip) {
            super(skip);
            this.f72131a = actual;
            this.f72132b = skip;
        }

        @Override // p000.lf4
        public void dispose() {
            this.f72133c.dispose();
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f72133c.isDisposed();
        }

        @Override // p000.pxb
        public void onComplete() {
            this.f72131a.onComplete();
        }

        @Override // p000.pxb
        public void onError(Throwable t) {
            this.f72131a.onError(t);
        }

        @Override // p000.pxb
        public void onNext(T t) {
            if (this.f72132b == size()) {
                this.f72131a.onNext(poll());
            }
            offer(t);
        }

        @Override // p000.pxb
        public void onSubscribe(lf4 d) {
            if (zf4.validate(this.f72133c, d)) {
                this.f72133c = d;
                this.f72131a.onSubscribe(this);
            }
        }
    }

    public pub(wub<T> source, int skip) {
        super(source);
        this.f72130b = skip;
    }

    @Override // p000.vkb
    public void subscribeActual(pxb<? super T> observer) {
        this.f63101a.subscribe(new C11127a(observer, this.f72130b));
    }
}
