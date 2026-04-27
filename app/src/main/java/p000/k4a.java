package p000;

import android.text.InputFilter;
import android.text.Spanned;

/* JADX INFO: loaded from: classes5.dex */
public class k4a implements InputFilter {

    /* JADX INFO: renamed from: a */
    public int f52579a;

    public k4a(int i) {
        this.f52579a = i;
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        try {
            StringBuilder sb = new StringBuilder(spanned);
            sb.replace(i3, i4, charSequence.subSequence(i, i2).toString());
            if (Integer.parseInt(sb.toString()) <= this.f52579a) {
                return null;
            }
            return "";
        } catch (NumberFormatException unused) {
            return "";
        }
    }

    public int getMax() {
        return this.f52579a;
    }

    public void setMax(int i) {
        this.f52579a = i;
    }
}
