package p000;

/* JADX INFO: loaded from: classes6.dex */
public class atd {

    /* JADX INFO: renamed from: a */
    public final String f11855a;

    /* JADX INFO: renamed from: b */
    public final int f11856b;

    /* JADX INFO: renamed from: c */
    public final String f11857c;

    /* JADX INFO: renamed from: d */
    public int f11858d;

    /* JADX INFO: renamed from: e */
    public int f11859e;

    public atd(String str, int i, String str2) {
        this.f11855a = str;
        this.f11856b = i;
        this.f11857c = str2;
    }

    public int getFlag() {
        return this.f11858d;
    }

    public String getOriginalAddress() {
        return this.f11855a;
    }

    public String getReconnectAddress() {
        return this.f11857c;
    }

    public int getWay() {
        return this.f11856b;
    }

    public void setFlag(int i) {
        this.f11858d = i;
    }

    public String toString() {
        return "ReconnectParam{originalAddress='" + this.f11855a + "', way=" + this.f11856b + ", reconnectAddress='" + this.f11857c + "', flag=" + this.f11858d + '}';
    }
}
