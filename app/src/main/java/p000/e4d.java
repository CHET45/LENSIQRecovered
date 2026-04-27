package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class e4d {
    @nb8
    @yfb
    public static final <T> t74<T> findPolymorphicSerializer(@yfb AbstractC12880t3<T> abstractC12880t3, @yfb lm2 lm2Var, @gib String str) {
        md8.checkNotNullParameter(abstractC12880t3, "<this>");
        md8.checkNotNullParameter(lm2Var, "decoder");
        t74<T> t74VarFindPolymorphicSerializerOrNull = abstractC12880t3.findPolymorphicSerializerOrNull(lm2Var, str);
        if (t74VarFindPolymorphicSerializerOrNull != null) {
            return t74VarFindPolymorphicSerializerOrNull;
        }
        C13341u3.throwSubtypeNotRegistered(str, (oo8<?>) abstractC12880t3.getBaseClass());
        throw new us8();
    }

    @nb8
    @yfb
    public static final <T> e1f<T> findPolymorphicSerializer(@yfb AbstractC12880t3<T> abstractC12880t3, @yfb m15 m15Var, @yfb T t) {
        md8.checkNotNullParameter(abstractC12880t3, "<this>");
        md8.checkNotNullParameter(m15Var, "encoder");
        md8.checkNotNullParameter(t, "value");
        e1f<T> e1fVarFindPolymorphicSerializerOrNull = abstractC12880t3.findPolymorphicSerializerOrNull(m15Var, t);
        if (e1fVarFindPolymorphicSerializerOrNull != null) {
            return e1fVarFindPolymorphicSerializerOrNull;
        }
        C13341u3.throwSubtypeNotRegistered((oo8<?>) vvd.getOrCreateKotlinClass(t.getClass()), (oo8<?>) abstractC12880t3.getBaseClass());
        throw new us8();
    }
}
