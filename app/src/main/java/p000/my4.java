package p000;

import android.util.Log;
import com.eyevue.common.bean.login.UserBean;
import p000.ck9;

/* JADX INFO: loaded from: classes4.dex */
public class my4 implements ck9.InterfaceC2346a {

    /* JADX INFO: renamed from: d */
    public static final String f62774d = "EmailCodePresenter";

    /* JADX INFO: renamed from: a */
    public final ck9.InterfaceC2347b f62775a;

    /* JADX INFO: renamed from: b */
    public final j47 f62776b = new j47();

    /* JADX INFO: renamed from: c */
    public String f62777c;

    /* JADX INFO: renamed from: my4$a */
    public class C9610a implements tg3<String> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f62778a;

        public C9610a(final boolean val$isRefresh) {
            this.f62778a = val$isRefresh;
        }

        @Override // p000.tg3
        public void addNetDisposable(mf4 disposable) {
            if (my4.this.f62775a != null) {
                my4.this.f62775a.addNetDisposable(disposable);
            }
        }

        @Override // p000.tg3
        public void onLoadError(int code, String msg) {
            Log.i("aaaaaaaa", "code =" + code);
        }

        @Override // p000.tg3
        public void onLoadSuccess(hr0<String> t, boolean isCache) {
            if (t == null) {
                my4.this.f62775a.onGetDataFail();
                return;
            }
            Log.i("aaaaaaaa", "t =" + t);
            Log.i("aaaaaaaa", "3222t =" + t);
            if (my4.this.f62775a != null) {
                Log.i("aaaaaaaa", "t =" + t.getMsg());
                Log.i("aaaaaaaa", "t =" + t.getCode());
                my4.this.f62775a.onGetDataSuccess("200", isCache, this.f62778a);
            }
        }
    }

    public my4(ck9.InterfaceC2347b mEmailCodeView) {
        this.f62775a = mEmailCodeView;
    }

    private void loadData(boolean isRefresh, boolean isNeedCache) {
        UserBean userBean = new UserBean();
        userBean.setEmail(this.f62777c);
        this.f62776b.getEmailCodeData(userBean, new C9610a(isRefresh));
    }

    @Override // p000.ck9.InterfaceC2346a
    public void requestData(String email) {
        this.f62777c = email;
        loadData(true, false);
    }
}
