package p000;

import com.blankj.utilcode.util.C2469b;
import com.eyevue.common.bean.login.UserInfoBean;
import p000.h75;

/* JADX INFO: loaded from: classes4.dex */
public class z57 {

    /* JADX INFO: renamed from: a */
    public final k10 f104234a = (k10) o8e.getService(k10.class, i00.f45335H);

    /* JADX INFO: renamed from: z57$a */
    public class C16011a extends us0<UserInfoBean> {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ tg3 f104235f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16011a(String cacheKey, boolean isNeedCache, boolean isSaveResultData, final tg3 val$listener) {
            super(cacheKey, isNeedCache, isSaveResultData);
            this.f104235f = val$listener;
        }

        @Override // p000.us0
        public void onCompleted() {
        }

        @Override // p000.us0
        public void onDisposable(mf4 d) {
            this.f104235f.addNetDisposable(d);
        }

        @Override // p000.us0
        public void onFail(h75.C6732a e) {
            zi9.dOnlyEvent("appName = " + C2469b.getAppName() + " reqHost=" + i00.f45335H + " reqUrl =" + h10.f41957l + " reqProtol = https  resCode=" + e.getCode() + " resMsg=" + e.getMessage());
            this.f104235f.onLoadError(e.getCode(), e.getMessage());
        }

        @Override // p000.us0
        public void onSuccess(hr0<UserInfoBean> result, boolean isDataFromCache) {
            zi9.dOnlyEvent("appName = " + C2469b.getAppName() + " reqHost=" + i00.f45335H + " reqUrl =" + h10.f41957l + " reqProtol = https  resCode=" + result.getCode() + " resMsg=" + result.getMsg());
            if (!result.isSuccess()) {
                this.f104235f.onLoadError(1002, result.getMsg());
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("result =");
            sb.append(result);
            this.f104235f.onLoadSuccess(result, isDataFromCache);
        }
    }

    public void getUserInfoData(tg3<UserInfoBean> listener) {
        this.f104234a.getUserInfoData().subscribeOn(npe.m18057io()).observeOn(C2062bv.mainThread()).subscribe(new C16011a("", false, false, listener));
    }
}
