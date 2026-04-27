package p000;

/* JADX INFO: loaded from: classes7.dex */
@ph5
@yh5
@yjd
public final class sph extends hbd<oph, pph, qph> implements lp8<pph> {

    /* JADX INFO: renamed from: c */
    @yfb
    public static final sph f82568c = new sph();

    private sph() {
        super(hg1.serializer(oph.f68284b));
    }

    @Override // p000.AbstractC10728p0
    public /* bridge */ /* synthetic */ int collectionSize(Object obj) {
        return m22179f(((pph) obj).m31852unboximpl());
    }

    @Override // p000.hbd
    public /* bridge */ /* synthetic */ pph empty() {
        return pph.m31836boximpl(m22180g());
    }

    /* JADX INFO: renamed from: f */
    public int m22179f(@yfb long[] jArr) {
        md8.checkNotNullParameter(jArr, "$this$collectionSize");
        return pph.m31844getSizeimpl(jArr);
    }

    @yfb
    /* JADX INFO: renamed from: g */
    public long[] m22180g() {
        return pph.m31837constructorimpl(0);
    }

    @Override // p000.z72, p000.AbstractC10728p0
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void readElement(@yfb lm2 lm2Var, int i, @yfb qph qphVar, boolean z) {
        md8.checkNotNullParameter(lm2Var, "decoder");
        md8.checkNotNullParameter(qphVar, "builder");
        qphVar.m31984appendVKZWuLQ$kotlinx_serialization_core(oph.m31533constructorimpl(lm2Var.decodeInlineElement(getDescriptor(), i).decodeLong()));
    }

    @yfb
    /* JADX INFO: renamed from: i */
    public qph m22182i(@yfb long[] jArr) {
        md8.checkNotNullParameter(jArr, "$this$toBuilder");
        return new qph(jArr, null);
    }

    /* JADX INFO: renamed from: j */
    public void m22183j(@yfb om2 om2Var, @yfb long[] jArr, int i) {
        md8.checkNotNullParameter(om2Var, "encoder");
        md8.checkNotNullParameter(jArr, "content");
        for (int i2 = 0; i2 < i; i2++) {
            om2Var.encodeInlineElement(getDescriptor(), i2).encodeLong(pph.m31843getsVKNKU(jArr, i2));
        }
    }

    @Override // p000.AbstractC10728p0
    public /* bridge */ /* synthetic */ Object toBuilder(Object obj) {
        return m22182i(((pph) obj).m31852unboximpl());
    }

    @Override // p000.hbd
    public /* bridge */ /* synthetic */ void writeContent(om2 om2Var, pph pphVar, int i) {
        m22183j(om2Var, pphVar.m31852unboximpl(), i);
    }
}
