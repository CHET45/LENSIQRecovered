package p000;

import com.blankj.utilcode.util.C2469b;
import p000.h75;

/* JADX INFO: loaded from: classes4.dex */
public class xwd {

    /* JADX INFO: renamed from: a */
    public final k10 f99588a = (k10) o8e.getService(k10.class, i00.f45335H);

    /* JADX INFO: renamed from: xwd$a */
    public class C15335a extends us0<String> {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ tg3 f99589f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15335a(String cacheKey, boolean isNeedCache, boolean isSaveResultData, final tg3 val$listener) {
            super(cacheKey, isNeedCache, isSaveResultData);
            this.f99589f = val$listener;
        }

        @Override // p000.us0
        public void onCompleted() {
        }

        @Override // p000.us0
        public void onDisposable(mf4 d) {
            this.f99589f.addNetDisposable(d);
        }

        @Override // p000.us0
        public void onFail(h75.C6732a e) {
            zi9.dOnlyEvent("appName = " + C2469b.getAppName() + " reqHost=" + i00.f45335H + " reqUrl =" + h10.f41950e + " reqProtol = https  resCode=" + e.getCode() + " resMsg=" + e.getMessage());
            this.f99589f.onLoadError(e.getCode(), e.getMessage());
        }

        @Override // p000.us0
        public void onSuccess(hr0<String> result, boolean isDataFromCache) {
            zi9.dOnlyEvent("appName = " + C2469b.getAppName() + " reqHost=" + i00.f45335H + " reqUrl =" + h10.f41950e + " reqProtol = https  resCode=" + result.getCode() + " resMsg=" + result.getMsg());
            if (result.isSuccess()) {
                this.f99589f.onLoadSuccess(result, isDataFromCache);
            } else {
                this.f99589f.onLoadError(1002, result.getMsg());
            }
        }
    }

    public void registerTourist(tg3<String> listener) {
        this.f99588a.postRegisterTourist().subscribeOn(npe.m18057io()).observeOn(C2062bv.mainThread()).subscribe(new C15335a("", false, false, listener));
    }
}
