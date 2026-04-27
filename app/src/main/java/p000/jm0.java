package p000;

import android.view.autofill.AutofillId;

/* JADX INFO: loaded from: classes3.dex */
public class jm0 {

    /* JADX INFO: renamed from: a */
    public final Object f51131a;

    @c5e(26)
    private jm0(@efb AutofillId autofillId) {
        this.f51131a = autofillId;
    }

    @c5e(26)
    @efb
    public static jm0 toAutofillIdCompat(@efb AutofillId autofillId) {
        return new jm0(autofillId);
    }

    @c5e(26)
    @efb
    public AutofillId toAutofillId() {
        return (AutofillId) this.f51131a;
    }
}
