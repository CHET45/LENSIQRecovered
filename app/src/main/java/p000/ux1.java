package p000;

import com.blankj.utilcode.util.C2469b;
import com.eyevue.common.bean.authcode.AuthCode;
import com.eyevue.common.bean.authcode.CheckDeviceNameBean;
import p000.h75;

/* JADX INFO: loaded from: classes4.dex */
public class ux1 {

    /* JADX INFO: renamed from: a */
    public final k10 f89320a = (k10) o8e.getService(k10.class, i00.f45335H);

    /* JADX INFO: renamed from: ux1$a */
    public class C13753a extends us0<CheckDeviceNameBean> {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ tg3 f89321f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13753a(String cacheKey, boolean isNeedCache, boolean isSaveResultData, final tg3 val$listener) {
            super(cacheKey, isNeedCache, isSaveResultData);
            this.f89321f = val$listener;
        }

        @Override // p000.us0
        public void onCompleted() {
        }

        @Override // p000.us0
        public void onDisposable(mf4 d) {
            this.f89321f.addNetDisposable(d);
        }

        @Override // p000.us0
        public void onFail(h75.C6732a e) {
            zi9.dOnlyEvent("appName = " + C2469b.getAppName() + " reqHost=" + i00.f45335H + " reqUrl =" + h10.f41969x + " reqProtol = https  resCode=" + e.getCode() + " resMsg=" + e.getMessage());
            this.f89321f.onLoadError(e.getCode(), e.getMessage());
        }

        @Override // p000.us0
        public void onSuccess(hr0<CheckDeviceNameBean> result, boolean isDataFromCache) {
            zi9.dOnlyEvent("appName = " + C2469b.getAppName() + " reqHost=" + i00.f45335H + " reqUrl =" + h10.f41969x + " reqProtol = https  resCode=" + result.getCode() + " resMsg=" + result.getMsg());
            if (result.isSuccess()) {
                this.f89321f.onLoadSuccess(result, isDataFromCache);
            } else {
                this.f89321f.onLoadError(1002, result.getMsg());
            }
        }
    }

    public void checkDeviceNameData(AuthCode authCode, tg3<CheckDeviceNameBean> listener) {
        this.f89320a.getCheckDeviceNameData(authCode).subscribeOn(npe.m18057io()).observeOn(C2062bv.mainThread()).subscribe(new C13753a("", false, false, listener));
    }
}
