package p000;

import p000.wc8;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class y29 {

    /* JADX INFO: renamed from: b */
    public static final int f100167b = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final wc8<z19> f100168a;

    public y29(@yfb wc8<z19> wc8Var) {
        this.f100168a = wc8Var;
    }

    @yfb
    public final wc8<z19> getIntervals() {
        return this.f100168a;
    }

    public final boolean isFullSpan(int i) {
        if (i < 0 || i >= this.f100168a.getSize()) {
            return false;
        }
        wc8.C14548a<z19> c14548a = this.f100168a.get(i);
        qy6<Integer, q0g> span = c14548a.getValue().getSpan();
        return span != null && span.invoke(Integer.valueOf(i - c14548a.getStartIndex())) == q0g.f72708b.getFullLine();
    }
}
