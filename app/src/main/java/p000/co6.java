package p000;

import com.arthenica.ffmpegkit.MediaInformation;
import java.io.IOException;
import java.util.ArrayList;
import p000.jm8;

/* JADX INFO: loaded from: classes3.dex */
public class co6 {

    /* JADX INFO: renamed from: a */
    public static final jm8.C7981a f17231a = jm8.C7981a.m14177of("ch", MediaInformation.KEY_SIZE, "w", "style", "fFamily", "data");

    /* JADX INFO: renamed from: b */
    public static final jm8.C7981a f17232b = jm8.C7981a.m14177of("shapes");

    private co6() {
    }

    /* JADX INFO: renamed from: a */
    public static bo6 m4108a(jm8 jm8Var, bn9 bn9Var) throws IOException {
        ArrayList arrayList = new ArrayList();
        jm8Var.beginObject();
        double dNextDouble = 0.0d;
        String strNextString = null;
        String strNextString2 = null;
        char cCharAt = 0;
        double dNextDouble2 = 0.0d;
        while (jm8Var.hasNext()) {
            int iSelectName = jm8Var.selectName(f17231a);
            if (iSelectName == 0) {
                cCharAt = jm8Var.nextString().charAt(0);
            } else if (iSelectName == 1) {
                dNextDouble2 = jm8Var.nextDouble();
            } else if (iSelectName == 2) {
                dNextDouble = jm8Var.nextDouble();
            } else if (iSelectName == 3) {
                strNextString = jm8Var.nextString();
            } else if (iSelectName == 4) {
                strNextString2 = jm8Var.nextString();
            } else if (iSelectName != 5) {
                jm8Var.skipName();
                jm8Var.skipValue();
            } else {
                jm8Var.beginObject();
                while (jm8Var.hasNext()) {
                    if (jm8Var.selectName(f17232b) != 0) {
                        jm8Var.skipName();
                        jm8Var.skipValue();
                    } else {
                        jm8Var.beginArray();
                        while (jm8Var.hasNext()) {
                            arrayList.add((v8f) tw2.m22885a(jm8Var, bn9Var));
                        }
                        jm8Var.endArray();
                    }
                }
                jm8Var.endObject();
            }
        }
        jm8Var.endObject();
        return new bo6(arrayList, cCharAt, dNextDouble2, dNextDouble, strNextString, strNextString2);
    }
}
