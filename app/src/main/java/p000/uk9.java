package p000;

/* JADX INFO: loaded from: classes7.dex */
@yjd
public final class uk9 extends hbd<Long, long[], qk9> implements lp8<long[]> {

    /* JADX INFO: renamed from: c */
    @yfb
    public static final uk9 f88236c = new uk9();

    private uk9() {
        super(hg1.serializer(wk9.f94509a));
    }

    @Override // p000.AbstractC10728p0
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public int collectionSize(@yfb long[] jArr) {
        md8.checkNotNullParameter(jArr, "<this>");
        return jArr.length;
    }

    @Override // p000.hbd
    @yfb
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public long[] empty() {
        return new long[0];
    }

    @Override // p000.z72, p000.AbstractC10728p0
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void readElement(@yfb lm2 lm2Var, int i, @yfb qk9 qk9Var, boolean z) {
        md8.checkNotNullParameter(lm2Var, "decoder");
        md8.checkNotNullParameter(qk9Var, "builder");
        qk9Var.append$kotlinx_serialization_core(lm2Var.decodeLongElement(getDescriptor(), i));
    }

    @Override // p000.AbstractC10728p0
    @yfb
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public qk9 toBuilder(@yfb long[] jArr) {
        md8.checkNotNullParameter(jArr, "<this>");
        return new qk9(jArr);
    }

    @Override // p000.hbd
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void writeContent(@yfb om2 om2Var, @yfb long[] jArr, int i) {
        md8.checkNotNullParameter(om2Var, "encoder");
        md8.checkNotNullParameter(jArr, "content");
        for (int i2 = 0; i2 < i; i2++) {
            om2Var.encodeLongElement(getDescriptor(), i2, jArr[i2]);
        }
    }
}
