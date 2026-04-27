package p000;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import p000.tjc;
import p000.vic;

/* JADX INFO: renamed from: du */
/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nAndroidPath.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPath.android.kt\nandroidx/compose/ui/graphics/AndroidPath\n+ 2 AndroidPath.android.kt\nandroidx/compose/ui/graphics/AndroidPath_androidKt\n*L\n1#1,286:1\n38#2,5:287\n38#2,5:292\n*S KotlinDebug\n*F\n+ 1 AndroidPath.android.kt\nandroidx/compose/ui/graphics/AndroidPath\n*L\n205#1:287,5\n258#1:292,5\n*E\n"})
public final class C4947du implements vic {

    /* JADX INFO: renamed from: b */
    @yfb
    public final Path f30867b;

    /* JADX INFO: renamed from: c */
    @gib
    public RectF f30868c;

    /* JADX INFO: renamed from: d */
    @gib
    public float[] f30869d;

    /* JADX INFO: renamed from: e */
    @gib
    public Matrix f30870e;

    public C4947du() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ void isConvex$annotations() {
    }

    private final void validateRectangle(rud rudVar) {
        if (Float.isNaN(rudVar.getLeft()) || Float.isNaN(rudVar.getTop()) || Float.isNaN(rudVar.getRight()) || Float.isNaN(rudVar.getBottom())) {
            C8522ku.throwIllegalStateException("Invalid rectangle, make sure no value is NaN");
        }
    }

    @Override // p000.vic
    public void addArc(@yfb rud rudVar, float f, float f2) {
        validateRectangle(rudVar);
        if (this.f30868c == null) {
            this.f30868c = new RectF();
        }
        RectF rectF = this.f30868c;
        md8.checkNotNull(rectF);
        rectF.set(rudVar.getLeft(), rudVar.getTop(), rudVar.getRight(), rudVar.getBottom());
        Path path = this.f30867b;
        RectF rectF2 = this.f30868c;
        md8.checkNotNull(rectF2);
        path.addArc(rectF2, f, f2);
    }

    @Override // p000.vic
    public void addArcRad(@yfb rud rudVar, float f, float f2) {
        addArc(rudVar, n34.degrees(f), n34.degrees(f2));
    }

    @Override // p000.vic
    public /* synthetic */ void addOval(rud rudVar) {
        addOval(rudVar, vic.EnumC14096c.CounterClockwise);
    }

    @Override // p000.vic
    /* JADX INFO: renamed from: addPath-Uv8p0NA, reason: not valid java name */
    public void mo28697addPathUv8p0NA(@yfb vic vicVar, long j) {
        Path path = this.f30867b;
        if (!(vicVar instanceof C4947du)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        path.addPath(((C4947du) vicVar).getInternalPath(), izb.m30429getXimpl(j), izb.m30430getYimpl(j));
    }

    @Override // p000.vic
    public /* synthetic */ void addRect(rud rudVar) {
        addRect(rudVar, vic.EnumC14096c.CounterClockwise);
    }

    @Override // p000.vic
    public /* synthetic */ void addRoundRect(mbe mbeVar) {
        addRoundRect(mbeVar, vic.EnumC14096c.CounterClockwise);
    }

    @Override // p000.vic
    public void arcTo(@yfb rud rudVar, float f, float f2, boolean z) {
        float left = rudVar.getLeft();
        float top = rudVar.getTop();
        float right = rudVar.getRight();
        float bottom = rudVar.getBottom();
        if (this.f30868c == null) {
            this.f30868c = new RectF();
        }
        RectF rectF = this.f30868c;
        md8.checkNotNull(rectF);
        rectF.set(left, top, right, bottom);
        Path path = this.f30867b;
        RectF rectF2 = this.f30868c;
        md8.checkNotNull(rectF2);
        path.arcTo(rectF2, f, f2, z);
    }

    @Override // p000.vic
    public void close() {
        this.f30867b.close();
    }

    @Override // p000.vic
    public void cubicTo(float f, float f2, float f3, float f4, float f5, float f6) {
        this.f30867b.cubicTo(f, f2, f3, f4, f5, f6);
    }

    @Override // p000.vic
    @yfb
    public rud getBounds() {
        if (this.f30868c == null) {
            this.f30868c = new RectF();
        }
        RectF rectF = this.f30868c;
        md8.checkNotNull(rectF);
        this.f30867b.computeBounds(rectF, true);
        return new rud(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    @Override // p000.vic
    /* JADX INFO: renamed from: getFillType-Rg-k1Os, reason: not valid java name */
    public int mo28698getFillTypeRgk1Os() {
        return this.f30867b.getFillType() == Path.FillType.EVEN_ODD ? bjc.f13877b.m28004getEvenOddRgk1Os() : bjc.f13877b.m28005getNonZeroRgk1Os();
    }

    @yfb
    public final Path getInternalPath() {
        return this.f30867b;
    }

    @Override // p000.vic
    public boolean isConvex() {
        return this.f30867b.isConvex();
    }

    @Override // p000.vic
    public boolean isEmpty() {
        return this.f30867b.isEmpty();
    }

    @Override // p000.vic
    public void lineTo(float f, float f2) {
        this.f30867b.lineTo(f, f2);
    }

    @Override // p000.vic
    public void moveTo(float f, float f2) {
        this.f30867b.moveTo(f, f2);
    }

    @Override // p000.vic
    /* JADX INFO: renamed from: op-N5in7k0, reason: not valid java name */
    public boolean mo28699opN5in7k0(@yfb vic vicVar, @yfb vic vicVar2, int i) {
        tjc.C13074a c13074a = tjc.f85067b;
        Path.Op op = tjc.m32403equalsimpl0(i, c13074a.m32407getDifferenceb3I0S0c()) ? Path.Op.DIFFERENCE : tjc.m32403equalsimpl0(i, c13074a.m32408getIntersectb3I0S0c()) ? Path.Op.INTERSECT : tjc.m32403equalsimpl0(i, c13074a.m32409getReverseDifferenceb3I0S0c()) ? Path.Op.REVERSE_DIFFERENCE : tjc.m32403equalsimpl0(i, c13074a.m32410getUnionb3I0S0c()) ? Path.Op.UNION : Path.Op.XOR;
        Path path = this.f30867b;
        if (!(vicVar instanceof C4947du)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        Path internalPath = ((C4947du) vicVar).getInternalPath();
        if (vicVar2 instanceof C4947du) {
            return path.op(internalPath, ((C4947du) vicVar2).getInternalPath(), op);
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // p000.vic
    public void quadraticBezierTo(float f, float f2, float f3, float f4) {
        this.f30867b.quadTo(f, f2, f3, f4);
    }

    @Override // p000.vic
    public void quadraticTo(float f, float f2, float f3, float f4) {
        this.f30867b.quadTo(f, f2, f3, f4);
    }

    @Override // p000.vic
    public void relativeCubicTo(float f, float f2, float f3, float f4, float f5, float f6) {
        this.f30867b.rCubicTo(f, f2, f3, f4, f5, f6);
    }

    @Override // p000.vic
    public void relativeLineTo(float f, float f2) {
        this.f30867b.rLineTo(f, f2);
    }

    @Override // p000.vic
    public void relativeMoveTo(float f, float f2) {
        this.f30867b.rMoveTo(f, f2);
    }

    @Override // p000.vic
    public void relativeQuadraticBezierTo(float f, float f2, float f3, float f4) {
        this.f30867b.rQuadTo(f, f2, f3, f4);
    }

    @Override // p000.vic
    public void relativeQuadraticTo(float f, float f2, float f3, float f4) {
        this.f30867b.rQuadTo(f, f2, f3, f4);
    }

    @Override // p000.vic
    public void reset() {
        this.f30867b.reset();
    }

    @Override // p000.vic
    public void rewind() {
        this.f30867b.rewind();
    }

    @Override // p000.vic
    /* JADX INFO: renamed from: setFillType-oQ8Xj4U, reason: not valid java name */
    public void mo28700setFillTypeoQ8Xj4U(int i) {
        this.f30867b.setFillType(bjc.m28000equalsimpl0(i, bjc.f13877b.m28004getEvenOddRgk1Os()) ? Path.FillType.EVEN_ODD : Path.FillType.WINDING);
    }

    @Override // p000.vic
    /* JADX INFO: renamed from: transform-58bKbWc, reason: not valid java name */
    public void mo28701transform58bKbWc(@yfb float[] fArr) {
        if (this.f30870e == null) {
            this.f30870e = new Matrix();
        }
        Matrix matrix = this.f30870e;
        md8.checkNotNull(matrix);
        C12773st.m32333setFromEL8BTi8(matrix, fArr);
        Path path = this.f30867b;
        Matrix matrix2 = this.f30870e;
        md8.checkNotNull(matrix2);
        path.transform(matrix2);
    }

    @Override // p000.vic
    /* JADX INFO: renamed from: translate-k-4lQ0M, reason: not valid java name */
    public void mo28702translatek4lQ0M(long j) {
        Matrix matrix = this.f30870e;
        if (matrix == null) {
            this.f30870e = new Matrix();
        } else {
            md8.checkNotNull(matrix);
            matrix.reset();
        }
        Matrix matrix2 = this.f30870e;
        md8.checkNotNull(matrix2);
        matrix2.setTranslate(izb.m30429getXimpl(j), izb.m30430getYimpl(j));
        Path path = this.f30867b;
        Matrix matrix3 = this.f30870e;
        md8.checkNotNull(matrix3);
        path.transform(matrix3);
    }

    public C4947du(@yfb Path path) {
        this.f30867b = path;
    }

    @Override // p000.vic
    public void addOval(@yfb rud rudVar, @yfb vic.EnumC14096c enumC14096c) {
        if (this.f30868c == null) {
            this.f30868c = new RectF();
        }
        RectF rectF = this.f30868c;
        md8.checkNotNull(rectF);
        rectF.set(rudVar.getLeft(), rudVar.getTop(), rudVar.getRight(), rudVar.getBottom());
        Path path = this.f30867b;
        RectF rectF2 = this.f30868c;
        md8.checkNotNull(rectF2);
        path.addOval(rectF2, C8522ku.toPlatformPathDirection(enumC14096c));
    }

    @Override // p000.vic
    public void addRect(@yfb rud rudVar, @yfb vic.EnumC14096c enumC14096c) {
        validateRectangle(rudVar);
        if (this.f30868c == null) {
            this.f30868c = new RectF();
        }
        RectF rectF = this.f30868c;
        md8.checkNotNull(rectF);
        rectF.set(rudVar.getLeft(), rudVar.getTop(), rudVar.getRight(), rudVar.getBottom());
        Path path = this.f30867b;
        RectF rectF2 = this.f30868c;
        md8.checkNotNull(rectF2);
        path.addRect(rectF2, C8522ku.toPlatformPathDirection(enumC14096c));
    }

    @Override // p000.vic
    public void addRoundRect(@yfb mbe mbeVar, @yfb vic.EnumC14096c enumC14096c) {
        if (this.f30868c == null) {
            this.f30868c = new RectF();
        }
        RectF rectF = this.f30868c;
        md8.checkNotNull(rectF);
        rectF.set(mbeVar.getLeft(), mbeVar.getTop(), mbeVar.getRight(), mbeVar.getBottom());
        if (this.f30869d == null) {
            this.f30869d = new float[8];
        }
        float[] fArr = this.f30869d;
        md8.checkNotNull(fArr);
        fArr[0] = u03.m32492getXimpl(mbeVar.m30993getTopLeftCornerRadiuskKHJgLs());
        fArr[1] = u03.m32493getYimpl(mbeVar.m30993getTopLeftCornerRadiuskKHJgLs());
        fArr[2] = u03.m32492getXimpl(mbeVar.m30994getTopRightCornerRadiuskKHJgLs());
        fArr[3] = u03.m32493getYimpl(mbeVar.m30994getTopRightCornerRadiuskKHJgLs());
        fArr[4] = u03.m32492getXimpl(mbeVar.m30992getBottomRightCornerRadiuskKHJgLs());
        fArr[5] = u03.m32493getYimpl(mbeVar.m30992getBottomRightCornerRadiuskKHJgLs());
        fArr[6] = u03.m32492getXimpl(mbeVar.m30991getBottomLeftCornerRadiuskKHJgLs());
        fArr[7] = u03.m32493getYimpl(mbeVar.m30991getBottomLeftCornerRadiuskKHJgLs());
        Path path = this.f30867b;
        RectF rectF2 = this.f30868c;
        md8.checkNotNull(rectF2);
        float[] fArr2 = this.f30869d;
        md8.checkNotNull(fArr2);
        path.addRoundRect(rectF2, fArr2, C8522ku.toPlatformPathDirection(enumC14096c));
    }

    public /* synthetic */ C4947du(Path path, int i, jt3 jt3Var) {
        this((i & 1) != 0 ? new Path() : path);
    }
}
