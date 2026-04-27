package p000;

import androidx.media3.common.StreamKey;
import androidx.media3.exoplayer.C1233k;
import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import p000.kx7;
import p000.mja;
import p000.una;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public class nv5 extends rri {

    /* JADX INFO: renamed from: N */
    public final dy7<Integer> f65784N;

    /* JADX INFO: renamed from: nv5$a */
    public static final class C10073a implements mja, mja.InterfaceC9368a {

        /* JADX INFO: renamed from: a */
        public final mja f65785a;

        /* JADX INFO: renamed from: b */
        public final dy7<Integer> f65786b;

        /* JADX INFO: renamed from: c */
        @hib
        public mja.InterfaceC9368a f65787c;

        /* JADX INFO: renamed from: d */
        @hib
        public n6h f65788d;

        public C10073a(mja mjaVar, dy7<Integer> dy7Var) {
            this.f65785a = mjaVar;
            this.f65786b = dy7Var;
        }

        @Override // p000.mja, p000.yye
        public boolean continueLoading(C1233k c1233k) {
            return this.f65785a.continueLoading(c1233k);
        }

        @Override // p000.mja
        public void discardBuffer(long j, boolean z) {
            this.f65785a.discardBuffer(j, z);
        }

        @Override // p000.mja
        public long getAdjustedSeekPositionUs(long j, jue jueVar) {
            return this.f65785a.getAdjustedSeekPositionUs(j, jueVar);
        }

        @Override // p000.mja, p000.yye
        public long getBufferedPositionUs() {
            return this.f65785a.getBufferedPositionUs();
        }

        @Override // p000.mja, p000.yye
        public long getNextLoadPositionUs() {
            return this.f65785a.getNextLoadPositionUs();
        }

        @Override // p000.mja
        public List<StreamKey> getStreamKeys(List<of5> list) {
            return this.f65785a.getStreamKeys(list);
        }

        @Override // p000.mja
        public n6h getTrackGroups() {
            return (n6h) v80.checkNotNull(this.f65788d);
        }

        @Override // p000.mja, p000.yye
        public boolean isLoading() {
            return this.f65785a.isLoading();
        }

        @Override // p000.mja
        public void maybeThrowPrepareError() throws IOException {
            this.f65785a.maybeThrowPrepareError();
        }

        @Override // p000.mja.InterfaceC9368a
        public void onPrepared(mja mjaVar) {
            n6h trackGroups = mjaVar.getTrackGroups();
            kx7.C8541a c8541aBuilder = kx7.builder();
            for (int i = 0; i < trackGroups.f63418a; i++) {
                h6h h6hVar = trackGroups.get(i);
                if (this.f65786b.contains(Integer.valueOf(h6hVar.f42520c))) {
                    c8541aBuilder.add(h6hVar);
                }
            }
            this.f65788d = new n6h((h6h[]) c8541aBuilder.build().toArray(new h6h[0]));
            ((mja.InterfaceC9368a) v80.checkNotNull(this.f65787c)).onPrepared(this);
        }

        @Override // p000.mja
        public void prepare(mja.InterfaceC9368a interfaceC9368a, long j) {
            this.f65787c = interfaceC9368a;
            this.f65785a.prepare(this, j);
        }

        @Override // p000.mja
        public long readDiscontinuity() {
            return this.f65785a.readDiscontinuity();
        }

        @Override // p000.mja, p000.yye
        public void reevaluateBuffer(long j) {
            this.f65785a.reevaluateBuffer(j);
        }

        @Override // p000.mja
        public long seekToUs(long j) {
            return this.f65785a.seekToUs(j);
        }

        @Override // p000.mja
        public long selectTracks(of5[] of5VarArr, boolean[] zArr, mle[] mleVarArr, boolean[] zArr2, long j) {
            return this.f65785a.selectTracks(of5VarArr, zArr, mleVarArr, zArr2, j);
        }

        @Override // p000.yye.InterfaceC15893a
        public void onContinueLoadingRequested(mja mjaVar) {
            ((mja.InterfaceC9368a) v80.checkNotNull(this.f65787c)).onContinueLoadingRequested(this);
        }
    }

    public nv5(una unaVar, int i) {
        this(unaVar, dy7.m9576of(Integer.valueOf(i)));
    }

    @Override // p000.rri, p000.una
    public mja createPeriod(una.C13612b c13612b, InterfaceC5892fn interfaceC5892fn, long j) {
        return new C10073a(super.createPeriod(c13612b, interfaceC5892fn, j), this.f65784N);
    }

    @Override // p000.rri, p000.una
    public void releasePeriod(mja mjaVar) {
        super.releasePeriod(((C10073a) mjaVar).f65785a);
    }

    public nv5(una unaVar, Set<Integer> set) {
        super(unaVar);
        this.f65784N = dy7.copyOf((Collection) set);
    }
}
