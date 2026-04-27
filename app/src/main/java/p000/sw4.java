package p000;

/* JADX INFO: loaded from: classes.dex */
public final class sw4 {
    /* JADX INFO: renamed from: updateRangeAfterDelete-pWDy79M, reason: not valid java name */
    public static final long m32339updateRangeAfterDeletepWDy79M(long j, long j2) {
        int iM30589getLengthimpl;
        int iM30591getMinimpl = jvg.m30591getMinimpl(j);
        int iM30590getMaximpl = jvg.m30590getMaximpl(j);
        if (jvg.m30595intersects5zctL8(j2, j)) {
            if (jvg.m30583contains5zctL8(j2, j)) {
                iM30591getMinimpl = jvg.m30591getMinimpl(j2);
                iM30590getMaximpl = iM30591getMinimpl;
            } else {
                if (jvg.m30583contains5zctL8(j, j2)) {
                    iM30589getLengthimpl = jvg.m30589getLengthimpl(j2);
                } else if (jvg.m30584containsimpl(j2, iM30591getMinimpl)) {
                    iM30591getMinimpl = jvg.m30591getMinimpl(j2);
                    iM30589getLengthimpl = jvg.m30589getLengthimpl(j2);
                } else {
                    iM30590getMaximpl = jvg.m30591getMinimpl(j2);
                }
                iM30590getMaximpl -= iM30589getLengthimpl;
            }
        } else if (iM30590getMaximpl > jvg.m30591getMinimpl(j2)) {
            iM30591getMinimpl -= jvg.m30589getLengthimpl(j2);
            iM30589getLengthimpl = jvg.m30589getLengthimpl(j2);
            iM30590getMaximpl -= iM30589getLengthimpl;
        }
        return kvg.TextRange(iM30591getMinimpl, iM30590getMaximpl);
    }
}
