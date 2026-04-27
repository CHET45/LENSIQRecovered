package p000;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import com.mylhyl.circledialog.C3860a;
import com.mylhyl.circledialog.CircleParams;
import com.mylhyl.circledialog.params.CloseParams;
import com.mylhyl.circledialog.view.CloseImgView;

/* JADX INFO: loaded from: classes6.dex */
public abstract class rf1 implements qf1 {

    /* JADX INFO: renamed from: a */
    public Context f78141a;

    /* JADX INFO: renamed from: b */
    public CircleParams f78142b;

    /* JADX INFO: renamed from: c */
    public ViewGroup f78143c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f78144d;

    /* JADX INFO: renamed from: e */
    public z2h f78145e;

    /* JADX INFO: renamed from: f */
    public wh1 f78146f;

    public rf1(Context context, CircleParams circleParams) {
        this.f78141a = context;
        this.f78142b = circleParams;
    }

    /* JADX INFO: renamed from: a */
    public final void m21249a(View view) {
        this.f78144d.addView(view);
    }

    /* JADX INFO: renamed from: b */
    public CardView m21250b() {
        CardView cardView = new CardView(this.f78141a);
        cardView.setCardElevation(0.0f);
        cardView.setCardBackgroundColor(0);
        cardView.setRadius(C3860a.dp2px(this.f78141a, this.f78142b.f24219H.f24299L));
        return cardView;
    }

    @Override // p000.qf1
    public wh1 buildButton() {
        Context context = this.f78141a;
        CircleParams circleParams = this.f78142b;
        a4b a4bVar = new a4b(context, circleParams.f24219H, circleParams.f24224Q, circleParams.f24226X, circleParams.f24229Z1, circleParams.f24244i2);
        this.f78146f = a4bVar;
        if (!a4bVar.isEmpty()) {
            this.f78144d.addView(new ch4(this.f78141a, 0));
        }
        this.f78144d.addView(this.f78146f.getView());
        return this.f78146f;
    }

    @Override // p000.qf1
    public o52 buildCloseImgView() {
        CloseParams closeParams = this.f78142b.f24249m2;
        CloseImgView closeImgView = new CloseImgView(this.f78141a, closeParams);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        int i = closeParams.f24292d;
        if (i == 351 || i == 783) {
            layoutParams.gravity = 3;
        } else if (i == 349 || i == 781) {
            layoutParams.gravity = 1;
        } else {
            layoutParams.gravity = 5;
        }
        closeImgView.setLayoutParams(layoutParams);
        int i2 = closeParams.f24292d;
        if (i2 == 351 || i2 == 349 || i2 == 353) {
            this.f78144d.addView(closeImgView, 0);
        } else {
            this.f78144d.addView(closeImgView);
        }
        return closeImgView;
    }

    /* JADX INFO: renamed from: c */
    public LinearLayout m21251c() {
        LinearLayout linearLayout = new LinearLayout(this.f78141a);
        this.f78144d = linearLayout;
        linearLayout.setOrientation(1);
        return this.f78144d;
    }

    /* JADX INFO: renamed from: d */
    public void mo21252d() {
        CardView cardViewM21250b = m21250b();
        m21251c();
        cardViewM21250b.addView(this.f78144d);
        this.f78143c = cardViewM21250b;
    }

    /* JADX INFO: renamed from: e */
    public final void m21253e() {
        if (this.f78142b.f24220L != null) {
            Context context = this.f78141a;
            CircleParams circleParams = this.f78142b;
            z2h z2hVar = new z2h(context, circleParams.f24219H, circleParams.f24220L, circleParams.f24221M, circleParams.f24241f2);
            this.f78145e = z2hVar;
            this.f78144d.addView(z2hVar);
        }
    }

    /* JADX INFO: renamed from: f */
    public final View m21254f(int i) {
        return LayoutInflater.from(this.f78141a).inflate(i, (ViewGroup) this.f78144d, false);
    }

    @Override // p000.qf1
    public final View getRootView() {
        return this.f78143c;
    }

    @Override // p000.qf1
    public final void refreshButton() {
        wh1 wh1Var = this.f78146f;
        if (wh1Var != null) {
            wh1Var.refreshText();
        }
    }

    @Override // p000.qf1
    public void refreshTitle() {
        z2h z2hVar = this.f78145e;
        if (z2hVar != null) {
            z2hVar.refreshText();
        }
    }
}
