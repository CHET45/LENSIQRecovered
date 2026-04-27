package p000;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class be8 extends IOException {
    private static final long serialVersionUID = -1616151763072450476L;

    /* JADX INFO: renamed from: a */
    public psa f13548a;

    /* JADX INFO: renamed from: b */
    public boolean f13549b;

    /* JADX INFO: renamed from: be8$a */
    public static class C1862a extends be8 {
        private static final long serialVersionUID = 3283890091615336259L;

        public C1862a(String description) {
            super(description);
        }
    }

    public be8(String description) {
        super(description);
        this.f13548a = null;
    }

    /* JADX INFO: renamed from: b */
    public static be8 m3075b() {
        return new be8("Protocol message end-group tag did not match expected tag.");
    }

    /* JADX INFO: renamed from: c */
    public static be8 m3076c() {
        return new be8("Protocol message contained an invalid tag (zero).");
    }

    /* JADX INFO: renamed from: d */
    public static be8 m3077d() {
        return new be8("Protocol message had invalid UTF-8.");
    }

    /* JADX INFO: renamed from: e */
    public static C1862a m3078e() {
        return new C1862a("Protocol message tag had invalid wire type.");
    }

    /* JADX INFO: renamed from: f */
    public static be8 m3079f() {
        return new be8("CodedInputStream encountered a malformed varint.");
    }

    /* JADX INFO: renamed from: g */
    public static be8 m3080g() {
        return new be8("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* JADX INFO: renamed from: h */
    public static be8 m3081h() {
        return new be8("Failed to parse the message.");
    }

    /* JADX INFO: renamed from: i */
    public static be8 m3082i() {
        return new be8("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
    }

    /* JADX INFO: renamed from: k */
    public static be8 m3083k() {
        return new be8("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    /* JADX INFO: renamed from: l */
    public static be8 m3084l() {
        return new be8("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* JADX INFO: renamed from: a */
    public boolean m3085a() {
        return this.f13549b;
    }

    public psa getUnfinishedMessage() {
        return this.f13548a;
    }

    /* JADX INFO: renamed from: j */
    public void m3086j() {
        this.f13549b = true;
    }

    public be8 setUnfinishedMessage(psa unfinishedMessage) {
        this.f13548a = unfinishedMessage;
        return this;
    }

    public IOException unwrapIOException() {
        return getCause() instanceof IOException ? (IOException) getCause() : this;
    }

    public be8(Exception e) {
        super(e.getMessage(), e);
        this.f13548a = null;
    }

    public be8(String description, Exception e) {
        super(description, e);
        this.f13548a = null;
    }

    public be8(IOException e) {
        super(e.getMessage(), e);
        this.f13548a = null;
    }

    public be8(String description, IOException e) {
        super(description, e);
        this.f13548a = null;
    }
}
