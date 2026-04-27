package p000;

/* JADX INFO: loaded from: classes7.dex */
@ph5
@yh5
@yjd
public final class iph extends hbd<woh, fph, gph> implements lp8<fph> {

    /* JADX INFO: renamed from: c */
    @yfb
    public static final iph f47864c = new iph();

    private iph() {
        super(hg1.serializer(woh.f94997b));
    }

    @Override // p000.AbstractC10728p0
    public /* bridge */ /* synthetic */ int collectionSize(Object obj) {
        return m13259f(((fph) obj).m29599unboximpl());
    }

    @Override // p000.hbd
    public /* bridge */ /* synthetic */ fph empty() {
        return fph.m29583boximpl(m13260g());
    }

    /* JADX INFO: renamed from: f */
    public int m13259f(@yfb int[] iArr) {
        md8.checkNotNullParameter(iArr, "$this$collectionSize");
        return fph.m29591getSizeimpl(iArr);
    }

    @yfb
    /* JADX INFO: renamed from: g */
    public int[] m13260g() {
        return fph.m29584constructorimpl(0);
    }

    @Override // p000.z72, p000.AbstractC10728p0
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void readElement(@yfb lm2 lm2Var, int i, @yfb gph gphVar, boolean z) {
        md8.checkNotNullParameter(lm2Var, "decoder");
        md8.checkNotNullParameter(gphVar, "builder");
        gphVar.m29853appendWZ4Q5Ns$kotlinx_serialization_core(woh.m33004constructorimpl(lm2Var.decodeInlineElement(getDescriptor(), i).decodeInt()));
    }

    @yfb
    /* JADX INFO: renamed from: i */
    public gph m13262i(@yfb int[] iArr) {
        md8.checkNotNullParameter(iArr, "$this$toBuilder");
        return new gph(iArr, null);
    }

    /* JADX INFO: renamed from: j */
    public void m13263j(@yfb om2 om2Var, @yfb int[] iArr, int i) {
        md8.checkNotNullParameter(om2Var, "encoder");
        md8.checkNotNullParameter(iArr, "content");
        for (int i2 = 0; i2 < i; i2++) {
            om2Var.encodeInlineElement(getDescriptor(), i2).encodeInt(fph.m29590getpVg5ArA(iArr, i2));
        }
    }

    @Override // p000.AbstractC10728p0
    public /* bridge */ /* synthetic */ Object toBuilder(Object obj) {
        return m13262i(((fph) obj).m29599unboximpl());
    }

    @Override // p000.hbd
    public /* bridge */ /* synthetic */ void writeContent(om2 om2Var, fph fphVar, int i) {
        m13263j(om2Var, fphVar.m29599unboximpl(), i);
    }
}
