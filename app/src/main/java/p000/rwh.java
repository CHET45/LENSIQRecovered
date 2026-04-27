package p000;

import com.blankj.utilcode.util.C2469b;
import com.eyevue.common.bean.update.VersionData;
import p000.h75;

/* JADX INFO: loaded from: classes4.dex */
public class rwh {

    /* JADX INFO: renamed from: a */
    public final k10 f80046a = l10.getApiService();

    /* JADX INFO: renamed from: rwh$a */
    public class C12356a extends us0<VersionData> {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ tg3 f80047f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12356a(String cacheKey, boolean isNeedCache, boolean isSaveResultData, final tg3 val$listener) {
            super(cacheKey, isNeedCache, isSaveResultData);
            this.f80047f = val$listener;
        }

        @Override // p000.us0
        public void onCompleted() {
        }

        @Override // p000.us0
        public void onDisposable(mf4 d) {
            this.f80047f.addNetDisposable(d);
        }

        @Override // p000.us0
        public void onFail(h75.C6732a e) {
            zi9.dOnlyEvent("appName = " + C2469b.getAppName() + " reqHost=" + i00.f45335H + " reqUrl =" + h10.f41951f + " reqProtol = https  resCode=" + e.getCode() + " resMsg=" + e.getMessage());
            this.f80047f.onLoadError(e.getCode(), e.getMessage());
        }

        @Override // p000.us0
        public void onSuccess(hr0<VersionData> result, boolean isDataFromCache) {
            zi9.dOnlyEvent("appName = " + C2469b.getAppName() + " reqHost=" + i00.f45335H + " reqUrl =" + h10.f41951f + " reqProtol = https  resCode=" + result.getCode() + " resMsg=" + result.getMsg());
            if (result.isSuccess()) {
                this.f80047f.onLoadSuccess(result, isDataFromCache);
            } else {
                this.f80047f.onLoadError(1002, result.getMsg());
            }
        }
    }

    public void getCheckVersion(boolean isNeedCache, boolean isSaveResultData, tg3<VersionData> listener) {
        this.f80046a.getCheckVersionInfo().subscribeOn(npe.m18057io()).observeOn(C2062bv.mainThread()).subscribe(new C12356a("", isNeedCache, isSaveResultData, listener));
    }
}
