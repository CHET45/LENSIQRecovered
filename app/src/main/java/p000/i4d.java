package p000;

import android.graphics.PointF;
import androidx.appcompat.widget.SearchView;
import java.io.IOException;
import p000.h4d;
import p000.jm8;

/* JADX INFO: loaded from: classes3.dex */
public class i4d {

    /* JADX INFO: renamed from: a */
    public static final jm8.C7981a f45724a = jm8.C7981a.m14177of(SearchView.f3153k3, "sy", ufh.f87925l, "p", "r", "or", "os", "ir", "is", "hd", "d");

    private i4d() {
    }

    /* JADX INFO: renamed from: a */
    public static h4d m12769a(jm8 jm8Var, bn9 bn9Var, int i) throws IOException {
        boolean zNextBoolean = false;
        boolean z = i == 3;
        String strNextString = null;
        h4d.EnumC6708a enumC6708aForValue = null;
        C15326xw c15326xw = null;
        InterfaceC9576mx<PointF, PointF> interfaceC9576mxM8767a = null;
        C15326xw c15326xw2 = null;
        C15326xw c15326xw3 = null;
        C15326xw c15326xw4 = null;
        C15326xw c15326xw5 = null;
        C15326xw c15326xw6 = null;
        while (jm8Var.hasNext()) {
            switch (jm8Var.selectName(f45724a)) {
                case 0:
                    strNextString = jm8Var.nextString();
                    break;
                case 1:
                    enumC6708aForValue = h4d.EnumC6708a.forValue(jm8Var.nextInt());
                    break;
                case 2:
                    c15326xw = C10098nx.parseFloat(jm8Var, bn9Var, false);
                    break;
                case 3:
                    interfaceC9576mxM8767a = C4548cx.m8767a(jm8Var, bn9Var);
                    break;
                case 4:
                    c15326xw2 = C10098nx.parseFloat(jm8Var, bn9Var, false);
                    break;
                case 5:
                    c15326xw4 = C10098nx.parseFloat(jm8Var, bn9Var);
                    break;
                case 6:
                    c15326xw6 = C10098nx.parseFloat(jm8Var, bn9Var, false);
                    break;
                case 7:
                    c15326xw3 = C10098nx.parseFloat(jm8Var, bn9Var);
                    break;
                case 8:
                    c15326xw5 = C10098nx.parseFloat(jm8Var, bn9Var, false);
                    break;
                case 9:
                    zNextBoolean = jm8Var.nextBoolean();
                    break;
                case 10:
                    z = jm8Var.nextInt() == 3;
                    break;
                default:
                    jm8Var.skipName();
                    jm8Var.skipValue();
                    break;
            }
        }
        return new h4d(strNextString, enumC6708aForValue, c15326xw, interfaceC9576mxM8767a, c15326xw2, c15326xw3, c15326xw4, c15326xw5, c15326xw6, zNextBoolean, z);
    }
}
