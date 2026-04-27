package p000;

/* JADX INFO: loaded from: classes7.dex */
@yjd
public final class e68 extends hbd<Integer, int[], a68> implements lp8<int[]> {

    /* JADX INFO: renamed from: c */
    @yfb
    public static final e68 f31901c = new e68();

    private e68() {
        super(hg1.serializer(f68.f35480a));
    }

    @Override // p000.AbstractC10728p0
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public int collectionSize(@yfb int[] iArr) {
        md8.checkNotNullParameter(iArr, "<this>");
        return iArr.length;
    }

    @Override // p000.hbd
    @yfb
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public int[] empty() {
        return new int[0];
    }

    @Override // p000.z72, p000.AbstractC10728p0
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void readElement(@yfb lm2 lm2Var, int i, @yfb a68 a68Var, boolean z) {
        md8.checkNotNullParameter(lm2Var, "decoder");
        md8.checkNotNullParameter(a68Var, "builder");
        a68Var.append$kotlinx_serialization_core(lm2Var.decodeIntElement(getDescriptor(), i));
    }

    @Override // p000.AbstractC10728p0
    @yfb
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public a68 toBuilder(@yfb int[] iArr) {
        md8.checkNotNullParameter(iArr, "<this>");
        return new a68(iArr);
    }

    @Override // p000.hbd
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void writeContent(@yfb om2 om2Var, @yfb int[] iArr, int i) {
        md8.checkNotNullParameter(om2Var, "encoder");
        md8.checkNotNullParameter(iArr, "content");
        for (int i2 = 0; i2 < i; i2++) {
            om2Var.encodeIntElement(getDescriptor(), i2, iArr[i2]);
        }
    }
}
