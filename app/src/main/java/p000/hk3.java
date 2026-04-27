package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class hk3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String repr(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append('\"');
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '\"') {
                sb.append("\\\"");
            } else if (cCharAt == '\\') {
                sb.append("\\\\");
            } else if (cCharAt == '\b') {
                sb.append("\\b");
            } else if (cCharAt == '\n') {
                sb.append("\\n");
            } else if (cCharAt == '\r') {
                sb.append("\\r");
            } else if (cCharAt == '\t') {
                sb.append("\\t");
            } else {
                sb.append(cCharAt);
            }
        }
        sb.append('\"');
        String string = sb.toString();
        md8.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
