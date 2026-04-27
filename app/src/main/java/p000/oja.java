package p000;

import p000.vna;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class oja {

    /* JADX INFO: renamed from: p */
    public static final String f67819p = "MediaPeriodHolder";

    /* JADX INFO: renamed from: a */
    public final nja f67820a;

    /* JADX INFO: renamed from: b */
    public final Object f67821b;

    /* JADX INFO: renamed from: c */
    public final nle[] f67822c;

    /* JADX INFO: renamed from: d */
    public boolean f67823d;

    /* JADX INFO: renamed from: e */
    public boolean f67824e;

    /* JADX INFO: renamed from: f */
    public qja f67825f;

    /* JADX INFO: renamed from: g */
    public boolean f67826g;

    /* JADX INFO: renamed from: h */
    public final boolean[] f67827h;

    /* JADX INFO: renamed from: i */
    public final p1e[] f67828i;

    /* JADX INFO: renamed from: j */
    public final p7h f67829j;

    /* JADX INFO: renamed from: k */
    public final ppa f67830k;

    /* JADX INFO: renamed from: l */
    @hib
    public oja f67831l;

    /* JADX INFO: renamed from: m */
    public m6h f67832m;

    /* JADX INFO: renamed from: n */
    public q7h f67833n;

    /* JADX INFO: renamed from: o */
    public long f67834o;

    public oja(p1e[] p1eVarArr, long j, p7h p7hVar, InterfaceC6430gn interfaceC6430gn, ppa ppaVar, qja qjaVar, q7h q7hVar) {
        this.f67828i = p1eVarArr;
        this.f67834o = j;
        this.f67829j = p7hVar;
        this.f67830k = ppaVar;
        vna.C14175b c14175b = qjaVar.f74599a;
        this.f67821b = c14175b.f71106a;
        this.f67825f = qjaVar;
        this.f67832m = m6h.f60031e;
        this.f67833n = q7hVar;
        this.f67822c = new nle[p1eVarArr.length];
        this.f67827h = new boolean[p1eVarArr.length];
        this.f67820a = createMediaPeriod(c14175b, ppaVar, interfaceC6430gn, qjaVar.f74600b, qjaVar.f74602d);
    }

    private void associateNoSampleRenderersWithEmptySampleStream(nle[] nleVarArr) {
        int i = 0;
        while (true) {
            p1e[] p1eVarArr = this.f67828i;
            if (i >= p1eVarArr.length) {
                return;
            }
            if (p1eVarArr[i].getTrackType() == -2 && this.f67833n.isRendererEnabled(i)) {
                nleVarArr[i] = new q05();
            }
            i++;
        }
    }

    private static nja createMediaPeriod(vna.C14175b c14175b, ppa ppaVar, InterfaceC6430gn interfaceC6430gn, long j, long j2) {
        nja njaVarCreatePeriod = ppaVar.createPeriod(c14175b, interfaceC6430gn, j);
        return j2 != -9223372036854775807L ? new d52(njaVarCreatePeriod, true, 0L, j2) : njaVarCreatePeriod;
    }

    private void disableTrackSelectionsInResult() {
        if (!isLoadingMediaPeriod()) {
            return;
        }
        int i = 0;
        while (true) {
            q7h q7hVar = this.f67833n;
            if (i >= q7hVar.f73446a) {
                return;
            }
            boolean zIsRendererEnabled = q7hVar.isRendererEnabled(i);
            pf5 pf5Var = this.f67833n.f73448c[i];
            if (zIsRendererEnabled && pf5Var != null) {
                pf5Var.disable();
            }
            i++;
        }
    }

    private void disassociateNoSampleRenderersWithEmptySampleStream(nle[] nleVarArr) {
        int i = 0;
        while (true) {
            p1e[] p1eVarArr = this.f67828i;
            if (i >= p1eVarArr.length) {
                return;
            }
            if (p1eVarArr[i].getTrackType() == -2) {
                nleVarArr[i] = null;
            }
            i++;
        }
    }

    private void enableTrackSelectionsInResult() {
        if (!isLoadingMediaPeriod()) {
            return;
        }
        int i = 0;
        while (true) {
            q7h q7hVar = this.f67833n;
            if (i >= q7hVar.f73446a) {
                return;
            }
            boolean zIsRendererEnabled = q7hVar.isRendererEnabled(i);
            pf5 pf5Var = this.f67833n.f73448c[i];
            if (zIsRendererEnabled && pf5Var != null) {
                pf5Var.enable();
            }
            i++;
        }
    }

    private boolean isLoadingMediaPeriod() {
        return this.f67831l == null;
    }

    private static void releaseMediaPeriod(ppa ppaVar, nja njaVar) {
        try {
            if (njaVar instanceof d52) {
                ppaVar.releasePeriod(((d52) njaVar).f28448a);
            } else {
                ppaVar.releasePeriod(njaVar);
            }
        } catch (RuntimeException e) {
            yh9.m25916e("MediaPeriodHolder", "Period release failed.", e);
        }
    }

    public long applyTrackSelection(q7h q7hVar, long j, boolean z) {
        return applyTrackSelection(q7hVar, j, z, new boolean[this.f67828i.length]);
    }

    public void continueLoading(long j) {
        u80.checkState(isLoadingMediaPeriod());
        this.f67820a.continueLoading(toPeriodTime(j));
    }

    public long getBufferedPositionUs() {
        if (!this.f67823d) {
            return this.f67825f.f74600b;
        }
        long bufferedPositionUs = this.f67824e ? this.f67820a.getBufferedPositionUs() : Long.MIN_VALUE;
        return bufferedPositionUs == Long.MIN_VALUE ? this.f67825f.f74603e : bufferedPositionUs;
    }

    @hib
    public oja getNext() {
        return this.f67831l;
    }

    public long getNextLoadPositionUs() {
        if (this.f67823d) {
            return this.f67820a.getNextLoadPositionUs();
        }
        return 0L;
    }

    public long getRendererOffset() {
        return this.f67834o;
    }

    public long getStartPositionRendererTime() {
        return this.f67825f.f74600b + this.f67834o;
    }

    public m6h getTrackGroups() {
        return this.f67832m;
    }

    public q7h getTrackSelectorResult() {
        return this.f67833n;
    }

    public void handlePrepared(float f, t1h t1hVar) throws ba5 {
        this.f67823d = true;
        this.f67832m = this.f67820a.getTrackGroups();
        q7h q7hVarSelectTracks = selectTracks(f, t1hVar);
        qja qjaVar = this.f67825f;
        long jMax = qjaVar.f74600b;
        long j = qjaVar.f74603e;
        if (j != -9223372036854775807L && jMax >= j) {
            jMax = Math.max(0L, j - 1);
        }
        long jApplyTrackSelection = applyTrackSelection(q7hVarSelectTracks, jMax, false);
        long j2 = this.f67834o;
        qja qjaVar2 = this.f67825f;
        this.f67834o = j2 + (qjaVar2.f74600b - jApplyTrackSelection);
        this.f67825f = qjaVar2.copyWithStartPositionUs(jApplyTrackSelection);
    }

    public boolean isFullyBuffered() {
        return this.f67823d && (!this.f67824e || this.f67820a.getBufferedPositionUs() == Long.MIN_VALUE);
    }

    public void reevaluateBuffer(long j) {
        u80.checkState(isLoadingMediaPeriod());
        if (this.f67823d) {
            this.f67820a.reevaluateBuffer(toPeriodTime(j));
        }
    }

    public void release() {
        disableTrackSelectionsInResult();
        releaseMediaPeriod(this.f67830k, this.f67820a);
    }

    public q7h selectTracks(float f, t1h t1hVar) throws ba5 {
        q7h q7hVarSelectTracks = this.f67829j.selectTracks(this.f67828i, getTrackGroups(), this.f67825f.f74599a, t1hVar);
        for (pf5 pf5Var : q7hVarSelectTracks.f73448c) {
            if (pf5Var != null) {
                pf5Var.onPlaybackSpeed(f);
            }
        }
        return q7hVarSelectTracks;
    }

    public void setNext(@hib oja ojaVar) {
        if (ojaVar == this.f67831l) {
            return;
        }
        disableTrackSelectionsInResult();
        this.f67831l = ojaVar;
        enableTrackSelectionsInResult();
    }

    public void setRendererOffset(long j) {
        this.f67834o = j;
    }

    public long toPeriodTime(long j) {
        return j - getRendererOffset();
    }

    public long toRendererTime(long j) {
        return j + getRendererOffset();
    }

    public void updateClipping() {
        nja njaVar = this.f67820a;
        if (njaVar instanceof d52) {
            long j = this.f67825f.f74602d;
            if (j == -9223372036854775807L) {
                j = Long.MIN_VALUE;
            }
            ((d52) njaVar).updateClipping(0L, j);
        }
    }

    public long applyTrackSelection(q7h q7hVar, long j, boolean z, boolean[] zArr) {
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= q7hVar.f73446a) {
                break;
            }
            boolean[] zArr2 = this.f67827h;
            if (z || !q7hVar.isEquivalent(this.f67833n, i)) {
                z2 = false;
            }
            zArr2[i] = z2;
            i++;
        }
        disassociateNoSampleRenderersWithEmptySampleStream(this.f67822c);
        disableTrackSelectionsInResult();
        this.f67833n = q7hVar;
        enableTrackSelectionsInResult();
        long jSelectTracks = this.f67820a.selectTracks(q7hVar.f73448c, this.f67827h, this.f67822c, zArr, j);
        associateNoSampleRenderersWithEmptySampleStream(this.f67822c);
        this.f67824e = false;
        int i2 = 0;
        while (true) {
            nle[] nleVarArr = this.f67822c;
            if (i2 >= nleVarArr.length) {
                return jSelectTracks;
            }
            if (nleVarArr[i2] != null) {
                u80.checkState(q7hVar.isRendererEnabled(i2));
                if (this.f67828i[i2].getTrackType() != -2) {
                    this.f67824e = true;
                }
            } else {
                u80.checkState(q7hVar.f73448c[i2] == null);
            }
            i2++;
        }
    }
}
