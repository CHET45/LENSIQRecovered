package p000;

import android.media.metrics.LogSessionId;
import android.os.Build;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class j0d {

    /* JADX INFO: renamed from: d */
    public static final j0d f49299d = new j0d("");

    /* JADX INFO: renamed from: a */
    public final String f49300a;

    /* JADX INFO: renamed from: b */
    @hib
    public final C7713a f49301b;

    /* JADX INFO: renamed from: c */
    @hib
    public final Object f49302c;

    /* JADX INFO: renamed from: j0d$a */
    @c5e(31)
    public static final class C7713a {

        /* JADX INFO: renamed from: a */
        public LogSessionId f49303a = LogSessionId.LOG_SESSION_ID_NONE;

        public void setLogSessionId(LogSessionId logSessionId) {
            v80.checkState(this.f49303a.equals(LogSessionId.LOG_SESSION_ID_NONE));
            this.f49303a = logSessionId;
        }
    }

    public j0d(String str) {
        this.f49300a = str;
        this.f49301b = Build.VERSION.SDK_INT >= 31 ? new C7713a() : null;
        this.f49302c = new Object();
    }

    public boolean equals(@hib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0d)) {
            return false;
        }
        j0d j0dVar = (j0d) obj;
        return Objects.equals(this.f49300a, j0dVar.f49300a) && Objects.equals(this.f49301b, j0dVar.f49301b) && Objects.equals(this.f49302c, j0dVar.f49302c);
    }

    @c5e(31)
    public synchronized LogSessionId getLogSessionId() {
        return ((C7713a) v80.checkNotNull(this.f49301b)).f49303a;
    }

    public int hashCode() {
        return Objects.hash(this.f49300a, this.f49301b, this.f49302c);
    }

    @c5e(31)
    public synchronized void setLogSessionId(LogSessionId logSessionId) {
        ((C7713a) v80.checkNotNull(this.f49301b)).setLogSessionId(logSessionId);
    }
}
