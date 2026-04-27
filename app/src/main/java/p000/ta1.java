package p000;

/* JADX INFO: loaded from: classes7.dex */
@yjd
public final class ta1 extends hbd<Boolean, boolean[], qa1> implements lp8<boolean[]> {

    /* JADX INFO: renamed from: c */
    @yfb
    public static final ta1 f84070c = new ta1();

    private ta1() {
        super(hg1.serializer(va1.f90438a));
    }

    @Override // p000.AbstractC10728p0
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public int collectionSize(@yfb boolean[] zArr) {
        md8.checkNotNullParameter(zArr, "<this>");
        return zArr.length;
    }

    @Override // p000.hbd
    @yfb
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public boolean[] empty() {
        return new boolean[0];
    }

    @Override // p000.z72, p000.AbstractC10728p0
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void readElement(@yfb lm2 lm2Var, int i, @yfb qa1 qa1Var, boolean z) {
        md8.checkNotNullParameter(lm2Var, "decoder");
        md8.checkNotNullParameter(qa1Var, "builder");
        qa1Var.append$kotlinx_serialization_core(lm2Var.decodeBooleanElement(getDescriptor(), i));
    }

    @Override // p000.AbstractC10728p0
    @yfb
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public qa1 toBuilder(@yfb boolean[] zArr) {
        md8.checkNotNullParameter(zArr, "<this>");
        return new qa1(zArr);
    }

    @Override // p000.hbd
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void writeContent(@yfb om2 om2Var, @yfb boolean[] zArr, int i) {
        md8.checkNotNullParameter(om2Var, "encoder");
        md8.checkNotNullParameter(zArr, "content");
        for (int i2 = 0; i2 < i; i2++) {
            om2Var.encodeBooleanElement(getDescriptor(), i2, zArr[i2]);
        }
    }
}
