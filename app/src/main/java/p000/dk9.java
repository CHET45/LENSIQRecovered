package p000;

import android.util.Log;
import com.eyevue.common.bean.login.UserTokenBean;
import p000.ck9;

/* JADX INFO: loaded from: classes4.dex */
public class dk9 implements ck9.InterfaceC2350e {

    /* JADX INFO: renamed from: e */
    public static final String f29874e = "ProjectInfoPresenter";

    /* JADX INFO: renamed from: a */
    public final ck9.InterfaceC2351f f29875a;

    /* JADX INFO: renamed from: b */
    public final ny4 f29876b = new ny4();

    /* JADX INFO: renamed from: c */
    public String f29877c;

    /* JADX INFO: renamed from: d */
    public String f29878d;

    /* JADX INFO: renamed from: dk9$a */
    public class C4831a implements tg3<UserTokenBean> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f29879a;

        public C4831a(final boolean val$isRefresh) {
            this.f29879a = val$isRefresh;
        }

        @Override // p000.tg3
        public void addNetDisposable(mf4 disposable) {
            if (dk9.this.f29875a != null) {
                dk9.this.f29875a.addNetDisposable(disposable);
            }
        }

        @Override // p000.tg3
        public void onLoadError(int code, String msg) {
            Log.i("aaaaaaaa", "code =" + code + "--------msg =" + msg);
            dk9.this.f29875a.onGetDataFail(code, msg);
        }

        @Override // p000.tg3
        public void onLoadSuccess(hr0<UserTokenBean> t, boolean isCache) {
            if (t != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(" t =");
                sb.append(t);
                if (t.getData() == null) {
                    dk9.this.f29875a.onGetDataFail(t.getCode(), t.getMsg());
                    return;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(" t 222  =");
                sb2.append(t.getData());
                if (dk9.this.f29875a == null || t.getData() == null) {
                    return;
                }
                dk9.this.f29875a.onGetDataSuccess(t.getData(), isCache, this.f29879a);
            }
        }
    }

    public dk9(ck9.InterfaceC2351f mLoginInfoView) {
        this.f29875a = mLoginInfoView;
    }

    private void loadData(boolean isRefresh, boolean isNeedCache) {
        this.f29876b.getLogin(this.f29877c, this.f29878d, new C4831a(isRefresh));
    }

    @Override // p000.ck9.InterfaceC2350e
    public void requestData(String email, String password) {
        this.f29877c = email;
        this.f29878d = password;
        loadData(true, false);
    }
}
