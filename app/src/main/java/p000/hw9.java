package p000;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import com.google.android.material.C3146R;
import p000.p7e;

/* JADX INFO: loaded from: classes5.dex */
@p7e({p7e.EnumC10826a.f69935b})
public class hw9 {
    @hib
    public static TypedValue resolve(@efb Context context, @gc0 int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean resolveBoolean(@efb Context context, @gc0 int i, boolean z) {
        TypedValue typedValueResolve = resolve(context, i);
        return (typedValueResolve == null || typedValueResolve.type != 18) ? z : typedValueResolve.data != 0;
    }

    public static boolean resolveBooleanOrThrow(@efb Context context, @gc0 int i, @efb String str) {
        return resolveOrThrow(context, i, str) != 0;
    }

    @fkd
    public static int resolveDimension(@efb Context context, @gc0 int i, @xc4 int i2) {
        TypedValue typedValueResolve = resolve(context, i);
        return (int) ((typedValueResolve == null || typedValueResolve.type != 5) ? context.getResources().getDimension(i2) : typedValueResolve.getDimension(context.getResources().getDisplayMetrics()));
    }

    public static int resolveInteger(@efb Context context, @gc0 int i, int i2) {
        TypedValue typedValueResolve = resolve(context, i);
        return (typedValueResolve == null || typedValueResolve.type != 16) ? i2 : typedValueResolve.data;
    }

    @fkd
    public static int resolveMinimumAccessibleTouchTarget(@efb Context context) {
        return resolveDimension(context, C3146R.attr.minTouchTargetSize, C3146R.dimen.mtrl_min_touch_target_size);
    }

    public static int resolveOrThrow(@efb Context context, @gc0 int i, @efb String str) {
        return resolveTypedValueOrThrow(context, i, str).data;
    }

    @efb
    public static TypedValue resolveTypedValueOrThrow(@efb View view, @gc0 int i) {
        return resolveTypedValueOrThrow(view.getContext(), i, view.getClass().getCanonicalName());
    }

    public static int resolveOrThrow(@efb View view, @gc0 int i) {
        return resolveTypedValueOrThrow(view, i).data;
    }

    @efb
    public static TypedValue resolveTypedValueOrThrow(@efb Context context, @gc0 int i, @efb String str) {
        TypedValue typedValueResolve = resolve(context, i);
        if (typedValueResolve != null) {
            return typedValueResolve;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i)));
    }
}
