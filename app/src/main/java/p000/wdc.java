package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class wdc<T> extends fec<T> {

    /* JADX INFO: renamed from: a */
    public final fec<T> f93986a;

    /* JADX INFO: renamed from: b */
    public final m8d<? super T> f93987b;

    /* JADX INFO: renamed from: wdc$a */
    public static abstract class AbstractC14559a<T> implements cq2<T>, fdg {

        /* JADX INFO: renamed from: a */
        public final m8d<? super T> f93988a;

        /* JADX INFO: renamed from: b */
        public fdg f93989b;

        /* JADX INFO: renamed from: c */
        public boolean f93990c;

        public AbstractC14559a(m8d<? super T> m8dVar) {
            this.f93988a = m8dVar;
        }

        @Override // p000.fdg
        public final void cancel() {
            this.f93989b.cancel();
        }

        @Override // p000.ycg
        public final void onNext(T t) {
            if (tryOnNext(t) || this.f93990c) {
                return;
            }
            this.f93989b.request(1L);
        }

        @Override // p000.fdg
        public final void request(long j) {
            this.f93989b.request(j);
        }
    }

    /* JADX INFO: renamed from: wdc$b */
    public static final class C14560b<T> extends AbstractC14559a<T> {

        /* JADX INFO: renamed from: d */
        public final cq2<? super T> f93991d;

        public C14560b(cq2<? super T> cq2Var, m8d<? super T> m8dVar) {
            super(m8dVar);
            this.f93991d = cq2Var;
        }

        @Override // p000.ycg
        public void onComplete() {
            if (this.f93990c) {
                return;
            }
            this.f93990c = true;
            this.f93991d.onComplete();
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            if (this.f93990c) {
                pfe.onError(th);
            } else {
                this.f93990c = true;
                this.f93991d.onError(th);
            }
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            if (mdg.validate(this.f93989b, fdgVar)) {
                this.f93989b = fdgVar;
                this.f93991d.onSubscribe(this);
            }
        }

        @Override // p000.cq2
        public boolean tryOnNext(T t) {
            if (!this.f93990c) {
                try {
                    if (this.f93988a.test(t)) {
                        return this.f93991d.tryOnNext(t);
                    }
                } catch (Throwable th) {
                    n75.throwIfFatal(th);
                    cancel();
                    onError(th);
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: wdc$c */
    public static final class C14561c<T> extends AbstractC14559a<T> {

        /* JADX INFO: renamed from: d */
        public final ycg<? super T> f93992d;

        public C14561c(ycg<? super T> ycgVar, m8d<? super T> m8dVar) {
            super(m8dVar);
            this.f93992d = ycgVar;
        }

        @Override // p000.ycg
        public void onComplete() {
            if (this.f93990c) {
                return;
            }
            this.f93990c = true;
            this.f93992d.onComplete();
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            if (this.f93990c) {
                pfe.onError(th);
            } else {
                this.f93990c = true;
                this.f93992d.onError(th);
            }
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            if (mdg.validate(this.f93989b, fdgVar)) {
                this.f93989b = fdgVar;
                this.f93992d.onSubscribe(this);
            }
        }

        @Override // p000.cq2
        public boolean tryOnNext(T t) {
            if (!this.f93990c) {
                try {
                    if (this.f93988a.test(t)) {
                        this.f93992d.onNext(t);
                        return true;
                    }
                } catch (Throwable th) {
                    n75.throwIfFatal(th);
                    cancel();
                    onError(th);
                }
            }
            return false;
        }
    }

    public wdc(fec<T> fecVar, m8d<? super T> m8dVar) {
        this.f93986a = fecVar;
        this.f93987b = m8dVar;
    }

    @Override // p000.fec
    public int parallelism() {
        return this.f93986a.parallelism();
    }

    @Override // p000.fec
    public void subscribe(ycg<? super T>[] ycgVarArr) {
        if (m10853a(ycgVarArr)) {
            int length = ycgVarArr.length;
            ycg<? super T>[] ycgVarArr2 = new ycg[length];
            for (int i = 0; i < length; i++) {
                ycg<? super T> ycgVar = ycgVarArr[i];
                if (ycgVar instanceof cq2) {
                    ycgVarArr2[i] = new C14560b((cq2) ycgVar, this.f93987b);
                } else {
                    ycgVarArr2[i] = new C14561c(ycgVar, this.f93987b);
                }
            }
            this.f93986a.subscribe(ycgVarArr2);
        }
    }
}
