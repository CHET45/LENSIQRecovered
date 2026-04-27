package p000;

import android.content.Context;
import android.view.View;
import com.mylhyl.circledialog.CircleParams;

/* JADX INFO: loaded from: classes6.dex */
public final class uf1 extends rf1 {

    /* JADX INFO: renamed from: g */
    public View f87845g;

    public uf1(Context context, CircleParams circleParams) {
        super(context, circleParams);
    }

    @Override // p000.qf1
    public void buildBodyView() {
        mo21252d();
        m21253e();
        if (this.f87845g == null) {
            CircleParams circleParams = this.f78142b;
            int i = circleParams.f24231a2;
            if (i != 0) {
                this.f87845g = m21254f(i);
            } else {
                this.f87845g = circleParams.f24233b2;
            }
            View view = this.f87845g;
            if (view != null) {
                m21249a(view);
            }
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
    public View getBodyView() {
        return this.f87845g;
    }
}
