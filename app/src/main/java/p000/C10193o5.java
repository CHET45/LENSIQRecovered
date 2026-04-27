package p000;

import java.io.IOException;
import p000.ckh;
import p000.gue;

/* JADX INFO: renamed from: o5 */
/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class C10193o5 implements xj5 {

    /* JADX INFO: renamed from: g */
    public static final ik5 f66480g = new ik5() { // from class: m5
        @Override // p000.ik5
        public final xj5[] createExtractors() {
            return C10193o5.lambda$static$0();
        }
    };

    /* JADX INFO: renamed from: h */
    public static final int f66481h = 8192;

    /* JADX INFO: renamed from: i */
    public static final int f66482i = 2935;

    /* JADX INFO: renamed from: j */
    public static final int f66483j = 2786;

    /* JADX INFO: renamed from: d */
    public final C11308q5 f66484d = new C11308q5("audio/ac3");

    /* JADX INFO: renamed from: e */
    public final jhc f66485e = new jhc(2786);

    /* JADX INFO: renamed from: f */
    public boolean f66486f;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ xj5[] lambda$static$0() {
        return new xj5[]{new C10193o5()};
    }

    @Override // p000.xj5
    public void init(bk5 bk5Var) {
        this.f66484d.createTracks(bk5Var, new ckh.C2372e(0, 1));
        bk5Var.endTracks();
        bk5Var.seekMap(new gue.C6549b(-9223372036854775807L));
    }

    @Override // p000.xj5
    public int read(ak5 ak5Var, d5d d5dVar) throws IOException {
        int i = ak5Var.read(this.f66485e.getData(), 0, 2786);
        if (i == -1) {
            return -1;
        }
        this.f66485e.setPosition(0);
        this.f66485e.setLimit(i);
        if (!this.f66486f) {
            this.f66484d.packetStarted(0L, 4);
            this.f66486f = true;
        }
        this.f66484d.consume(this.f66485e);
        return 0;
    }

    @Override // p000.xj5
    public void release() {
    }

    @Override // p000.xj5
    public void seek(long j, long j2) {
        this.f66486f = false;
        this.f66484d.seek();
    }

    @Override // p000.xj5
    public boolean sniff(ak5 ak5Var) throws IOException {
        jhc jhcVar = new jhc(10);
        int i = 0;
        while (true) {
            ak5Var.peekFully(jhcVar.getData(), 0, 10);
            jhcVar.setPosition(0);
            if (jhcVar.readUnsignedInt24() != 4801587) {
                break;
            }
            jhcVar.skipBytes(3);
            int synchSafeInt = jhcVar.readSynchSafeInt();
            i += synchSafeInt + 10;
            ak5Var.advancePeekPosition(synchSafeInt);
        }
        ak5Var.resetPeekPosition();
        ak5Var.advancePeekPosition(i);
        int i2 = 0;
        int i3 = i;
        while (true) {
            ak5Var.peekFully(jhcVar.getData(), 0, 6);
            jhcVar.setPosition(0);
            if (jhcVar.readUnsignedShort() != 2935) {
                ak5Var.resetPeekPosition();
                i3++;
                if (i3 - i >= 8192) {
                    return false;
                }
                ak5Var.advancePeekPosition(i3);
                i2 = 0;
            } else {
                i2++;
                if (i2 >= 4) {
                    return true;
                }
                int ac3SyncframeSize = C11891r5.parseAc3SyncframeSize(jhcVar.getData());
                if (ac3SyncframeSize == -1) {
                    return false;
                }
                ak5Var.advancePeekPosition(ac3SyncframeSize - 6);
            }
        }
    }
}
