package p000;

import java.util.ArrayList;
import java.util.List;
import p000.kx7;

/* JADX INFO: loaded from: classes3.dex */
public final class vra implements aa3 {

    /* JADX INFO: renamed from: b */
    public static final s7c<ba3> f92072b = s7c.natural().onResultOf(new lz6() { // from class: tra
        @Override // p000.lz6
        public final Object apply(Object obj) {
            return vra.lambda$static$0((ba3) obj);
        }
    }).compound(s7c.natural().reverse().onResultOf(new lz6() { // from class: ura
        @Override // p000.lz6
        public final Object apply(Object obj) {
            return vra.lambda$static$1((ba3) obj);
        }
    }));

    /* JADX INFO: renamed from: a */
    public final List<ba3> f92073a = new ArrayList();

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Long lambda$static$0(ba3 ba3Var) {
        return Long.valueOf(ba3Var.f13112b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Long lambda$static$1(ba3 ba3Var) {
        return Long.valueOf(ba3Var.f13113c);
    }

    @Override // p000.aa3
    public boolean addCues(ba3 ba3Var, long j) {
        v80.checkArgument(ba3Var.f13112b != -9223372036854775807L);
        v80.checkArgument(ba3Var.f13113c != -9223372036854775807L);
        boolean z = ba3Var.f13112b <= j && j < ba3Var.f13114d;
        for (int size = this.f92073a.size() - 1; size >= 0; size--) {
            if (ba3Var.f13112b >= this.f92073a.get(size).f13112b) {
                this.f92073a.add(size + 1, ba3Var);
                return z;
            }
        }
        this.f92073a.add(0, ba3Var);
        return z;
    }

    @Override // p000.aa3
    public void clear() {
        this.f92073a.clear();
    }

    @Override // p000.aa3
    public void discardCuesBeforeTimeUs(long j) {
        int i = 0;
        while (i < this.f92073a.size()) {
            long j2 = this.f92073a.get(i).f13112b;
            if (j > j2 && j > this.f92073a.get(i).f13114d) {
                this.f92073a.remove(i);
                i--;
            } else if (j < j2) {
                return;
            }
            i++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.aa3
    public kx7<n93> getCuesAtTimeUs(long j) {
        if (!this.f92073a.isEmpty()) {
            if (j >= this.f92073a.get(0).f13112b) {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < this.f92073a.size(); i++) {
                    ba3 ba3Var = this.f92073a.get(i);
                    if (j >= ba3Var.f13112b && j < ba3Var.f13114d) {
                        arrayList.add(ba3Var);
                    }
                    if (j < ba3Var.f13112b) {
                        break;
                    }
                }
                kx7 kx7VarSortedCopyOf = kx7.sortedCopyOf(f92072b, arrayList);
                kx7.C8541a c8541aBuilder = kx7.builder();
                for (int i2 = 0; i2 < kx7VarSortedCopyOf.size(); i2++) {
                    c8541aBuilder.addAll((Iterable) ((ba3) kx7VarSortedCopyOf.get(i2)).f13111a);
                }
                return c8541aBuilder.build();
            }
        }
        return kx7.m15110of();
    }

    @Override // p000.aa3
    public long getNextCueChangeTimeUs(long j) {
        int i = 0;
        long jMin = -9223372036854775807L;
        while (true) {
            if (i >= this.f92073a.size()) {
                break;
            }
            long j2 = this.f92073a.get(i).f13112b;
            long j3 = this.f92073a.get(i).f13114d;
            if (j < j2) {
                jMin = jMin == -9223372036854775807L ? j2 : Math.min(jMin, j2);
            } else {
                if (j < j3) {
                    jMin = jMin == -9223372036854775807L ? j3 : Math.min(jMin, j3);
                }
                i++;
            }
        }
        if (jMin != -9223372036854775807L) {
            return jMin;
        }
        return Long.MIN_VALUE;
    }

    @Override // p000.aa3
    public long getPreviousCueChangeTimeUs(long j) {
        if (this.f92073a.isEmpty()) {
            return -9223372036854775807L;
        }
        if (j < this.f92073a.get(0).f13112b) {
            return -9223372036854775807L;
        }
        long jMax = this.f92073a.get(0).f13112b;
        for (int i = 0; i < this.f92073a.size(); i++) {
            long j2 = this.f92073a.get(i).f13112b;
            long j3 = this.f92073a.get(i).f13114d;
            if (j3 > j) {
                if (j2 > j) {
                    break;
                }
                jMax = Math.max(jMax, j2);
            } else {
                jMax = Math.max(jMax, j3);
            }
        }
        return jMax;
    }
}
