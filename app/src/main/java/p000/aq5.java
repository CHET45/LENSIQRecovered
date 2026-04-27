package p000;

import com.blankj.utilcode.util.C2469b;
import com.eyevue.common.bean.feedback.FeedbackTypeBean;
import java.util.List;
import p000.h75;

/* JADX INFO: loaded from: classes4.dex */
public class aq5 {

    /* JADX INFO: renamed from: a */
    public final k10 f11576a = (k10) o8e.getService(k10.class, i00.f45335H);

    /* JADX INFO: renamed from: aq5$a */
    public class C1558a extends us0<List<FeedbackTypeBean>> {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ tg3 f11577f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1558a(String cacheKey, boolean isNeedCache, boolean isSaveResultData, final tg3 val$listener) {
            super(cacheKey, isNeedCache, isSaveResultData);
            this.f11577f = val$listener;
        }

        @Override // p000.us0
        public void onCompleted() {
        }

        @Override // p000.us0
        public void onDisposable(mf4 d) {
            this.f11577f.addNetDisposable(d);
        }

        @Override // p000.us0
        public void onFail(h75.C6732a e) {
            zi9.dOnlyEvent("appName = " + C2469b.getAppName() + " reqHost=" + i00.f45335H + " reqUrl =" + h10.f41952g + " reqProtol = https  resCode=" + e.getCode() + " resMsg=" + e.getMessage());
            this.f11577f.onLoadError(e.getCode(), e.getMessage());
        }

        @Override // p000.us0
        public void onSuccess(hr0<List<FeedbackTypeBean>> result, boolean isDataFromCache) {
            zi9.dOnlyEvent("appName = " + C2469b.getAppName() + " reqHost=" + i00.f45335H + " reqUrl =" + h10.f41952g + " reqProtol = https  resCode=" + result.getCode() + " resMsg=" + result.getMsg());
            if (result.isSuccess()) {
                this.f11577f.onLoadSuccess(result, isDataFromCache);
            } else {
                this.f11577f.onLoadError(1002, result.getMsg());
            }
        }
    }

    public void getFeedbackType(tg3<List<FeedbackTypeBean>> listener) {
        this.f11576a.getFeedbackTypeData().subscribeOn(npe.m18057io()).observeOn(C2062bv.mainThread()).subscribe(new C1558a("", false, false, listener));
    }
}
