package p000;

/* JADX INFO: loaded from: classes4.dex */
public class g94 {

    /* JADX INFO: renamed from: a */
    public final ili f39040a;

    /* JADX INFO: renamed from: g94$a */
    public class C6172a implements oxb<String> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ cli f39041a;

        public C6172a(final cli val$listener) {
            this.f39041a = val$listener;
        }

        @Override // p000.oxb
        public void onComplete() {
        }

        @Override // p000.oxb
        public void onError(Throwable e) {
            cli cliVar = this.f39041a;
            if (cliVar != null) {
                cliVar.onLoadError(e.getMessage());
            }
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 d) {
            cli cliVar = this.f39041a;
            if (cliVar != null) {
                cliVar.addNetDisposable(d);
            }
        }

        @Override // p000.oxb
        public void onNext(String o) {
            cli cliVar = this.f39041a;
            if (cliVar != null) {
                cliVar.onLoadSuccess(o);
            }
        }
    }

    public g94() {
        o8e.clearCache();
        this.f39040a = (ili) o8e.getService(ili.class, u77.f86970n ? i00.f45352Y : i00.f45351X);
    }

    public void getDevicePhotoList(cli listener) {
        C6172a c6172a = new C6172a(listener);
        if (u77.f86970n) {
            this.f39040a.getDevicePhotoList_Ap().subscribeOn(npe.m18057io()).observeOn(C2062bv.mainThread()).subscribe(c6172a);
        } else {
            this.f39040a.getDevicePhotoList().subscribeOn(npe.m18057io()).observeOn(C2062bv.mainThread()).subscribe(c6172a);
        }
    }
}
