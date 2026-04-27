package p000;

import android.util.Log;
import com.eyevue.common.bean.authcode.AuthCode;
import p000.mkd;

/* JADX INFO: loaded from: classes4.dex */
public class okd implements mkd.InterfaceC9385c {

    /* JADX INFO: renamed from: d */
    public static final String f67911d = "QrCodeSubmitPresenter";

    /* JADX INFO: renamed from: a */
    public final mkd.InterfaceC9386d f67912a;

    /* JADX INFO: renamed from: b */
    public final nkd f67913b = new nkd();

    /* JADX INFO: renamed from: c */
    public String f67914c;

    /* JADX INFO: renamed from: okd$a */
    public class C10400a implements tg3<String> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f67915a;

        public C10400a(final boolean val$isRefresh) {
            this.f67915a = val$isRefresh;
        }

        @Override // p000.tg3
        public void addNetDisposable(mf4 disposable) {
            if (okd.this.f67912a != null) {
                okd.this.f67912a.addNetDisposable(disposable);
            }
        }

        @Override // p000.tg3
        public void onLoadError(int code, String msg) {
            Log.i("aaaaaaaa", "code =" + code);
            okd.this.f67912a.onGetDataFail(code, msg);
        }

        @Override // p000.tg3
        public void onLoadSuccess(hr0<String> t, boolean isCache) {
            if (t == null || okd.this.f67912a == null) {
                return;
            }
            okd.this.f67912a.onGetDataSuccess(t.getData(), isCache, this.f67915a);
        }
    }

    public okd(mkd.InterfaceC9386d mQrCodeSubmitView) {
        this.f67912a = mQrCodeSubmitView;
    }

    private void loadData(boolean isRefresh, boolean isNeedCache) {
        AuthCode authCode = new AuthCode();
        authCode.setAuthCode(this.f67914c);
        this.f67913b.submitQrCode(authCode, new C10400a(isRefresh));
    }

    @Override // p000.mkd.InterfaceC9385c
    public void requestData(String qrCode) {
        this.f67914c = qrCode;
        loadData(true, false);
    }
}
