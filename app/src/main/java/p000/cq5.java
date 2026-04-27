package p000;

import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.eyevue.common.bean.feedback.FeedbackTypeBean;
import com.eyevue.glassapp.C2558R;

/* JADX INFO: loaded from: classes4.dex */
public class cq5 extends mt0<FeedbackTypeBean, BaseViewHolder> {
    public cq5() {
        super(C2558R.layout.feedback_select_list_item);
    }

    @Override // p000.mt0
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void mo2536c(@efb BaseViewHolder baseViewHolder, FeedbackTypeBean feedbackTypeBean) {
        baseViewHolder.setText(C2558R.id.title, feedbackTypeBean.getLabel());
    }
}
