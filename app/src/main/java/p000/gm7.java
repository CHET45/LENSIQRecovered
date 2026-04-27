package p000;

/* JADX INFO: loaded from: classes5.dex */
@yx4
@gd7
public final class gm7 {

    /* JADX INFO: renamed from: a */
    public static final l55 f40187a = m55.builder().addEscape('\"', "&quot;").addEscape('\'', "&#39;").addEscape('&', "&amp;").addEscape('<', "&lt;").addEscape('>', "&gt;").build();

    private gm7() {
    }

    public static l55 htmlEscaper() {
        return f40187a;
    }
}
