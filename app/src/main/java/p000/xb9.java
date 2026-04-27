package p000;

import com.blankj.utilcode.util.C2473f;
import p000.hac;

/* JADX INFO: loaded from: classes4.dex */
public class xb9 implements hac.InterfaceC6774i {

    /* JADX INFO: renamed from: c */
    public static final String f97432c = "LivePresenter";

    /* JADX INFO: renamed from: a */
    public final hac.InterfaceC6775j f97433a;

    /* JADX INFO: renamed from: b */
    public final ub9 f97434b = new ub9();

    /* JADX INFO: renamed from: xb9$a */
    public class C15024a implements cli {
        public C15024a() {
        }

        @Override // p000.cli
        public void addNetDisposable(mf4 disposable) {
            if (xb9.this.f97433a != null) {
                xb9.this.f97433a.addNetDisposable(disposable);
            }
        }

        @Override // p000.cli
        public void onLoadError(String var2) {
            C2473f.m4168e(xb9.f97432c, "startLive onLoadError: " + var2);
            if (xb9.this.f97433a != null) {
                xb9.this.f97433a.onLiveFail(var2);
            }
        }

        @Override // p000.cli
        public void onLoadSuccess(String result) {
            C2473f.m4168e("startLive success:::" + result);
            if (xb9.this.f97433a != null) {
                xb9.this.f97433a.onLiveSuccess();
            }
        }
    }

    public xb9(hac.InterfaceC6775j liveView) {
        this.f97433a = liveView;
    }

    private void loadData() {
        this.f97434b.startLive(new C15024a());
    }

    @Override // p000.hac.InterfaceC6774i
    public void requestData() {
        loadData();
    }
}
