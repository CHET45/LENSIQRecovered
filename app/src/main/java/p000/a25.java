package p000;

import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.C3428a;
import com.google.android.material.textfield.TextInputLayout;
import p000.C7156i6;

/* JADX INFO: loaded from: classes5.dex */
public abstract class a25 {

    /* JADX INFO: renamed from: a */
    public final TextInputLayout f163a;

    /* JADX INFO: renamed from: b */
    public final C3428a f164b;

    /* JADX INFO: renamed from: c */
    public final Context f165c;

    /* JADX INFO: renamed from: d */
    public final CheckableImageButton f166d;

    public a25(@efb C3428a c3428a) {
        this.f163a = c3428a.f22745a;
        this.f164b = c3428a;
        this.f165c = c3428a.getContext();
        this.f166d = c3428a.m6563p();
    }

    /* JADX INFO: renamed from: a */
    public void mo34a(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void afterEditTextChanged(Editable editable) {
    }

    @g8g
    /* JADX INFO: renamed from: b */
    public int mo35b() {
        return 0;
    }

    @gq4
    /* JADX INFO: renamed from: c */
    public int mo36c() {
        return 0;
    }

    /* JADX INFO: renamed from: d */
    public View.OnFocusChangeListener mo37d() {
        return null;
    }

    /* JADX INFO: renamed from: e */
    public View.OnClickListener mo38e() {
        return null;
    }

    /* JADX INFO: renamed from: f */
    public View.OnFocusChangeListener mo39f() {
        return null;
    }

    /* JADX INFO: renamed from: g */
    public boolean mo40g(int i) {
        return true;
    }

    public C7156i6.e getTouchExplorationStateChangeListener() {
        return null;
    }

    /* JADX INFO: renamed from: h */
    public boolean mo41h() {
        return false;
    }

    /* JADX INFO: renamed from: i */
    public boolean mo42i() {
        return false;
    }

    /* JADX INFO: renamed from: j */
    public boolean mo43j() {
        return false;
    }

    /* JADX INFO: renamed from: k */
    public boolean mo44k() {
        return false;
    }

    /* JADX INFO: renamed from: l */
    public void mo45l(boolean z) {
    }

    /* JADX INFO: renamed from: m */
    public final void m46m() {
        this.f164b.m6525G(false);
    }

    /* JADX INFO: renamed from: n */
    public void mo47n() {
    }

    /* JADX INFO: renamed from: o */
    public boolean mo48o() {
        return false;
    }

    public void onEditTextAttached(@hib EditText editText) {
    }

    public void onInitializeAccessibilityNodeInfo(View view, @efb C6730h7 c6730h7) {
    }

    public void onPopulateAccessibilityEvent(View view, @efb AccessibilityEvent accessibilityEvent) {
    }

    /* JADX INFO: renamed from: p */
    public void mo49p() {
    }
}
