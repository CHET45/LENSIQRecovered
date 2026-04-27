package p000;

import java.io.PrintWriter;
import java.io.Serializable;
import java.io.StringWriter;

/* JADX INFO: loaded from: classes8.dex */
public class fp5 implements Serializable {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a */
    public final j74 f37353a;

    /* JADX INFO: renamed from: b */
    public final Throwable f37354b;

    public fp5(j74 j74Var, Throwable th) {
        this.f37354b = th;
        this.f37353a = j74Var;
    }

    public j74 getDescription() {
        return this.f37353a;
    }

    public Throwable getException() {
        return this.f37354b;
    }

    public String getMessage() {
        return getException().getMessage();
    }

    public String getTestHeader() {
        return this.f37353a.getDisplayName();
    }

    public String getTrace() {
        StringWriter stringWriter = new StringWriter();
        getException().printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public String toString() {
        return getTestHeader() + ": " + this.f37354b.getMessage();
    }
}
