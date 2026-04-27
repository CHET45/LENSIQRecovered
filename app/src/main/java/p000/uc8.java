package p000;

import android.util.Log;
import com.eyevue.common.bean.adconfig.AdConfigDataBean;
import java.util.List;
import p000.tc8;

/* JADX INFO: loaded from: classes4.dex */
public class uc8 implements tc8.InterfaceC12979c {

    /* JADX INFO: renamed from: c */
    public static final String f87541c = "InterstitialPresenter";

    /* JADX INFO: renamed from: a */
    public final tc8.InterfaceC12980d f87542a;

    /* JADX INFO: renamed from: b */
    public final qc8 f87543b = new qc8();

    /* JADX INFO: renamed from: uc8$a */
    public class C13488a implements tg3<List<AdConfigDataBean>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f87544a;

        public C13488a(final boolean val$isRefresh) {
            this.f87544a = val$isRefresh;
        }

        @Override // p000.tg3
        public void addNetDisposable(mf4 disposable) {
            if (uc8.this.f87542a != null) {
                uc8.this.f87542a.addNetDisposable(disposable);
            }
        }

        @Override // p000.tg3
        public void onLoadError(int code, String msg) {
            Log.i("aaaaaaaa", "code =" + code);
        }

        @Override // p000.tg3
        public void onLoadSuccess(hr0<List<AdConfigDataBean>> t, boolean isCache) {
            if (t != null) {
                if (t.getData() == null) {
                    uc8.this.f87542a.onGetDataFail();
                } else if (uc8.this.f87542a != null) {
                    uc8.this.f87542a.onGetDataSuccess(t.getData(), isCache, this.f87544a);
                }
            }
        }
    }

    public uc8(tc8.InterfaceC12980d mInterstitialView) {
        this.f87542a = mInterstitialView;
    }

    private void loadData(boolean isRefresh, boolean isNeedCache) {
        this.f87543b.getAdConfigData(new C13488a(isRefresh));
    }

    @Override // p000.tc8.InterfaceC12979c
    public void requestData() {
        loadData(true, false);
    }
}
