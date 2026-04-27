package p000;

import android.util.Log;
import p000.ck9;

/* JADX INFO: loaded from: classes4.dex */
public class bsf implements ck9.InterfaceC2360o {

    /* JADX INFO: renamed from: d */
    public static final String f14688d = "SmsCodePresenter";

    /* JADX INFO: renamed from: a */
    public final ck9.InterfaceC2361p f14689a;

    /* JADX INFO: renamed from: b */
    public final y47 f14690b = new y47();

    /* JADX INFO: renamed from: c */
    public String f14691c;

    /* JADX INFO: renamed from: bsf$a */
    public class C2039a implements tg3<String> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f14692a;

        public C2039a(final boolean val$isRefresh) {
            this.f14692a = val$isRefresh;
        }

        @Override // p000.tg3
        public void addNetDisposable(mf4 disposable) {
            if (bsf.this.f14689a != null) {
                bsf.this.f14689a.addNetDisposable(disposable);
            }
        }

        @Override // p000.tg3
        public void onLoadError(int code, String msg) {
            Log.i("aaaaaaaa", "code =" + code);
        }

        @Override // p000.tg3
        public void onLoadSuccess(hr0<String> t, boolean isCache) {
            if (t == null) {
                bsf.this.f14689a.onGetDataFail();
                return;
            }
            Log.i("aaaaaaaa", "t =" + t);
            Log.i("aaaaaaaa", "3222t =" + t);
            if (bsf.this.f14689a != null) {
                Log.i("aaaaaaaa", "t =" + t);
                bsf.this.f14689a.onGetDataSuccess("200", isCache, this.f14692a);
            }
        }
    }

    public bsf(ck9.InterfaceC2361p mSmsCodeView) {
        this.f14689a = mSmsCodeView;
    }

    private void loadData(boolean isRefresh, boolean isNeedCache) {
        this.f14690b.getSmsCodeData(this.f14691c, new C2039a(isRefresh));
    }

    @Override // p000.ck9.InterfaceC2360o
    public void requestData(String mobile) {
        this.f14691c = mobile;
        loadData(true, false);
    }
}
