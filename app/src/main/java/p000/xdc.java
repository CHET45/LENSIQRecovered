package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class xdc<T> extends eec<T> {

    /* JADX INFO: renamed from: a */
    public final eec<T> f97561a;

    /* JADX INFO: renamed from: b */
    public final n8d<? super T> f97562b;

    /* JADX INFO: renamed from: xdc$a */
    public static abstract class AbstractC15033a<T> implements bq2<T>, fdg {

        /* JADX INFO: renamed from: a */
        public final n8d<? super T> f97563a;

        /* JADX INFO: renamed from: b */
        public fdg f97564b;

        /* JADX INFO: renamed from: c */
        public boolean f97565c;

        public AbstractC15033a(n8d<? super T> predicate) {
            this.f97563a = predicate;
        }

        @Override // p000.fdg
        public final void cancel() {
            this.f97564b.cancel();
        }

        @Override // p000.ycg
        public final void onNext(T t) {
            if (tryOnNext(t) || this.f97565c) {
                return;
            }
            this.f97564b.request(1L);
        }

        @Override // p000.fdg
        public final void request(long n) {
            this.f97564b.request(n);
        }
    }

    /* JADX INFO: renamed from: xdc$b */
    public static final class C15034b<T> extends AbstractC15033a<T> {

        /* JADX INFO: renamed from: d */
        public final bq2<? super T> f97566d;

        public C15034b(bq2<? super T> actual, n8d<? super T> predicate) {
            super(predicate);
            this.f97566d = actual;
        }

        @Override // p000.ycg
        public void onComplete() {
            if (this.f97565c) {
                return;
            }
            this.f97565c = true;
            this.f97566d.onComplete();
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            if (this.f97565c) {
                ofe.onError(t);
            } else {
                this.f97565c = true;
                this.f97566d.onError(t);
            }
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            if (ldg.validate(this.f97564b, s)) {
                this.f97564b = s;
                this.f97566d.onSubscribe(this);
            }
        }

        @Override // p000.bq2
        public boolean tryOnNext(T t) {
            if (!this.f97565c) {
                try {
                    if (this.f97563a.test(t)) {
                        return this.f97566d.tryOnNext(t);
                    }
                } catch (Throwable th) {
                    o75.throwIfFatal(th);
                    cancel();
                    onError(th);
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: xdc$c */
    public static final class C15035c<T> extends AbstractC15033a<T> {

        /* JADX INFO: renamed from: d */
        public final ycg<? super T> f97567d;

        public C15035c(ycg<? super T> actual, n8d<? super T> predicate) {
            super(predicate);
            this.f97567d = actual;
        }

        @Override // p000.ycg
        public void onComplete() {
            if (this.f97565c) {
                return;
            }
            this.f97565c = true;
            this.f97567d.onComplete();
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            if (this.f97565c) {
                ofe.onError(t);
            } else {
                this.f97565c = true;
                this.f97567d.onError(t);
            }
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            if (ldg.validate(this.f97564b, s)) {
                this.f97564b = s;
                this.f97567d.onSubscribe(this);
            }
        }

        @Override // p000.bq2
        public boolean tryOnNext(T t) {
            if (!this.f97565c) {
                try {
                    if (this.f97563a.test(t)) {
                        this.f97567d.onNext(t);
                        return true;
                    }
                } catch (Throwable th) {
                    o75.throwIfFatal(th);
                    cancel();
                    onError(th);
                }
            }
            return false;
        }
    }

    public xdc(eec<T> source, n8d<? super T> predicate) {
        this.f97561a = source;
        this.f97562b = predicate;
    }

    @Override // p000.eec
    public int parallelism() {
        return this.f97561a.parallelism();
    }

    @Override // p000.eec
    public void subscribe(ycg<? super T>[] subscribers) {
        ycg<?>[] ycgVarArrOnSubscribe = ofe.onSubscribe(this, subscribers);
        if (m9902a(ycgVarArrOnSubscribe)) {
            int length = ycgVarArrOnSubscribe.length;
            ycg<? super T>[] ycgVarArr = new ycg[length];
            for (int i = 0; i < length; i++) {
                ycg<?> ycgVar = ycgVarArrOnSubscribe[i];
                if (ycgVar instanceof bq2) {
                    ycgVarArr[i] = new C15034b((bq2) ycgVar, this.f97562b);
                } else {
                    ycgVarArr[i] = new C15035c(ycgVar, this.f97562b);
                }
            }
            this.f97561a.subscribe(ycgVarArr);
        }
    }
}
