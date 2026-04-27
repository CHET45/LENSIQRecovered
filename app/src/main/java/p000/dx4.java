package p000;

import android.view.inputmethod.EditorInfo;

/* JADX INFO: loaded from: classes.dex */
@c5e(34)
public final class dx4 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final dx4 f31225a = new dx4();

    private dx4() {
    }

    @ih4
    public final void setHandwritingGestures(@yfb EditorInfo editorInfo) {
        editorInfo.setSupportedHandwritingGestures(l82.listOf((Object[]) new Class[]{uw4.m23613a(), yw4.m26376a(), vw4.m24211a(), ww4.m24847a(), zw4.m27103a(), ax4.m2717a(), bx4.m3473a()}));
        editorInfo.setSupportedHandwritingGesturePreviews(w6f.setOf((Object[]) new Class[]{uw4.m23613a(), yw4.m26376a(), vw4.m24211a(), ww4.m24847a()}));
    }
}
