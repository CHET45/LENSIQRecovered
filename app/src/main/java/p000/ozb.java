package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nOffsetMappingCalculator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OffsetMappingCalculator.kt\nandroidx/compose/foundation/text/input/internal/OffsetMappingCalculator\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 OffsetMappingCalculator.kt\nandroidx/compose/foundation/text/input/internal/OpArray\n*L\n1#1,416:1\n1#2:417\n390#3,21:418\n*S KotlinDebug\n*F\n+ 1 OffsetMappingCalculator.kt\nandroidx/compose/foundation/text/input/internal/OffsetMappingCalculator\n*L\n298#1:418,21\n*E\n"})
@e0g(parameters = 0)
public final class ozb {

    /* JADX INFO: renamed from: c */
    public static final int f69279c = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public int[] f69280a = m5c.m30950constructorimpl(10);

    /* JADX INFO: renamed from: b */
    public int f69281b;

    /* JADX INFO: renamed from: map-fzxv0v0, reason: not valid java name */
    private final long m31702mapfzxv0v0(int i, boolean z) {
        int i2;
        int[] iArr = this.f69280a;
        int i3 = this.f69281b;
        if (i3 < 0) {
            i2 = i;
        } else if (z) {
            int i4 = 0;
            int iMin = i;
            while (i4 < i3) {
                int i5 = i4 * 3;
                int i6 = iArr[i5];
                int i7 = iArr[i5 + 1];
                int i8 = iArr[i5 + 2];
                long jM31703mapStepC6uMEY = m31703mapStepC6uMEY(iMin, i6, i7, i8, z);
                long jM31703mapStepC6uMEY2 = m31703mapStepC6uMEY(i, i6, i7, i8, z);
                i4++;
                iMin = Math.min(jvg.m30593getStartimpl(jM31703mapStepC6uMEY), jvg.m30593getStartimpl(jM31703mapStepC6uMEY2));
                i = Math.max(jvg.m30588getEndimpl(jM31703mapStepC6uMEY), jvg.m30588getEndimpl(jM31703mapStepC6uMEY2));
            }
            i2 = i;
            i = iMin;
        } else {
            int i9 = i3 - 1;
            int iMin2 = i;
            while (-1 < i9) {
                int i10 = i9 * 3;
                int i11 = iArr[i10];
                int i12 = iArr[i10 + 1];
                int i13 = iArr[i10 + 2];
                long jM31703mapStepC6uMEY3 = m31703mapStepC6uMEY(iMin2, i11, i12, i13, z);
                long jM31703mapStepC6uMEY4 = m31703mapStepC6uMEY(i, i11, i12, i13, z);
                i9--;
                iMin2 = Math.min(jvg.m30593getStartimpl(jM31703mapStepC6uMEY3), jvg.m30593getStartimpl(jM31703mapStepC6uMEY4));
                i = Math.max(jvg.m30588getEndimpl(jM31703mapStepC6uMEY3), jvg.m30588getEndimpl(jM31703mapStepC6uMEY4));
            }
            i2 = i;
            i = iMin2;
        }
        return kvg.TextRange(i, i2);
    }

    /* JADX INFO: renamed from: mapStep-C6u-MEY, reason: not valid java name */
    private final long m31703mapStepC6uMEY(int i, int i2, int i3, int i4, boolean z) {
        int i5 = z ? i3 : i4;
        if (z) {
            i3 = i4;
        }
        return i < i2 ? kvg.TextRange(i) : i == i2 ? i5 == 0 ? kvg.TextRange(i2, i3 + i2) : kvg.TextRange(i2) : i < i2 + i5 ? i3 == 0 ? kvg.TextRange(i2) : kvg.TextRange(i2, i3 + i2) : kvg.TextRange((i - i5) + i3);
    }

    /* JADX INFO: renamed from: mapFromDest--jx7JFs, reason: not valid java name */
    public final long m31704mapFromDestjx7JFs(int i) {
        return m31702mapfzxv0v0(i, false);
    }

    /* JADX INFO: renamed from: mapFromSource--jx7JFs, reason: not valid java name */
    public final long m31705mapFromSourcejx7JFs(int i) {
        return m31702mapfzxv0v0(i, true);
    }

    public final void recordEditOperation(int i, int i2, int i3) {
        if (i3 < 0) {
            throw new IllegalArgumentException(("Expected newLen to be ≥ 0, was " + i3).toString());
        }
        int iMin = Math.min(i, i2);
        int iMax = Math.max(iMin, i2) - iMin;
        if (iMax >= 2 || iMax != i3) {
            int i4 = this.f69281b + 1;
            if (i4 > m5c.m30957getSizeimpl(this.f69280a)) {
                this.f69280a = m5c.m30952copyOfpSmdads(this.f69280a, Math.max(i4 * 2, m5c.m30957getSizeimpl(this.f69280a) * 2));
            }
            m5c.m30959setimpl(this.f69280a, this.f69281b, iMin, iMax, i3);
            this.f69281b = i4;
        }
    }
}
