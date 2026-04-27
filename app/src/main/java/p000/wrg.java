package p000;

import androidx.compose.foundation.FocusableKt;
import androidx.compose.p002ui.InterfaceC0701e;
import androidx.compose.p002ui.focus.C0713b;
import androidx.compose.p002ui.focus.C0723l;
import androidx.compose.p002ui.focus.C0724m;

/* JADX INFO: loaded from: classes.dex */
public final class wrg {
    @yfb
    public static final InterfaceC0701e textFieldFocusModifier(@yfb InterfaceC0701e interfaceC0701e, boolean z, @yfb C0723l c0723l, @gib l5b l5bVar, @yfb qy6<? super in6, bth> qy6Var) {
        return FocusableKt.focusable(C0713b.onFocusChanged(C0724m.focusRequester(interfaceC0701e, c0723l), qy6Var), z, l5bVar);
    }
}
