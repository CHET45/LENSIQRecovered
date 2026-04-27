package p000;

import com.eyevue.common.bean.update.VersionData;
import p000.qwh;

/* JADX INFO: loaded from: classes4.dex */
public class swh implements qwh.InterfaceC11752a {

    /* JADX INFO: renamed from: a */
    public final qwh.InterfaceC11753b f83187a;

    /* JADX INFO: renamed from: b */
    public rwh f83188b = new rwh();

    /* JADX INFO: renamed from: swh$a */
    public class C12818a implements tg3<VersionData> {
        public C12818a() {
        }

        @Override // p000.tg3
        public void addNetDisposable(mf4 disposable) {
            if (swh.this.f83187a != null) {
                swh.this.f83187a.addNetDisposable(disposable);
            }
        }

        @Override // p000.tg3
        public void onLoadError(int code, String msg) {
        }

        @Override // p000.tg3
        public void onLoadSuccess(hr0<VersionData> t, boolean isCache) {
            if (swh.this.f83187a == null || t.getData() == null) {
                return;
            }
            swh.this.f83187a.loadVersionSuccess(t.getData(), isCache);
        }
    }

    public swh(qwh.InterfaceC11753b mView) {
        this.f83187a = mView;
    }

    private void loadData(boolean isRefresh, boolean isNeedCache) {
        this.f83188b.getCheckVersion(isNeedCache, isRefresh, new C12818a());
    }

    @Override // p000.qwh.InterfaceC11752a
    public void refreshData() {
        loadData(false, false);
    }
}
