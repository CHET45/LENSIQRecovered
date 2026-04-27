package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import androidx.media3.common.C1213a;
import androidx.media3.exoplayer.InterfaceC1255s;
import java.io.IOException;
import java.nio.ByteBuffer;
import p000.vs7;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class u31 extends iif<rl3, pv7, ws7> implements vs7 {

    /* JADX INFO: renamed from: o */
    @hib
    public final Context f86699o;

    /* JADX INFO: renamed from: p */
    @hib
    public final InterfaceC13345b f86700p;

    /* JADX INFO: renamed from: q */
    public final int f86701q;

    /* JADX INFO: renamed from: u31$a */
    public class C13344a extends pv7 {
        public C13344a() {
        }

        @Override // p000.tl3
        public void release() {
            u31.this.m13125g(this);
        }
    }

    /* JADX INFO: renamed from: u31$b */
    @fdi
    @Deprecated
    public interface InterfaceC13345b {
        Bitmap decode(byte[] bArr, int i) throws ws7;
    }

    /* JADX INFO: renamed from: u31$c */
    public static final class C13346c implements vs7.InterfaceC14247a {

        /* JADX INFO: renamed from: b */
        @hib
        public final Context f86703b;

        /* JADX INFO: renamed from: c */
        @hib
        public final InterfaceC13345b f86704c;

        /* JADX INFO: renamed from: d */
        public int f86705d;

        @Deprecated
        public C13346c() {
            this(null, null);
        }

        @op1
        public C13346c setMaxOutputSize(int i) {
            v80.checkArgument(i == -1 || i > 0);
            this.f86705d = i;
            return this;
        }

        @Override // p000.vs7.InterfaceC14247a
        public int supportsFormat(C1213a c1213a) {
            String str = c1213a.f8291o;
            return (str == null || !rva.isImage(str)) ? InterfaceC1255s.create(0) : t0i.isBitmapFactorySupportedMimeType(c1213a.f8291o) ? InterfaceC1255s.create(4) : InterfaceC1255s.create(1);
        }

        public C13346c(Context context) {
            this(context, null);
        }

        @Override // p000.vs7.InterfaceC14247a
        public u31 createImageDecoder() {
            return new u31(this.f86703b, this.f86704c, this.f86705d, null);
        }

        @Deprecated
        public C13346c(InterfaceC13345b interfaceC13345b) {
            this(null, interfaceC13345b);
        }

        private C13346c(@hib Context context, @hib InterfaceC13345b interfaceC13345b) {
            this.f86703b = context;
            this.f86704c = interfaceC13345b;
            this.f86705d = -1;
        }
    }

    public /* synthetic */ u31(Context context, InterfaceC13345b interfaceC13345b, int i, C13344a c13344a) {
        this(context, interfaceC13345b, i);
    }

    @Override // p000.iif
    /* JADX INFO: renamed from: b */
    public rl3 mo10081b() {
        return new rl3(1);
    }

    @Override // p000.iif, p000.kl3
    @hib
    public /* bridge */ /* synthetic */ pv7 dequeueOutputBuffer() throws ws7 {
        return (pv7) super.dequeueOutputBuffer();
    }

    @Override // p000.kl3
    public String getName() {
        return "BitmapFactoryImageDecoder";
    }

    @Override // p000.iif
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public pv7 mo10082c() {
        return new C13344a();
    }

    @Override // p000.iif
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public ws7 mo10083d(Throwable th) {
        return new ws7("Unexpected decode error", th);
    }

    @Override // p000.iif
    @hib
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public ws7 mo10084e(rl3 rl3Var, pv7 pv7Var, boolean z) {
        ByteBuffer byteBuffer = (ByteBuffer) v80.checkNotNull(rl3Var.f78608d);
        v80.checkState(byteBuffer.hasArray());
        v80.checkArgument(byteBuffer.arrayOffset() == 0);
        InterfaceC13345b interfaceC13345b = this.f86700p;
        if (interfaceC13345b != null) {
            try {
                pv7Var.f72210e = interfaceC13345b.decode(byteBuffer.array(), byteBuffer.remaining());
            } catch (ws7 e) {
                return e;
            }
        } else {
            try {
                int iMax = this.f86701q;
                if (iMax == -1) {
                    Context context = this.f86699o;
                    if (context != null) {
                        Point currentDisplayModeSize = t0i.getCurrentDisplayModeSize(context);
                        int i = currentDisplayModeSize.x;
                        int i2 = currentDisplayModeSize.y;
                        C1213a c1213a = rl3Var.f78606b;
                        if (c1213a != null) {
                            int i3 = c1213a.f8273N;
                            if (i3 != -1) {
                                i *= i3;
                            }
                            int i4 = c1213a.f8274O;
                            if (i4 != -1) {
                                i2 *= i4;
                            }
                        }
                        iMax = (Math.max(i, i2) * 2) - 1;
                    } else {
                        iMax = 4096;
                    }
                }
                pv7Var.f72210e = o41.decode(byteBuffer.array(), byteBuffer.remaining(), null, iMax);
            } catch (yhc e2) {
                return new ws7("Could not decode image data with BitmapFactory.", e2);
            } catch (IOException e3) {
                return new ws7(e3);
            }
        }
        pv7Var.f85177b = rl3Var.f78610f;
        return null;
    }

    private u31(@hib Context context, @hib InterfaceC13345b interfaceC13345b, int i) {
        super(new rl3[1], new pv7[1]);
        this.f86699o = context;
        this.f86700p = interfaceC13345b;
        this.f86701q = i;
    }
}
