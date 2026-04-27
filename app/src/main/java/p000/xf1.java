package p000;

import android.content.Context;
import com.mylhyl.circledialog.CircleParams;

/* JADX INFO: loaded from: classes6.dex */
public final class xf1 extends wf1 {
    public xf1(Context context, CircleParams circleParams) {
        super(context, circleParams);
    }

    @Override // p000.qf1
    public void buildBodyView() {
        mo21252d();
        m21253e();
        if (this.f94062g == null) {
            Context context = this.f78141a;
            CircleParams circleParams = this.f78142b;
            fa1 fa1Var = new fa1(context, circleParams.f24219H, circleParams.f24227Y);
            this.f94062g = fa1Var;
            m21249a(fa1Var.getView());
        }
    }

    @Override // p000.wf1, p000.rf1, p000.qf1
    public /* bridge */ /* synthetic */ wh1 buildButton() {
        return super.buildButton();
    }

    @Override // p000.rf1, p000.qf1
    public /* bridge */ /* synthetic */ o52 buildCloseImgView() {
        return super.buildCloseImgView();
    }

    @Override // p000.wf1, p000.qf1
    public /* bridge */ /* synthetic */ sg8 getBodyView() {
        return super.getBodyView();
    }

    @Override // p000.wf1, p000.qf1
    public /* bridge */ /* synthetic */ void refreshContent() {
        super.refreshContent();
    }

    @Override // p000.rf1, p000.qf1
    public /* bridge */ /* synthetic */ void refreshTitle() {
        super.refreshTitle();
    }
}
