package p000;

import android.graphics.Path;
import androidx.appcompat.widget.SearchView;
import java.io.IOException;
import java.util.Collections;
import p000.jm8;

/* JADX INFO: loaded from: classes3.dex */
public class u8f {

    /* JADX INFO: renamed from: a */
    public static final jm8.C7981a f87076a = jm8.C7981a.m14177of(SearchView.f3153k3, "c", "o", "fillEnabled", "r", "hd");

    private u8f() {
    }

    /* JADX INFO: renamed from: a */
    public static t8f m23164a(jm8 jm8Var, bn9 bn9Var) throws IOException {
        C16264zw c16264zw = null;
        String strNextString = null;
        C14811ww c14811wwM18170a = null;
        boolean zNextBoolean = false;
        boolean zNextBoolean2 = false;
        int iNextInt = 1;
        while (jm8Var.hasNext()) {
            int iSelectName = jm8Var.selectName(f87076a);
            if (iSelectName == 0) {
                strNextString = jm8Var.nextString();
            } else if (iSelectName == 1) {
                c14811wwM18170a = C10098nx.m18170a(jm8Var, bn9Var);
            } else if (iSelectName == 2) {
                c16264zw = C10098nx.m18173d(jm8Var, bn9Var);
            } else if (iSelectName == 3) {
                zNextBoolean = jm8Var.nextBoolean();
            } else if (iSelectName == 4) {
                iNextInt = jm8Var.nextInt();
            } else if (iSelectName != 5) {
                jm8Var.skipName();
                jm8Var.skipValue();
            } else {
                zNextBoolean2 = jm8Var.nextBoolean();
            }
        }
        if (c16264zw == null) {
            c16264zw = new C16264zw(Collections.singletonList(new hs8(100)));
        }
        return new t8f(strNextString, zNextBoolean, iNextInt == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD, c14811wwM18170a, c16264zw, zNextBoolean2);
    }
}
