package p000;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.mylhyl.circledialog.C3860a;
import com.mylhyl.circledialog.params.ButtonParams;
import com.mylhyl.circledialog.params.DialogParams;

/* JADX INFO: loaded from: classes6.dex */
public class a4b extends LinearLayout implements wh1 {

    /* JADX INFO: renamed from: C */
    public TextView f381C;

    /* JADX INFO: renamed from: a */
    public DialogParams f382a;

    /* JADX INFO: renamed from: b */
    public ButtonParams f383b;

    /* JADX INFO: renamed from: c */
    public ButtonParams f384c;

    /* JADX INFO: renamed from: d */
    public ButtonParams f385d;

    /* JADX INFO: renamed from: e */
    public f2c f386e;

    /* JADX INFO: renamed from: f */
    public TextView f387f;

    /* JADX INFO: renamed from: m */
    public TextView f388m;

    public a4b(Context context, DialogParams dialogParams, ButtonParams buttonParams, ButtonParams buttonParams2, ButtonParams buttonParams3, f2c f2cVar) {
        super(context);
        this.f382a = dialogParams;
        this.f383b = buttonParams;
        this.f384c = buttonParams2;
        this.f385d = buttonParams3;
        this.f386e = f2cVar;
        init();
    }

    private void createDivider() {
        addView(new ch4(getContext()));
    }

    private void createNegative() {
        TextView textView = new TextView(getContext());
        this.f387f = textView;
        textView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2, 1.0f));
        handleNegativeStyle();
        addView(this.f387f);
    }

    private void createNeutral() {
        TextView textView = new TextView(getContext());
        this.f381C = textView;
        textView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2, 1.0f));
        handleNeutralStyle();
        addView(this.f381C);
    }

    private void createPositive() {
        TextView textView = new TextView(getContext());
        this.f388m = textView;
        textView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2, 1.0f));
        handlePositiveStyle();
        addView(this.f388m);
    }

    private void handleNegativeStyle() {
        this.f387f.setGravity(17);
        this.f387f.setText(this.f383b.f24281f);
        this.f387f.setEnabled(!this.f383b.f24282m);
        TextView textView = this.f387f;
        ButtonParams buttonParams = this.f383b;
        textView.setTextColor(buttonParams.f24282m ? buttonParams.f24273C : buttonParams.f24277b);
        this.f387f.setTextSize(this.f383b.f24278c);
        this.f387f.setHeight(C3860a.dp2px(getContext(), this.f383b.f24279d));
        TextView textView2 = this.f387f;
        textView2.setTypeface(textView2.getTypeface(), this.f383b.f24275H);
    }

    private void handleNeutralStyle() {
        this.f381C.setGravity(17);
        this.f381C.setText(this.f385d.f24281f);
        this.f381C.setEnabled(!this.f385d.f24282m);
        TextView textView = this.f381C;
        ButtonParams buttonParams = this.f385d;
        textView.setTextColor(buttonParams.f24282m ? buttonParams.f24273C : buttonParams.f24277b);
        this.f381C.setTextSize(this.f385d.f24278c);
        this.f381C.setHeight(C3860a.dp2px(getContext(), this.f385d.f24279d));
        TextView textView2 = this.f381C;
        textView2.setTypeface(textView2.getTypeface(), this.f385d.f24275H);
    }

    private void handlePositiveStyle() {
        this.f388m.setGravity(17);
        this.f388m.setText(this.f384c.f24281f);
        this.f388m.setEnabled(!this.f384c.f24282m);
        TextView textView = this.f388m;
        ButtonParams buttonParams = this.f384c;
        textView.setTextColor(buttonParams.f24282m ? buttonParams.f24273C : buttonParams.f24277b);
        this.f388m.setTextSize(this.f384c.f24278c);
        this.f388m.setHeight(C3860a.dp2px(getContext(), this.f384c.f24279d));
        TextView textView2 = this.f388m;
        textView2.setTypeface(textView2.getTypeface(), this.f384c.f24275H);
    }

    private void init() {
        int i;
        int i2;
        int i3 = 0;
        setOrientation(0);
        if (this.f383b != null) {
            createNegative();
            i = this.f383b.f24280e;
            if (i == 0) {
                i = this.f382a.f24298H;
            }
        } else {
            i = 0;
        }
        if (this.f385d != null) {
            if (this.f387f != null) {
                createDivider();
            }
            createNeutral();
            i2 = this.f385d.f24280e;
            if (i2 == 0) {
                i2 = this.f382a.f24298H;
            }
        } else {
            i2 = 0;
        }
        if (this.f384c != null) {
            if (this.f381C != null || this.f387f != null) {
                createDivider();
            }
            createPositive();
            i3 = this.f384c.f24280e;
            if (i3 == 0) {
                i3 = this.f382a.f24298H;
            }
        }
        if (this.f387f != null && this.f383b != null) {
            int i4 = this.f383b.f24274F;
            if (i4 == 0) {
                i4 = this.f382a.f24302Q;
            }
            this.f387f.setBackground(new b02(i, i4));
        }
        if (this.f388m != null && this.f384c != null) {
            int i5 = this.f384c.f24274F;
            if (i5 == 0) {
                i5 = this.f382a.f24302Q;
            }
            this.f388m.setBackground(new b02(i3, i5));
        }
        if (this.f381C != null && this.f385d != null) {
            int i6 = this.f385d.f24274F;
            if (i6 == 0) {
                i6 = this.f382a.f24302Q;
            }
            this.f381C.setBackground(new b02(i2, i6));
        }
        f2c f2cVar = this.f386e;
        if (f2cVar != null) {
            f2cVar.onCreateButton(this.f387f, this.f388m, this.f381C);
        }
    }

    @Override // p000.wh1
    public View getView() {
        return this;
    }

    @Override // p000.wh1
    public boolean isEmpty() {
        return this.f383b == null && this.f384c == null && this.f385d == null;
    }

    @Override // p000.wh1
    public void refreshText() {
        if (this.f383b != null && this.f387f != null) {
            handleNegativeStyle();
        }
        if (this.f384c != null && this.f388m != null) {
            handlePositiveStyle();
        }
        if (this.f385d == null || this.f381C == null) {
            return;
        }
        handleNeutralStyle();
    }

    @Override // p000.wh1
    public void regNegativeListener(View.OnClickListener onClickListener) {
        TextView textView = this.f387f;
        if (textView != null) {
            textView.setOnClickListener(onClickListener);
        }
    }

    @Override // p000.wh1
    public void regNeutralListener(View.OnClickListener onClickListener) {
        TextView textView = this.f381C;
        if (textView != null) {
            textView.setOnClickListener(onClickListener);
        }
    }

    @Override // p000.wh1
    public void regPositiveListener(View.OnClickListener onClickListener) {
        TextView textView = this.f388m;
        if (textView != null) {
            textView.setOnClickListener(onClickListener);
        }
    }
}
