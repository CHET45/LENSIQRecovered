package p000;

import android.content.Context;
import android.view.View;
import p000.C6730h7;

/* JADX INFO: loaded from: classes5.dex */
public class p22 extends C5603f6 {

    /* JADX INFO: renamed from: a */
    public final C6730h7.a f69467a;

    public p22(Context context, int i) {
        this.f69467a = new C6730h7.a(16, context.getString(i));
    }

    @Override // p000.C5603f6
    public void onInitializeAccessibilityNodeInfo(View view, C6730h7 c6730h7) {
        super.onInitializeAccessibilityNodeInfo(view, c6730h7);
        c6730h7.addAction(this.f69467a);
    }
}
