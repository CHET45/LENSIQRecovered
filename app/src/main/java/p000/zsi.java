package p000;

import p000.m55;

/* JADX INFO: loaded from: classes5.dex */
@rx4
@gd7
public class zsi {

    /* JADX INFO: renamed from: a */
    public static final char f106018a = 0;

    /* JADX INFO: renamed from: b */
    public static final char f106019b = 31;

    /* JADX INFO: renamed from: c */
    public static final l55 f106020c;

    /* JADX INFO: renamed from: d */
    public static final l55 f106021d;

    /* JADX INFO: renamed from: e */
    public static final l55 f106022e;

    static {
        m55.C9145c c9145cBuilder = m55.builder();
        c9145cBuilder.setSafeRange((char) 0, (char) 65533);
        c9145cBuilder.setUnsafeReplacement(a38.f268b);
        for (char c = 0; c <= 31; c = (char) (c + 1)) {
            if (c != '\t' && c != '\n' && c != '\r') {
                c9145cBuilder.addEscape(c, a38.f268b);
            }
        }
        c9145cBuilder.addEscape('&', "&amp;");
        c9145cBuilder.addEscape('<', "&lt;");
        c9145cBuilder.addEscape('>', "&gt;");
        f106021d = c9145cBuilder.build();
        c9145cBuilder.addEscape('\'', "&apos;");
        c9145cBuilder.addEscape('\"', "&quot;");
        f106020c = c9145cBuilder.build();
        c9145cBuilder.addEscape('\t', "&#x9;");
        c9145cBuilder.addEscape('\n', "&#xA;");
        c9145cBuilder.addEscape('\r', "&#xD;");
        f106022e = c9145cBuilder.build();
    }

    private zsi() {
    }

    public static l55 xmlAttributeEscaper() {
        return f106022e;
    }

    public static l55 xmlContentEscaper() {
        return f106021d;
    }
}
