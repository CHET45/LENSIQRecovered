package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* JADX INFO: loaded from: classes.dex */
public final class ox2 {
    public static final /* synthetic */ <T> T getSystemService(Context context) {
        md8.reifiedOperationMarker(4, "T");
        return (T) lx2.getSystemService(context, Object.class);
    }

    public static final void withStyledAttributes(@yfb Context context, @gib AttributeSet attributeSet, @yfb int[] iArr, @gc0 int i, @dbg int i2, @yfb qy6<? super TypedArray, bth> qy6Var) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
        qy6Var.invoke(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static /* synthetic */ void withStyledAttributes$default(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, qy6 qy6Var, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            attributeSet = null;
        }
        if ((i3 & 4) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
        qy6Var.invoke(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static final void withStyledAttributes(@yfb Context context, @dbg int i, @yfb int[] iArr, @yfb qy6<? super TypedArray, bth> qy6Var) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, iArr);
        qy6Var.invoke(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
    }
}
