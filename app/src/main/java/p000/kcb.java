package p000;

import com.eyevue.common.bean.guid.NewGuidBean;
import com.eyevue.common.bean.guid.NewGuidDataBean;
import java.util.ArrayList;
import java.util.List;
import p000.ad7;

/* JADX INFO: loaded from: classes4.dex */
public class kcb implements ad7.InterfaceC0179b {

    /* JADX INFO: renamed from: f */
    public static final String f53598f = "NewGuidPresenter";

    /* JADX INFO: renamed from: a */
    public final ad7.InterfaceC0178a f53599a;

    /* JADX INFO: renamed from: c */
    public int f53601c = 1;

    /* JADX INFO: renamed from: d */
    public List<NewGuidBean> f53602d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public boolean f53603e = false;

    /* JADX INFO: renamed from: b */
    public final jcb f53600b = new jcb();

    /* JADX INFO: renamed from: kcb$a */
    public class C8284a implements tg3<NewGuidDataBean> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f53604a;

        public C8284a(final boolean val$isRefresh) {
            this.f53604a = val$isRefresh;
        }

        @Override // p000.tg3
        public void addNetDisposable(mf4 disposable) {
            if (kcb.this.f53599a != null) {
                kcb.this.f53599a.addNetDisposable(disposable);
            }
        }

        @Override // p000.tg3
        public void onLoadError(int code, String msg) {
        }

        @Override // p000.tg3
        public void onLoadSuccess(hr0<NewGuidDataBean> t, boolean isCache) {
            if (this.f53604a) {
                kcb.this.f53602d.clear();
            }
            if (t == null || t.getData() == null || nc2.isEmpty(t.getData().getList())) {
                return;
            }
            kcb.this.f53602d = t.getData().getList();
            if (kcb.this.f53599a != null) {
                kcb.this.f53599a.onGetRecListSuccess(kcb.this.f53602d, kcb.this.f53603e, isCache, this.f53604a);
            }
        }
    }

    public kcb(ad7.InterfaceC0178a mRecContainerView) {
        this.f53599a = mRecContainerView;
    }

    private void loadData(boolean isRefresh, boolean isNeedCache) {
        this.f53600b.getGuidList(isNeedCache, isRefresh, new C8284a(isRefresh));
    }

    @Override // p000.ad7.InterfaceC0179b
    public void requestData() {
        this.f53603e = false;
        loadData(true, true);
    }
}
