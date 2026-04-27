package p000;

import androidx.appcompat.widget.SearchView;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import p000.e9f;
import p000.jm8;

/* JADX INFO: loaded from: classes3.dex */
public class f97 {

    /* JADX INFO: renamed from: a */
    public static final jm8.C7981a f35771a = jm8.C7981a.m14177of(SearchView.f3153k3, "g", "o", "t", "s", "e", "w", "lc", "lj", "ml", "hd", "d");

    /* JADX INFO: renamed from: b */
    public static final jm8.C7981a f35772b = jm8.C7981a.m14177of("p", "k");

    /* JADX INFO: renamed from: c */
    public static final jm8.C7981a f35773c = jm8.C7981a.m14177of("n", "v");

    private f97() {
    }

    /* JADX INFO: renamed from: a */
    public static d97 m10727a(jm8 jm8Var, bn9 bn9Var) throws IOException {
        String str;
        C15854yw c15854yw;
        ArrayList arrayList = new ArrayList();
        float fNextDouble = 0.0f;
        String strNextString = null;
        g97 g97Var = null;
        C15854yw c15854ywM18172c = null;
        C4992dx c4992dxM18174e = null;
        C4992dx c4992dxM18174e2 = null;
        C15326xw c15326xw = null;
        e9f.EnumC5208b enumC5208b = null;
        e9f.EnumC5209c enumC5209c = null;
        C15326xw c15326xw2 = null;
        boolean zNextBoolean = false;
        C16264zw c16264zw = null;
        while (jm8Var.hasNext()) {
            switch (jm8Var.selectName(f35771a)) {
                case 0:
                    strNextString = jm8Var.nextString();
                    continue;
                case 1:
                    str = strNextString;
                    jm8Var.beginObject();
                    int iNextInt = -1;
                    while (jm8Var.hasNext()) {
                        int iSelectName = jm8Var.selectName(f35772b);
                        if (iSelectName != 0) {
                            c15854yw = c15854ywM18172c;
                            if (iSelectName != 1) {
                                jm8Var.skipName();
                                jm8Var.skipValue();
                            } else {
                                c15854ywM18172c = C10098nx.m18172c(jm8Var, bn9Var, iNextInt);
                            }
                        } else {
                            c15854yw = c15854ywM18172c;
                            iNextInt = jm8Var.nextInt();
                        }
                        c15854ywM18172c = c15854yw;
                    }
                    jm8Var.endObject();
                    break;
                case 2:
                    c16264zw = C10098nx.m18173d(jm8Var, bn9Var);
                    continue;
                case 3:
                    str = strNextString;
                    g97Var = jm8Var.nextInt() == 1 ? g97.LINEAR : g97.RADIAL;
                    break;
                case 4:
                    c4992dxM18174e = C10098nx.m18174e(jm8Var, bn9Var);
                    continue;
                case 5:
                    c4992dxM18174e2 = C10098nx.m18174e(jm8Var, bn9Var);
                    continue;
                case 6:
                    c15326xw = C10098nx.parseFloat(jm8Var, bn9Var);
                    continue;
                case 7:
                    str = strNextString;
                    enumC5208b = e9f.EnumC5208b.values()[jm8Var.nextInt() - 1];
                    break;
                case 8:
                    str = strNextString;
                    enumC5209c = e9f.EnumC5209c.values()[jm8Var.nextInt() - 1];
                    break;
                case 9:
                    str = strNextString;
                    fNextDouble = (float) jm8Var.nextDouble();
                    break;
                case 10:
                    zNextBoolean = jm8Var.nextBoolean();
                    continue;
                case 11:
                    jm8Var.beginArray();
                    while (jm8Var.hasNext()) {
                        jm8Var.beginObject();
                        String strNextString2 = null;
                        C15326xw c15326xw3 = null;
                        while (jm8Var.hasNext()) {
                            int iSelectName2 = jm8Var.selectName(f35773c);
                            if (iSelectName2 != 0) {
                                C15326xw c15326xw4 = c15326xw2;
                                if (iSelectName2 != 1) {
                                    jm8Var.skipName();
                                    jm8Var.skipValue();
                                } else {
                                    c15326xw3 = C10098nx.parseFloat(jm8Var, bn9Var);
                                }
                                c15326xw2 = c15326xw4;
                            } else {
                                strNextString2 = jm8Var.nextString();
                            }
                        }
                        C15326xw c15326xw5 = c15326xw2;
                        jm8Var.endObject();
                        if (strNextString2.equals("o")) {
                            c15326xw2 = c15326xw3;
                        } else {
                            if (strNextString2.equals("d") || strNextString2.equals("g")) {
                                bn9Var.setHasDashPattern(true);
                                arrayList.add(c15326xw3);
                            }
                            c15326xw2 = c15326xw5;
                        }
                    }
                    C15326xw c15326xw6 = c15326xw2;
                    jm8Var.endArray();
                    if (arrayList.size() == 1) {
                        arrayList.add((C15326xw) arrayList.get(0));
                    }
                    c15326xw2 = c15326xw6;
                    continue;
                default:
                    jm8Var.skipName();
                    jm8Var.skipValue();
                    continue;
            }
            strNextString = str;
        }
        String str2 = strNextString;
        if (c16264zw == null) {
            c16264zw = new C16264zw(Collections.singletonList(new hs8(100)));
        }
        return new d97(str2, g97Var, c15854ywM18172c, c16264zw, c4992dxM18174e, c4992dxM18174e2, c15326xw, enumC5208b, enumC5209c, fNextDouble, arrayList, c15326xw2, zNextBoolean);
    }
}
