package p000;

/* JADX INFO: loaded from: classes4.dex */
public class ub9 {

    /* JADX INFO: renamed from: a */
    public final ili f87440a = (ili) o8e.getService(ili.class, i00.f45351X);

    /* JADX INFO: renamed from: ub9$a */
    public class C13459a implements oxb<String> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ cli f87441a;

        public C13459a(final cli val$listener) {
            this.f87441a = val$listener;
        }

        @Override // p000.oxb
        public void onComplete() {
        }

        @Override // p000.oxb
        public void onError(Throwable e) {
            cli cliVar = this.f87441a;
            if (cliVar != null) {
                cliVar.onLoadError(e.getMessage());
            }
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 d) {
            cli cliVar = this.f87441a;
            if (cliVar != null) {
                cliVar.addNetDisposable(d);
            }
        }

        @Override // p000.oxb
        public void onNext(String o) {
            cli cliVar = this.f87441a;
            if (cliVar != null) {
                cliVar.onLoadSuccess(o);
            }
        }
    }

    public void startLive(cli listener) {
        this.f87440a.startLive(h10.f41944F).subscribeOn(npe.m18057io()).observeOn(C2062bv.mainThread()).subscribe(new C13459a(listener));
    }
}
