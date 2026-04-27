package p000;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes7.dex */
public final class zf6<T> extends AbstractC8162k1<T, T> implements tu2<T> {

    /* JADX INFO: renamed from: c */
    public final tu2<? super T> f104997c;

    /* JADX INFO: renamed from: zf6$a */
    public static final class C16113a<T> extends AtomicLong implements lj6<T>, fdg {
        private static final long serialVersionUID = -6246093802440953054L;

        /* JADX INFO: renamed from: a */
        public final ycg<? super T> f104998a;

        /* JADX INFO: renamed from: b */
        public final tu2<? super T> f104999b;

        /* JADX INFO: renamed from: c */
        public fdg f105000c;

        /* JADX INFO: renamed from: d */
        public boolean f105001d;

        public C16113a(ycg<? super T> ycgVar, tu2<? super T> tu2Var) {
            this.f104998a = ycgVar;
            this.f104999b = tu2Var;
        }

        @Override // p000.fdg
        public void cancel() {
            this.f105000c.cancel();
        }

        @Override // p000.ycg
        public void onComplete() {
            if (this.f105001d) {
                return;
            }
            this.f105001d = true;
            this.f104998a.onComplete();
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            if (this.f105001d) {
                pfe.onError(th);
            } else {
                this.f105001d = true;
                this.f104998a.onError(th);
            }
        }

        @Override // p000.ycg
        public void onNext(T t) {
            if (this.f105001d) {
                return;
            }
            if (get() != 0) {
                this.f104998a.onNext(t);
                so0.produced(this, 1L);
                return;
            }
            try {
                this.f104999b.accept(t);
            } catch (Throwable th) {
                n75.throwIfFatal(th);
                cancel();
                onError(th);
            }
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            if (mdg.validate(this.f105000c, fdgVar)) {
                this.f105000c = fdgVar;
                this.f104998a.onSubscribe(this);
                fdgVar.request(Long.MAX_VALUE);
            }
        }

        @Override // p000.fdg
        public void request(long j) {
            if (mdg.validate(j)) {
                so0.add(this, j);
            }
        }
    }

    public zf6(m86<T> m86Var) {
        super(m86Var);
        this.f104997c = this;
    }

    @Override // p000.tu2
    public void accept(T t) {
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super T> ycgVar) {
        this.f52360b.subscribe((lj6) new C16113a(ycgVar, this.f104997c));
    }

    public zf6(m86<T> m86Var, tu2<? super T> tu2Var) {
        super(m86Var);
        this.f104997c = tu2Var;
    }
}
