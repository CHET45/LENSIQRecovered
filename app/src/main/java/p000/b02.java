package p000;

import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;

/* JADX INFO: loaded from: classes6.dex */
public class b02 extends StateListDrawable {
    public b02(int i, int i2) {
        this(i, i2, 0, 0, 0, 0);
    }

    public b02(int i, int i2, int i3, int i4, int i5, int i6) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(dq4.m9295a(i3, i4, i5, i6));
        shapeDrawable.getPaint().setColor(i2);
        ShapeDrawable shapeDrawable2 = new ShapeDrawable(dq4.m9295a(i3, i4, i5, i6));
        shapeDrawable2.getPaint().setColor(i);
        addState(new int[]{16842919}, shapeDrawable);
        addState(new int[]{-16842919}, shapeDrawable2);
    }
}
