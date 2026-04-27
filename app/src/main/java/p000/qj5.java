package p000;

import android.net.Uri;
import androidx.media3.common.C1213a;
import androidx.media3.exoplayer.C1233k;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p000.jj5;
import p000.mja;

/* JADX INFO: loaded from: classes3.dex */
public final class qj5 implements mja {

    /* JADX INFO: renamed from: C */
    public ja9<?> f74570C;

    /* JADX INFO: renamed from: a */
    public final Uri f74571a;

    /* JADX INFO: renamed from: b */
    public final jj5 f74572b;

    /* JADX INFO: renamed from: c */
    public final n6h f74573c;

    /* JADX INFO: renamed from: d */
    public final byte[] f74574d;

    /* JADX INFO: renamed from: e */
    public final AtomicBoolean f74575e;

    /* JADX INFO: renamed from: f */
    public final AtomicReference<Throwable> f74576f;

    /* JADX INFO: renamed from: m */
    public final ArrayList<C11493b> f74577m;

    /* JADX INFO: renamed from: qj5$a */
    public class C11492a implements c17<Object> {
        public C11492a() {
        }

        @Override // p000.c17
        public void onFailure(Throwable th) {
            qj5.this.f74576f.set(th);
        }

        @Override // p000.c17
        public void onSuccess(@hib Object obj) {
            qj5.this.f74575e.set(true);
        }
    }

    /* JADX INFO: renamed from: qj5$b */
    public final class C11493b implements mle {

        /* JADX INFO: renamed from: c */
        public static final int f74579c = 0;

        /* JADX INFO: renamed from: d */
        public static final int f74580d = 1;

        /* JADX INFO: renamed from: e */
        public static final int f74581e = 2;

        /* JADX INFO: renamed from: a */
        public int f74582a = 0;

        public C11493b() {
        }

        @Override // p000.mle
        public boolean isReady() {
            return qj5.this.f74575e.get();
        }

        @Override // p000.mle
        public void maybeThrowError() throws IOException {
            Throwable th = (Throwable) qj5.this.f74576f.get();
            if (th != null) {
                throw new IOException(th);
            }
        }

        @Override // p000.mle
        public int readData(oq6 oq6Var, rl3 rl3Var, int i) {
            int i2 = this.f74582a;
            if (i2 == 2) {
                rl3Var.addFlag(4);
                return -4;
            }
            if ((i & 2) != 0 || i2 == 0) {
                oq6Var.f68294b = qj5.this.f74573c.get(0).getFormat(0);
                this.f74582a = 1;
                return -5;
            }
            if (!qj5.this.f74575e.get()) {
                return -3;
            }
            int length = qj5.this.f74574d.length;
            rl3Var.addFlag(1);
            rl3Var.f78610f = 0L;
            if ((i & 4) == 0) {
                rl3Var.ensureSpaceForWrite(length);
                rl3Var.f78608d.put(qj5.this.f74574d, 0, length);
            }
            if ((i & 1) == 0) {
                this.f74582a = 2;
            }
            return -4;
        }

        public void reset() {
            if (this.f74582a == 2) {
                this.f74582a = 1;
            }
        }

        @Override // p000.mle
        public int skipData(long j) {
            return 0;
        }
    }

    public qj5(Uri uri, String str, jj5 jj5Var) {
        this.f74571a = uri;
        C1213a c1213aBuild = new C1213a.b().setSampleMimeType(str).build();
        this.f74572b = jj5Var;
        this.f74573c = new n6h(new h6h(c1213aBuild));
        this.f74574d = uri.toString().getBytes(StandardCharsets.UTF_8);
        this.f74575e = new AtomicBoolean();
        this.f74576f = new AtomicReference<>();
        this.f74577m = new ArrayList<>();
    }

    @Override // p000.mja, p000.yye
    public boolean continueLoading(C1233k c1233k) {
        return !this.f74575e.get();
    }

    @Override // p000.mja
    public void discardBuffer(long j, boolean z) {
    }

    @Override // p000.mja
    public long getAdjustedSeekPositionUs(long j, jue jueVar) {
        return j;
    }

    @Override // p000.mja, p000.yye
    public long getBufferedPositionUs() {
        return this.f74575e.get() ? Long.MIN_VALUE : 0L;
    }

    @Override // p000.mja, p000.yye
    public long getNextLoadPositionUs() {
        return this.f74575e.get() ? Long.MIN_VALUE : 0L;
    }

    @Override // p000.mja
    public n6h getTrackGroups() {
        return this.f74573c;
    }

    @Override // p000.mja, p000.yye
    public boolean isLoading() {
        return !this.f74575e.get();
    }

    @Override // p000.mja
    public void maybeThrowPrepareError() {
    }

    @Override // p000.mja
    public void prepare(mja.InterfaceC9368a interfaceC9368a, long j) {
        interfaceC9368a.onPrepared(this);
        ja9<?> ja9VarLoad = this.f74572b.load(new jj5.C7914a(this.f74571a));
        this.f74570C = ja9VarLoad;
        w17.addCallback(ja9VarLoad, new C11492a(), xya.directExecutor());
    }

    @Override // p000.mja
    public long readDiscontinuity() {
        return -9223372036854775807L;
    }

    @Override // p000.mja, p000.yye
    public void reevaluateBuffer(long j) {
    }

    public void releasePeriod() {
        ja9<?> ja9Var = this.f74570C;
        if (ja9Var != null) {
            ja9Var.cancel(false);
        }
    }

    @Override // p000.mja
    public long seekToUs(long j) {
        for (int i = 0; i < this.f74577m.size(); i++) {
            this.f74577m.get(i).reset();
        }
        return j;
    }

    @Override // p000.mja
    public long selectTracks(of5[] of5VarArr, boolean[] zArr, mle[] mleVarArr, boolean[] zArr2, long j) {
        for (int i = 0; i < of5VarArr.length; i++) {
            mle mleVar = mleVarArr[i];
            if (mleVar != null && (of5VarArr[i] == null || !zArr[i])) {
                this.f74577m.remove(mleVar);
                mleVarArr[i] = null;
            }
            if (mleVarArr[i] == null && of5VarArr[i] != null) {
                C11493b c11493b = new C11493b();
                this.f74577m.add(c11493b);
                mleVarArr[i] = c11493b;
                zArr2[i] = true;
            }
        }
        return j;
    }
}
