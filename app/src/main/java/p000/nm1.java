package p000;

import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public class nm1 implements Comparable<nm1> {

    /* JADX INFO: renamed from: a */
    public final String f64969a;

    /* JADX INFO: renamed from: b */
    public final long f64970b;

    /* JADX INFO: renamed from: c */
    public final long f64971c;

    /* JADX INFO: renamed from: d */
    public final boolean f64972d;

    /* JADX INFO: renamed from: e */
    @hib
    public final File f64973e;

    /* JADX INFO: renamed from: f */
    public final long f64974f;

    public nm1(String str, long j, long j2) {
        this(str, j, j2, -9223372036854775807L, null);
    }

    public boolean isHoleSpan() {
        return !this.f64972d;
    }

    public boolean isOpenEnded() {
        return this.f64971c == -1;
    }

    public String toString() {
        return "[" + this.f64970b + ", " + this.f64971c + "]";
    }

    public nm1(String str, long j, long j2, long j3, @hib File file) {
        this.f64969a = str;
        this.f64970b = j;
        this.f64971c = j2;
        this.f64972d = file != null;
        this.f64973e = file;
        this.f64974f = j3;
    }

    @Override // java.lang.Comparable
    public int compareTo(nm1 nm1Var) {
        if (!this.f64969a.equals(nm1Var.f64969a)) {
            return this.f64969a.compareTo(nm1Var.f64969a);
        }
        long j = this.f64970b - nm1Var.f64970b;
        if (j == 0) {
            return 0;
        }
        return j < 0 ? -1 : 1;
    }
}
