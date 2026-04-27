package p000;

import okhttp3.internal.http2.Header;
import okio.ByteString;

/* JADX INFO: loaded from: classes7.dex */
public final class ei7 {

    /* JADX INFO: renamed from: d */
    public static final ByteString f33067d = ByteString.encodeUtf8(Header.RESPONSE_STATUS_UTF8);

    /* JADX INFO: renamed from: e */
    public static final ByteString f33068e = ByteString.encodeUtf8(Header.TARGET_METHOD_UTF8);

    /* JADX INFO: renamed from: f */
    public static final ByteString f33069f = ByteString.encodeUtf8(Header.TARGET_PATH_UTF8);

    /* JADX INFO: renamed from: g */
    public static final ByteString f33070g = ByteString.encodeUtf8(Header.TARGET_SCHEME_UTF8);

    /* JADX INFO: renamed from: h */
    public static final ByteString f33071h = ByteString.encodeUtf8(Header.TARGET_AUTHORITY_UTF8);

    /* JADX INFO: renamed from: i */
    public static final ByteString f33072i = ByteString.encodeUtf8(":host");

    /* JADX INFO: renamed from: j */
    public static final ByteString f33073j = ByteString.encodeUtf8(":version");

    /* JADX INFO: renamed from: a */
    public final ByteString f33074a;

    /* JADX INFO: renamed from: b */
    public final ByteString f33075b;

    /* JADX INFO: renamed from: c */
    public final int f33076c;

    public ei7(String str, String str2) {
        this(ByteString.encodeUtf8(str), ByteString.encodeUtf8(str2));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ei7)) {
            return false;
        }
        ei7 ei7Var = (ei7) obj;
        return this.f33074a.equals(ei7Var.f33074a) && this.f33075b.equals(ei7Var.f33075b);
    }

    public int hashCode() {
        return ((527 + this.f33074a.hashCode()) * 31) + this.f33075b.hashCode();
    }

    public String toString() {
        return String.format("%s: %s", this.f33074a.utf8(), this.f33075b.utf8());
    }

    public ei7(ByteString byteString, String str) {
        this(byteString, ByteString.encodeUtf8(str));
    }

    public ei7(ByteString byteString, ByteString byteString2) {
        this.f33074a = byteString;
        this.f33075b = byteString2;
        this.f33076c = byteString.size() + 32 + byteString2.size();
    }
}
