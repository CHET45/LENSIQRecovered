package p000;

/* JADX INFO: loaded from: classes5.dex */
public final class syh {

    /* JADX INFO: renamed from: b */
    public static final syh f83239b = new syh(null);

    /* JADX INFO: renamed from: a */
    @hib
    public final String f83240a;

    public syh(@hib String str) {
        this.f83240a = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || syh.class != obj.getClass()) {
            return false;
        }
        String str = this.f83240a;
        String str2 = ((syh) obj).f83240a;
        return str != null ? str.equals(str2) : str2 == null;
    }

    @hib
    public String getUid() {
        return this.f83240a;
    }

    public int hashCode() {
        String str = this.f83240a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public boolean isAuthenticated() {
        return this.f83240a != null;
    }

    public String toString() {
        return "User(uid:" + this.f83240a + c0b.f15434d;
    }
}
