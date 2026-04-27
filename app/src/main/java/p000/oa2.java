package p000;

import android.graphics.ColorSpace;
import java.util.function.DoubleUnaryOperator;

/* JADX INFO: loaded from: classes.dex */
@c5e(26)
public final class oa2 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final oa2 f66960a = new oa2();

    private oa2() {
    }

    @c5e(26)
    @ih4
    @do8
    @yfb
    public static final ColorSpace androidColorSpace(@yfb ia2 ia2Var) {
        ColorSpace.Rgb rgb;
        ra2 ra2Var = ra2.f77522a;
        if (md8.areEqual(ia2Var, ra2Var.getSrgb())) {
            return ColorSpace.get(ColorSpace.Named.SRGB);
        }
        if (md8.areEqual(ia2Var, ra2Var.getAces())) {
            return ColorSpace.get(ColorSpace.Named.ACES);
        }
        if (md8.areEqual(ia2Var, ra2Var.getAcescg())) {
            return ColorSpace.get(ColorSpace.Named.ACESCG);
        }
        if (md8.areEqual(ia2Var, ra2Var.getAdobeRgb())) {
            return ColorSpace.get(ColorSpace.Named.ADOBE_RGB);
        }
        if (md8.areEqual(ia2Var, ra2Var.getBt2020())) {
            return ColorSpace.get(ColorSpace.Named.BT2020);
        }
        if (md8.areEqual(ia2Var, ra2Var.getBt709())) {
            return ColorSpace.get(ColorSpace.Named.BT709);
        }
        if (md8.areEqual(ia2Var, ra2Var.getCieLab())) {
            return ColorSpace.get(ColorSpace.Named.CIE_LAB);
        }
        if (md8.areEqual(ia2Var, ra2Var.getCieXyz())) {
            return ColorSpace.get(ColorSpace.Named.CIE_XYZ);
        }
        if (md8.areEqual(ia2Var, ra2Var.getDciP3())) {
            return ColorSpace.get(ColorSpace.Named.DCI_P3);
        }
        if (md8.areEqual(ia2Var, ra2Var.getDisplayP3())) {
            return ColorSpace.get(ColorSpace.Named.DISPLAY_P3);
        }
        if (md8.areEqual(ia2Var, ra2Var.getExtendedSrgb())) {
            return ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB);
        }
        if (md8.areEqual(ia2Var, ra2Var.getLinearExtendedSrgb())) {
            return ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
        }
        if (md8.areEqual(ia2Var, ra2Var.getLinearSrgb())) {
            return ColorSpace.get(ColorSpace.Named.LINEAR_SRGB);
        }
        if (md8.areEqual(ia2Var, ra2Var.getNtsc1953())) {
            return ColorSpace.get(ColorSpace.Named.NTSC_1953);
        }
        if (md8.areEqual(ia2Var, ra2Var.getProPhotoRgb())) {
            return ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB);
        }
        if (md8.areEqual(ia2Var, ra2Var.getSmpteC())) {
            return ColorSpace.get(ColorSpace.Named.SMPTE_C);
        }
        if (!(ia2Var instanceof eae)) {
            return ColorSpace.get(ColorSpace.Named.SRGB);
        }
        eae eaeVar = (eae) ia2Var;
        float[] xyz$ui_graphics_release = eaeVar.getWhitePoint().toXyz$ui_graphics_release();
        rdh transferParameters = eaeVar.getTransferParameters();
        ColorSpace.Rgb.TransferParameters transferParameters2 = transferParameters != null ? new ColorSpace.Rgb.TransferParameters(transferParameters.getA(), transferParameters.getB(), transferParameters.getC(), transferParameters.getD(), transferParameters.getE(), transferParameters.getF(), transferParameters.getGamma()) : null;
        if (transferParameters2 != null) {
            rgb = new ColorSpace.Rgb(ia2Var.getName(), eaeVar.getPrimaries$ui_graphics_release(), xyz$ui_graphics_release, transferParameters2);
        } else {
            String name = ia2Var.getName();
            float[] primaries$ui_graphics_release = eaeVar.getPrimaries$ui_graphics_release();
            final qy6<Double, Double> oetf = eaeVar.getOetf();
            DoubleUnaryOperator doubleUnaryOperator = new DoubleUnaryOperator() { // from class: ka2
                @Override // java.util.function.DoubleUnaryOperator
                public final double applyAsDouble(double d) {
                    return oa2.androidColorSpace$lambda$0(oetf, d);
                }
            };
            final qy6<Double, Double> eotf = eaeVar.getEotf();
            rgb = new ColorSpace.Rgb(name, primaries$ui_graphics_release, xyz$ui_graphics_release, doubleUnaryOperator, new DoubleUnaryOperator() { // from class: la2
                @Override // java.util.function.DoubleUnaryOperator
                public final double applyAsDouble(double d) {
                    return oa2.androidColorSpace$lambda$1(eotf, d);
                }
            }, ia2Var.getMinValue(0), ia2Var.getMaxValue(0));
        }
        return rgb;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double androidColorSpace$lambda$0(qy6 qy6Var, double d) {
        return ((Number) qy6Var.invoke(Double.valueOf(d))).doubleValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double androidColorSpace$lambda$1(qy6 qy6Var, double d) {
        return ((Number) qy6Var.invoke(Double.valueOf(d))).doubleValue();
    }

    @c5e(26)
    @ih4
    @do8
    @yfb
    public static final ia2 composeColorSpace(@yfb final ColorSpace colorSpace) {
        qki qkiVar;
        rdh rdhVar;
        int id = colorSpace.getId();
        if (id == ColorSpace.Named.SRGB.ordinal()) {
            return ra2.f77522a.getSrgb();
        }
        if (id == ColorSpace.Named.ACES.ordinal()) {
            return ra2.f77522a.getAces();
        }
        if (id == ColorSpace.Named.ACESCG.ordinal()) {
            return ra2.f77522a.getAcescg();
        }
        if (id == ColorSpace.Named.ADOBE_RGB.ordinal()) {
            return ra2.f77522a.getAdobeRgb();
        }
        if (id == ColorSpace.Named.BT2020.ordinal()) {
            return ra2.f77522a.getBt2020();
        }
        if (id == ColorSpace.Named.BT709.ordinal()) {
            return ra2.f77522a.getBt709();
        }
        if (id == ColorSpace.Named.CIE_LAB.ordinal()) {
            return ra2.f77522a.getCieLab();
        }
        if (id == ColorSpace.Named.CIE_XYZ.ordinal()) {
            return ra2.f77522a.getCieXyz();
        }
        if (id == ColorSpace.Named.DCI_P3.ordinal()) {
            return ra2.f77522a.getDciP3();
        }
        if (id == ColorSpace.Named.DISPLAY_P3.ordinal()) {
            return ra2.f77522a.getDisplayP3();
        }
        if (id == ColorSpace.Named.EXTENDED_SRGB.ordinal()) {
            return ra2.f77522a.getExtendedSrgb();
        }
        if (id == ColorSpace.Named.LINEAR_EXTENDED_SRGB.ordinal()) {
            return ra2.f77522a.getLinearExtendedSrgb();
        }
        if (id == ColorSpace.Named.LINEAR_SRGB.ordinal()) {
            return ra2.f77522a.getLinearSrgb();
        }
        if (id == ColorSpace.Named.NTSC_1953.ordinal()) {
            return ra2.f77522a.getNtsc1953();
        }
        if (id == ColorSpace.Named.PRO_PHOTO_RGB.ordinal()) {
            return ra2.f77522a.getProPhotoRgb();
        }
        if (id == ColorSpace.Named.SMPTE_C.ordinal()) {
            return ra2.f77522a.getSmpteC();
        }
        if (!(colorSpace instanceof ColorSpace.Rgb)) {
            return ra2.f77522a.getSrgb();
        }
        ColorSpace.Rgb rgb = (ColorSpace.Rgb) colorSpace;
        ColorSpace.Rgb.TransferParameters transferParameters = rgb.getTransferParameters();
        qki qkiVar2 = rgb.getWhitePoint().length == 3 ? new qki(rgb.getWhitePoint()[0], rgb.getWhitePoint()[1], rgb.getWhitePoint()[2]) : new qki(rgb.getWhitePoint()[0], rgb.getWhitePoint()[1]);
        if (transferParameters != null) {
            qkiVar = qkiVar2;
            rdhVar = new rdh(transferParameters.g, transferParameters.a, transferParameters.b, transferParameters.c, transferParameters.d, transferParameters.e, transferParameters.f);
        } else {
            qkiVar = qkiVar2;
            rdhVar = null;
        }
        return new eae(rgb.getName(), rgb.getPrimaries(), qkiVar, rgb.getTransform(), new bk4() { // from class: ma2
            @Override // p000.bk4
            public final double invoke(double d) {
                return oa2.composeColorSpace$lambda$2(colorSpace, d);
            }
        }, new bk4() { // from class: na2
            @Override // p000.bk4
            public final double invoke(double d) {
                return oa2.composeColorSpace$lambda$3(colorSpace, d);
            }
        }, colorSpace.getMinValue(0), colorSpace.getMaxValue(0), rdhVar, rgb.getId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double composeColorSpace$lambda$2(ColorSpace colorSpace, double d) {
        return ((ColorSpace.Rgb) colorSpace).getOetf().applyAsDouble(d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double composeColorSpace$lambda$3(ColorSpace colorSpace, double d) {
        return ((ColorSpace.Rgb) colorSpace).getEotf().applyAsDouble(d);
    }
}
