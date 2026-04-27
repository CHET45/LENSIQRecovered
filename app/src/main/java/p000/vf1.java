package p000;

import android.content.Context;
import com.mylhyl.circledialog.CircleParams;

/* JADX INFO: loaded from: classes6.dex */
public final class vf1 extends rf1 {

    /* JADX INFO: renamed from: g */
    public ea1 f90851g;

    public vf1(Context context, CircleParams circleParams) {
        super(context, circleParams);
    }

    @Override // p000.qf1
    public void buildBodyView() {
        mo21252d();
        m21253e();
        if (this.f90851g == null) {
            Context context = this.f78141a;
            CircleParams circleParams = this.f78142b;
            ea1 ea1Var = new ea1(context, circleParams.f24219H, circleParams.f24220L, circleParams.f24221M, circleParams.f24225V1, circleParams.f24245j2, circleParams.f24243h2);
            this.f90851g = ea1Var;
            m21249a(ea1Var.getView());
        }
    }

    @Override // p000.rf1, p000.qf1
    public /* bridge */ /* synthetic */ wh1 buildButton() {
        return super.buildButton();
    }

    @Override // p000.rf1, p000.qf1
    public /* bridge */ /* synthetic */ o52 buildCloseImgView() {
        return super.buildCloseImgView();
    }

    @Override // p000.qf1
    public void refreshContent() {
    }

    @Override // p000.rf1, p000.qf1
    public /* bridge */ /* synthetic */ void refreshTitle() {
        super.refreshTitle();
    }

    @Override // p000.qf1
    public ea1 getBodyView() {
        return this.f90851g;
    }
}
