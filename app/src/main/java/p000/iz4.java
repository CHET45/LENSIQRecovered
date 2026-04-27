package p000;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji2.text.C1035c;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@c5e(19)
@p7e({p7e.EnumC10826a.f69934a})
public final class iz4 implements TextWatcher {

    /* JADX INFO: renamed from: a */
    public final EditText f48934a;

    /* JADX INFO: renamed from: b */
    public final boolean f48935b;

    /* JADX INFO: renamed from: c */
    public C1035c.g f48936c;

    /* JADX INFO: renamed from: d */
    public int f48937d = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: e */
    public int f48938e = 0;

    /* JADX INFO: renamed from: f */
    public boolean f48939f = true;

    /* JADX INFO: renamed from: iz4$a */
    @c5e(19)
    public static class C7670a extends C1035c.g {

        /* JADX INFO: renamed from: a */
        public final Reference<EditText> f48940a;

        public C7670a(EditText editText) {
            this.f48940a = new WeakReference(editText);
        }

        @Override // androidx.emoji2.text.C1035c.g
        public void onInitialized() {
            super.onInitialized();
            iz4.m13568c(this.f48940a.get(), 1);
        }
    }

    public iz4(EditText editText, boolean z) {
        this.f48934a = editText;
        this.f48935b = z;
    }

    /* JADX INFO: renamed from: c */
    public static void m13568c(@hib EditText editText, int i) {
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            C1035c.get().process(editableText);
            dz4.m9597a(editableText, selectionStart, selectionEnd);
        }
    }

    private C1035c.g getInitCallback() {
        if (this.f48936c == null) {
            this.f48936c = new C7670a(this.f48934a);
        }
        return this.f48936c;
    }

    private boolean shouldSkipForDisabledOrNotConfigured() {
        return (this.f48939f && (this.f48935b || C1035c.isConfigured())) ? false : true;
    }

    /* JADX INFO: renamed from: a */
    public int m13569a() {
        return this.f48938e;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    /* JADX INFO: renamed from: b */
    public int m13570b() {
        return this.f48937d;
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    /* JADX INFO: renamed from: d */
    public void m13571d(int i) {
        this.f48938e = i;
    }

    /* JADX INFO: renamed from: e */
    public void m13572e(int i) {
        this.f48937d = i;
    }

    public boolean isEnabled() {
        return this.f48939f;
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (this.f48934a.isInEditMode() || shouldSkipForDisabledOrNotConfigured() || i2 > i3 || !(charSequence instanceof Spannable)) {
            return;
        }
        int loadState = C1035c.get().getLoadState();
        if (loadState != 0) {
            if (loadState == 1) {
                C1035c.get().process((Spannable) charSequence, i, i + i3, this.f48937d, this.f48938e);
                return;
            } else if (loadState != 3) {
                return;
            }
        }
        C1035c.get().registerInitCallback(getInitCallback());
    }

    public void setEnabled(boolean z) {
        if (this.f48939f != z) {
            if (this.f48936c != null) {
                C1035c.get().unregisterInitCallback(this.f48936c);
            }
            this.f48939f = z;
            if (z) {
                m13568c(this.f48934a, C1035c.get().getLoadState());
            }
        }
    }
}
