package p000;

import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: loaded from: classes.dex */
@c5e(25)
public class lib extends kib {
    public lib(@yfb InputConnection inputConnection, @yfb qy6<? super iib, bth> qy6Var) {
        super(inputConnection, qy6Var);
    }

    @Override // p000.jib, android.view.inputmethod.InputConnection
    public final boolean commitContent(@yfb InputContentInfo inputContentInfo, int i, @gib Bundle bundle) {
        InputConnection inputConnectionM14114b = m14114b();
        if (inputConnectionM14114b != null) {
            return inputConnectionM14114b.commitContent(inputContentInfo, i, bundle);
        }
        return false;
    }
}
