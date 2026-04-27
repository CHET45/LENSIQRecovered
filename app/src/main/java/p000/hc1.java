package p000;

/* JADX INFO: loaded from: classes5.dex */
@gd7
@tx4
public enum hc1 {
    OPEN(false),
    CLOSED(true);


    /* JADX INFO: renamed from: a */
    public final boolean f43122a;

    hc1(boolean inclusive) {
        this.f43122a = inclusive;
    }

    /* JADX INFO: renamed from: a */
    public static hc1 m12308a(boolean inclusive) {
        return inclusive ? CLOSED : OPEN;
    }
}
