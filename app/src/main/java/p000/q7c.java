package p000;

/* JADX INFO: loaded from: classes8.dex */
public class q7c extends d99 {

    /* JADX INFO: renamed from: e */
    public final char f73444e;

    /* JADX INFO: renamed from: f */
    public int f73445f;

    public q7c(d99 d99Var, p7c p7cVar) {
        super(d99Var);
        this.f73444e = p7cVar.getDelimiter();
        this.f73445f = p7cVar.getStartNumber();
    }

    public int getCounter() {
        return this.f73445f;
    }

    public char getDelimiter() {
        return this.f73444e;
    }

    public void increaseCounter() {
        this.f73445f++;
    }
}
