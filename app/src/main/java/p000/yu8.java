package p000;

import android.graphics.Color;
import android.graphics.Rect;
import androidx.appcompat.widget.SearchView;
import androidx.constraintlayout.widget.C0901d;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import p000.jm8;
import p000.tu8;

/* JADX INFO: loaded from: classes3.dex */
public class yu8 {

    /* JADX INFO: renamed from: a */
    public static final jm8.C7981a f102990a = jm8.C7981a.m14177of(SearchView.f3153k3, "ind", "refId", "ty", C0901d.f6975V1, "sw", "sh", "sc", "ks", "tt", "masksProperties", "shapes", "t", "ef", "sr", "st", "w", "h", "ip", "op", "tm", "cl", "hd");

    /* JADX INFO: renamed from: b */
    public static final jm8.C7981a f102991b = jm8.C7981a.m14177of("d", "a");

    /* JADX INFO: renamed from: c */
    public static final jm8.C7981a f102992c = jm8.C7981a.m14177of("ty", SearchView.f3153k3);

    /* JADX INFO: renamed from: yu8$a */
    public static /* synthetic */ class C15810a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f102993a;

        static {
            int[] iArr = new int[tu8.EnumC13244b.values().length];
            f102993a = iArr;
            try {
                iArr[tu8.EnumC13244b.LUMA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f102993a[tu8.EnumC13244b.LUMA_INVERTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private yu8() {
    }

    public static tu8 parse(bn9 bn9Var) {
        Rect bounds = bn9Var.getBounds();
        return new tu8(Collections.emptyList(), bn9Var, "__container", -1L, tu8.EnumC13243a.PRE_COMP, -1L, null, Collections.emptyList(), new C8540kx(), 0, 0, 0, 0.0f, 0.0f, bounds.width(), bounds.height(), null, null, Collections.emptyList(), tu8.EnumC13244b.NONE, null, false, null, null);
    }

    public static tu8 parse(jm8 jm8Var, bn9 bn9Var) throws IOException {
        ArrayList arrayList;
        ArrayList arrayList2;
        float f;
        tu8.EnumC13244b enumC13244b = tu8.EnumC13244b.NONE;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        jm8Var.beginObject();
        Float fValueOf = Float.valueOf(1.0f);
        Float fValueOf2 = Float.valueOf(0.0f);
        tu8.EnumC13244b enumC13244b2 = enumC13244b;
        tu8.EnumC13243a enumC13243a = null;
        String strNextString = null;
        C8540kx c8540kx = null;
        C7073hx c7073hxM18171b = null;
        C7646ix c7646ix = null;
        C15326xw c15326xw = null;
        w91 w91VarM25792a = null;
        wr4 wr4VarM25421a = null;
        long jNextInt = 0;
        int iNextInt = 0;
        int iNextInt2 = 0;
        int color = 0;
        int iNextInt3 = 0;
        int iNextInt4 = 0;
        boolean zNextBoolean = false;
        float fNextDouble = 1.0f;
        long jNextInt2 = -1;
        float fNextDouble2 = 0.0f;
        float fNextDouble3 = 0.0f;
        float endFrame = 0.0f;
        String strNextString2 = "UNSET";
        String strNextString3 = null;
        while (jm8Var.hasNext()) {
            switch (jm8Var.selectName(f102990a)) {
                case 0:
                    strNextString2 = jm8Var.nextString();
                    break;
                case 1:
                    jNextInt = jm8Var.nextInt();
                    break;
                case 2:
                    strNextString = jm8Var.nextString();
                    break;
                case 3:
                    int iNextInt5 = jm8Var.nextInt();
                    enumC13243a = tu8.EnumC13243a.UNKNOWN;
                    if (iNextInt5 < enumC13243a.ordinal()) {
                        enumC13243a = tu8.EnumC13243a.values()[iNextInt5];
                    }
                    break;
                case 4:
                    jNextInt2 = jm8Var.nextInt();
                    break;
                case 5:
                    iNextInt = (int) (jm8Var.nextInt() * e1i.dpScale());
                    break;
                case 6:
                    iNextInt2 = (int) (jm8Var.nextInt() * e1i.dpScale());
                    break;
                case 7:
                    color = Color.parseColor(jm8Var.nextString());
                    break;
                case 8:
                    c8540kx = C9015lx.parse(jm8Var, bn9Var);
                    break;
                case 9:
                    int iNextInt6 = jm8Var.nextInt();
                    if (iNextInt6 >= tu8.EnumC13244b.values().length) {
                        bn9Var.addWarning("Unsupported matte type: " + iNextInt6);
                    } else {
                        enumC13244b2 = tu8.EnumC13244b.values()[iNextInt6];
                        int i = C15810a.f102993a[enumC13244b2.ordinal()];
                        if (i == 1) {
                            bn9Var.addWarning("Unsupported matte type: Luma");
                        } else if (i == 2) {
                            bn9Var.addWarning("Unsupported matte type: Luma Inverted");
                        }
                        bn9Var.incrementMatteOrMaskCount(1);
                    }
                    break;
                case 10:
                    jm8Var.beginArray();
                    while (jm8Var.hasNext()) {
                        arrayList3.add(jv9.m14352a(jm8Var, bn9Var));
                    }
                    bn9Var.incrementMatteOrMaskCount(arrayList3.size());
                    jm8Var.endArray();
                    break;
                case 11:
                    jm8Var.beginArray();
                    while (jm8Var.hasNext()) {
                        sw2 sw2VarM22885a = tw2.m22885a(jm8Var, bn9Var);
                        if (sw2VarM22885a != null) {
                            arrayList4.add(sw2VarM22885a);
                        }
                    }
                    jm8Var.endArray();
                    break;
                case 12:
                    jm8Var.beginObject();
                    while (jm8Var.hasNext()) {
                        int iSelectName = jm8Var.selectName(f102991b);
                        if (iSelectName == 0) {
                            c7073hxM18171b = C10098nx.m18171b(jm8Var, bn9Var);
                        } else if (iSelectName != 1) {
                            jm8Var.skipName();
                            jm8Var.skipValue();
                        } else {
                            jm8Var.beginArray();
                            if (jm8Var.hasNext()) {
                                c7646ix = C8130jx.parse(jm8Var, bn9Var);
                            }
                            while (jm8Var.hasNext()) {
                                jm8Var.skipValue();
                            }
                            jm8Var.endArray();
                        }
                    }
                    jm8Var.endObject();
                    break;
                case 13:
                    jm8Var.beginArray();
                    ArrayList arrayList5 = new ArrayList();
                    while (jm8Var.hasNext()) {
                        jm8Var.beginObject();
                        while (jm8Var.hasNext()) {
                            int iSelectName2 = jm8Var.selectName(f102992c);
                            if (iSelectName2 == 0) {
                                int iNextInt7 = jm8Var.nextInt();
                                if (iNextInt7 == 29) {
                                    w91VarM25792a = y91.m25792a(jm8Var, bn9Var);
                                } else if (iNextInt7 == 25) {
                                    wr4VarM25421a = new xr4().m25421a(jm8Var, bn9Var);
                                }
                            } else if (iSelectName2 != 1) {
                                jm8Var.skipName();
                                jm8Var.skipValue();
                            } else {
                                arrayList5.add(jm8Var.nextString());
                            }
                        }
                        jm8Var.endObject();
                    }
                    jm8Var.endArray();
                    bn9Var.addWarning("Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: " + arrayList5);
                    break;
                case 14:
                    fNextDouble = (float) jm8Var.nextDouble();
                    break;
                case 15:
                    fNextDouble3 = (float) jm8Var.nextDouble();
                    break;
                case 16:
                    iNextInt3 = (int) (jm8Var.nextInt() * e1i.dpScale());
                    break;
                case 17:
                    iNextInt4 = (int) (jm8Var.nextInt() * e1i.dpScale());
                    break;
                case 18:
                    fNextDouble2 = (float) jm8Var.nextDouble();
                    break;
                case 19:
                    endFrame = (float) jm8Var.nextDouble();
                    break;
                case 20:
                    c15326xw = C10098nx.parseFloat(jm8Var, bn9Var, false);
                    break;
                case 21:
                    strNextString3 = jm8Var.nextString();
                    break;
                case 22:
                    zNextBoolean = jm8Var.nextBoolean();
                    break;
                default:
                    jm8Var.skipName();
                    jm8Var.skipValue();
                    break;
            }
        }
        jm8Var.endObject();
        ArrayList arrayList6 = new ArrayList();
        if (fNextDouble2 > 0.0f) {
            arrayList = arrayList3;
            arrayList2 = arrayList6;
            arrayList2.add(new hs8(bn9Var, fValueOf2, fValueOf2, null, 0.0f, Float.valueOf(fNextDouble2)));
            f = 0.0f;
        } else {
            arrayList = arrayList3;
            arrayList2 = arrayList6;
            f = 0.0f;
        }
        if (endFrame <= f) {
            endFrame = bn9Var.getEndFrame();
        }
        arrayList2.add(new hs8(bn9Var, fValueOf, fValueOf, null, fNextDouble2, Float.valueOf(endFrame)));
        arrayList2.add(new hs8(bn9Var, fValueOf2, fValueOf2, null, endFrame, Float.valueOf(Float.MAX_VALUE)));
        if (strNextString2.endsWith(".ai") || "ai".equals(strNextString3)) {
            bn9Var.addWarning("Convert your Illustrator layers to shape layers.");
        }
        return new tu8(arrayList4, bn9Var, strNextString2, jNextInt, enumC13243a, jNextInt2, strNextString, arrayList, c8540kx, iNextInt, iNextInt2, color, fNextDouble, fNextDouble3, iNextInt3, iNextInt4, c7073hxM18171b, c7646ix, arrayList2, enumC13244b2, c15326xw, zNextBoolean, w91VarM25792a, wr4VarM25421a);
    }
}
