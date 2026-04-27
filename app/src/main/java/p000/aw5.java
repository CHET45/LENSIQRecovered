package p000;

import com.blankj.utilcode.util.C2469b;
import com.eyevue.common.bean.login.UserBean;
import p000.h75;

/* JADX INFO: loaded from: classes4.dex */
public class aw5 {

    /* JADX INFO: renamed from: a */
    public final k10 f11991a = (k10) o8e.getService(k10.class, i00.f45335H);

    /* JADX INFO: renamed from: aw5$a */
    public class C1625a extends us0<String> {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ tg3 f11992f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1625a(String cacheKey, boolean isNeedCache, boolean isSaveResultData, final tg3 val$listener) {
            super(cacheKey, isNeedCache, isSaveResultData);
            this.f11992f = val$listener;
        }

        @Override // p000.us0
        public void onCompleted() {
        }

        @Override // p000.us0
        public void onDisposable(mf4 d) {
            this.f11992f.addNetDisposable(d);
        }

        @Override // p000.us0
        public void onFail(h75.C6732a e) {
            zi9.dOnlyEvent("appName = " + C2469b.getAppName() + " reqHost=" + i00.f45335H + " reqUrl =" + h10.f41960o + " reqProtol = https  resCode=" + e.getCode() + " resMsg=" + e.getMessage());
            this.f11992f.onLoadError(e.getCode(), e.getMessage());
        }

        @Override // p000.us0
        public void onSuccess(hr0<String> result, boolean isDataFromCache) {
            zi9.dOnlyEvent("appName = " + C2469b.getAppName() + " reqHost=" + i00.f45335H + " reqUrl =" + h10.f41960o + " reqProtol = https  resCode=" + result.getCode() + " resMsg=" + result.getMsg());
            if (!result.isSuccess()) {
                this.f11992f.onLoadError(1002, result.getMsg());
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("result =");
            sb.append(result);
            this.f11992f.onLoadSuccess(result, isDataFromCache);
        }
    }

    public void postFindPasswordData(UserBean userBean, tg3<String> listener) {
        this.f11991a.postFindPassword(userBean).subscribeOn(npe.m18057io()).observeOn(C2062bv.mainThread()).subscribe(new C1625a("", false, false, listener));
    }
}
