package p000;

/* JADX INFO: loaded from: classes3.dex */
public class rbb {

    /* JADX INFO: renamed from: a */
    public boolean f77659a;

    /* JADX INFO: renamed from: b */
    public boolean f77660b;

    /* JADX INFO: renamed from: c */
    public boolean f77661c;

    /* JADX INFO: renamed from: d */
    public boolean f77662d;

    public rbb(boolean isConnected, boolean isValidated, boolean isMetered, boolean isNotRoaming) {
        this.f77659a = isConnected;
        this.f77660b = isValidated;
        this.f77661c = isMetered;
        this.f77662d = isNotRoaming;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof rbb)) {
            return false;
        }
        rbb rbbVar = (rbb) o;
        return this.f77659a == rbbVar.f77659a && this.f77660b == rbbVar.f77660b && this.f77661c == rbbVar.f77661c && this.f77662d == rbbVar.f77662d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    public int hashCode() {
        ?? r0 = this.f77659a;
        int i = r0;
        if (this.f77660b) {
            i = r0 + 16;
        }
        int i2 = i;
        if (this.f77661c) {
            i2 = i + 256;
        }
        return this.f77662d ? i2 + 4096 : i2;
    }

    public boolean isConnected() {
        return this.f77659a;
    }

    public boolean isMetered() {
        return this.f77661c;
    }

    public boolean isNotRoaming() {
        return this.f77662d;
    }

    public boolean isValidated() {
        return this.f77660b;
    }

    @efb
    public String toString() {
        return String.format("[ Connected=%b Validated=%b Metered=%b NotRoaming=%b ]", Boolean.valueOf(this.f77659a), Boolean.valueOf(this.f77660b), Boolean.valueOf(this.f77661c), Boolean.valueOf(this.f77662d));
    }
}
