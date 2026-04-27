package p000;

import android.graphics.Color;
import java.io.IOException;
import p000.jm8;

/* JADX INFO: loaded from: classes3.dex */
public class r92 implements r2i<Integer> {

    /* JADX INFO: renamed from: a */
    public static final r92 f77439a = new r92();

    private r92() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p000.r2i
    public Integer parse(jm8 jm8Var, float f) throws IOException {
        boolean z = jm8Var.peek() == jm8.EnumC7982b.BEGIN_ARRAY;
        if (z) {
            jm8Var.beginArray();
        }
        double dNextDouble = jm8Var.nextDouble();
        double dNextDouble2 = jm8Var.nextDouble();
        double dNextDouble3 = jm8Var.nextDouble();
        double dNextDouble4 = jm8Var.peek() == jm8.EnumC7982b.NUMBER ? jm8Var.nextDouble() : 1.0d;
        if (z) {
            jm8Var.endArray();
        }
        if (dNextDouble <= 1.0d && dNextDouble2 <= 1.0d && dNextDouble3 <= 1.0d) {
            dNextDouble *= 255.0d;
            dNextDouble2 *= 255.0d;
            dNextDouble3 *= 255.0d;
            if (dNextDouble4 <= 1.0d) {
                dNextDouble4 *= 255.0d;
            }
        }
        return Integer.valueOf(Color.argb((int) dNextDouble4, (int) dNextDouble, (int) dNextDouble2, (int) dNextDouble3));
    }
}
