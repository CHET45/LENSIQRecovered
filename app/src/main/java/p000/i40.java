package p000;

import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public abstract class i40 {
    private i40() {
    }

    /* JADX INFO: renamed from: a */
    public static void m12766a(@efb Appendable appendable, char c) {
        try {
            appendable.append(c);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m12767b(@efb Appendable appendable, @efb CharSequence charSequence) {
        try {
            appendable.append(charSequence);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m12768c(@efb Appendable appendable, @efb CharSequence charSequence, int i, int i2) {
        try {
            appendable.append(charSequence, i, i2);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
