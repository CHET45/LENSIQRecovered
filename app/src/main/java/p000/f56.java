package p000;

/* JADX INFO: loaded from: classes.dex */
@f0g
public interface f56 extends i2g<Float> {

    /* JADX INFO: renamed from: f56$a */
    public static final class C5599a {
        @em0(preferredPropertyName = "floatValue")
        @yfb
        @Deprecated
        public static Float getValue(@yfb f56 f56Var) {
            return Float.valueOf(f56.access$getValue$jd(f56Var));
        }
    }

    static /* synthetic */ float access$getValue$jd(f56 f56Var) {
        return super.getValue().floatValue();
    }

    float getFloatValue();

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p000.i2g
    @em0(preferredPropertyName = "floatValue")
    @yfb
    default Float getValue() {
        return Float.valueOf(getFloatValue());
    }
}
