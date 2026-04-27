package p000;

import android.os.Handler;
import android.view.inputmethod.InputConnection;

/* JADX INFO: loaded from: classes.dex */
@c5e(24)
public class kib extends jib {
    public kib(@yfb InputConnection inputConnection, @yfb qy6<? super iib, bth> qy6Var) {
        super(inputConnection, qy6Var);
    }

    @Override // p000.jib
    /* JADX INFO: renamed from: a */
    public final void mo14113a(@yfb InputConnection inputConnection) {
        inputConnection.closeConnection();
    }

    @Override // p000.jib, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        InputConnection inputConnectionM14114b = m14114b();
        if (inputConnectionM14114b != null) {
            return inputConnectionM14114b.deleteSurroundingTextInCodePoints(i, i2);
        }
        return false;
    }

    @Override // p000.jib, android.view.inputmethod.InputConnection
    @gib
    public final Handler getHandler() {
        InputConnection inputConnectionM14114b = m14114b();
        if (inputConnectionM14114b != null) {
            return inputConnectionM14114b.getHandler();
        }
        return null;
    }
}
