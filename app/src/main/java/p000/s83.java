package p000;

import java.io.UnsupportedEncodingException;
import okio.ByteString;
import org.apache.commons.compress.utils.CharsetNames;

/* JADX INFO: loaded from: classes7.dex */
public final class s83 {
    private s83() {
    }

    public static String basic(String str, String str2) {
        try {
            return "Basic " + ByteString.m18742of((str + g1i.f38277c + str2).getBytes(CharsetNames.ISO_8859_1)).base64();
        } catch (UnsupportedEncodingException unused) {
            throw new AssertionError();
        }
    }
}
