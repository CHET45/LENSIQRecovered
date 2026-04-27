package p000;

import androidx.media3.common.C1213a;
import java.io.IOException;
import p000.hz1;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public class ev2 extends yr0 {

    /* JADX INFO: renamed from: o */
    public final int f34113o;

    /* JADX INFO: renamed from: p */
    public final long f34114p;

    /* JADX INFO: renamed from: q */
    public final hz1 f34115q;

    /* JADX INFO: renamed from: r */
    public long f34116r;

    /* JADX INFO: renamed from: s */
    public volatile boolean f34117s;

    /* JADX INFO: renamed from: t */
    public boolean f34118t;

    public ev2(gh3 gh3Var, xh3 xh3Var, C1213a c1213a, int i, @hib Object obj, long j, long j2, long j3, long j4, long j5, int i2, long j6, hz1 hz1Var) {
        super(gh3Var, xh3Var, c1213a, i, obj, j, j2, j3, j4, j5);
        this.f34113o = i2;
        this.f34114p = j6;
        this.f34115q = hz1Var;
    }

    private void maybeWriteEmptySamples(cs0 cs0Var) {
        if (rva.isImage(this.f41845d.f8290n)) {
            C1213a c1213a = this.f41845d;
            int i = c1213a.f8273N;
            if ((i <= 1 && c1213a.f8274O <= 1) || i == -1 || c1213a.f8274O == -1) {
                return;
            }
            q6h q6hVarTrack = cs0Var.track(0, 4);
            C1213a c1213a2 = this.f41845d;
            int i2 = c1213a2.f8274O * c1213a2.f8273N;
            long j = (this.f41849h - this.f41848g) / ((long) i2);
            for (int i3 = 1; i3 < i2; i3++) {
                q6hVarTrack.sampleData(new jhc(), 0);
                q6hVarTrack.sampleMetadata(((long) i3) * j, 0, 0, 0, null);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public hz1.InterfaceC7086b m10239b(cs0 cs0Var) {
        return cs0Var;
    }

    @vp6
    /* JADX INFO: renamed from: c */
    public void m10240c() {
    }

    @Override // p000.uc9.InterfaceC13493e
    public final void cancelLoad() {
        this.f34117s = true;
    }

    @Override // p000.yca
    public long getNextChunkIndex() {
        return this.f101115j + ((long) this.f34113o);
    }

    public final long getNextLoadPosition() {
        return this.f34116r;
    }

    public final boolean isLoadCanceled() {
        return this.f34117s;
    }

    @Override // p000.yca
    public boolean isLoadCompleted() {
        return this.f34118t;
    }

    @Override // p000.uc9.InterfaceC13493e
    public final void load() throws IOException {
        cs0 cs0VarM26305a = m26305a();
        if (this.f34116r == 0) {
            cs0VarM26305a.setSampleOffsetUs(this.f34114p);
            hz1 hz1Var = this.f34115q;
            hz1.InterfaceC7086b interfaceC7086bM10239b = m10239b(cs0VarM26305a);
            long j = this.f102719k;
            long j2 = j == -9223372036854775807L ? -9223372036854775807L : j - this.f34114p;
            long j3 = this.f102720l;
            hz1Var.init(interfaceC7086bM10239b, j2, j3 == -9223372036854775807L ? -9223372036854775807L : j3 - this.f34114p);
        }
        try {
            xh3 xh3VarSubrange = this.f41843b.subrange(this.f34116r);
            j4g j4gVar = this.f41850i;
            xu3 xu3Var = new xu3(j4gVar, xh3VarSubrange.f97806g, j4gVar.open(xh3VarSubrange));
            do {
                try {
                    if (this.f34117s) {
                        break;
                    }
                } finally {
                    this.f34116r = xu3Var.getPosition() - this.f41843b.f97806g;
                }
            } while (this.f34115q.read(xu3Var));
            maybeWriteEmptySamples(cs0VarM26305a);
            this.f34116r = xu3Var.getPosition() - this.f41843b.f97806g;
            m10240c();
            wh3.closeQuietly(this.f41850i);
            this.f34118t = !this.f34117s;
        } catch (Throwable th) {
            m10240c();
            wh3.closeQuietly(this.f41850i);
            throw th;
        }
    }
}
