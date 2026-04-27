package p000;

/* JADX INFO: loaded from: classes.dex */
@vn8
@dwf({"SMAP\nFloat16.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Float16.kt\nandroidx/compose/ui/graphics/Float16\n+ 2 Float16.kt\nandroidx/compose/ui/graphics/Float16Kt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,716:1\n604#2,38:717\n649#2,12:755\n661#2,17:768\n591#2,4:785\n22#3:767\n*S KotlinDebug\n*F\n+ 1 Float16.kt\nandroidx/compose/ui/graphics/Float16\n*L\n97#1:717,38\n150#1:755,12\n150#1:768,17\n216#1:785,4\n150#1:767\n*E\n"})
public final class v36 implements Comparable<v36> {

    /* JADX INFO: renamed from: c */
    public static final int f89823c = 16;

    /* JADX INFO: renamed from: e */
    public static final int f89825e = 15;

    /* JADX INFO: renamed from: f */
    public static final int f89826f = -14;

    /* JADX INFO: renamed from: a */
    public final short f89828a;

    /* JADX INFO: renamed from: b */
    @yfb
    public static final C13840a f89822b = new C13840a(null);

    /* JADX INFO: renamed from: d */
    public static final short f89824d = m32685constructorimpl((short) 5120);

    /* JADX INFO: renamed from: m */
    public static final short f89827m = m32685constructorimpl((short) -1025);

    /* JADX INFO: renamed from: C */
    public static final short f89814C = m32685constructorimpl((short) 31743);

    /* JADX INFO: renamed from: F */
    public static final short f89815F = m32685constructorimpl((short) 1024);

    /* JADX INFO: renamed from: H */
    public static final short f89816H = m32685constructorimpl((short) 1);

    /* JADX INFO: renamed from: L */
    public static final short f89817L = m32685constructorimpl((short) 32256);

    /* JADX INFO: renamed from: M */
    public static final short f89818M = m32685constructorimpl((short) -1024);

    /* JADX INFO: renamed from: N */
    public static final short f89819N = m32685constructorimpl(taf.f84094b);

    /* JADX INFO: renamed from: Q */
    public static final short f89820Q = m32685constructorimpl((short) 31744);

    /* JADX INFO: renamed from: X */
    public static final short f89821X = m32685constructorimpl((short) 0);

    /* JADX INFO: renamed from: v36$a */
    public static final class C13840a {
        public /* synthetic */ C13840a(jt3 jt3Var) {
            this();
        }

        /* JADX INFO: renamed from: getEpsilon-slo4al4, reason: not valid java name */
        public final short m32712getEpsilonslo4al4() {
            return v36.f89824d;
        }

        /* JADX INFO: renamed from: getLowestValue-slo4al4, reason: not valid java name */
        public final short m32713getLowestValueslo4al4() {
            return v36.f89827m;
        }

        /* JADX INFO: renamed from: getMaxValue-slo4al4, reason: not valid java name */
        public final short m32714getMaxValueslo4al4() {
            return v36.f89814C;
        }

        /* JADX INFO: renamed from: getMinNormal-slo4al4, reason: not valid java name */
        public final short m32715getMinNormalslo4al4() {
            return v36.f89815F;
        }

        /* JADX INFO: renamed from: getMinValue-slo4al4, reason: not valid java name */
        public final short m32716getMinValueslo4al4() {
            return v36.f89816H;
        }

        /* JADX INFO: renamed from: getNaN-slo4al4, reason: not valid java name */
        public final short m32717getNaNslo4al4() {
            return v36.f89817L;
        }

        /* JADX INFO: renamed from: getNegativeInfinity-slo4al4, reason: not valid java name */
        public final short m32718getNegativeInfinityslo4al4() {
            return v36.f89818M;
        }

        /* JADX INFO: renamed from: getNegativeZero-slo4al4, reason: not valid java name */
        public final short m32719getNegativeZeroslo4al4() {
            return v36.f89819N;
        }

        /* JADX INFO: renamed from: getPositiveInfinity-slo4al4, reason: not valid java name */
        public final short m32720getPositiveInfinityslo4al4() {
            return v36.f89820Q;
        }

        /* JADX INFO: renamed from: getPositiveZero-slo4al4, reason: not valid java name */
        public final short m32721getPositiveZeroslo4al4() {
            return v36.f89821X;
        }

        private C13840a() {
        }
    }

    private /* synthetic */ v36(short s) {
        this.f89828a = s;
    }

    /* JADX INFO: renamed from: absoluteValue-slo4al4, reason: not valid java name */
    public static final short m32679absoluteValueslo4al4(short s) {
        return m32685constructorimpl((short) (s & taf.f84095c));
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ v36 m32680boximpl(short s) {
        return new v36(s);
    }

    /* JADX INFO: renamed from: ceil-slo4al4, reason: not valid java name */
    public static final short m32681ceilslo4al4(short s) {
        int i = 65535 & s;
        int i2 = s & taf.f84095c;
        if (i2 < 15360) {
            i = ((-((~(i >> 15)) & (i2 == 0 ? 0 : 1))) & 15360) | (s & taf.f84094b);
        } else if (i2 < 25600) {
            int i3 = (1 << (25 - (i2 >> 10))) - 1;
            i = (i + (((i >> 15) - 1) & i3)) & (~i3);
        }
        return m32685constructorimpl((short) i);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static short m32685constructorimpl(short s) {
        return s;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m32686equalsimpl(short s, Object obj) {
        return (obj instanceof v36) && s == ((v36) obj).m32711unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m32687equalsimpl0(short s, short s2) {
        return s == s2;
    }

    /* JADX INFO: renamed from: floor-slo4al4, reason: not valid java name */
    public static final short m32688floorslo4al4(short s) {
        int i = s & iqh.f48007d;
        int i2 = s & taf.f84095c;
        if (i2 < 15360) {
            i = (s & taf.f84094b) | ((i <= 32768 ? 0 : 65535) & 15360);
        } else if (i2 < 25600) {
            int i3 = (1 << (25 - (i2 >> 10))) - 1;
            i = (i + ((-(i >> 15)) & i3)) & (~i3);
        }
        return m32685constructorimpl((short) i);
    }

    /* JADX INFO: renamed from: getExponent-impl, reason: not valid java name */
    public static final int m32689getExponentimpl(short s) {
        return ((s >>> 10) & 31) - 15;
    }

    /* JADX INFO: renamed from: getSign-slo4al4, reason: not valid java name */
    public static final short m32690getSignslo4al4(short s) {
        return m32695isNaNimpl(s) ? f89817L : m32682compareTo41bOqos(s, f89819N) < 0 ? w36.f93153b : m32682compareTo41bOqos(s, f89821X) > 0 ? w36.f93152a : s;
    }

    /* JADX INFO: renamed from: getSignificand-impl, reason: not valid java name */
    public static final int m32691getSignificandimpl(short s) {
        return s & 1023;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m32692hashCodeimpl(short s) {
        return Short.hashCode(s);
    }

    /* JADX INFO: renamed from: isFinite-impl, reason: not valid java name */
    public static final boolean m32693isFiniteimpl(short s) {
        return (s & taf.f84095c) != 31744;
    }

    /* JADX INFO: renamed from: isInfinite-impl, reason: not valid java name */
    public static final boolean m32694isInfiniteimpl(short s) {
        return (s & taf.f84095c) == 31744;
    }

    /* JADX INFO: renamed from: isNaN-impl, reason: not valid java name */
    public static final boolean m32695isNaNimpl(short s) {
        return (s & taf.f84095c) > 31744;
    }

    /* JADX INFO: renamed from: isNormalized-impl, reason: not valid java name */
    public static final boolean m32696isNormalizedimpl(short s) {
        int i = s & 31744;
        return (i == 0 || i == 31744) ? false : true;
    }

    /* JADX INFO: renamed from: round-slo4al4, reason: not valid java name */
    public static final short m32697roundslo4al4(short s) {
        int i = s & iqh.f48007d;
        int i2 = s & taf.f84095c;
        if (i2 < 15360) {
            i = (s & taf.f84094b) | ((i2 < 14336 ? 0 : 65535) & 15360);
        } else if (i2 < 25600) {
            int i3 = i2 >> 10;
            i = (i + (1 << (24 - i3))) & (~((1 << (25 - i3)) - 1));
        }
        return m32685constructorimpl((short) i);
    }

    /* JADX INFO: renamed from: toBits-impl, reason: not valid java name */
    public static final int m32698toBitsimpl(short s) {
        return m32695isNaNimpl(s) ? f89817L : s & iqh.f48007d;
    }

    /* JADX INFO: renamed from: toByte-impl, reason: not valid java name */
    public static final byte m32699toByteimpl(short s) {
        return (byte) m32701toFloatimpl(s);
    }

    /* JADX INFO: renamed from: toDouble-impl, reason: not valid java name */
    public static final double m32700toDoubleimpl(short s) {
        return m32701toFloatimpl(s);
    }

    /* JADX INFO: renamed from: toFloat-impl, reason: not valid java name */
    public static final float m32701toFloatimpl(short s) {
        int i;
        int i2;
        int i3;
        int i4 = Short.MIN_VALUE & s;
        int i5 = ((65535 & s) >>> 10) & 31;
        int i6 = s & 1023;
        if (i5 != 0) {
            int i7 = i6 << 13;
            if (i5 == 31) {
                i = 255;
                if (i7 != 0) {
                    i7 |= 4194304;
                }
            } else {
                i = i5 + 112;
            }
            int i8 = i;
            i2 = i7;
            i3 = i8;
        } else {
            if (i6 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i6 + w36.f93168q) - w36.f93169r;
                return i4 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return Float.intBitsToFloat((i3 << 23) | (i4 << 16) | i2);
    }

    @yfb
    /* JADX INFO: renamed from: toHexString-impl, reason: not valid java name */
    public static final String m32702toHexStringimpl(short s) {
        StringBuilder sb = new StringBuilder();
        int i = 65535 & s;
        int i2 = i >>> 15;
        int i3 = (i >>> 10) & 31;
        int i4 = s & 1023;
        if (i3 != 31) {
            if (i2 == 1) {
                sb.append('-');
            }
            if (i3 != 0) {
                sb.append("0x1.");
                String string = Integer.toString(i4, tw1.checkRadix(16));
                md8.checkNotNullExpressionValue(string, "toString(this, checkRadix(radix))");
                sb.append(new owd("0{2,}$").replaceFirst(string, ""));
                sb.append('p');
                sb.append(String.valueOf(i3 - 15));
            } else if (i4 == 0) {
                sb.append("0x0.0p0");
            } else {
                sb.append("0x0.");
                String string2 = Integer.toString(i4, tw1.checkRadix(16));
                md8.checkNotNullExpressionValue(string2, "toString(this, checkRadix(radix))");
                sb.append(new owd("0{2,}$").replaceFirst(string2, ""));
                sb.append("p-14");
            }
        } else if (i4 == 0) {
            if (i2 != 0) {
                sb.append('-');
            }
            sb.append("Infinity");
        } else {
            sb.append("NaN");
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: toInt-impl, reason: not valid java name */
    public static final int m32703toIntimpl(short s) {
        return (int) m32701toFloatimpl(s);
    }

    /* JADX INFO: renamed from: toLong-impl, reason: not valid java name */
    public static final long m32704toLongimpl(short s) {
        return (long) m32701toFloatimpl(s);
    }

    /* JADX INFO: renamed from: toRawBits-impl, reason: not valid java name */
    public static final int m32705toRawBitsimpl(short s) {
        return s & iqh.f48007d;
    }

    /* JADX INFO: renamed from: toShort-impl, reason: not valid java name */
    public static final short m32706toShortimpl(short s) {
        return (short) m32701toFloatimpl(s);
    }

    @yfb
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m32707toStringimpl(short s) {
        return String.valueOf(m32701toFloatimpl(s));
    }

    /* JADX INFO: renamed from: trunc-slo4al4, reason: not valid java name */
    public static final short m32708truncslo4al4(short s) {
        int i = 65535 & s;
        int i2 = s & taf.f84095c;
        if (i2 < 15360) {
            i = Short.MIN_VALUE & s;
        } else if (i2 < 25600) {
            i &= ~((1 << (25 - (i2 >> 10))) - 1);
        }
        return m32685constructorimpl((short) i);
    }

    /* JADX INFO: renamed from: withSign-qCeQghg, reason: not valid java name */
    public static final short m32709withSignqCeQghg(short s, short s2) {
        return m32685constructorimpl((short) ((s & taf.f84095c) | (s2 & taf.f84094b)));
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(v36 v36Var) {
        return m32710compareTo41bOqos(v36Var.m32711unboximpl());
    }

    /* JADX INFO: renamed from: compareTo-41bOqos, reason: not valid java name */
    public int m32710compareTo41bOqos(short s) {
        return m32682compareTo41bOqos(this.f89828a, s);
    }

    public boolean equals(Object obj) {
        return m32686equalsimpl(this.f89828a, obj);
    }

    public final short getHalfValue() {
        return this.f89828a;
    }

    public int hashCode() {
        return m32692hashCodeimpl(this.f89828a);
    }

    @yfb
    public String toString() {
        return m32707toStringimpl(this.f89828a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ short m32711unboximpl() {
        return this.f89828a;
    }

    /* JADX INFO: renamed from: compareTo-41bOqos, reason: not valid java name */
    public static int m32682compareTo41bOqos(short s, short s2) {
        if (m32695isNaNimpl(s)) {
            return !m32695isNaNimpl(s2) ? 1 : 0;
        }
        if (m32695isNaNimpl(s2)) {
            return -1;
        }
        return md8.compare((s & 32768) != 0 ? 32768 - (s & iqh.f48007d) : s & iqh.f48007d, (s2 & 32768) != 0 ? 32768 - (s2 & iqh.f48007d) : s2 & iqh.f48007d);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static short m32683constructorimpl(double d) {
        return m32684constructorimpl((float) d);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static short m32684constructorimpl(float f) {
        int i;
        int iFloatToRawIntBits = Float.floatToRawIntBits(f);
        int i2 = iFloatToRawIntBits >>> 31;
        int i3 = (iFloatToRawIntBits >>> 23) & 255;
        int i4 = 8388607 & iFloatToRawIntBits;
        int i5 = 31;
        int i6 = 0;
        if (i3 != 255) {
            int i7 = i3 - 112;
            if (i7 >= 31) {
                i5 = 49;
            } else if (i7 > 0) {
                i6 = i4 >> 13;
                if ((iFloatToRawIntBits & 4096) != 0) {
                    i = (((i7 << 10) | i6) + 1) | (i2 << 15);
                    return m32685constructorimpl((short) i);
                }
                i5 = i7;
            } else if (i7 >= -10) {
                int i8 = (8388608 | i4) >> (1 - i7);
                if ((i8 & 4096) != 0) {
                    i8 += 8192;
                }
                i5 = 0;
                i6 = i8 >> 13;
            } else {
                i5 = 0;
            }
        } else if (i4 != 0) {
            i6 = 512;
        }
        i = (i2 << 15) | (i5 << 10) | i6;
        return m32685constructorimpl((short) i);
    }
}
