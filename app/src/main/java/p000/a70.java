package p000;

import p000.v7e;

/* JADX INFO: loaded from: classes7.dex */
public final class a70 {

    /* JADX INFO: renamed from: a */
    public static final int f520a;

    static {
        Object objM32723constructorimpl;
        try {
            v7e.C13927a c13927a = v7e.f90266b;
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            md8.checkNotNullExpressionValue(property, "getProperty(...)");
            objM32723constructorimpl = v7e.m32723constructorimpl(g9g.toIntOrNull(property));
        } catch (Throwable th) {
            v7e.C13927a c13927a2 = v7e.f90266b;
            objM32723constructorimpl = v7e.m32723constructorimpl(y7e.createFailure(th));
        }
        if (v7e.m32729isFailureimpl(objM32723constructorimpl)) {
            objM32723constructorimpl = null;
        }
        Integer num = (Integer) objM32723constructorimpl;
        f520a = num != null ? num.intValue() : 2097152;
    }
}
