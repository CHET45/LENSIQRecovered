package p000;

import com.eyevue.common.bean.SupportDeviceBean;
import java.util.List;
import p000.t84;

/* JADX INFO: loaded from: classes4.dex */
public class v84 implements t84.InterfaceC12945a {

    /* JADX INFO: renamed from: a */
    public final t84.InterfaceC12946b f90294a;

    /* JADX INFO: renamed from: b */
    public u84 f90295b = new u84();

    /* JADX INFO: renamed from: v84$a */
    public class C13935a implements tg3<List<SupportDeviceBean>> {
        public C13935a() {
        }

        @Override // p000.tg3
        public void addNetDisposable(mf4 disposable) {
            if (v84.this.f90294a != null) {
                v84.this.f90294a.addNetDisposable(disposable);
            }
        }

        @Override // p000.tg3
        public void onLoadError(int i, String s) {
        }

        @Override // p000.tg3
        public void onLoadSuccess(hr0<List<SupportDeviceBean>> baseHttpResult, boolean b) {
            if (v84.this.f90294a == null || baseHttpResult.getData() == null) {
                return;
            }
            v84.this.f90294a.loadDeviceListSuccess(baseHttpResult.getData(), b);
        }
    }

    public v84(t84.InterfaceC12946b deviceListView) {
        this.f90294a = deviceListView;
    }

    private void loadData(boolean isRefresh, boolean isNeedCache) {
        this.f90295b.getSupportDeviceList(new C13935a());
    }

    @Override // p000.t84.InterfaceC12945a
    public void refreshData() {
        loadData(false, false);
    }
}
