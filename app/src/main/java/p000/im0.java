package p000;

import android.view.View;
import android.view.autofill.AutofillManager;

/* JADX INFO: loaded from: classes.dex */
@c5e(26)
@e0g(parameters = 1)
public final class im0 extends AutofillManager.AutofillCallback {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final im0 f47381a = new im0();

    /* JADX INFO: renamed from: b */
    public static final int f47382b = 0;

    private im0() {
    }

    @Override // android.view.autofill.AutofillManager.AutofillCallback
    public void onAutofillEvent(@yfb View view, int i, int i2) {
        super.onAutofillEvent(view, i, i2);
    }

    @ug5
    @ih4
    public final void register(@yfb C13118to c13118to) {
        c13118to.getAutofillManager().registerCallback(this);
    }

    @ug5
    @ih4
    public final void unregister(@yfb C13118to c13118to) {
        c13118to.getAutofillManager().unregisterCallback(this);
    }
}
