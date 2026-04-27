package p000;

import im.zego.zegoexpress.ZegoExpressErrorCode;
import java.io.File;

/* JADX INFO: loaded from: classes5.dex */
public final class oj0 extends q43 {

    /* JADX INFO: renamed from: a */
    public final z33 f67784a;

    /* JADX INFO: renamed from: b */
    public final String f67785b;

    /* JADX INFO: renamed from: c */
    public final File f67786c;

    public oj0(z33 z33Var, String str, File file) {
        if (z33Var == null) {
            throw new NullPointerException("Null report");
        }
        this.f67784a = z33Var;
        if (str == null) {
            throw new NullPointerException("Null sessionId");
        }
        this.f67785b = str;
        if (file == null) {
            throw new NullPointerException("Null reportFile");
        }
        this.f67786c = file;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q43)) {
            return false;
        }
        q43 q43Var = (q43) obj;
        return this.f67784a.equals(q43Var.getReport()) && this.f67785b.equals(q43Var.getSessionId()) && this.f67786c.equals(q43Var.getReportFile());
    }

    @Override // p000.q43
    public z33 getReport() {
        return this.f67784a;
    }

    @Override // p000.q43
    public File getReportFile() {
        return this.f67786c;
    }

    @Override // p000.q43
    public String getSessionId() {
        return this.f67785b;
    }

    public int hashCode() {
        return ((((this.f67784a.hashCode() ^ ZegoExpressErrorCode.CommonEngineNotStarted) * ZegoExpressErrorCode.CommonEngineNotStarted) ^ this.f67785b.hashCode()) * ZegoExpressErrorCode.CommonEngineNotStarted) ^ this.f67786c.hashCode();
    }

    public String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f67784a + ", sessionId=" + this.f67785b + ", reportFile=" + this.f67786c + "}";
    }
}
