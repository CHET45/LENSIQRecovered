package p000;

import android.content.Context;

/* JADX INFO: loaded from: classes7.dex */
public class iy2 {

    /* JADX INFO: renamed from: a */
    public static Context f48852a;

    public static Context getAppContext() {
        Context context = f48852a;
        if (context != null) {
            return context;
        }
        throw new IllegalStateException("MyLibrary not initialized. Call initialize() first.");
    }

    public static void initialize(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("Context cannot be null");
        }
        Context applicationContext = context.getApplicationContext();
        f48852a = applicationContext;
        l3h.init(applicationContext);
    }
}
