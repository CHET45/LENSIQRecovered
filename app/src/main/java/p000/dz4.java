package p000;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;
import androidx.emoji2.text.C1035c;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@c5e(19)
@p7e({p7e.EnumC10826a.f69934a})
public final class dz4 implements InputFilter {

    /* JADX INFO: renamed from: a */
    public final TextView f31349a;

    /* JADX INFO: renamed from: b */
    public C1035c.g f31350b;

    /* JADX INFO: renamed from: dz4$a */
    @c5e(19)
    public static class C5022a extends C1035c.g {

        /* JADX INFO: renamed from: a */
        public final Reference<TextView> f31351a;

        /* JADX INFO: renamed from: b */
        public final Reference<dz4> f31352b;

        public C5022a(TextView textView, dz4 dz4Var) {
            this.f31351a = new WeakReference(textView);
            this.f31352b = new WeakReference(dz4Var);
        }

        private boolean isInputFilterCurrentlyRegisteredOnTextView(@hib TextView textView, @hib InputFilter inputFilter) {
            InputFilter[] filters;
            if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
                return false;
            }
            for (InputFilter inputFilter2 : filters) {
                if (inputFilter2 == inputFilter) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.emoji2.text.C1035c.g
        public void onInitialized() {
            CharSequence text;
            CharSequence charSequenceProcess;
            super.onInitialized();
            TextView textView = this.f31351a.get();
            if (isInputFilterCurrentlyRegisteredOnTextView(textView, this.f31352b.get()) && textView.isAttachedToWindow() && text != (charSequenceProcess = C1035c.get().process((text = textView.getText())))) {
                int selectionStart = Selection.getSelectionStart(charSequenceProcess);
                int selectionEnd = Selection.getSelectionEnd(charSequenceProcess);
                textView.setText(charSequenceProcess);
                if (charSequenceProcess instanceof Spannable) {
                    dz4.m9597a((Spannable) charSequenceProcess, selectionStart, selectionEnd);
                }
            }
        }
    }

    public dz4(@efb TextView textView) {
        this.f31349a = textView;
    }

    /* JADX INFO: renamed from: a */
    public static void m9597a(Spannable spannable, int i, int i2) {
        if (i >= 0 && i2 >= 0) {
            Selection.setSelection(spannable, i, i2);
        } else if (i >= 0) {
            Selection.setSelection(spannable, i);
        } else if (i2 >= 0) {
            Selection.setSelection(spannable, i2);
        }
    }

    private C1035c.g getInitCallback() {
        if (this.f31350b == null) {
            this.f31350b = new C5022a(this.f31349a, this);
        }
        return this.f31350b;
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        if (this.f31349a.isInEditMode()) {
            return charSequence;
        }
        int loadState = C1035c.get().getLoadState();
        if (loadState != 0) {
            if (loadState == 1) {
                if ((i4 == 0 && i3 == 0 && spanned.length() == 0 && charSequence == this.f31349a.getText()) || charSequence == null) {
                    return charSequence;
                }
                if (i != 0 || i2 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i, i2);
                }
                return C1035c.get().process(charSequence, 0, charSequence.length());
            }
            if (loadState != 3) {
                return charSequence;
            }
        }
        C1035c.get().registerInitCallback(getInitCallback());
        return charSequence;
    }
}
