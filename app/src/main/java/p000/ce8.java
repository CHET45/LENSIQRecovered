package p000;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public class ce8 extends IOException {
    private static final long serialVersionUID = -1616151763072450476L;

    /* JADX INFO: renamed from: a */
    public qsa f16378a;

    /* JADX INFO: renamed from: b */
    public boolean f16379b;

    /* JADX INFO: renamed from: ce8$a */
    public static class C2294a extends ce8 {
        private static final long serialVersionUID = 3283890091615336259L;

        public C2294a(String description) {
            super(description);
        }
    }

    public ce8(String description) {
        super(description);
        this.f16378a = null;
    }

    /* JADX INFO: renamed from: b */
    public static ce8 m3919b() {
        return new ce8("Protocol message end-group tag did not match expected tag.");
    }

    /* JADX INFO: renamed from: c */
    public static ce8 m3920c() {
        return new ce8("Protocol message contained an invalid tag (zero).");
    }

    /* JADX INFO: renamed from: d */
    public static ce8 m3921d() {
        return new ce8("Protocol message had invalid UTF-8.");
    }

    /* JADX INFO: renamed from: e */
    public static C2294a m3922e() {
        return new C2294a("Protocol message tag had invalid wire type.");
    }

    /* JADX INFO: renamed from: f */
    public static ce8 m3923f() {
        return new ce8("CodedInputStream encountered a malformed varint.");
    }

    /* JADX INFO: renamed from: g */
    public static ce8 m3924g() {
        return new ce8("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* JADX INFO: renamed from: h */
    public static ce8 m3925h() {
        return new ce8("Failed to parse the message.");
    }

    /* JADX INFO: renamed from: i */
    public static ce8 m3926i() {
        return new ce8("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
    }

    /* JADX INFO: renamed from: k */
    public static ce8 m3927k() {
        return new ce8("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    /* JADX INFO: renamed from: l */
    public static ce8 m3928l() {
        return new ce8("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* JADX INFO: renamed from: a */
    public boolean m3929a() {
        return this.f16379b;
    }

    public qsa getUnfinishedMessage() {
        return this.f16378a;
    }

    /* JADX INFO: renamed from: j */
    public void m3930j() {
        this.f16379b = true;
    }

    public ce8 setUnfinishedMessage(qsa unfinishedMessage) {
        this.f16378a = unfinishedMessage;
        return this;
    }

    public IOException unwrapIOException() {
        return getCause() instanceof IOException ? (IOException) getCause() : this;
    }

    public ce8(Exception e) {
        super(e.getMessage(), e);
        this.f16378a = null;
    }

    public ce8(String description, Exception e) {
        super(description, e);
        this.f16378a = null;
    }

    public ce8(IOException e) {
        super(e.getMessage(), e);
        this.f16378a = null;
    }

    public ce8(String description, IOException e) {
        super(description, e);
        this.f16378a = null;
    }
}
