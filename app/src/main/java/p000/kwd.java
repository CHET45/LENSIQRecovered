package p000;

import android.text.TextUtils;
import android.util.Log;
import com.eyevue.common.bean.login.UserBean;
import com.eyevue.common.bean.login.UserTokenBean;
import p000.ck9;

/* JADX INFO: loaded from: classes4.dex */
public class kwd implements ck9.InterfaceC2354i {

    /* JADX INFO: renamed from: c */
    public static final String f55520c = "RefreshTokenPresenter";

    /* JADX INFO: renamed from: a */
    public final ck9.InterfaceC2355j f55521a;

    /* JADX INFO: renamed from: b */
    public final jwd f55522b = new jwd();

    /* JADX INFO: renamed from: kwd$a */
    public class C8539a implements tg3<UserTokenBean> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f55523a;

        public C8539a(final boolean val$isRefresh) {
            this.f55523a = val$isRefresh;
        }

        @Override // p000.tg3
        public void addNetDisposable(mf4 disposable) {
            if (kwd.this.f55521a != null) {
                kwd.this.f55521a.addNetDisposable(disposable);
            }
        }

        @Override // p000.tg3
        public void onLoadError(int code, String msg) {
            Log.i("aaaaaaaa", "code =" + code);
        }

        @Override // p000.tg3
        public void onLoadSuccess(hr0<UserTokenBean> t, boolean isCache) {
            if (t != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(" t =");
                sb.append(t);
                if (t.getData() == null) {
                    kwd.this.f55521a.onGetDataFail();
                } else if (kwd.this.f55521a != null) {
                    kwd.this.f55521a.onGetDataSuccess(t.getData(), isCache, this.f55523a);
                }
            }
        }
    }

    public kwd(ck9.InterfaceC2355j mRefreshTokenView) {
        this.f55521a = mRefreshTokenView;
    }

    private void loadData(boolean isRefresh, boolean isNeedCache) {
        UserBean userBean = new UserBean();
        String string = vfe.getInstance().getString("SP_KEY_REFRESH_TOKEN");
        if (TextUtils.isEmpty(string)) {
            return;
        }
        userBean.setRefreshToken(string);
        this.f55522b.refreshToken(userBean, new C8539a(isRefresh));
    }

    @Override // p000.ck9.InterfaceC2354i
    public void requestData() {
        loadData(true, false);
    }
}
