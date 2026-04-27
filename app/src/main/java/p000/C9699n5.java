package p000;

import java.io.IOException;
import p000.dkh;
import p000.hue;

/* JADX INFO: renamed from: n5 */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class C9699n5 implements yj5 {

    /* JADX INFO: renamed from: g */
    public static final hk5 f63304g = new hk5() { // from class: l5
        @Override // p000.hk5
        public final yj5[] createExtractors() {
            return C9699n5.lambda$static$0();
        }
    };

    /* JADX INFO: renamed from: h */
    public static final int f63305h = 8192;

    /* JADX INFO: renamed from: i */
    public static final int f63306i = 2935;

    /* JADX INFO: renamed from: j */
    public static final int f63307j = 2786;

    /* JADX INFO: renamed from: d */
    public final C10796p5 f63308d = new C10796p5();

    /* JADX INFO: renamed from: e */
    public final ihc f63309e = new ihc(2786);

    /* JADX INFO: renamed from: f */
    public boolean f63310f;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ yj5[] lambda$static$0() {
        return new yj5[]{new C9699n5()};
    }

    @Override // p000.yj5
    public void init(ck5 ck5Var) {
        this.f63308d.createTracks(ck5Var, new dkh.C4838e(0, 1));
        ck5Var.endTracks();
        ck5Var.seekMap(new hue.C7024b(-9223372036854775807L));
    }

    @Override // p000.yj5
    public int read(zj5 zj5Var, c5d c5dVar) throws IOException {
        int i = zj5Var.read(this.f63309e.getData(), 0, 2786);
        if (i == -1) {
            return -1;
        }
        this.f63309e.setPosition(0);
        this.f63309e.setLimit(i);
        if (!this.f63310f) {
            this.f63308d.packetStarted(0L, 4);
            this.f63310f = true;
        }
        this.f63308d.consume(this.f63309e);
        return 0;
    }

    @Override // p000.yj5
    public void release() {
    }

    @Override // p000.yj5
    public void seek(long j, long j2) {
        this.f63310f = false;
        this.f63308d.seek();
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
            zj5Var.peekFully(ihcVar.getData(), 0, 6);
            ihcVar.setPosition(0);
            if (ihcVar.readUnsignedShort() != 2935) {
                zj5Var.resetPeekPosition();
                i3++;
                if (i3 - i >= 8192) {
                    return false;
                }
                zj5Var.advancePeekPosition(i3);
                i2 = 0;
            } else {
                i2++;
                if (i2 >= 4) {
                    return true;
                }
                int ac3SyncframeSize = C12443s5.parseAc3SyncframeSize(ihcVar.getData());
                if (ac3SyncframeSize == -1) {
                    return false;
                }
                zj5Var.advancePeekPosition(ac3SyncframeSize - 6);
            }
        }
    }
}
