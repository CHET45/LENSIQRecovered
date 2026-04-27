package p000;

import androidx.appcompat.widget.SearchView;
import java.io.IOException;
import p000.jm8;

/* JADX INFO: loaded from: classes3.dex */
public class g2e {

    /* JADX INFO: renamed from: a */
    public static final jm8.C7981a f38303a = jm8.C7981a.m14177of(SearchView.f3153k3, "c", "o", "tr", "hd");

    private g2e() {
    }

    /* JADX INFO: renamed from: a */
    public static e2e m11337a(jm8 jm8Var, bn9 bn9Var) throws IOException {
        String strNextString = null;
        C15326xw c15326xw = null;
        C15326xw c15326xw2 = null;
        C8540kx c8540kx = null;
        boolean zNextBoolean = false;
        while (jm8Var.hasNext()) {
            int iSelectName = jm8Var.selectName(f38303a);
            if (iSelectName == 0) {
                strNextString = jm8Var.nextString();
            } else if (iSelectName == 1) {
                c15326xw = C10098nx.parseFloat(jm8Var, bn9Var, false);
            } else if (iSelectName == 2) {
                c15326xw2 = C10098nx.parseFloat(jm8Var, bn9Var, false);
            } else if (iSelectName == 3) {
                c8540kx = C9015lx.parse(jm8Var, bn9Var);
            } else if (iSelectName != 4) {
                jm8Var.skipValue();
            } else {
                zNextBoolean = jm8Var.nextBoolean();
            }
        }
        return new e2e(strNextString, c15326xw, c15326xw2, c8540kx, zNextBoolean);
    }
}
