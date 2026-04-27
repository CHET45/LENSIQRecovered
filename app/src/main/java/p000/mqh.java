package p000;

/* JADX INFO: loaded from: classes7.dex */
@ph5
@yh5
@yjd
public final class mqh extends hbd<iqh, jqh, kqh> implements lp8<jqh> {

    /* JADX INFO: renamed from: c */
    @yfb
    public static final mqh f61774c = new mqh();

    private mqh() {
        super(hg1.serializer(iqh.f48005b));
    }

    @Override // p000.AbstractC10728p0
    public /* bridge */ /* synthetic */ int collectionSize(Object obj) {
        return m17518f(((jqh) obj).m30560unboximpl());
    }

    @Override // p000.hbd
    public /* bridge */ /* synthetic */ jqh empty() {
        return jqh.m30544boximpl(m17519g());
    }

    /* JADX INFO: renamed from: f */
    public int m17518f(@yfb short[] sArr) {
        md8.checkNotNullParameter(sArr, "$this$collectionSize");
        return jqh.m30552getSizeimpl(sArr);
    }

    @yfb
    /* JADX INFO: renamed from: g */
    public short[] m17519g() {
        return jqh.m30545constructorimpl(0);
    }

    @Override // p000.z72, p000.AbstractC10728p0
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void readElement(@yfb lm2 lm2Var, int i, @yfb kqh kqhVar, boolean z) {
        md8.checkNotNullParameter(lm2Var, "decoder");
        md8.checkNotNullParameter(kqhVar, "builder");
        kqhVar.m30742appendxj2QHRw$kotlinx_serialization_core(iqh.m30324constructorimpl(lm2Var.decodeInlineElement(getDescriptor(), i).decodeShort()));
    }

    @yfb
    /* JADX INFO: renamed from: i */
    public kqh m17521i(@yfb short[] sArr) {
        md8.checkNotNullParameter(sArr, "$this$toBuilder");
        return new kqh(sArr, null);
    }

    /* JADX INFO: renamed from: j */
    public void m17522j(@yfb om2 om2Var, @yfb short[] sArr, int i) {
        md8.checkNotNullParameter(om2Var, "encoder");
        md8.checkNotNullParameter(sArr, "content");
        for (int i2 = 0; i2 < i; i2++) {
            om2Var.encodeInlineElement(getDescriptor(), i2).encodeShort(jqh.m30551getMh2AYeg(sArr, i2));
        }
    }

    @Override // p000.AbstractC10728p0
    public /* bridge */ /* synthetic */ Object toBuilder(Object obj) {
        return m17521i(((jqh) obj).m30560unboximpl());
    }

    @Override // p000.hbd
    public /* bridge */ /* synthetic */ void writeContent(om2 om2Var, jqh jqhVar, int i) {
        m17522j(om2Var, jqhVar.m30560unboximpl(), i);
    }
}
