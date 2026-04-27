package p000;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class v46 implements r2i<Float> {

    /* JADX INFO: renamed from: a */
    public static final v46 f89900a = new v46();

    private v46() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p000.r2i
    public Float parse(jm8 jm8Var, float f) throws IOException {
        return Float.valueOf(zm8.m26897d(jm8Var) * f);
    }
}
