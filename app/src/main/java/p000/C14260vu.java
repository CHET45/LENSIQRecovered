package p000;

import android.content.Context;
import android.graphics.Typeface;

/* JADX INFO: renamed from: vu */
/* JADX INFO: loaded from: classes.dex */
@c5e(26)
@q64(message = "Only used by deprecated APIs in this file, remove with them.")
public final class C14260vu {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final C14260vu f92262a = new C14260vu();

    private C14260vu() {
    }

    @c5e(26)
    @yfb
    @ih4
    public final Typeface create(@yfb Context context, int i) {
        return context.getResources().getFont(i);
    }
}
