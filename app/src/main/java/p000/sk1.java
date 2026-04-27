package p000;

/* JADX INFO: loaded from: classes.dex */
public class sk1 {

    /* JADX INFO: renamed from: f */
    public static int f82092f = 80;

    /* JADX INFO: renamed from: m */
    public static int f82093m = 2;

    /* JADX INFO: renamed from: a */
    public final char[] f82094a;

    /* JADX INFO: renamed from: b */
    public long f82095b = -1;

    /* JADX INFO: renamed from: c */
    public long f82096c = Long.MAX_VALUE;

    /* JADX INFO: renamed from: d */
    public rk1 f82097d;

    /* JADX INFO: renamed from: e */
    public int f82098e;

    public sk1(char[] cArr) {
        this.f82094a = cArr;
    }

    /* JADX INFO: renamed from: a */
    public void m22073a(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append(' ');
        }
    }

    /* JADX INFO: renamed from: b */
    public String m22074b() {
        if (!wk1.f94462d) {
            return "";
        }
        return m22075c() + " -> ";
    }

    /* JADX INFO: renamed from: c */
    public String m22075c() {
        String string = getClass().toString();
        return string.substring(string.lastIndexOf(46) + 1);
    }

    public String content() {
        String str = new String(this.f82094a);
        long j = this.f82096c;
        if (j != Long.MAX_VALUE) {
            long j2 = this.f82095b;
            if (j >= j2) {
                return str.substring((int) j2, ((int) j) + 1);
            }
        }
        long j3 = this.f82095b;
        return str.substring((int) j3, ((int) j3) + 1);
    }

    public sk1 getContainer() {
        return this.f82097d;
    }

    public long getEnd() {
        return this.f82096c;
    }

    public float getFloat() {
        if (this instanceof uk1) {
            return ((uk1) this).getFloat();
        }
        return Float.NaN;
    }

    public int getInt() {
        if (this instanceof uk1) {
            return ((uk1) this).getInt();
        }
        return 0;
    }

    public int getLine() {
        return this.f82098e;
    }

    public long getStart() {
        return this.f82095b;
    }

    public boolean isDone() {
        return this.f82096c != Long.MAX_VALUE;
    }

    public boolean isStarted() {
        return this.f82095b > -1;
    }

    public boolean notStarted() {
        return this.f82095b == -1;
    }

    public void setContainer(rk1 rk1Var) {
        this.f82097d = rk1Var;
    }

    public void setEnd(long j) {
        if (this.f82096c != Long.MAX_VALUE) {
            return;
        }
        this.f82096c = j;
        if (wk1.f94462d) {
            System.out.println("closing " + hashCode() + " -> " + this);
        }
        rk1 rk1Var = this.f82097d;
        if (rk1Var != null) {
            rk1Var.add(this);
        }
    }

    public void setLine(int i) {
        this.f82098e = i;
    }

    public void setStart(long j) {
        this.f82095b = j;
    }

    public String toFormattedJSON(int i, int i2) {
        return "";
    }

    public String toJSON() {
        return "";
    }

    public String toString() {
        long j = this.f82095b;
        long j2 = this.f82096c;
        if (j > j2 || j2 == Long.MAX_VALUE) {
            return getClass() + " (INVALID, " + this.f82095b + "-" + this.f82096c + c0b.f15434d;
        }
        return m22075c() + " (" + this.f82095b + " : " + this.f82096c + ") <<" + new String(this.f82094a).substring((int) this.f82095b, ((int) this.f82096c) + 1) + ">>";
    }
}
