package p000;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class lpi implements yue {

    /* JADX INFO: renamed from: e */
    public static final int f58441e = 8;

    /* JADX INFO: renamed from: c */
    @yfb
    public final CharSequence f58442c;

    /* JADX INFO: renamed from: d */
    @yfb
    public final kpi f58443d;

    public lpi(@yfb CharSequence charSequence, @yfb kpi kpiVar) {
        this.f58442c = charSequence;
        this.f58443d = kpiVar;
    }

    @Override // p000.yue
    public int nextEndBoundary(int i) {
        do {
            i = this.f58443d.nextBoundary(i);
            if (i == -1) {
                return -1;
            }
        } while (Character.isWhitespace(this.f58442c.charAt(i - 1)));
        return i;
    }

    @Override // p000.yue
    public int nextStartBoundary(int i) {
        do {
            i = this.f58443d.nextBoundary(i);
            if (i == -1 || i == this.f58442c.length()) {
                return -1;
            }
        } while (Character.isWhitespace(this.f58442c.charAt(i)));
        return i;
    }

    @Override // p000.yue
    public int previousEndBoundary(int i) {
        do {
            i = this.f58443d.prevBoundary(i);
            if (i == -1 || i == 0) {
                return -1;
            }
        } while (Character.isWhitespace(this.f58442c.charAt(i - 1)));
        return i;
    }

    @Override // p000.yue
    public int previousStartBoundary(int i) {
        do {
            i = this.f58443d.prevBoundary(i);
            if (i == -1) {
                return -1;
            }
        } while (Character.isWhitespace(this.f58442c.charAt(i)));
        return i;
    }
}
