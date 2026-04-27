package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class uke<T> implements k9a<T> {

    /* JADX INFO: renamed from: a */
    public final k9a<? super T> f88237a;

    /* JADX INFO: renamed from: b */
    public boolean f88238b;

    public uke(k9a<? super T> downstream) {
        this.f88237a = downstream;
    }

    @Override // p000.k9a
    public void onComplete() {
        if (this.f88238b) {
            return;
        }
        try {
            this.f88237a.onComplete();
        } catch (Throwable th) {
            o75.throwIfFatal(th);
            ofe.onError(th);
        }
    }

    @Override // p000.k9a
    public void onError(@cfb Throwable e) {
        if (this.f88238b) {
            ofe.onError(e);
            return;
        }
        try {
            this.f88237a.onError(e);
        } catch (Throwable th) {
            o75.throwIfFatal(th);
            ofe.onError(new qm2(e, th));
        }
    }

    @Override // p000.k9a
    public void onSubscribe(@cfb lf4 d) {
        try {
            this.f88237a.onSubscribe(d);
        } catch (Throwable th) {
            o75.throwIfFatal(th);
            this.f88238b = true;
            d.dispose();
            ofe.onError(th);
        }
    }

    @Override // p000.k9a
    public void onSuccess(@cfb T t) {
        if (this.f88238b) {
            return;
        }
        try {
            this.f88237a.onSuccess(t);
        } catch (Throwable th) {
            o75.throwIfFatal(th);
            ofe.onError(th);
        }
    }
}
