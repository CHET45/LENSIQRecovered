package p000;

import android.view.PointerIcon;
import android.view.View;

/* JADX INFO: renamed from: hr */
/* JADX INFO: loaded from: classes.dex */
@c5e(24)
public final class C6977hr {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final C6977hr f44616a = new C6977hr();

    private C6977hr() {
    }

    @c5e(24)
    @ih4
    public final void setPointerIcon(@yfb View view, @gib a2d a2dVar) {
        PointerIcon pointerIcon = a2dVar instanceof C10060nu ? ((C10060nu) a2dVar).getPointerIcon() : a2dVar instanceof C10654ou ? PointerIcon.getSystemIcon(view.getContext(), ((C10654ou) a2dVar).getType()) : PointerIcon.getSystemIcon(view.getContext(), 1000);
        if (md8.areEqual(view.getPointerIcon(), pointerIcon)) {
            return;
        }
        view.setPointerIcon(pointerIcon);
    }
}
