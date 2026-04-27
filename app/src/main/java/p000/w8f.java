package p000;

import androidx.appcompat.widget.SearchView;
import java.io.IOException;
import java.util.ArrayList;
import p000.jm8;

/* JADX INFO: loaded from: classes3.dex */
public class w8f {

    /* JADX INFO: renamed from: a */
    public static final jm8.C7981a f93620a = jm8.C7981a.m14177of(SearchView.f3153k3, "hd", "it");

    private w8f() {
    }

    /* JADX INFO: renamed from: a */
    public static v8f m24428a(jm8 jm8Var, bn9 bn9Var) throws IOException {
        ArrayList arrayList = new ArrayList();
        String strNextString = null;
        boolean zNextBoolean = false;
        while (jm8Var.hasNext()) {
            int iSelectName = jm8Var.selectName(f93620a);
            if (iSelectName == 0) {
                strNextString = jm8Var.nextString();
            } else if (iSelectName == 1) {
                zNextBoolean = jm8Var.nextBoolean();
            } else if (iSelectName != 2) {
                jm8Var.skipValue();
            } else {
                jm8Var.beginArray();
                while (jm8Var.hasNext()) {
                    sw2 sw2VarM22885a = tw2.m22885a(jm8Var, bn9Var);
                    if (sw2VarM22885a != null) {
                        arrayList.add(sw2VarM22885a);
                    }
                }
                jm8Var.endArray();
            }
        }
        return new v8f(strNextString, arrayList, zNextBoolean);
    }
}
