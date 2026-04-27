package p000;

import com.blankj.utilcode.util.C2473f;
import p000.hac;

/* JADX INFO: loaded from: classes4.dex */
public class f94 implements hac.InterfaceC6768c {

    /* JADX INFO: renamed from: c */
    public static final String f35758c = "DevicePhotoDeletePresenter";

    /* JADX INFO: renamed from: a */
    public final hac.InterfaceC6769d f35759a;

    /* JADX INFO: renamed from: b */
    public final z44 f35760b = new z44();

    /* JADX INFO: renamed from: f94$a */
    public class C5683a implements cli {
        public C5683a() {
        }

        @Override // p000.cli
        public void addNetDisposable(mf4 disposable) {
            if (f94.this.f35759a != null) {
                f94.this.f35759a.addNetDisposable(disposable);
            }
        }

        @Override // p000.cli
        public void onLoadError(String var2) {
            C2473f.m4168e(f94.f35758c, "getDevicePhotoList onLoadError: " + var2);
        }

        @Override // p000.cli
        public void onLoadSuccess(String result) {
            C2473f.m4168e("getDevicePhotoList success:::" + result);
        }
    }

    public f94(hac.InterfaceC6769d devicePhotoDeleteView) {
        this.f35759a = devicePhotoDeleteView;
    }

    private void loadData(String fileName) {
        this.f35760b.deleteFile(fileName, new C5683a());
    }

    @Override // p000.hac.InterfaceC6768c
    public void requestData(String fileName) {
        loadData(fileName);
    }
}
