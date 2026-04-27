package p000;

import android.content.Context;
import com.mylhyl.circledialog.CircleParams;

/* JADX INFO: loaded from: classes6.dex */
public final class tf1 extends rf1 {

    /* JADX INFO: renamed from: g */
    public ja1 f84486g;

    public tf1(Context context, CircleParams circleParams) {
        super(context, circleParams);
    }

    @Override // p000.qf1
    public void buildBodyView() {
        mo21252d();
        m21253e();
        if (this.f84486g == null) {
            Context context = this.f78141a;
            CircleParams circleParams = this.f78142b;
            ja1 ja1Var = new ja1(context, circleParams.f24219H, circleParams.f24223N, circleParams.f24242g2);
            this.f84486g = ja1Var;
            m21249a(ja1Var);
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
        ja1 ja1Var = this.f84486g;
        if (ja1Var != null) {
            ja1Var.refreshText();
        }
    }

    @Override // p000.rf1, p000.qf1
    public /* bridge */ /* synthetic */ void refreshTitle() {
        super.refreshTitle();
    }

    @Override // p000.qf1
    public ja1 getBodyView() {
        return this.f84486g;
    }
}
