package p000;

/* JADX INFO: loaded from: classes7.dex */
@yjd
public final class saf extends hbd<Short, short[], raf> implements lp8<short[]> {

    /* JADX INFO: renamed from: c */
    @yfb
    public static final saf f81063c = new saf();

    private saf() {
        super(hg1.serializer(taf.f84093a));
    }

    @Override // p000.AbstractC10728p0
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public int collectionSize(@yfb short[] sArr) {
        md8.checkNotNullParameter(sArr, "<this>");
        return sArr.length;
    }

    @Override // p000.hbd
    @yfb
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public short[] empty() {
        return new short[0];
    }

    @Override // p000.z72, p000.AbstractC10728p0
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void readElement(@yfb lm2 lm2Var, int i, @yfb raf rafVar, boolean z) {
        md8.checkNotNullParameter(lm2Var, "decoder");
        md8.checkNotNullParameter(rafVar, "builder");
        rafVar.append$kotlinx_serialization_core(lm2Var.decodeShortElement(getDescriptor(), i));
    }

    @Override // p000.AbstractC10728p0
    @yfb
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public raf toBuilder(@yfb short[] sArr) {
        md8.checkNotNullParameter(sArr, "<this>");
        return new raf(sArr);
    }

    @Override // p000.hbd
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void writeContent(@yfb om2 om2Var, @yfb short[] sArr, int i) {
        md8.checkNotNullParameter(om2Var, "encoder");
        md8.checkNotNullParameter(sArr, "content");
        for (int i2 = 0; i2 < i; i2++) {
            om2Var.encodeShortElement(getDescriptor(), i2, sArr[i2]);
        }
    }
}
