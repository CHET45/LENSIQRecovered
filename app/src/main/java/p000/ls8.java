package p000;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p000.jm8;

/* JADX INFO: loaded from: classes3.dex */
public class ls8 {

    /* JADX INFO: renamed from: a */
    public static jm8.C7981a f58610a = jm8.C7981a.m14177of("k");

    private ls8() {
    }

    /* JADX INFO: renamed from: a */
    public static <T> List<hs8<T>> m16340a(jm8 jm8Var, bn9 bn9Var, float f, r2i<T> r2iVar, boolean z) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (jm8Var.peek() == jm8.EnumC7982b.STRING) {
            bn9Var.addWarning("Lottie doesn't support expressions.");
            return arrayList;
        }
        jm8Var.beginObject();
        while (jm8Var.hasNext()) {
            if (jm8Var.selectName(f58610a) != 0) {
                jm8Var.skipValue();
            } else if (jm8Var.peek() == jm8.EnumC7982b.BEGIN_ARRAY) {
                jm8Var.beginArray();
                if (jm8Var.peek() == jm8.EnumC7982b.NUMBER) {
                    arrayList.add(ks8.m14977a(jm8Var, bn9Var, f, r2iVar, false, z));
                } else {
                    while (jm8Var.hasNext()) {
                        arrayList.add(ks8.m14977a(jm8Var, bn9Var, f, r2iVar, true, z));
                    }
                }
                jm8Var.endArray();
            } else {
                arrayList.add(ks8.m14977a(jm8Var, bn9Var, f, r2iVar, false, z));
            }
        }
        jm8Var.endObject();
        setEndFrames(arrayList);
        return arrayList;
    }

    public static <T> void setEndFrames(List<? extends hs8<T>> list) {
        int i;
        T t;
        int size = list.size();
        int i2 = 0;
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            hs8<T> hs8Var = list.get(i2);
            i2++;
            hs8<T> hs8Var2 = list.get(i2);
            hs8Var.f44697h = Float.valueOf(hs8Var2.f44696g);
            if (hs8Var.f44692c == null && (t = hs8Var2.f44691b) != null) {
                hs8Var.f44692c = t;
                if (hs8Var instanceof jjc) {
                    ((jjc) hs8Var).createPath();
                }
            }
        }
        hs8<T> hs8Var3 = list.get(i);
        if ((hs8Var3.f44691b == null || hs8Var3.f44692c == null) && list.size() > 1) {
            list.remove(hs8Var3);
        }
    }
}
