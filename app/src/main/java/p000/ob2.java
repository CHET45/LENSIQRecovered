package p000;

import p000.jc2;
import p000.ys0;

/* JADX INFO: loaded from: classes6.dex */
public class ob2<P extends ys0, R extends jc2> {

    /* JADX INFO: renamed from: h */
    public static final int f67029h = 0;

    /* JADX INFO: renamed from: i */
    public static final int f67030i = 1;

    /* JADX INFO: renamed from: j */
    public static final int f67031j = 2;

    /* JADX INFO: renamed from: k */
    public static final int f67032k = 3;

    /* JADX INFO: renamed from: a */
    public int f67033a;

    /* JADX INFO: renamed from: b */
    public final int f67034b;

    /* JADX INFO: renamed from: c */
    public final String f67035c;

    /* JADX INFO: renamed from: d */
    public final int f67036d;

    /* JADX INFO: renamed from: e */
    public int f67037e;

    /* JADX INFO: renamed from: f */
    public P f67038f;

    /* JADX INFO: renamed from: g */
    public R f67039g;

    public ob2(int i, String str) {
        this(i, str, 0);
    }

    /* JADX INFO: renamed from: a */
    public boolean m18550a(ob2 ob2Var) {
        return ob2Var != null && this.f67033a == ob2Var.f67033a && this.f67034b == ob2Var.f67034b;
    }

    public int getId() {
        return this.f67034b;
    }

    public String getName() {
        return this.f67035c;
    }

    public int getOpCodeSn() {
        return this.f67033a;
    }

    public P getParam() {
        return this.f67038f;
    }

    public R getResponse() {
        return this.f67039g;
    }

    public int getStatus() {
        return this.f67037e;
    }

    public int getType() {
        return this.f67036d;
    }

    public ob2 setOpCodeSn(int i) {
        this.f67033a = i;
        return this;
    }

    public ob2 setParam(P p) {
        this.f67038f = p;
        return this;
    }

    public ob2 setResponse(R r) {
        this.f67039g = r;
        return this;
    }

    public ob2 setStatus(int i) {
        this.f67037e = i;
        return this;
    }

    public String toString() {
        return "CommandBase{OpCodeSn=" + this.f67033a + ", opCode=" + this.f67034b + ", name='" + this.f67035c + "', type=" + this.f67036d + ", status=" + this.f67037e + ", param=" + this.f67038f + ", response=" + this.f67039g + '}';
    }

    public ob2(int i, String str, int i2) {
        this.f67034b = i;
        this.f67035c = str;
        this.f67036d = i2;
    }
}
