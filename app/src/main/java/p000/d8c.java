package p000;

import com.blankj.utilcode.util.C2469b;
import com.eyevue.common.bean.ota.OtaBean;
import p000.h75;

/* JADX INFO: loaded from: classes4.dex */
public class d8c {

    /* JADX INFO: renamed from: a */
    public final z7c f28754a = l10.getOtaApiService();

    /* JADX INFO: renamed from: d8c$a */
    public class C4670a extends us0<OtaBean> {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ tg3 f28755f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4670a(String cacheKey, boolean isNeedCache, boolean isSaveResultData, final tg3 val$listener) {
            super(cacheKey, isNeedCache, isSaveResultData);
            this.f28755f = val$listener;
        }

        @Override // p000.us0
        public void onCompleted() {
        }

        @Override // p000.us0
        public void onDisposable(mf4 d) {
            this.f28755f.addNetDisposable(d);
        }

        @Override // p000.us0
        public void onFail(h75.C6732a e) {
            zi9.dOnlyEvent("appName = " + C2469b.getAppName() + " reqHost=" + i00.f45335H + " reqUrl =" + h10.f41941C + " reqProtol = https  resCode=" + e.getCode() + " resMsg=" + e.getMessage());
            this.f28755f.onLoadError(e.getCode(), e.getMessage());
        }

        @Override // p000.us0
        public void onSuccess(hr0<OtaBean> result, boolean isDataFromCache) {
            zi9.dOnlyEvent("appName = " + C2469b.getAppName() + " reqHost=" + i00.f45335H + " reqUrl =" + h10.f41941C + " reqProtol = https  resCode=" + result.getCode() + " resMsg=" + result.getMsg());
            if (result.isSuccess()) {
                this.f28755f.onLoadSuccess(result, isDataFromCache);
            } else {
                this.f28755f.onLoadError(1002, result.getMsg());
            }
        }
    }

    public void checkOtaVersion(String version, String customer, boolean isNeedCache, boolean isSaveResultData, tg3<OtaBean> listener) {
        this.f28754a.checkoutOtaVersion(version, customer).subscribeOn(npe.m18057io()).observeOn(C2062bv.mainThread()).subscribe(new C4670a("", isNeedCache, isSaveResultData, listener));
    }
}
