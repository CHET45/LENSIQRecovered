package p000;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.mylhyl.circledialog.C3860a;
import com.mylhyl.circledialog.params.ButtonParams;
import com.mylhyl.circledialog.params.DialogParams;

/* JADX INFO: loaded from: classes6.dex */
public final class rg8 extends LinearLayout implements wh1 {

    /* JADX INFO: renamed from: C */
    public TextView f78228C;

    /* JADX INFO: renamed from: a */
    public DialogParams f78229a;

    /* JADX INFO: renamed from: b */
    public ButtonParams f78230b;

    /* JADX INFO: renamed from: c */
    public ButtonParams f78231c;

    /* JADX INFO: renamed from: d */
    public ButtonParams f78232d;

    /* JADX INFO: renamed from: e */
    public f2c f78233e;

    /* JADX INFO: renamed from: f */
    public TextView f78234f;

    /* JADX INFO: renamed from: m */
    public TextView f78235m;

    public rg8(Context context, DialogParams dialogParams, ButtonParams buttonParams, ButtonParams buttonParams2, ButtonParams buttonParams3, f2c f2cVar) {
        super(context);
        this.f78229a = dialogParams;
        this.f78230b = buttonParams;
        this.f78231c = buttonParams2;
        this.f78232d = buttonParams3;
        this.f78233e = f2cVar;
        init();
    }

    private void createDivider() {
        addView(new ch4(getContext()));
    }

    private void createNegative() {
        this.f78234f = new TextView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2, 1.0f);
        if (this.f78230b.f24276a > 0) {
            layoutParams.topMargin = C3860a.dp2px(getContext(), this.f78230b.f24276a);
        }
        this.f78234f.setLayoutParams(layoutParams);
        handleNegativeStyle();
        addView(this.f78234f);
    }

    private void createNeutral() {
        this.f78228C = new TextView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2, 1.0f);
        if (this.f78232d.f24276a > 0) {
            layoutParams.topMargin = C3860a.dp2px(getContext(), this.f78230b.f24276a);
        }
        this.f78228C.setLayoutParams(layoutParams);
        handleNeutralStyle();
        addView(this.f78228C);
    }

    private void createPositive() {
        this.f78235m = new TextView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2, 1.0f);
        if (this.f78231c.f24276a > 0) {
            layoutParams.topMargin = C3860a.dp2px(getContext(), this.f78231c.f24276a);
        }
        this.f78235m.setLayoutParams(layoutParams);
        handlePositiveStyle();
        addView(this.f78235m);
    }

    private void handleNegativeStyle() {
        this.f78234f.setGravity(17);
        this.f78234f.setText(this.f78230b.f24281f);
        this.f78234f.setEnabled(!this.f78230b.f24282m);
        TextView textView = this.f78234f;
        ButtonParams buttonParams = this.f78230b;
        textView.setTextColor(buttonParams.f24282m ? buttonParams.f24273C : buttonParams.f24277b);
        this.f78234f.setTextSize(this.f78230b.f24278c);
        this.f78234f.setHeight(C3860a.dp2px(getContext(), this.f78230b.f24279d));
        TextView textView2 = this.f78234f;
        textView2.setTypeface(textView2.getTypeface(), this.f78230b.f24275H);
    }

    private void handleNeutralStyle() {
        this.f78228C.setGravity(17);
        this.f78228C.setText(this.f78232d.f24281f);
        this.f78228C.setEnabled(!this.f78232d.f24282m);
        TextView textView = this.f78228C;
        ButtonParams buttonParams = this.f78232d;
        textView.setTextColor(buttonParams.f24282m ? buttonParams.f24273C : buttonParams.f24277b);
        this.f78228C.setTextSize(this.f78232d.f24278c);
        this.f78228C.setHeight(C3860a.dp2px(getContext(), this.f78232d.f24279d));
        TextView textView2 = this.f78228C;
        textView2.setTypeface(textView2.getTypeface(), this.f78232d.f24275H);
    }

    private void handlePositiveStyle() {
        this.f78235m.setGravity(17);
        this.f78235m.setText(this.f78231c.f24281f);
        this.f78235m.setEnabled(!this.f78231c.f24282m);
        TextView textView = this.f78235m;
        ButtonParams buttonParams = this.f78231c;
        textView.setTextColor(buttonParams.f24282m ? buttonParams.f24273C : buttonParams.f24277b);
        this.f78235m.setTextSize(this.f78231c.f24278c);
        this.f78235m.setHeight(C3860a.dp2px(getContext(), this.f78231c.f24279d));
        TextView textView2 = this.f78235m;
        textView2.setTypeface(textView2.getTypeface(), this.f78231c.f24275H);
    }

    private void init() {
        int i;
        int i2;
        int i3;
        int iDp2px = C3860a.dp2px(getContext(), this.f78229a.f24299L);
        if (this.f78230b != null) {
            createNegative();
            int i4 = this.f78230b.f24280e;
            if (i4 == 0) {
                i4 = this.f78229a.f24298H;
            }
            i = i4;
        } else {
            i = 0;
        }
        if (this.f78232d != null) {
            if (this.f78234f != null) {
                createDivider();
            }
            createNeutral();
            int i5 = this.f78232d.f24280e;
            if (i5 == 0) {
                i5 = this.f78229a.f24298H;
            }
            i2 = i5;
        } else {
            i2 = 0;
        }
        if (this.f78231c != null) {
            if (this.f78228C != null || this.f78234f != null) {
                createDivider();
            }
            createPositive();
            i3 = this.f78231c.f24280e;
            if (i3 == 0) {
                i3 = this.f78229a.f24298H;
            }
        } else {
            i3 = 0;
        }
        if (this.f78234f != null && this.f78230b != null) {
            int i6 = (this.f78228C == null && this.f78235m == null) ? iDp2px : 0;
            int i7 = this.f78230b.f24274F;
            if (i7 == 0) {
                i7 = this.f78229a.f24302Q;
            }
            this.f78234f.setBackground(new b02(i, i7, iDp2px, i6, i6, iDp2px));
        }
        if (this.f78235m != null && this.f78231c != null) {
            int i8 = (this.f78234f == null && this.f78228C == null) ? iDp2px : 0;
            int i9 = this.f78231c.f24274F;
            if (i9 == 0) {
                i9 = this.f78229a.f24302Q;
            }
            this.f78235m.setBackground(new b02(i3, i9, i8, iDp2px, iDp2px, i8));
        }
        if (this.f78228C != null && this.f78232d != null) {
            int i10 = this.f78234f == null ? iDp2px : 0;
            int i11 = this.f78235m == null ? iDp2px : 0;
            int i12 = this.f78232d.f24274F;
            if (i12 == 0) {
                i12 = this.f78229a.f24302Q;
            }
            this.f78228C.setBackground(new b02(i2, i12, i10, i11, i11, i10));
        }
        f2c f2cVar = this.f78233e;
        if (f2cVar != null) {
            f2cVar.onCreateButton(this.f78234f, this.f78235m, this.f78228C);
        }
    }

    @Override // p000.wh1
    public View getView() {
        return this;
    }

    @Override // p000.wh1
    public boolean isEmpty() {
        return this.f78230b == null && this.f78231c == null && this.f78232d == null;
    }

    @Override // p000.wh1
    public void refreshText() {
        if (this.f78230b != null && this.f78234f != null) {
            handleNegativeStyle();
        }
        if (this.f78231c != null && this.f78235m != null) {
            handlePositiveStyle();
        }
        if (this.f78232d == null || this.f78228C == null) {
            return;
        }
        handleNeutralStyle();
    }

    @Override // p000.wh1
    public void regNegativeListener(View.OnClickListener onClickListener) {
        TextView textView = this.f78234f;
        if (textView != null) {
            textView.setOnClickListener(onClickListener);
        }
    }

    @Override // p000.wh1
    public void regNeutralListener(View.OnClickListener onClickListener) {
        TextView textView = this.f78228C;
        if (textView != null) {
            textView.setOnClickListener(onClickListener);
        }
    }

    @Override // p000.wh1
    public void regPositiveListener(View.OnClickListener onClickListener) {
        TextView textView = this.f78235m;
        if (textView != null) {
            textView.setOnClickListener(onClickListener);
        }
    }
}
