package p000;

import android.util.Log;
import com.blankj.utilcode.util.C2469b;
import com.eyevue.common.bean.login.UserBean;
import com.eyevue.common.bean.login.UserTokenBean;
import p000.h75;

/* JADX INFO: loaded from: classes4.dex */
public class zwd {

    /* JADX INFO: renamed from: a */
    public final k10 f106211a = (k10) o8e.getService(k10.class, i00.f45335H);

    /* JADX INFO: renamed from: zwd$a */
    public class C16269a extends us0<UserTokenBean> {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ tg3 f106212f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16269a(String cacheKey, boolean isNeedCache, boolean isSaveResultData, final tg3 val$listener) {
            super(cacheKey, isNeedCache, isSaveResultData);
            this.f106212f = val$listener;
        }

        @Override // p000.us0
        public void onCompleted() {
        }

        @Override // p000.us0
        public void onDisposable(mf4 d) {
            this.f106212f.addNetDisposable(d);
        }

        @Override // p000.us0
        public void onFail(h75.C6732a e) {
            zi9.dOnlyEvent("appName = " + C2469b.getAppName() + " reqHost=" + i00.f45335H + " reqUrl =" + h10.f41959n + " reqProtol = https  resCode=" + e.getCode() + " resMsg=" + e.getMessage());
            StringBuilder sb = new StringBuilder();
            sb.append("getCode =");
            sb.append(e.getCode());
            Log.i("aaaaaaaa", sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append("getMessage =");
            sb2.append(e.getMessage());
            Log.i("aaaaaaaa", sb2.toString());
            this.f106212f.onLoadError(e.getCode(), e.getMessage());
        }

        @Override // p000.us0
        public void onSuccess(hr0<UserTokenBean> result, boolean isDataFromCache) {
            zi9.dOnlyEvent("appName = " + C2469b.getAppName() + " reqHost=" + i00.f45335H + " reqUrl =" + h10.f41959n + " reqProtol = https  resCode=" + result.getCode() + " resMsg=" + result.getMsg());
            StringBuilder sb = new StringBuilder();
            sb.append("onSuccess-------------------------- =");
            sb.append(result);
            if (result.isSuccess()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("result =");
                sb2.append(result);
                this.f106212f.onLoadSuccess(result, isDataFromCache);
                return;
            }
            if (result.getCode() == 400) {
                this.f106212f.onLoadSuccess(result, isDataFromCache);
            } else {
                this.f106212f.onLoadError(1002, result.getMsg());
            }
        }
    }

    public void postRegisterUserData(UserBean userBean, tg3<UserTokenBean> listener) {
        this.f106211a.postRegisterUser(userBean).subscribeOn(npe.m18057io()).observeOn(C2062bv.mainThread()).subscribe(new C16269a("", false, false, listener));
    }
}
