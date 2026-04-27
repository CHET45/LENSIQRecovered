package p000;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public abstract class n49 {

    /* JADX INFO: renamed from: d */
    public static final String f63247d = "LibraryLoader";

    /* JADX INFO: renamed from: a */
    public String[] f63248a;

    /* JADX INFO: renamed from: b */
    public boolean f63249b;

    /* JADX INFO: renamed from: c */
    public boolean f63250c;

    public n49(String... strArr) {
        this.f63248a = strArr;
    }

    /* JADX INFO: renamed from: a */
    public abstract void m17777a(String str);

    public synchronized boolean isAvailable() {
        if (this.f63249b) {
            return this.f63250c;
        }
        this.f63249b = true;
        try {
            for (String str : this.f63248a) {
                m17777a(str);
            }
            this.f63250c = true;
        } catch (UnsatisfiedLinkError unused) {
            yh9.m25919w("LibraryLoader", "Failed to load " + Arrays.toString(this.f63248a));
        }
        return this.f63250c;
    }

    public synchronized void setLibraries(String... strArr) {
        u80.checkState(!this.f63249b, "Cannot set libraries after loading");
        this.f63248a = strArr;
    }
}
