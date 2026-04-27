package p000;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.C3146R;
import com.google.android.material.textfield.C3428a;

/* JADX INFO: loaded from: classes5.dex */
public class sic extends a25 {

    /* JADX INFO: renamed from: e */
    public int f81928e;

    /* JADX INFO: renamed from: f */
    @hib
    public EditText f81929f;

    /* JADX INFO: renamed from: g */
    public final View.OnClickListener f81930g;

    public sic(@efb C3428a c3428a, @gq4 int i) {
        super(c3428a);
        this.f81928e = C3146R.drawable.design_password_eye;
        this.f81930g = new View.OnClickListener() { // from class: ric
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f78396a.lambda$new$0(view);
            }
        };
        if (i != 0) {
            this.f81928e = i;
        }
    }

    private boolean hasPasswordTransformation() {
        EditText editText = this.f81929f;
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }

    private static boolean isInputTypePassword(EditText editText) {
        return editText != null && (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(View view) {
        EditText editText = this.f81929f;
        if (editText == null) {
            return;
        }
        int selectionEnd = editText.getSelectionEnd();
        if (hasPasswordTransformation()) {
            this.f81929f.setTransformationMethod(null);
        } else {
            this.f81929f.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
        if (selectionEnd >= 0) {
            this.f81929f.setSelection(selectionEnd);
        }
        m46m();
    }

    @Override // p000.a25
    /* JADX INFO: renamed from: a */
    public void mo34a(CharSequence charSequence, int i, int i2, int i3) {
        m46m();
    }

    @Override // p000.a25
    @g8g
    /* JADX INFO: renamed from: b */
    public int mo35b() {
        return C3146R.string.password_toggle_content_description;
    }

    @Override // p000.a25
    @gq4
    /* JADX INFO: renamed from: c */
    public int mo36c() {
        return this.f81928e;
    }

    @Override // p000.a25
    /* JADX INFO: renamed from: e */
    public View.OnClickListener mo38e() {
        return this.f81930g;
    }

    @Override // p000.a25
    /* JADX INFO: renamed from: j */
    public boolean mo43j() {
        return true;
    }

    @Override // p000.a25
    /* JADX INFO: renamed from: k */
    public boolean mo44k() {
        return !hasPasswordTransformation();
    }

    @Override // p000.a25
    /* JADX INFO: renamed from: n */
    public void mo47n() {
        if (isInputTypePassword(this.f81929f)) {
            this.f81929f.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    @Override // p000.a25
    public void onEditTextAttached(@hib EditText editText) {
        this.f81929f = editText;
        m46m();
    }

    @Override // p000.a25
    /* JADX INFO: renamed from: p */
    public void mo49p() {
        EditText editText = this.f81929f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
