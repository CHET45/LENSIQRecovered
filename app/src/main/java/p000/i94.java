package p000;

import com.blankj.utilcode.util.C2473f;
import p000.hac;

/* JADX INFO: loaded from: classes4.dex */
public class i94 implements hac.InterfaceC6772g {

    /* JADX INFO: renamed from: c */
    public static final String f46095c = "DevicePhotoTimePresenter";

    /* JADX INFO: renamed from: a */
    public final hac.InterfaceC6773h f46096a;

    /* JADX INFO: renamed from: b */
    public final a0h f46097b = new a0h();

    /* JADX INFO: renamed from: i94$a */
    public class C7192a implements cli {
        public C7192a() {
        }

        @Override // p000.cli
        public void addNetDisposable(mf4 disposable) {
            if (i94.this.f46096a != null) {
                i94.this.f46096a.addNetDisposable(disposable);
            }
        }

        @Override // p000.cli
        public void onLoadError(String var2) {
            C2473f.m4168e(i94.f46095c, "setTime onLoadError: " + var2);
        }

        @Override // p000.cli
        public void onLoadSuccess(String result) {
            C2473f.m4168e("setTime success:::" + result);
        }
    }

    public i94(hac.InterfaceC6773h devicePhotoTimeView) {
        this.f46096a = devicePhotoTimeView;
    }

    private void loadData() {
        this.f46097b.setTime(new C7192a());
    }

    @Override // p000.hac.InterfaceC6772g
    public void requestData() {
        loadData();
    }
}
