package p000;

/* JADX INFO: loaded from: classes3.dex */
public class eu9 {

    /* JADX INFO: renamed from: d */
    public static final String f34034d = "\r";

    /* JADX INFO: renamed from: a */
    public final String f34035a;

    /* JADX INFO: renamed from: b */
    public final float f34036b;

    /* JADX INFO: renamed from: c */
    public final float f34037c;

    public eu9(String str, float f, float f2) {
        this.f34035a = str;
        this.f34037c = f2;
        this.f34036b = f;
    }

    public float getDurationFrames() {
        return this.f34037c;
    }

    public String getName() {
        return this.f34035a;
    }

    public float getStartFrame() {
        return this.f34036b;
    }

    public boolean matchesName(String str) {
        if (this.f34035a.equalsIgnoreCase(str)) {
            return true;
        }
        if (this.f34035a.endsWith(f34034d)) {
            String str2 = this.f34035a;
            if (str2.substring(0, str2.length() - 1).equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }
}
