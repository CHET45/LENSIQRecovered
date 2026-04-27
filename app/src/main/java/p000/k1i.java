package p000;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public class k1i {

    /* JADX INFO: renamed from: a */
    public static Context f52396a;

    /* JADX INFO: renamed from: b */
    public static boolean f52397b;

    public static Context getAppContext() {
        Context context = f52396a;
        if (context != null) {
            return context;
        }
        throw new IllegalStateException("MyLibrary not initialized. Call initialize() first.");
    }

    public static boolean getProductFlavors() {
        return f52397b;
    }

    public static void initialize(Context context, boolean isGp) {
        if (context == null) {
            throw new IllegalArgumentException("Context cannot be null");
        }
        f52396a = context.getApplicationContext();
        f52397b = isGp;
    }
}
