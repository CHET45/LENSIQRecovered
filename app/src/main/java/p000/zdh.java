package p000;

/* JADX INFO: loaded from: classes.dex */
public interface zdh {

    /* JADX INFO: renamed from: zdh$a */
    public static final class C16099a {
    }

    /* JADX INFO: renamed from: transformBy-d-4ec7I$default, reason: not valid java name */
    static /* synthetic */ void m33505transformByd4ec7I$default(zdh zdhVar, float f, long j, float f2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: transformBy-d-4ec7I");
        }
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        if ((i & 2) != 0) {
            j = izb.f49009b.m30445getZeroF1C5BW0();
        }
        if ((i & 4) != 0) {
            f2 = 0.0f;
        }
        zdhVar.mo30630transformByd4ec7I(f, j, f2);
    }

    /* JADX INFO: renamed from: transformBy-d-4ec7I */
    void mo30630transformByd4ec7I(float f, long j, float f2);
}
