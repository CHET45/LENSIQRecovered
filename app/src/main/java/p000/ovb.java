package p000;

import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes7.dex */
public final class ovb<T> extends AbstractC9666n3<T, T> {

    /* JADX INFO: renamed from: b */
    public final int f68948b;

    /* JADX INFO: renamed from: ovb$a */
    public static final class C10667a<T> extends ArrayDeque<T> implements pxb<T>, lf4 {
        private static final long serialVersionUID = 7240042530241604978L;

        /* JADX INFO: renamed from: a */
        public final pxb<? super T> f68949a;

        /* JADX INFO: renamed from: b */
        public final int f68950b;

        /* JADX INFO: renamed from: c */
        public lf4 f68951c;

        /* JADX INFO: renamed from: d */
        public volatile boolean f68952d;

        public C10667a(pxb<? super T> actual, int count) {
            this.f68949a = actual;
            this.f68950b = count;
        }

        @Override // p000.lf4
        public void dispose() {
            if (this.f68952d) {
                return;
            }
            this.f68952d = true;
            this.f68951c.dispose();
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f68952d;
        }

        @Override // p000.pxb
        public void onComplete() {
            pxb<? super T> pxbVar = this.f68949a;
            while (!this.f68952d) {
                T tPoll = poll();
                if (tPoll == null) {
                    pxbVar.onComplete();
                    return;
                }
                pxbVar.onNext(tPoll);
            }
        }

        @Override // p000.pxb
        public void onError(Throwable t) {
            this.f68949a.onError(t);
        }

        @Override // p000.pxb
        public void onNext(T t) {
            if (this.f68950b == size()) {
                poll();
            }
            offer(t);
        }

        @Override // p000.pxb
        public void onSubscribe(lf4 d) {
            if (zf4.validate(this.f68951c, d)) {
                this.f68951c = d;
                this.f68949a.onSubscribe(this);
            }
        }
    }

    public ovb(wub<T> source, int count) {
        super(source);
        this.f68948b = count;
    }

    @Override // p000.vkb
    public void subscribeActual(pxb<? super T> t) {
        this.f63101a.subscribe(new C10667a(t, this.f68948b));
    }
}
