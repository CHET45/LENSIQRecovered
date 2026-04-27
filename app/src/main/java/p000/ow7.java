package p000;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.AbstractC1143j;
import androidx.lifecycle.InterfaceC1154n;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
@c5e(19)
public final class ow7 implements InterfaceC1154n {

    /* JADX INFO: renamed from: C */
    public static Field f69016C = null;

    /* JADX INFO: renamed from: b */
    public static final int f69017b = 0;

    /* JADX INFO: renamed from: c */
    public static final int f69018c = 1;

    /* JADX INFO: renamed from: d */
    public static final int f69019d = 2;

    /* JADX INFO: renamed from: e */
    public static int f69020e;

    /* JADX INFO: renamed from: f */
    public static Field f69021f;

    /* JADX INFO: renamed from: m */
    public static Field f69022m;

    /* JADX INFO: renamed from: a */
    public Activity f69023a;

    public ow7(Activity activity) {
        this.f69023a = activity;
    }

    @igg({"SoonBlockedPrivateApi"})
    @ir9
    private static void initializeReflectiveFields() {
        try {
            f69020e = 2;
            Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
            f69022m = declaredField;
            declaredField.setAccessible(true);
            Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
            f69016C = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
            f69021f = declaredField3;
            declaredField3.setAccessible(true);
            f69020e = 1;
        } catch (NoSuchFieldException unused) {
        }
    }

    @Override // androidx.lifecycle.InterfaceC1154n
    public void onStateChanged(@efb g59 g59Var, @efb AbstractC1143j.a aVar) {
        if (aVar != AbstractC1143j.a.ON_DESTROY) {
            return;
        }
        if (f69020e == 0) {
            initializeReflectiveFields();
        }
        if (f69020e == 1) {
            InputMethodManager inputMethodManager = (InputMethodManager) this.f69023a.getSystemService("input_method");
            try {
                Object obj = f69021f.get(inputMethodManager);
                if (obj == null) {
                    return;
                }
                synchronized (obj) {
                    try {
                        try {
                            try {
                                View view = (View) f69022m.get(inputMethodManager);
                                if (view == null) {
                                    return;
                                }
                                if (view.isAttachedToWindow()) {
                                    return;
                                }
                                try {
                                    f69016C.set(inputMethodManager, null);
                                    inputMethodManager.isActive();
                                } catch (IllegalAccessException unused) {
                                }
                            } catch (IllegalAccessException unused2) {
                            }
                        } catch (ClassCastException unused3) {
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (IllegalAccessException unused4) {
            }
        }
    }
}
