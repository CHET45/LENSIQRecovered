package p000;

import android.content.Context;
import com.mylhyl.circledialog.CircleParams;

/* JADX INFO: loaded from: classes6.dex */
public final class bg1 extends rf1 {

    /* JADX INFO: renamed from: g */
    public ha1 f13668g;

    public bg1(Context context, CircleParams circleParams) {
        super(context, circleParams);
    }

    @Override // p000.qf1
    public void buildBodyView() {
        mo21252d();
        m21253e();
        if (this.f13668g == null) {
            Context context = this.f78141a;
            CircleParams circleParams = this.f78142b;
            ha1 ha1Var = new ha1(context, circleParams.f24219H, circleParams.f24228Z, circleParams.f24237d2);
            this.f13668g = ha1Var;
            m21249a(ha1Var);
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
        ha1 ha1Var = this.f13668g;
        if (ha1Var != null) {
            ha1Var.refreshProgress();
        }
    }

    @Override // p000.rf1, p000.qf1
    public /* bridge */ /* synthetic */ void refreshTitle() {
        super.refreshTitle();
    }

    @Override // p000.qf1
    public ha1 getBodyView() {
        return this.f13668g;
    }
}
