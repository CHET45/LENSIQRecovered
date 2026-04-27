package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class aih {
    @jl8
    public static final <T> T readJson(@yfb bk8 bk8Var, @yfb sk8 sk8Var, @yfb t74<? extends T> t74Var) {
        jl3 gm8Var;
        md8.checkNotNullParameter(bk8Var, "json");
        md8.checkNotNullParameter(sk8Var, "element");
        md8.checkNotNullParameter(t74Var, "deserializer");
        if (sk8Var instanceof am8) {
            gm8Var = new qm8(bk8Var, (am8) sk8Var, null, null, 12, null);
        } else if (sk8Var instanceof ck8) {
            gm8Var = new sm8(bk8Var, (ck8) sk8Var);
        } else {
            if (!(sk8Var instanceof ql8) && !md8.areEqual(sk8Var, xl8.INSTANCE)) {
                throw new ceb();
            }
            gm8Var = new gm8(bk8Var, (fm8) sk8Var, null, 4, null);
        }
        return (T) gm8Var.decodeSerializableValue(t74Var);
    }

    public static final <T> T readPolymorphicJson(@yfb bk8 bk8Var, @yfb String str, @yfb am8 am8Var, @yfb t74<? extends T> t74Var) {
        md8.checkNotNullParameter(bk8Var, "<this>");
        md8.checkNotNullParameter(str, "discriminator");
        md8.checkNotNullParameter(am8Var, "element");
        md8.checkNotNullParameter(t74Var, "deserializer");
        return (T) new qm8(bk8Var, am8Var, str, t74Var.getDescriptor()).decodeSerializableValue(t74Var);
    }
}
