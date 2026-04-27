package p000;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public abstract class p49 {

    /* JADX INFO: renamed from: d */
    public static final String f69634d = "LibraryLoader";

    /* JADX INFO: renamed from: a */
    public String[] f69635a;

    /* JADX INFO: renamed from: b */
    public boolean f69636b;

    /* JADX INFO: renamed from: c */
    public boolean f69637c;

    public p49(String... strArr) {
        this.f69635a = strArr;
    }

    /* JADX INFO: renamed from: a */
    public abstract void m19269a(String str);

    public synchronized boolean isAvailable() {
        if (this.f69636b) {
            return this.f69637c;
        }
        this.f69636b = true;
        try {
            for (String str : this.f69635a) {
                m19269a(str);
            }
            this.f69637c = true;
        } catch (UnsatisfiedLinkError unused) {
            xh9.m25148w("LibraryLoader", "Failed to load " + Arrays.toString(this.f69635a));
        }
        return this.f69637c;
    }

    public synchronized void setLibraries(String... strArr) {
        v80.checkState(!this.f69636b, "Cannot set libraries after loading");
        this.f69635a = strArr;
    }
}
