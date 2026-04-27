package p000;

import androidx.appcompat.widget.SearchView;
import java.io.IOException;
import p000.jm8;

/* JADX INFO: loaded from: classes3.dex */
public class d9f {

    /* JADX INFO: renamed from: a */
    public static jm8.C7981a f28840a = jm8.C7981a.m14177of(SearchView.f3153k3, "ind", "ks", "hd");

    private d9f() {
    }

    /* JADX INFO: renamed from: a */
    public static b9f m8993a(jm8 jm8Var, bn9 bn9Var) throws IOException {
        String strNextString = null;
        int iNextInt = 0;
        boolean zNextBoolean = false;
        C6011fx c6011fxM18176g = null;
        while (jm8Var.hasNext()) {
            int iSelectName = jm8Var.selectName(f28840a);
            if (iSelectName == 0) {
                strNextString = jm8Var.nextString();
            } else if (iSelectName == 1) {
                iNextInt = jm8Var.nextInt();
            } else if (iSelectName == 2) {
                c6011fxM18176g = C10098nx.m18176g(jm8Var, bn9Var);
            } else if (iSelectName != 3) {
                jm8Var.skipValue();
            } else {
                zNextBoolean = jm8Var.nextBoolean();
            }
        }
        return new b9f(strNextString, iNextInt, c6011fxM18176g, zNextBoolean);
    }
}
