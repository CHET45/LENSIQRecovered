package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class kl8 extends bk8 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kl8(@yfb hk8 hk8Var, @yfb n2f n2fVar) {
        super(hk8Var, n2fVar, null);
        md8.checkNotNullParameter(hk8Var, "configuration");
        md8.checkNotNullParameter(n2fVar, "module");
        validateConfiguration();
    }

    private final void validateConfiguration() {
        if (md8.areEqual(getSerializersModule(), p2f.EmptySerializersModule())) {
            return;
        }
        getSerializersModule().dumpTo(new f4d(getConfiguration().getUseArrayPolymorphism(), getConfiguration().getClassDiscriminator()));
    }
}
