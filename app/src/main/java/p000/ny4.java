package p000;

import com.blankj.utilcode.util.C2469b;
import com.eyevue.common.bean.login.UserBean;
import com.eyevue.common.bean.login.UserTokenBean;
import p000.h75;

/* JADX INFO: loaded from: classes4.dex */
public class ny4 {

    /* JADX INFO: renamed from: a */
    public final k10 f66001a = (k10) o8e.getService(k10.class, i00.f45335H);

    /* JADX INFO: renamed from: ny4$a */
    public class C10115a extends us0<UserTokenBean> {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ tg3 f66002f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10115a(String cacheKey, boolean isNeedCache, boolean isSaveResultData, final tg3 val$listener) {
            super(cacheKey, isNeedCache, isSaveResultData);
            this.f66002f = val$listener;
        }

        @Override // p000.us0
        public void onCompleted() {
        }

        @Override // p000.us0
        public void onDisposable(mf4 d) {
            this.f66002f.addNetDisposable(d);
        }

        @Override // p000.us0
        public void onFail(h75.C6732a e) {
            zi9.dOnlyEvent("appName = " + C2469b.getAppName() + " reqHost=" + i00.f45335H + " reqUrl =" + h10.f41958m + " reqProtol = https  resCode=" + e.getCode() + " resMsg=" + e.getMessage());
            this.f66002f.onLoadError(e.getCode(), e.getMessage());
        }

        @Override // p000.us0
        public void onSuccess(hr0<UserTokenBean> result, boolean isDataFromCache) {
            zi9.dOnlyEvent("appName = " + C2469b.getAppName() + " reqHost=" + i00.f45335H + " reqUrl =" + h10.f41958m + " reqProtol = https  resCode=" + result.getCode() + " resMsg=" + result.getMsg());
            if (result.isSuccess()) {
                this.f66002f.onLoadSuccess(result, isDataFromCache);
            } else {
                this.f66002f.onLoadError(1002, result.getMsg());
            }
        }
    }

    public void getLogin(String email, String password, tg3<UserTokenBean> listener) {
        UserBean userBean = new UserBean();
        userBean.setEmail(email);
        userBean.setPassword(password);
        this.f66001a.getEmailLoginData(userBean).subscribeOn(npe.m18057io()).observeOn(C2062bv.mainThread()).subscribe(new C10115a("", false, false, listener));
    }
}
