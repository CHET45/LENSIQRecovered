package p000;

import android.util.Log;
import com.eyevue.common.bean.login.UserBean;
import p000.ck9;

/* JADX INFO: loaded from: classes4.dex */
public class bw5 implements ck9.InterfaceC2348c {

    /* JADX INFO: renamed from: d */
    public static final String f15015d = "FindPasswordPresenter";

    /* JADX INFO: renamed from: a */
    public final ck9.InterfaceC2349d f15016a;

    /* JADX INFO: renamed from: b */
    public final aw5 f15017b = new aw5();

    /* JADX INFO: renamed from: c */
    public UserBean f15018c;

    /* JADX INFO: renamed from: bw5$a */
    public class C2077a implements tg3<String> {
        public C2077a() {
        }

        @Override // p000.tg3
        public void addNetDisposable(mf4 disposable) {
            if (bw5.this.f15016a != null) {
                bw5.this.f15016a.addNetDisposable(disposable);
            }
        }

        @Override // p000.tg3
        public void onLoadError(int code, String msg) {
            Log.i("aaaaaaaa", "code =" + code);
            Log.i("aaaaaaaa", "msg =" + msg);
            bw5.this.f15016a.onGetDataFail(msg);
        }

        @Override // p000.tg3
        public void onLoadSuccess(hr0<String> t, boolean isCache) {
            if (t == null || bw5.this.f15016a == null) {
                return;
            }
            Log.i("aaaaaaaa", "t =" + t.getCode());
            Log.i("aaaaaaaa", "t =" + t.getMsg());
            bw5.this.f15016a.onGetDataSuccess(String.valueOf(t.getCode()));
        }
    }

    public bw5(ck9.InterfaceC2349d mFindPasswordView) {
        this.f15016a = mFindPasswordView;
    }

    private void loadData() {
        this.f15017b.postFindPasswordData(this.f15018c, new C2077a());
    }

    @Override // p000.ck9.InterfaceC2348c
    public void requestData(UserBean userBean) {
        this.f15018c = userBean;
        loadData();
    }
}
