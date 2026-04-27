package p000;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class msb<T, R> extends AbstractC9666n3<T, R> {

    /* JADX INFO: renamed from: b */
    public final sy6<? super vkb<T>, ? extends wub<R>> f61945b;

    /* JADX INFO: renamed from: msb$a */
    public static final class C9497a<T> implements pxb<T> {

        /* JADX INFO: renamed from: a */
        public final wjd<T> f61946a;

        /* JADX INFO: renamed from: b */
        public final AtomicReference<lf4> f61947b;

        public C9497a(wjd<T> subject, AtomicReference<lf4> target) {
            this.f61946a = subject;
            this.f61947b = target;
        }

        @Override // p000.pxb
        public void onComplete() {
            this.f61946a.onComplete();
        }

        @Override // p000.pxb
        public void onError(Throwable e) {
            this.f61946a.onError(e);
        }

        @Override // p000.pxb
        public void onNext(T value) {
            this.f61946a.onNext(value);
        }

        @Override // p000.pxb
        public void onSubscribe(lf4 d) {
            zf4.setOnce(this.f61947b, d);
        }
    }

    /* JADX INFO: renamed from: msb$b */
    public static final class C9498b<R> extends AtomicReference<lf4> implements pxb<R>, lf4 {
        private static final long serialVersionUID = 854110278590336484L;

        /* JADX INFO: renamed from: a */
        public final pxb<? super R> f61948a;

        /* JADX INFO: renamed from: b */
        public lf4 f61949b;

        public C9498b(pxb<? super R> downstream) {
            this.f61948a = downstream;
        }

        @Override // p000.lf4
        public void dispose() {
            this.f61949b.dispose();
            zf4.dispose(this);
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f61949b.isDisposed();
        }

        @Override // p000.pxb
        public void onComplete() {
            zf4.dispose(this);
            this.f61948a.onComplete();
        }

        @Override // p000.pxb
        public void onError(Throwable e) {
            zf4.dispose(this);
            this.f61948a.onError(e);
        }

        @Override // p000.pxb
        public void onNext(R value) {
            this.f61948a.onNext(value);
        }

        @Override // p000.pxb
        public void onSubscribe(lf4 d) {
            if (zf4.validate(this.f61949b, d)) {
                this.f61949b = d;
                this.f61948a.onSubscribe(this);
            }
        }
    }

    public msb(final wub<T> source, final sy6<? super vkb<T>, ? extends wub<R>> selector) {
        super(source);
        this.f61945b = selector;
    }

    @Override // p000.vkb
    public void subscribeActual(pxb<? super R> pxbVar) {
        wjd wjdVarCreate = wjd.create();
        try {
            wub<R> wubVarApply = this.f61945b.apply(wjdVarCreate);
            Objects.requireNonNull(wubVarApply, "The selector returned a null ObservableSource");
            wub<R> wubVar = wubVarApply;
            C9498b c9498b = new C9498b(pxbVar);
            wubVar.subscribe(c9498b);
            this.f63101a.subscribe(new C9497a(wjdVarCreate, c9498b));
        } catch (Throwable th) {
            o75.throwIfFatal(th);
            b05.error(th, pxbVar);
        }
    }
}
