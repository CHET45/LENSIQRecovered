package p000;

import android.util.Log;
import p000.ck9;

/* JADX INFO: loaded from: classes4.dex */
public class ywd implements ck9.InterfaceC2358m {

    /* JADX INFO: renamed from: c */
    public static final String f103205c = "RegisterTouristPresenter";

    /* JADX INFO: renamed from: a */
    public final ck9.InterfaceC2359n f103206a;

    /* JADX INFO: renamed from: b */
    public final xwd f103207b = new xwd();

    /* JADX INFO: renamed from: ywd$a */
    public class C15858a implements tg3<String> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f103208a;

        public C15858a(final boolean val$isRefresh) {
            this.f103208a = val$isRefresh;
        }

        @Override // p000.tg3
        public void addNetDisposable(mf4 disposable) {
            if (ywd.this.f103206a != null) {
                ywd.this.f103206a.addNetDisposable(disposable);
            }
        }

        @Override // p000.tg3
        public void onLoadError(int code, String msg) {
            Log.i("aaaaaaaa", "code =" + code);
        }

        @Override // p000.tg3
        public void onLoadSuccess(hr0<String> t, boolean isCache) {
            if (t == null) {
                ywd.this.f103206a.onGetDataFail();
                return;
            }
            Log.i("aaaaaaaa", "t RegisterTouristPresenter=" + t);
            Log.i("aaaaaaaa", "3222t RegisterTouristPresenter =" + t);
            if (ywd.this.f103206a != null) {
                ywd.this.f103206a.onGetDataSuccess("200", isCache, this.f103208a);
            }
        }
    }

    public ywd(ck9.InterfaceC2359n mRegisterTouristView) {
        this.f103206a = mRegisterTouristView;
    }

    private void loadData(boolean isRefresh, boolean isNeedCache) {
        this.f103207b.registerTourist(new C15858a(isRefresh));
    }

    @Override // p000.ck9.InterfaceC2358m
    public void requestData() {
        loadData(true, false);
    }
}
