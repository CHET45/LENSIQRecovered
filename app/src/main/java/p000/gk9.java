package p000;

import com.blankj.utilcode.util.C2469b;
import p000.h75;

/* JADX INFO: loaded from: classes4.dex */
public class gk9 {

    /* JADX INFO: renamed from: a */
    public final k10 f40018a = (k10) o8e.getService(k10.class, i00.f45335H);

    /* JADX INFO: renamed from: gk9$a */
    public class C6359a extends us0<String> {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ tg3 f40019f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6359a(String cacheKey, boolean isNeedCache, boolean isSaveResultData, final tg3 val$listener) {
            super(cacheKey, isNeedCache, isSaveResultData);
            this.f40019f = val$listener;
        }

        @Override // p000.us0
        public void onCompleted() {
        }

        @Override // p000.us0
        public void onDisposable(mf4 d) {
            this.f40019f.addNetDisposable(d);
        }

        @Override // p000.us0
        public void onFail(h75.C6732a e) {
            zi9.dOnlyEvent("appName = " + C2469b.getAppName() + " reqHost=" + i00.f45335H + " reqUrl =" + h10.f41961p + " reqProtol = https  resCode=" + e.getCode() + " resMsg=" + e.getMessage());
            this.f40019f.onLoadError(e.getCode(), e.getMessage());
        }

        @Override // p000.us0
        public void onSuccess(hr0<String> result, boolean isDataFromCache) {
            zi9.dOnlyEvent("appName = " + C2469b.getAppName() + " reqHost=" + i00.f45335H + " reqUrl =" + h10.f41961p + " reqProtol = https  resCode=" + result.getCode() + " resMsg=" + result.getMsg());
            if (!result.isSuccess()) {
                this.f40019f.onLoadError(1002, result.getMsg());
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("result =");
            sb.append(result);
            this.f40019f.onLoadSuccess(result, isDataFromCache);
        }
    }

    public void logoutData(tg3<String> listener) {
        this.f40018a.postAccountLogout().subscribeOn(npe.m18057io()).observeOn(C2062bv.mainThread()).subscribe(new C6359a("", false, false, listener));
    }
}
