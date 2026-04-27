package p000;

import android.util.Log;
import com.eyevue.common.bean.login.UserInfoBean;
import p000.ck9;

/* JADX INFO: loaded from: classes4.dex */
public class nwh implements ck9.InterfaceC2362q {

    /* JADX INFO: renamed from: d */
    public static final String f65926d = "UpdateUserInfoPresenter";

    /* JADX INFO: renamed from: a */
    public final ck9.InterfaceC2363r f65927a;

    /* JADX INFO: renamed from: b */
    public final mwh f65928b = new mwh();

    /* JADX INFO: renamed from: c */
    public UserInfoBean f65929c;

    /* JADX INFO: renamed from: nwh$a */
    public class C10097a implements tg3<String> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f65930a;

        public C10097a(final boolean val$isRefresh) {
            this.f65930a = val$isRefresh;
        }

        @Override // p000.tg3
        public void addNetDisposable(mf4 disposable) {
            if (nwh.this.f65927a != null) {
                nwh.this.f65927a.addNetDisposable(disposable);
            }
        }

        @Override // p000.tg3
        public void onLoadError(int code, String msg) {
            Log.i("aaaaaaaa", "code =" + code);
            nwh.this.f65927a.onGetDataFail(code);
        }

        @Override // p000.tg3
        public void onLoadSuccess(hr0<String> t, boolean isCache) {
            if (t != null) {
                Log.i("aaaaaaaa", "t =" + t);
                Log.i("aaaaaaaa", "3222t =" + t);
                if (nwh.this.f65927a == null || t.getData() == null) {
                    return;
                }
                Log.i("aaaaaaaa", "t =" + t);
                nwh.this.f65927a.onGetDataSuccess(t.getData(), isCache, this.f65930a);
            }
        }
    }

    public nwh(ck9.InterfaceC2363r mUserInfoView) {
        this.f65927a = mUserInfoView;
    }

    private void loadData(boolean isRefresh, boolean isNeedCache) {
        this.f65928b.updateUserInfoData(this.f65929c, new C10097a(isRefresh));
    }

    @Override // p000.ck9.InterfaceC2362q
    public void requestData(UserInfoBean userInfo) {
        this.f65929c = userInfo;
        loadData(true, false);
    }
}
