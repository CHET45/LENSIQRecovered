package p000;

import com.blankj.utilcode.util.C2469b;
import com.eyevue.common.bean.adconfig.AdConfigInfoBean;
import p000.h75;

/* JADX INFO: loaded from: classes4.dex */
public class rc8 {

    /* JADX INFO: renamed from: a */
    public final k10 f77811a = (k10) o8e.getService(k10.class, i00.f45335H);

    /* JADX INFO: renamed from: rc8$a */
    public class C12013a extends us0<AdConfigInfoBean> {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ tg3 f77812f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12013a(String cacheKey, boolean isNeedCache, boolean isSaveResultData, final tg3 val$listener) {
            super(cacheKey, isNeedCache, isSaveResultData);
            this.f77812f = val$listener;
        }

        @Override // p000.us0
        public void onCompleted() {
        }

        @Override // p000.us0
        public void onDisposable(mf4 d) {
            this.f77812f.addNetDisposable(d);
        }

        @Override // p000.us0
        public void onFail(h75.C6732a e) {
            zi9.dOnlyEvent("appName = " + C2469b.getAppName() + " reqHost=" + i00.f45335H + " reqUrl =" + h10.f41949d + " reqProtol = https  resCode=" + e.getCode() + " resMsg=" + e.getMessage());
            this.f77812f.onLoadError(e.getCode(), e.getMessage());
        }

        @Override // p000.us0
        public void onSuccess(hr0<AdConfigInfoBean> result, boolean isDataFromCache) {
            zi9.dOnlyEvent("appName = " + C2469b.getAppName() + " reqHost=" + i00.f45335H + " reqUrl =" + h10.f41949d + " reqProtol = https  resCode=" + result.getCode() + " resMsg=" + result.getMsg());
            if (result.isSuccess()) {
                this.f77812f.onLoadSuccess(result, isDataFromCache);
            } else {
                this.f77812f.onLoadError(1002, result.getMsg());
            }
        }
    }

    public void getAdInfoData(int id, tg3<AdConfigInfoBean> listener) {
        this.f77811a.getAdConfigInfo(id).subscribeOn(npe.m18057io()).observeOn(C2062bv.mainThread()).subscribe(new C12013a("", false, false, listener));
    }
}
