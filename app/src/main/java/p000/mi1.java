package p000;

/* JADX INFO: loaded from: classes7.dex */
@yjd
public final class mi1 extends hbd<Byte, byte[], ai1> implements lp8<byte[]> {

    /* JADX INFO: renamed from: c */
    @yfb
    public static final mi1 f61052c = new mi1();

    private mi1() {
        super(hg1.serializer(kj1.f54244a));
    }

    @Override // p000.AbstractC10728p0
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public int collectionSize(@yfb byte[] bArr) {
        md8.checkNotNullParameter(bArr, "<this>");
        return bArr.length;
    }

    @Override // p000.hbd
    @yfb
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public byte[] empty() {
        return new byte[0];
    }

    @Override // p000.z72, p000.AbstractC10728p0
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void readElement(@yfb lm2 lm2Var, int i, @yfb ai1 ai1Var, boolean z) {
        md8.checkNotNullParameter(lm2Var, "decoder");
        md8.checkNotNullParameter(ai1Var, "builder");
        ai1Var.append$kotlinx_serialization_core(lm2Var.decodeByteElement(getDescriptor(), i));
    }

    @Override // p000.AbstractC10728p0
    @yfb
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public ai1 toBuilder(@yfb byte[] bArr) {
        md8.checkNotNullParameter(bArr, "<this>");
        return new ai1(bArr);
    }

    @Override // p000.hbd
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void writeContent(@yfb om2 om2Var, @yfb byte[] bArr, int i) {
        md8.checkNotNullParameter(om2Var, "encoder");
        md8.checkNotNullParameter(bArr, "content");
        for (int i2 = 0; i2 < i; i2++) {
            om2Var.encodeByteElement(getDescriptor(), i2, bArr[i2]);
        }
    }
}
