package p000;

/* JADX INFO: loaded from: classes.dex */
public class b6c extends RuntimeException {
    public b6c() {
        this(null);
    }

    public b6c(@hib String str) {
        super(pkb.toString(str, "The operation has been canceled."));
    }
}
