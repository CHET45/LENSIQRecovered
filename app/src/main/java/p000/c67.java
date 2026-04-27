package p000;

import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
@c5e(21)
public class c67 implements b67 {

    /* JADX INFO: renamed from: C */
    public static boolean f15835C = false;

    /* JADX INFO: renamed from: b */
    public static final String f15836b = "GhostViewApi21";

    /* JADX INFO: renamed from: c */
    public static Class<?> f15837c;

    /* JADX INFO: renamed from: d */
    public static boolean f15838d;

    /* JADX INFO: renamed from: e */
    public static Method f15839e;

    /* JADX INFO: renamed from: f */
    public static boolean f15840f;

    /* JADX INFO: renamed from: m */
    public static Method f15841m;

    /* JADX INFO: renamed from: a */
    public final View f15842a;

    private c67(@efb View view) {
        this.f15842a = view;
    }

    /* JADX INFO: renamed from: a */
    public static b67 m3823a(View view, ViewGroup viewGroup, Matrix matrix) {
        fetchAddGhostMethod();
        Method method = f15839e;
        if (method != null) {
            try {
                return new c67((View) method.invoke(null, view, viewGroup, matrix));
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static void m3824b(View view) {
        fetchRemoveGhostMethod();
        Method method = f15841m;
        if (method != null) {
            try {
                method.invoke(null, view);
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
    }

    private static void fetchAddGhostMethod() {
        if (f15840f) {
            return;
        }
        try {
            fetchGhostViewClass();
            Method declaredMethod = f15837c.getDeclaredMethod("addGhost", View.class, ViewGroup.class, Matrix.class);
            f15839e = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException e) {
            Log.i(f15836b, "Failed to retrieve addGhost method", e);
        }
        f15840f = true;
    }

    private static void fetchGhostViewClass() {
        if (f15838d) {
            return;
        }
        try {
            f15837c = Class.forName("android.view.GhostView");
        } catch (ClassNotFoundException e) {
            Log.i(f15836b, "Failed to retrieve GhostView class", e);
        }
        f15838d = true;
    }

    private static void fetchRemoveGhostMethod() {
        if (f15835C) {
            return;
        }
        try {
            fetchGhostViewClass();
            Method declaredMethod = f15837c.getDeclaredMethod("removeGhost", View.class);
            f15841m = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException e) {
            Log.i(f15836b, "Failed to retrieve removeGhost method", e);
        }
        f15835C = true;
    }

    @Override // p000.b67
    public void reserveEndViewTransition(ViewGroup viewGroup, View view) {
    }

    @Override // p000.b67
    public void setVisibility(int i) {
        this.f15842a.setVisibility(i);
    }
}
