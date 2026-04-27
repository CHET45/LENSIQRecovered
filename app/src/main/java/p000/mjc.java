package p000;

import android.graphics.Path;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nPath.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Path.kt\nandroidx/core/graphics/PathKt\n*L\n1#1,80:1\n43#1,3:81\n*S KotlinDebug\n*F\n+ 1 Path.kt\nandroidx/core/graphics/PathKt\n*L\n60#1:81,3\n*E\n"})
@igg({"ClassVerificationFailure"})
public final class mjc {
    @yfb
    public static final Path and(@yfb Path path, @yfb Path path2) {
        Path path3 = new Path();
        path3.op(path, path2, Path.Op.INTERSECT);
        return path3;
    }

    @c5e(26)
    @yfb
    public static final Iterable<ckc> flatten(@yfb Path path, float f) {
        return hkc.flatten(path, f);
    }

    public static /* synthetic */ Iterable flatten$default(Path path, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.5f;
        }
        return flatten(path, f);
    }

    @yfb
    public static final Path minus(@yfb Path path, @yfb Path path2) {
        Path path3 = new Path(path);
        path3.op(path2, Path.Op.DIFFERENCE);
        return path3;
    }

    @yfb
    /* JADX INFO: renamed from: or */
    public static final Path m17345or(@yfb Path path, @yfb Path path2) {
        Path path3 = new Path(path);
        path3.op(path2, Path.Op.UNION);
        return path3;
    }

    @yfb
    public static final Path plus(@yfb Path path, @yfb Path path2) {
        Path path3 = new Path(path);
        path3.op(path2, Path.Op.UNION);
        return path3;
    }

    @yfb
    public static final Path xor(@yfb Path path, @yfb Path path2) {
        Path path3 = new Path(path);
        path3.op(path2, Path.Op.XOR);
        return path3;
    }
}
