package p000;

import java.io.PrintWriter;
import java.io.StringWriter;

/* JADX INFO: loaded from: classes7.dex */
public class wog {

    /* JADX INFO: renamed from: a */
    public pog f94995a;

    /* JADX INFO: renamed from: b */
    public Throwable f94996b;

    public wog(pog pogVar, Throwable th) {
        this.f94995a = pogVar;
        this.f94996b = th;
    }

    public String exceptionMessage() {
        return thrownException().getMessage();
    }

    public pog failedTest() {
        return this.f94995a;
    }

    public boolean isFailure() {
        return thrownException() instanceof t80;
    }

    public Throwable thrownException() {
        return this.f94996b;
    }

    public String toString() {
        return this.f94995a + ": " + this.f94996b.getMessage();
    }

    public String trace() {
        StringWriter stringWriter = new StringWriter();
        thrownException().printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }
}
