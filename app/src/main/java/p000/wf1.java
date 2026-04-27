package p000;

import android.content.Context;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import com.mylhyl.circledialog.C3860a;
import com.mylhyl.circledialog.CircleParams;

/* JADX INFO: loaded from: classes6.dex */
public abstract class wf1 extends rf1 {

    /* JADX INFO: renamed from: g */
    public sg8 f94062g;

    public wf1(Context context, CircleParams circleParams) {
        super(context, circleParams);
    }

    @Override // p000.rf1, p000.qf1
    public wh1 buildButton() {
        Context context = this.f78141a;
        CircleParams circleParams = this.f78142b;
        rg8 rg8Var = new rg8(context, circleParams.f24219H, circleParams.f24224Q, circleParams.f24226X, circleParams.f24229Z1, circleParams.f24244i2);
        this.f78143c.addView(rg8Var);
        return rg8Var;
    }

    @Override // p000.rf1
    /* JADX INFO: renamed from: d */
    public void mo21252d() {
        LinearLayout linearLayout = new LinearLayout(this.f78141a);
        linearLayout.setOrientation(1);
        CardView cardView = new CardView(this.f78141a);
        cardView.setCardElevation(0.0f);
        cardView.setCardBackgroundColor(0);
        cardView.setRadius(C3860a.dp2px(this.f78141a, this.f78142b.f24219H.f24299L));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2, 1.0f);
        layoutParams.bottomMargin = C3860a.dp2px(this.f78141a, this.f78142b.f24227Y.f24341Q);
        cardView.setLayoutParams(layoutParams);
        linearLayout.addView(cardView);
        cardView.addView(m21251c());
        this.f78143c = linearLayout;
    }

    @Override // p000.qf1
    public void refreshContent() {
        sg8 sg8Var = this.f94062g;
        if (sg8Var != null) {
            sg8Var.refreshItems();
        }
    }

    @Override // p000.qf1
    public sg8 getBodyView() {
        return this.f94062g;
    }
}
