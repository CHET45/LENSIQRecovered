package p000;

import java.io.IOException;
import p000.jm8;

/* JADX INFO: loaded from: classes3.dex */
public class yme implements r2i<xme> {

    /* JADX INFO: renamed from: a */
    public static final yme f102070a = new yme();

    private yme() {
    }

    @Override // p000.r2i
    public xme parse(jm8 jm8Var, float f) throws IOException {
        boolean z = jm8Var.peek() == jm8.EnumC7982b.BEGIN_ARRAY;
        if (z) {
            jm8Var.beginArray();
        }
        float fNextDouble = (float) jm8Var.nextDouble();
        float fNextDouble2 = (float) jm8Var.nextDouble();
        while (jm8Var.hasNext()) {
            jm8Var.skipValue();
        }
        if (z) {
            jm8Var.endArray();
        }
        return new xme((fNextDouble / 100.0f) * f, (fNextDouble2 / 100.0f) * f);
    }
}
