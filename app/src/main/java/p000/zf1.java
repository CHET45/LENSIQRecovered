package p000;

import android.content.Context;
import com.mylhyl.circledialog.CircleParams;

/* JADX INFO: loaded from: classes6.dex */
public final class zf1 extends rf1 {

    /* JADX INFO: renamed from: g */
    public ga1 f104992g;

    public zf1(Context context, CircleParams circleParams) {
        super(context, circleParams);
    }

    @Override // p000.qf1
    public void buildBodyView() {
        mo21252d();
        m21253e();
        if (this.f104992g == null) {
            Context context = this.f78141a;
            CircleParams circleParams = this.f78142b;
            ga1 ga1Var = new ga1(context, circleParams.f24219H, circleParams.f24222M1, circleParams.f24239e2);
            this.f104992g = ga1Var;
            m21249a(ga1Var);
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
    public ga1 getBodyView() {
        return this.f104992g;
    }
}
