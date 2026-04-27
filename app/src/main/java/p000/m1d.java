package p000;

import android.graphics.PointF;
import java.io.IOException;
import p000.jm8;

/* JADX INFO: loaded from: classes3.dex */
public class m1d implements r2i<PointF> {

    /* JADX INFO: renamed from: a */
    public static final m1d f59643a = new m1d();

    private m1d() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p000.r2i
    public PointF parse(jm8 jm8Var, float f) throws IOException {
        jm8.EnumC7982b enumC7982bPeek = jm8Var.peek();
        if (enumC7982bPeek == jm8.EnumC7982b.BEGIN_ARRAY) {
            return zm8.m26895b(jm8Var, f);
        }
        if (enumC7982bPeek == jm8.EnumC7982b.BEGIN_OBJECT) {
            return zm8.m26895b(jm8Var, f);
        }
        if (enumC7982bPeek == jm8.EnumC7982b.NUMBER) {
            PointF pointF = new PointF(((float) jm8Var.nextDouble()) * f, ((float) jm8Var.nextDouble()) * f);
            while (jm8Var.hasNext()) {
                jm8Var.skipValue();
            }
            return pointF;
        }
        throw new IllegalArgumentException("Cannot convert json to point. Next token is " + enumC7982bPeek);
    }
}
