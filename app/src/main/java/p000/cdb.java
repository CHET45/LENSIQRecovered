package p000;

import android.text.Spannable;
import android.text.SpannableString;

/* JADX INFO: loaded from: classes7.dex */
public class cdb extends Spannable.Factory {

    /* JADX INFO: renamed from: cdb$a */
    public static class C2279a {

        /* JADX INFO: renamed from: a */
        public static final cdb f16297a = new cdb();
    }

    @efb
    public static cdb getInstance() {
        return C2279a.f16297a;
    }

    @Override // android.text.Spannable.Factory
    public Spannable newSpannable(CharSequence charSequence) {
        return charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence);
    }
}
