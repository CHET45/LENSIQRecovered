package p000;

import androidx.media3.exoplayer.C1233k;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import p000.kx7;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class xm2 implements yye {

    /* JADX INFO: renamed from: a */
    public final kx7<C15195a> f98490a;

    /* JADX INFO: renamed from: b */
    public long f98491b;

    /* JADX INFO: renamed from: xm2$a */
    public static final class C15195a implements yye {

        /* JADX INFO: renamed from: a */
        public final yye f98492a;

        /* JADX INFO: renamed from: b */
        public final kx7<Integer> f98493b;

        public C15195a(yye yyeVar, List<Integer> list) {
            this.f98492a = yyeVar;
            this.f98493b = kx7.copyOf((Collection) list);
        }

        @Override // p000.yye
        public boolean continueLoading(C1233k c1233k) {
            return this.f98492a.continueLoading(c1233k);
        }

        @Override // p000.yye
        public long getBufferedPositionUs() {
            return this.f98492a.getBufferedPositionUs();
        }

        @Override // p000.yye
        public long getNextLoadPositionUs() {
            return this.f98492a.getNextLoadPositionUs();
        }

        public kx7<Integer> getTrackTypes() {
            return this.f98493b;
        }

        @Override // p000.yye
        public boolean isLoading() {
            return this.f98492a.isLoading();
        }

        @Override // p000.yye
        public void reevaluateBuffer(long j) {
            this.f98492a.reevaluateBuffer(j);
        }
    }

    @Deprecated
    public xm2(yye[] yyeVarArr) {
        this(kx7.copyOf(yyeVarArr), Collections.nCopies(yyeVarArr.length, kx7.m15111of(-1)));
    }

    @Override // p000.yye
    public boolean continueLoading(C1233k c1233k) {
        boolean zContinueLoading;
        boolean z = false;
        do {
            long nextLoadPositionUs = getNextLoadPositionUs();
            if (nextLoadPositionUs == Long.MIN_VALUE) {
                break;
            }
            zContinueLoading = false;
            for (int i = 0; i < this.f98490a.size(); i++) {
                long nextLoadPositionUs2 = this.f98490a.get(i).getNextLoadPositionUs();
                boolean z2 = nextLoadPositionUs2 != Long.MIN_VALUE && nextLoadPositionUs2 <= c1233k.f8755a;
                if (nextLoadPositionUs2 == nextLoadPositionUs || z2) {
                    zContinueLoading |= this.f98490a.get(i).continueLoading(c1233k);
                }
            }
            z |= zContinueLoading;
        } while (zContinueLoading);
        return z;
    }

    @Override // p000.yye
    public long getBufferedPositionUs() {
        long jMin = Long.MAX_VALUE;
        long jMin2 = Long.MAX_VALUE;
        for (int i = 0; i < this.f98490a.size(); i++) {
            C15195a c15195a = this.f98490a.get(i);
            long bufferedPositionUs = c15195a.getBufferedPositionUs();
            if ((c15195a.getTrackTypes().contains(1) || c15195a.getTrackTypes().contains(2) || c15195a.getTrackTypes().contains(4)) && bufferedPositionUs != Long.MIN_VALUE) {
                jMin = Math.min(jMin, bufferedPositionUs);
            }
            if (bufferedPositionUs != Long.MIN_VALUE) {
                jMin2 = Math.min(jMin2, bufferedPositionUs);
            }
        }
        if (jMin != Long.MAX_VALUE) {
            this.f98491b = jMin;
            return jMin;
        }
        if (jMin2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j = this.f98491b;
        return j != -9223372036854775807L ? j : jMin2;
    }

    @Override // p000.yye
    public long getNextLoadPositionUs() {
        long jMin = Long.MAX_VALUE;
        for (int i = 0; i < this.f98490a.size(); i++) {
            long nextLoadPositionUs = this.f98490a.get(i).getNextLoadPositionUs();
            if (nextLoadPositionUs != Long.MIN_VALUE) {
                jMin = Math.min(jMin, nextLoadPositionUs);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // p000.yye
    public boolean isLoading() {
        for (int i = 0; i < this.f98490a.size(); i++) {
            if (this.f98490a.get(i).isLoading()) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.yye
    public void reevaluateBuffer(long j) {
        for (int i = 0; i < this.f98490a.size(); i++) {
            this.f98490a.get(i).reevaluateBuffer(j);
        }
    }

    public xm2(List<? extends yye> list, List<List<Integer>> list2) {
        kx7.C8541a c8541aBuilder = kx7.builder();
        v80.checkArgument(list.size() == list2.size());
        for (int i = 0; i < list.size(); i++) {
            c8541aBuilder.add(new C15195a(list.get(i), list2.get(i)));
        }
        this.f98490a = c8541aBuilder.build();
        this.f98491b = -9223372036854775807L;
    }
}
