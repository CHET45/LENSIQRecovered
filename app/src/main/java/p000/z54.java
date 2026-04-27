package p000;

/* JADX INFO: loaded from: classes5.dex */
public enum z54 {
    DEVELOPER(1),
    USER_SIDELOAD(2),
    TEST_DISTRIBUTION(3),
    APP_STORE(4);


    /* JADX INFO: renamed from: a */
    public final int f104228a;

    z54(int i) {
        this.f104228a = i;
    }

    public static z54 determineFrom(String str) {
        return str != null ? APP_STORE : DEVELOPER;
    }

    public int getId() {
        return this.f104228a;
    }

    @Override // java.lang.Enum
    public String toString() {
        return Integer.toString(this.f104228a);
    }
}
