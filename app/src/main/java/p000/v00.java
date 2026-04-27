package p000;

import android.view.View;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* JADX INFO: loaded from: classes.dex */
@c5e(33)
public final class v00 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final v00 f89604a = new v00();

    private v00() {
    }

    @do8
    @yfb
    @ih4
    public static final OnBackInvokedCallback createBackCallback(@gib final ny6<bth> ny6Var) {
        return new OnBackInvokedCallback() { // from class: u00
            public final void onBackInvoked() {
                v00.createBackCallback$lambda$0(ny6Var);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createBackCallback$lambda$0(ny6 ny6Var) {
        if (ny6Var != null) {
            ny6Var.invoke();
        }
    }

    @do8
    @ih4
    public static final void maybeRegisterBackCallback(@yfb View view, @gib Object obj) {
        OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
        if (!(obj instanceof OnBackInvokedCallback) || (onBackInvokedDispatcherFindOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) == null) {
            return;
        }
        onBackInvokedDispatcherFindOnBackInvokedDispatcher.registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj);
    }

    @do8
    @ih4
    public static final void maybeUnregisterBackCallback(@yfb View view, @gib Object obj) {
        OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
        if (!(obj instanceof OnBackInvokedCallback) || (onBackInvokedDispatcherFindOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) == null) {
            return;
        }
        onBackInvokedDispatcherFindOnBackInvokedDispatcher.unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj);
    }
}
