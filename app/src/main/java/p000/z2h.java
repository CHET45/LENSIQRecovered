package p000;

import android.R;
import android.content.Context;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.mylhyl.circledialog.C3860a;
import com.mylhyl.circledialog.params.DialogParams;
import com.mylhyl.circledialog.params.SubTitleParams;
import com.mylhyl.circledialog.params.TitleParams;

/* JADX INFO: loaded from: classes6.dex */
public final class z2h extends LinearLayout {

    /* JADX INFO: renamed from: C */
    public k2c f103905C;

    /* JADX INFO: renamed from: a */
    public RelativeLayout f103906a;

    /* JADX INFO: renamed from: b */
    public ImageView f103907b;

    /* JADX INFO: renamed from: c */
    public TextView f103908c;

    /* JADX INFO: renamed from: d */
    public TextView f103909d;

    /* JADX INFO: renamed from: e */
    public DialogParams f103910e;

    /* JADX INFO: renamed from: f */
    public TitleParams f103911f;

    /* JADX INFO: renamed from: m */
    public SubTitleParams f103912m;

    public z2h(Context context, DialogParams dialogParams, TitleParams titleParams, SubTitleParams subTitleParams, k2c k2cVar) {
        super(context);
        this.f103910e = dialogParams;
        this.f103911f = titleParams;
        this.f103912m = subTitleParams;
        this.f103905C = k2cVar;
        init();
    }

    @hib
    private void createSubTitle() {
        if (this.f103912m != null) {
            TextView textView = new TextView(getContext());
            this.f103909d = textView;
            textView.setGravity(17);
            setSubTitleBg(this.f103909d, this.f103912m.f24402f, this.f103910e.f24298H);
            this.f103909d.setGravity(this.f103912m.f24403m);
            if (this.f103912m.f24399c != 0) {
                this.f103909d.setHeight(C3860a.dp2px(getContext(), this.f103912m.f24399c));
            }
            this.f103909d.setTextColor(this.f103912m.f24401e);
            this.f103909d.setTextSize(this.f103912m.f24400d);
            this.f103909d.setText(this.f103912m.f24397a);
            if (this.f103912m.f24398b != null) {
                this.f103909d.setPadding(C3860a.dp2px(getContext(), r0[0]), C3860a.dp2px(getContext(), r0[1]), C3860a.dp2px(getContext(), r0[2]), C3860a.dp2px(getContext(), r0[3]));
            }
            TextView textView2 = this.f103909d;
            textView2.setTypeface(textView2.getTypeface(), this.f103912m.f24396C);
            addView(this.f103909d);
        }
    }

    @efb
    private void createTitle() {
        TextView textView = new TextView(getContext());
        this.f103908c = textView;
        textView.setGravity(17);
        this.f103908c.setId(R.id.title);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(14);
        this.f103908c.setLayoutParams(layoutParams);
        if (this.f103911f.f24416c != 0) {
            this.f103908c.setHeight(C3860a.dp2px(getContext(), this.f103911f.f24416c));
        }
        this.f103908c.setTextColor(this.f103911f.f24418e);
        this.f103908c.setTextSize(this.f103911f.f24417d);
        this.f103908c.setText(this.f103911f.f24414a);
        if (this.f103911f.f24415b != null) {
            this.f103908c.setPadding(C3860a.dp2px(getContext(), r0[0]), C3860a.dp2px(getContext(), r0[1]), C3860a.dp2px(getContext(), r0[2]), C3860a.dp2px(getContext(), r0[3]));
        }
        TextView textView2 = this.f103908c;
        textView2.setTypeface(textView2.getTypeface(), this.f103911f.f24412C);
        this.f103906a.addView(this.f103908c);
        addView(this.f103906a);
    }

    @efb
    private void createTitleIcon() {
        this.f103907b = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(0, R.id.title);
        layoutParams.addRule(15);
        this.f103907b.setLayoutParams(layoutParams);
        int i = this.f103911f.f24413F;
        if (i != 0) {
            this.f103907b.setImageResource(i);
            this.f103907b.setVisibility(0);
        } else {
            this.f103907b.setVisibility(8);
        }
        this.f103906a.addView(this.f103907b);
    }

    private void createTitleLayout() {
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        this.f103906a = relativeLayout;
        relativeLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.f103906a.setGravity(this.f103911f.f24420m);
        this.f103906a.setPadding(50, 0, 50, 0);
        int i = this.f103911f.f24419f;
        if (i == 0) {
            i = this.f103910e.f24298H;
        }
        this.f103906a.setBackgroundColor(i);
    }

    private void init() {
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        setOrientation(1);
        createTitleLayout();
        createTitleIcon();
        createTitle();
        createSubTitle();
        k2c k2cVar = this.f103905C;
        if (k2cVar != null) {
            k2cVar.onCreateTitle(this.f103907b, this.f103908c, this.f103909d);
        }
    }

    private void setSubTitleBg(TextView textView, int i, int i2) {
        if (i == 0) {
            i = i2;
        }
        textView.setBackgroundColor(i);
    }

    public void refreshText() {
        TextView textView;
        TitleParams titleParams = this.f103911f;
        if (titleParams == null || (textView = this.f103908c) == null) {
            return;
        }
        textView.setText(titleParams.f24414a);
        TextView textView2 = this.f103909d;
        if (textView2 != null) {
            textView2.setText(this.f103912m.f24397a);
        }
    }
}
