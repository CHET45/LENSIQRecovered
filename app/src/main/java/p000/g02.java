package p000;

import android.graphics.PointF;
import androidx.appcompat.widget.SearchView;
import java.io.IOException;
import p000.jm8;

/* JADX INFO: loaded from: classes3.dex */
public class g02 {

    /* JADX INFO: renamed from: a */
    public static final jm8.C7981a f38104a = jm8.C7981a.m14177of(SearchView.f3153k3, "p", "s", "hd", "d");

    private g02() {
    }

    /* JADX INFO: renamed from: a */
    public static f02 m11281a(jm8 jm8Var, bn9 bn9Var, int i) throws IOException {
        boolean z = i == 3;
        boolean zNextBoolean = false;
        String strNextString = null;
        InterfaceC9576mx<PointF, PointF> interfaceC9576mxM8767a = null;
        C4992dx c4992dxM18174e = null;
        while (jm8Var.hasNext()) {
            int iSelectName = jm8Var.selectName(f38104a);
            if (iSelectName == 0) {
                strNextString = jm8Var.nextString();
            } else if (iSelectName == 1) {
                interfaceC9576mxM8767a = C4548cx.m8767a(jm8Var, bn9Var);
            } else if (iSelectName == 2) {
                c4992dxM18174e = C10098nx.m18174e(jm8Var, bn9Var);
            } else if (iSelectName == 3) {
                zNextBoolean = jm8Var.nextBoolean();
            } else if (iSelectName != 4) {
                jm8Var.skipName();
                jm8Var.skipValue();
            } else {
                z = jm8Var.nextInt() == 3;
            }
        }
        return new f02(strNextString, interfaceC9576mxM8767a, c4992dxM18174e, z, zNextBoolean);
    }
}
