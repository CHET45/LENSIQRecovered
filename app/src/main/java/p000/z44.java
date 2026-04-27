package p000;

/* JADX INFO: loaded from: classes4.dex */
public class z44 {

    /* JADX INFO: renamed from: a */
    public final ili f104038a;

    /* JADX INFO: renamed from: z44$a */
    public class C15983a implements oxb<String> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ cli f104039a;

        public C15983a(final cli val$listener) {
            this.f104039a = val$listener;
        }

        @Override // p000.oxb
        public void onComplete() {
        }

        @Override // p000.oxb
        public void onError(Throwable e) {
            cli cliVar = this.f104039a;
            if (cliVar != null) {
                cliVar.onLoadError(e.getMessage());
            }
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 d) {
            cli cliVar = this.f104039a;
            if (cliVar != null) {
                cliVar.addNetDisposable(d);
            }
        }

        @Override // p000.oxb
        public void onNext(String o) {
            cli cliVar = this.f104039a;
            if (cliVar != null) {
                cliVar.onLoadSuccess(o);
            }
        }
    }

    public z44() {
        o8e.clearCache();
        this.f104038a = (ili) o8e.getService(ili.class, u77.f86970n ? i00.f45352Y : i00.f45351X);
    }

    public void deleteFile(String fileName, cli listener) {
        ili iliVar = this.f104038a;
        StringBuilder sb = new StringBuilder();
        sb.append(u77.f86970n ? h10.f41940B : h10.f41939A);
        sb.append(fileName);
        iliVar.deleteFile(sb.toString()).subscribeOn(npe.m18057io()).observeOn(C2062bv.mainThread()).subscribe(new C15983a(listener));
    }
}
