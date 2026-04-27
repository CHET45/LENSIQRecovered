package p000;

import android.graphics.Path;
import androidx.appcompat.widget.SearchView;
import java.io.IOException;
import java.util.Collections;
import p000.jm8;

/* JADX INFO: loaded from: classes3.dex */
public class c97 {

    /* JADX INFO: renamed from: a */
    public static final jm8.C7981a f16036a = jm8.C7981a.m14177of(SearchView.f3153k3, "g", "o", "t", "s", "e", "r", "hd");

    /* JADX INFO: renamed from: b */
    public static final jm8.C7981a f16037b = jm8.C7981a.m14177of("p", "k");

    private c97() {
    }

    /* JADX INFO: renamed from: a */
    public static a97 m3843a(jm8 jm8Var, bn9 bn9Var) throws IOException {
        C16264zw c16264zwM18173d = null;
        Path.FillType fillType = Path.FillType.WINDING;
        String strNextString = null;
        g97 g97Var = null;
        C15854yw c15854ywM18172c = null;
        C4992dx c4992dxM18174e = null;
        C4992dx c4992dxM18174e2 = null;
        boolean zNextBoolean = false;
        while (jm8Var.hasNext()) {
            switch (jm8Var.selectName(f16036a)) {
                case 0:
                    strNextString = jm8Var.nextString();
                    break;
                case 1:
                    jm8Var.beginObject();
                    int iNextInt = -1;
                    while (jm8Var.hasNext()) {
                        int iSelectName = jm8Var.selectName(f16037b);
                        if (iSelectName == 0) {
                            iNextInt = jm8Var.nextInt();
                        } else if (iSelectName != 1) {
                            jm8Var.skipName();
                            jm8Var.skipValue();
                        } else {
                            c15854ywM18172c = C10098nx.m18172c(jm8Var, bn9Var, iNextInt);
                        }
                    }
                    jm8Var.endObject();
                    break;
                case 2:
                    c16264zwM18173d = C10098nx.m18173d(jm8Var, bn9Var);
                    break;
                case 3:
                    g97Var = jm8Var.nextInt() == 1 ? g97.LINEAR : g97.RADIAL;
                    break;
                case 4:
                    c4992dxM18174e = C10098nx.m18174e(jm8Var, bn9Var);
                    break;
                case 5:
                    c4992dxM18174e2 = C10098nx.m18174e(jm8Var, bn9Var);
                    break;
                case 6:
                    fillType = jm8Var.nextInt() == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
                    break;
                case 7:
                    zNextBoolean = jm8Var.nextBoolean();
                    break;
                default:
                    jm8Var.skipName();
                    jm8Var.skipValue();
                    break;
            }
        }
        return new a97(strNextString, g97Var, fillType, c15854ywM18172c, c16264zwM18173d == null ? new C16264zw(Collections.singletonList(new hs8(100))) : c16264zwM18173d, c4992dxM18174e, c4992dxM18174e2, null, null, zNextBoolean);
    }
}
