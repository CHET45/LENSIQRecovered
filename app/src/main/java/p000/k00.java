package p000;

import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: loaded from: classes.dex */
@c5e(25)
public final class k00 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final k00 f52312a = new k00();

    private k00() {
    }

    @ih4
    public final boolean commitContent(@yfb InputConnection inputConnection, @yfb InputContentInfo inputContentInfo, int i, @gib Bundle bundle) {
        return inputConnection.commitContent(inputContentInfo, i, bundle);
    }
}
