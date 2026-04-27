package p000;

import android.graphics.Rect;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p000.jm8;
import p000.tu8;

/* JADX INFO: loaded from: classes3.dex */
public class pn9 {

    /* JADX INFO: renamed from: a */
    public static final jm8.C7981a f71489a = jm8.C7981a.m14177of("w", "h", "ip", "op", ufh.f87919f, "v", "layers", "assets", "fonts", "chars", "markers");

    /* JADX INFO: renamed from: b */
    public static jm8.C7981a f71490b = jm8.C7981a.m14177of("id", "layers", "w", "h", "p", "u");

    /* JADX INFO: renamed from: c */
    public static final jm8.C7981a f71491c = jm8.C7981a.m14177of("list");

    /* JADX INFO: renamed from: d */
    public static final jm8.C7981a f71492d = jm8.C7981a.m14177of("cm", "tm", "dr");

    public static bn9 parse(jm8 jm8Var) throws IOException {
        HashMap map;
        ArrayList arrayList;
        jm8 jm8Var2 = jm8Var;
        float fDpScale = e1i.dpScale();
        zl9<tu8> zl9Var = new zl9<>();
        ArrayList arrayList2 = new ArrayList();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        HashMap map4 = new HashMap();
        ArrayList arrayList3 = new ArrayList();
        mxf<bo6> mxfVar = new mxf<>();
        bn9 bn9Var = new bn9();
        jm8Var.beginObject();
        float fNextDouble = 0.0f;
        float fNextDouble2 = 0.0f;
        float fNextDouble3 = 0.0f;
        int iNextInt = 0;
        int iNextInt2 = 0;
        while (jm8Var.hasNext()) {
            switch (jm8Var2.selectName(f71489a)) {
                case 0:
                    iNextInt = jm8Var.nextInt();
                    continue;
                    jm8Var2 = jm8Var;
                    break;
                case 1:
                    iNextInt2 = jm8Var.nextInt();
                    continue;
                    jm8Var2 = jm8Var;
                    break;
                case 2:
                    fNextDouble = (float) jm8Var.nextDouble();
                    continue;
                    jm8Var2 = jm8Var;
                    break;
                case 3:
                    map = map4;
                    arrayList = arrayList3;
                    fNextDouble2 = ((float) jm8Var.nextDouble()) - 0.01f;
                    break;
                case 4:
                    map = map4;
                    arrayList = arrayList3;
                    fNextDouble3 = (float) jm8Var.nextDouble();
                    break;
                case 5:
                    String[] strArrSplit = jm8Var.nextString().split("\\.");
                    if (!e1i.isAtLeastVersion(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), Integer.parseInt(strArrSplit[2]), 4, 4, 0)) {
                        bn9Var.addWarning("Lottie only supports bodymovin >= 4.4.0");
                        continue;
                    }
                    jm8Var2 = jm8Var;
                    break;
                case 6:
                    parseLayers(jm8Var2, bn9Var, arrayList2, zl9Var);
                    continue;
                    jm8Var2 = jm8Var;
                    break;
                case 7:
                    parseAssets(jm8Var2, bn9Var, map2, map3);
                    continue;
                    jm8Var2 = jm8Var;
                    break;
                case 8:
                    parseFonts(jm8Var2, map4);
                    continue;
                    jm8Var2 = jm8Var;
                    break;
                case 9:
                    parseChars(jm8Var2, bn9Var, mxfVar);
                    continue;
                    jm8Var2 = jm8Var;
                    break;
                case 10:
                    parseMarkers(jm8Var2, arrayList3);
                    continue;
                    jm8Var2 = jm8Var;
                    break;
                default:
                    jm8Var.skipName();
                    jm8Var.skipValue();
                    continue;
                    jm8Var2 = jm8Var;
                    break;
            }
            map4 = map;
            arrayList3 = arrayList;
            jm8Var2 = jm8Var;
        }
        bn9Var.init(new Rect(0, 0, (int) (iNextInt * fDpScale), (int) (iNextInt2 * fDpScale)), fNextDouble, fNextDouble2, fNextDouble3, arrayList2, zl9Var, map2, map3, mxfVar, map4, arrayList3);
        return bn9Var;
    }

    private static void parseAssets(jm8 jm8Var, bn9 bn9Var, Map<String, List<tu8>> map, Map<String, jo9> map2) throws IOException {
        jm8Var.beginArray();
        while (jm8Var.hasNext()) {
            ArrayList arrayList = new ArrayList();
            zl9 zl9Var = new zl9();
            jm8Var.beginObject();
            int iNextInt = 0;
            int iNextInt2 = 0;
            String strNextString = null;
            String strNextString2 = null;
            String strNextString3 = null;
            while (jm8Var.hasNext()) {
                int iSelectName = jm8Var.selectName(f71490b);
                if (iSelectName == 0) {
                    strNextString = jm8Var.nextString();
                } else if (iSelectName == 1) {
                    jm8Var.beginArray();
                    while (jm8Var.hasNext()) {
                        tu8 tu8Var = yu8.parse(jm8Var, bn9Var);
                        zl9Var.put(tu8Var.getId(), tu8Var);
                        arrayList.add(tu8Var);
                    }
                    jm8Var.endArray();
                } else if (iSelectName == 2) {
                    iNextInt = jm8Var.nextInt();
                } else if (iSelectName == 3) {
                    iNextInt2 = jm8Var.nextInt();
                } else if (iSelectName == 4) {
                    strNextString2 = jm8Var.nextString();
                } else if (iSelectName != 5) {
                    jm8Var.skipName();
                    jm8Var.skipValue();
                } else {
                    strNextString3 = jm8Var.nextString();
                }
            }
            jm8Var.endObject();
            if (strNextString2 != null) {
                jo9 jo9Var = new jo9(iNextInt, iNextInt2, strNextString, strNextString2, strNextString3);
                map2.put(jo9Var.getId(), jo9Var);
            } else {
                map.put(strNextString, arrayList);
            }
        }
        jm8Var.endArray();
    }

    private static void parseChars(jm8 jm8Var, bn9 bn9Var, mxf<bo6> mxfVar) throws IOException {
        jm8Var.beginArray();
        while (jm8Var.hasNext()) {
            bo6 bo6VarM4108a = co6.m4108a(jm8Var, bn9Var);
            mxfVar.put(bo6VarM4108a.hashCode(), bo6VarM4108a);
        }
        jm8Var.endArray();
    }

    private static void parseFonts(jm8 jm8Var, Map<String, yn6> map) throws IOException {
        jm8Var.beginObject();
        while (jm8Var.hasNext()) {
            if (jm8Var.selectName(f71491c) != 0) {
                jm8Var.skipName();
                jm8Var.skipValue();
            } else {
                jm8Var.beginArray();
                while (jm8Var.hasNext()) {
                    yn6 yn6VarM20468a = qo6.m20468a(jm8Var);
                    map.put(yn6VarM20468a.getName(), yn6VarM20468a);
                }
                jm8Var.endArray();
            }
        }
        jm8Var.endObject();
    }

    private static void parseLayers(jm8 jm8Var, bn9 bn9Var, List<tu8> list, zl9<tu8> zl9Var) throws IOException {
        jm8Var.beginArray();
        int i = 0;
        while (jm8Var.hasNext()) {
            tu8 tu8Var = yu8.parse(jm8Var, bn9Var);
            if (tu8Var.getLayerType() == tu8.EnumC13243a.IMAGE) {
                i++;
            }
            list.add(tu8Var);
            zl9Var.put(tu8Var.getId(), tu8Var);
            if (i > 4) {
                dj9.warning("You have " + i + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
            }
        }
        jm8Var.endArray();
    }

    private static void parseMarkers(jm8 jm8Var, List<eu9> list) throws IOException {
        jm8Var.beginArray();
        while (jm8Var.hasNext()) {
            jm8Var.beginObject();
            float fNextDouble = 0.0f;
            String strNextString = null;
            float fNextDouble2 = 0.0f;
            while (jm8Var.hasNext()) {
                int iSelectName = jm8Var.selectName(f71492d);
                if (iSelectName == 0) {
                    strNextString = jm8Var.nextString();
                } else if (iSelectName == 1) {
                    fNextDouble = (float) jm8Var.nextDouble();
                } else if (iSelectName != 2) {
                    jm8Var.skipName();
                    jm8Var.skipValue();
                } else {
                    fNextDouble2 = (float) jm8Var.nextDouble();
                }
            }
            jm8Var.endObject();
            list.add(new eu9(strNextString, fNextDouble, fNextDouble2));
        }
        jm8Var.endArray();
    }
}
