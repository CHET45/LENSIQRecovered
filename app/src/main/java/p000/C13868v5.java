package p000;

import java.io.IOException;
import p000.dkh;
import p000.hue;

/* JADX INFO: renamed from: v5 */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class C13868v5 implements yj5 {

    /* JADX INFO: renamed from: g */
    public static final hk5 f89985g = new hk5() { // from class: t5
        @Override // p000.hk5
        public final yj5[] createExtractors() {
            return C13868v5.lambda$static$0();
        }
    };

    /* JADX INFO: renamed from: h */
    public static final int f89986h = 8192;

    /* JADX INFO: renamed from: i */
    public static final int f89987i = 16384;

    /* JADX INFO: renamed from: j */
    public static final int f89988j = 7;

    /* JADX INFO: renamed from: d */
    public final C14918x5 f89989d = new C14918x5();

    /* JADX INFO: renamed from: e */
    public final ihc f89990e = new ihc(16384);

    /* JADX INFO: renamed from: f */
    public boolean f89991f;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ yj5[] lambda$static$0() {
        return new yj5[]{new C13868v5()};
    }

    @Override // p000.yj5
    public void init(ck5 ck5Var) {
        this.f89989d.createTracks(ck5Var, new dkh.C4838e(0, 1));
        ck5Var.endTracks();
        ck5Var.seekMap(new hue.C7024b(-9223372036854775807L));
    }

    @Override // p000.yj5
    public int read(zj5 zj5Var, c5d c5dVar) throws IOException {
        int i = zj5Var.read(this.f89990e.getData(), 0, 16384);
        if (i == -1) {
            return -1;
        }
        this.f89990e.setPosition(0);
        this.f89990e.setLimit(i);
        if (!this.f89991f) {
            this.f89989d.packetStarted(0L, 4);
            this.f89991f = true;
        }
        this.f89989d.consume(this.f89990e);
        return 0;
    }

    @Override // p000.yj5
    public void release() {
    }

    @Override // p000.yj5
    public void seek(long j, long j2) {
        this.f89991f = false;
        this.f89989d.seek();
    }

    @Override // p000.yj5
    public boolean sniff(zj5 zj5Var) throws IOException {
        ihc ihcVar = new ihc(10);
        int i = 0;
        while (true) {
            zj5Var.peekFully(ihcVar.getData(), 0, 10);
            ihcVar.setPosition(0);
            if (ihcVar.readUnsignedInt24() != 4801587) {
                break;
            }
            ihcVar.skipBytes(3);
            int synchSafeInt = ihcVar.readSynchSafeInt();
            i += synchSafeInt + 10;
            zj5Var.advancePeekPosition(synchSafeInt);
        }
        zj5Var.resetPeekPosition();
        zj5Var.advancePeekPosition(i);
        int i2 = 0;
        int i3 = i;
        while (true) {
            zj5Var.peekFully(ihcVar.getData(), 0, 7);
            ihcVar.setPosition(0);
            int unsignedShort = ihcVar.readUnsignedShort();
            if (unsignedShort == 44096 || unsignedShort == 44097) {
                i2++;
                if (i2 >= 4) {
                    return true;
                }
                int ac4SyncframeSize = C0070a6.parseAc4SyncframeSize(ihcVar.getData(), unsignedShort);
                if (ac4SyncframeSize == -1) {
                    return false;
                }
                zj5Var.advancePeekPosition(ac4SyncframeSize - 7);
            } else {
                zj5Var.resetPeekPosition();
                i3++;
                if (i3 - i >= 8192) {
                    return false;
                }
                zj5Var.advancePeekPosition(i3);
                i2 = 0;
            }
        }
    }
}
