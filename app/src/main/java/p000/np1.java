package p000;

import androidx.compose.p002ui.focus.InterfaceC0720i;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nNodeKind.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NodeKind.kt\nandroidx/compose/ui/node/CanFocusChecker\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n*L\n1#1,357:1\n66#2,9:358\n*S KotlinDebug\n*F\n+ 1 NodeKind.kt\nandroidx/compose/ui/node/CanFocusChecker\n*L\n340#1:358,9\n*E\n"})
public final class np1 implements InterfaceC0720i {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final np1 f65148a = new np1();

    /* JADX INFO: renamed from: b */
    @gib
    public static Boolean f65149b;

    private np1() {
    }

    @Override // androidx.compose.p002ui.focus.InterfaceC0720i
    public boolean getCanFocus() {
        Boolean bool = f65149b;
        if (bool != null) {
            return bool.booleanValue();
        }
        g28.throwIllegalStateExceptionForNullCheck("canFocus is read before it is written");
        throw new us8();
    }

    public final boolean isCanFocusSet() {
        return f65149b != null;
    }

    public final void reset() {
        f65149b = null;
    }

    @Override // androidx.compose.p002ui.focus.InterfaceC0720i
    public void setCanFocus(boolean z) {
        f65149b = Boolean.valueOf(z);
    }
}
