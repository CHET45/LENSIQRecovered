package p000;

/* JADX INFO: loaded from: classes.dex */
@f0g
public interface u4b extends hk4, z6b<Double> {

    /* JADX INFO: renamed from: u4b$a */
    public static final class C13359a {
        @em0(preferredPropertyName = "doubleValue")
        @yfb
        @Deprecated
        public static Double getValue(@yfb u4b u4bVar) {
            return Double.valueOf(u4b.access$getValue$jd(u4bVar));
        }

        @em0(preferredPropertyName = "doubleValue")
        @Deprecated
        public static void setValue(@yfb u4b u4bVar, double d) {
            u4b.super.setValue(d);
        }
    }

    static /* synthetic */ double access$getValue$jd(u4b u4bVar) {
        return super.getValue().doubleValue();
    }

    @Override // p000.hk4
    double getDoubleValue();

    void setDoubleValue(double d);

    @Override // p000.z6b
    /* bridge */ /* synthetic */ default void setValue(Double d) {
        setValue(d.doubleValue());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p000.hk4, p000.i2g
    @em0(preferredPropertyName = "doubleValue")
    @yfb
    default Double getValue() {
        return Double.valueOf(getDoubleValue());
    }

    @em0(preferredPropertyName = "doubleValue")
    default void setValue(double d) {
        setDoubleValue(d);
    }
}
