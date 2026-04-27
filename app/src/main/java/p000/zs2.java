package p000;

import java.util.Arrays;
import p000.o92;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nConnector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Connector.kt\nandroidx/compose/ui/graphics/colorspace/Connector\n+ 2 Color.kt\nandroidx/compose/ui/graphics/Color\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,349:1\n231#2:350\n235#2,9:351\n72#3:360\n86#3:362\n22#4:361\n22#4:363\n*S KotlinDebug\n*F\n+ 1 Connector.kt\nandroidx/compose/ui/graphics/colorspace/Connector\n*L\n-1#1:350\n163#1:351,9\n165#1:360\n166#1:362\n165#1:361\n166#1:363\n*E\n"})
public class zs2 {

    /* JADX INFO: renamed from: g */
    @yfb
    public static final C16238a f105943g = new C16238a(null);

    /* JADX INFO: renamed from: a */
    @yfb
    public final ia2 f105944a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final ia2 f105945b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final ia2 f105946c;

    /* JADX INFO: renamed from: d */
    @yfb
    public final ia2 f105947d;

    /* JADX INFO: renamed from: e */
    public final int f105948e;

    /* JADX INFO: renamed from: f */
    @gib
    public final float[] f105949f;

    /* JADX INFO: renamed from: zs2$a */
    public static final class C16238a {

        /* JADX INFO: renamed from: zs2$a$a */
        public static final class a extends zs2 {
            public a(ia2 ia2Var, int i) {
                super(ia2Var, ia2Var, i, null);
            }

            @Override // p000.zs2
            @yfb
            public float[] transform(@yfb float[] fArr) {
                return fArr;
            }

            @Override // p000.zs2
            /* JADX INFO: renamed from: transformToColor-l2rxGTc$ui_graphics_release */
            public long mo33518transformToColorl2rxGTc$ui_graphics_release(long j) {
                return j;
            }
        }

        public /* synthetic */ C16238a(jt3 jt3Var) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: computeTransform-YBCOT_4, reason: not valid java name */
        public final float[] m33520computeTransformYBCOT_4(ia2 ia2Var, ia2 ia2Var2, int i) {
            if (!wzd.m33140equalsimpl0(i, wzd.f95863b.m33144getAbsoluteuksYyKA())) {
                return null;
            }
            long jM30176getModelxdoWZVw = ia2Var.m30176getModelxdoWZVw();
            o92.C10258a c10258a = o92.f66827b;
            boolean zM31296equalsimpl0 = o92.m31296equalsimpl0(jM30176getModelxdoWZVw, c10258a.m31303getRgbxdoWZVw());
            boolean zM31296equalsimpl02 = o92.m31296equalsimpl0(ia2Var2.m30176getModelxdoWZVw(), c10258a.m31303getRgbxdoWZVw());
            if (zM31296equalsimpl0 && zM31296equalsimpl02) {
                return null;
            }
            if (!zM31296equalsimpl0 && !zM31296equalsimpl02) {
                return null;
            }
            if (!zM31296equalsimpl0) {
                ia2Var = ia2Var2;
            }
            md8.checkNotNull(ia2Var, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
            eae eaeVar = (eae) ia2Var;
            float[] xyz$ui_graphics_release = zM31296equalsimpl0 ? eaeVar.getWhitePoint().toXyz$ui_graphics_release() : ns7.f65485a.getD50Xyz$ui_graphics_release();
            float[] xyz$ui_graphics_release2 = zM31296equalsimpl02 ? eaeVar.getWhitePoint().toXyz$ui_graphics_release() : ns7.f65485a.getD50Xyz$ui_graphics_release();
            return new float[]{xyz$ui_graphics_release[0] / xyz$ui_graphics_release2[0], xyz$ui_graphics_release[1] / xyz$ui_graphics_release2[1], xyz$ui_graphics_release[2] / xyz$ui_graphics_release2[2]};
        }

        @yfb
        public final zs2 identity$ui_graphics_release(@yfb ia2 ia2Var) {
            return new a(ia2Var, wzd.f95863b.m33146getRelativeuksYyKA());
        }

        private C16238a() {
        }
    }

    /* JADX INFO: renamed from: zs2$b */
    @dwf({"SMAP\nConnector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Connector.kt\nandroidx/compose/ui/graphics/colorspace/Connector$RgbConnector\n+ 2 Color.kt\nandroidx/compose/ui/graphics/Color\n+ 3 ColorSpace.kt\nandroidx/compose/ui/graphics/colorspace/ColorSpaceKt\n*L\n1#1,349:1\n231#2:350\n235#2,9:351\n716#3:360\n735#3:361\n754#3:362\n*S KotlinDebug\n*F\n+ 1 Connector.kt\nandroidx/compose/ui/graphics/colorspace/Connector$RgbConnector\n*L\n-1#1:350\n202#1:351,9\n206#1:360\n207#1:361\n208#1:362\n*E\n"})
    public static final class C16239b extends zs2 {

        /* JADX INFO: renamed from: h */
        @yfb
        public final eae f105950h;

        /* JADX INFO: renamed from: i */
        @yfb
        public final eae f105951i;

        /* JADX INFO: renamed from: j */
        @yfb
        public final float[] f105952j;

        public /* synthetic */ C16239b(eae eaeVar, eae eaeVar2, int i, jt3 jt3Var) {
            this(eaeVar, eaeVar2, i);
        }

        /* JADX INFO: renamed from: computeTransform-YBCOT_4, reason: not valid java name */
        private final float[] m33521computeTransformYBCOT_4(eae eaeVar, eae eaeVar2, int i) {
            if (ja2.compare(eaeVar.getWhitePoint(), eaeVar2.getWhitePoint())) {
                return ja2.mul3x3(eaeVar2.getInverseTransform$ui_graphics_release(), eaeVar.getTransform$ui_graphics_release());
            }
            float[] transform$ui_graphics_release = eaeVar.getTransform$ui_graphics_release();
            float[] inverseTransform$ui_graphics_release = eaeVar2.getInverseTransform$ui_graphics_release();
            float[] xyz$ui_graphics_release = eaeVar.getWhitePoint().toXyz$ui_graphics_release();
            float[] xyz$ui_graphics_release2 = eaeVar2.getWhitePoint().toXyz$ui_graphics_release();
            qki whitePoint = eaeVar.getWhitePoint();
            ns7 ns7Var = ns7.f65485a;
            if (!ja2.compare(whitePoint, ns7Var.getD50())) {
                float[] transform$ui_graphics_release2 = AbstractC7898jh.f50507b.getBradford().getTransform$ui_graphics_release();
                float[] d50Xyz$ui_graphics_release = ns7Var.getD50Xyz$ui_graphics_release();
                float[] fArrCopyOf = Arrays.copyOf(d50Xyz$ui_graphics_release, d50Xyz$ui_graphics_release.length);
                md8.checkNotNullExpressionValue(fArrCopyOf, "copyOf(this, size)");
                transform$ui_graphics_release = ja2.mul3x3(ja2.chromaticAdaptation(transform$ui_graphics_release2, xyz$ui_graphics_release, fArrCopyOf), eaeVar.getTransform$ui_graphics_release());
            }
            if (!ja2.compare(eaeVar2.getWhitePoint(), ns7Var.getD50())) {
                float[] transform$ui_graphics_release3 = AbstractC7898jh.f50507b.getBradford().getTransform$ui_graphics_release();
                float[] d50Xyz$ui_graphics_release2 = ns7Var.getD50Xyz$ui_graphics_release();
                float[] fArrCopyOf2 = Arrays.copyOf(d50Xyz$ui_graphics_release2, d50Xyz$ui_graphics_release2.length);
                md8.checkNotNullExpressionValue(fArrCopyOf2, "copyOf(this, size)");
                inverseTransform$ui_graphics_release = ja2.inverse3x3(ja2.mul3x3(ja2.chromaticAdaptation(transform$ui_graphics_release3, xyz$ui_graphics_release2, fArrCopyOf2), eaeVar2.getTransform$ui_graphics_release()));
            }
            if (wzd.m33140equalsimpl0(i, wzd.f95863b.m33144getAbsoluteuksYyKA())) {
                transform$ui_graphics_release = ja2.mul3x3Diag(new float[]{xyz$ui_graphics_release[0] / xyz$ui_graphics_release2[0], xyz$ui_graphics_release[1] / xyz$ui_graphics_release2[1], xyz$ui_graphics_release[2] / xyz$ui_graphics_release2[2]}, transform$ui_graphics_release);
            }
            return ja2.mul3x3(inverseTransform$ui_graphics_release, transform$ui_graphics_release);
        }

        @Override // p000.zs2
        @yfb
        public float[] transform(@yfb float[] fArr) {
            fArr[0] = (float) this.f105950h.getEotfFunc$ui_graphics_release().invoke(fArr[0]);
            fArr[1] = (float) this.f105950h.getEotfFunc$ui_graphics_release().invoke(fArr[1]);
            fArr[2] = (float) this.f105950h.getEotfFunc$ui_graphics_release().invoke(fArr[2]);
            ja2.mul3x3Float3(this.f105952j, fArr);
            fArr[0] = (float) this.f105951i.getOetfFunc$ui_graphics_release().invoke(fArr[0]);
            fArr[1] = (float) this.f105951i.getOetfFunc$ui_graphics_release().invoke(fArr[1]);
            fArr[2] = (float) this.f105951i.getOetfFunc$ui_graphics_release().invoke(fArr[2]);
            return fArr;
        }

        @Override // p000.zs2
        /* JADX INFO: renamed from: transformToColor-l2rxGTc$ui_graphics_release */
        public long mo33518transformToColorl2rxGTc$ui_graphics_release(long j) {
            float fM32957getRedimpl = w82.m32957getRedimpl(j);
            float fM32956getGreenimpl = w82.m32956getGreenimpl(j);
            float fM32954getBlueimpl = w82.m32954getBlueimpl(j);
            float fM32953getAlphaimpl = w82.m32953getAlphaimpl(j);
            float fInvoke = (float) this.f105950h.getEotfFunc$ui_graphics_release().invoke(fM32957getRedimpl);
            float fInvoke2 = (float) this.f105950h.getEotfFunc$ui_graphics_release().invoke(fM32956getGreenimpl);
            float fInvoke3 = (float) this.f105950h.getEotfFunc$ui_graphics_release().invoke(fM32954getBlueimpl);
            float[] fArr = this.f105952j;
            return j92.Color((float) this.f105951i.getOetfFunc$ui_graphics_release().invoke((fArr[0] * fInvoke) + (fArr[3] * fInvoke2) + (fArr[6] * fInvoke3)), (float) this.f105951i.getOetfFunc$ui_graphics_release().invoke((fArr[1] * fInvoke) + (fArr[4] * fInvoke2) + (fArr[7] * fInvoke3)), (float) this.f105951i.getOetfFunc$ui_graphics_release().invoke((fArr[2] * fInvoke) + (fArr[5] * fInvoke2) + (fArr[8] * fInvoke3)), fM32953getAlphaimpl, this.f105951i);
        }

        private C16239b(eae eaeVar, eae eaeVar2, int i) {
            super(eaeVar, eaeVar2, eaeVar, eaeVar2, i, null, null);
            this.f105950h = eaeVar;
            this.f105951i = eaeVar2;
            this.f105952j = m33521computeTransformYBCOT_4(eaeVar, eaeVar2, i);
        }
    }

    public /* synthetic */ zs2(ia2 ia2Var, ia2 ia2Var2, int i, jt3 jt3Var) {
        this(ia2Var, ia2Var2, i);
    }

    @yfb
    public final ia2 getDestination() {
        return this.f105945b;
    }

    /* JADX INFO: renamed from: getRenderIntent-uksYyKA, reason: not valid java name */
    public final int m33517getRenderIntentuksYyKA() {
        return this.f105948e;
    }

    @yfb
    public final ia2 getSource() {
        return this.f105944a;
    }

    @yfb
    @zpf(3)
    public final float[] transform(float f, float f2, float f3) {
        return transform(new float[]{f, f2, f3});
    }

    /* JADX INFO: renamed from: transformToColor-l2rxGTc$ui_graphics_release, reason: not valid java name */
    public long mo33518transformToColorl2rxGTc$ui_graphics_release(long j) {
        float fM32957getRedimpl = w82.m32957getRedimpl(j);
        float fM32956getGreenimpl = w82.m32956getGreenimpl(j);
        float fM32954getBlueimpl = w82.m32954getBlueimpl(j);
        float fM32953getAlphaimpl = w82.m32953getAlphaimpl(j);
        long xy$ui_graphics_release = this.f105946c.toXy$ui_graphics_release(fM32957getRedimpl, fM32956getGreenimpl, fM32954getBlueimpl);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (xy$ui_graphics_release >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (xy$ui_graphics_release & 4294967295L));
        float z$ui_graphics_release = this.f105946c.toZ$ui_graphics_release(fM32957getRedimpl, fM32956getGreenimpl, fM32954getBlueimpl);
        float[] fArr = this.f105949f;
        if (fArr != null) {
            fIntBitsToFloat *= fArr[0];
            fIntBitsToFloat2 *= fArr[1];
            z$ui_graphics_release *= fArr[2];
        }
        float f = fIntBitsToFloat;
        return this.f105947d.mo28819xyzaToColorJlNiLsg$ui_graphics_release(f, fIntBitsToFloat2, z$ui_graphics_release, fM32953getAlphaimpl, this.f105945b);
    }

    public /* synthetic */ zs2(ia2 ia2Var, ia2 ia2Var2, ia2 ia2Var3, ia2 ia2Var4, int i, float[] fArr, jt3 jt3Var) {
        this(ia2Var, ia2Var2, ia2Var3, ia2Var4, i, fArr);
    }

    @yfb
    @zpf(min = 3)
    public float[] transform(@yfb @zpf(min = 3) float[] fArr) {
        float[] xyz = this.f105946c.toXyz(fArr);
        float[] fArr2 = this.f105949f;
        if (fArr2 != null) {
            xyz[0] = xyz[0] * fArr2[0];
            xyz[1] = xyz[1] * fArr2[1];
            xyz[2] = xyz[2] * fArr2[2];
        }
        return this.f105947d.fromXyz(xyz);
    }

    private zs2(ia2 ia2Var, ia2 ia2Var2, ia2 ia2Var3, ia2 ia2Var4, int i, float[] fArr) {
        this.f105944a = ia2Var;
        this.f105945b = ia2Var2;
        this.f105946c = ia2Var3;
        this.f105947d = ia2Var4;
        this.f105948e = i;
        this.f105949f = fArr;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private zs2(ia2 ia2Var, ia2 ia2Var2, int i) {
        long jM30176getModelxdoWZVw = ia2Var.m30176getModelxdoWZVw();
        o92.C10258a c10258a = o92.f66827b;
        this(ia2Var, ia2Var2, o92.m31296equalsimpl0(jM30176getModelxdoWZVw, c10258a.m31303getRgbxdoWZVw()) ? ja2.adapt$default(ia2Var, ns7.f65485a.getD50(), null, 2, null) : ia2Var, o92.m31296equalsimpl0(ia2Var2.m30176getModelxdoWZVw(), c10258a.m31303getRgbxdoWZVw()) ? ja2.adapt$default(ia2Var2, ns7.f65485a.getD50(), null, 2, null) : ia2Var2, i, f105943g.m33520computeTransformYBCOT_4(ia2Var, ia2Var2, i), null);
    }
}
