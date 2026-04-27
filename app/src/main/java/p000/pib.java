package p000;

import android.os.Build;
import android.view.inputmethod.InputConnection;

/* JADX INFO: loaded from: classes.dex */
public final class pib {
    @yfb
    public static final iib NullableInputConnectionWrapper(@yfb InputConnection inputConnection, @yfb qy6<? super iib, bth> qy6Var) {
        return Build.VERSION.SDK_INT >= 34 ? new oib(inputConnection, qy6Var) : new lib(inputConnection, qy6Var);
    }
}
