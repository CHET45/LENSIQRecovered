package p000;

/* JADX INFO: loaded from: classes.dex */
@f0g
public interface w78 extends i2g<Integer> {

    /* JADX INFO: renamed from: w78$a */
    public static final class C14450a {
        @em0(preferredPropertyName = "intValue")
        @yfb
        @Deprecated
        public static Integer getValue(@yfb w78 w78Var) {
            return Integer.valueOf(w78.access$getValue$jd(w78Var));
        }
    }

    static /* synthetic */ int access$getValue$jd(w78 w78Var) {
        return super.getValue().intValue();
    }

    int getIntValue();

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p000.i2g
    @em0(preferredPropertyName = "intValue")
    @yfb
    default Integer getValue() {
        return Integer.valueOf(getIntValue());
    }
}
