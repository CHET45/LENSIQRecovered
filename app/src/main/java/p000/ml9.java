package p000;

/* JADX INFO: loaded from: classes.dex */
public final class ml9 {

    /* JADX INFO: renamed from: a */
    public final long f61409a;

    /* JADX INFO: renamed from: b */
    public final long f61410b;

    public ml9(long j, long j2) {
        this.f61409a = j;
        this.f61410b = j2;
    }

    public final long component1() {
        return getFirst();
    }

    public final long component2() {
        return getSecond();
    }

    public boolean equals(@gib Object obj) {
        if (!(obj instanceof ml9)) {
            return false;
        }
        ml9 ml9Var = (ml9) obj;
        return ml9Var.f61409a == this.f61409a && ml9Var.f61410b == this.f61410b;
    }

    public final long getFirst() {
        return this.f61409a;
    }

    public final long getSecond() {
        return this.f61410b;
    }

    public int hashCode() {
        return Long.hashCode(this.f61409a) ^ Long.hashCode(this.f61410b);
    }

    @yfb
    public String toString() {
        return '(' + this.f61409a + ", " + this.f61410b + ')';
    }
}
