package p000;

import android.view.autofill.AutofillId;
import p000.p7e;

/* JADX INFO: loaded from: classes.dex */
@p7e({p7e.EnumC10826a.f69934a})
public class km0 {

    /* JADX INFO: renamed from: a */
    public final Object f54673a;

    @c5e(26)
    private km0(@efb AutofillId autofillId) {
        this.f54673a = autofillId;
    }

    @c5e(26)
    @efb
    public static km0 toAutofillIdCompat(@efb AutofillId autofillId) {
        return new km0(autofillId);
    }

    @c5e(26)
    @efb
    public AutofillId toAutofillId() {
        return (AutofillId) this.f54673a;
    }
}
