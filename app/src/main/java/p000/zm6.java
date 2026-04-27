package p000;

import android.view.KeyEvent;
import androidx.compose.p002ui.InterfaceC0701e;
import androidx.compose.p002ui.focus.C0714c;
import androidx.compose.p002ui.focus.FocusTargetNode;

/* JADX INFO: loaded from: classes.dex */
public interface zm6 extends um6 {

    /* JADX INFO: renamed from: zm6$a */
    public static final class C16185a extends tt8 implements ny6<Boolean> {

        /* JADX INFO: renamed from: a */
        public static final C16185a f105475a = new C16185a();

        public C16185a() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p000.ny6
        @yfb
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: dispatchKeyEvent-YhN2O0w$default, reason: not valid java name */
    static /* synthetic */ boolean m33509dispatchKeyEventYhN2O0w$default(zm6 zm6Var, KeyEvent keyEvent, ny6 ny6Var, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: dispatchKeyEvent-YhN2O0w");
        }
        if ((i & 2) != 0) {
            ny6Var = C16185a.f105475a;
        }
        return zm6Var.mo27517dispatchKeyEventYhN2O0w(keyEvent, ny6Var);
    }

    /* JADX INFO: renamed from: clearFocus-I7lrPNg */
    boolean mo27515clearFocusI7lrPNg(boolean z, boolean z2, boolean z3, int i);

    /* JADX INFO: renamed from: dispatchInterceptedSoftKeyboardEvent-ZmokQxo */
    boolean mo27516dispatchInterceptedSoftKeyboardEventZmokQxo(@yfb KeyEvent keyEvent);

    /* JADX INFO: renamed from: dispatchKeyEvent-YhN2O0w */
    boolean mo27517dispatchKeyEventYhN2O0w(@yfb KeyEvent keyEvent, @yfb ny6<Boolean> ny6Var);

    boolean dispatchRotaryEvent(@yfb hbe hbeVar);

    @gib
    /* JADX INFO: renamed from: focusSearch-ULY8qGw */
    Boolean mo27518focusSearchULY8qGw(int i, @gib rud rudVar, @yfb qy6<? super FocusTargetNode, Boolean> qy6Var);

    @gib
    rud getFocusRect();

    @yfb
    pn6 getFocusTransactionManager();

    @yfb
    InterfaceC0701e getModifier();

    @yfb
    in6 getRootState();

    void releaseFocus();

    /* JADX INFO: renamed from: requestFocusForOwner-7o62pno */
    boolean mo27520requestFocusForOwner7o62pno(@gib C0714c c0714c, @gib rud rudVar);

    void scheduleInvalidation(@yfb an6 an6Var);

    void scheduleInvalidation(@yfb FocusTargetNode focusTargetNode);

    void scheduleInvalidation(@yfb nm6 nm6Var);

    /* JADX INFO: renamed from: takeFocus-aToIllA */
    boolean mo27521takeFocusaToIllA(int i, @gib rud rudVar);
}
