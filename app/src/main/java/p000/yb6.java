package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class yb6<T> extends AbstractC8162k1<T, T> {

    /* JADX INFO: renamed from: c */
    public final tu2<? super fdg> f101032c;

    /* JADX INFO: renamed from: d */
    public final yk9 f101033d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC7178i8 f101034e;

    /* JADX INFO: renamed from: yb6$a */
    public static final class C15601a<T> implements lj6<T>, fdg {

        /* JADX INFO: renamed from: a */
        public final ycg<? super T> f101035a;

        /* JADX INFO: renamed from: b */
        public final tu2<? super fdg> f101036b;

        /* JADX INFO: renamed from: c */
        public final yk9 f101037c;

        /* JADX INFO: renamed from: d */
        public final InterfaceC7178i8 f101038d;

        /* JADX INFO: renamed from: e */
        public fdg f101039e;

        public C15601a(ycg<? super T> ycgVar, tu2<? super fdg> tu2Var, yk9 yk9Var, InterfaceC7178i8 interfaceC7178i8) {
            this.f101035a = ycgVar;
            this.f101036b = tu2Var;
            this.f101038d = interfaceC7178i8;
            this.f101037c = yk9Var;
        }

        @Override // p000.fdg
        public void cancel() {
            fdg fdgVar = this.f101039e;
            mdg mdgVar = mdg.CANCELLED;
            if (fdgVar != mdgVar) {
                this.f101039e = mdgVar;
                try {
                    this.f101038d.run();
                } catch (Throwable th) {
                    n75.throwIfFatal(th);
                    pfe.onError(th);
                }
                fdgVar.cancel();
            }
        }

        @Override // p000.ycg
        public void onComplete() {
            if (this.f101039e != mdg.CANCELLED) {
                this.f101035a.onComplete();
            }
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            if (this.f101039e != mdg.CANCELLED) {
                this.f101035a.onError(th);
            } else {
                pfe.onError(th);
            }
        }

        @Override // p000.ycg
        public void onNext(T t) {
            this.f101035a.onNext(t);
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            try {
                this.f101036b.accept(fdgVar);
                if (mdg.validate(this.f101039e, fdgVar)) {
                    this.f101039e = fdgVar;
                    this.f101035a.onSubscribe(this);
                }
            } catch (Throwable th) {
                n75.throwIfFatal(th);
                fdgVar.cancel();
                this.f101039e = mdg.CANCELLED;
                x05.error(th, this.f101035a);
            }
        }

        @Override // p000.fdg
        public void request(long j) {
            try {
                this.f101037c.accept(j);
            } catch (Throwable th) {
                n75.throwIfFatal(th);
                pfe.onError(th);
            }
            this.f101039e.request(j);
        }
    }

    public yb6(m86<T> m86Var, tu2<? super fdg> tu2Var, yk9 yk9Var, InterfaceC7178i8 interfaceC7178i8) {
        super(m86Var);
        this.f101032c = tu2Var;
        this.f101033d = yk9Var;
        this.f101034e = interfaceC7178i8;
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super T> ycgVar) {
        this.f52360b.subscribe((lj6) new C15601a(ycgVar, this.f101032c, this.f101033d, this.f101034e));
    }
}
