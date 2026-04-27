package p000;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.os.Build;
import android.view.ContextThemeWrapper;
import com.google.android.material.C3146R;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class rg7 {

    /* JADX INFO: renamed from: a */
    public static final String f78227a = "rg7";

    private rg7() {
    }

    @c5e(api = 30)
    private static void addHarmonizedColorAttributesToReplacementMap(@efb Map<Integer, Integer> map, @efb TypedArray typedArray, @hib TypedArray typedArray2, @g92 int i) {
        if (typedArray2 == null) {
            typedArray2 = typedArray;
        }
        for (int i2 = 0; i2 < typedArray.getIndexCount(); i2++) {
            int resourceId = typedArray2.getResourceId(i2, 0);
            if (resourceId != 0 && typedArray.hasValue(i2) && l7e.m15961b(typedArray.getType(i2))) {
                map.put(Integer.valueOf(resourceId), Integer.valueOf(ow9.harmonize(typedArray.getColor(i2, 0), i)));
            }
        }
    }

    @efb
    public static void applyToContextIfAvailable(@efb Context context, @efb sg7 sg7Var) {
        if (isHarmonizedColorAvailable()) {
            Map<Integer, Integer> mapCreateHarmonizedColorReplacementMap = createHarmonizedColorReplacementMap(context, sg7Var);
            int iM21953a = sg7Var.m21953a(0);
            if (!l7e.m15960a(context, mapCreateHarmonizedColorReplacementMap) || iM21953a == 0) {
                return;
            }
            fxg.m11228a(context, iM21953a);
        }
    }

    @c5e(api = 30)
    private static Map<Integer, Integer> createHarmonizedColorReplacementMap(Context context, sg7 sg7Var) {
        HashMap map = new HashMap();
        int color = ow9.getColor(context, sg7Var.getColorAttributeToHarmonizeWith(), f78227a);
        for (int i : sg7Var.getColorResourceIds()) {
            map.put(Integer.valueOf(i), Integer.valueOf(ow9.harmonize(lx2.getColor(context, i), color)));
        }
        qg7 colorAttributes = sg7Var.getColorAttributes();
        if (colorAttributes != null) {
            int[] attributes = colorAttributes.getAttributes();
            if (attributes.length > 0) {
                int themeOverlay = colorAttributes.getThemeOverlay();
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributes);
                TypedArray typedArrayObtainStyledAttributes2 = themeOverlay != 0 ? new ContextThemeWrapper(context, themeOverlay).obtainStyledAttributes(attributes) : null;
                addHarmonizedColorAttributesToReplacementMap(map, typedArrayObtainStyledAttributes, typedArrayObtainStyledAttributes2, color);
                typedArrayObtainStyledAttributes.recycle();
                if (typedArrayObtainStyledAttributes2 != null) {
                    typedArrayObtainStyledAttributes2.recycle();
                }
            }
        }
        return map;
    }

    @sy1(api = 30)
    public static boolean isHarmonizedColorAvailable() {
        return Build.VERSION.SDK_INT >= 30;
    }

    @efb
    public static Context wrapContextIfAvailable(@efb Context context, @efb sg7 sg7Var) {
        if (!isHarmonizedColorAvailable()) {
            return context;
        }
        Map<Integer, Integer> mapCreateHarmonizedColorReplacementMap = createHarmonizedColorReplacementMap(context, sg7Var);
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, sg7Var.m21953a(C3146R.style.ThemeOverlay_Material3_HarmonizedColors_Empty));
        contextThemeWrapper.applyOverrideConfiguration(new Configuration());
        return l7e.m15960a(contextThemeWrapper, mapCreateHarmonizedColorReplacementMap) ? contextThemeWrapper : context;
    }
}
