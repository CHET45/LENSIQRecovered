package p000;

import com.eyevue.common.bean.feedback.FeedbackTypeBean;
import com.eyevue.common.bean.feedback.SaveFeedbackBean;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public interface vp5 {

    /* JADX INFO: renamed from: vp5$a */
    public interface InterfaceC14202a extends jt0<InterfaceC14203b> {
        void requestData(SaveFeedbackBean feedbackBean);
    }

    /* JADX INFO: renamed from: vp5$b */
    public interface InterfaceC14203b extends wu0 {
        void onGetDataFail(int code, String msg);

        void onGetDataSuccess(String status, boolean isCache, boolean isRefresh);
    }

    /* JADX INFO: renamed from: vp5$c */
    public interface InterfaceC14204c extends jt0<InterfaceC14205d> {
        void requestData();
    }

    /* JADX INFO: renamed from: vp5$d */
    public interface InterfaceC14205d extends wu0 {
        void onGetDataFail(int code, String msg);

        void onGetDataSuccess(List<FeedbackTypeBean> typeBean, boolean isCache, boolean isRefresh);
    }
}
