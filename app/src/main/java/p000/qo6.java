package p000;

import java.io.IOException;
import p000.jm8;

/* JADX INFO: loaded from: classes3.dex */
public class qo6 {

    /* JADX INFO: renamed from: a */
    public static final jm8.C7981a f75039a = jm8.C7981a.m14177of("fFamily", "fName", "fStyle", "ascent");

    private qo6() {
    }

    /* JADX INFO: renamed from: a */
    public static yn6 m20468a(jm8 jm8Var) throws IOException {
        jm8Var.beginObject();
        String strNextString = null;
        String strNextString2 = null;
        float fNextDouble = 0.0f;
        String strNextString3 = null;
        while (jm8Var.hasNext()) {
            int iSelectName = jm8Var.selectName(f75039a);
            if (iSelectName == 0) {
                strNextString = jm8Var.nextString();
            } else if (iSelectName == 1) {
                strNextString3 = jm8Var.nextString();
            } else if (iSelectName == 2) {
                strNextString2 = jm8Var.nextString();
            } else if (iSelectName != 3) {
                jm8Var.skipName();
                jm8Var.skipValue();
            } else {
                fNextDouble = (float) jm8Var.nextDouble();
            }
        }
        jm8Var.endObject();
        return new yn6(strNextString, strNextString3, strNextString2, fNextDouble);
    }
}
