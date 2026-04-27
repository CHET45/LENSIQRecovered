package p000;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public class a0h {

    /* JADX INFO: renamed from: a */
    public final ili f86a = (ili) o8e.getService(ili.class, i00.f45351X);

    /* JADX INFO: renamed from: a0h$a */
    public class C0007a implements oxb<String> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ cli f87a;

        public C0007a(final cli val$listener) {
            this.f87a = val$listener;
        }

        @Override // p000.oxb
        public void onComplete() {
        }

        @Override // p000.oxb
        public void onError(Throwable e) {
            cli cliVar = this.f87a;
            if (cliVar != null) {
                cliVar.onLoadError(e.getMessage());
            }
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 d) {
            cli cliVar = this.f87a;
            if (cliVar != null) {
                cliVar.addNetDisposable(d);
            }
        }

        @Override // p000.oxb
        public void onNext(String o) {
            cli cliVar = this.f87a;
            if (cliVar != null) {
                cliVar.onLoadSuccess(o);
            }
        }
    }

    public static String getCurrentTime() {
        return new SimpleDateFormat("HH:mm:ss", Locale.getDefault()).format(new Date(System.currentTimeMillis()));
    }

    public void setTime(cli listener) {
        this.f86a.setTime(h10.f41943E + getCurrentTime()).subscribeOn(npe.m18057io()).observeOn(C2062bv.mainThread()).subscribe(new C0007a(listener));
    }
}
