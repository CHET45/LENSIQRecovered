package p000;

import java.nio.ByteBuffer;
import java.util.List;
import p000.yxb;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class qm0 {

    /* JADX INFO: renamed from: b */
    public static final int f74894b = 8;

    /* JADX INFO: renamed from: a */
    @hib
    public yxb.C15873e f74895a;

    private boolean canSkipObu(yxb.C15872d c15872d, boolean z) {
        yxb.C15873e c15873e;
        int i = c15872d.f103259a;
        if (i == 2 || i == 15) {
            return true;
        }
        if (i == 3 && !z) {
            return false;
        }
        if ((i != 6 && i != 3) || (c15873e = this.f74895a) == null) {
            return false;
        }
        yxb.C15870b c15870b = yxb.C15870b.parse(c15873e, c15872d);
        return (c15870b == null || c15870b.isDependedOn()) ? false : true;
    }

    private void updateSequenceHeaders(List<yxb.C15872d> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).f103259a == 1) {
                this.f74895a = yxb.C15873e.parse(list.get(i));
            }
        }
    }

    public void queueInputBuffer(ByteBuffer byteBuffer) {
        updateSequenceHeaders(yxb.split(byteBuffer));
    }

    public void reset() {
        this.f74895a = null;
    }

    public int sampleLimitAfterSkippingNonReferenceFrame(ByteBuffer byteBuffer, boolean z) {
        List<yxb.C15872d> listSplit = yxb.split(byteBuffer);
        updateSequenceHeaders(listSplit);
        int size = listSplit.size() - 1;
        int i = 0;
        while (size >= 0 && canSkipObu(listSplit.get(size), z)) {
            if (listSplit.get(size).f103259a == 6 || listSplit.get(size).f103259a == 3) {
                i++;
            }
            size--;
        }
        return (i > 1 || size + 1 >= 8) ? byteBuffer.limit() : size >= 0 ? listSplit.get(size).f103260b.limit() : byteBuffer.position();
    }
}
