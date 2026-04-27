package p000;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public class vzb implements xj5 {

    /* JADX INFO: renamed from: g */
    public static final ik5 f92948g = new ik5() { // from class: tzb
        @Override // p000.ik5
        public final xj5[] createExtractors() {
            return vzb.lambda$static$0();
        }
    };

    /* JADX INFO: renamed from: h */
    public static final int f92949h = 8;

    /* JADX INFO: renamed from: d */
    public bk5 f92950d;

    /* JADX INFO: renamed from: e */
    public e6g f92951e;

    /* JADX INFO: renamed from: f */
    public boolean f92952f;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ xj5[] lambda$static$0() {
        return new xj5[]{new vzb()};
    }

    private static jhc resetPosition(jhc jhcVar) {
        jhcVar.setPosition(0);
        return jhcVar;
    }

    @a35(expression = {"streamReader"}, result = true)
    private boolean sniffInternal(ak5 ak5Var) throws IOException {
        b0c b0cVar = new b0c();
        if (b0cVar.populate(ak5Var, true) && (b0cVar.f12338b & 2) == 2) {
            int iMin = Math.min(b0cVar.f12345i, 8);
            jhc jhcVar = new jhc(iMin);
            ak5Var.peekFully(jhcVar.getData(), 0, iMin);
            if (a36.verifyBitstreamType(resetPosition(jhcVar))) {
                this.f92951e = new a36();
            } else if (mgi.verifyBitstreamType(resetPosition(jhcVar))) {
                this.f92951e = new mgi();
            } else if (k7c.verifyBitstreamType(resetPosition(jhcVar))) {
                this.f92951e = new k7c();
            }
            return true;
        }
        return false;
    }

    @Override // p000.xj5
    public void init(bk5 bk5Var) {
        this.f92950d = bk5Var;
    }

    @Override // p000.xj5
    public int read(ak5 ak5Var, d5d d5dVar) throws IOException {
        v80.checkStateNotNull(this.f92950d);
        if (this.f92951e == null) {
            if (!sniffInternal(ak5Var)) {
                throw yhc.createForMalformedContainer("Failed to determine bitstream type", null);
            }
            ak5Var.resetPeekPosition();
        }
        if (!this.f92952f) {
            q6h q6hVarTrack = this.f92950d.track(0, 1);
            this.f92950d.endTracks();
            this.f92951e.m9755c(this.f92950d, q6hVarTrack);
            this.f92952f = true;
        }
        return this.f92951e.m9757f(ak5Var, d5dVar);
    }

    @Override // p000.xj5
    public void release() {
    }

    @Override // p000.xj5
    public void seek(long j, long j2) {
        e6g e6gVar = this.f92951e;
        if (e6gVar != null) {
            e6gVar.m9758i(j, j2);
        }
    }

    @Override // p000.xj5
    public boolean sniff(ak5 ak5Var) throws IOException {
        try {
            return sniffInternal(ak5Var);
        } catch (yhc unused) {
            return false;
        }
    }
}
