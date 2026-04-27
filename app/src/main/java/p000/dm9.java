package p000;

/* JADX INFO: loaded from: classes.dex */
@f0g
public interface dm9 extends i2g<Long> {

    /* JADX INFO: renamed from: dm9$a */
    public static final class C4863a {
        @em0(preferredPropertyName = "longValue")
        @yfb
        @Deprecated
        public static Long getValue(@yfb dm9 dm9Var) {
            return Long.valueOf(dm9.access$getValue$jd(dm9Var));
        }
    }

    static /* synthetic */ long access$getValue$jd(dm9 dm9Var) {
        return super.getValue().longValue();
    }

    long getLongValue();

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p000.i2g
    @em0(preferredPropertyName = "longValue")
    @yfb
    default Long getValue() {
        return Long.valueOf(getLongValue());
    }
}
