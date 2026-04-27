package p000;

import android.util.Log;
import com.eyevue.common.bean.login.UserTokenBean;
import p000.ck9;

/* JADX INFO: loaded from: classes4.dex */
public class bk9 implements ck9.InterfaceC2350e {

    /* JADX INFO: renamed from: e */
    public static final String f13946e = "LoginBySmsPresenter";

    /* JADX INFO: renamed from: a */
    public final ck9.InterfaceC2351f f13947a;

    /* JADX INFO: renamed from: b */
    public final ak9 f13948b = new ak9();

    /* JADX INFO: renamed from: c */
    public String f13949c;

    /* JADX INFO: renamed from: d */
    public String f13950d;

    /* JADX INFO: renamed from: bk9$a */
    public class C1928a implements tg3<UserTokenBean> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f13951a;

        public C1928a(final boolean val$isRefresh) {
            this.f13951a = val$isRefresh;
        }

        @Override // p000.tg3
        public void addNetDisposable(mf4 disposable) {
            if (bk9.this.f13947a != null) {
                bk9.this.f13947a.addNetDisposable(disposable);
            }
        }

        @Override // p000.tg3
        public void onLoadError(int code, String msg) {
            Log.i("aaaaaaaa", "msg =" + msg);
            bk9.this.f13947a.onGetDataFail(code, msg);
        }

        @Override // p000.tg3
        public void onLoadSuccess(hr0<UserTokenBean> t, boolean isCache) {
            if (t != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(" t =");
                sb.append(t);
                if (t.getData() != null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(" t 222  =");
                    sb2.append(t.getData());
                    if (bk9.this.f13947a != null) {
                        bk9.this.f13947a.onGetDataSuccess(t.getData(), isCache, this.f13951a);
                    }
                }
            }
        }
    }

    public bk9(ck9.InterfaceC2351f mLoginInfoView) {
        this.f13947a = mLoginInfoView;
    }

    private void loadData(boolean isRefresh, boolean isNeedCache) {
        this.f13948b.getLogin(this.f13949c, this.f13950d, new C1928a(isRefresh));
    }

    @Override // p000.ck9.InterfaceC2350e
    public void requestData(String mobile, String code) {
        this.f13949c = mobile;
        this.f13950d = code;
        loadData(true, false);
    }
}
