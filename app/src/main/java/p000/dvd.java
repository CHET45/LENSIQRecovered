package p000;

import android.graphics.PointF;
import androidx.appcompat.widget.SearchView;
import java.io.IOException;
import p000.jm8;

/* JADX INFO: loaded from: classes3.dex */
public class dvd {

    /* JADX INFO: renamed from: a */
    public static final jm8.C7981a f31042a = jm8.C7981a.m14177of(SearchView.f3153k3, "p", "s", "r", "hd");

    private dvd() {
    }

    /* JADX INFO: renamed from: a */
    public static bvd m9434a(jm8 jm8Var, bn9 bn9Var) throws IOException {
        String strNextString = null;
        InterfaceC9576mx<PointF, PointF> interfaceC9576mxM8767a = null;
        C4992dx c4992dxM18174e = null;
        C15326xw c15326xw = null;
        boolean zNextBoolean = false;
        while (jm8Var.hasNext()) {
            int iSelectName = jm8Var.selectName(f31042a);
            if (iSelectName == 0) {
                strNextString = jm8Var.nextString();
            } else if (iSelectName == 1) {
                interfaceC9576mxM8767a = C4548cx.m8767a(jm8Var, bn9Var);
            } else if (iSelectName == 2) {
                c4992dxM18174e = C10098nx.m18174e(jm8Var, bn9Var);
            } else if (iSelectName == 3) {
                c15326xw = C10098nx.parseFloat(jm8Var, bn9Var);
            } else if (iSelectName != 4) {
                jm8Var.skipValue();
            } else {
                zNextBoolean = jm8Var.nextBoolean();
            }
        }
        return new bvd(strNextString, interfaceC9576mxM8767a, c4992dxM18174e, c15326xw, zNextBoolean);
    }
}
