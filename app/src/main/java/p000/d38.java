package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class d38<T> extends AtomicReference<mf4> implements oxb<T>, mf4 {
    private static final long serialVersionUID = -5417183359794346637L;

    /* JADX INFO: renamed from: a */
    public final f38<T> f28327a;

    /* JADX INFO: renamed from: b */
    public final int f28328b;

    /* JADX INFO: renamed from: c */
    public ajf<T> f28329c;

    /* JADX INFO: renamed from: d */
    public volatile boolean f28330d;

    /* JADX INFO: renamed from: e */
    public int f28331e;

    public d38(f38<T> f38Var, int i) {
        this.f28327a = f38Var;
        this.f28328b = i;
    }

    @Override // p000.mf4
    public void dispose() {
        ag4.dispose(this);
    }

    public int fusionMode() {
        return this.f28331e;
    }

    @Override // p000.mf4
    public boolean isDisposed() {
        return ag4.isDisposed(get());
    }

    public boolean isDone() {
        return this.f28330d;
    }

    @Override // p000.oxb
    public void onComplete() {
        this.f28327a.innerComplete(this);
    }

    @Override // p000.oxb
    public void onError(Throwable th) {
        this.f28327a.innerError(this, th);
    }

    @Override // p000.oxb
    public void onNext(T t) {
        if (this.f28331e == 0) {
            this.f28327a.innerNext(this, t);
        } else {
            this.f28327a.drain();
        }
    }

    @Override // p000.oxb
    public void onSubscribe(mf4 mf4Var) {
        if (ag4.setOnce(this, mf4Var)) {
            if (mf4Var instanceof umd) {
                umd umdVar = (umd) mf4Var;
                int iRequestFusion = umdVar.requestFusion(3);
                if (iRequestFusion == 1) {
                    this.f28331e = iRequestFusion;
                    this.f28329c = umdVar;
                    this.f28330d = true;
                    this.f28327a.innerComplete(this);
                    return;
                }
                if (iRequestFusion == 2) {
                    this.f28331e = iRequestFusion;
                    this.f28329c = umdVar;
                    return;
                }
            }
            this.f28329c = ymd.createQueue(-this.f28328b);
        }
    }

    public ajf<T> queue() {
        return this.f28329c;
    }

    public void setDone() {
        this.f28330d = true;
    }
}
