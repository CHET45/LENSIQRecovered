package p000;

import android.view.View;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class q8c {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final q8c f73609a = new q8c();

    /* JADX INFO: renamed from: b */
    @gib
    public static Method f73610b;

    /* JADX INFO: renamed from: c */
    public static boolean f73611c;

    private q8c() {
    }

    public final boolean rebuildOutline(@yfb View view) {
        view.invalidateOutline();
        return true;
    }
}
