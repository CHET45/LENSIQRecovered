package p000;

import p000.ijc;

/* JADX INFO: loaded from: classes.dex */
public interface vic {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final C14094a f91257a = C14094a.f91258a;

    /* JADX INFO: renamed from: vic$a */
    public static final class C14094a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ C14094a f91258a = new C14094a();

        private C14094a() {
        }

        @yfb
        /* JADX INFO: renamed from: combine-xh6zSI8, reason: not valid java name */
        public final vic m32766combinexh6zSI8(int i, @yfb vic vicVar, @yfb vic vicVar2) {
            vic vicVarPath = C8522ku.Path();
            if (vicVarPath.mo28699opN5in7k0(vicVar, vicVar2, i)) {
                return vicVarPath;
            }
            throw new IllegalArgumentException("Path.combine() failed.  This may be due an invalid path; in particular, check for NaN values.");
        }
    }

    /* JADX INFO: renamed from: vic$b */
    public static final class C14095b {
        @yfb
        @Deprecated
        public static vic and(@yfb vic vicVar, @yfb vic vicVar2) {
            return vic.super.and(vicVar2);
        }

        @Deprecated
        public static void arcToRad(@yfb vic vicVar, @yfb rud rudVar, float f, float f2, boolean z) {
            vic.super.arcToRad(rudVar, f, f2, z);
        }

        @yfb
        @Deprecated
        public static ijc iterator(@yfb vic vicVar) {
            return vic.super.iterator();
        }

        @yfb
        @Deprecated
        public static vic minus(@yfb vic vicVar, @yfb vic vicVar2) {
            return vic.super.minus(vicVar2);
        }

        @yfb
        @Deprecated
        /* JADX INFO: renamed from: or */
        public static vic m23991or(@yfb vic vicVar, @yfb vic vicVar2) {
            return vic.super.m23990or(vicVar2);
        }

        @yfb
        @Deprecated
        public static vic plus(@yfb vic vicVar, @yfb vic vicVar2) {
            return vic.super.plus(vicVar2);
        }

        @Deprecated
        public static void quadraticTo(@yfb vic vicVar, float f, float f2, float f3, float f4) {
            vic.super.quadraticTo(f, f2, f3, f4);
        }

        @Deprecated
        public static void relativeQuadraticTo(@yfb vic vicVar, float f, float f2, float f3, float f4) {
            vic.super.relativeQuadraticTo(f, f2, f3, f4);
        }

        @Deprecated
        public static void rewind(@yfb vic vicVar) {
            vic.super.rewind();
        }

        @Deprecated
        /* JADX INFO: renamed from: transform-58bKbWc, reason: not valid java name */
        public static void m32768transform58bKbWc(@yfb vic vicVar, @yfb float[] fArr) {
            vic.super.mo28701transform58bKbWc(fArr);
        }

        @yfb
        @Deprecated
        public static vic xor(@yfb vic vicVar, @yfb vic vicVar2) {
            return vic.super.xor(vicVar2);
        }

        @yfb
        @Deprecated
        public static ijc iterator(@yfb vic vicVar, @yfb ijc.EnumC7321a enumC7321a, float f) {
            return vic.super.iterator(enumC7321a, f);
        }
    }

    /* JADX INFO: renamed from: vic$c */
    public enum EnumC14096c {
        CounterClockwise,
        Clockwise
    }

    static /* synthetic */ void addOval$default(vic vicVar, rud rudVar, EnumC14096c enumC14096c, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addOval");
        }
        if ((i & 2) != 0) {
            enumC14096c = EnumC14096c.CounterClockwise;
        }
        vicVar.addOval(rudVar, enumC14096c);
    }

    /* JADX INFO: renamed from: addPath-Uv8p0NA$default, reason: not valid java name */
    static /* synthetic */ void m32765addPathUv8p0NA$default(vic vicVar, vic vicVar2, long j, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addPath-Uv8p0NA");
        }
        if ((i & 2) != 0) {
            j = izb.f49009b.m30445getZeroF1C5BW0();
        }
        vicVar.mo28697addPathUv8p0NA(vicVar2, j);
    }

    static /* synthetic */ void addRect$default(vic vicVar, rud rudVar, EnumC14096c enumC14096c, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addRect");
        }
        if ((i & 2) != 0) {
            enumC14096c = EnumC14096c.CounterClockwise;
        }
        vicVar.addRect(rudVar, enumC14096c);
    }

    static /* synthetic */ void addRoundRect$default(vic vicVar, mbe mbeVar, EnumC14096c enumC14096c, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addRoundRect");
        }
        if ((i & 2) != 0) {
            enumC14096c = EnumC14096c.CounterClockwise;
        }
        vicVar.addRoundRect(mbeVar, enumC14096c);
    }

    static /* synthetic */ ijc iterator$default(vic vicVar, ijc.EnumC7321a enumC7321a, float f, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: iterator");
        }
        if ((i & 2) != 0) {
            f = 0.25f;
        }
        return vicVar.iterator(enumC7321a, f);
    }

    void addArc(@yfb rud rudVar, float f, float f2);

    void addArcRad(@yfb rud rudVar, float f, float f2);

    @q64(level = u64.f86867c, message = "Prefer usage of addOval() with a winding direction", replaceWith = @i2e(expression = "addOval(oval)", imports = {}))
    /* synthetic */ void addOval(rud rudVar);

    void addOval(@yfb rud rudVar, @yfb EnumC14096c enumC14096c);

    /* JADX INFO: renamed from: addPath-Uv8p0NA */
    void mo28697addPathUv8p0NA(@yfb vic vicVar, long j);

    @q64(level = u64.f86867c, message = "Prefer usage of addRect() with a winding direction", replaceWith = @i2e(expression = "addRect(rect)", imports = {}))
    /* synthetic */ void addRect(rud rudVar);

    void addRect(@yfb rud rudVar, @yfb EnumC14096c enumC14096c);

    @q64(level = u64.f86867c, message = "Prefer usage of addRoundRect() with a winding direction", replaceWith = @i2e(expression = "addRoundRect(roundRect)", imports = {}))
    /* synthetic */ void addRoundRect(mbe mbeVar);

    void addRoundRect(@yfb mbe mbeVar, @yfb EnumC14096c enumC14096c);

    @yfb
    default vic and(@yfb vic vicVar) {
        vic vicVarPath = C8522ku.Path();
        vicVarPath.mo28699opN5in7k0(this, vicVar, tjc.f85067b.m32408getIntersectb3I0S0c());
        return vicVarPath;
    }

    void arcTo(@yfb rud rudVar, float f, float f2, boolean z);

    default void arcToRad(@yfb rud rudVar, float f, float f2, boolean z) {
        arcTo(rudVar, n34.degrees(f), n34.degrees(f2), z);
    }

    void close();

    void cubicTo(float f, float f2, float f3, float f4, float f5, float f6);

    @yfb
    rud getBounds();

    /* JADX INFO: renamed from: getFillType-Rg-k1Os */
    int mo28698getFillTypeRgk1Os();

    boolean isConvex();

    boolean isEmpty();

    @yfb
    default ijc iterator() {
        return C7020hu.PathIterator$default(this, null, 0.0f, 6, null);
    }

    void lineTo(float f, float f2);

    @yfb
    default vic minus(@yfb vic vicVar) {
        vic vicVarPath = C8522ku.Path();
        vicVarPath.mo28699opN5in7k0(this, vicVar, tjc.f85067b.m32407getDifferenceb3I0S0c());
        return vicVarPath;
    }

    void moveTo(float f, float f2);

    /* JADX INFO: renamed from: op-N5in7k0 */
    boolean mo28699opN5in7k0(@yfb vic vicVar, @yfb vic vicVar2, int i);

    @yfb
    /* JADX INFO: renamed from: or */
    default vic m23990or(@yfb vic vicVar) {
        return plus(vicVar);
    }

    @yfb
    default vic plus(@yfb vic vicVar) {
        vic vicVarPath = C8522ku.Path();
        vicVarPath.mo28699opN5in7k0(this, vicVar, tjc.f85067b.m32410getUnionb3I0S0c());
        return vicVarPath;
    }

    @q64(level = u64.f86865a, message = "Use quadraticTo() for consistency with cubicTo()", replaceWith = @i2e(expression = "quadraticTo(x1, y1, x2, y2)", imports = {}))
    void quadraticBezierTo(float f, float f2, float f3, float f4);

    default void quadraticTo(float f, float f2, float f3, float f4) {
        quadraticBezierTo(f, f2, f3, f4);
    }

    void relativeCubicTo(float f, float f2, float f3, float f4, float f5, float f6);

    void relativeLineTo(float f, float f2);

    void relativeMoveTo(float f, float f2);

    @q64(level = u64.f86865a, message = "Use relativeQuadraticTo() for consistency with relativeCubicTo()", replaceWith = @i2e(expression = "relativeQuadraticTo(dx1, dy1, dx2, dy2)", imports = {}))
    void relativeQuadraticBezierTo(float f, float f2, float f3, float f4);

    default void relativeQuadraticTo(float f, float f2, float f3, float f4) {
        relativeQuadraticBezierTo(f, f2, f3, f4);
    }

    void reset();

    default void rewind() {
        reset();
    }

    /* JADX INFO: renamed from: setFillType-oQ8Xj4U */
    void mo28700setFillTypeoQ8Xj4U(int i);

    /* JADX INFO: renamed from: transform-58bKbWc */
    default void mo28701transform58bKbWc(@yfb float[] fArr) {
    }

    /* JADX INFO: renamed from: translate-k-4lQ0M */
    void mo28702translatek4lQ0M(long j);

    @yfb
    default vic xor(@yfb vic vicVar) {
        vic vicVarPath = C8522ku.Path();
        vicVarPath.mo28699opN5in7k0(this, vicVar, tjc.f85067b.m32411getXorb3I0S0c());
        return vicVarPath;
    }

    @yfb
    default ijc iterator(@yfb ijc.EnumC7321a enumC7321a, float f) {
        return C7020hu.PathIterator(this, enumC7321a, f);
    }
}
