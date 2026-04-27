package p000;

import androidx.compose.p002ui.InterfaceC0701e;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nObserverModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ObserverModifierNode.kt\nandroidx/compose/ui/node/ObserverModifierNodeKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,63:1\n1#2:64\n*E\n"})
public final class txb {
    public static final <T extends InterfaceC0701e.d & sxb> void observeReads(@yfb T t, @yfb ny6<bth> ny6Var) {
        uxb ownerScope$ui_release = t.getOwnerScope$ui_release();
        if (ownerScope$ui_release == null) {
            ownerScope$ui_release = new uxb(t);
            t.setOwnerScope$ui_release(ownerScope$ui_release);
        }
        w34.requireOwner(t).getSnapshotObserver().observeReads$ui_release(ownerScope$ui_release, uxb.f89416b.getOnObserveReadsChanged$ui_release(), ny6Var);
    }
}
