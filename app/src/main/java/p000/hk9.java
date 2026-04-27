package p000;

import android.util.Log;
import p000.ck9;

/* JADX INFO: loaded from: classes4.dex */
public class hk9 implements ck9.InterfaceC2352g {

    /* JADX INFO: renamed from: c */
    public static final String f43905c = "LogoutPresenter";

    /* JADX INFO: renamed from: a */
    public final ck9.InterfaceC2353h f43906a;

    /* JADX INFO: renamed from: b */
    public final gk9 f43907b = new gk9();

    /* JADX INFO: renamed from: hk9$a */
    public class C6879a implements tg3<String> {
        public C6879a() {
        }

        @Override // p000.tg3
        public void addNetDisposable(mf4 disposable) {
            if (hk9.this.f43906a != null) {
                hk9.this.f43906a.addNetDisposable(disposable);
            }
        }

        @Override // p000.tg3
        public void onLoadError(int code, String msg) {
            Log.i("aaaaaaaa", "code =" + code + "--------msg =" + msg);
            hk9.this.f43906a.onGetDataFail(code, msg);
        }

        @Override // p000.tg3
        public void onLoadSuccess(hr0<String> t, boolean isCache) {
            if (t != null) {
                hk9.this.f43906a.onGetDataSuccess(t.getCode());
            }
        }
    }

    public hk9(ck9.InterfaceC2353h mLogoutView) {
        this.f43906a = mLogoutView;
    }

    private void loadData(boolean isRefresh, boolean isNeedCache) {
        this.f43907b.logoutData(new C6879a());
    }

    @Override // p000.ck9.InterfaceC2352g
    public void requestData() {
        loadData(true, false);
    }
}
