package p000;

import android.graphics.PointF;
import java.io.IOException;
import java.util.ArrayList;
import p000.jm8;

/* JADX INFO: renamed from: cx */
/* JADX INFO: loaded from: classes3.dex */
public class C4548cx {

    /* JADX INFO: renamed from: a */
    public static final jm8.C7981a f27976a = jm8.C7981a.m14177of("k", "x", "y");

    private C4548cx() {
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceC9576mx<PointF, PointF> m8767a(jm8 jm8Var, bn9 bn9Var) throws IOException {
        jm8Var.beginObject();
        C2094bx c2094bx = null;
        C15326xw c15326xw = null;
        boolean z = false;
        C15326xw c15326xw2 = null;
        while (jm8Var.peek() != jm8.EnumC7982b.END_OBJECT) {
            int iSelectName = jm8Var.selectName(f27976a);
            if (iSelectName == 0) {
                c2094bx = parse(jm8Var, bn9Var);
            } else if (iSelectName != 1) {
                if (iSelectName != 2) {
                    jm8Var.skipName();
                    jm8Var.skipValue();
                } else if (jm8Var.peek() == jm8.EnumC7982b.STRING) {
                    jm8Var.skipValue();
                    z = true;
                } else {
                    c15326xw = C10098nx.parseFloat(jm8Var, bn9Var);
                }
            } else if (jm8Var.peek() == jm8.EnumC7982b.STRING) {
                jm8Var.skipValue();
                z = true;
            } else {
                c15326xw2 = C10098nx.parseFloat(jm8Var, bn9Var);
            }
        }
        jm8Var.endObject();
        if (z) {
            bn9Var.addWarning("Lottie doesn't support expressions.");
        }
        return c2094bx != null ? c2094bx : new C6634gx(c15326xw2, c15326xw);
    }

    public static C2094bx parse(jm8 jm8Var, bn9 bn9Var) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (jm8Var.peek() == jm8.EnumC7982b.BEGIN_ARRAY) {
            jm8Var.beginArray();
            while (jm8Var.hasNext()) {
                arrayList.add(ljc.m16183a(jm8Var, bn9Var));
            }
            jm8Var.endArray();
            ls8.setEndFrames(arrayList);
        } else {
            arrayList.add(new hs8(zm8.m26895b(jm8Var, e1i.dpScale())));
        }
        return new C2094bx(arrayList);
    }
}
