package p000;

import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public final class lb6<T, R> extends AbstractC7714j1<T, R> {

    /* JADX INFO: renamed from: c */
    public final sy6<? super T, ? extends jgb<R>> f57056c;

    /* JADX INFO: renamed from: lb6$a */
    public static final class C8757a<T, R> implements kj6<T>, fdg {

        /* JADX INFO: renamed from: a */
        public final ycg<? super R> f57057a;

        /* JADX INFO: renamed from: b */
        public final sy6<? super T, ? extends jgb<R>> f57058b;

        /* JADX INFO: renamed from: c */
        public boolean f57059c;

        /* JADX INFO: renamed from: d */
        public fdg f57060d;

        public C8757a(ycg<? super R> downstream, sy6<? super T, ? extends jgb<R>> selector) {
            this.f57057a = downstream;
            this.f57058b = selector;
        }

        @Override // p000.fdg
        public void cancel() {
            this.f57060d.cancel();
        }

        @Override // p000.ycg
        public void onComplete() {
            if (this.f57059c) {
                return;
            }
            this.f57059c = true;
            this.f57057a.onComplete();
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            if (this.f57059c) {
                ofe.onError(t);
            } else {
                this.f57059c = true;
                this.f57057a.onError(t);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.ycg
        public void onNext(T item) {
            if (this.f57059c) {
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
                jgb<R> jgbVarApply = this.f57058b.apply(item);
                Objects.requireNonNull(jgbVarApply, "The selector returned a null Notification");
                jgb<R> jgbVar2 = jgbVarApply;
                if (jgbVar2.isOnError()) {
                    this.f57060d.cancel();
                    onError(jgbVar2.getError());
                } else if (!jgbVar2.isOnComplete()) {
                    this.f57057a.onNext(jgbVar2.getValue());
                } else {
                    this.f57060d.cancel();
                    onComplete();
                }
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                this.f57060d.cancel();
                onError(th);
            }
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            if (ldg.validate(this.f57060d, s)) {
                this.f57060d = s;
                this.f57057a.onSubscribe(this);
            }
        }

        @Override // p000.fdg
        public void request(long n) {
            this.f57060d.request(n);
        }
    }

    public lb6(l86<T> source, sy6<? super T, ? extends jgb<R>> selector) {
        super(source);
        this.f57056c = selector;
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super R> subscriber) {
        this.f49321b.subscribe((kj6) new C8757a(subscriber, this.f57056c));
    }
}
