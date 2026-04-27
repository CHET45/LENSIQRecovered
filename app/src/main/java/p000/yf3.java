package p000;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public class yf3 {

    /* JADX INFO: renamed from: a */
    public final ili f101382a = (ili) o8e.getService(ili.class, i00.f45351X);

    /* JADX INFO: renamed from: yf3$a */
    public class C15644a implements oxb<String> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ cli f101383a;

        public C15644a(final cli val$listener) {
            this.f101383a = val$listener;
        }

        @Override // p000.oxb
        public void onComplete() {
        }

        @Override // p000.oxb
        public void onError(Throwable e) {
            cli cliVar = this.f101383a;
            if (cliVar != null) {
                cliVar.onLoadError(e.getMessage());
            }
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 d) {
            cli cliVar = this.f101383a;
            if (cliVar != null) {
                cliVar.addNetDisposable(d);
            }
        }

        @Override // p000.oxb
        public void onNext(String o) {
            cli cliVar = this.f101383a;
            if (cliVar != null) {
                cliVar.onLoadSuccess(o);
            }
        }
    }

    public static String getCurrentDate() {
        return new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date(System.currentTimeMillis()));
    }

    public void setData(cli listener) {
        this.f101382a.setData(h10.f41942D + getCurrentDate()).subscribeOn(npe.m18057io()).observeOn(C2062bv.mainThread()).subscribe(new C15644a(listener));
    }
}
