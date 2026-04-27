package p000;

import java.io.IOException;
import p000.jm8;

/* JADX INFO: loaded from: classes3.dex */
public class tw2 {

    /* JADX INFO: renamed from: a */
    public static final jm8.C7981a f86160a = jm8.C7981a.m14177of("ty", "d");

    private tw2() {
    }

    @hib
    /* JADX INFO: renamed from: a */
    public static sw2 m22885a(jm8 jm8Var, bn9 bn9Var) throws IOException {
        sw2 sw2VarM11281a;
        String strNextString;
        jm8Var.beginObject();
        int iNextInt = 2;
        while (true) {
            sw2VarM11281a = null;
            if (!jm8Var.hasNext()) {
                strNextString = null;
                break;
            }
            int iSelectName = jm8Var.selectName(f86160a);
            if (iSelectName == 0) {
                strNextString = jm8Var.nextString();
                break;
            }
            if (iSelectName != 1) {
                jm8Var.skipName();
                jm8Var.skipValue();
            } else {
                iNextInt = jm8Var.nextInt();
            }
        }
        if (strNextString == null) {
            return null;
        }
        switch (strNextString) {
            case "el":
                sw2VarM11281a = g02.m11281a(jm8Var, bn9Var, iNextInt);
                break;
            case "fl":
                sw2VarM11281a = u8f.m23164a(jm8Var, bn9Var);
                break;
            case "gf":
                sw2VarM11281a = c97.m3843a(jm8Var, bn9Var);
                break;
            case "gr":
                sw2VarM11281a = w8f.m24428a(jm8Var, bn9Var);
                break;
            case "gs":
                sw2VarM11281a = f97.m10727a(jm8Var, bn9Var);
                break;
            case "mm":
                sw2VarM11281a = pra.m19715a(jm8Var);
                bn9Var.addWarning("Animation contains merge paths. Merge paths are only supported on KitKat+ and must be manually enabled by calling enableMergePathsForKitKatAndAbove().");
                break;
            case "rc":
                sw2VarM11281a = dvd.m9434a(jm8Var, bn9Var);
                break;
            case "rd":
                sw2VarM11281a = ace.m421a(jm8Var, bn9Var);
                break;
            case "rp":
                sw2VarM11281a = g2e.m11337a(jm8Var, bn9Var);
                break;
            case "sh":
                sw2VarM11281a = d9f.m8993a(jm8Var, bn9Var);
                break;
            case "sr":
                sw2VarM11281a = i4d.m12769a(jm8Var, bn9Var, iNextInt);
                break;
            case "st":
                sw2VarM11281a = f9f.m10731a(jm8Var, bn9Var);
                break;
            case "tm":
                sw2VarM11281a = h9f.m12284a(jm8Var, bn9Var);
                break;
            case "tr":
                sw2VarM11281a = C9015lx.parse(jm8Var, bn9Var);
                break;
            default:
                dj9.warning("Unknown shape type " + strNextString);
                break;
        }
        while (jm8Var.hasNext()) {
            jm8Var.skipValue();
        }
        jm8Var.endObject();
        return sw2VarM11281a;
    }
}
