package p000;

import com.google.android.exoplayer2.offline.StreamKey;
import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import p000.kx7;
import p000.nja;
import p000.vna;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class ov5 extends qri {

    /* JADX INFO: renamed from: N */
    public final dy7<Integer> f68922N;

    /* JADX INFO: renamed from: ov5$a */
    public static final class C10664a implements nja, nja.InterfaceC9906a {

        /* JADX INFO: renamed from: a */
        public final nja f68923a;

        /* JADX INFO: renamed from: b */
        public final dy7<Integer> f68924b;

        /* JADX INFO: renamed from: c */
        @hib
        public nja.InterfaceC9906a f68925c;

        /* JADX INFO: renamed from: d */
        @hib
        public m6h f68926d;

        public C10664a(nja njaVar, dy7<Integer> dy7Var) {
            this.f68923a = njaVar;
            this.f68924b = dy7Var;
        }

        @Override // p000.nja, p000.zye
        public boolean continueLoading(long j) {
            return this.f68923a.continueLoading(j);
        }

        @Override // p000.nja
        public void discardBuffer(long j, boolean z) {
            this.f68923a.discardBuffer(j, z);
        }

        @Override // p000.nja
        public long getAdjustedSeekPositionUs(long j, iue iueVar) {
            return this.f68923a.getAdjustedSeekPositionUs(j, iueVar);
        }

        @Override // p000.nja, p000.zye
        public long getBufferedPositionUs() {
            return this.f68923a.getBufferedPositionUs();
        }

        @Override // p000.nja, p000.zye
        public long getNextLoadPositionUs() {
            return this.f68923a.getNextLoadPositionUs();
        }

        @Override // p000.nja
        public List<StreamKey> getStreamKeys(List<pf5> list) {
            return this.f68923a.getStreamKeys(list);
        }

        @Override // p000.nja
        public m6h getTrackGroups() {
            return (m6h) u80.checkNotNull(this.f68926d);
        }

        @Override // p000.nja, p000.zye
        public boolean isLoading() {
            return this.f68923a.isLoading();
        }

        @Override // p000.nja
        public void maybeThrowPrepareError() throws IOException {
            this.f68923a.maybeThrowPrepareError();
        }

        @Override // p000.nja.InterfaceC9906a
        public void onPrepared(nja njaVar) {
            m6h trackGroups = njaVar.getTrackGroups();
            kx7.C8541a c8541aBuilder = kx7.builder();
            for (int i = 0; i < trackGroups.f60034a; i++) {
                g6h g6hVar = trackGroups.get(i);
                if (this.f68924b.contains(Integer.valueOf(g6hVar.f38909c))) {
                    c8541aBuilder.add(g6hVar);
                }
            }
            this.f68926d = new m6h((g6h[]) c8541aBuilder.build().toArray(new g6h[0]));
            ((nja.InterfaceC9906a) u80.checkNotNull(this.f68925c)).onPrepared(this);
        }

        @Override // p000.nja
        public void prepare(nja.InterfaceC9906a interfaceC9906a, long j) {
            this.f68925c = interfaceC9906a;
            this.f68923a.prepare(this, j);
        }

        @Override // p000.nja
        public long readDiscontinuity() {
            return this.f68923a.readDiscontinuity();
        }

        @Override // p000.nja, p000.zye
        public void reevaluateBuffer(long j) {
            this.f68923a.reevaluateBuffer(j);
        }

        @Override // p000.nja
        public long seekToUs(long j) {
            return this.f68923a.seekToUs(j);
        }

        @Override // p000.nja
        public long selectTracks(pf5[] pf5VarArr, boolean[] zArr, nle[] nleVarArr, boolean[] zArr2, long j) {
            return this.f68923a.selectTracks(pf5VarArr, zArr, nleVarArr, zArr2, j);
        }

        @Override // p000.zye.InterfaceC16321a
        public void onContinueLoadingRequested(nja njaVar) {
            ((nja.InterfaceC9906a) u80.checkNotNull(this.f68925c)).onContinueLoadingRequested(this);
        }
    }

    public ov5(vna vnaVar, int i) {
        this(vnaVar, dy7.m9576of(Integer.valueOf(i)));
    }

    @Override // p000.qri, p000.vna
    public nja createPeriod(vna.C14175b c14175b, InterfaceC6430gn interfaceC6430gn, long j) {
        return new C10664a(super.createPeriod(c14175b, interfaceC6430gn, j), this.f68922N);
    }

    @Override // p000.qri, p000.vna
    public void releasePeriod(nja njaVar) {
        super.releasePeriod(((C10664a) njaVar).f68923a);
    }

    public ov5(vna vnaVar, Set<Integer> set) {
        super(vnaVar);
        this.f68922N = dy7.copyOf((Collection) set);
    }
}
