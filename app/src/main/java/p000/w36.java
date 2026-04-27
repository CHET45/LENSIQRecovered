package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nFloat16.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Float16.kt\nandroidx/compose/ui/graphics/Float16Kt\n+ 2 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,716:1\n22#2:717\n22#2:718\n22#2:719\n*S KotlinDebug\n*F\n+ 1 Float16.kt\nandroidx/compose/ui/graphics/Float16Kt\n*L\n660#1:717\n677#1:718\n587#1:719\n*E\n"})
public final class w36 {

    /* JADX INFO: renamed from: c */
    public static final int f93154c = 15;

    /* JADX INFO: renamed from: d */
    public static final int f93155d = 32768;

    /* JADX INFO: renamed from: e */
    public static final int f93156e = 10;

    /* JADX INFO: renamed from: f */
    public static final int f93157f = 31;

    /* JADX INFO: renamed from: g */
    public static final int f93158g = 1023;

    /* JADX INFO: renamed from: h */
    public static final int f93159h = 15;

    /* JADX INFO: renamed from: i */
    public static final int f93160i = 32767;

    /* JADX INFO: renamed from: j */
    public static final int f93161j = 31744;

    /* JADX INFO: renamed from: k */
    public static final int f93162k = 31;

    /* JADX INFO: renamed from: l */
    public static final int f93163l = 23;

    /* JADX INFO: renamed from: m */
    public static final int f93164m = 255;

    /* JADX INFO: renamed from: n */
    public static final int f93165n = 8388607;

    /* JADX INFO: renamed from: o */
    public static final int f93166o = 127;

    /* JADX INFO: renamed from: p */
    public static final int f93167p = 4194304;

    /* JADX INFO: renamed from: a */
    public static final short f93152a = v36.m32684constructorimpl(1.0f);

    /* JADX INFO: renamed from: b */
    public static final short f93153b = v36.m32684constructorimpl(-1.0f);

    /* JADX INFO: renamed from: q */
    public static final int f93168q = 1056964608;

    /* JADX INFO: renamed from: r */
    public static final float f93169r = Float.intBitsToFloat(f93168q);

    public static final short floatToHalf(float f) {
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
                    return (short) i;
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
        return (short) i;
    }

    public static final float halfToFloat(short s) {
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
                float fIntBitsToFloat = Float.intBitsToFloat(i6 + f93168q) - f93169r;
                return i4 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return Float.intBitsToFloat((i3 << 23) | (i4 << 16) | i2);
    }

    /* JADX INFO: renamed from: max-AoSsdG0, reason: not valid java name */
    public static final short m32863maxAoSsdG0(short s, short s2) {
        return (v36.m32695isNaNimpl(s) || v36.m32695isNaNimpl(s2)) ? v36.f89822b.m32717getNaNslo4al4() : v36.m32682compareTo41bOqos(s, s2) >= 0 ? s : s2;
    }

    /* JADX INFO: renamed from: min-AoSsdG0, reason: not valid java name */
    public static final short m32864minAoSsdG0(short s, short s2) {
        return (v36.m32695isNaNimpl(s) || v36.m32695isNaNimpl(s2)) ? v36.f89822b.m32717getNaNslo4al4() : v36.m32682compareTo41bOqos(s, s2) <= 0 ? s : s2;
    }

    private static final int toCompareValue(short s) {
        return (s & taf.f84094b) != 0 ? 32768 - (s & iqh.f48007d) : s & iqh.f48007d;
    }
}
