package p000;

import java.io.File;
import java.util.ArrayList;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes3.dex */
public final class sm1 {

    /* JADX INFO: renamed from: f */
    public static final String f82209f = "CachedContent";

    /* JADX INFO: renamed from: a */
    public final int f82210a;

    /* JADX INFO: renamed from: b */
    public final String f82211b;

    /* JADX INFO: renamed from: c */
    public final TreeSet<eif> f82212c;

    /* JADX INFO: renamed from: d */
    public final ArrayList<C12655a> f82213d;

    /* JADX INFO: renamed from: e */
    public lt3 f82214e;

    /* JADX INFO: renamed from: sm1$a */
    public static final class C12655a {

        /* JADX INFO: renamed from: a */
        public final long f82215a;

        /* JADX INFO: renamed from: b */
        public final long f82216b;

        public C12655a(long j, long j2) {
            this.f82215a = j;
            this.f82216b = j2;
        }

        public boolean contains(long j, long j2) {
            long j3 = this.f82216b;
            if (j3 == -1) {
                return j >= this.f82215a;
            }
            if (j2 == -1) {
                return false;
            }
            long j4 = this.f82215a;
            return j4 <= j && j + j2 <= j4 + j3;
        }

        public boolean intersects(long j, long j2) {
            long j3 = this.f82215a;
            if (j3 > j) {
                return j2 == -1 || j + j2 > j3;
            }
            long j4 = this.f82216b;
            return j4 == -1 || j3 + j4 > j;
        }
    }

    public sm1(int i, String str) {
        this(i, str, lt3.f58675f);
    }

    public void addSpan(eif eifVar) {
        this.f82212c.add(eifVar);
    }

    public boolean applyMetadataMutations(rw2 rw2Var) {
        this.f82214e = this.f82214e.copyWithMutationsApplied(rw2Var);
        return !r2.equals(r0);
    }

    public boolean equals(@hib Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || sm1.class != obj.getClass()) {
            return false;
        }
        sm1 sm1Var = (sm1) obj;
        return this.f82210a == sm1Var.f82210a && this.f82211b.equals(sm1Var.f82211b) && this.f82212c.equals(sm1Var.f82212c) && this.f82214e.equals(sm1Var.f82214e);
    }

    public long getCachedBytesLength(long j, long j2) {
        v80.checkArgument(j >= 0);
        v80.checkArgument(j2 >= 0);
        eif span = getSpan(j, j2);
        if (span.isHoleSpan()) {
            return -Math.min(span.isOpenEnded() ? Long.MAX_VALUE : span.f64971c, j2);
        }
        long j3 = j + j2;
        long j4 = j3 >= 0 ? j3 : Long.MAX_VALUE;
        long jMax = span.f64970b + span.f64971c;
        if (jMax < j4) {
            for (eif eifVar : this.f82212c.tailSet(span, false)) {
                long j5 = eifVar.f64970b;
                if (j5 > jMax) {
                    break;
                }
                jMax = Math.max(jMax, j5 + eifVar.f64971c);
                if (jMax >= j4) {
                    break;
                }
            }
        }
        return Math.min(jMax - j, j2);
    }

    public lt3 getMetadata() {
        return this.f82214e;
    }

    public eif getSpan(long j, long j2) {
        eif eifVarCreateLookup = eif.createLookup(this.f82211b, j);
        eif eifVarFloor = this.f82212c.floor(eifVarCreateLookup);
        if (eifVarFloor != null && eifVarFloor.f64970b + eifVarFloor.f64971c > j) {
            return eifVarFloor;
        }
        eif eifVarCeiling = this.f82212c.ceiling(eifVarCreateLookup);
        if (eifVarCeiling != null) {
            long j3 = eifVarCeiling.f64970b - j;
            j2 = j2 == -1 ? j3 : Math.min(j3, j2);
        }
        return eif.createHole(this.f82211b, j, j2);
    }

    public TreeSet<eif> getSpans() {
        return this.f82212c;
    }

    public int hashCode() {
        return (((this.f82210a * 31) + this.f82211b.hashCode()) * 31) + this.f82214e.hashCode();
    }

    public boolean isEmpty() {
        return this.f82212c.isEmpty();
    }

    public boolean isFullyLocked(long j, long j2) {
        for (int i = 0; i < this.f82213d.size(); i++) {
            if (this.f82213d.get(i).contains(j, j2)) {
                return true;
            }
        }
        return false;
    }

    public boolean isFullyUnlocked() {
        return this.f82213d.isEmpty();
    }

    public boolean lockRange(long j, long j2) {
        for (int i = 0; i < this.f82213d.size(); i++) {
            if (this.f82213d.get(i).intersects(j, j2)) {
                return false;
            }
        }
        this.f82213d.add(new C12655a(j, j2));
        return true;
    }

    public boolean removeSpan(nm1 nm1Var) {
        if (!this.f82212c.remove(nm1Var)) {
            return false;
        }
        File file = nm1Var.f64973e;
        if (file == null) {
            return true;
        }
        file.delete();
        return true;
    }

    public eif setLastTouchTimestamp(eif eifVar, long j, boolean z) {
        v80.checkState(this.f82212c.remove(eifVar));
        File file = (File) v80.checkNotNull(eifVar.f64973e);
        if (z) {
            File cacheFile = eif.getCacheFile((File) v80.checkNotNull(file.getParentFile()), this.f82210a, eifVar.f64970b, j);
            if (file.renameTo(cacheFile)) {
                file = cacheFile;
            } else {
                xh9.m25148w("CachedContent", "Failed to rename " + file + " to " + cacheFile);
            }
        }
        eif eifVarCopyWithFileAndLastTouchTimestamp = eifVar.copyWithFileAndLastTouchTimestamp(file, j);
        this.f82212c.add(eifVarCopyWithFileAndLastTouchTimestamp);
        return eifVarCopyWithFileAndLastTouchTimestamp;
    }

    public void unlockRange(long j) {
        for (int i = 0; i < this.f82213d.size(); i++) {
            if (this.f82213d.get(i).f82215a == j) {
                this.f82213d.remove(i);
                return;
            }
        }
        throw new IllegalStateException();
    }

    public sm1(int i, String str, lt3 lt3Var) {
        this.f82210a = i;
        this.f82211b = str;
        this.f82214e = lt3Var;
        this.f82212c = new TreeSet<>();
        this.f82213d = new ArrayList<>();
    }
}
