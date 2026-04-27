package p000;

import java.io.IOException;
import p000.ckh;
import p000.gue;

/* JADX INFO: renamed from: w5 */
/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class C14391w5 implements xj5 {

    /* JADX INFO: renamed from: g */
    public static final ik5 f93266g = new ik5() { // from class: u5
        @Override // p000.ik5
        public final xj5[] createExtractors() {
            return C14391w5.lambda$static$0();
        }
    };

    /* JADX INFO: renamed from: h */
    public static final int f93267h = 8192;

    /* JADX INFO: renamed from: i */
    public static final int f93268i = 16384;

    /* JADX INFO: renamed from: j */
    public static final int f93269j = 7;

    /* JADX INFO: renamed from: d */
    public final C15491y5 f93270d = new C15491y5("audio/ac4");

    /* JADX INFO: renamed from: e */
    public final jhc f93271e = new jhc(16384);

    /* JADX INFO: renamed from: f */
    public boolean f93272f;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ xj5[] lambda$static$0() {
        return new xj5[]{new C14391w5()};
    }

    @Override // p000.xj5
    public void init(bk5 bk5Var) {
        this.f93270d.createTracks(bk5Var, new ckh.C2372e(0, 1));
        bk5Var.endTracks();
        bk5Var.seekMap(new gue.C6549b(-9223372036854775807L));
    }

    @Override // p000.xj5
    public int read(ak5 ak5Var, d5d d5dVar) throws IOException {
        int i = ak5Var.read(this.f93271e.getData(), 0, 16384);
        if (i == -1) {
            return -1;
        }
        this.f93271e.setPosition(0);
        this.f93271e.setLimit(i);
        if (!this.f93272f) {
            this.f93270d.packetStarted(0L, 4);
            this.f93272f = true;
        }
        this.f93270d.consume(this.f93271e);
        return 0;
    }

    @Override // p000.xj5
    public void release() {
    }

    @Override // p000.xj5
    public void seek(long j, long j2) {
        this.f93272f = false;
        this.f93270d.seek();
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
            ak5Var.peekFully(jhcVar.getData(), 0, 7);
            jhcVar.setPosition(0);
            int unsignedShort = jhcVar.readUnsignedShort();
            if (unsignedShort == 44096 || unsignedShort == 44097) {
                i2++;
                if (i2 >= 4) {
                    return true;
                }
                int ac4SyncframeSize = C16006z5.parseAc4SyncframeSize(jhcVar.getData(), unsignedShort);
                if (ac4SyncframeSize == -1) {
                    return false;
                }
                ak5Var.advancePeekPosition(ac4SyncframeSize - 7);
            } else {
                ak5Var.resetPeekPosition();
                i3++;
                if (i3 - i >= 8192) {
                    return false;
                }
                ak5Var.advancePeekPosition(i3);
                i2 = 0;
            }
        }
    }
}
