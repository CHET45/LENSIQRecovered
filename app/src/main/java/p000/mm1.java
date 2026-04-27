package p000;

import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class mm1 implements Comparable<mm1> {

    /* JADX INFO: renamed from: a */
    public final String f61456a;

    /* JADX INFO: renamed from: b */
    public final long f61457b;

    /* JADX INFO: renamed from: c */
    public final long f61458c;

    /* JADX INFO: renamed from: d */
    public final boolean f61459d;

    /* JADX INFO: renamed from: e */
    @hib
    public final File f61460e;

    /* JADX INFO: renamed from: f */
    public final long f61461f;

    public mm1(String str, long j, long j2) {
        this(str, j, j2, -9223372036854775807L, null);
    }

    public boolean isHoleSpan() {
        return !this.f61459d;
    }

    public boolean isOpenEnded() {
        return this.f61458c == -1;
    }

    public String toString() {
        return "[" + this.f61457b + ", " + this.f61458c + "]";
    }

    public mm1(String str, long j, long j2, long j3, @hib File file) {
        this.f61456a = str;
        this.f61457b = j;
        this.f61458c = j2;
        this.f61459d = file != null;
        this.f61460e = file;
        this.f61461f = j3;
    }

    @Override // java.lang.Comparable
    public int compareTo(mm1 mm1Var) {
        if (!this.f61456a.equals(mm1Var.f61456a)) {
            return this.f61456a.compareTo(mm1Var.f61456a);
        }
        long j = this.f61457b - mm1Var.f61457b;
        if (j == 0) {
            return 0;
        }
        return j < 0 ? -1 : 1;
    }
}
