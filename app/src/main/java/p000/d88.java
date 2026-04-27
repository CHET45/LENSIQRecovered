package p000;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class d88 implements r2i<Integer> {

    /* JADX INFO: renamed from: a */
    public static final d88 f28738a = new d88();

    private d88() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p000.r2i
    public Integer parse(jm8 jm8Var, float f) throws IOException {
        return Integer.valueOf(Math.round(zm8.m26897d(jm8Var) * f));
    }
}
