package p000;

import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public final class qnb<T, R> extends AbstractC9666n3<T, R> {

    /* JADX INFO: renamed from: b */
    public final sy6<? super T, ? extends jgb<R>> f75011b;

    /* JADX INFO: renamed from: qnb$a */
    public static final class C11569a<T, R> implements pxb<T>, lf4 {

        /* JADX INFO: renamed from: a */
        public final pxb<? super R> f75012a;

        /* JADX INFO: renamed from: b */
        public final sy6<? super T, ? extends jgb<R>> f75013b;

        /* JADX INFO: renamed from: c */
        public boolean f75014c;

        /* JADX INFO: renamed from: d */
        public lf4 f75015d;

        public C11569a(pxb<? super R> downstream, sy6<? super T, ? extends jgb<R>> selector) {
            this.f75012a = downstream;
            this.f75013b = selector;
        }

        @Override // p000.lf4
        public void dispose() {
            this.f75015d.dispose();
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f75015d.isDisposed();
        }

        @Override // p000.pxb
        public void onComplete() {
            if (this.f75014c) {
                return;
            }
            this.f75014c = true;
            this.f75012a.onComplete();
        }

        @Override // p000.pxb
        public void onError(Throwable t) {
            if (this.f75014c) {
                ofe.onError(t);
            } else {
                this.f75014c = true;
                this.f75012a.onError(t);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.pxb
        public void onNext(T item) {
            if (this.f75014c) {
                if (item instanceof jgb) {
                    jgb jgbVar = (jgb) item;
                    if (jgbVar.isOnError()) {
                        ofe.onError(jgbVar.getError());
                        return;
                    }
                    return;
                }
                return;
            }
            try {
                jgb<R> jgbVarApply = this.f75013b.apply(item);
                Objects.requireNonNull(jgbVarApply, "The selector returned a null Notification");
                jgb<R> jgbVar2 = jgbVarApply;
                if (jgbVar2.isOnError()) {
                    this.f75015d.dispose();
                    onError(jgbVar2.getError());
                } else if (!jgbVar2.isOnComplete()) {
                    this.f75012a.onNext(jgbVar2.getValue());
                } else {
                    this.f75015d.dispose();
                    onComplete();
                }
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                this.f75015d.dispose();
                onError(th);
            }
        }

        @Override // p000.pxb
        public void onSubscribe(lf4 d) {
            if (zf4.validate(this.f75015d, d)) {
                this.f75015d = d;
                this.f75012a.onSubscribe(this);
            }
        }
    }

    public qnb(wub<T> source, sy6<? super T, ? extends jgb<R>> selector) {
        super(source);
        this.f75011b = selector;
    }

    @Override // p000.vkb
    public void subscribeActual(pxb<? super R> observer) {
        this.f63101a.subscribe(new C11569a(observer, this.f75011b));
    }
}
