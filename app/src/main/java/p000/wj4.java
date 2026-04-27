package p000;

/* JADX INFO: loaded from: classes7.dex */
@yjd
public final class wj4 extends hbd<Double, double[], tj4> implements lp8<double[]> {

    /* JADX INFO: renamed from: c */
    @yfb
    public static final wj4 f94408c = new wj4();

    private wj4() {
        super(hg1.serializer(ak4.f1791a));
    }

    @Override // p000.AbstractC10728p0
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public int collectionSize(@yfb double[] dArr) {
        md8.checkNotNullParameter(dArr, "<this>");
        return dArr.length;
    }

    @Override // p000.hbd
    @yfb
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public double[] empty() {
        return new double[0];
    }

    @Override // p000.z72, p000.AbstractC10728p0
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void readElement(@yfb lm2 lm2Var, int i, @yfb tj4 tj4Var, boolean z) {
        md8.checkNotNullParameter(lm2Var, "decoder");
        md8.checkNotNullParameter(tj4Var, "builder");
        tj4Var.append$kotlinx_serialization_core(lm2Var.decodeDoubleElement(getDescriptor(), i));
    }

    @Override // p000.AbstractC10728p0
    @yfb
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public tj4 toBuilder(@yfb double[] dArr) {
        md8.checkNotNullParameter(dArr, "<this>");
        return new tj4(dArr);
    }

    @Override // p000.hbd
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void writeContent(@yfb om2 om2Var, @yfb double[] dArr, int i) {
        md8.checkNotNullParameter(om2Var, "encoder");
        md8.checkNotNullParameter(dArr, "content");
        for (int i2 = 0; i2 < i; i2++) {
            om2Var.encodeDoubleElement(getDescriptor(), i2, dArr[i2]);
        }
    }
}
