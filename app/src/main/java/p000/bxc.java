package p000;

/* JADX INFO: loaded from: classes.dex */
@vw7
public final class bxc {

    /* JADX INFO: renamed from: b */
    public static final int f15170b = 0;

    /* JADX INFO: renamed from: a */
    @gib
    public final String f15171a;

    public bxc() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bxc) && md8.areEqual(this.f15171a, ((bxc) obj).f15171a);
    }

    @gib
    public final String getPrivateImeOptions() {
        return this.f15171a;
    }

    public int hashCode() {
        String str = this.f15171a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @yfb
    public String toString() {
        return "PlatformImeOptions(privateImeOptions=" + this.f15171a + ')';
    }

    public bxc(@gib String str) {
        this.f15171a = str;
    }

    public /* synthetic */ bxc(String str, int i, jt3 jt3Var) {
        this((i & 1) != 0 ? null : str);
    }
}
