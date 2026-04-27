package p000;

import com.blankj.utilcode.util.C2469b;
import com.eyevue.common.bean.login.UserBean;
import com.eyevue.common.bean.login.UserTokenBean;
import p000.h75;

/* JADX INFO: loaded from: classes4.dex */
public class jwd {

    /* JADX INFO: renamed from: a */
    public final k10 f52137a = (k10) o8e.getService(k10.class, i00.f45335H);

    /* JADX INFO: renamed from: jwd$a */
    public class C8128a extends us0<UserTokenBean> {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ tg3 f52138f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8128a(String cacheKey, boolean isNeedCache, boolean isSaveResultData, final tg3 val$listener) {
            super(cacheKey, isNeedCache, isSaveResultData);
            this.f52138f = val$listener;
        }

        @Override // p000.us0
        public void onCompleted() {
        }

        @Override // p000.us0
        public void onDisposable(mf4 d) {
            this.f52138f.addNetDisposable(d);
        }

        @Override // p000.us0
        public void onFail(h75.C6732a e) {
            zi9.dOnlyEvent("appName = " + C2469b.getAppName() + " reqHost=" + i00.f45335H + " reqUrl =" + h10.f41956k + " reqProtol = https  resCode=" + e.getCode() + " resMsg=" + e.getMessage());
            this.f52138f.onLoadError(e.getCode(), e.getMessage());
        }

        @Override // p000.us0
        public void onSuccess(hr0<UserTokenBean> result, boolean isDataFromCache) {
            zi9.dOnlyEvent("appName = " + C2469b.getAppName() + " reqHost=" + i00.f45335H + " reqUrl =" + h10.f41956k + " reqProtol = https  resCode=" + result.getCode() + " resMsg=" + result.getMsg());
            if (!result.isSuccess()) {
                this.f52138f.onLoadError(1002, result.getMsg());
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("result =");
            sb.append(result);
            this.f52138f.onLoadSuccess(result, isDataFromCache);
        }
    }

    public void refreshToken(UserBean userBean, tg3<UserTokenBean> listener) {
        this.f52137a.refreshToken(userBean).subscribeOn(npe.m18057io()).observeOn(C2062bv.mainThread()).subscribe(new C8128a("", false, false, listener));
    }
}
