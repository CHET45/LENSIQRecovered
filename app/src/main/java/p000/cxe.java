package p000;

/* JADX INFO: loaded from: classes.dex */
public enum cxe {
    Vertical { // from class: cxe.b
        @Override // p000.cxe
        /* JADX INFO: renamed from: compare-3MmeM6k$foundation_release */
        public int mo28559compare3MmeM6k$foundation_release(long j, @yfb rud rudVar) {
            if (axe.m27906containsInclusiveUv8p0NA(rudVar, j)) {
                return 0;
            }
            if (izb.m30430getYimpl(j) < rudVar.getTop()) {
                return -1;
            }
            return (izb.m30429getXimpl(j) >= rudVar.getLeft() || izb.m30430getYimpl(j) >= rudVar.getBottom()) ? 1 : -1;
        }
    },
    Horizontal { // from class: cxe.a
        @Override // p000.cxe
        /* JADX INFO: renamed from: compare-3MmeM6k$foundation_release */
        public int mo28559compare3MmeM6k$foundation_release(long j, @yfb rud rudVar) {
            if (axe.m27906containsInclusiveUv8p0NA(rudVar, j)) {
                return 0;
            }
            if (izb.m30429getXimpl(j) < rudVar.getLeft()) {
                return -1;
            }
            return (izb.m30430getYimpl(j) >= rudVar.getTop() || izb.m30429getXimpl(j) >= rudVar.getRight()) ? 1 : -1;
        }
    };

    /* synthetic */ cxe(jt3 jt3Var) {
        this();
    }

    /* JADX INFO: renamed from: containsInclusive-Uv8p0NA, reason: not valid java name */
    private final boolean m28558containsInclusiveUv8p0NA(rud rudVar, long j) {
        float left = rudVar.getLeft();
        float right = rudVar.getRight();
        float fM30429getXimpl = izb.m30429getXimpl(j);
        if (left <= fM30429getXimpl && fM30429getXimpl <= right) {
            float top = rudVar.getTop();
            float bottom = rudVar.getBottom();
            float fM30430getYimpl = izb.m30430getYimpl(j);
            if (top <= fM30430getYimpl && fM30430getYimpl <= bottom) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: compare-3MmeM6k$foundation_release, reason: not valid java name */
    public abstract int mo28559compare3MmeM6k$foundation_release(long j, @yfb rud rudVar);

    /* JADX INFO: renamed from: isSelected-2x9bVx0$foundation_release, reason: not valid java name */
    public final boolean m28560isSelected2x9bVx0$foundation_release(@yfb rud rudVar, long j, long j2) {
        if (m28558containsInclusiveUv8p0NA(rudVar, j) || m28558containsInclusiveUv8p0NA(rudVar, j2)) {
            return true;
        }
        return (mo28559compare3MmeM6k$foundation_release(j, rudVar) > 0) ^ (mo28559compare3MmeM6k$foundation_release(j2, rudVar) > 0);
    }
}
