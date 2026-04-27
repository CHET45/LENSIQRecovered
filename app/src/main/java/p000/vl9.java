package p000;

import p000.bt4;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nlongSaturatedMath.kt\nKotlin\n*S Kotlin\n*F\n+ 1 longSaturatedMath.kt\nkotlin/time/LongSaturatedMathKt\n*L\n1#1,81:1\n80#1:82\n80#1:83\n80#1:84\n80#1:85\n80#1:86\n80#1:87\n*S KotlinDebug\n*F\n+ 1 longSaturatedMath.kt\nkotlin/time/LongSaturatedMathKt\n*L\n14#1:82\n17#1:83\n36#1:84\n46#1:85\n53#1:86\n57#1:87\n*E\n"})
public final class vl9 {
    /* JADX INFO: renamed from: checkInfiniteSumDefined-PjuGub4, reason: not valid java name */
    private static final long m32773checkInfiniteSumDefinedPjuGub4(long j, long j2, long j3) {
        if (!bt4.m28084isInfiniteimpl(j2) || (j ^ j3) >= 0) {
            return j;
        }
        throw new IllegalArgumentException("Summing infinities of different signs");
    }

    private static final long infinityOfSign(long j) {
        return j < 0 ? bt4.f14711b.m28149getNEG_INFINITEUwyO8pc$kotlin_stdlib() : bt4.f14711b.m28148getINFINITEUwyO8pc();
    }

    public static final boolean isSaturated(long j) {
        return ((j - 1) | 1) == Long.MAX_VALUE;
    }

    /* JADX INFO: renamed from: saturatingAdd-NuflL3o, reason: not valid java name */
    public static final long m32774saturatingAddNuflL3o(long j, @yfb lt4 lt4Var, long j2) {
        md8.checkNotNullParameter(lt4Var, "unit");
        long jM28098toLongimpl = bt4.m28098toLongimpl(j2, lt4Var);
        if (((j - 1) | 1) == Long.MAX_VALUE) {
            return m32773checkInfiniteSumDefinedPjuGub4(j, j2, jM28098toLongimpl);
        }
        if ((1 | (jM28098toLongimpl - 1)) == Long.MAX_VALUE) {
            return m32775saturatingAddInHalvesNuflL3o(j, lt4Var, j2);
        }
        long j3 = j + jM28098toLongimpl;
        return ((j ^ j3) & (jM28098toLongimpl ^ j3)) < 0 ? j < 0 ? Long.MIN_VALUE : Long.MAX_VALUE : j3;
    }

    /* JADX INFO: renamed from: saturatingAddInHalves-NuflL3o, reason: not valid java name */
    private static final long m32775saturatingAddInHalvesNuflL3o(long j, lt4 lt4Var, long j2) {
        long jM28062divUwyO8pc = bt4.m28062divUwyO8pc(j2, 2);
        long jM28098toLongimpl = bt4.m28098toLongimpl(jM28062divUwyO8pc, lt4Var);
        return (1 | (jM28098toLongimpl - 1)) == Long.MAX_VALUE ? jM28098toLongimpl : m32774saturatingAddNuflL3o(m32774saturatingAddNuflL3o(j, lt4Var, jM28062divUwyO8pc), lt4Var, bt4.m28087minusLRDsOJo(j2, jM28062divUwyO8pc));
    }

    public static final long saturatingDiff(long j, long j2, @yfb lt4 lt4Var) {
        md8.checkNotNullParameter(lt4Var, "unit");
        return (1 | (j2 - 1)) == Long.MAX_VALUE ? bt4.m28103unaryMinusUwyO8pc(infinityOfSign(j2)) : saturatingFiniteDiff(j, j2, lt4Var);
    }

    private static final long saturatingFiniteDiff(long j, long j2, lt4 lt4Var) {
        long j3 = j - j2;
        if (((j3 ^ j) & (~(j3 ^ j2))) >= 0) {
            return ft4.toDuration(j3, lt4Var);
        }
        lt4 lt4Var2 = lt4.f58683d;
        if (lt4Var.compareTo(lt4Var2) >= 0) {
            return bt4.m28103unaryMinusUwyO8pc(infinityOfSign(j3));
        }
        long jConvertDurationUnit = nt4.convertDurationUnit(1L, lt4Var2, lt4Var);
        long j4 = (j / jConvertDurationUnit) - (j2 / jConvertDurationUnit);
        long j5 = (j % jConvertDurationUnit) - (j2 % jConvertDurationUnit);
        bt4.C2044a c2044a = bt4.f14711b;
        return bt4.m28088plusLRDsOJo(ft4.toDuration(j4, lt4Var2), ft4.toDuration(j5, lt4Var));
    }

    public static final long saturatingOriginsDiff(long j, long j2, @yfb lt4 lt4Var) {
        md8.checkNotNullParameter(lt4Var, "unit");
        return ((j2 - 1) | 1) == Long.MAX_VALUE ? j == j2 ? bt4.f14711b.m28150getZEROUwyO8pc() : bt4.m28103unaryMinusUwyO8pc(infinityOfSign(j2)) : (1 | (j - 1)) == Long.MAX_VALUE ? infinityOfSign(j) : saturatingFiniteDiff(j, j2, lt4Var);
    }
}
