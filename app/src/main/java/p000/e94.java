package p000;

import com.blankj.utilcode.util.C2473f;
import p000.hac;

/* JADX INFO: loaded from: classes4.dex */
public class e94 implements hac.InterfaceC6766a {

    /* JADX INFO: renamed from: c */
    public static final String f32187c = "DevicePhotoDataPresenter";

    /* JADX INFO: renamed from: a */
    public final hac.InterfaceC6767b f32188a;

    /* JADX INFO: renamed from: b */
    public final yf3 f32189b = new yf3();

    /* JADX INFO: renamed from: e94$a */
    public class C5197a implements cli {
        public C5197a() {
        }

        @Override // p000.cli
        public void addNetDisposable(mf4 disposable) {
            if (e94.this.f32188a != null) {
                e94.this.f32188a.addNetDisposable(disposable);
            }
        }

        @Override // p000.cli
        public void onLoadError(String var2) {
            C2473f.m4168e(e94.f32187c, "setData onLoadError: " + var2);
        }

        @Override // p000.cli
        public void onLoadSuccess(String result) {
            C2473f.m4168e("setData success:::" + result);
        }
    }

    public e94(hac.InterfaceC6767b devicePhotoDataView) {
        this.f32188a = devicePhotoDataView;
    }

    private void loadData() {
        this.f32189b.setData(new C5197a());
    }

    @Override // p000.hac.InterfaceC6766a
    public void requestData() {
        loadData();
    }
}
