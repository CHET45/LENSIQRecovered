package p000;

import android.util.Half;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nHalf.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Half.kt\nandroidx/core/util/HalfKt\n*L\n1#1,60:1\n43#1:61\n*S KotlinDebug\n*F\n+ 1 Half.kt\nandroidx/core/util/HalfKt\n*L\n51#1:61\n*E\n"})
@igg({"ClassVerificationFailure"})
public final class wd7 {
    @c5e(26)
    @yfb
    public static final Half toHalf(short s) {
        return Half.valueOf(s);
    }

    @c5e(26)
    @yfb
    public static final Half toHalf(float f) {
        return Half.valueOf(f);
    }

    @c5e(26)
    @yfb
    public static final Half toHalf(@yfb String str) {
        return Half.valueOf(str);
    }

    @c5e(26)
    @yfb
    public static final Half toHalf(double d) {
        return Half.valueOf((float) d);
    }
}
