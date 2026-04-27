package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.TextView;
import com.google.android.material.C3146R;

/* JADX INFO: loaded from: classes5.dex */
public final class hn1 {

    /* JADX INFO: renamed from: a */
    @efb
    public final Rect f44149a;

    /* JADX INFO: renamed from: b */
    public final ColorStateList f44150b;

    /* JADX INFO: renamed from: c */
    public final ColorStateList f44151c;

    /* JADX INFO: renamed from: d */
    public final ColorStateList f44152d;

    /* JADX INFO: renamed from: e */
    public final int f44153e;

    /* JADX INFO: renamed from: f */
    public final n8f f44154f;

    private hn1(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i, n8f n8fVar, @efb Rect rect) {
        z7d.checkArgumentNonnegative(rect.left);
        z7d.checkArgumentNonnegative(rect.top);
        z7d.checkArgumentNonnegative(rect.right);
        z7d.checkArgumentNonnegative(rect.bottom);
        this.f44149a = rect;
        this.f44150b = colorStateList2;
        this.f44151c = colorStateList;
        this.f44152d = colorStateList3;
        this.f44153e = i;
        this.f44154f = n8fVar;
    }

    @efb
    /* JADX INFO: renamed from: a */
    public static hn1 m12496a(@efb Context context, @dbg int i) {
        z7d.checkArgument(i != 0, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, C3146R.styleable.MaterialCalendarItem);
        Rect rect = new Rect(typedArrayObtainStyledAttributes.getDimensionPixelOffset(C3146R.styleable.MaterialCalendarItem_android_insetLeft, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(C3146R.styleable.MaterialCalendarItem_android_insetTop, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(C3146R.styleable.MaterialCalendarItem_android_insetRight, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(C3146R.styleable.MaterialCalendarItem_android_insetBottom, 0));
        ColorStateList colorStateList = a3a.getColorStateList(context, typedArrayObtainStyledAttributes, C3146R.styleable.MaterialCalendarItem_itemFillColor);
        ColorStateList colorStateList2 = a3a.getColorStateList(context, typedArrayObtainStyledAttributes, C3146R.styleable.MaterialCalendarItem_itemTextColor);
        ColorStateList colorStateList3 = a3a.getColorStateList(context, typedArrayObtainStyledAttributes, C3146R.styleable.MaterialCalendarItem_itemStrokeColor);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(C3146R.styleable.MaterialCalendarItem_itemStrokeWidth, 0);
        n8f n8fVarBuild = n8f.builder(context, typedArrayObtainStyledAttributes.getResourceId(C3146R.styleable.MaterialCalendarItem_itemShapeAppearance, 0), typedArrayObtainStyledAttributes.getResourceId(C3146R.styleable.MaterialCalendarItem_itemShapeAppearanceOverlay, 0)).build();
        typedArrayObtainStyledAttributes.recycle();
        return new hn1(colorStateList, colorStateList2, colorStateList3, dimensionPixelSize, n8fVarBuild, rect);
    }

    /* JADX INFO: renamed from: b */
    public int m12497b() {
        return this.f44149a.bottom;
    }

    /* JADX INFO: renamed from: c */
    public int m12498c() {
        return this.f44149a.left;
    }

    /* JADX INFO: renamed from: d */
    public int m12499d() {
        return this.f44149a.right;
    }

    /* JADX INFO: renamed from: e */
    public int m12500e() {
        return this.f44149a.top;
    }

    /* JADX INFO: renamed from: f */
    public void m12501f(@efb TextView textView) {
        m12502g(textView, null);
    }

    /* JADX INFO: renamed from: g */
    public void m12502g(@efb TextView textView, @hib ColorStateList colorStateList) {
        b3a b3aVar = new b3a();
        b3a b3aVar2 = new b3a();
        b3aVar.setShapeAppearanceModel(this.f44154f);
        b3aVar2.setShapeAppearanceModel(this.f44154f);
        if (colorStateList == null) {
            colorStateList = this.f44151c;
        }
        b3aVar.setFillColor(colorStateList);
        b3aVar.setStroke(this.f44153e, this.f44152d);
        textView.setTextColor(this.f44150b);
        RippleDrawable rippleDrawable = new RippleDrawable(this.f44150b.withAlpha(30), b3aVar, b3aVar2);
        Rect rect = this.f44149a;
        o8i.setBackground(textView, new InsetDrawable((Drawable) rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
    }
}
