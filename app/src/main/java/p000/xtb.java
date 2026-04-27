package p000;

import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public final class xtb<T> extends AbstractC9666n3<T, T> {

    /* JADX INFO: renamed from: b */
    public final i11<T, T, T> f99232b;

    /* JADX INFO: renamed from: xtb$a */
    public static final class C15298a<T> implements pxb<T>, lf4 {

        /* JADX INFO: renamed from: a */
        public final pxb<? super T> f99233a;

        /* JADX INFO: renamed from: b */
        public final i11<T, T, T> f99234b;

        /* JADX INFO: renamed from: c */
        public lf4 f99235c;

        /* JADX INFO: renamed from: d */
        public T f99236d;

        /* JADX INFO: renamed from: e */
        public boolean f99237e;

        public C15298a(pxb<? super T> actual, i11<T, T, T> accumulator) {
            this.f99233a = actual;
            this.f99234b = accumulator;
        }

        @Override // p000.lf4
        public void dispose() {
            this.f99235c.dispose();
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f99235c.isDisposed();
        }

        @Override // p000.pxb
        public void onComplete() {
            if (this.f99237e) {
                return;
            }
            this.f99237e = true;
            this.f99233a.onComplete();
        }

        @Override // p000.pxb
        public void onError(Throwable t) {
            if (this.f99237e) {
                ofe.onError(t);
            } else {
                this.f99237e = true;
                this.f99233a.onError(t);
            }
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [T, java.lang.Object] */
        @Override // p000.pxb
        public void onNext(T t) {
            if (this.f99237e) {
                return;
            }
            pxb<? super T> pxbVar = this.f99233a;
            T t2 = this.f99236d;
            if (t2 == null) {
                this.f99236d = t;
                pxbVar.onNext(t);
                return;
            }
            try {
                T tApply = this.f99234b.apply(t2, t);
                Objects.requireNonNull(tApply, "The value returned by the accumulator is null");
                this.f99236d = tApply;
                pxbVar.onNext(tApply);
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                this.f99235c.dispose();
                onError(th);
            }
        }

        @Override // p000.pxb
        public void onSubscribe(lf4 d) {
            if (zf4.validate(this.f99235c, d)) {
                this.f99235c = d;
                this.f99233a.onSubscribe(this);
            }
        }
    }

    public xtb(wub<T> source, i11<T, T, T> accumulator) {
        super(source);
        this.f99232b = accumulator;
    }

    @Override // p000.vkb
    public void subscribeActual(pxb<? super T> t) {
        this.f63101a.subscribe(new C15298a(t, this.f99232b));
    }
}
