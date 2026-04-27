package p000;

import java.io.IOException;
import java.net.SocketException;

/* JADX INFO: loaded from: classes6.dex */
public class wk4 {

    /* JADX INFO: renamed from: a */
    public String f94481a;

    /* JADX INFO: renamed from: b */
    public final z2b f94482b;

    /* JADX INFO: renamed from: c */
    public volatile boolean f94483c;

    /* JADX INFO: renamed from: d */
    public volatile boolean f94484d;

    /* JADX INFO: renamed from: e */
    public volatile boolean f94485e;

    /* JADX INFO: renamed from: f */
    public volatile boolean f94486f;

    /* JADX INFO: renamed from: g */
    public volatile boolean f94487g;

    /* JADX INFO: renamed from: h */
    public volatile boolean f94488h;

    /* JADX INFO: renamed from: i */
    public volatile IOException f94489i;

    /* JADX INFO: renamed from: wk4$a */
    public static class C14656a extends wk4 {
        public C14656a(IOException iOException) {
            super(null);
            setUnknownError(iOException);
        }
    }

    public wk4(@efb z2b z2bVar) {
        this.f94482b = z2bVar;
    }

    @efb
    /* JADX INFO: renamed from: a */
    public z2b m24622a() {
        z2b z2bVar = this.f94482b;
        if (z2bVar != null) {
            return z2bVar;
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: renamed from: b */
    public IOException m24623b() {
        return this.f94489i;
    }

    /* JADX INFO: renamed from: c */
    public String m24624c() {
        return this.f94481a;
    }

    public void catchException(IOException iOException) {
        if (isUserCanceled()) {
            return;
        }
        if (iOException instanceof d8e) {
            setPreconditionFailed(iOException);
            return;
        }
        if (iOException instanceof d3f) {
            setServerCanceled(iOException);
            return;
        }
        if (iOException == ls5.f58606a) {
            setFileBusyAfterRun();
            return;
        }
        if (iOException instanceof a6d) {
            setPreAllocateFailed(iOException);
            return;
        }
        if (iOException != nc8.f63949a) {
            setUnknownError(iOException);
            if (iOException instanceof SocketException) {
                return;
            }
            q0i.m19913d("DownloadCache", "catch unknown error " + iOException);
        }
    }

    /* JADX INFO: renamed from: d */
    public c8e m24625d() {
        return ((d8e) this.f94489i).getResumeFailedCause();
    }

    /* JADX INFO: renamed from: e */
    public boolean m24626e() {
        return this.f94487g;
    }

    /* JADX INFO: renamed from: f */
    public boolean m24627f() {
        return this.f94483c;
    }

    /* JADX INFO: renamed from: g */
    public boolean m24628g() {
        return this.f94485e;
    }

    /* JADX INFO: renamed from: h */
    public boolean m24629h() {
        return this.f94486f;
    }

    /* JADX INFO: renamed from: i */
    public void m24630i(String str) {
        this.f94481a = str;
    }

    public boolean isInterrupt() {
        return this.f94483c || this.f94484d || this.f94485e || this.f94486f || this.f94487g || this.f94488h;
    }

    public boolean isPreAllocateFailed() {
        return this.f94488h;
    }

    public boolean isUserCanceled() {
        return this.f94484d;
    }

    /* JADX INFO: renamed from: j */
    public void m24631j() {
        this.f94484d = true;
    }

    public void setFileBusyAfterRun() {
        this.f94487g = true;
    }

    public void setPreAllocateFailed(IOException iOException) {
        this.f94488h = true;
        this.f94489i = iOException;
    }

    public void setPreconditionFailed(IOException iOException) {
        this.f94483c = true;
        this.f94489i = iOException;
    }

    public void setServerCanceled(IOException iOException) {
        this.f94485e = true;
        this.f94489i = iOException;
    }

    public void setUnknownError(IOException iOException) {
        this.f94486f = true;
        this.f94489i = iOException;
    }

    private wk4() {
        this.f94482b = null;
    }
}
