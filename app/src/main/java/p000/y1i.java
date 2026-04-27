package p000;

/* JADX INFO: loaded from: classes.dex */
public final class y1i {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final nzb f100098a = new x1i(nzb.f66113a.getIdentity(), 0, 0);

    @yfb
    public static final ieh filterWithValidation(@yfb kdi kdiVar, @yfb C9041lz c9041lz) {
        ieh iehVarFilter = kdiVar.filter(c9041lz);
        throwIfNotValidTransform$default(iehVarFilter, c9041lz.length(), 0, 2, null);
        return new ieh(iehVarFilter.getText(), new x1i(iehVarFilter.getOffsetMapping(), c9041lz.length(), iehVarFilter.getText().length()));
    }

    @yfb
    public static final nzb getValidatingEmptyOffsetMappingIdentity() {
        return f100098a;
    }

    @hdi
    public static final void throwIfNotValidTransform(@yfb ieh iehVar, int i, int i2) {
        int length = iehVar.getText().length();
        int iMin = Math.min(i, i2);
        for (int i3 = 0; i3 < iMin; i3++) {
            validateOriginalToTransformed(iehVar.getOffsetMapping().originalToTransformed(i3), length, i3);
        }
        validateOriginalToTransformed(iehVar.getOffsetMapping().originalToTransformed(i), length, i);
        int iMin2 = Math.min(length, i2);
        for (int i4 = 0; i4 < iMin2; i4++) {
            validateTransformedToOriginal(iehVar.getOffsetMapping().transformedToOriginal(i4), i, i4);
        }
        validateTransformedToOriginal(iehVar.getOffsetMapping().transformedToOriginal(length), i, length);
    }

    public static /* synthetic */ void throwIfNotValidTransform$default(ieh iehVar, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 100;
        }
        throwIfNotValidTransform(iehVar, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void validateOriginalToTransformed(int i, int i2, int i3) {
        if (i < 0 || i > i2) {
            throw new IllegalStateException(("OffsetMapping.originalToTransformed returned invalid mapping: " + i3 + " -> " + i + " is not in range of transformed text [0, " + i2 + C4584d2.f28243l).toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void validateTransformedToOriginal(int i, int i2, int i3) {
        if (i < 0 || i > i2) {
            throw new IllegalStateException(("OffsetMapping.transformedToOriginal returned invalid mapping: " + i3 + " -> " + i + " is not in range of original text [0, " + i2 + C4584d2.f28243l).toString());
        }
    }
}
