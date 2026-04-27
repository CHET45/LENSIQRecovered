package p000;

import p000.nfa;
import p000.q1h;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class u1h extends yt6 {

    /* JADX INFO: renamed from: f */
    public final nfa f86573f;

    public u1h(q1h q1hVar, nfa nfaVar) {
        super(q1hVar);
        this.f86573f = nfaVar;
    }

    @Override // p000.yt6, p000.q1h
    public q1h.C11272d getWindow(int i, q1h.C11272d c11272d, long j) {
        super.getWindow(i, c11272d, j);
        nfa nfaVar = this.f86573f;
        c11272d.f72973c = nfaVar;
        nfa.C9856h c9856h = nfaVar.f64305b;
        c11272d.f72972b = c9856h != null ? c9856h.f64414i : null;
        return c11272d;
    }
}
