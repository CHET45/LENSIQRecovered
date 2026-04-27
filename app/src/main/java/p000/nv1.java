package p000;

/* JADX INFO: loaded from: classes7.dex */
@yjd
public final class nv1 extends hbd<Character, char[], jv1> implements lp8<char[]> {

    /* JADX INFO: renamed from: c */
    @yfb
    public static final nv1 f65776c = new nv1();

    private nv1() {
        super(hg1.serializer(rv1.f79707a));
    }

    @Override // p000.AbstractC10728p0
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public int collectionSize(@yfb char[] cArr) {
        md8.checkNotNullParameter(cArr, "<this>");
        return cArr.length;
    }

    @Override // p000.hbd
    @yfb
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public char[] empty() {
        return new char[0];
    }

    @Override // p000.z72, p000.AbstractC10728p0
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void readElement(@yfb lm2 lm2Var, int i, @yfb jv1 jv1Var, boolean z) {
        md8.checkNotNullParameter(lm2Var, "decoder");
        md8.checkNotNullParameter(jv1Var, "builder");
        jv1Var.append$kotlinx_serialization_core(lm2Var.decodeCharElement(getDescriptor(), i));
    }

    @Override // p000.AbstractC10728p0
    @yfb
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public jv1 toBuilder(@yfb char[] cArr) {
        md8.checkNotNullParameter(cArr, "<this>");
        return new jv1(cArr);
    }

    @Override // p000.hbd
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void writeContent(@yfb om2 om2Var, @yfb char[] cArr, int i) {
        md8.checkNotNullParameter(om2Var, "encoder");
        md8.checkNotNullParameter(cArr, "content");
        for (int i2 = 0; i2 < i; i2++) {
            om2Var.encodeCharElement(getDescriptor(), i2, cArr[i2]);
        }
    }
}
