package p000;

import com.blankj.utilcode.util.C2469b;
import com.eyevue.common.bean.login.UserBean;
import p000.h75;

/* JADX INFO: loaded from: classes4.dex */
public class j47 {

    /* JADX INFO: renamed from: a */
    public final k10 f49507a = (k10) o8e.getService(k10.class, i00.f45335H);

    /* JADX INFO: renamed from: j47$a */
    public class C7732a extends us0<String> {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ tg3 f49508f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7732a(String cacheKey, boolean isNeedCache, boolean isSaveResultData, final tg3 val$listener) {
            super(cacheKey, isNeedCache, isSaveResultData);
            this.f49508f = val$listener;
        }

        @Override // p000.us0
        public void onCompleted() {
        }

        @Override // p000.us0
        public void onDisposable(mf4 d) {
            this.f49508f.addNetDisposable(d);
        }

        @Override // p000.us0
        public void onFail(h75.C6732a e) {
            zi9.dOnlyEvent("appName = " + C2469b.getAppName() + " reqHost=" + i00.f45335H + " reqUrl =" + h10.f41962q + " reqProtol = https  resCode=" + e.getCode() + " resMsg=" + e.getMessage());
            this.f49508f.onLoadError(e.getCode(), e.getMessage());
        }

        @Override // p000.us0
        public void onSuccess(hr0<String> result, boolean isDataFromCache) {
            zi9.dOnlyEvent("appName = " + C2469b.getAppName() + " reqHost=" + i00.f45335H + " reqUrl =" + h10.f41962q + " reqProtol = https  resCode=" + result.getCode() + " resMsg=" + result.getMsg());
            if (result.isSuccess()) {
                this.f49508f.onLoadSuccess(result, isDataFromCache);
            } else {
                this.f49508f.onLoadError(1002, result.getMsg());
            }
        }
    }

    public void getEmailCodeData(UserBean userBean, tg3<String> listener) {
        StringBuilder sb = new StringBuilder();
        sb.append("getEmailCodeData =");
        sb.append(userBean.getEmail());
        this.f49507a.getEmailsCodeData(userBean).subscribeOn(npe.m18057io()).observeOn(C2062bv.mainThread()).subscribe(new C7732a("", false, false, listener));
    }
}
