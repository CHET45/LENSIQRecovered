package p000;

import android.content.Context;
import android.text.method.ScrollingMovementMethod;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.mylhyl.circledialog.C3860a;
import com.mylhyl.circledialog.params.DialogParams;
import com.mylhyl.circledialog.params.TextParams;

/* JADX INFO: loaded from: classes6.dex */
public final class ja1 extends AppCompatTextView {

    /* JADX INFO: renamed from: C */
    public DialogParams f50062C;

    /* JADX INFO: renamed from: F */
    public TextParams f50063F;

    /* JADX INFO: renamed from: H */
    public j2c f50064H;

    public ja1(Context context, DialogParams dialogParams, TextParams textParams, j2c j2cVar) {
        super(context);
        this.f50062C = dialogParams;
        this.f50063F = textParams;
        this.f50064H = j2cVar;
        init();
    }

    private void init() {
        if (this.f50063F == null) {
            TextParams textParams = new TextParams();
            this.f50063F = textParams;
            textParams.f24407c = 0;
            textParams.f24405a = null;
        }
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2, 1.0f));
        setGravity(this.f50063F.f24411m);
        setMovementMethod(ScrollingMovementMethod.getInstance());
        int i = this.f50063F.f24408d;
        if (i == 0) {
            i = this.f50062C.f24298H;
        }
        setBackgroundColor(i);
        setMinHeight(this.f50063F.f24407c);
        setTextColor(this.f50063F.f24409e);
        setTextSize(this.f50063F.f24410f);
        setText(this.f50063F.f24406b);
        setTypeface(getTypeface(), this.f50063F.f24404C);
        if (this.f50063F.f24405a != null) {
            setPadding(C3860a.dp2px(getContext(), r0[0]), C3860a.dp2px(getContext(), r0[1]), C3860a.dp2px(getContext(), r0[2]), C3860a.dp2px(getContext(), r0[3]));
        }
        j2c j2cVar = this.f50064H;
        if (j2cVar != null) {
            j2cVar.onCreateText(this);
        }
    }

    public void refreshText() {
        TextParams textParams = this.f50063F;
        if (textParams != null) {
            setText(textParams.f24406b);
        }
    }
}
