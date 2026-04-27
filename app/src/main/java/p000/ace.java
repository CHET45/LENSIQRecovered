package p000;

import androidx.appcompat.widget.SearchView;
import java.io.IOException;
import p000.jm8;

/* JADX INFO: loaded from: classes3.dex */
public class ace {

    /* JADX INFO: renamed from: a */
    public static final jm8.C7981a f1088a = jm8.C7981a.m14177of(SearchView.f3153k3, "r", "hd");

    private ace() {
    }

    @hib
    /* JADX INFO: renamed from: a */
    public static ybe m421a(jm8 jm8Var, bn9 bn9Var) throws IOException {
        boolean zNextBoolean = false;
        String strNextString = null;
        C15326xw c15326xw = null;
        while (jm8Var.hasNext()) {
            int iSelectName = jm8Var.selectName(f1088a);
            if (iSelectName == 0) {
                strNextString = jm8Var.nextString();
            } else if (iSelectName == 1) {
                c15326xw = C10098nx.parseFloat(jm8Var, bn9Var, true);
            } else if (iSelectName != 2) {
                jm8Var.skipValue();
            } else {
                zNextBoolean = jm8Var.nextBoolean();
            }
        }
        if (zNextBoolean) {
            return null;
        }
        return new ybe(strNextString, c15326xw);
    }
}
