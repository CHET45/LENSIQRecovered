package p000;

import android.os.Trace;

/* JADX INFO: renamed from: tv */
/* JADX INFO: loaded from: classes.dex */
public final class C13250tv {
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
