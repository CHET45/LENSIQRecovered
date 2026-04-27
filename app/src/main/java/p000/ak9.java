package p000;

import com.blankj.utilcode.util.C2469b;
import com.eyevue.common.bean.login.UserBean;
import com.eyevue.common.bean.login.UserTokenBean;
import p000.h75;

/* JADX INFO: loaded from: classes4.dex */
public class ak9 {

    /* JADX INFO: renamed from: a */
    public final k10 f1828a = (k10) o8e.getService(k10.class, i00.f45335H);

    /* JADX INFO: renamed from: ak9$a */
    public class C0298a extends us0<UserTokenBean> {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ tg3 f1829f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0298a(String cacheKey, boolean isNeedCache, boolean isSaveResultData, final tg3 val$listener) {
            super(cacheKey, isNeedCache, isSaveResultData);
            this.f1829f = val$listener;
        }

        @Override // p000.us0
        public void onCompleted() {
        }

        @Override // p000.us0
        public void onDisposable(mf4 d) {
            this.f1829f.addNetDisposable(d);
        }

        @Override // p000.us0
        public void onFail(h75.C6732a e) {
            zi9.dOnlyEvent("appName = " + C2469b.getAppName() + " reqHost=" + i00.f45335H + " reqUrl =" + h10.f41954i + " reqProtol = https  resCode=" + e.getCode() + " resMsg=" + e.getMessage());
            this.f1829f.onLoadError(e.getCode(), e.getMessage());
        }

        @Override // p000.us0
        public void onSuccess(hr0<UserTokenBean> result, boolean isDataFromCache) {
            zi9.dOnlyEvent("appName = " + C2469b.getAppName() + " reqHost=" + i00.f45335H + " reqUrl =" + h10.f41954i + " reqProtol = https  resCode=" + result.getCode() + " resMsg=" + result.getMsg());
            if (result.isSuccess()) {
                this.f1829f.onLoadSuccess(result, isDataFromCache);
            } else {
                this.f1829f.onLoadError(1002, result.getMsg());
            }
        }
    }

    public void getLogin(String mobile, String smsCode, tg3<UserTokenBean> listener) {
        UserBean userBean = new UserBean();
        userBean.setPhone(mobile);
        userBean.setCode(smsCode);
        this.f1828a.getLoginData(userBean).subscribeOn(npe.m18057io()).observeOn(C2062bv.mainThread()).subscribe(new C0298a("", false, false, listener));
    }
}
