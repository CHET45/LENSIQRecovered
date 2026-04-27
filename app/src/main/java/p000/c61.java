package p000;

/* JADX INFO: loaded from: classes8.dex */
public class c61 {

    /* JADX INFO: renamed from: a */
    public final StringBuilder f15824a;

    /* JADX INFO: renamed from: b */
    public int f15825b;

    public c61() {
        this.f15825b = 0;
        this.f15824a = new StringBuilder();
    }

    public void add(CharSequence charSequence) {
        if (this.f15825b != 0) {
            this.f15824a.append('\n');
        }
        this.f15824a.append(charSequence);
        this.f15825b++;
    }

    public String getString() {
        return this.f15824a.toString();
    }

    public c61(String str) {
        this.f15825b = 0;
        this.f15824a = new StringBuilder(str);
    }
}
