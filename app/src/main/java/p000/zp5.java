package p000;

import android.util.Log;
import com.eyevue.common.bean.feedback.SaveFeedbackBean;
import p000.vp5;

/* JADX INFO: loaded from: classes4.dex */
public class zp5 implements vp5.InterfaceC14202a {

    /* JADX INFO: renamed from: d */
    public static final String f105700d = "FeedbackSubmitPresenter";

    /* JADX INFO: renamed from: a */
    public final vp5.InterfaceC14203b f105701a;

    /* JADX INFO: renamed from: b */
    public final yp5 f105702b = new yp5();

    /* JADX INFO: renamed from: c */
    public SaveFeedbackBean f105703c;

    /* JADX INFO: renamed from: zp5$a */
    public class C16211a implements tg3<String> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f105704a;

        public C16211a(final boolean val$isRefresh) {
            this.f105704a = val$isRefresh;
        }

        @Override // p000.tg3
        public void addNetDisposable(mf4 disposable) {
            if (zp5.this.f105701a != null) {
                zp5.this.f105701a.addNetDisposable(disposable);
            }
        }

        @Override // p000.tg3
        public void onLoadError(int code, String msg) {
            Log.i("aaaaaaaa", "code =" + code);
            zp5.this.f105701a.onGetDataFail(code, msg);
        }

        @Override // p000.tg3
        public void onLoadSuccess(hr0<String> t, boolean isCache) {
            if (t == null || zp5.this.f105701a == null) {
                return;
            }
            zp5.this.f105701a.onGetDataSuccess(t.getData(), isCache, this.f105704a);
        }
    }

    public zp5(vp5.InterfaceC14203b mFeedbackSubmitView) {
        this.f105701a = mFeedbackSubmitView;
    }

    private void loadData(boolean isRefresh, boolean isNeedCache) {
        this.f105702b.submitFeedback(this.f105703c, new C16211a(isRefresh));
    }

    @Override // p000.vp5.InterfaceC14202a
    public void requestData(SaveFeedbackBean feedbackBean) {
        this.f105703c = feedbackBean;
        loadData(true, false);
    }
}
