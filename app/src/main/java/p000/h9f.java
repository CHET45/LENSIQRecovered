package p000;

import androidx.appcompat.widget.SearchView;
import java.io.IOException;
import p000.g9f;
import p000.jm8;

/* JADX INFO: loaded from: classes3.dex */
public class h9f {

    /* JADX INFO: renamed from: a */
    public static final jm8.C7981a f42961a = jm8.C7981a.m14177of("s", "e", "o", SearchView.f3153k3, "m", "hd");

    private h9f() {
    }

    /* JADX INFO: renamed from: a */
    public static g9f m12284a(jm8 jm8Var, bn9 bn9Var) throws IOException {
        String strNextString = null;
        g9f.EnumC6176a enumC6176aForId = null;
        C15326xw c15326xw = null;
        C15326xw c15326xw2 = null;
        C15326xw c15326xw3 = null;
        boolean zNextBoolean = false;
        while (jm8Var.hasNext()) {
            int iSelectName = jm8Var.selectName(f42961a);
            if (iSelectName == 0) {
                c15326xw = C10098nx.parseFloat(jm8Var, bn9Var, false);
            } else if (iSelectName == 1) {
                c15326xw2 = C10098nx.parseFloat(jm8Var, bn9Var, false);
            } else if (iSelectName == 2) {
                c15326xw3 = C10098nx.parseFloat(jm8Var, bn9Var, false);
            } else if (iSelectName == 3) {
                strNextString = jm8Var.nextString();
            } else if (iSelectName == 4) {
                enumC6176aForId = g9f.EnumC6176a.forId(jm8Var.nextInt());
            } else if (iSelectName != 5) {
                jm8Var.skipValue();
            } else {
                zNextBoolean = jm8Var.nextBoolean();
            }
        }
        return new g9f(strNextString, enumC6176aForId, c15326xw, c15326xw2, c15326xw3, zNextBoolean);
    }
}
