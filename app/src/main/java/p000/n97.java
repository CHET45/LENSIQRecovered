package p000;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 1)
public abstract class n97 implements yue {

    /* JADX INFO: renamed from: c */
    public static final int f63751c = 0;

    public abstract int next(int i);

    @Override // p000.yue
    public int nextEndBoundary(int i) {
        return next(i);
    }

    @Override // p000.yue
    public int nextStartBoundary(int i) {
        int next = next(i);
        if (next == -1 || next(next) == -1) {
            return -1;
        }
        return next;
    }

    public abstract int previous(int i);

    @Override // p000.yue
    public int previousEndBoundary(int i) {
        int iPrevious = previous(i);
        if (iPrevious == -1 || previous(iPrevious) == -1) {
            return -1;
        }
        return iPrevious;
    }

    @Override // p000.yue
    public int previousStartBoundary(int i) {
        return previous(i);
    }
}
