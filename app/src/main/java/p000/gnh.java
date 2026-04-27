package p000;

import android.content.Context;
import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p000.p7e;

/* JADX INFO: loaded from: classes.dex */
@c5e(28)
@p7e({p7e.EnumC10826a.f69936c})
public class gnh extends fnh {

    /* JADX INFO: renamed from: B */
    public static final String f40372B = "createFromFamiliesWithDefault";

    /* JADX INFO: renamed from: C */
    public static final int f40373C = -1;

    /* JADX INFO: renamed from: D */
    public static final String f40374D = "sans-serif";

    @Override // p000.fnh, p000.cnh, p000.inh
    @efb
    /* JADX INFO: renamed from: c */
    public Typeface mo4095c(@efb Context context, @efb Typeface typeface, int i, boolean z) {
        return Typeface.create(typeface, i, z);
    }

    @Override // p000.fnh
    public Typeface createFromFamiliesWithDefault(Object obj) {
        try {
            Object objNewInstance = Array.newInstance(this.f37197m, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f37203s.invoke(null, objNewInstance, "sans-serif", -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // p000.fnh
    /* JADX INFO: renamed from: i */
    public Method mo11002i(Class<?> cls) throws NoSuchMethodException {
        Class<?> cls2 = Array.newInstance(cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, String.class, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
