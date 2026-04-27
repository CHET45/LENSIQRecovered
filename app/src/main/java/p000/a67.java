package p000;

import android.text.TextUtils;
import android.util.Log;
import com.eyevue.common.bean.login.UserInfoBean;
import p000.ck9;

/* JADX INFO: loaded from: classes4.dex */
public class a67 implements ck9.InterfaceC2364s {

    /* JADX INFO: renamed from: c */
    public static final String f497c = "GetUserInfoPresenter";

    /* JADX INFO: renamed from: a */
    public final ck9.InterfaceC2365t f498a;

    /* JADX INFO: renamed from: b */
    public final z57 f499b = new z57();

    /* JADX INFO: renamed from: a67$a */
    public class C0074a implements tg3<UserInfoBean> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f500a;

        public C0074a(final boolean val$isRefresh) {
            this.f500a = val$isRefresh;
        }

        @Override // p000.tg3
        public void addNetDisposable(mf4 disposable) {
            if (a67.this.f498a != null) {
                a67.this.f498a.addNetDisposable(disposable);
            }
        }

        @Override // p000.tg3
        public void onLoadError(int code, String msg) {
            Log.i("aaaaaaaa", "code =" + code);
            a67.this.f498a.onGetDataFail(code);
        }

        @Override // p000.tg3
        public void onLoadSuccess(hr0<UserInfoBean> t, boolean isCache) {
            if (t != null) {
                Log.i("aaaaaaaa", "t =" + t);
                Log.i("aaaaaaaa", "3222t =" + t);
                if (a67.this.f498a == null || t.getData() == null) {
                    return;
                }
                Log.i("aaaaaaaa", "t =" + t);
                a67.this.f498a.onGetDataSuccess(t.getData(), isCache, this.f500a);
            }
        }
    }

    public a67(ck9.InterfaceC2365t mUserInfoView) {
        this.f498a = mUserInfoView;
    }

    private void loadData(boolean isRefresh, boolean isNeedCache) {
        this.f499b.getUserInfoData(new C0074a(isRefresh));
    }

    @Override // p000.ck9.InterfaceC2364s
    public void requestData() {
        String string = vfe.getInstance().getString("KEY_TOKEN");
        String string2 = vfe.getInstance().getString("KEY_LOGIN_EMAIL");
        if (TextUtils.isEmpty(string) && TextUtils.isEmpty(string2)) {
            return;
        }
        loadData(true, false);
    }
}
