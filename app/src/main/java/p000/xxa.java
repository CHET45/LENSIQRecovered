package p000;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nDebugMetadata.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugMetadata.kt\nkotlin/coroutines/jvm/internal/ModuleNameRetriever\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,134:1\n1#2:135\n*E\n"})
public final class xxa {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final xxa f99633a = new xxa();

    /* JADX INFO: renamed from: b */
    @yfb
    public static final C15344a f99634b = new C15344a(null, null, null);

    /* JADX INFO: renamed from: c */
    @gib
    public static C15344a f99635c;

    /* JADX INFO: renamed from: xxa$a */
    public static final class C15344a {

        /* JADX INFO: renamed from: a */
        @gib
        @un8
        public final Method f99636a;

        /* JADX INFO: renamed from: b */
        @gib
        @un8
        public final Method f99637b;

        /* JADX INFO: renamed from: c */
        @gib
        @un8
        public final Method f99638c;

        public C15344a(@gib Method method, @gib Method method2, @gib Method method3) {
            this.f99636a = method;
            this.f99637b = method2;
            this.f99638c = method3;
        }
    }

    private xxa() {
    }

    private final C15344a buildCache(tq0 tq0Var) {
        try {
            C15344a c15344a = new C15344a(Class.class.getDeclaredMethod("getModule", null), tq0Var.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), tq0Var.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
            f99635c = c15344a;
            return c15344a;
        } catch (Exception unused) {
            C15344a c15344a2 = f99634b;
            f99635c = c15344a2;
            return c15344a2;
        }
    }

    @gib
    public final String getModuleName(@yfb tq0 tq0Var) {
        Method method;
        Object objInvoke;
        Method method2;
        Object objInvoke2;
        md8.checkNotNullParameter(tq0Var, "continuation");
        C15344a c15344aBuildCache = f99635c;
        if (c15344aBuildCache == null) {
            c15344aBuildCache = buildCache(tq0Var);
        }
        if (c15344aBuildCache == f99634b || (method = c15344aBuildCache.f99636a) == null || (objInvoke = method.invoke(tq0Var.getClass(), null)) == null || (method2 = c15344aBuildCache.f99637b) == null || (objInvoke2 = method2.invoke(objInvoke, null)) == null) {
            return null;
        }
        Method method3 = c15344aBuildCache.f99638c;
        Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, null) : null;
        if (objInvoke3 instanceof String) {
            return (String) objInvoke3;
        }
        return null;
    }
}
