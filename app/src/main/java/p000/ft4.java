package p000;

import java.util.Collection;
import java.util.Iterator;
import p000.bt4;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nDuration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Duration.kt\nkotlin/time/DurationKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1059:1\n1012#1,6:1061\n1015#1,3:1067\n1012#1,6:1070\n1012#1,6:1076\n1015#1,3:1085\n1#2:1060\n1734#3,3:1082\n*S KotlinDebug\n*F\n+ 1 Duration.kt\nkotlin/time/DurationKt\n*L\n936#1:1061,6\n970#1:1067,3\n973#1:1070,6\n976#1:1076,6\n1012#1:1085,3\n1001#1:1082,3\n*E\n"})
public final class ft4 {

    /* JADX INFO: renamed from: a */
    public static final int f37657a = 1000000;

    /* JADX INFO: renamed from: b */
    public static final long f37658b = 4611686018426999999L;

    /* JADX INFO: renamed from: c */
    public static final long f37659c = 4611686018427387903L;

    /* JADX INFO: renamed from: d */
    public static final long f37660d = 4611686018426L;

    /* JADX INFO: Access modifiers changed from: private */
    public static final long durationOf(long j, int i) {
        return bt4.m28059constructorimpl((j << 1) + ((long) i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long durationOfMillis(long j) {
        return bt4.m28059constructorimpl((j << 1) + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long durationOfMillisNormalized(long j) {
        return (-4611686018426L > j || j >= 4611686018427L) ? durationOfMillis(kpd.coerceIn(j, -4611686018427387903L, 4611686018427387903L)) : durationOfNanos(millisToNanos(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long durationOfNanos(long j) {
        return bt4.m28059constructorimpl(j << 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long durationOfNanosNormalized(long j) {
        return (-4611686018426999999L > j || j >= 4611686018427000000L) ? durationOfMillis(nanosToMillis(j)) : durationOfNanos(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long millisToNanos(long j) {
        return j * ((long) 1000000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long nanosToMillis(long j) {
        return j / ((long) 1000000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long parseDuration(String str, boolean z) {
        long jM28088plusLRDsOJo;
        char cCharAt;
        char cCharAt2;
        int i;
        char cCharAt3;
        int length = str.length();
        if (length == 0) {
            throw new IllegalArgumentException("The string is empty");
        }
        bt4.C2044a c2044a = bt4.f14711b;
        long jM28150getZEROUwyO8pc = c2044a.m28150getZEROUwyO8pc();
        char cCharAt4 = str.charAt(0);
        boolean z2 = true;
        int length2 = (cCharAt4 == '+' || cCharAt4 == '-') ? 1 : 0;
        boolean z3 = length2 > 0;
        boolean z4 = z3 && m9g.startsWith$default((CharSequence) str, '-', false, 2, (Object) null);
        if (length <= length2) {
            throw new IllegalArgumentException("No components");
        }
        char c = ':';
        char c2 = '0';
        if (str.charAt(length2) == 'P') {
            int i2 = length2 + 1;
            if (i2 == length) {
                throw new IllegalArgumentException();
            }
            lt4 lt4Var = null;
            boolean z5 = false;
            while (i2 < length) {
                if (str.charAt(i2) != 'T') {
                    int i3 = i2;
                    while (i3 < str.length() && ((c2 <= (cCharAt3 = str.charAt(i3)) && cCharAt3 < c) || m9g.contains$default((CharSequence) "+-.", cCharAt3, false, 2, (Object) null))) {
                        i3++;
                        c = ':';
                        c2 = '0';
                    }
                    md8.checkNotNull(str, "null cannot be cast to non-null type java.lang.String");
                    String strSubstring = str.substring(i2, i3);
                    md8.checkNotNullExpressionValue(strSubstring, "substring(...)");
                    if (strSubstring.length() == 0) {
                        throw new IllegalArgumentException();
                    }
                    int length3 = i2 + strSubstring.length();
                    if (length3 < 0 || length3 >= str.length()) {
                        throw new IllegalArgumentException("Missing unit for value " + strSubstring);
                    }
                    char cCharAt5 = str.charAt(length3);
                    int i4 = length3 + 1;
                    lt4 lt4VarDurationUnitByIsoChar = ot4.durationUnitByIsoChar(cCharAt5, z5);
                    if (lt4Var != null && lt4Var.compareTo(lt4VarDurationUnitByIsoChar) <= 0) {
                        throw new IllegalArgumentException("Unexpected order of duration components");
                    }
                    int iIndexOf$default = m9g.indexOf$default((CharSequence) strSubstring, a18.f100c, 0, false, 6, (Object) null);
                    if (lt4VarDurationUnitByIsoChar != lt4.f58684e || iIndexOf$default <= 0) {
                        i = i4;
                        jM28150getZEROUwyO8pc = bt4.m28088plusLRDsOJo(jM28150getZEROUwyO8pc, toDuration(parseOverLongIsoComponent(strSubstring), lt4VarDurationUnitByIsoChar));
                    } else {
                        md8.checkNotNull(strSubstring, "null cannot be cast to non-null type java.lang.String");
                        String strSubstring2 = strSubstring.substring(0, iIndexOf$default);
                        md8.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                        i = i4;
                        long jM28088plusLRDsOJo2 = bt4.m28088plusLRDsOJo(jM28150getZEROUwyO8pc, toDuration(parseOverLongIsoComponent(strSubstring2), lt4VarDurationUnitByIsoChar));
                        md8.checkNotNull(strSubstring, "null cannot be cast to non-null type java.lang.String");
                        String strSubstring3 = strSubstring.substring(iIndexOf$default);
                        md8.checkNotNullExpressionValue(strSubstring3, "substring(...)");
                        jM28150getZEROUwyO8pc = bt4.m28088plusLRDsOJo(jM28088plusLRDsOJo2, toDuration(Double.parseDouble(strSubstring3), lt4VarDurationUnitByIsoChar));
                    }
                    i2 = i;
                    lt4Var = lt4VarDurationUnitByIsoChar;
                    c = ':';
                    c2 = '0';
                    z2 = true;
                } else {
                    if (z5 || (i2 = i2 + 1) == length) {
                        throw new IllegalArgumentException();
                    }
                    z5 = z2;
                }
            }
        } else {
            if (z) {
                throw new IllegalArgumentException();
            }
            String str2 = "Unexpected order of duration components";
            if (h9g.regionMatches(str, length2, "Infinity", 0, Math.max(length - length2, 8), true)) {
                jM28150getZEROUwyO8pc = c2044a.m28148getINFINITEUwyO8pc();
            } else {
                boolean z6 = !z3;
                if (z3 && str.charAt(length2) == '(' && t9g.last(str) == ')') {
                    length2++;
                    length--;
                    if (length2 == length) {
                        throw new IllegalArgumentException("No components");
                    }
                    jM28088plusLRDsOJo = jM28150getZEROUwyO8pc;
                    z6 = true;
                } else {
                    jM28088plusLRDsOJo = jM28150getZEROUwyO8pc;
                }
                lt4 lt4Var2 = null;
                boolean z7 = false;
                while (length2 < length) {
                    if (z7 && z6) {
                        while (length2 < str.length() && str.charAt(length2) == ' ') {
                            length2++;
                        }
                    }
                    int i5 = length2;
                    while (i5 < str.length() && (('0' <= (cCharAt2 = str.charAt(i5)) && cCharAt2 < ':') || cCharAt2 == '.')) {
                        i5++;
                    }
                    md8.checkNotNull(str, "null cannot be cast to non-null type java.lang.String");
                    String strSubstring4 = str.substring(length2, i5);
                    md8.checkNotNullExpressionValue(strSubstring4, "substring(...)");
                    if (strSubstring4.length() == 0) {
                        throw new IllegalArgumentException();
                    }
                    int length4 = length2 + strSubstring4.length();
                    int i6 = length4;
                    while (i6 < str.length() && 'a' <= (cCharAt = str.charAt(i6)) && cCharAt < '{') {
                        i6++;
                    }
                    md8.checkNotNull(str, "null cannot be cast to non-null type java.lang.String");
                    String strSubstring5 = str.substring(length4, i6);
                    md8.checkNotNullExpressionValue(strSubstring5, "substring(...)");
                    length2 = length4 + strSubstring5.length();
                    lt4 lt4VarDurationUnitByShortName = ot4.durationUnitByShortName(strSubstring5);
                    if (lt4Var2 != null && lt4Var2.compareTo(lt4VarDurationUnitByShortName) <= 0) {
                        throw new IllegalArgumentException(str2);
                    }
                    String str3 = str2;
                    int iIndexOf$default2 = m9g.indexOf$default((CharSequence) strSubstring4, a18.f100c, 0, false, 6, (Object) null);
                    if (iIndexOf$default2 > 0) {
                        md8.checkNotNull(strSubstring4, "null cannot be cast to non-null type java.lang.String");
                        String strSubstring6 = strSubstring4.substring(0, iIndexOf$default2);
                        md8.checkNotNullExpressionValue(strSubstring6, "substring(...)");
                        long jM28088plusLRDsOJo3 = bt4.m28088plusLRDsOJo(jM28088plusLRDsOJo, toDuration(Long.parseLong(strSubstring6), lt4VarDurationUnitByShortName));
                        md8.checkNotNull(strSubstring4, "null cannot be cast to non-null type java.lang.String");
                        String strSubstring7 = strSubstring4.substring(iIndexOf$default2);
                        md8.checkNotNullExpressionValue(strSubstring7, "substring(...)");
                        jM28088plusLRDsOJo = bt4.m28088plusLRDsOJo(jM28088plusLRDsOJo3, toDuration(Double.parseDouble(strSubstring7), lt4VarDurationUnitByShortName));
                        length2 = length2;
                        if (length2 < length) {
                            throw new IllegalArgumentException("Fractional component must be last");
                        }
                    } else {
                        jM28088plusLRDsOJo = bt4.m28088plusLRDsOJo(jM28088plusLRDsOJo, toDuration(Long.parseLong(strSubstring4), lt4VarDurationUnitByShortName));
                    }
                    str2 = str3;
                    lt4Var2 = lt4VarDurationUnitByShortName;
                    z7 = true;
                }
                jM28150getZEROUwyO8pc = jM28088plusLRDsOJo;
            }
        }
        return z4 ? bt4.m28103unaryMinusUwyO8pc(jM28150getZEROUwyO8pc) : jM28150getZEROUwyO8pc;
    }

    private static final long parseOverLongIsoComponent(String str) {
        int length = str.length();
        int i = (length <= 0 || !m9g.contains$default((CharSequence) "+-", str.charAt(0), false, 2, (Object) null)) ? 0 : 1;
        if (length - i > 16) {
            Iterable f78Var = new f78(i, m9g.getLastIndex(str));
            if (!(f78Var instanceof Collection) || !((Collection) f78Var).isEmpty()) {
                Iterator it = f78Var.iterator();
                while (it.hasNext()) {
                    char cCharAt = str.charAt(((o68) it).nextInt());
                    if ('0' > cCharAt || cCharAt >= ':') {
                    }
                }
            }
            return str.charAt(0) == '-' ? Long.MIN_VALUE : Long.MAX_VALUE;
        }
        if (h9g.startsWith$default(str, "+", false, 2, null)) {
            str = t9g.drop(str, 1);
        }
        return Long.parseLong(str);
    }

    private static final int skipWhile(String str, int i, qy6<? super Character, Boolean> qy6Var) {
        while (i < str.length() && qy6Var.invoke(Character.valueOf(str.charAt(i))).booleanValue()) {
            i++;
        }
        return i;
    }

    private static final String substringWhile(String str, int i, qy6<? super Character, Boolean> qy6Var) {
        int i2 = i;
        while (i2 < str.length() && qy6Var.invoke(Character.valueOf(str.charAt(i2))).booleanValue()) {
            i2++;
        }
        md8.checkNotNull(str, "null cannot be cast to non-null type java.lang.String");
        String strSubstring = str.substring(i, i2);
        md8.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    @ihi(markerClass = {uh5.class})
    @jjf(version = "1.6")
    @t28
    /* JADX INFO: renamed from: times-kIfJnKk, reason: not valid java name */
    private static final long m29661timeskIfJnKk(double d, long j) {
        return bt4.m28089timesUwyO8pc(j, d);
    }

    @ihi(markerClass = {uh5.class})
    @jjf(version = "1.6")
    @t28
    /* JADX INFO: renamed from: times-mvk6XK0, reason: not valid java name */
    private static final long m29662timesmvk6XK0(int i, long j) {
        return bt4.m28090timesUwyO8pc(j, i);
    }

    @ihi(markerClass = {uh5.class})
    @jjf(version = "1.6")
    public static final long toDuration(int i, @yfb lt4 lt4Var) {
        md8.checkNotNullParameter(lt4Var, "unit");
        return lt4Var.compareTo(lt4.f58684e) <= 0 ? durationOfNanos(nt4.convertDurationUnitOverflow(i, lt4Var, lt4.f58681b)) : toDuration(i, lt4Var);
    }

    @ihi(markerClass = {uh5.class})
    @jjf(version = "1.6")
    public static final long toDuration(long j, @yfb lt4 lt4Var) {
        md8.checkNotNullParameter(lt4Var, "unit");
        lt4 lt4Var2 = lt4.f58681b;
        long jConvertDurationUnitOverflow = nt4.convertDurationUnitOverflow(f37658b, lt4Var2, lt4Var);
        if ((-jConvertDurationUnitOverflow) <= j && j <= jConvertDurationUnitOverflow) {
            return durationOfNanos(nt4.convertDurationUnitOverflow(j, lt4Var, lt4Var2));
        }
        return durationOfMillis(kpd.coerceIn(nt4.convertDurationUnit(j, lt4Var, lt4.f58683d), -4611686018427387903L, 4611686018427387903L));
    }

    @ihi(markerClass = {uh5.class})
    @jjf(version = "1.6")
    public static final long toDuration(double d, @yfb lt4 lt4Var) {
        md8.checkNotNullParameter(lt4Var, "unit");
        double dConvertDurationUnit = nt4.convertDurationUnit(d, lt4Var, lt4.f58681b);
        if (!Double.isNaN(dConvertDurationUnit)) {
            long jRoundToLong = p3a.roundToLong(dConvertDurationUnit);
            if (-4611686018426999999L <= jRoundToLong && jRoundToLong < 4611686018427000000L) {
                return durationOfNanos(jRoundToLong);
            }
            return durationOfMillisNormalized(p3a.roundToLong(nt4.convertDurationUnit(d, lt4Var, lt4.f58683d)));
        }
        throw new IllegalArgumentException("Duration value cannot be NaN.");
    }
}
