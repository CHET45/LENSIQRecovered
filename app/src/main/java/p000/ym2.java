package p000;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class ym2 implements zye {

    /* JADX INFO: renamed from: a */
    public final zye[] f102055a;

    public ym2(zye[] zyeVarArr) {
        this.f102055a = zyeVarArr;
    }

    @Override // p000.zye
    public boolean continueLoading(long j) {
        boolean zContinueLoading;
        boolean z = false;
        do {
            long nextLoadPositionUs = getNextLoadPositionUs();
            if (nextLoadPositionUs == Long.MIN_VALUE) {
                break;
            }
            zContinueLoading = false;
            for (zye zyeVar : this.f102055a) {
                long nextLoadPositionUs2 = zyeVar.getNextLoadPositionUs();
                boolean z2 = nextLoadPositionUs2 != Long.MIN_VALUE && nextLoadPositionUs2 <= j;
                if (nextLoadPositionUs2 == nextLoadPositionUs || z2) {
                    zContinueLoading |= zyeVar.continueLoading(j);
                }
            }
            z |= zContinueLoading;
        } while (zContinueLoading);
        return z;
    }

    @Override // p000.zye
    public final long getBufferedPositionUs() {
        long jMin = Long.MAX_VALUE;
        for (zye zyeVar : this.f102055a) {
            long bufferedPositionUs = zyeVar.getBufferedPositionUs();
            if (bufferedPositionUs != Long.MIN_VALUE) {
                jMin = Math.min(jMin, bufferedPositionUs);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // p000.zye
    public final long getNextLoadPositionUs() {
        long jMin = Long.MAX_VALUE;
        for (zye zyeVar : this.f102055a) {
            long nextLoadPositionUs = zyeVar.getNextLoadPositionUs();
            if (nextLoadPositionUs != Long.MIN_VALUE) {
                jMin = Math.min(jMin, nextLoadPositionUs);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // p000.zye
    public boolean isLoading() {
        for (zye zyeVar : this.f102055a) {
            if (zyeVar.isLoading()) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.zye
    public final void reevaluateBuffer(long j) {
        for (zye zyeVar : this.f102055a) {
            zyeVar.reevaluateBuffer(j);
        }
    }
}
