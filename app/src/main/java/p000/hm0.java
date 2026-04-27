package p000;

import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;

/* JADX INFO: loaded from: classes.dex */
@c5e(26)
@e0g(parameters = 1)
public final class hm0 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final hm0 f44100a = new hm0();

    /* JADX INFO: renamed from: b */
    public static final int f44101b = 0;

    private hm0() {
    }

    @c5e(26)
    @gib
    @ih4
    public final AutofillId getAutofillId(@yfb ViewStructure viewStructure) {
        return viewStructure.getAutofillId();
    }

    @c5e(26)
    @ih4
    public final boolean isDate(@yfb AutofillValue autofillValue) {
        return autofillValue.isDate();
    }

    @c5e(26)
    @ih4
    public final boolean isList(@yfb AutofillValue autofillValue) {
        return autofillValue.isList();
    }

    @c5e(26)
    @ih4
    public final boolean isText(@yfb AutofillValue autofillValue) {
        return autofillValue.isText();
    }

    @c5e(26)
    @ih4
    public final boolean isToggle(@yfb AutofillValue autofillValue) {
        return autofillValue.isToggle();
    }

    @c5e(26)
    @ih4
    public final void setAutofillHints(@yfb ViewStructure viewStructure, @yfb String[] strArr) {
        viewStructure.setAutofillHints(strArr);
    }

    @c5e(26)
    @ih4
    public final void setAutofillId(@yfb ViewStructure viewStructure, @yfb AutofillId autofillId, int i) {
        viewStructure.setAutofillId(autofillId, i);
    }

    @c5e(26)
    @ih4
    public final void setAutofillType(@yfb ViewStructure viewStructure, int i) {
        viewStructure.setAutofillType(i);
    }

    @c5e(26)
    @yfb
    @ih4
    public final CharSequence textValue(@yfb AutofillValue autofillValue) {
        return autofillValue.getTextValue();
    }
}
