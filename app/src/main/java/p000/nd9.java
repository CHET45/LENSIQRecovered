package p000;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import p000.v7e;

/* JADX INFO: loaded from: classes3.dex */
@dwf({"SMAP\nLocalLifecycleOwner.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalLifecycleOwner.android.kt\nandroidx/lifecycle/compose/LocalLifecycleOwnerKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,66:1\n18987#2,2:67\n*S KotlinDebug\n*F\n+ 1 LocalLifecycleOwner.android.kt\nandroidx/lifecycle/compose/LocalLifecycleOwnerKt\n*L\n49#1:67,2\n*E\n"})
@xn8(name = "LocalLifecycleOwnerKt")
public final class nd9 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final zhd<g59> f64060a;

    /* JADX INFO: renamed from: nd9$a */
    public static final class C9793a extends tt8 implements ny6<g59> {

        /* JADX INFO: renamed from: a */
        public static final C9793a f64061a = new C9793a();

        public C9793a() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p000.ny6
        @yfb
        public final g59 invoke() {
            throw new IllegalStateException("CompositionLocal LocalLifecycleOwner not present");
        }
    }

    static {
        Object objM32723constructorimpl;
        zhd zhdVar;
        try {
            v7e.C13927a c13927a = v7e.f90266b;
            ClassLoader classLoader = g59.class.getClassLoader();
            md8.checkNotNull(classLoader);
            Method method = classLoader.loadClass("androidx.compose.ui.platform.AndroidCompositionLocals_androidKt").getMethod("getLocalLifecycleOwner", null);
            Annotation[] annotations = method.getAnnotations();
            int length = annotations.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    Object objInvoke = method.invoke(null, null);
                    if (objInvoke instanceof zhd) {
                        zhdVar = (zhd) objInvoke;
                    }
                } else if (annotations[i] instanceof q64) {
                    break;
                } else {
                    i++;
                }
            }
            zhdVar = null;
            objM32723constructorimpl = v7e.m32723constructorimpl(zhdVar);
        } catch (Throwable th) {
            v7e.C13927a c13927a2 = v7e.f90266b;
            objM32723constructorimpl = v7e.m32723constructorimpl(y7e.createFailure(th));
        }
        zhd<g59> zhdVarStaticCompositionLocalOf = (zhd) (v7e.m32729isFailureimpl(objM32723constructorimpl) ? null : objM32723constructorimpl);
        if (zhdVarStaticCompositionLocalOf == null) {
            zhdVarStaticCompositionLocalOf = pn2.staticCompositionLocalOf(C9793a.f64061a);
        }
        f64060a = zhdVarStaticCompositionLocalOf;
    }

    @yfb
    public static final zhd<g59> getLocalLifecycleOwner() {
        return f64060a;
    }

    public static /* synthetic */ void getLocalLifecycleOwner$annotations() {
    }
}
