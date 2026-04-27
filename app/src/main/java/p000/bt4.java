package p000;

/* JADX INFO: loaded from: classes7.dex */
@jjf(version = "1.6")
@vn8
@dwf({"SMAP\nDuration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Duration.kt\nkotlin/time/Duration\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1059:1\n38#1:1060\n38#1:1061\n38#1:1062\n38#1:1063\n38#1:1064\n501#1:1065\n518#1:1073\n170#2,6:1066\n1#3:1072\n*S KotlinDebug\n*F\n+ 1 Duration.kt\nkotlin/time/Duration\n*L\n39#1:1060\n40#1:1061\n275#1:1062\n295#1:1063\n479#1:1064\n728#1:1065\n819#1:1073\n770#1:1066,6\n*E\n"})
@ihi(markerClass = {uh5.class})
public final class bt4 implements Comparable<bt4> {

    /* JADX INFO: renamed from: b */
    @yfb
    public static final C2044a f14711b = new C2044a(null);

    /* JADX INFO: renamed from: c */
    public static final long f14712c = m28059constructorimpl(0);

    /* JADX INFO: renamed from: d */
    public static final long f14713d = ft4.durationOfMillis(4611686018427387903L);

    /* JADX INFO: renamed from: e */
    public static final long f14714e = ft4.durationOfMillis(-4611686018427387903L);

    /* JADX INFO: renamed from: a */
    public final long f14715a;

    /* JADX INFO: renamed from: bt4$a */
    public static final class C2044a {
        public /* synthetic */ C2044a(jt3 jt3Var) {
            this();
        }

        /* JADX INFO: renamed from: getDays-UwyO8pc, reason: not valid java name */
        private final long m28107getDaysUwyO8pc(int i) {
            return ft4.toDuration(i, lt4.f58678C);
        }

        @t28
        /* JADX INFO: renamed from: getDays-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m28109getDaysUwyO8pc$annotations(double d) {
        }

        /* JADX INFO: renamed from: getHours-UwyO8pc, reason: not valid java name */
        private final long m28113getHoursUwyO8pc(int i) {
            return ft4.toDuration(i, lt4.f58686m);
        }

        @t28
        /* JADX INFO: renamed from: getHours-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m28115getHoursUwyO8pc$annotations(double d) {
        }

        /* JADX INFO: renamed from: getMicroseconds-UwyO8pc, reason: not valid java name */
        private final long m28119getMicrosecondsUwyO8pc(int i) {
            return ft4.toDuration(i, lt4.f58682c);
        }

        @t28
        /* JADX INFO: renamed from: getMicroseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m28121getMicrosecondsUwyO8pc$annotations(double d) {
        }

        /* JADX INFO: renamed from: getMilliseconds-UwyO8pc, reason: not valid java name */
        private final long m28125getMillisecondsUwyO8pc(int i) {
            return ft4.toDuration(i, lt4.f58683d);
        }

        @t28
        /* JADX INFO: renamed from: getMilliseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m28127getMillisecondsUwyO8pc$annotations(double d) {
        }

        /* JADX INFO: renamed from: getMinutes-UwyO8pc, reason: not valid java name */
        private final long m28131getMinutesUwyO8pc(int i) {
            return ft4.toDuration(i, lt4.f58685f);
        }

        @t28
        /* JADX INFO: renamed from: getMinutes-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m28133getMinutesUwyO8pc$annotations(double d) {
        }

        /* JADX INFO: renamed from: getNanoseconds-UwyO8pc, reason: not valid java name */
        private final long m28137getNanosecondsUwyO8pc(int i) {
            return ft4.toDuration(i, lt4.f58681b);
        }

        @t28
        /* JADX INFO: renamed from: getNanoseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m28139getNanosecondsUwyO8pc$annotations(double d) {
        }

        /* JADX INFO: renamed from: getSeconds-UwyO8pc, reason: not valid java name */
        private final long m28143getSecondsUwyO8pc(int i) {
            return ft4.toDuration(i, lt4.f58684e);
        }

        @t28
        /* JADX INFO: renamed from: getSeconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m28145getSecondsUwyO8pc$annotations(double d) {
        }

        @uh5
        public final double convert(double d, @yfb lt4 lt4Var, @yfb lt4 lt4Var2) {
            md8.checkNotNullParameter(lt4Var, "sourceUnit");
            md8.checkNotNullParameter(lt4Var2, "targetUnit");
            return nt4.convertDurationUnit(d, lt4Var, lt4Var2);
        }

        /* JADX INFO: renamed from: getINFINITE-UwyO8pc, reason: not valid java name */
        public final long m28148getINFINITEUwyO8pc() {
            return bt4.f14713d;
        }

        /* JADX INFO: renamed from: getNEG_INFINITE-UwyO8pc$kotlin_stdlib, reason: not valid java name */
        public final long m28149getNEG_INFINITEUwyO8pc$kotlin_stdlib() {
            return bt4.f14714e;
        }

        /* JADX INFO: renamed from: getZERO-UwyO8pc, reason: not valid java name */
        public final long m28150getZEROUwyO8pc() {
            return bt4.f14712c;
        }

        /* JADX INFO: renamed from: parse-UwyO8pc, reason: not valid java name */
        public final long m28151parseUwyO8pc(@yfb String str) {
            md8.checkNotNullParameter(str, "value");
            try {
                return ft4.parseDuration(str, false);
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException("Invalid duration string format: '" + str + "'.", e);
            }
        }

        /* JADX INFO: renamed from: parseIsoString-UwyO8pc, reason: not valid java name */
        public final long m28152parseIsoStringUwyO8pc(@yfb String str) {
            md8.checkNotNullParameter(str, "value");
            try {
                return ft4.parseDuration(str, true);
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException("Invalid ISO duration string format: '" + str + "'.", e);
            }
        }

        @gib
        /* JADX INFO: renamed from: parseIsoStringOrNull-FghU774, reason: not valid java name */
        public final bt4 m28153parseIsoStringOrNullFghU774(@yfb String str) {
            md8.checkNotNullParameter(str, "value");
            try {
                return bt4.m28057boximpl(ft4.parseDuration(str, true));
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        @gib
        /* JADX INFO: renamed from: parseOrNull-FghU774, reason: not valid java name */
        public final bt4 m28154parseOrNullFghU774(@yfb String str) {
            md8.checkNotNullParameter(str, "value");
            try {
                return bt4.m28057boximpl(ft4.parseDuration(str, false));
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        private C2044a() {
        }

        /* JADX INFO: renamed from: getDays-UwyO8pc, reason: not valid java name */
        private final long m28108getDaysUwyO8pc(long j) {
            return ft4.toDuration(j, lt4.f58678C);
        }

        @t28
        /* JADX INFO: renamed from: getDays-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m28110getDaysUwyO8pc$annotations(int i) {
        }

        /* JADX INFO: renamed from: getHours-UwyO8pc, reason: not valid java name */
        private final long m28114getHoursUwyO8pc(long j) {
            return ft4.toDuration(j, lt4.f58686m);
        }

        @t28
        /* JADX INFO: renamed from: getHours-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m28116getHoursUwyO8pc$annotations(int i) {
        }

        /* JADX INFO: renamed from: getMicroseconds-UwyO8pc, reason: not valid java name */
        private final long m28120getMicrosecondsUwyO8pc(long j) {
            return ft4.toDuration(j, lt4.f58682c);
        }

        @t28
        /* JADX INFO: renamed from: getMicroseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m28122getMicrosecondsUwyO8pc$annotations(int i) {
        }

        /* JADX INFO: renamed from: getMilliseconds-UwyO8pc, reason: not valid java name */
        private final long m28126getMillisecondsUwyO8pc(long j) {
            return ft4.toDuration(j, lt4.f58683d);
        }

        @t28
        /* JADX INFO: renamed from: getMilliseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m28128getMillisecondsUwyO8pc$annotations(int i) {
        }

        /* JADX INFO: renamed from: getMinutes-UwyO8pc, reason: not valid java name */
        private final long m28132getMinutesUwyO8pc(long j) {
            return ft4.toDuration(j, lt4.f58685f);
        }

        @t28
        /* JADX INFO: renamed from: getMinutes-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m28134getMinutesUwyO8pc$annotations(int i) {
        }

        /* JADX INFO: renamed from: getNanoseconds-UwyO8pc, reason: not valid java name */
        private final long m28138getNanosecondsUwyO8pc(long j) {
            return ft4.toDuration(j, lt4.f58681b);
        }

        @t28
        /* JADX INFO: renamed from: getNanoseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m28140getNanosecondsUwyO8pc$annotations(int i) {
        }

        /* JADX INFO: renamed from: getSeconds-UwyO8pc, reason: not valid java name */
        private final long m28144getSecondsUwyO8pc(long j) {
            return ft4.toDuration(j, lt4.f58684e);
        }

        @t28
        /* JADX INFO: renamed from: getSeconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m28146getSecondsUwyO8pc$annotations(int i) {
        }

        /* JADX INFO: renamed from: getDays-UwyO8pc, reason: not valid java name */
        private final long m28106getDaysUwyO8pc(double d) {
            return ft4.toDuration(d, lt4.f58678C);
        }

        @t28
        /* JADX INFO: renamed from: getDays-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m28111getDaysUwyO8pc$annotations(long j) {
        }

        /* JADX INFO: renamed from: getHours-UwyO8pc, reason: not valid java name */
        private final long m28112getHoursUwyO8pc(double d) {
            return ft4.toDuration(d, lt4.f58686m);
        }

        @t28
        /* JADX INFO: renamed from: getHours-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m28117getHoursUwyO8pc$annotations(long j) {
        }

        /* JADX INFO: renamed from: getMicroseconds-UwyO8pc, reason: not valid java name */
        private final long m28118getMicrosecondsUwyO8pc(double d) {
            return ft4.toDuration(d, lt4.f58682c);
        }

        @t28
        /* JADX INFO: renamed from: getMicroseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m28123getMicrosecondsUwyO8pc$annotations(long j) {
        }

        /* JADX INFO: renamed from: getMilliseconds-UwyO8pc, reason: not valid java name */
        private final long m28124getMillisecondsUwyO8pc(double d) {
            return ft4.toDuration(d, lt4.f58683d);
        }

        @t28
        /* JADX INFO: renamed from: getMilliseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m28129getMillisecondsUwyO8pc$annotations(long j) {
        }

        /* JADX INFO: renamed from: getMinutes-UwyO8pc, reason: not valid java name */
        private final long m28130getMinutesUwyO8pc(double d) {
            return ft4.toDuration(d, lt4.f58685f);
        }

        @t28
        /* JADX INFO: renamed from: getMinutes-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m28135getMinutesUwyO8pc$annotations(long j) {
        }

        /* JADX INFO: renamed from: getNanoseconds-UwyO8pc, reason: not valid java name */
        private final long m28136getNanosecondsUwyO8pc(double d) {
            return ft4.toDuration(d, lt4.f58681b);
        }

        @t28
        /* JADX INFO: renamed from: getNanoseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m28141getNanosecondsUwyO8pc$annotations(long j) {
        }

        /* JADX INFO: renamed from: getSeconds-UwyO8pc, reason: not valid java name */
        private final long m28142getSecondsUwyO8pc(double d) {
            return ft4.toDuration(d, lt4.f58684e);
        }

        @t28
        /* JADX INFO: renamed from: getSeconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m28147getSecondsUwyO8pc$annotations(long j) {
        }
    }

    private /* synthetic */ bt4(long j) {
        this.f14715a = j;
    }

    /* JADX INFO: renamed from: addValuesMixedRanges-UwyO8pc, reason: not valid java name */
    private static final long m28055addValuesMixedRangesUwyO8pc(long j, long j2, long j3) {
        long jNanosToMillis = ft4.nanosToMillis(j3);
        long j4 = j2 + jNanosToMillis;
        if (-4611686018426L > j4 || j4 >= 4611686018427L) {
            return ft4.durationOfMillis(kpd.coerceIn(j4, -4611686018427387903L, 4611686018427387903L));
        }
        return ft4.durationOfNanos(ft4.millisToNanos(j4) + (j3 - ft4.millisToNanos(jNanosToMillis)));
    }

    /* JADX INFO: renamed from: appendFractional-impl, reason: not valid java name */
    private static final void m28056appendFractionalimpl(long j, StringBuilder sb, int i, int i2, int i3, String str, boolean z) {
        sb.append(i);
        if (i2 != 0) {
            sb.append(a18.f100c);
            String strPadStart = m9g.padStart(String.valueOf(i2), i3, '0');
            int i4 = -1;
            int length = strPadStart.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i5 = length - 1;
                    if (strPadStart.charAt(length) != '0') {
                        i4 = length;
                        break;
                    } else if (i5 < 0) {
                        break;
                    } else {
                        length = i5;
                    }
                }
            }
            int i6 = i4 + 1;
            if (z || i6 >= 3) {
                sb.append((CharSequence) strPadStart, 0, ((i4 + 3) / 3) * 3);
                md8.checkNotNullExpressionValue(sb, "append(...)");
            } else {
                sb.append((CharSequence) strPadStart, 0, i6);
                md8.checkNotNullExpressionValue(sb, "append(...)");
            }
        }
        sb.append(str);
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ bt4 m28057boximpl(long j) {
        return new bt4(j);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m28059constructorimpl(long j) {
        if (et4.getDurationAssertionsEnabled()) {
            if (m28083isInNanosimpl(j)) {
                long jM28079getValueimpl = m28079getValueimpl(j);
                if (-4611686018426999999L > jM28079getValueimpl || jM28079getValueimpl >= 4611686018427000000L) {
                    throw new AssertionError(m28079getValueimpl(j) + " ns is out of nanoseconds range");
                }
            } else {
                long jM28079getValueimpl2 = m28079getValueimpl(j);
                if (-4611686018427387903L > jM28079getValueimpl2 || jM28079getValueimpl2 >= 4611686018427387904L) {
                    throw new AssertionError(m28079getValueimpl(j) + " ms is out of milliseconds range");
                }
                long jM28079getValueimpl3 = m28079getValueimpl(j);
                if (-4611686018426L <= jM28079getValueimpl3 && jM28079getValueimpl3 < 4611686018427L) {
                    throw new AssertionError(m28079getValueimpl(j) + " ms is denormalized");
                }
            }
        }
        return j;
    }

    /* JADX INFO: renamed from: div-LRDsOJo, reason: not valid java name */
    public static final double m28060divLRDsOJo(long j, long j2) {
        lt4 lt4Var = (lt4) nd2.maxOf(m28077getStorageUnitimpl(j), m28077getStorageUnitimpl(j2));
        return m28095toDoubleimpl(j, lt4Var) / m28095toDoubleimpl(j2, lt4Var);
    }

    /* JADX INFO: renamed from: div-UwyO8pc, reason: not valid java name */
    public static final long m28062divUwyO8pc(long j, int i) {
        if (i == 0) {
            if (m28086isPositiveimpl(j)) {
                return f14713d;
            }
            if (m28085isNegativeimpl(j)) {
                return f14714e;
            }
            throw new IllegalArgumentException("Dividing zero duration by zero yields an undefined result.");
        }
        if (m28083isInNanosimpl(j)) {
            return ft4.durationOfNanos(m28079getValueimpl(j) / ((long) i));
        }
        if (m28084isInfiniteimpl(j)) {
            return m28090timesUwyO8pc(j, p3a.getSign(i));
        }
        long j2 = i;
        long jM28079getValueimpl = m28079getValueimpl(j) / j2;
        if (-4611686018426L > jM28079getValueimpl || jM28079getValueimpl >= 4611686018427L) {
            return ft4.durationOfMillis(jM28079getValueimpl);
        }
        return ft4.durationOfNanos(ft4.millisToNanos(jM28079getValueimpl) + (ft4.millisToNanos(m28079getValueimpl(j) - (jM28079getValueimpl * j2)) / j2));
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m28063equalsimpl(long j, Object obj) {
        return (obj instanceof bt4) && j == ((bt4) obj).m28105unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m28064equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* JADX INFO: renamed from: getAbsoluteValue-UwyO8pc, reason: not valid java name */
    public static final long m28065getAbsoluteValueUwyO8pc(long j) {
        return m28085isNegativeimpl(j) ? m28103unaryMinusUwyO8pc(j) : j;
    }

    @yjd
    public static /* synthetic */ void getHoursComponent$annotations() {
    }

    /* JADX INFO: renamed from: getHoursComponent-impl, reason: not valid java name */
    public static final int m28066getHoursComponentimpl(long j) {
        if (m28084isInfiniteimpl(j)) {
            return 0;
        }
        return (int) (m28068getInWholeHoursimpl(j) % ((long) 24));
    }

    /* JADX INFO: renamed from: getInWholeDays-impl, reason: not valid java name */
    public static final long m28067getInWholeDaysimpl(long j) {
        return m28098toLongimpl(j, lt4.f58678C);
    }

    /* JADX INFO: renamed from: getInWholeHours-impl, reason: not valid java name */
    public static final long m28068getInWholeHoursimpl(long j) {
        return m28098toLongimpl(j, lt4.f58686m);
    }

    /* JADX INFO: renamed from: getInWholeMicroseconds-impl, reason: not valid java name */
    public static final long m28069getInWholeMicrosecondsimpl(long j) {
        return m28098toLongimpl(j, lt4.f58682c);
    }

    /* JADX INFO: renamed from: getInWholeMilliseconds-impl, reason: not valid java name */
    public static final long m28070getInWholeMillisecondsimpl(long j) {
        return (m28082isInMillisimpl(j) && m28081isFiniteimpl(j)) ? m28079getValueimpl(j) : m28098toLongimpl(j, lt4.f58683d);
    }

    /* JADX INFO: renamed from: getInWholeMinutes-impl, reason: not valid java name */
    public static final long m28071getInWholeMinutesimpl(long j) {
        return m28098toLongimpl(j, lt4.f58685f);
    }

    /* JADX INFO: renamed from: getInWholeNanoseconds-impl, reason: not valid java name */
    public static final long m28072getInWholeNanosecondsimpl(long j) {
        long jM28079getValueimpl = m28079getValueimpl(j);
        if (m28083isInNanosimpl(j)) {
            return jM28079getValueimpl;
        }
        if (jM28079getValueimpl > 9223372036854L) {
            return Long.MAX_VALUE;
        }
        if (jM28079getValueimpl < -9223372036854L) {
            return Long.MIN_VALUE;
        }
        return ft4.millisToNanos(jM28079getValueimpl);
    }

    /* JADX INFO: renamed from: getInWholeSeconds-impl, reason: not valid java name */
    public static final long m28073getInWholeSecondsimpl(long j) {
        return m28098toLongimpl(j, lt4.f58684e);
    }

    @yjd
    public static /* synthetic */ void getMinutesComponent$annotations() {
    }

    /* JADX INFO: renamed from: getMinutesComponent-impl, reason: not valid java name */
    public static final int m28074getMinutesComponentimpl(long j) {
        if (m28084isInfiniteimpl(j)) {
            return 0;
        }
        return (int) (m28071getInWholeMinutesimpl(j) % ((long) 60));
    }

    @yjd
    public static /* synthetic */ void getNanosecondsComponent$annotations() {
    }

    /* JADX INFO: renamed from: getNanosecondsComponent-impl, reason: not valid java name */
    public static final int m28075getNanosecondsComponentimpl(long j) {
        if (m28084isInfiniteimpl(j)) {
            return 0;
        }
        return (int) (m28082isInMillisimpl(j) ? ft4.millisToNanos(m28079getValueimpl(j) % ((long) 1000)) : m28079getValueimpl(j) % ((long) 1000000000));
    }

    @yjd
    public static /* synthetic */ void getSecondsComponent$annotations() {
    }

    /* JADX INFO: renamed from: getSecondsComponent-impl, reason: not valid java name */
    public static final int m28076getSecondsComponentimpl(long j) {
        if (m28084isInfiniteimpl(j)) {
            return 0;
        }
        return (int) (m28073getInWholeSecondsimpl(j) % ((long) 60));
    }

    /* JADX INFO: renamed from: getStorageUnit-impl, reason: not valid java name */
    private static final lt4 m28077getStorageUnitimpl(long j) {
        return m28083isInNanosimpl(j) ? lt4.f58681b : lt4.f58683d;
    }

    /* JADX INFO: renamed from: getUnitDiscriminator-impl, reason: not valid java name */
    private static final int m28078getUnitDiscriminatorimpl(long j) {
        return ((int) j) & 1;
    }

    /* JADX INFO: renamed from: getValue-impl, reason: not valid java name */
    private static final long m28079getValueimpl(long j) {
        return j >> 1;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m28080hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    /* JADX INFO: renamed from: isFinite-impl, reason: not valid java name */
    public static final boolean m28081isFiniteimpl(long j) {
        return !m28084isInfiniteimpl(j);
    }

    /* JADX INFO: renamed from: isInMillis-impl, reason: not valid java name */
    private static final boolean m28082isInMillisimpl(long j) {
        return (((int) j) & 1) == 1;
    }

    /* JADX INFO: renamed from: isInNanos-impl, reason: not valid java name */
    private static final boolean m28083isInNanosimpl(long j) {
        return (((int) j) & 1) == 0;
    }

    /* JADX INFO: renamed from: isInfinite-impl, reason: not valid java name */
    public static final boolean m28084isInfiniteimpl(long j) {
        return j == f14713d || j == f14714e;
    }

    /* JADX INFO: renamed from: isNegative-impl, reason: not valid java name */
    public static final boolean m28085isNegativeimpl(long j) {
        return j < 0;
    }

    /* JADX INFO: renamed from: isPositive-impl, reason: not valid java name */
    public static final boolean m28086isPositiveimpl(long j) {
        return j > 0;
    }

    /* JADX INFO: renamed from: minus-LRDsOJo, reason: not valid java name */
    public static final long m28087minusLRDsOJo(long j, long j2) {
        return m28088plusLRDsOJo(j, m28103unaryMinusUwyO8pc(j2));
    }

    /* JADX INFO: renamed from: plus-LRDsOJo, reason: not valid java name */
    public static final long m28088plusLRDsOJo(long j, long j2) {
        if (m28084isInfiniteimpl(j)) {
            if (m28081isFiniteimpl(j2) || (j2 ^ j) >= 0) {
                return j;
            }
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        }
        if (m28084isInfiniteimpl(j2)) {
            return j2;
        }
        if ((((int) j) & 1) != (((int) j2) & 1)) {
            return m28082isInMillisimpl(j) ? m28055addValuesMixedRangesUwyO8pc(j, m28079getValueimpl(j), m28079getValueimpl(j2)) : m28055addValuesMixedRangesUwyO8pc(j, m28079getValueimpl(j2), m28079getValueimpl(j));
        }
        long jM28079getValueimpl = m28079getValueimpl(j) + m28079getValueimpl(j2);
        return m28083isInNanosimpl(j) ? ft4.durationOfNanosNormalized(jM28079getValueimpl) : ft4.durationOfMillisNormalized(jM28079getValueimpl);
    }

    /* JADX INFO: renamed from: times-UwyO8pc, reason: not valid java name */
    public static final long m28090timesUwyO8pc(long j, int i) {
        if (m28084isInfiniteimpl(j)) {
            if (i != 0) {
                return i > 0 ? j : m28103unaryMinusUwyO8pc(j);
            }
            throw new IllegalArgumentException("Multiplying infinite duration by zero yields an undefined result.");
        }
        if (i == 0) {
            return f14712c;
        }
        long jM28079getValueimpl = m28079getValueimpl(j);
        long j2 = i;
        long j3 = jM28079getValueimpl * j2;
        if (!m28083isInNanosimpl(j)) {
            return j3 / j2 == jM28079getValueimpl ? ft4.durationOfMillis(kpd.coerceIn(j3, new ul9(-4611686018427387903L, 4611686018427387903L))) : p3a.getSign(jM28079getValueimpl) * p3a.getSign(i) > 0 ? f14713d : f14714e;
        }
        if (-2147483647L <= jM28079getValueimpl && jM28079getValueimpl < 2147483648L) {
            return ft4.durationOfNanos(j3);
        }
        if (j3 / j2 == jM28079getValueimpl) {
            return ft4.durationOfNanosNormalized(j3);
        }
        long jNanosToMillis = ft4.nanosToMillis(jM28079getValueimpl);
        long j4 = jNanosToMillis * j2;
        long jNanosToMillis2 = ft4.nanosToMillis((jM28079getValueimpl - ft4.millisToNanos(jNanosToMillis)) * j2) + j4;
        return (j4 / j2 != jNanosToMillis || (jNanosToMillis2 ^ j4) < 0) ? p3a.getSign(jM28079getValueimpl) * p3a.getSign(i) > 0 ? f14713d : f14714e : ft4.durationOfMillis(kpd.coerceIn(jNanosToMillis2, new ul9(-4611686018427387903L, 4611686018427387903L)));
    }

    /* JADX INFO: renamed from: toComponents-impl, reason: not valid java name */
    public static final <T> T m28094toComponentsimpl(long j, @yfb rz6<? super Long, ? super Integer, ? super Integer, ? super Integer, ? super Integer, ? extends T> rz6Var) {
        md8.checkNotNullParameter(rz6Var, "action");
        return rz6Var.invoke(Long.valueOf(m28067getInWholeDaysimpl(j)), Integer.valueOf(m28066getHoursComponentimpl(j)), Integer.valueOf(m28074getMinutesComponentimpl(j)), Integer.valueOf(m28076getSecondsComponentimpl(j)), Integer.valueOf(m28075getNanosecondsComponentimpl(j)));
    }

    /* JADX INFO: renamed from: toDouble-impl, reason: not valid java name */
    public static final double m28095toDoubleimpl(long j, @yfb lt4 lt4Var) {
        md8.checkNotNullParameter(lt4Var, "unit");
        if (j == f14713d) {
            return Double.POSITIVE_INFINITY;
        }
        if (j == f14714e) {
            return Double.NEGATIVE_INFINITY;
        }
        return nt4.convertDurationUnit(m28079getValueimpl(j), m28077getStorageUnitimpl(j), lt4Var);
    }

    /* JADX INFO: renamed from: toInt-impl, reason: not valid java name */
    public static final int m28096toIntimpl(long j, @yfb lt4 lt4Var) {
        md8.checkNotNullParameter(lt4Var, "unit");
        return (int) kpd.coerceIn(m28098toLongimpl(j, lt4Var), -2147483648L, 2147483647L);
    }

    @yfb
    /* JADX INFO: renamed from: toIsoString-impl, reason: not valid java name */
    public static final String m28097toIsoStringimpl(long j) {
        StringBuilder sb = new StringBuilder();
        if (m28085isNegativeimpl(j)) {
            sb.append('-');
        }
        sb.append("PT");
        long jM28065getAbsoluteValueUwyO8pc = m28065getAbsoluteValueUwyO8pc(j);
        long jM28068getInWholeHoursimpl = m28068getInWholeHoursimpl(jM28065getAbsoluteValueUwyO8pc);
        int iM28074getMinutesComponentimpl = m28074getMinutesComponentimpl(jM28065getAbsoluteValueUwyO8pc);
        int iM28076getSecondsComponentimpl = m28076getSecondsComponentimpl(jM28065getAbsoluteValueUwyO8pc);
        int iM28075getNanosecondsComponentimpl = m28075getNanosecondsComponentimpl(jM28065getAbsoluteValueUwyO8pc);
        if (m28084isInfiniteimpl(j)) {
            jM28068getInWholeHoursimpl = 9999999999999L;
        }
        boolean z = false;
        boolean z2 = jM28068getInWholeHoursimpl != 0;
        boolean z3 = (iM28076getSecondsComponentimpl == 0 && iM28075getNanosecondsComponentimpl == 0) ? false : true;
        if (iM28074getMinutesComponentimpl != 0 || (z3 && z2)) {
            z = true;
        }
        if (z2) {
            sb.append(jM28068getInWholeHoursimpl);
            sb.append(sjc.f82018h);
        }
        if (z) {
            sb.append(iM28074getMinutesComponentimpl);
            sb.append(sjc.f82014d);
        }
        if (z3 || (!z2 && !z)) {
            m28056appendFractionalimpl(j, sb, iM28076getSecondsComponentimpl, iM28075getNanosecondsComponentimpl, 9, k95.f53020R4, true);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: toLong-impl, reason: not valid java name */
    public static final long m28098toLongimpl(long j, @yfb lt4 lt4Var) {
        md8.checkNotNullParameter(lt4Var, "unit");
        if (j == f14713d) {
            return Long.MAX_VALUE;
        }
        if (j == f14714e) {
            return Long.MIN_VALUE;
        }
        return nt4.convertDurationUnit(m28079getValueimpl(j), m28077getStorageUnitimpl(j), lt4Var);
    }

    @yfb
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m28099toStringimpl(long j) {
        if (j == 0) {
            return "0s";
        }
        if (j == f14713d) {
            return "Infinity";
        }
        if (j == f14714e) {
            return "-Infinity";
        }
        boolean zM28085isNegativeimpl = m28085isNegativeimpl(j);
        StringBuilder sb = new StringBuilder();
        if (zM28085isNegativeimpl) {
            sb.append('-');
        }
        long jM28065getAbsoluteValueUwyO8pc = m28065getAbsoluteValueUwyO8pc(j);
        long jM28067getInWholeDaysimpl = m28067getInWholeDaysimpl(jM28065getAbsoluteValueUwyO8pc);
        int iM28066getHoursComponentimpl = m28066getHoursComponentimpl(jM28065getAbsoluteValueUwyO8pc);
        int iM28074getMinutesComponentimpl = m28074getMinutesComponentimpl(jM28065getAbsoluteValueUwyO8pc);
        int iM28076getSecondsComponentimpl = m28076getSecondsComponentimpl(jM28065getAbsoluteValueUwyO8pc);
        int iM28075getNanosecondsComponentimpl = m28075getNanosecondsComponentimpl(jM28065getAbsoluteValueUwyO8pc);
        int i = 0;
        boolean z = jM28067getInWholeDaysimpl != 0;
        boolean z2 = iM28066getHoursComponentimpl != 0;
        boolean z3 = iM28074getMinutesComponentimpl != 0;
        boolean z4 = (iM28076getSecondsComponentimpl == 0 && iM28075getNanosecondsComponentimpl == 0) ? false : true;
        if (z) {
            sb.append(jM28067getInWholeDaysimpl);
            sb.append('d');
            i = 1;
        }
        if (z2 || (z && (z3 || z4))) {
            int i2 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(iM28066getHoursComponentimpl);
            sb.append(sjc.f82017g);
            i = i2;
        }
        if (z3 || (z4 && (z2 || z))) {
            int i3 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(iM28074getMinutesComponentimpl);
            sb.append(sjc.f82013c);
            i = i3;
        }
        if (z4) {
            int i4 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            if (iM28076getSecondsComponentimpl != 0 || z || z2 || z3) {
                m28056appendFractionalimpl(j, sb, iM28076getSecondsComponentimpl, iM28075getNanosecondsComponentimpl, 9, "s", false);
            } else if (iM28075getNanosecondsComponentimpl >= 1000000) {
                m28056appendFractionalimpl(j, sb, iM28075getNanosecondsComponentimpl / 1000000, iM28075getNanosecondsComponentimpl % 1000000, 6, "ms", false);
            } else if (iM28075getNanosecondsComponentimpl >= 1000) {
                m28056appendFractionalimpl(j, sb, iM28075getNanosecondsComponentimpl / 1000, iM28075getNanosecondsComponentimpl % 1000, 3, "us", false);
            } else {
                sb.append(iM28075getNanosecondsComponentimpl);
                sb.append("ns");
            }
            i = i4;
        }
        if (zM28085isNegativeimpl && i > 1) {
            sb.insert(1, '(').append(')');
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: toString-impl$default, reason: not valid java name */
    public static /* synthetic */ String m28101toStringimpl$default(long j, lt4 lt4Var, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return m28100toStringimpl(j, lt4Var, i);
    }

    /* JADX INFO: renamed from: truncateTo-UwyO8pc$kotlin_stdlib, reason: not valid java name */
    public static final long m28102truncateToUwyO8pc$kotlin_stdlib(long j, @yfb lt4 lt4Var) {
        md8.checkNotNullParameter(lt4Var, "unit");
        lt4 lt4VarM28077getStorageUnitimpl = m28077getStorageUnitimpl(j);
        if (lt4Var.compareTo(lt4VarM28077getStorageUnitimpl) <= 0 || m28084isInfiniteimpl(j)) {
            return j;
        }
        return ft4.toDuration(m28079getValueimpl(j) - (m28079getValueimpl(j) % nt4.convertDurationUnit(1L, lt4Var, lt4VarM28077getStorageUnitimpl)), lt4VarM28077getStorageUnitimpl);
    }

    /* JADX INFO: renamed from: unaryMinus-UwyO8pc, reason: not valid java name */
    public static final long m28103unaryMinusUwyO8pc(long j) {
        return ft4.durationOf(-m28079getValueimpl(j), ((int) j) & 1);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(bt4 bt4Var) {
        return m28104compareToLRDsOJo(bt4Var.m28105unboximpl());
    }

    /* JADX INFO: renamed from: compareTo-LRDsOJo, reason: not valid java name */
    public int m28104compareToLRDsOJo(long j) {
        return m28058compareToLRDsOJo(this.f14715a, j);
    }

    public boolean equals(Object obj) {
        return m28063equalsimpl(this.f14715a, obj);
    }

    public int hashCode() {
        return m28080hashCodeimpl(this.f14715a);
    }

    @yfb
    public String toString() {
        return m28099toStringimpl(this.f14715a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m28105unboximpl() {
        return this.f14715a;
    }

    /* JADX INFO: renamed from: compareTo-LRDsOJo, reason: not valid java name */
    public static int m28058compareToLRDsOJo(long j, long j2) {
        long j3 = j ^ j2;
        if (j3 < 0 || (((int) j3) & 1) == 0) {
            return md8.compare(j, j2);
        }
        int i = (((int) j) & 1) - (((int) j2) & 1);
        return m28085isNegativeimpl(j) ? -i : i;
    }

    /* JADX INFO: renamed from: toComponents-impl, reason: not valid java name */
    public static final <T> T m28093toComponentsimpl(long j, @yfb oz6<? super Long, ? super Integer, ? super Integer, ? super Integer, ? extends T> oz6Var) {
        md8.checkNotNullParameter(oz6Var, "action");
        return oz6Var.invoke(Long.valueOf(m28068getInWholeHoursimpl(j)), Integer.valueOf(m28074getMinutesComponentimpl(j)), Integer.valueOf(m28076getSecondsComponentimpl(j)), Integer.valueOf(m28075getNanosecondsComponentimpl(j)));
    }

    /* JADX INFO: renamed from: toComponents-impl, reason: not valid java name */
    public static final <T> T m28092toComponentsimpl(long j, @yfb kz6<? super Long, ? super Integer, ? super Integer, ? extends T> kz6Var) {
        md8.checkNotNullParameter(kz6Var, "action");
        return kz6Var.invoke(Long.valueOf(m28071getInWholeMinutesimpl(j)), Integer.valueOf(m28076getSecondsComponentimpl(j)), Integer.valueOf(m28075getNanosecondsComponentimpl(j)));
    }

    /* JADX INFO: renamed from: toComponents-impl, reason: not valid java name */
    public static final <T> T m28091toComponentsimpl(long j, @yfb gz6<? super Long, ? super Integer, ? extends T> gz6Var) {
        md8.checkNotNullParameter(gz6Var, "action");
        return gz6Var.invoke(Long.valueOf(m28073getInWholeSecondsimpl(j)), Integer.valueOf(m28075getNanosecondsComponentimpl(j)));
    }

    /* JADX INFO: renamed from: div-UwyO8pc, reason: not valid java name */
    public static final long m28061divUwyO8pc(long j, double d) {
        int iRoundToInt = p3a.roundToInt(d);
        if (iRoundToInt == d && iRoundToInt != 0) {
            return m28062divUwyO8pc(j, iRoundToInt);
        }
        lt4 lt4VarM28077getStorageUnitimpl = m28077getStorageUnitimpl(j);
        return ft4.toDuration(m28095toDoubleimpl(j, lt4VarM28077getStorageUnitimpl) / d, lt4VarM28077getStorageUnitimpl);
    }

    /* JADX INFO: renamed from: times-UwyO8pc, reason: not valid java name */
    public static final long m28089timesUwyO8pc(long j, double d) {
        int iRoundToInt = p3a.roundToInt(d);
        if (iRoundToInt == d) {
            return m28090timesUwyO8pc(j, iRoundToInt);
        }
        lt4 lt4VarM28077getStorageUnitimpl = m28077getStorageUnitimpl(j);
        return ft4.toDuration(m28095toDoubleimpl(j, lt4VarM28077getStorageUnitimpl) * d, lt4VarM28077getStorageUnitimpl);
    }

    @yfb
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static final String m28100toStringimpl(long j, @yfb lt4 lt4Var, int i) {
        md8.checkNotNullParameter(lt4Var, "unit");
        if (i >= 0) {
            double dM28095toDoubleimpl = m28095toDoubleimpl(j, lt4Var);
            if (Double.isInfinite(dM28095toDoubleimpl)) {
                return String.valueOf(dM28095toDoubleimpl);
            }
            return et4.formatToExactDecimals(dM28095toDoubleimpl, kpd.coerceAtMost(i, 12)) + ot4.shortName(lt4Var);
        }
        throw new IllegalArgumentException(("decimals must be not negative, but was " + i).toString());
    }
}
