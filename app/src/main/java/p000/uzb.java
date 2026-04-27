package p000;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class uzb implements yj5 {

    /* JADX INFO: renamed from: g */
    public static final hk5 f89589g = new hk5() { // from class: szb
        @Override // p000.hk5
        public final yj5[] createExtractors() {
            return uzb.lambda$static$0();
        }
    };

    /* JADX INFO: renamed from: h */
    public static final int f89590h = 8;

    /* JADX INFO: renamed from: d */
    public ck5 f89591d;

    /* JADX INFO: renamed from: e */
    public f6g f89592e;

    /* JADX INFO: renamed from: f */
    public boolean f89593f;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ yj5[] lambda$static$0() {
        return new yj5[]{new uzb()};
    }

    private static ihc resetPosition(ihc ihcVar) {
        ihcVar.setPosition(0);
        return ihcVar;
    }

    @a35(expression = {"streamReader"}, result = true)
    private boolean sniffInternal(zj5 zj5Var) throws IOException {
        a0c a0cVar = new a0c();
        if (a0cVar.populate(zj5Var, true) && (a0cVar.f32b & 2) == 2) {
            int iMin = Math.min(a0cVar.f39i, 8);
            ihc ihcVar = new ihc(iMin);
            zj5Var.peekFully(ihcVar.getData(), 0, iMin);
            if (b36.verifyBitstreamType(resetPosition(ihcVar))) {
                this.f89592e = new b36();
            } else if (ngi.verifyBitstreamType(resetPosition(ihcVar))) {
                this.f89592e = new ngi();
            } else if (j7c.verifyBitstreamType(resetPosition(ihcVar))) {
                this.f89592e = new j7c();
            }
            return true;
        }
        return false;
    }

    @Override // p000.yj5
    public void init(ck5 ck5Var) {
        this.f89591d = ck5Var;
    }

    @Override // p000.yj5
    public int read(zj5 zj5Var, c5d c5dVar) throws IOException {
        u80.checkStateNotNull(this.f89591d);
        if (this.f89592e == null) {
            if (!sniffInternal(zj5Var)) {
                throw xhc.createForMalformedContainer("Failed to determine bitstream type", null);
            }
            zj5Var.resetPeekPosition();
        }
        if (!this.f89593f) {
            r6h r6hVarTrack = this.f89591d.track(0, 1);
            this.f89591d.endTracks();
            this.f89592e.m10677c(this.f89591d, r6hVarTrack);
            this.f89593f = true;
        }
        return this.f89592e.m10679f(zj5Var, c5dVar);
    }

    @Override // p000.yj5
    public void release() {
    }

    @Override // p000.yj5
    public void seek(long j, long j2) {
        f6g f6gVar = this.f89592e;
        if (f6gVar != null) {
            f6gVar.m10680i(j, j2);
        }
    }

    @Override // p000.yj5
    public boolean sniff(zj5 zj5Var) throws IOException {
        try {
            return sniffInternal(zj5Var);
        } catch (xhc unused) {
            return false;
        }
    }
}
