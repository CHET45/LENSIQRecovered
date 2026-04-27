package p000;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import androidx.emoji2.text.C1035c;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@c5e(19)
@p7e({p7e.EnumC10826a.f69934a})
public class jz4 implements TransformationMethod {

    /* JADX INFO: renamed from: a */
    @hib
    public final TransformationMethod f52277a;

    public jz4(@hib TransformationMethod transformationMethod) {
        this.f52277a = transformationMethod;
    }

    public TransformationMethod getOriginalTransformationMethod() {
        return this.f52277a;
    }

    @Override // android.text.method.TransformationMethod
    public CharSequence getTransformation(@hib CharSequence charSequence, @efb View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f52277a;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        return (charSequence == null || C1035c.get().getLoadState() != 1) ? charSequence : C1035c.get().process(charSequence);
    }

    @Override // android.text.method.TransformationMethod
    public void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
        TransformationMethod transformationMethod = this.f52277a;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z, i, rect);
        }
    }
}
