package p000;

import p000.o92;
import p000.zs2;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nColorSpace.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ColorSpace.kt\nandroidx/compose/ui/graphics/colorspace/ColorSpaceKt\n+ 2 Connector.kt\nandroidx/compose/ui/graphics/colorspace/ConnectorKt\n+ 3 IntObjectMap.kt\nandroidx/collection/MutableIntObjectMap\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,802:1\n347#2:803\n728#3:804\n1#4:805\n*S KotlinDebug\n*F\n+ 1 ColorSpace.kt\nandroidx/compose/ui/graphics/colorspace/ColorSpaceKt\n*L\n460#1:803\n460#1:804\n460#1:805\n*E\n"})
public final class ja2 {
    public static final double absRcpResponse(double d, double d2, double d3, double d4, double d5, double d6) {
        return Math.copySign(rcpResponse(d < 0.0d ? -d : d, d2, d3, d4, d5, d6), d);
    }

    public static final double absResponse(double d, double d2, double d3, double d4, double d5, double d6) {
        return Math.copySign(response(d < 0.0d ? -d : d, d2, d3, d4, d5, d6), d);
    }

    @yfb
    @yn8
    public static final ia2 adapt(@yfb ia2 ia2Var, @yfb qki qkiVar) {
        return adapt$default(ia2Var, qkiVar, null, 2, null);
    }

    public static /* synthetic */ ia2 adapt$default(ia2 ia2Var, qki qkiVar, AbstractC7898jh abstractC7898jh, int i, Object obj) {
        if ((i & 2) != 0) {
            abstractC7898jh = AbstractC7898jh.f50507b.getBradford();
        }
        return adapt(ia2Var, qkiVar, abstractC7898jh);
    }

    @yfb
    public static final float[] chromaticAdaptation(@yfb float[] fArr, @yfb float[] fArr2, @yfb float[] fArr3) {
        float[] fArrMul3x3Float3 = mul3x3Float3(fArr, fArr2);
        float[] fArrMul3x3Float32 = mul3x3Float3(fArr, fArr3);
        return mul3x3(inverse3x3(fArr), mul3x3Diag(new float[]{fArrMul3x3Float32[0] / fArrMul3x3Float3[0], fArrMul3x3Float32[1] / fArrMul3x3Float3[1], fArrMul3x3Float32[2] / fArrMul3x3Float3[2]}, fArr));
    }

    public static final boolean compare(@yfb rdh rdhVar, @gib rdh rdhVar2) {
        return rdhVar2 != null && Math.abs(rdhVar.getA() - rdhVar2.getA()) < 0.001d && Math.abs(rdhVar.getB() - rdhVar2.getB()) < 0.001d && Math.abs(rdhVar.getC() - rdhVar2.getC()) < 0.001d && Math.abs(rdhVar.getD() - rdhVar2.getD()) < 0.002d && Math.abs(rdhVar.getE() - rdhVar2.getE()) < 0.001d && Math.abs(rdhVar.getF() - rdhVar2.getF()) < 0.001d && Math.abs(rdhVar.getGamma() - rdhVar2.getGamma()) < 0.001d;
    }

    @yfb
    /* JADX INFO: renamed from: connect-YBCOT_4, reason: not valid java name */
    public static final zs2 m30491connectYBCOT_4(@yfb ia2 ia2Var, @yfb ia2 ia2Var2, int i) {
        int id$ui_graphics_release = ia2Var.getId$ui_graphics_release();
        int id$ui_graphics_release2 = ia2Var2.getId$ui_graphics_release();
        if ((id$ui_graphics_release | id$ui_graphics_release2) < 0) {
            return m30493createConnectorYBCOT_4(ia2Var, ia2Var2, i);
        }
        i5b<zs2> connectors = ht2.getConnectors();
        int i2 = id$ui_graphics_release | (id$ui_graphics_release2 << 6) | (i << 12);
        zs2 zs2VarM30493createConnectorYBCOT_4 = connectors.get(i2);
        if (zs2VarM30493createConnectorYBCOT_4 == null) {
            zs2VarM30493createConnectorYBCOT_4 = m30493createConnectorYBCOT_4(ia2Var, ia2Var2, i);
            connectors.set(i2, zs2VarM30493createConnectorYBCOT_4);
        }
        return zs2VarM30493createConnectorYBCOT_4;
    }

    /* JADX INFO: renamed from: connect-YBCOT_4$default, reason: not valid java name */
    public static /* synthetic */ zs2 m30492connectYBCOT_4$default(ia2 ia2Var, ia2 ia2Var2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            ia2Var2 = ra2.f77522a.getSrgb();
        }
        if ((i2 & 2) != 0) {
            i = wzd.f95863b.m33145getPerceptualuksYyKA();
        }
        return m30491connectYBCOT_4(ia2Var, ia2Var2, i);
    }

    /* JADX INFO: renamed from: createConnector-YBCOT_4, reason: not valid java name */
    private static final zs2 m30493createConnectorYBCOT_4(ia2 ia2Var, ia2 ia2Var2, int i) {
        zs2 zs2Var;
        if (ia2Var == ia2Var2) {
            return zs2.f105943g.identity$ui_graphics_release(ia2Var);
        }
        long jM30176getModelxdoWZVw = ia2Var.m30176getModelxdoWZVw();
        o92.C10258a c10258a = o92.f66827b;
        jt3 jt3Var = null;
        if (o92.m31296equalsimpl0(jM30176getModelxdoWZVw, c10258a.m31303getRgbxdoWZVw()) && o92.m31296equalsimpl0(ia2Var2.m30176getModelxdoWZVw(), c10258a.m31303getRgbxdoWZVw())) {
            md8.checkNotNull(ia2Var, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
            md8.checkNotNull(ia2Var2, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
            zs2Var = new zs2.C16239b((eae) ia2Var, (eae) ia2Var2, i, jt3Var);
        } else {
            zs2Var = new zs2(ia2Var, ia2Var2, i, jt3Var);
        }
        return zs2Var;
    }

    @yfb
    public static final float[] inverse3x3(@yfb float[] fArr) {
        float f = fArr[0];
        float f2 = fArr[3];
        float f3 = fArr[6];
        float f4 = fArr[1];
        float f5 = fArr[4];
        float f6 = fArr[7];
        float f7 = fArr[2];
        float f8 = fArr[5];
        float f9 = fArr[8];
        float f10 = (f5 * f9) - (f6 * f8);
        float f11 = (f6 * f7) - (f4 * f9);
        float f12 = (f4 * f8) - (f5 * f7);
        float f13 = (f * f10) + (f2 * f11) + (f3 * f12);
        float[] fArr2 = new float[fArr.length];
        fArr2[0] = f10 / f13;
        fArr2[1] = f11 / f13;
        fArr2[2] = f12 / f13;
        fArr2[3] = ((f3 * f8) - (f2 * f9)) / f13;
        fArr2[4] = ((f9 * f) - (f3 * f7)) / f13;
        fArr2[5] = ((f7 * f2) - (f8 * f)) / f13;
        fArr2[6] = ((f2 * f6) - (f3 * f5)) / f13;
        fArr2[7] = ((f3 * f4) - (f6 * f)) / f13;
        fArr2[8] = ((f * f5) - (f2 * f4)) / f13;
        return fArr2;
    }

    @yfb
    public static final float[] mul3x3(@yfb float[] fArr, @yfb float[] fArr2) {
        float f = fArr[0];
        float f2 = fArr2[0];
        float f3 = fArr[3];
        float f4 = fArr2[1];
        float f5 = fArr[6];
        float f6 = fArr2[2];
        float f7 = (f * f2) + (f3 * f4) + (f5 * f6);
        float f8 = fArr[1];
        float f9 = fArr[4];
        float f10 = fArr[7];
        float f11 = (f8 * f2) + (f9 * f4) + (f10 * f6);
        float f12 = fArr[2];
        float f13 = fArr[5];
        float f14 = fArr[8];
        float f15 = (f2 * f12) + (f4 * f13) + (f6 * f14);
        float f16 = fArr2[3];
        float f17 = fArr2[4];
        float f18 = fArr2[5];
        float f19 = (f * f16) + (f3 * f17) + (f5 * f18);
        float f20 = (f8 * f16) + (f9 * f17) + (f10 * f18);
        float f21 = (f16 * f12) + (f17 * f13) + (f18 * f14);
        float f22 = fArr2[6];
        float f23 = fArr2[7];
        float f24 = (f * f22) + (f3 * f23);
        float f25 = fArr2[8];
        return new float[]{f7, f11, f15, f19, f20, f21, f24 + (f5 * f25), (f8 * f22) + (f9 * f23) + (f10 * f25), (f12 * f22) + (f13 * f23) + (f14 * f25)};
    }

    @yfb
    public static final float[] mul3x3Diag(@yfb float[] fArr, @yfb float[] fArr2) {
        float f = fArr[0];
        float f2 = fArr2[0] * f;
        float f3 = fArr[1];
        float f4 = fArr2[1] * f3;
        float f5 = fArr[2];
        return new float[]{f2, f4, fArr2[2] * f5, fArr2[3] * f, fArr2[4] * f3, fArr2[5] * f5, f * fArr2[6], f3 * fArr2[7], f5 * fArr2[8]};
    }

    @yfb
    public static final float[] mul3x3Float3(@yfb float[] fArr, @yfb float[] fArr2) {
        float f = fArr2[0];
        float f2 = fArr2[1];
        float f3 = fArr2[2];
        fArr2[0] = (fArr[0] * f) + (fArr[3] * f2) + (fArr[6] * f3);
        fArr2[1] = (fArr[1] * f) + (fArr[4] * f2) + (fArr[7] * f3);
        fArr2[2] = (fArr[2] * f) + (fArr[5] * f2) + (fArr[8] * f3);
        return fArr2;
    }

    public static final float mul3x3Float3_0(@yfb float[] fArr, float f, float f2, float f3) {
        return (fArr[0] * f) + (fArr[3] * f2) + (fArr[6] * f3);
    }

    public static final float mul3x3Float3_1(@yfb float[] fArr, float f, float f2, float f3) {
        return (fArr[1] * f) + (fArr[4] * f2) + (fArr[7] * f3);
    }

    public static final float mul3x3Float3_2(@yfb float[] fArr, float f, float f2, float f3) {
        return (fArr[2] * f) + (fArr[5] * f2) + (fArr[8] * f3);
    }

    public static final double rcpResponse(double d, double d2, double d3, double d4, double d5, double d6) {
        return d >= d5 * d4 ? (Math.pow(d, 1.0d / d6) - d3) / d2 : d / d4;
    }

    public static final double response(double d, double d2, double d3, double d4, double d5, double d6) {
        return d >= d5 ? Math.pow((d2 * d) + d3, d6) : d * d4;
    }

    @yfb
    @yn8
    public static final ia2 adapt(@yfb ia2 ia2Var, @yfb qki qkiVar, @yfb AbstractC7898jh abstractC7898jh) {
        if (!o92.m31296equalsimpl0(ia2Var.m30176getModelxdoWZVw(), o92.f66827b.m31303getRgbxdoWZVw())) {
            return ia2Var;
        }
        md8.checkNotNull(ia2Var, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
        eae eaeVar = (eae) ia2Var;
        if (compare(eaeVar.getWhitePoint(), qkiVar)) {
            return ia2Var;
        }
        return new eae(eaeVar, mul3x3(chromaticAdaptation(abstractC7898jh.getTransform$ui_graphics_release(), eaeVar.getWhitePoint().toXyz$ui_graphics_release(), qkiVar.toXyz$ui_graphics_release()), eaeVar.getTransform$ui_graphics_release()), qkiVar);
    }

    public static final double rcpResponse(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8) {
        return d >= d5 * d4 ? (Math.pow(d - d6, 1.0d / d8) - d3) / d2 : (d - d7) / d4;
    }

    public static final double response(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8) {
        return d >= d5 ? Math.pow((d2 * d) + d3, d8) + d6 : (d4 * d) + d7;
    }

    public static final boolean compare(@yfb qki qkiVar, @yfb qki qkiVar2) {
        if (qkiVar == qkiVar2) {
            return true;
        }
        return Math.abs(qkiVar.getX() - qkiVar2.getX()) < 0.001f && Math.abs(qkiVar.getY() - qkiVar2.getY()) < 0.001f;
    }

    public static final boolean compare(@yfb float[] fArr, @yfb float[] fArr2) {
        if (fArr == fArr2) {
            return true;
        }
        int length = fArr.length;
        for (int i = 0; i < length; i++) {
            if (Float.compare(fArr[i], fArr2[i]) != 0 && Math.abs(fArr[i] - fArr2[i]) > 0.001f) {
                return false;
            }
        }
        return true;
    }
}
