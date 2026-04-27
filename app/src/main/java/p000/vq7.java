package p000;

import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class vq7 extends rif {

    /* JADX INFO: renamed from: c */
    public static final Pattern f91975c = Pattern.compile("(.+?)='(.*?)';", 32);

    /* JADX INFO: renamed from: d */
    public static final String f91976d = "streamtitle";

    /* JADX INFO: renamed from: e */
    public static final String f91977e = "streamurl";

    /* JADX INFO: renamed from: a */
    public final CharsetDecoder f91978a = StandardCharsets.UTF_8.newDecoder();

    /* JADX INFO: renamed from: b */
    public final CharsetDecoder f91979b = StandardCharsets.ISO_8859_1.newDecoder();

    @hib
    private String decodeToString(ByteBuffer byteBuffer) {
        try {
            return this.f91978a.decode(byteBuffer).toString();
        } catch (CharacterCodingException unused) {
            try {
                String string = this.f91979b.decode(byteBuffer).toString();
                this.f91979b.reset();
                byteBuffer.rewind();
                return string;
            } catch (CharacterCodingException unused2) {
                this.f91979b.reset();
                byteBuffer.rewind();
                return null;
            } catch (Throwable th) {
                this.f91979b.reset();
                byteBuffer.rewind();
                throw th;
            }
        } finally {
            this.f91978a.reset();
            byteBuffer.rewind();
        }
    }

    @Override // p000.rif
    /* JADX INFO: renamed from: a */
    public eta mo2551a(aua auaVar, ByteBuffer byteBuffer) {
        String strDecodeToString = decodeToString(byteBuffer);
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        String str = null;
        if (strDecodeToString == null) {
            return new eta(new xq7(bArr, null, null));
        }
        Matcher matcher = f91975c.matcher(strDecodeToString);
        String str2 = null;
        for (int iEnd = 0; matcher.find(iEnd); iEnd = matcher.end()) {
            String strGroup = matcher.group(1);
            String strGroup2 = matcher.group(2);
            if (strGroup != null) {
                String lowerCase = i80.toLowerCase(strGroup);
                lowerCase.hashCode();
                if (lowerCase.equals("streamurl")) {
                    str2 = strGroup2;
                } else if (lowerCase.equals("streamtitle")) {
                    str = strGroup2;
                }
            }
        }
        return new eta(new xq7(bArr, str, str2));
    }
}
