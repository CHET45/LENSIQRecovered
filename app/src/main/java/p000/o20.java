package p000;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.appcompat.C0392R;

/* JADX INFO: loaded from: classes.dex */
public class o20 {

    /* JADX INFO: renamed from: a */
    @efb
    public final TextView f66263a;

    /* JADX INFO: renamed from: b */
    @efb
    public final hz4 f66264b;

    public o20(@efb TextView textView) {
        this.f66263a = textView;
        this.f66264b = new hz4(textView, false);
    }

    @efb
    /* JADX INFO: renamed from: a */
    public InputFilter[] m18273a(@efb InputFilter[] inputFilterArr) {
        return this.f66264b.getFilters(inputFilterArr);
    }

    /* JADX INFO: renamed from: b */
    public void m18274b(@hib AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = this.f66263a.getContext().obtainStyledAttributes(attributeSet, C0392R.styleable.AppCompatTextView, i, 0);
        try {
            boolean z = typedArrayObtainStyledAttributes.hasValue(C0392R.styleable.AppCompatTextView_emojiCompatEnabled) ? typedArrayObtainStyledAttributes.getBoolean(C0392R.styleable.AppCompatTextView_emojiCompatEnabled, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            m18276d(z);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    public void m18275c(boolean z) {
        this.f66264b.setAllCaps(z);
    }

    /* JADX INFO: renamed from: d */
    public void m18276d(boolean z) {
        this.f66264b.setEnabled(z);
    }

    public boolean isEnabled() {
        return this.f66264b.isEnabled();
    }

    @hib
    public TransformationMethod wrapTransformationMethod(@hib TransformationMethod transformationMethod) {
        return this.f66264b.wrapTransformationMethod(transformationMethod);
    }
}
