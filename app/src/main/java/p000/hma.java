package p000;

import android.os.Bundle;
import androidx.mediarouter.media.C1336f;

/* JADX INFO: loaded from: classes3.dex */
public final class hma {

    /* JADX INFO: renamed from: c */
    public static final String f44114c = "selector";

    /* JADX INFO: renamed from: d */
    public static final String f44115d = "activeScan";

    /* JADX INFO: renamed from: a */
    public final Bundle f44116a;

    /* JADX INFO: renamed from: b */
    public C1336f f44117b;

    public hma(C1336f c1336f, boolean z) {
        if (c1336f == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        Bundle bundle = new Bundle();
        this.f44116a = bundle;
        this.f44117b = c1336f;
        bundle.putBundle("selector", c1336f.asBundle());
        bundle.putBoolean(f44115d, z);
    }

    private void ensureSelector() {
        if (this.f44117b == null) {
            C1336f c1336fFromBundle = C1336f.fromBundle(this.f44116a.getBundle("selector"));
            this.f44117b = c1336fFromBundle;
            if (c1336fFromBundle == null) {
                this.f44117b = C1336f.f10289d;
            }
        }
    }

    public static hma fromBundle(Bundle bundle) {
        if (bundle != null) {
            return new hma(bundle);
        }
        return null;
    }

    public Bundle asBundle() {
        return this.f44116a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof hma)) {
            return false;
        }
        hma hmaVar = (hma) obj;
        return getSelector().equals(hmaVar.getSelector()) && isActiveScan() == hmaVar.isActiveScan();
    }

    public C1336f getSelector() {
        ensureSelector();
        return this.f44117b;
    }

    public int hashCode() {
        return getSelector().hashCode() ^ isActiveScan();
    }

    public boolean isActiveScan() {
        return this.f44116a.getBoolean(f44115d);
    }

    public boolean isValid() {
        ensureSelector();
        return this.f44117b.isValid();
    }

    public String toString() {
        return "DiscoveryRequest{ selector=" + getSelector() + ", activeScan=" + isActiveScan() + ", isValid=" + isValid() + " }";
    }

    private hma(Bundle bundle) {
        this.f44116a = bundle;
    }
}
