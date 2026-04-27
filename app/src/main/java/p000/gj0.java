package p000;

import android.content.Context;
import android.util.AttributeSet;
import androidx.transition.C1444c;
import androidx.transition.C1450i;
import androidx.transition.C1462v;

/* JADX INFO: loaded from: classes3.dex */
public class gj0 extends C1462v {
    public gj0() {
        init();
    }

    private void init() {
        setOrdering(1);
        addTransition(new C1450i(2)).addTransition(new C1444c()).addTransition(new C1450i(1));
    }

    public gj0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }
}
