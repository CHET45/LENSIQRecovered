package p000;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class uo7 {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m23491a(String str) {
        int length = str.length();
        while (length > 0) {
            int iCodePointBefore = Character.codePointBefore(str, length);
            if (!Character.isWhitespace(iCodePointBefore)) {
                break;
            }
            length -= Character.charCount(iCodePointBefore);
        }
        return str.substring(0, length);
    }
}
