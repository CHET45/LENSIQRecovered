package p000;

/* JADX INFO: loaded from: classes7.dex */
@ph5
@yh5
@yjd
public final class koh extends hbd<goh, hoh, ioh> implements lp8<hoh> {

    /* JADX INFO: renamed from: c */
    @yfb
    public static final koh f54879c = new koh();

    private koh() {
        super(hg1.serializer(goh.f40684b));
    }

    @Override // p000.AbstractC10728p0
    public /* bridge */ /* synthetic */ int collectionSize(Object obj) {
        return m14882f(((hoh) obj).m30097unboximpl());
    }

    @Override // p000.hbd
    public /* bridge */ /* synthetic */ hoh empty() {
        return hoh.m30081boximpl(m14883g());
    }

    /* JADX INFO: renamed from: f */
    public int m14882f(@yfb byte[] bArr) {
        md8.checkNotNullParameter(bArr, "$this$collectionSize");
        return hoh.m30089getSizeimpl(bArr);
    }

    @yfb
    /* JADX INFO: renamed from: g */
    public byte[] m14883g() {
        return hoh.m30082constructorimpl(0);
    }

    @Override // p000.z72, p000.AbstractC10728p0
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void readElement(@yfb lm2 lm2Var, int i, @yfb ioh iohVar, boolean z) {
        md8.checkNotNullParameter(lm2Var, "decoder");
        md8.checkNotNullParameter(iohVar, "builder");
        iohVar.m30214append7apg3OU$kotlinx_serialization_core(goh.m29786constructorimpl(lm2Var.decodeInlineElement(getDescriptor(), i).decodeByte()));
    }

    @yfb
    /* JADX INFO: renamed from: i */
    public ioh m14885i(@yfb byte[] bArr) {
        md8.checkNotNullParameter(bArr, "$this$toBuilder");
        return new ioh(bArr, null);
    }

    /* JADX INFO: renamed from: j */
    public void m14886j(@yfb om2 om2Var, @yfb byte[] bArr, int i) {
        md8.checkNotNullParameter(om2Var, "encoder");
        md8.checkNotNullParameter(bArr, "content");
        for (int i2 = 0; i2 < i; i2++) {
            om2Var.encodeInlineElement(getDescriptor(), i2).encodeByte(hoh.m30088getw2LRezQ(bArr, i2));
        }
    }

    @Override // p000.AbstractC10728p0
    public /* bridge */ /* synthetic */ Object toBuilder(Object obj) {
        return m14885i(((hoh) obj).m30097unboximpl());
    }

    @Override // p000.hbd
    public /* bridge */ /* synthetic */ void writeContent(om2 om2Var, hoh hohVar, int i) {
        m14886j(om2Var, hohVar.m30097unboximpl(), i);
    }
}
