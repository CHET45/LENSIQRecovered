package p000;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.icy.IcyInfo;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class uq7 extends qif {

    /* JADX INFO: renamed from: c */
    public static final Pattern f88765c = Pattern.compile("(.+?)='(.*?)';", 32);

    /* JADX INFO: renamed from: d */
    public static final String f88766d = "streamtitle";

    /* JADX INFO: renamed from: e */
    public static final String f88767e = "streamurl";

    /* JADX INFO: renamed from: a */
    public final CharsetDecoder f88768a = yw1.f103176c.newDecoder();

    /* JADX INFO: renamed from: b */
    public final CharsetDecoder f88769b = yw1.f103175b.newDecoder();

    @hib
    private String decodeToString(ByteBuffer byteBuffer) {
        try {
            return this.f88768a.decode(byteBuffer).toString();
        } catch (CharacterCodingException unused) {
            try {
                String string = this.f88769b.decode(byteBuffer).toString();
                this.f88769b.reset();
                byteBuffer.rewind();
                return string;
            } catch (CharacterCodingException unused2) {
                this.f88769b.reset();
                byteBuffer.rewind();
                return null;
            } catch (Throwable th) {
                this.f88769b.reset();
                byteBuffer.rewind();
                throw th;
            }
        } finally {
            this.f88768a.reset();
            byteBuffer.rewind();
        }
    }

    @Override // p000.qif
    /* JADX INFO: renamed from: a */
    public Metadata mo3372a(zta ztaVar, ByteBuffer byteBuffer) {
        String strDecodeToString = decodeToString(byteBuffer);
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        String str = null;
        if (strDecodeToString == null) {
            return new Metadata(new IcyInfo(bArr, null, null));
        }
        Matcher matcher = f88765c.matcher(strDecodeToString);
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
        return new Metadata(new IcyInfo(bArr, str, str2));
    }
}
