package p000;

import android.R;
import android.content.Context;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.mylhyl.circledialog.C3860a;
import com.mylhyl.circledialog.params.DialogParams;
import com.mylhyl.circledialog.params.InputParams;
import com.mylhyl.circledialog.params.SubTitleParams;
import com.mylhyl.circledialog.params.TitleParams;

/* JADX INFO: loaded from: classes6.dex */
public final class ea1 extends RelativeLayout implements j48 {

    /* JADX INFO: renamed from: C */
    public TextView f32306C;

    /* JADX INFO: renamed from: a */
    public DialogParams f32307a;

    /* JADX INFO: renamed from: b */
    public TitleParams f32308b;

    /* JADX INFO: renamed from: c */
    public SubTitleParams f32309c;

    /* JADX INFO: renamed from: d */
    public InputParams f32310d;

    /* JADX INFO: renamed from: e */
    public a3c f32311e;

    /* JADX INFO: renamed from: f */
    public g2c f32312f;

    /* JADX INFO: renamed from: m */
    public EditText f32313m;

    /* JADX INFO: renamed from: ea1$a */
    public class ViewTreeObserverOnGlobalLayoutListenerC5211a implements ViewTreeObserver.OnGlobalLayoutListener {
        public ViewTreeObserverOnGlobalLayoutListenerC5211a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            ea1.this.f32313m.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            if (ea1.this.f32310d.f24328b > ea1.this.f32313m.getMeasuredHeight()) {
                ea1.this.f32313m.setHeight(C3860a.dp2px(ea1.this.getContext(), ea1.this.f32310d.f24328b));
            }
        }
    }

    public ea1(Context context, DialogParams dialogParams, TitleParams titleParams, SubTitleParams subTitleParams, InputParams inputParams, a3c a3cVar, g2c g2cVar) {
        super(context);
        this.f32307a = dialogParams;
        this.f32308b = titleParams;
        this.f32309c = subTitleParams;
        this.f32310d = inputParams;
        this.f32311e = a3cVar;
        this.f32312f = g2cVar;
        init();
    }

    private void createCounter() {
        if (this.f32310d.f24324Z > 0) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(7, R.id.input);
            layoutParams.addRule(8, R.id.input);
            if (this.f32310d.f24318M1 != null) {
                layoutParams.setMargins(0, 0, C3860a.dp2px(getContext(), this.f32310d.f24318M1[0]), C3860a.dp2px(getContext(), this.f32310d.f24318M1[1]));
            }
            TextView textView = new TextView(getContext());
            this.f32306C = textView;
            textView.setTextSize(zz1.f106568x);
            this.f32306C.setTextColor(this.f32310d.f24321V1);
            InputParams inputParams = this.f32310d;
            if (inputParams.f24329b2) {
                EditText editText = this.f32313m;
                editText.addTextChangedListener(new l4a(inputParams.f24324Z, editText, this.f32306C, this.f32311e));
            } else {
                EditText editText2 = this.f32313m;
                editText2.addTextChangedListener(new n4a(inputParams.f24324Z, editText2, this.f32306C, this.f32311e));
            }
            addView(this.f32306C, layoutParams);
        }
    }

    private void createInput() {
        EditText editText = new EditText(getContext());
        this.f32313m = editText;
        editText.setId(R.id.input);
        int i = this.f32310d.f24317M;
        if (i != 0) {
            this.f32313m.setInputType(i);
        }
        this.f32313m.setHint(this.f32310d.f24330c);
        this.f32313m.setHintTextColor(this.f32310d.f24331d);
        this.f32313m.setTextSize(this.f32310d.f24315H);
        this.f32313m.setTextColor(this.f32310d.f24316L);
        this.f32313m.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC5211a());
        this.f32313m.setGravity(this.f32310d.f24319N);
        if (!TextUtils.isEmpty(this.f32310d.f24320Q)) {
            this.f32313m.setText(this.f32310d.f24320Q);
            this.f32313m.setSelection(this.f32310d.f24320Q.length());
        }
        int i2 = this.f32310d.f24332e;
        if (i2 == 0) {
            int iDp2px = C3860a.dp2px(getContext(), this.f32310d.f24333f);
            EditText editText2 = this.f32313m;
            InputParams inputParams = this.f32310d;
            editText2.setBackground(new o38(iDp2px, inputParams.f24334m, inputParams.f24313C));
        } else {
            this.f32313m.setBackgroundResource(i2);
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        if (this.f32310d.f24326a != null) {
            layoutParams.setMargins(C3860a.dp2px(getContext(), r1[0]), C3860a.dp2px(getContext(), r1[1]), C3860a.dp2px(getContext(), r1[2]), C3860a.dp2px(getContext(), r1[3]));
        }
        if (this.f32310d.f24322X != null) {
            this.f32313m.setPadding(C3860a.dp2px(getContext(), r1[0]), C3860a.dp2px(getContext(), r1[1]), C3860a.dp2px(getContext(), r1[2]), C3860a.dp2px(getContext(), r1[3]));
        }
        EditText editText3 = this.f32313m;
        editText3.setTypeface(editText3.getTypeface(), this.f32310d.f24323Y);
        addView(this.f32313m, layoutParams);
    }

    private void init() {
        int i;
        TitleParams titleParams = this.f32308b;
        if (titleParams == null) {
            SubTitleParams subTitleParams = this.f32309c;
            i = subTitleParams == null ? zz1.f106546b[1] : subTitleParams.f24398b[1];
        } else {
            i = titleParams.f24415b[1];
        }
        setPadding(0, C3860a.dp2px(getContext(), i), 0, 0);
        int i2 = this.f32310d.f24314F;
        if (i2 == 0) {
            i2 = this.f32307a.f24298H;
        }
        setBackgroundColor(i2);
        createInput();
        createCounter();
        if (this.f32310d.f24327a2) {
            this.f32313m.setFilters(new InputFilter[]{new bz4()});
        }
        g2c g2cVar = this.f32312f;
        if (g2cVar != null) {
            g2cVar.onCreateText(this, this.f32313m, this.f32306C);
        }
    }

    @Override // p000.j48
    public EditText getInput() {
        return this.f32313m;
    }

    @Override // p000.j48
    public View getView() {
        return this;
    }
}
