package p000;

import android.content.Context;

/* JADX INFO: loaded from: classes8.dex */
public class o49 {

    /* JADX INFO: renamed from: a */
    public static final String f66443a = "pl_droidsonroids_gif";

    /* JADX INFO: renamed from: b */
    @igg({"StaticFieldLeak"})
    public static Context f66444b;

    private o49() {
    }

    /* JADX INFO: renamed from: a */
    public static void m18344a() {
        try {
            System.loadLibrary(f66443a);
        } catch (UnsatisfiedLinkError unused) {
            nqd.loadLibrary(getContext(), f66443a);
        }
    }

    private static Context getContext() {
        if (f66444b == null) {
            try {
                f66444b = (Context) Class.forName("android.app.ActivityThread").getDeclaredMethod("currentApplication", null).invoke(null, null);
            } catch (Exception e) {
                throw new IllegalStateException("LibraryLoader not initialized. Call LibraryLoader.initialize() before using library classes.", e);
            }
        }
        return f66444b;
    }

    public static void initialize(@efb Context context) {
        f66444b = context.getApplicationContext();
    }
}
