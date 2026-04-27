package p000;

import java.util.List;
import p000.qjc;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nPathParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathParser.kt\nandroidx/compose/ui/graphics/vector/PathParserKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,589:1\n588#1:596\n33#2,6:590\n*S KotlinDebug\n*F\n+ 1 PathParser.kt\nandroidx/compose/ui/graphics/vector/PathParserKt\n*L\n441#1:596\n211#1:590,6\n*E\n"})
public final class yjc {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final float[] f101802a = new float[0];

    private static final void arcToBezier(vic vicVar, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
        double d10 = d3;
        double d11 = 4;
        int iCeil = (int) Math.ceil(Math.abs((d9 * d11) / 3.141592653589793d));
        double dCos = Math.cos(d7);
        double dSin = Math.sin(d7);
        double dCos2 = Math.cos(d8);
        double dSin2 = Math.sin(d8);
        double d12 = -d10;
        double d13 = d12 * dCos;
        double d14 = d4 * dSin;
        double d15 = (d13 * dSin2) - (d14 * dCos2);
        double d16 = d12 * dSin;
        double d17 = d4 * dCos;
        double d18 = (dSin2 * d16) + (dCos2 * d17);
        double d19 = d9 / ((double) iCeil);
        double d20 = d5;
        double d21 = d18;
        double d22 = d15;
        int i = 0;
        double d23 = d6;
        double d24 = d8;
        while (i < iCeil) {
            double d25 = d24 + d19;
            double dSin3 = Math.sin(d25);
            double dCos3 = Math.cos(d25);
            int i2 = iCeil;
            double d26 = (d + ((d10 * dCos) * dCos3)) - (d14 * dSin3);
            double d27 = d2 + (d10 * dSin * dCos3) + (d17 * dSin3);
            double d28 = (d13 * dSin3) - (d14 * dCos3);
            double d29 = (dSin3 * d16) + (dCos3 * d17);
            double d30 = d25 - d24;
            double dTan = Math.tan(d30 / ((double) 2));
            double dSin4 = (Math.sin(d30) * (Math.sqrt(d11 + ((3.0d * dTan) * dTan)) - ((double) 1))) / ((double) 3);
            vicVar.cubicTo((float) (d20 + (d22 * dSin4)), (float) (d23 + (d21 * dSin4)), (float) (d26 - (dSin4 * d28)), (float) (d27 - (dSin4 * d29)), (float) d26, (float) d27);
            i++;
            d19 = d19;
            dSin = dSin;
            d20 = d26;
            d16 = d16;
            d24 = d25;
            d21 = d29;
            d11 = d11;
            d22 = d28;
            dCos = dCos;
            iCeil = i2;
            d23 = d27;
            d10 = d3;
        }
    }

    private static final void drawArc(vic vicVar, double d, double d2, double d3, double d4, double d5, double d6, double d7, boolean z, boolean z2) {
        double d8;
        double d9;
        double d10 = (d7 / ((double) 180)) * 3.141592653589793d;
        double dCos = Math.cos(d10);
        double dSin = Math.sin(d10);
        double d11 = ((d * dCos) + (d2 * dSin)) / d5;
        double d12 = (((-d) * dSin) + (d2 * dCos)) / d6;
        double d13 = ((d3 * dCos) + (d4 * dSin)) / d5;
        double d14 = (((-d3) * dSin) + (d4 * dCos)) / d6;
        double d15 = d11 - d13;
        double d16 = d12 - d14;
        double d17 = 2;
        double d18 = (d11 + d13) / d17;
        double d19 = (d12 + d14) / d17;
        double d20 = (d15 * d15) + (d16 * d16);
        if (d20 == 0.0d) {
            return;
        }
        double d21 = (1.0d / d20) - 0.25d;
        if (d21 < 0.0d) {
            double dSqrt = (float) (Math.sqrt(d20) / 1.99999d);
            drawArc(vicVar, d, d2, d3, d4, d5 * dSqrt, d6 * dSqrt, d7, z, z2);
            return;
        }
        double dSqrt2 = Math.sqrt(d21);
        double d22 = d15 * dSqrt2;
        double d23 = dSqrt2 * d16;
        if (z == z2) {
            d8 = d18 - d23;
            d9 = d19 + d22;
        } else {
            d8 = d18 + d23;
            d9 = d19 - d22;
        }
        double dAtan2 = Math.atan2(d12 - d9, d11 - d8);
        double dAtan22 = Math.atan2(d14 - d9, d13 - d8) - dAtan2;
        if (z2 != (dAtan22 >= 0.0d)) {
            dAtan22 = dAtan22 > 0.0d ? dAtan22 - 6.283185307179586d : dAtan22 + 6.283185307179586d;
        }
        double d24 = d8 * d5;
        double d25 = d9 * d6;
        arcToBezier(vicVar, (d24 * dCos) - (d25 * dSin), (d24 * dSin) + (d25 * dCos), d5, d6, d, d2, d10, dAtan2, dAtan22);
    }

    @yfb
    public static final float[] getEmptyArray() {
        return f101802a;
    }

    @yfb
    public static final vic toPath(@yfb List<? extends qjc> list, @yfb vic vicVar) {
        qjc qjcVar;
        float f;
        int i;
        int i2;
        float f2;
        float f3;
        float x1;
        float dy1;
        float dy;
        float x2;
        float y2;
        float dy2;
        float f4;
        float f5;
        float y1;
        float x22;
        float y22;
        float f6;
        float f7;
        List<? extends qjc> list2 = list;
        vic vicVar2 = vicVar;
        int iMo28698getFillTypeRgk1Os = vicVar.mo28698getFillTypeRgk1Os();
        vicVar.rewind();
        vicVar2.mo28700setFillTypeoQ8Xj4U(iMo28698getFillTypeRgk1Os);
        qjc qjcVar2 = list.isEmpty() ? qjc.C11498b.f74634c : list2.get(0);
        int size = list.size();
        float f8 = 0.0f;
        int i3 = 0;
        float x12 = 0.0f;
        float arcStartY = 0.0f;
        float arcStartX = 0.0f;
        float y = 0.0f;
        float f9 = 0.0f;
        float f10 = 0.0f;
        while (i3 < size) {
            qjc qjcVar3 = list2.get(i3);
            if (qjcVar3 instanceof qjc.C11498b) {
                vicVar.close();
                qjcVar = qjcVar3;
                f = f8;
                i = i3;
                i2 = size;
                x12 = f9;
                arcStartX = x12;
                arcStartY = f10;
                y = arcStartY;
            } else {
                if (qjcVar3 instanceof qjc.C11510n) {
                    qjc.C11510n c11510n = (qjc.C11510n) qjcVar3;
                    arcStartX += c11510n.getDx();
                    y += c11510n.getDy();
                    vicVar2.relativeMoveTo(c11510n.getDx(), c11510n.getDy());
                    f9 = arcStartX;
                } else if (qjcVar3 instanceof qjc.C11502f) {
                    qjc.C11502f c11502f = (qjc.C11502f) qjcVar3;
                    float x = c11502f.getX();
                    float y3 = c11502f.getY();
                    vicVar2.moveTo(c11502f.getX(), c11502f.getY());
                    arcStartX = x;
                    f9 = arcStartX;
                    y = y3;
                } else {
                    if (qjcVar3 instanceof qjc.C11509m) {
                        qjc.C11509m c11509m = (qjc.C11509m) qjcVar3;
                        vicVar2.relativeLineTo(c11509m.getDx(), c11509m.getDy());
                        arcStartX += c11509m.getDx();
                        dy2 = c11509m.getDy();
                    } else {
                        if (qjcVar3 instanceof qjc.C11501e) {
                            qjc.C11501e c11501e = (qjc.C11501e) qjcVar3;
                            vicVar2.lineTo(c11501e.getX(), c11501e.getY());
                            x2 = c11501e.getX();
                            y2 = c11501e.getY();
                        } else {
                            if (qjcVar3 instanceof qjc.C11508l) {
                                qjc.C11508l c11508l = (qjc.C11508l) qjcVar3;
                                vicVar2.relativeLineTo(c11508l.getDx(), f8);
                                arcStartX += c11508l.getDx();
                            } else if (qjcVar3 instanceof qjc.C11500d) {
                                qjc.C11500d c11500d = (qjc.C11500d) qjcVar3;
                                vicVar2.lineTo(c11500d.getX(), y);
                                arcStartX = c11500d.getX();
                            } else if (qjcVar3 instanceof qjc.C11514r) {
                                qjc.C11514r c11514r = (qjc.C11514r) qjcVar3;
                                vicVar2.relativeLineTo(f8, c11514r.getDy());
                                dy2 = c11514r.getDy();
                            } else if (qjcVar3 instanceof qjc.C11515s) {
                                qjc.C11515s c11515s = (qjc.C11515s) qjcVar3;
                                vicVar2.lineTo(arcStartX, c11515s.getY());
                                y = c11515s.getY();
                            } else {
                                if (qjcVar3 instanceof qjc.C11507k) {
                                    qjc.C11507k c11507k = (qjc.C11507k) qjcVar3;
                                    vicVar.relativeCubicTo(c11507k.getDx1(), c11507k.getDy1(), c11507k.getDx2(), c11507k.getDy2(), c11507k.getDx3(), c11507k.getDy3());
                                    x1 = c11507k.getDx2() + arcStartX;
                                    dy1 = c11507k.getDy2() + y;
                                    arcStartX += c11507k.getDx3();
                                    dy = c11507k.getDy3();
                                } else {
                                    if (qjcVar3 instanceof qjc.C11499c) {
                                        qjc.C11499c c11499c = (qjc.C11499c) qjcVar3;
                                        vicVar.cubicTo(c11499c.getX1(), c11499c.getY1(), c11499c.getX2(), c11499c.getY2(), c11499c.getX3(), c11499c.getY3());
                                        x1 = c11499c.getX2();
                                        y1 = c11499c.getY2();
                                        x22 = c11499c.getX3();
                                        y22 = c11499c.getY3();
                                    } else if (qjcVar3 instanceof qjc.C11512p) {
                                        if (qjcVar2.isCurve()) {
                                            f7 = y - arcStartY;
                                            f6 = arcStartX - x12;
                                        } else {
                                            f6 = f8;
                                            f7 = f6;
                                        }
                                        qjc.C11512p c11512p = (qjc.C11512p) qjcVar3;
                                        vicVar.relativeCubicTo(f6, f7, c11512p.getDx1(), c11512p.getDy1(), c11512p.getDx2(), c11512p.getDy2());
                                        x1 = c11512p.getDx1() + arcStartX;
                                        dy1 = c11512p.getDy1() + y;
                                        arcStartX += c11512p.getDx2();
                                        dy = c11512p.getDy2();
                                    } else if (qjcVar3 instanceof qjc.C11504h) {
                                        if (qjcVar2.isCurve()) {
                                            float f11 = 2;
                                            f5 = (f11 * y) - arcStartY;
                                            f4 = (arcStartX * f11) - x12;
                                        } else {
                                            f4 = arcStartX;
                                            f5 = y;
                                        }
                                        qjc.C11504h c11504h = (qjc.C11504h) qjcVar3;
                                        vicVar.cubicTo(f4, f5, c11504h.getX1(), c11504h.getY1(), c11504h.getX2(), c11504h.getY2());
                                        x1 = c11504h.getX1();
                                        y1 = c11504h.getY1();
                                        x22 = c11504h.getX2();
                                        y22 = c11504h.getY2();
                                    } else if (qjcVar3 instanceof qjc.C11511o) {
                                        qjc.C11511o c11511o = (qjc.C11511o) qjcVar3;
                                        vicVar2.relativeQuadraticTo(c11511o.getDx1(), c11511o.getDy1(), c11511o.getDx2(), c11511o.getDy2());
                                        x12 = c11511o.getDx1() + arcStartX;
                                        arcStartY = c11511o.getDy1() + y;
                                        arcStartX += c11511o.getDx2();
                                        dy2 = c11511o.getDy2();
                                    } else if (qjcVar3 instanceof qjc.C11503g) {
                                        qjc.C11503g c11503g = (qjc.C11503g) qjcVar3;
                                        vicVar2.quadraticTo(c11503g.getX1(), c11503g.getY1(), c11503g.getX2(), c11503g.getY2());
                                        x12 = c11503g.getX1();
                                        arcStartY = c11503g.getY1();
                                        x2 = c11503g.getX2();
                                        y2 = c11503g.getY2();
                                    } else if (qjcVar3 instanceof qjc.C11513q) {
                                        if (qjcVar2.isQuad()) {
                                            f2 = arcStartX - x12;
                                            f3 = y - arcStartY;
                                        } else {
                                            f2 = f8;
                                            f3 = f2;
                                        }
                                        qjc.C11513q c11513q = (qjc.C11513q) qjcVar3;
                                        vicVar2.relativeQuadraticTo(f2, f3, c11513q.getDx(), c11513q.getDy());
                                        x1 = f2 + arcStartX;
                                        dy1 = f3 + y;
                                        arcStartX += c11513q.getDx();
                                        dy = c11513q.getDy();
                                    } else if (qjcVar3 instanceof qjc.C11505i) {
                                        if (qjcVar2.isQuad()) {
                                            float f12 = 2;
                                            arcStartX = (arcStartX * f12) - x12;
                                            y = (f12 * y) - arcStartY;
                                        }
                                        qjc.C11505i c11505i = (qjc.C11505i) qjcVar3;
                                        vicVar2.quadraticTo(arcStartX, y, c11505i.getX(), c11505i.getY());
                                        float x3 = c11505i.getX();
                                        arcStartY = y;
                                        qjcVar = qjcVar3;
                                        f = f8;
                                        i = i3;
                                        i2 = size;
                                        y = c11505i.getY();
                                        float f13 = arcStartX;
                                        arcStartX = x3;
                                        x12 = f13;
                                    } else if (qjcVar3 instanceof qjc.C11506j) {
                                        qjc.C11506j c11506j = (qjc.C11506j) qjcVar3;
                                        float arcStartDx = c11506j.getArcStartDx() + arcStartX;
                                        float arcStartDy = c11506j.getArcStartDy() + y;
                                        qjcVar = qjcVar3;
                                        i = i3;
                                        f = 0.0f;
                                        i2 = size;
                                        drawArc(vicVar, arcStartX, y, arcStartDx, arcStartDy, c11506j.getHorizontalEllipseRadius(), c11506j.getVerticalEllipseRadius(), c11506j.getTheta(), c11506j.isMoreThanHalf(), c11506j.isPositiveArc());
                                        arcStartY = arcStartDy;
                                        y = arcStartY;
                                        x12 = arcStartDx;
                                        arcStartX = x12;
                                    } else {
                                        qjcVar = qjcVar3;
                                        f = f8;
                                        i = i3;
                                        i2 = size;
                                        if (qjcVar instanceof qjc.C11497a) {
                                            qjc.C11497a c11497a = (qjc.C11497a) qjcVar;
                                            drawArc(vicVar, arcStartX, y, c11497a.getArcStartX(), c11497a.getArcStartY(), c11497a.getHorizontalEllipseRadius(), c11497a.getVerticalEllipseRadius(), c11497a.getTheta(), c11497a.isMoreThanHalf(), c11497a.isPositiveArc());
                                            arcStartX = c11497a.getArcStartX();
                                            arcStartY = c11497a.getArcStartY();
                                            y = arcStartY;
                                            x12 = arcStartX;
                                        }
                                    }
                                    arcStartX = x22;
                                    y = y22;
                                    qjcVar = qjcVar3;
                                    f = f8;
                                    i = i3;
                                    i2 = size;
                                    arcStartY = y1;
                                    x12 = x1;
                                }
                                y += dy;
                                arcStartY = dy1;
                                qjcVar = qjcVar3;
                                f = f8;
                                i = i3;
                                i2 = size;
                                x12 = x1;
                            }
                            qjcVar = qjcVar3;
                            f = f8;
                            i = i3;
                            i2 = size;
                        }
                        y = y2;
                        arcStartX = x2;
                        qjcVar = qjcVar3;
                        f = f8;
                        i = i3;
                        i2 = size;
                    }
                    y += dy2;
                    qjcVar = qjcVar3;
                    f = f8;
                    i = i3;
                    i2 = size;
                }
                f10 = y;
                qjcVar = qjcVar3;
                f = f8;
                i = i3;
                i2 = size;
            }
            i3 = i + 1;
            vicVar2 = vicVar;
            qjcVar2 = qjcVar;
            f8 = f;
            size = i2;
            list2 = list;
        }
        return vicVar;
    }

    public static /* synthetic */ vic toPath$default(List list, vic vicVar, int i, Object obj) {
        if ((i & 1) != 0) {
            vicVar = C8522ku.Path();
        }
        return toPath(list, vicVar);
    }

    private static final double toRadians(double d) {
        return (d / ((double) 180)) * 3.141592653589793d;
    }
}
