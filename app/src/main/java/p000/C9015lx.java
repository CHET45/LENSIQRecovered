package p000;

import android.graphics.PointF;
import java.io.IOException;
import p000.jm8;

/* JADX INFO: renamed from: lx */
/* JADX INFO: loaded from: classes3.dex */
public class C9015lx {

    /* JADX INFO: renamed from: a */
    public static final jm8.C7981a f59107a = jm8.C7981a.m14177of("a", "p", "s", "rz", "r", "o", "so", "eo", "sk", "sa");

    /* JADX INFO: renamed from: b */
    public static final jm8.C7981a f59108b = jm8.C7981a.m14177of("k");

    private C9015lx() {
    }

    private static boolean isAnchorPointIdentity(C2094bx c2094bx) {
        return c2094bx == null || (c2094bx.isStatic() && c2094bx.getKeyframes().get(0).f44691b.equals(0.0f, 0.0f));
    }

    private static boolean isPositionIdentity(InterfaceC9576mx<PointF, PointF> interfaceC9576mx) {
        return interfaceC9576mx == null || (!(interfaceC9576mx instanceof C6634gx) && interfaceC9576mx.isStatic() && interfaceC9576mx.getKeyframes().get(0).f44691b.equals(0.0f, 0.0f));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean isRotationIdentity(C15326xw c15326xw) {
        return c15326xw == null || (c15326xw.isStatic() && ((Float) ((hs8) c15326xw.getKeyframes().get(0)).f44691b).floatValue() == 0.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean isScaleIdentity(C5504ex c5504ex) {
        return c5504ex == null || (c5504ex.isStatic() && ((xme) ((hs8) c5504ex.getKeyframes().get(0)).f44691b).equals(1.0f, 1.0f));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean isSkewAngleIdentity(C15326xw c15326xw) {
        return c15326xw == null || (c15326xw.isStatic() && ((Float) ((hs8) c15326xw.getKeyframes().get(0)).f44691b).floatValue() == 0.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean isSkewIdentity(C15326xw c15326xw) {
        return c15326xw == null || (c15326xw.isStatic() && ((Float) ((hs8) c15326xw.getKeyframes().get(0)).f44691b).floatValue() == 0.0f);
    }

    public static C8540kx parse(jm8 jm8Var, bn9 bn9Var) throws IOException {
        boolean z;
        boolean z2 = false;
        boolean z3 = jm8Var.peek() == jm8.EnumC7982b.BEGIN_OBJECT;
        if (z3) {
            jm8Var.beginObject();
        }
        C15326xw c15326xw = null;
        C2094bx c2094bx = null;
        InterfaceC9576mx<PointF, PointF> interfaceC9576mxM8767a = null;
        C5504ex c5504exM18175f = null;
        C15326xw c15326xw2 = null;
        C15326xw c15326xw3 = null;
        C16264zw c16264zwM18173d = null;
        C15326xw c15326xw4 = null;
        C15326xw c15326xw5 = null;
        while (jm8Var.hasNext()) {
            switch (jm8Var.selectName(f59107a)) {
                case 0:
                    boolean z4 = z2;
                    jm8Var.beginObject();
                    while (jm8Var.hasNext()) {
                        if (jm8Var.selectName(f59108b) != 0) {
                            jm8Var.skipName();
                            jm8Var.skipValue();
                        } else {
                            c2094bx = C4548cx.parse(jm8Var, bn9Var);
                        }
                    }
                    jm8Var.endObject();
                    z2 = z4;
                    continue;
                case 1:
                    interfaceC9576mxM8767a = C4548cx.m8767a(jm8Var, bn9Var);
                    continue;
                case 2:
                    c5504exM18175f = C10098nx.m18175f(jm8Var, bn9Var);
                    continue;
                case 3:
                    bn9Var.addWarning("Lottie doesn't support 3D layers.");
                    break;
                case 4:
                    break;
                case 5:
                    c16264zwM18173d = C10098nx.m18173d(jm8Var, bn9Var);
                    continue;
                case 6:
                    c15326xw4 = C10098nx.parseFloat(jm8Var, bn9Var, z2);
                    continue;
                case 7:
                    c15326xw5 = C10098nx.parseFloat(jm8Var, bn9Var, z2);
                    continue;
                case 8:
                    c15326xw2 = C10098nx.parseFloat(jm8Var, bn9Var, z2);
                    continue;
                case 9:
                    c15326xw3 = C10098nx.parseFloat(jm8Var, bn9Var, z2);
                    continue;
                default:
                    jm8Var.skipName();
                    jm8Var.skipValue();
                    continue;
            }
            C15326xw c15326xw6 = C10098nx.parseFloat(jm8Var, bn9Var, z2);
            if (c15326xw6.getKeyframes().isEmpty()) {
                c15326xw6.getKeyframes().add(new hs8(bn9Var, Float.valueOf(0.0f), Float.valueOf(0.0f), null, 0.0f, Float.valueOf(bn9Var.getEndFrame())));
            } else {
                if (((hs8) c15326xw6.getKeyframes().get(0)).f44691b == 0) {
                    z = false;
                    c15326xw6.getKeyframes().set(0, new hs8(bn9Var, Float.valueOf(0.0f), Float.valueOf(0.0f), null, 0.0f, Float.valueOf(bn9Var.getEndFrame())));
                }
                z2 = z;
                c15326xw = c15326xw6;
            }
            z = false;
            z2 = z;
            c15326xw = c15326xw6;
        }
        if (z3) {
            jm8Var.endObject();
        }
        C2094bx c2094bx2 = isAnchorPointIdentity(c2094bx) ? null : c2094bx;
        InterfaceC9576mx<PointF, PointF> interfaceC9576mx = isPositionIdentity(interfaceC9576mxM8767a) ? null : interfaceC9576mxM8767a;
        C15326xw c15326xw7 = isRotationIdentity(c15326xw) ? null : c15326xw;
        if (isScaleIdentity(c5504exM18175f)) {
            c5504exM18175f = null;
        }
        return new C8540kx(c2094bx2, interfaceC9576mx, c5504exM18175f, c15326xw7, c16264zwM18173d, c15326xw4, c15326xw5, isSkewIdentity(c15326xw2) ? null : c15326xw2, isSkewAngleIdentity(c15326xw3) ? null : c15326xw3);
    }
}
