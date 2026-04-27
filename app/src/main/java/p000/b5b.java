package p000;

/* JADX INFO: loaded from: classes.dex */
@f0g
public interface b5b extends f56, z6b<Float> {

    /* JADX INFO: renamed from: b5b$a */
    public static final class C1742a {
        @em0(preferredPropertyName = "floatValue")
        @yfb
        @Deprecated
        public static Float getValue(@yfb b5b b5bVar) {
            return Float.valueOf(b5b.access$getValue$jd(b5bVar));
        }

        @em0(preferredPropertyName = "floatValue")
        @Deprecated
        public static void setValue(@yfb b5b b5bVar, float f) {
            b5b.super.setValue(f);
        }
    }

    static /* synthetic */ float access$getValue$jd(b5b b5bVar) {
        return super.getValue().floatValue();
    }

    @Override // p000.f56
    float getFloatValue();

    void setFloatValue(float f);

    @Override // p000.z6b
    /* bridge */ /* synthetic */ default void setValue(Float f) {
        setValue(f.floatValue());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p000.f56, p000.i2g
    @em0(preferredPropertyName = "floatValue")
    @yfb
    default Float getValue() {
        return Float.valueOf(getFloatValue());
    }

    @em0(preferredPropertyName = "floatValue")
    default void setValue(float f) {
        setFloatValue(f);
    }
}
