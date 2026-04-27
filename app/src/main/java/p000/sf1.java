package p000;

import android.R;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import com.mylhyl.circledialog.CircleParams;

/* JADX INFO: loaded from: classes6.dex */
public final class sf1 extends rf1 {

    /* JADX INFO: renamed from: g */
    public da1 f81643g;

    /* JADX INFO: renamed from: sf1$a */
    public static class C12552a extends StateListDrawable {
        public C12552a(int i, int i2) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(1);
            gradientDrawable.setColor(i);
            gradientDrawable.setSize(i2, i2);
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setShape(1);
            gradientDrawable2.setStroke(2, i);
            gradientDrawable2.setSize(i2, i2);
            addState(new int[]{R.attr.state_selected}, gradientDrawable);
            addState(new int[]{-16842913}, gradientDrawable2);
        }
    }

    public sf1(Context context, CircleParams circleParams) {
        super(context, circleParams);
    }

    @Override // p000.qf1
    public void buildBodyView() {
        if (this.f78142b.f24249m2 == null) {
            mo21252d();
        } else {
            this.f78143c = m21251c();
        }
        m21253e();
        if (this.f81643g == null) {
            Context context = this.f78141a;
            CircleParams circleParams = this.f78142b;
            da1 da1Var = new da1(context, circleParams.f24250n2, circleParams.f24251o2);
            this.f81643g = da1Var;
            m21249a(da1Var);
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
    public da1 getBodyView() {
        return this.f81643g;
    }
}
