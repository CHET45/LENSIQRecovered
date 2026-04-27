package p000;

import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes7.dex */
public final class nvb<T> extends AbstractC10162o3<T, T> {

    /* JADX INFO: renamed from: b */
    public final int f65814b;

    /* JADX INFO: renamed from: nvb$a */
    public static final class C10083a<T> extends ArrayDeque<T> implements oxb<T>, mf4 {
        private static final long serialVersionUID = 7240042530241604978L;

        /* JADX INFO: renamed from: a */
        public final oxb<? super T> f65815a;

        /* JADX INFO: renamed from: b */
        public final int f65816b;

        /* JADX INFO: renamed from: c */
        public mf4 f65817c;

        /* JADX INFO: renamed from: d */
        public volatile boolean f65818d;

        public C10083a(oxb<? super T> oxbVar, int i) {
            this.f65815a = oxbVar;
            this.f65816b = i;
        }

        @Override // p000.mf4
        public void dispose() {
            if (this.f65818d) {
                return;
            }
            this.f65818d = true;
            this.f65817c.dispose();
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f65818d;
        }

        @Override // p000.oxb
        public void onComplete() {
            oxb<? super T> oxbVar = this.f65815a;
            while (!this.f65818d) {
                T tPoll = poll();
                if (tPoll == null) {
                    if (this.f65818d) {
                        return;
                    }
                    oxbVar.onComplete();
                    return;
                }
                oxbVar.onNext(tPoll);
            }
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            this.f65815a.onError(th);
        }

        @Override // p000.oxb
        public void onNext(T t) {
            if (this.f65816b == size()) {
                poll();
            }
            offer(t);
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.validate(this.f65817c, mf4Var)) {
                this.f65817c = mf4Var;
                this.f65815a.onSubscribe(this);
            }
        }
    }

    public nvb(xub<T> xubVar, int i) {
        super(xubVar);
        this.f65814b = i;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(oxb<? super T> oxbVar) {
        this.f66354a.subscribe(new C10083a(oxbVar, this.f65814b));
    }
}
