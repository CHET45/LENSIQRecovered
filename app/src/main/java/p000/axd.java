package p000;

import android.util.Log;
import com.eyevue.common.bean.login.UserBean;
import com.eyevue.common.bean.login.UserTokenBean;
import p000.ck9;

/* JADX INFO: loaded from: classes4.dex */
public class axd implements ck9.InterfaceC2356k {

    /* JADX INFO: renamed from: d */
    public static final String f12160d = "RegisterUserPresenter";

    /* JADX INFO: renamed from: a */
    public final ck9.InterfaceC2357l f12161a;

    /* JADX INFO: renamed from: b */
    public final zwd f12162b = new zwd();

    /* JADX INFO: renamed from: c */
    public UserBean f12163c;

    /* JADX INFO: renamed from: axd$a */
    public class C1650a implements tg3<UserTokenBean> {
        public C1650a() {
        }

        @Override // p000.tg3
        public void addNetDisposable(mf4 disposable) {
            if (axd.this.f12161a != null) {
                axd.this.f12161a.addNetDisposable(disposable);
            }
        }

        @Override // p000.tg3
        public void onLoadError(int code, String msg) {
            Log.i("aaaaaaaa", "onLoadError code =" + code);
            Log.i("aaaaaaaa", "onLoadError msg =" + msg);
            axd.this.f12161a.onGetDataFail(code, msg);
        }

        @Override // p000.tg3
        public void onLoadSuccess(hr0<UserTokenBean> t, boolean isCache) {
            if (t == null || axd.this.f12161a == null) {
                return;
            }
            Log.i("aaaaaaaa", "t =" + t.getData());
            Log.i("aaaaaaaa", "t =" + t.getCode());
            if (t.getData() != null) {
                axd.this.f12161a.onGetDataSuccess(t.getCode(), t.getData());
            } else {
                axd.this.f12161a.onGetDataFail(t.getCode(), t.getMsg());
            }
        }
    }

    public axd(ck9.InterfaceC2357l mRegisterEmailView) {
        this.f12161a = mRegisterEmailView;
    }

    private void loadData() {
        this.f12162b.postRegisterUserData(this.f12163c, new C1650a());
    }

    @Override // p000.ck9.InterfaceC2356k
    public void requestData(UserBean userBean) {
        this.f12163c = userBean;
        loadData();
    }
}
