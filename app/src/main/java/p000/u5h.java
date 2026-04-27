package p000;

import android.os.Trace;

/* JADX INFO: loaded from: classes.dex */
public final class u5h {
    @q64(message = "Use androidx.tracing.Trace instead", replaceWith = @i2e(expression = "trace(sectionName, block)", imports = {"androidx.tracing.trace"}))
    public static final <T> T trace(@yfb String str, @yfb ny6<? extends T> ny6Var) {
        Trace.beginSection(str);
        try {
            return ny6Var.invoke();
        } finally {
            o28.finallyStart(1);
            Trace.endSection();
            o28.finallyEnd(1);
        }
    }
}
