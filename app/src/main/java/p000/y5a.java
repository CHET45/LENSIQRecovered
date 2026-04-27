package p000;

import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public final class y5a<T, R> extends AbstractC15397y2<T, R> {

    /* JADX INFO: renamed from: b */
    public final sy6<? super T, jgb<R>> f100420b;

    /* JADX INFO: renamed from: y5a$a */
    public static final class C15492a<T, R> implements k9a<T>, lf4 {

        /* JADX INFO: renamed from: a */
        public final k9a<? super R> f100421a;

        /* JADX INFO: renamed from: b */
        public final sy6<? super T, jgb<R>> f100422b;

        /* JADX INFO: renamed from: c */
        public lf4 f100423c;

        public C15492a(k9a<? super R> downstream, sy6<? super T, jgb<R>> selector) {
            this.f100421a = downstream;
            this.f100422b = selector;
        }

        @Override // p000.lf4
        public void dispose() {
            this.f100423c.dispose();
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f100423c.isDisposed();
        }

        @Override // p000.k9a
        public void onComplete() {
            this.f100421a.onComplete();
        }

        @Override // p000.k9a
        public void onError(Throwable e) {
            this.f100421a.onError(e);
        }

        @Override // p000.k9a
        public void onSubscribe(lf4 d) {
            if (zf4.validate(this.f100423c, d)) {
                this.f100423c = d;
                this.f100421a.onSubscribe(this);
            }
        }

        @Override // p000.k9a
        public void onSuccess(T t) {
            try {
                jgb<R> jgbVarApply = this.f100422b.apply(t);
                Objects.requireNonNull(jgbVarApply, "The selector returned a null Notification");
                jgb<R> jgbVar = jgbVarApply;
                if (jgbVar.isOnNext()) {
                    this.f100421a.onSuccess(jgbVar.getValue());
                } else if (jgbVar.isOnComplete()) {
                    this.f100421a.onComplete();
                } else {
                    this.f100421a.onError(jgbVar.getError());
                }
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                this.f100421a.onError(th);
            }
        }
    }

    public y5a(r4a<T> source, sy6<? super T, jgb<R>> selector) {
        super(source);
        this.f100420b = selector;
    }

    @Override // p000.r4a
    public void subscribeActual(k9a<? super R> observer) {
        this.f100099a.subscribe(new C15492a(observer, this.f100420b));
    }
}
