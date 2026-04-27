package p000;

import android.util.Log;
import com.eyevue.common.bean.ProjectInfoBean;
import p000.nfd;

/* JADX INFO: loaded from: classes4.dex */
public class pfd implements nfd.InterfaceC9861a {

    /* JADX INFO: renamed from: c */
    public static final String f70616c = "ProjectInfoPresenter";

    /* JADX INFO: renamed from: a */
    public final nfd.InterfaceC9862b f70617a;

    /* JADX INFO: renamed from: b */
    public final ofd f70618b = new ofd();

    /* JADX INFO: renamed from: pfd$a */
    public class C10943a implements tg3<ProjectInfoBean> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f70619a;

        public C10943a(final boolean val$isRefresh) {
            this.f70619a = val$isRefresh;
        }

        @Override // p000.tg3
        public void addNetDisposable(mf4 disposable) {
            if (pfd.this.f70617a != null) {
                pfd.this.f70617a.addNetDisposable(disposable);
            }
        }

        @Override // p000.tg3
        public void onLoadError(int code, String msg) {
            Log.i("aaaaaaaa", "code =" + code);
            pfd.this.f70617a.onGetDataFail();
        }

        @Override // p000.tg3
        public void onLoadSuccess(hr0<ProjectInfoBean> t, boolean isCache) {
            if (t != null) {
                if (t.getData() == null) {
                    pfd.this.f70617a.onGetDataFail();
                } else if (pfd.this.f70617a != null) {
                    pfd.this.f70617a.onGetDataSuccess(t.getData(), isCache, this.f70619a);
                }
            }
        }
    }

    public pfd(nfd.InterfaceC9862b mProjectInfoView) {
        this.f70617a = mProjectInfoView;
    }

    private void loadData(String equipmentCode, boolean isRefresh, boolean isNeedCache) {
        this.f70618b.getProjectData(equipmentCode, new C10943a(isRefresh));
    }

    @Override // p000.nfd.InterfaceC9861a
    public void requestData(String equipmentCode) {
        loadData(equipmentCode, true, false);
    }
}
