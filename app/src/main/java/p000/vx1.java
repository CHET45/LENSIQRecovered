package p000;

import android.util.Log;
import com.eyevue.common.bean.authcode.AuthCode;
import com.eyevue.common.bean.authcode.CheckDeviceNameBean;
import p000.mkd;

/* JADX INFO: loaded from: classes4.dex */
public class vx1 implements mkd.InterfaceC9383a {

    /* JADX INFO: renamed from: d */
    public static final String f92524d = "CheckDeviceNamePresenter";

    /* JADX INFO: renamed from: a */
    public final mkd.InterfaceC9384b f92525a;

    /* JADX INFO: renamed from: b */
    public final ux1 f92526b = new ux1();

    /* JADX INFO: renamed from: c */
    public String f92527c;

    /* JADX INFO: renamed from: vx1$a */
    public class C14283a implements tg3<CheckDeviceNameBean> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f92528a;

        public C14283a(final boolean val$isRefresh) {
            this.f92528a = val$isRefresh;
        }

        @Override // p000.tg3
        public void addNetDisposable(mf4 disposable) {
            if (vx1.this.f92525a != null) {
                vx1.this.f92525a.addNetDisposable(disposable);
            }
        }

        @Override // p000.tg3
        public void onLoadError(int code, String msg) {
            Log.i("aaaaaaaa", "code =" + code);
            vx1.this.f92525a.onGetDataFail(code, msg);
        }

        @Override // p000.tg3
        public void onLoadSuccess(hr0<CheckDeviceNameBean> t, boolean isCache) {
            if (t == null || vx1.this.f92525a == null) {
                return;
            }
            vx1.this.f92525a.onGetDataSuccess(t.getData(), isCache, this.f92528a);
        }
    }

    public vx1(mkd.InterfaceC9384b mQrCheckDeviceNameView) {
        this.f92525a = mQrCheckDeviceNameView;
    }

    private void loadData(boolean isRefresh, boolean isNeedCache) {
        AuthCode authCode = new AuthCode();
        authCode.setAuthCode(this.f92527c);
        this.f92526b.checkDeviceNameData(authCode, new C14283a(isRefresh));
    }

    @Override // p000.mkd.InterfaceC9383a
    public void requestData(String qrCode) {
        this.f92527c = qrCode;
        loadData(true, false);
    }
}
