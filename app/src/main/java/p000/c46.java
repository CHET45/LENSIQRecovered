package p000;

/* JADX INFO: loaded from: classes7.dex */
@yjd
public final class c46 extends hbd<Float, float[], y36> implements lp8<float[]> {

    /* JADX INFO: renamed from: c */
    @yfb
    public static final c46 f15757c = new c46();

    private c46() {
        super(hg1.serializer(d46.f28382a));
    }

    @Override // p000.AbstractC10728p0
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public int collectionSize(@yfb float[] fArr) {
        md8.checkNotNullParameter(fArr, "<this>");
        return fArr.length;
    }

    @Override // p000.hbd
    @yfb
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public float[] empty() {
        return new float[0];
    }

    @Override // p000.z72, p000.AbstractC10728p0
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void readElement(@yfb lm2 lm2Var, int i, @yfb y36 y36Var, boolean z) {
        md8.checkNotNullParameter(lm2Var, "decoder");
        md8.checkNotNullParameter(y36Var, "builder");
        y36Var.append$kotlinx_serialization_core(lm2Var.decodeFloatElement(getDescriptor(), i));
    }

    @Override // p000.AbstractC10728p0
    @yfb
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public y36 toBuilder(@yfb float[] fArr) {
        md8.checkNotNullParameter(fArr, "<this>");
        return new y36(fArr);
    }

    @Override // p000.hbd
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void writeContent(@yfb om2 om2Var, @yfb float[] fArr, int i) {
        md8.checkNotNullParameter(om2Var, "encoder");
        md8.checkNotNullParameter(fArr, "content");
        for (int i2 = 0; i2 < i; i2++) {
            om2Var.encodeFloatElement(getDescriptor(), i2, fArr[i2]);
        }
    }
}
