package p000;

import com.blankj.utilcode.util.C2469b;
import com.eyevue.common.bean.adconfig.AdConfigDataBean;
import java.util.List;
import p000.h75;

/* JADX INFO: loaded from: classes4.dex */
public class qc8 {

    /* JADX INFO: renamed from: a */
    public final k10 f73952a = (k10) o8e.getService(k10.class, i00.f45335H);

    /* JADX INFO: renamed from: qc8$a */
    public class C11426a extends us0<List<AdConfigDataBean>> {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ tg3 f73953f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11426a(String cacheKey, boolean isNeedCache, boolean isSaveResultData, final tg3 val$listener) {
            super(cacheKey, isNeedCache, isSaveResultData);
            this.f73953f = val$listener;
        }

        @Override // p000.us0
        public void onCompleted() {
        }

        @Override // p000.us0
        public void onDisposable(mf4 d) {
            this.f73953f.addNetDisposable(d);
        }

        @Override // p000.us0
        public void onFail(h75.C6732a e) {
            zi9.dOnlyEvent("appName = " + C2469b.getAppName() + " reqHost=" + i00.f45335H + " reqUrl =" + h10.f41948c + " reqProtol = https  resCode=" + e.getCode() + " resMsg=" + e.getMessage());
            this.f73953f.onLoadError(e.getCode(), e.getMessage());
        }

        @Override // p000.us0
        public void onSuccess(hr0<List<AdConfigDataBean>> result, boolean isDataFromCache) {
            zi9.dOnlyEvent("appName = " + C2469b.getAppName() + " reqHost=" + i00.f45335H + " reqUrl =" + h10.f41948c + " reqProtol = https  resCode=" + result.getCode() + " resMsg=" + result.getMsg());
            if (result.isSuccess()) {
                this.f73953f.onLoadSuccess(result, isDataFromCache);
            } else {
                this.f73953f.onLoadError(1002, result.getMsg());
            }
        }
    }

    public void getAdConfigData(tg3<List<AdConfigDataBean>> listener) {
        this.f73952a.getAdConfigData().subscribeOn(npe.m18057io()).observeOn(C2062bv.mainThread()).subscribe(new C11426a("", false, false, listener));
    }
}
