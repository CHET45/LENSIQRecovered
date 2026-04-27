package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nInlineClassHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 2 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,116:1\n22#2:117\n22#2:118\n22#2:119\n22#2:120\n*S KotlinDebug\n*F\n+ 1 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n72#1:117\n79#1:118\n86#1:119\n93#1:120\n*E\n"})
public final class i28 {
    public static final long packFloats(float f, float f2) {
        return (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public static final long packInts(int i, int i2) {
        return (((long) i2) & 4294967295L) | (((long) i) << 32);
    }

    public static final float unpackAbsFloat1(long j) {
        return Float.intBitsToFloat((int) ((j >> 32) & 2147483647L));
    }

    public static final float unpackAbsFloat2(long j) {
        return Float.intBitsToFloat((int) (j & 2147483647L));
    }

    public static final float unpackFloat1(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final float unpackFloat2(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static final int unpackInt1(long j) {
        return (int) (j >> 32);
    }

    public static final int unpackInt2(long j) {
        return (int) (j & 4294967295L);
    }
}
