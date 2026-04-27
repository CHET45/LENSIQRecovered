package p000;

import java.util.Deque;
import p000.ox7;

/* JADX INFO: loaded from: classes4.dex */
@gd7
public final class xih {

    /* JADX INFO: renamed from: a */
    public static final xj8 f98121a = xj8.m25235on("");

    @gdi
    /* JADX INFO: renamed from: a */
    public static ox7<String, sjd> m25225a(String encoded) {
        ox7.C10705d c10705dBuilder = ox7.builder();
        int length = encoded.length();
        int iDoParseTrieToBuilder = 0;
        while (iDoParseTrieToBuilder < length) {
            iDoParseTrieToBuilder += doParseTrieToBuilder(dod.newArrayDeque(), encoded, iDoParseTrieToBuilder, c10705dBuilder);
        }
        return c10705dBuilder.buildOrThrow();
    }

    /* JADX INFO: renamed from: b */
    public static ox7<String, sjd> m25226b(CharSequence... encodedChunks) {
        return m25225a(f98121a.join(encodedChunks));
    }

    private static int doParseTrieToBuilder(Deque<CharSequence> stack, CharSequence encoded, int start, ox7.C10705d<String, sjd> builder) {
        int length = encoded.length();
        char cCharAt = 0;
        int i = start;
        while (i < length && (cCharAt = encoded.charAt(i)) != '&' && cCharAt != '?' && cCharAt != '!' && cCharAt != ':' && cCharAt != ',') {
            i++;
        }
        stack.push(reverse(encoded.subSequence(start, i)));
        if (cCharAt == '!' || cCharAt == '?' || cCharAt == ':' || cCharAt == ',') {
            String strJoin = f98121a.join(stack);
            if (strJoin.length() > 0) {
                builder.put(strJoin, sjd.m22059a(cCharAt));
            }
        }
        int iDoParseTrieToBuilder = i + 1;
        if (cCharAt != '?' && cCharAt != ',') {
            while (iDoParseTrieToBuilder < length) {
                iDoParseTrieToBuilder += doParseTrieToBuilder(stack, encoded, iDoParseTrieToBuilder, builder);
                if (encoded.charAt(iDoParseTrieToBuilder) == '?' || encoded.charAt(iDoParseTrieToBuilder) == ',') {
                    iDoParseTrieToBuilder++;
                    break;
                }
            }
        }
        stack.pop();
        return iDoParseTrieToBuilder - start;
    }

    private static CharSequence reverse(CharSequence s) {
        return new StringBuilder(s).reverse();
    }
}
