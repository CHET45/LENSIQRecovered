package p000;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.C3146R;

/* JADX INFO: loaded from: classes5.dex */
public class g3a {

    /* JADX INFO: renamed from: a */
    public static final int[] f38330a = {R.attr.theme, C3146R.attr.theme};

    /* JADX INFO: renamed from: b */
    public static final int[] f38331b = {C3146R.attr.materialThemeOverlay};

    private g3a() {
    }

    @dbg
    private static int obtainAndroidThemeOverlayId(@efb Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f38330a);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId != 0 ? resourceId : resourceId2;
    }

    @dbg
    private static int obtainMaterialThemeOverlayId(@efb Context context, @hib AttributeSet attributeSet, @gc0 int i, @dbg int i2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f38331b, i, i2);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    @efb
    public static Context wrap(@efb Context context, @hib AttributeSet attributeSet, @gc0 int i, @dbg int i2) {
        int iObtainMaterialThemeOverlayId = obtainMaterialThemeOverlayId(context, attributeSet, i, i2);
        boolean z = (context instanceof hy2) && ((hy2) context).getThemeResId() == iObtainMaterialThemeOverlayId;
        if (iObtainMaterialThemeOverlayId == 0 || z) {
            return context;
        }
        hy2 hy2Var = new hy2(context, iObtainMaterialThemeOverlayId);
        int iObtainAndroidThemeOverlayId = obtainAndroidThemeOverlayId(context, attributeSet);
        if (iObtainAndroidThemeOverlayId != 0) {
            hy2Var.getTheme().applyStyle(iObtainAndroidThemeOverlayId, true);
        }
        return hy2Var;
    }
}
