package p000;

import androidx.appcompat.widget.SearchView;
import java.io.IOException;
import p000.jm8;
import p000.nra;

/* JADX INFO: loaded from: classes3.dex */
public class pra {

    /* JADX INFO: renamed from: a */
    public static final jm8.C7981a f71730a = jm8.C7981a.m14177of(SearchView.f3153k3, "mm", "hd");

    private pra() {
    }

    /* JADX INFO: renamed from: a */
    public static nra m19715a(jm8 jm8Var) throws IOException {
        String strNextString = null;
        boolean zNextBoolean = false;
        nra.EnumC10023a enumC10023aForId = null;
        while (jm8Var.hasNext()) {
            int iSelectName = jm8Var.selectName(f71730a);
            if (iSelectName == 0) {
                strNextString = jm8Var.nextString();
            } else if (iSelectName == 1) {
                enumC10023aForId = nra.EnumC10023a.forId(jm8Var.nextInt());
            } else if (iSelectName != 2) {
                jm8Var.skipName();
                jm8Var.skipValue();
            } else {
                zNextBoolean = jm8Var.nextBoolean();
            }
        }
        return new nra(strNextString, enumC10023aForId, zNextBoolean);
    }
}
