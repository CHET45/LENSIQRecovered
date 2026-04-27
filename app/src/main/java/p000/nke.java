package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class nke implements ch2 {

    /* JADX INFO: renamed from: a */
    public final ch2 f64817a;

    /* JADX INFO: renamed from: b */
    public boolean f64818b;

    public nke(ch2 downstream) {
        this.f64817a = downstream;
    }

    @Override // p000.ch2, p000.k9a
    public void onComplete() {
        if (this.f64818b) {
            return;
        }
        try {
            this.f64817a.onComplete();
        } catch (Throwable th) {
            o75.throwIfFatal(th);
            ofe.onError(th);
        }
    }

    @Override // p000.ch2
    public void onError(@cfb Throwable e) {
        if (this.f64818b) {
            ofe.onError(e);
            return;
        }
        try {
            this.f64817a.onError(e);
        } catch (Throwable th) {
            o75.throwIfFatal(th);
            ofe.onError(new qm2(e, th));
        }
    }

    @Override // p000.ch2
    public void onSubscribe(@cfb lf4 d) {
        try {
            this.f64817a.onSubscribe(d);
        } catch (Throwable th) {
            o75.throwIfFatal(th);
            this.f64818b = true;
            d.dispose();
            ofe.onError(th);
        }
    }
}
