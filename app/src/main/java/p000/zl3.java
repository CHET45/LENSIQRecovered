package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class zl3 {
    @gib
    public static final <T> T decodeIfNullable(@yfb jl3 jl3Var, @yfb t74<? extends T> t74Var, @yfb ny6<? extends T> ny6Var) {
        md8.checkNotNullParameter(jl3Var, "<this>");
        md8.checkNotNullParameter(t74Var, "deserializer");
        md8.checkNotNullParameter(ny6Var, "block");
        return (t74Var.getDescriptor().isNullable() || jl3Var.decodeNotNullMark()) ? ny6Var.invoke() : (T) jl3Var.decodeNull();
    }

    public static final <T> T decodeStructure(@yfb jl3 jl3Var, @yfb f0f f0fVar, @yfb qy6<? super lm2, ? extends T> qy6Var) {
        md8.checkNotNullParameter(jl3Var, "<this>");
        md8.checkNotNullParameter(f0fVar, "descriptor");
        md8.checkNotNullParameter(qy6Var, "block");
        lm2 lm2VarBeginStructure = jl3Var.beginStructure(f0fVar);
        T tInvoke = qy6Var.invoke(lm2VarBeginStructure);
        lm2VarBeginStructure.endStructure(f0fVar);
        return tInvoke;
    }
}
