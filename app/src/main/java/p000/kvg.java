package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nTextRange.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextRange.kt\nandroidx/compose/ui/text/TextRangeKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,129:1\n100#2:130\n*S KotlinDebug\n*F\n+ 1 TextRange.kt\nandroidx/compose/ui/text/TextRangeKt\n*L\n127#1:130\n*E\n"})
public final class kvg {
    public static final long TextRange(int i, int i2) {
        return jvg.m30582constructorimpl(packWithCheck(i, i2));
    }

    /* JADX INFO: renamed from: coerceIn-8ffj60Q, reason: not valid java name */
    public static final long m30778coerceIn8ffj60Q(long j, int i, int i2) {
        int iCoerceIn = kpd.coerceIn(jvg.m30593getStartimpl(j), i, i2);
        int iCoerceIn2 = kpd.coerceIn(jvg.m30588getEndimpl(j), i, i2);
        return (iCoerceIn == jvg.m30593getStartimpl(j) && iCoerceIn2 == jvg.m30588getEndimpl(j)) ? j : TextRange(iCoerceIn, iCoerceIn2);
    }

    private static final long packWithCheck(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException(("start cannot be negative. [start: " + i + ", end: " + i2 + C4584d2.f28243l).toString());
        }
        if (i2 >= 0) {
            return (((long) i2) & 4294967295L) | (((long) i) << 32);
        }
        throw new IllegalArgumentException(("end cannot be negative. [start: " + i + ", end: " + i2 + C4584d2.f28243l).toString());
    }

    @yfb
    /* JADX INFO: renamed from: substring-FDrldGo, reason: not valid java name */
    public static final String m30779substringFDrldGo(@yfb CharSequence charSequence, long j) {
        return charSequence.subSequence(jvg.m30591getMinimpl(j), jvg.m30590getMaximpl(j)).toString();
    }

    public static final long TextRange(int i) {
        return TextRange(i, i);
    }
}
