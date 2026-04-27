package p000;

import android.util.Log;
import com.eyevue.common.bean.feedback.FeedbackTypeBean;
import java.util.List;
import p000.vp5;

/* JADX INFO: loaded from: classes4.dex */
public class bq5 implements vp5.InterfaceC14204c {

    /* JADX INFO: renamed from: d */
    public static final String f14478d = "FeedbackTypePresenter";

    /* JADX INFO: renamed from: a */
    public final vp5.InterfaceC14205d f14479a;

    /* JADX INFO: renamed from: b */
    public final aq5 f14480b = new aq5();

    /* JADX INFO: renamed from: c */
    public List<FeedbackTypeBean> f14481c;

    /* JADX INFO: renamed from: bq5$a */
    public class C1998a implements tg3<List<FeedbackTypeBean>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f14482a;

        public C1998a(final boolean val$isRefresh) {
            this.f14482a = val$isRefresh;
        }

        @Override // p000.tg3
        public void addNetDisposable(mf4 disposable) {
            if (bq5.this.f14479a != null) {
                bq5.this.f14479a.addNetDisposable(disposable);
            }
        }

        @Override // p000.tg3
        public void onLoadError(int code, String msg) {
            Log.i("aaaaaaaa", "code =" + code);
            bq5.this.f14479a.onGetDataFail(code, msg);
        }

        @Override // p000.tg3
        public void onLoadSuccess(hr0<List<FeedbackTypeBean>> t, boolean isCache) {
            Log.i("aaaaaaaa", "t =" + t);
            if (t == null || t.getData() == null || nc2.isEmpty(t.getData())) {
                return;
            }
            bq5.this.f14481c = t.getData();
            if (bq5.this.f14479a != null) {
                bq5.this.f14479a.onGetDataSuccess(bq5.this.f14481c, isCache, this.f14482a);
            }
        }
    }

    public bq5(vp5.InterfaceC14205d mFeedbackTypeView) {
        this.f14479a = mFeedbackTypeView;
    }

    private void loadData(boolean isRefresh, boolean isNeedCache) {
        this.f14480b.getFeedbackType(new C1998a(isRefresh));
    }

    @Override // p000.vp5.InterfaceC14204c
    public void requestData() {
        loadData(true, false);
    }
}
