package p000;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes3.dex */
public final class vv8 {

    /* JADX INFO: renamed from: a */
    public static final String f92371a = "LayoutInflaterCompatHC";

    /* JADX INFO: renamed from: b */
    public static Field f92372b;

    /* JADX INFO: renamed from: c */
    public static boolean f92373c;

    /* JADX INFO: renamed from: vv8$a */
    public static class LayoutInflaterFactory2C14274a implements LayoutInflater.Factory2 {

        /* JADX INFO: renamed from: a */
        public final wv8 f92374a;

        public LayoutInflaterFactory2C14274a(wv8 wv8Var) {
            this.f92374a = wv8Var;
        }

        @Override // android.view.LayoutInflater.Factory
        public View onCreateView(String str, Context context, AttributeSet attributeSet) {
            return this.f92374a.onCreateView(null, str, context, attributeSet);
        }

        @efb
        public String toString() {
            return getClass().getName() + "{" + this.f92374a + "}";
        }

        @Override // android.view.LayoutInflater.Factory2
        public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
            return this.f92374a.onCreateView(view, str, context, attributeSet);
        }
    }

    private vv8() {
    }

    private static void forceSetFactory2(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
        if (!f92373c) {
            try {
                Field declaredField = LayoutInflater.class.getDeclaredField("mFactory2");
                f92372b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e(f92371a, "forceSetFactory2 Could not find field 'mFactory2' on class " + LayoutInflater.class.getName() + "; inflation may have unexpected results.", e);
            }
            f92373c = true;
        }
        Field field = f92372b;
        if (field != null) {
            try {
                field.set(layoutInflater, factory2);
            } catch (IllegalAccessException e2) {
                Log.e(f92371a, "forceSetFactory2 could not set the Factory2 on LayoutInflater " + layoutInflater + "; inflation may have unexpected results.", e2);
            }
        }
    }

    @Deprecated
    public static wv8 getFactory(LayoutInflater layoutInflater) {
        LayoutInflater.Factory factory = layoutInflater.getFactory();
        if (factory instanceof LayoutInflaterFactory2C14274a) {
            return ((LayoutInflaterFactory2C14274a) factory).f92374a;
        }
        return null;
    }

    @Deprecated
    public static void setFactory(@efb LayoutInflater layoutInflater, @efb wv8 wv8Var) {
        layoutInflater.setFactory2(new LayoutInflaterFactory2C14274a(wv8Var));
    }

    public static void setFactory2(@efb LayoutInflater layoutInflater, @efb LayoutInflater.Factory2 factory2) {
        layoutInflater.setFactory2(factory2);
    }
}
