package p000;

import p000.wzd;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nConnector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Connector.kt\nandroidx/compose/ui/graphics/colorspace/ConnectorKt\n*L\n1#1,349:1\n347#1:350\n347#1:351\n347#1:352\n*S KotlinDebug\n*F\n+ 1 Connector.kt\nandroidx/compose/ui/graphics/colorspace/ConnectorKt\n*L\n336#1:350\n338#1:351\n340#1:352\n*E\n"})
public final class ht2 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final i5b<zs2> f44807a;

    static {
        ra2 ra2Var = ra2.f77522a;
        int id$ui_graphics_release = ra2Var.getSrgb().getId$ui_graphics_release();
        int id$ui_graphics_release2 = ra2Var.getSrgb().getId$ui_graphics_release();
        wzd.C14850a c14850a = wzd.f95863b;
        jt3 jt3Var = null;
        f44807a = z68.mutableIntObjectMapOf(id$ui_graphics_release | (id$ui_graphics_release2 << 6) | (c14850a.m33145getPerceptualuksYyKA() << 12), zs2.f105943g.identity$ui_graphics_release(ra2Var.getSrgb()), ra2Var.getSrgb().getId$ui_graphics_release() | (ra2Var.getOklab().getId$ui_graphics_release() << 6) | (c14850a.m33145getPerceptualuksYyKA() << 12), new zs2(ra2Var.getSrgb(), ra2Var.getOklab(), c14850a.m33145getPerceptualuksYyKA(), jt3Var), ra2Var.getOklab().getId$ui_graphics_release() | (ra2Var.getSrgb().getId$ui_graphics_release() << 6) | (c14850a.m33145getPerceptualuksYyKA() << 12), new zs2(ra2Var.getOklab(), ra2Var.getSrgb(), c14850a.m33145getPerceptualuksYyKA(), jt3Var));
    }

    /* JADX INFO: renamed from: connectorKey-YBCOT_4, reason: not valid java name */
    public static final int m30117connectorKeyYBCOT_4(int i, int i2, int i3) {
        return i | (i2 << 6) | (i3 << 12);
    }

    @yfb
    public static final i5b<zs2> getConnectors() {
        return f44807a;
    }
}
