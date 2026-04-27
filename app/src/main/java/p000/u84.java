package p000;

import com.blankj.utilcode.util.C2469b;
import com.eyevue.common.bean.SupportDeviceBean;
import java.util.List;
import p000.h75;

/* JADX INFO: loaded from: classes4.dex */
public class u84 {

    /* JADX INFO: renamed from: a */
    public final k10 f87038a = (k10) o8e.getService(k10.class, i00.f45335H);

    /* JADX INFO: renamed from: u84$a */
    public class C13399a extends us0<List<SupportDeviceBean>> {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ tg3 f87039f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13399a(String cacheKey, boolean isNeedCache, boolean isSaveResultData, final tg3 val$listener) {
            super(cacheKey, isNeedCache, isSaveResultData);
            this.f87039f = val$listener;
        }

        @Override // p000.us0
        public void onCompleted() {
        }

        @Override // p000.us0
        public void onDisposable(mf4 d) {
            this.f87039f.addNetDisposable(d);
        }

        @Override // p000.us0
        public void onFail(h75.C6732a e) {
            zi9.dOnlyEvent("appName = " + C2469b.getAppName() + " reqHost=" + i00.f45335H + " reqUrl =" + h10.f41945G + " reqProtol = https  resCode=" + e.getCode() + " resMsg=" + e.getMessage());
            this.f87039f.onLoadError(e.getCode(), e.getMessage());
        }

        @Override // p000.us0
        public void onSuccess(hr0<List<SupportDeviceBean>> result, boolean isDataFromCache) {
            zi9.dOnlyEvent("appName = " + C2469b.getAppName() + " reqHost=" + i00.f45335H + " reqUrl =" + h10.f41945G + " reqProtol = https  resCode=" + result.getCode() + " resMsg=" + result.getMsg());
            super.onSuccess(result, isDataFromCache);
            if (result.isSuccess()) {
                this.f87039f.onLoadSuccess(result, isDataFromCache);
            } else {
                this.f87039f.onLoadError(1002, result.getMsg());
            }
        }
    }

    public void getSupportDeviceList(tg3<List<SupportDeviceBean>> listener) {
        this.f87038a.getSupportDeviceList().subscribeOn(npe.m18057io()).observeOn(C2062bv.mainThread()).subscribe(new C13399a("", false, false, listener));
    }
}
