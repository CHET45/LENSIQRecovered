package p000;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public abstract class n2f {
    public /* synthetic */ n2f(jt3 jt3Var) {
        this();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ lp8 getContextual$default(n2f n2fVar, oo8 oo8Var, List list, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getContextual");
        }
        if ((i & 2) != 0) {
            list = l82.emptyList();
        }
        return n2fVar.getContextual(oo8Var, list);
    }

    @nb8
    /* JADX INFO: renamed from: getHasInterfaceContextualSerializers$kotlinx_serialization_core$annotations */
    public static /* synthetic */ void m17743x1cdd5e9f() {
    }

    @ph5
    public abstract void dumpTo(@yfb r2f r2fVar);

    @ph5
    @q64(level = u64.f86867c, message = "Deprecated in favor of overload with default parameter", replaceWith = @i2e(expression = "getContextual(kclass)", imports = {}))
    public final /* synthetic */ lp8 getContextual(oo8 oo8Var) {
        md8.checkNotNullParameter(oo8Var, "kclass");
        return getContextual(oo8Var, l82.emptyList());
    }

    @gib
    @ph5
    public abstract <T> lp8<T> getContextual(@yfb oo8<T> oo8Var, @yfb List<? extends lp8<?>> list);

    public abstract boolean getHasInterfaceContextualSerializers$kotlinx_serialization_core();

    @gib
    @ph5
    public abstract <T> e1f<T> getPolymorphic(@yfb oo8<? super T> oo8Var, @yfb T t);

    @gib
    @ph5
    public abstract <T> t74<T> getPolymorphic(@yfb oo8<? super T> oo8Var, @gib String str);

    private n2f() {
    }
}
