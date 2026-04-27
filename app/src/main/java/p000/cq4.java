package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes3.dex */
public final class cq4 {

    /* JADX INFO: renamed from: a */
    public static volatile boolean f26778a = true;

    private cq4() {
    }

    public static Drawable getDrawable(Context context, Context context2, @gq4 int i) {
        return getDrawable(context, context2, i, null);
    }

    private static Drawable loadDrawableV4(Context context, @gq4 int i, @hib Resources.Theme theme) {
        return f7e.getDrawable(context.getResources(), i, theme);
    }

    private static Drawable loadDrawableV7(Context context, @gq4 int i, @hib Resources.Theme theme) {
        if (theme != null) {
            context = new hy2(context, theme);
        }
        return u20.getDrawable(context, i);
    }

    public static Drawable getDrawable(Context context, @gq4 int i, @hib Resources.Theme theme) {
        return getDrawable(context, context, i, theme);
    }

    private static Drawable getDrawable(Context context, Context context2, @gq4 int i, @hib Resources.Theme theme) {
        try {
            if (f26778a) {
                return loadDrawableV7(context2, i, theme);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (IllegalStateException e) {
            if (!context.getPackageName().equals(context2.getPackageName())) {
                return lx2.getDrawable(context2, i);
            }
            throw e;
        } catch (NoClassDefFoundError unused2) {
            f26778a = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        return loadDrawableV4(context2, i, theme);
    }
}
