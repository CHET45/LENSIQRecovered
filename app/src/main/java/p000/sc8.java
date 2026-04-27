package p000;

import android.util.Log;
import com.eyevue.common.bean.adconfig.AdConfigInfoBean;
import p000.tc8;

/* JADX INFO: loaded from: classes4.dex */
public class sc8 implements tc8.InterfaceC12977a {

    /* JADX INFO: renamed from: d */
    public static final String f81210d = "InterstitialInfoPresenter";

    /* JADX INFO: renamed from: a */
    public final tc8.InterfaceC12978b f81211a;

    /* JADX INFO: renamed from: c */
    public int f81213c = -1;

    /* JADX INFO: renamed from: b */
    public final rc8 f81212b = new rc8();

    /* JADX INFO: renamed from: sc8$a */
    public class C12518a implements tg3<AdConfigInfoBean> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f81214a;

        public C12518a(final boolean val$isRefresh) {
            this.f81214a = val$isRefresh;
        }

        @Override // p000.tg3
        public void addNetDisposable(mf4 disposable) {
            if (sc8.this.f81211a != null) {
                sc8.this.f81211a.addNetDisposable(disposable);
            }
        }

        @Override // p000.tg3
        public void onLoadError(int code, String msg) {
            Log.i(sc8.f81210d, "code =" + code);
        }

        @Override // p000.tg3
        public void onLoadSuccess(hr0<AdConfigInfoBean> t, boolean isCache) {
            if (t != null) {
                if (t.getData() == null) {
                    sc8.this.f81211a.onGetDataFail();
                } else if (sc8.this.f81211a != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("t.getData()  =");
                    sb.append(t.getData().getImageUrl());
                    sc8.this.f81211a.onGetDataSuccess(t.getData(), isCache, this.f81214a);
                }
            }
        }
    }

    public sc8(tc8.InterfaceC12978b mInterstitialView) {
        this.f81211a = mInterstitialView;
    }

    private void loadData(boolean isRefresh, boolean isNeedCache) {
        this.f81212b.getAdInfoData(this.f81213c, new C12518a(isRefresh));
    }

    @Override // p000.tc8.InterfaceC12977a
    public void requestData(int id) {
        this.f81213c = id;
        loadData(true, false);
    }
}
