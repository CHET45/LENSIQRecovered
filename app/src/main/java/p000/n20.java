package p000;

import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.appcompat.C0392R;

/* JADX INFO: loaded from: classes.dex */
public class n20 {

    /* JADX INFO: renamed from: a */
    @efb
    public final EditText f63029a;

    /* JADX INFO: renamed from: b */
    @efb
    public final yy4 f63030b;

    public n20(@efb EditText editText) {
        this.f63029a = editText;
        this.f63030b = new yy4(editText, false);
    }

    @hib
    /* JADX INFO: renamed from: a */
    public KeyListener m17723a(@hib KeyListener keyListener) {
        return m17724b(keyListener) ? this.f63030b.getKeyListener(keyListener) : keyListener;
    }

    /* JADX INFO: renamed from: b */
    public boolean m17724b(KeyListener keyListener) {
        return !(keyListener instanceof NumberKeyListener);
    }

    /* JADX INFO: renamed from: c */
    public boolean m17725c() {
        return this.f63030b.isEnabled();
    }

    /* JADX INFO: renamed from: d */
    public void m17726d(@hib AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = this.f63029a.getContext().obtainStyledAttributes(attributeSet, C0392R.styleable.AppCompatTextView, i, 0);
        try {
            boolean z = typedArrayObtainStyledAttributes.hasValue(C0392R.styleable.AppCompatTextView_emojiCompatEnabled) ? typedArrayObtainStyledAttributes.getBoolean(C0392R.styleable.AppCompatTextView_emojiCompatEnabled, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            m17728f(z);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    @hib
    /* JADX INFO: renamed from: e */
    public InputConnection m17727e(@hib InputConnection inputConnection, @efb EditorInfo editorInfo) {
        return this.f63030b.onCreateInputConnection(inputConnection, editorInfo);
    }

    /* JADX INFO: renamed from: f */
    public void m17728f(boolean z) {
        this.f63030b.setEnabled(z);
    }
}
