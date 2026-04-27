package p000;

import java.io.File;
import java.util.ArrayList;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class tm1 {

    /* JADX INFO: renamed from: f */
    public static final String f85296f = "CachedContent";

    /* JADX INFO: renamed from: a */
    public final int f85297a;

    /* JADX INFO: renamed from: b */
    public final String f85298b;

    /* JADX INFO: renamed from: c */
    public final TreeSet<dif> f85299c;

    /* JADX INFO: renamed from: d */
    public final ArrayList<C13102a> f85300d;

    /* JADX INFO: renamed from: e */
    public kt3 f85301e;

    /* JADX INFO: renamed from: tm1$a */
    public static final class C13102a {

        /* JADX INFO: renamed from: a */
        public final long f85302a;

        /* JADX INFO: renamed from: b */
        public final long f85303b;

        public C13102a(long j, long j2) {
            this.f85302a = j;
            this.f85303b = j2;
        }

        public boolean contains(long j, long j2) {
            long j3 = this.f85303b;
            if (j3 == -1) {
                return j >= this.f85302a;
            }
            if (j2 == -1) {
                return false;
            }
            long j4 = this.f85302a;
            return j4 <= j && j + j2 <= j4 + j3;
        }

        public boolean intersects(long j, long j2) {
            long j3 = this.f85302a;
            if (j3 > j) {
                return j2 == -1 || j + j2 > j3;
            }
            long j4 = this.f85303b;
            return j4 == -1 || j3 + j4 > j;
        }
    }

    public tm1(int i, String str) {
        this(i, str, kt3.f55283f);
    }

    public void addSpan(dif difVar) {
        this.f85299c.add(difVar);
    }

    public boolean applyMetadataMutations(qw2 qw2Var) {
        this.f85301e = this.f85301e.copyWithMutationsApplied(qw2Var);
        return !r2.equals(r0);
    }

    public boolean equals(@hib Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || tm1.class != obj.getClass()) {
            return false;
        }
        tm1 tm1Var = (tm1) obj;
        return this.f85297a == tm1Var.f85297a && this.f85298b.equals(tm1Var.f85298b) && this.f85299c.equals(tm1Var.f85299c) && this.f85301e.equals(tm1Var.f85301e);
    }

    public long getCachedBytesLength(long j, long j2) {
        u80.checkArgument(j >= 0);
        u80.checkArgument(j2 >= 0);
        dif span = getSpan(j, j2);
        if (span.isHoleSpan()) {
            return -Math.min(span.isOpenEnded() ? Long.MAX_VALUE : span.f61458c, j2);
        }
        long j3 = j + j2;
        long j4 = j3 >= 0 ? j3 : Long.MAX_VALUE;
        long jMax = span.f61457b + span.f61458c;
        if (jMax < j4) {
            for (dif difVar : this.f85299c.tailSet(span, false)) {
                long j5 = difVar.f61457b;
                if (j5 > jMax) {
                    break;
                }
                jMax = Math.max(jMax, j5 + difVar.f61458c);
                if (jMax >= j4) {
                    break;
                }
            }
        }
        return Math.min(jMax - j, j2);
    }

    public kt3 getMetadata() {
        return this.f85301e;
    }

    public dif getSpan(long j, long j2) {
        dif difVarCreateLookup = dif.createLookup(this.f85298b, j);
        dif difVarFloor = this.f85299c.floor(difVarCreateLookup);
        if (difVarFloor != null && difVarFloor.f61457b + difVarFloor.f61458c > j) {
            return difVarFloor;
        }
        dif difVarCeiling = this.f85299c.ceiling(difVarCreateLookup);
        if (difVarCeiling != null) {
            long j3 = difVarCeiling.f61457b - j;
            j2 = j2 == -1 ? j3 : Math.min(j3, j2);
        }
        return dif.createHole(this.f85298b, j, j2);
    }

    public TreeSet<dif> getSpans() {
        return this.f85299c;
    }

    public int hashCode() {
        return (((this.f85297a * 31) + this.f85298b.hashCode()) * 31) + this.f85301e.hashCode();
    }

    public boolean isEmpty() {
        return this.f85299c.isEmpty();
    }

    public boolean isFullyLocked(long j, long j2) {
        for (int i = 0; i < this.f85300d.size(); i++) {
            if (this.f85300d.get(i).contains(j, j2)) {
                return true;
            }
        }
        return false;
    }

    public boolean isFullyUnlocked() {
        return this.f85300d.isEmpty();
    }

    public boolean lockRange(long j, long j2) {
        for (int i = 0; i < this.f85300d.size(); i++) {
            if (this.f85300d.get(i).intersects(j, j2)) {
                return false;
            }
        }
        this.f85300d.add(new C13102a(j, j2));
        return true;
    }

    public boolean removeSpan(mm1 mm1Var) {
        if (!this.f85299c.remove(mm1Var)) {
            return false;
        }
        File file = mm1Var.f61460e;
        if (file == null) {
            return true;
        }
        file.delete();
        return true;
    }

    public dif setLastTouchTimestamp(dif difVar, long j, boolean z) {
        u80.checkState(this.f85299c.remove(difVar));
        File file = (File) u80.checkNotNull(difVar.f61460e);
        if (z) {
            File cacheFile = dif.getCacheFile((File) u80.checkNotNull(file.getParentFile()), this.f85297a, difVar.f61457b, j);
            if (file.renameTo(cacheFile)) {
                file = cacheFile;
            } else {
                yh9.m25919w("CachedContent", "Failed to rename " + file + " to " + cacheFile);
            }
        }
        dif difVarCopyWithFileAndLastTouchTimestamp = difVar.copyWithFileAndLastTouchTimestamp(file, j);
        this.f85299c.add(difVarCopyWithFileAndLastTouchTimestamp);
        return difVarCopyWithFileAndLastTouchTimestamp;
    }

    public void unlockRange(long j) {
        for (int i = 0; i < this.f85300d.size(); i++) {
            if (this.f85300d.get(i).f85302a == j) {
                this.f85300d.remove(i);
                return;
            }
        }
        throw new IllegalStateException();
    }

    public tm1(int i, String str, kt3 kt3Var) {
        this.f85297a = i;
        this.f85298b = str;
        this.f85301e = kt3Var;
        this.f85299c = new TreeSet<>();
        this.f85300d = new ArrayList<>();
    }
}
