package p000;

import android.graphics.Bitmap;
import android.net.Uri;
import androidx.media3.common.C1213a;
import androidx.media3.exoplayer.InterfaceC1255s;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import p000.vs7;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class pj5 implements vs7 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC10983b f71072a;

    /* JADX INFO: renamed from: b */
    public final rl3 f71073b;

    /* JADX INFO: renamed from: c */
    public final pv7 f71074c;

    /* JADX INFO: renamed from: d */
    @hib
    public ja9<Bitmap> f71075d;

    /* JADX INFO: renamed from: e */
    public long f71076e;

    /* JADX INFO: renamed from: f */
    public boolean f71077f;

    /* JADX INFO: renamed from: pj5$a */
    public class C10982a extends pv7 {
        public C10982a() {
        }

        @Override // p000.tl3
        public void release() {
            clear();
        }
    }

    /* JADX INFO: renamed from: pj5$b */
    public interface InterfaceC10983b {
        ja9<Bitmap> resolve(C10984c c10984c);
    }

    /* JADX INFO: renamed from: pj5$c */
    public static final class C10984c {

        /* JADX INFO: renamed from: a */
        public final Uri f71079a;

        public C10984c(Uri uri) {
            this.f71079a = uri;
        }
    }

    /* JADX INFO: renamed from: pj5$d */
    public static final class C10985d implements vs7.InterfaceC14247a {

        /* JADX INFO: renamed from: b */
        public final InterfaceC10983b f71080b;

        public C10985d(InterfaceC10983b interfaceC10983b) {
            this.f71080b = interfaceC10983b;
        }

        @Override // p000.vs7.InterfaceC14247a
        public int supportsFormat(C1213a c1213a) {
            return InterfaceC1255s.create(Objects.equals(c1213a.f8291o, rva.f79796U0) ? 4 : rva.isImage(c1213a.f8291o) ? 1 : 0);
        }

        @Override // p000.vs7.InterfaceC14247a
        public pj5 createImageDecoder() {
            return new pj5(this.f71080b, null);
        }
    }

    public /* synthetic */ pj5(InterfaceC10983b interfaceC10983b, C10982a c10982a) {
        this(interfaceC10983b);
    }

    private void resetState() {
        ja9<Bitmap> ja9Var = this.f71075d;
        if (ja9Var != null) {
            ja9Var.cancel(false);
            this.f71075d = null;
        }
        this.f71077f = false;
        this.f71073b.clear();
        this.f71074c.release();
    }

    @Override // p000.kl3
    public void flush() {
        resetState();
    }

    @Override // p000.kl3
    public String getName() {
        return "externallyLoadedImageDecoder";
    }

    @Override // p000.kl3
    public void release() {
        resetState();
    }

    @Override // p000.kl3
    public void setOutputStartTimeUs(long j) {
    }

    private pj5(InterfaceC10983b interfaceC10983b) {
        this.f71072a = interfaceC10983b;
        this.f71073b = new rl3(1);
        this.f71074c = new C10982a();
    }

    @Override // p000.kl3
    @hib
    public rl3 dequeueInputBuffer() {
        if (this.f71075d == null) {
            return this.f71073b;
        }
        return null;
    }

    @Override // p000.vs7, p000.kl3
    @hib
    public pv7 dequeueOutputBuffer() throws ws7 {
        if (this.f71077f) {
            this.f71074c.addFlag(4);
            this.f71077f = false;
            return this.f71074c;
        }
        ja9<Bitmap> ja9Var = this.f71075d;
        if (ja9Var != null) {
            try {
                if (ja9Var.isDone()) {
                    try {
                        this.f71074c.f72210e = (Bitmap) w17.getDone(this.f71075d);
                        pv7 pv7Var = this.f71074c;
                        pv7Var.f85177b = this.f71076e;
                        return pv7Var;
                    } catch (CancellationException e) {
                        throw new ws7(e);
                    } catch (ExecutionException e2) {
                        throw new ws7(e2.getCause());
                    }
                }
            } finally {
                this.f71075d = null;
            }
        }
        return null;
    }

    @Override // p000.vs7, p000.kl3
    public void queueInputBuffer(rl3 rl3Var) {
        if (rl3Var.isEndOfStream()) {
            this.f71077f = true;
            rl3Var.clear();
            return;
        }
        ByteBuffer byteBuffer = (ByteBuffer) v80.checkNotNull(rl3Var.f78608d);
        v80.checkState(byteBuffer.hasArray());
        this.f71075d = this.f71072a.resolve(new C10984c(Uri.parse(new String(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.remaining(), StandardCharsets.UTF_8))));
        this.f71076e = rl3Var.f78610f;
        rl3Var.clear();
    }
}
