package com.draggable.library.extension.glide;

import java.nio.charset.Charset;
import java.security.MessageDigest;
import p000.a43;
import p000.k95;
import p000.li3;
import p000.md8;
import p000.mlh;
import p000.xw1;
import p000.yfb;

/* JADX INFO: loaded from: classes4.dex */
public final class MD5Utils {
    public static final MD5Utils INSTANCE = new MD5Utils();
    private static final String[] hexDigIts = {a43.f347l, "1", k95.f53083Y4, k95.f53092Z4, "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f"};

    private MD5Utils() {
    }

    @yfb
    public final String byteArrayToHexString(@yfb byte[] bArr) {
        md8.checkParameterIsNotNull(bArr, "b");
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            sb.append(byteToHexString(b));
        }
        String string = sb.toString();
        md8.checkExpressionValueIsNotNull(string, "resultSb.toString()");
        return string;
    }

    @yfb
    public final String byteToHexString(byte b) {
        int i = b;
        if (b < 0) {
            i = b + 256;
        }
        StringBuilder sb = new StringBuilder();
        String[] strArr = hexDigIts;
        sb.append(strArr[i / 16]);
        sb.append(strArr[i % 16]);
        return sb.toString();
    }

    @yfb
    public final String md5Encode(@yfb String str) {
        md8.checkParameterIsNotNull(str, "origin");
        return md5Encode(str, li3.f57665c);
    }

    private final String md5Encode(String str, String str2) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            if (str2 == null || md8.areEqual("", str2)) {
                Charset charset = xw1.f99524b;
                if (str == null) {
                    throw new mlh("null cannot be cast to non-null type java.lang.String");
                }
                byte[] bytes = str.getBytes(charset);
                md8.checkExpressionValueIsNotNull(bytes, "(this as java.lang.String).getBytes(charset)");
                byte[] bArrDigest = messageDigest.digest(bytes);
                md8.checkExpressionValueIsNotNull(bArrDigest, "md.digest(resultString.toByteArray())");
                str = byteArrayToHexString(bArrDigest);
            } else {
                Charset charsetForName = Charset.forName(str2);
                md8.checkExpressionValueIsNotNull(charsetForName, "Charset.forName(charsetName)");
                if (str == null) {
                    throw new mlh("null cannot be cast to non-null type java.lang.String");
                }
                byte[] bytes2 = str.getBytes(charsetForName);
                md8.checkExpressionValueIsNotNull(bytes2, "(this as java.lang.String).getBytes(charset)");
                byte[] bArrDigest2 = messageDigest.digest(bytes2);
                md8.checkExpressionValueIsNotNull(bArrDigest2, "md.digest(resultString.t…ay(charset(charsetName)))");
                str = byteArrayToHexString(bArrDigest2);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return str != null ? str : "";
    }
}
