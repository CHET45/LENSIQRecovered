package p000;

/* JADX INFO: loaded from: classes.dex */
@f0g
public interface hk4 extends i2g<Double> {

    /* JADX INFO: renamed from: hk4$a */
    public static final class C6878a {
        @em0(preferredPropertyName = "doubleValue")
        @yfb
        @Deprecated
        public static Double getValue(@yfb hk4 hk4Var) {
            return Double.valueOf(hk4.access$getValue$jd(hk4Var));
        }
    }

    static /* synthetic */ double access$getValue$jd(hk4 hk4Var) {
        return super.getValue().doubleValue();
    }

    double getDoubleValue();

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p000.i2g
    @em0(preferredPropertyName = "doubleValue")
    @yfb
    default Double getValue() {
        return Double.valueOf(getDoubleValue());
    }
}
