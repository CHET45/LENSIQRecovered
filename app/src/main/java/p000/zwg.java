package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.google.android.material.C3146R;
import p000.p7e;

/* JADX INFO: loaded from: classes5.dex */
@p7e({p7e.EnumC10826a.f69935b})
public final class zwg {

    /* JADX INFO: renamed from: b */
    public static final String f106263b = "Theme.AppCompat";

    /* JADX INFO: renamed from: d */
    public static final String f106265d = "Theme.MaterialComponents";

    /* JADX INFO: renamed from: a */
    public static final int[] f106262a = {C3146R.attr.colorPrimary};

    /* JADX INFO: renamed from: c */
    public static final int[] f106264c = {C3146R.attr.colorPrimaryVariant};

    private zwg() {
    }

    public static void checkAppCompatTheme(@efb Context context) {
        checkTheme(context, f106262a, f106263b);
    }

    private static void checkCompatibleTheme(@efb Context context, AttributeSet attributeSet, @gc0 int i, @dbg int i2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3146R.styleable.ThemeEnforcement, i, i2);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(C3146R.styleable.ThemeEnforcement_enforceMaterialTheme, false);
        typedArrayObtainStyledAttributes.recycle();
        if (z) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(C3146R.attr.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                checkMaterialTheme(context);
            }
        }
        checkAppCompatTheme(context);
    }

    public static void checkMaterialTheme(@efb Context context) {
        checkTheme(context, f106264c, f106265d);
    }

    private static void checkTextAppearance(@efb Context context, AttributeSet attributeSet, @efb @ebg int[] iArr, @gc0 int i, @dbg int i2, @hib @ebg int... iArr2) {
        boolean zIsCustomTextAppearanceValid;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3146R.styleable.ThemeEnforcement, i, i2);
        if (!typedArrayObtainStyledAttributes.getBoolean(C3146R.styleable.ThemeEnforcement_enforceTextAppearance, false)) {
            typedArrayObtainStyledAttributes.recycle();
            return;
        }
        if (iArr2 == null || iArr2.length == 0) {
            zIsCustomTextAppearanceValid = typedArrayObtainStyledAttributes.getResourceId(C3146R.styleable.ThemeEnforcement_android_textAppearance, -1) != -1;
        } else {
            zIsCustomTextAppearanceValid = isCustomTextAppearanceValid(context, attributeSet, iArr, i, i2, iArr2);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!zIsCustomTextAppearanceValid) {
            throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        }
    }

    private static void checkTheme(@efb Context context, @efb int[] iArr, String str) {
        if (isTheme(context, iArr)) {
            return;
        }
        throw new IllegalArgumentException("The style on this component requires your app theme to be " + str + " (or a descendant).");
    }

    public static boolean isAppCompatTheme(@efb Context context) {
        return isTheme(context, f106262a);
    }

    private static boolean isCustomTextAppearanceValid(@efb Context context, AttributeSet attributeSet, @efb @ebg int[] iArr, @gc0 int i, @dbg int i2, @efb @ebg int... iArr2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
        for (int i3 : iArr2) {
            if (typedArrayObtainStyledAttributes.getResourceId(i3, -1) == -1) {
                typedArrayObtainStyledAttributes.recycle();
                return false;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return true;
    }

    public static boolean isMaterial3Theme(@efb Context context) {
        return hw9.resolveBoolean(context, C3146R.attr.isMaterial3Theme, false);
    }

    public static boolean isMaterialTheme(@efb Context context) {
        return isTheme(context, f106264c);
    }

    private static boolean isTheme(@efb Context context, @efb int[] iArr) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i = 0; i < iArr.length; i++) {
            if (!typedArrayObtainStyledAttributes.hasValue(i)) {
                typedArrayObtainStyledAttributes.recycle();
                return false;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return true;
    }

    @efb
    public static TypedArray obtainStyledAttributes(@efb Context context, AttributeSet attributeSet, @efb @ebg int[] iArr, @gc0 int i, @dbg int i2, @ebg int... iArr2) {
        checkCompatibleTheme(context, attributeSet, i, i2);
        checkTextAppearance(context, attributeSet, iArr, i, i2, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i, i2);
    }

    public static t2h obtainTintedStyledAttributes(@efb Context context, AttributeSet attributeSet, @efb @ebg int[] iArr, @gc0 int i, @dbg int i2, @ebg int... iArr2) {
        checkCompatibleTheme(context, attributeSet, i, i2);
        checkTextAppearance(context, attributeSet, iArr, i, i2, iArr2);
        return t2h.obtainStyledAttributes(context, attributeSet, iArr, i, i2);
    }
}
