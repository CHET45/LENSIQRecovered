package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import p000.f7e;
import p000.p7e;

/* JADX INFO: loaded from: classes.dex */
@p7e({p7e.EnumC10826a.f69936c})
public class t2h {

    /* JADX INFO: renamed from: a */
    public final Context f83545a;

    /* JADX INFO: renamed from: b */
    public final TypedArray f83546b;

    /* JADX INFO: renamed from: c */
    public TypedValue f83547c;

    /* JADX INFO: renamed from: t2h$a */
    @c5e(21)
    public static class C12879a {
        private C12879a() {
        }

        @ih4
        /* JADX INFO: renamed from: a */
        public static int m22343a(TypedArray typedArray) {
            return typedArray.getChangingConfigurations();
        }

        @ih4
        /* JADX INFO: renamed from: b */
        public static int m22344b(TypedArray typedArray, int i) {
            return typedArray.getType(i);
        }
    }

    private t2h(Context context, TypedArray typedArray) {
        this.f83545a = context;
        this.f83546b = typedArray;
    }

    public static t2h obtainStyledAttributes(Context context, AttributeSet attributeSet, int[] iArr) {
        return new t2h(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public boolean getBoolean(int i, boolean z) {
        return this.f83546b.getBoolean(i, z);
    }

    @c5e(21)
    public int getChangingConfigurations() {
        return C12879a.m22343a(this.f83546b);
    }

    public int getColor(int i, int i2) {
        return this.f83546b.getColor(i, i2);
    }

    public ColorStateList getColorStateList(int i) {
        int resourceId;
        ColorStateList colorStateList;
        return (!this.f83546b.hasValue(i) || (resourceId = this.f83546b.getResourceId(i, 0)) == 0 || (colorStateList = u20.getColorStateList(this.f83545a, resourceId)) == null) ? this.f83546b.getColorStateList(i) : colorStateList;
    }

    public float getDimension(int i, float f) {
        return this.f83546b.getDimension(i, f);
    }

    public int getDimensionPixelOffset(int i, int i2) {
        return this.f83546b.getDimensionPixelOffset(i, i2);
    }

    public int getDimensionPixelSize(int i, int i2) {
        return this.f83546b.getDimensionPixelSize(i, i2);
    }

    public Drawable getDrawable(int i) {
        int resourceId;
        return (!this.f83546b.hasValue(i) || (resourceId = this.f83546b.getResourceId(i, 0)) == 0) ? this.f83546b.getDrawable(i) : u20.getDrawable(this.f83545a, resourceId);
    }

    public Drawable getDrawableIfKnown(int i) {
        int resourceId;
        if (!this.f83546b.hasValue(i) || (resourceId = this.f83546b.getResourceId(i, 0)) == 0) {
            return null;
        }
        return m20.get().m16552b(this.f83545a, resourceId, true);
    }

    public float getFloat(int i, float f) {
        return this.f83546b.getFloat(i, f);
    }

    @hib
    public Typeface getFont(@ebg int i, int i2, @hib f7e.AbstractC5672f abstractC5672f) {
        int resourceId = this.f83546b.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f83547c == null) {
            this.f83547c = new TypedValue();
        }
        return f7e.getFont(this.f83545a, resourceId, this.f83547c, i2, abstractC5672f);
    }

    public float getFraction(int i, int i2, int i3, float f) {
        return this.f83546b.getFraction(i, i2, i3, f);
    }

    public int getIndex(int i) {
        return this.f83546b.getIndex(i);
    }

    public int getIndexCount() {
        return this.f83546b.getIndexCount();
    }

    public int getInt(int i, int i2) {
        return this.f83546b.getInt(i, i2);
    }

    public int getInteger(int i, int i2) {
        return this.f83546b.getInteger(i, i2);
    }

    public int getLayoutDimension(int i, String str) {
        return this.f83546b.getLayoutDimension(i, str);
    }

    public String getNonResourceString(int i) {
        return this.f83546b.getNonResourceString(i);
    }

    public String getPositionDescription() {
        return this.f83546b.getPositionDescription();
    }

    public int getResourceId(int i, int i2) {
        return this.f83546b.getResourceId(i, i2);
    }

    public Resources getResources() {
        return this.f83546b.getResources();
    }

    public String getString(int i) {
        return this.f83546b.getString(i);
    }

    public CharSequence getText(int i) {
        return this.f83546b.getText(i);
    }

    public CharSequence[] getTextArray(int i) {
        return this.f83546b.getTextArray(i);
    }

    public int getType(int i) {
        return C12879a.m22344b(this.f83546b, i);
    }

    public boolean getValue(int i, TypedValue typedValue) {
        return this.f83546b.getValue(i, typedValue);
    }

    public TypedArray getWrappedTypeArray() {
        return this.f83546b;
    }

    public boolean hasValue(int i) {
        return this.f83546b.hasValue(i);
    }

    public int length() {
        return this.f83546b.length();
    }

    public TypedValue peekValue(int i) {
        return this.f83546b.peekValue(i);
    }

    public void recycle() {
        this.f83546b.recycle();
    }

    public static t2h obtainStyledAttributes(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new t2h(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    public int getLayoutDimension(int i, int i2) {
        return this.f83546b.getLayoutDimension(i, i2);
    }

    public static t2h obtainStyledAttributes(Context context, int i, int[] iArr) {
        return new t2h(context, context.obtainStyledAttributes(i, iArr));
    }
}
