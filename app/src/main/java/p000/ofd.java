package p000;

import com.blankj.utilcode.util.C2469b;
import com.eyevue.common.bean.ProjectInfoBean;
import p000.h75;

/* JADX INFO: loaded from: classes4.dex */
public class ofd {

    /* JADX INFO: renamed from: a */
    public final k10 f67514a = (k10) o8e.getService(k10.class, i00.f45335H);

    /* JADX INFO: renamed from: ofd$a */
    public class C10362a extends us0<ProjectInfoBean> {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ tg3 f67515f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10362a(String cacheKey, boolean isNeedCache, boolean isSaveResultData, final tg3 val$listener) {
            super(cacheKey, isNeedCache, isSaveResultData);
            this.f67515f = val$listener;
        }

        @Override // p000.us0
        public void onCompleted() {
        }

        @Override // p000.us0
        public void onDisposable(mf4 d) {
            this.f67515f.addNetDisposable(d);
        }

        @Override // p000.us0
        public void onFail(h75.C6732a e) {
            zi9.dOnlyEvent("appName = " + C2469b.getAppName() + " reqHost=" + i00.f45335H + " reqUrl =" + h10.f41947b + " reqProtol = https  resCode=" + e.getCode() + " resMsg=" + e.getMessage());
            this.f67515f.onLoadError(e.getCode(), e.getMessage());
        }

        @Override // p000.us0
        public void onSuccess(hr0<ProjectInfoBean> result, boolean isDataFromCache) {
            zi9.dOnlyEvent("appName = " + C2469b.getAppName() + " reqHost=" + i00.f45335H + " reqUrl =" + h10.f41947b + " reqProtol = https  resCode=" + result.getCode() + " resMsg=" + result.getMsg());
            if (result.isSuccess()) {
                this.f67515f.onLoadSuccess(result, isDataFromCache);
            } else {
                this.f67515f.onLoadError(1002, result.getMsg());
            }
        }
    }

    public void getProjectData(String equipmentCode, tg3<ProjectInfoBean> listener) {
        this.f67514a.getProjectData(equipmentCode).subscribeOn(npe.m18057io()).observeOn(C2062bv.mainThread()).subscribe(new C10362a("", false, false, listener));
    }
}
