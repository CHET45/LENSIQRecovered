package p000;

import com.eyevue.common.bean.ota.OtaBean;
import p000.x7c;

/* JADX INFO: loaded from: classes4.dex */
public class e8c implements x7c.InterfaceC14969a {

    /* JADX INFO: renamed from: a */
    public final x7c.InterfaceC14970b f32130a;

    /* JADX INFO: renamed from: b */
    public d8c f32131b = new d8c();

    /* JADX INFO: renamed from: e8c$a */
    public class C5192a implements tg3<OtaBean> {
        public C5192a() {
        }

        @Override // p000.tg3
        public void addNetDisposable(mf4 disposable) {
            if (e8c.this.f32130a != null) {
                e8c.this.f32130a.addNetDisposable(disposable);
            }
        }

        @Override // p000.tg3
        public void onLoadError(int code, String msg) {
        }

        @Override // p000.tg3
        public void onLoadSuccess(hr0<OtaBean> t, boolean isCache) {
            if (e8c.this.f32130a != null) {
                if (t.getData() != null) {
                    e8c.this.f32130a.onGetDataSuccess(t.getData(), false, false);
                } else {
                    yi9.m26092e("OtaVersionPresenter", "onLoadSuccess: t.getData() is null");
                }
            }
        }
    }

    public e8c(x7c.InterfaceC14970b mView) {
        this.f32130a = mView;
    }

    @Override // p000.x7c.InterfaceC14969a
    public void requestData(String version, String customer) {
        this.f32131b.checkOtaVersion(version, customer, false, false, new C5192a());
    }
}
