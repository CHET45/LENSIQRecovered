package p000;

import android.content.Context;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.mylhyl.circledialog.C3860a;
import com.mylhyl.circledialog.params.DialogParams;
import com.mylhyl.circledialog.params.LottieParams;

/* JADX INFO: loaded from: classes6.dex */
public final class ga1 extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public LottieAnimationView f39115a;

    /* JADX INFO: renamed from: b */
    public TextView f39116b;

    /* JADX INFO: renamed from: c */
    public DialogParams f39117c;

    /* JADX INFO: renamed from: d */
    public LottieParams f39118d;

    /* JADX INFO: renamed from: e */
    public h2c f39119e;

    public ga1(Context context, DialogParams dialogParams, LottieParams lottieParams, h2c h2cVar) {
        super(context);
        this.f39117c = dialogParams;
        this.f39118d = lottieParams;
        this.f39119e = h2cVar;
        init();
    }

    private void createLottieView() {
        this.f39115a = new LottieAnimationView(getContext());
        int iDp2px = C3860a.dp2px(getContext(), this.f39118d.f24362e);
        int iDp2px2 = C3860a.dp2px(getContext(), this.f39118d.f24361d);
        if (iDp2px <= 0) {
            iDp2px = -2;
        }
        if (iDp2px2 <= 0) {
            iDp2px2 = -2;
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iDp2px, iDp2px2);
        if (this.f39118d.f24358a != null) {
            layoutParams.setMargins(C3860a.dp2px(getContext(), r0[0]), C3860a.dp2px(getContext(), r0[1]), C3860a.dp2px(getContext(), r0[2]), C3860a.dp2px(getContext(), r0[3]));
        }
        layoutParams.gravity = 17;
        int i = this.f39118d.f24363f;
        if (i != 0) {
            this.f39115a.setAnimation(i);
        }
        if (!TextUtils.isEmpty(this.f39118d.f24364m)) {
            this.f39115a.setAnimation(this.f39118d.f24364m);
        }
        if (this.f39118d.f24351C) {
            this.f39115a.playAnimation();
        }
        if (this.f39118d.f24352F) {
            this.f39115a.setRepeatCount(-1);
        }
        addView(this.f39115a, layoutParams);
    }

    @hib
    private void createText() {
        if (TextUtils.isEmpty(this.f39118d.f24353H)) {
            return;
        }
        this.f39116b = new TextView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        if (this.f39118d.f24360c != null) {
            layoutParams.setMargins(C3860a.dp2px(getContext(), r1[0]), C3860a.dp2px(getContext(), r1[1]), C3860a.dp2px(getContext(), r1[2]), C3860a.dp2px(getContext(), r1[3]));
        }
        this.f39116b.setText(this.f39118d.f24353H);
        this.f39116b.setTextSize(this.f39118d.f24356N);
        this.f39116b.setTextColor(this.f39118d.f24355M);
        TextView textView = this.f39116b;
        textView.setTypeface(textView.getTypeface(), this.f39118d.f24357Q);
        if (this.f39118d.f24359b != null) {
            this.f39116b.setPadding(C3860a.dp2px(getContext(), r1[0]), C3860a.dp2px(getContext(), r1[1]), C3860a.dp2px(getContext(), r1[2]), C3860a.dp2px(getContext(), r1[3]));
        }
        addView(this.f39116b, layoutParams);
    }

    private void init() {
        setOrientation(1);
        int i = this.f39118d.f24354L;
        if (i == 0) {
            i = this.f39117c.f24298H;
        }
        setBackgroundColor(i);
        createLottieView();
        createText();
        h2c h2cVar = this.f39119e;
        if (h2cVar != null) {
            h2cVar.onCreateLottieView(this.f39115a, this.f39116b);
        }
    }
}
