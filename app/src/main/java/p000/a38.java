package p000;

import p000.C9041lz;

/* JADX INFO: loaded from: classes.dex */
public final class a38 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final String f267a = "androidx.compose.foundation.text.inlineContent";

    /* JADX INFO: renamed from: b */
    @yfb
    public static final String f268b = "�";

    public static final void appendInlineContent(@yfb C9041lz.a aVar, @yfb String str, @yfb String str2) {
        if (str2.length() <= 0) {
            throw new IllegalArgumentException("alternateText can't be an empty string.");
        }
        aVar.pushStringAnnotation(f267a, str);
        aVar.append(str2);
        aVar.pop();
    }

    public static /* synthetic */ void appendInlineContent$default(C9041lz.a aVar, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = f268b;
        }
        appendInlineContent(aVar, str, str2);
    }
}
