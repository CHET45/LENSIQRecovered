package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class zke<T> implements hnf<T> {

    /* JADX INFO: renamed from: a */
    public final hnf<? super T> f105351a;

    /* JADX INFO: renamed from: b */
    public boolean f105352b;

    public zke(hnf<? super T> downstream) {
        this.f105351a = downstream;
    }

    @Override // p000.hnf
    public void onError(@cfb Throwable e) {
        if (this.f105352b) {
            ofe.onError(e);
            return;
        }
        try {
            this.f105351a.onError(e);
        } catch (Throwable th) {
            o75.throwIfFatal(th);
            ofe.onError(new qm2(e, th));
        }
    }

    @Override // p000.hnf
    public void onSubscribe(@cfb lf4 d) {
        try {
            this.f105351a.onSubscribe(d);
        } catch (Throwable th) {
            o75.throwIfFatal(th);
            this.f105352b = true;
            d.dispose();
            ofe.onError(th);
        }
    }

    @Override // p000.hnf
    public void onSuccess(@cfb T t) {
        if (this.f105352b) {
            return;
        }
        try {
            this.f105351a.onSuccess(t);
        } catch (Throwable th) {
            o75.throwIfFatal(th);
            ofe.onError(th);
        }
    }
}
