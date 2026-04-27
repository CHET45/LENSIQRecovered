package p000;

import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import p000.v6c;

/* JADX INFO: loaded from: classes3.dex */
public class f6i<T> implements b6e<T, Bitmap> {

    /* JADX INFO: renamed from: d */
    public static final String f35534d = "VideoDecoder";

    /* JADX INFO: renamed from: e */
    public static final long f35535e = -1;

    /* JADX INFO: renamed from: f */
    @fdi
    public static final int f35536f = 2;

    /* JADX INFO: renamed from: g */
    public static final v6c<Long> f35537g = v6c.disk("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new C5644a());

    /* JADX INFO: renamed from: h */
    public static final v6c<Integer> f35538h = v6c.disk("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new C5645b());

    /* JADX INFO: renamed from: i */
    public static final C5648e f35539i = new C5648e();

    /* JADX INFO: renamed from: a */
    public final InterfaceC5649f<T> f35540a;

    /* JADX INFO: renamed from: b */
    public final e41 f35541b;

    /* JADX INFO: renamed from: c */
    public final C5648e f35542c;

    /* JADX INFO: renamed from: f6i$a */
    public class C5644a implements v6c.InterfaceC13888b<Long> {

        /* JADX INFO: renamed from: a */
        public final ByteBuffer f35543a = ByteBuffer.allocate(8);

        @Override // p000.v6c.InterfaceC13888b
        public void update(@efb byte[] bArr, @efb Long l, @efb MessageDigest messageDigest) {
            messageDigest.update(bArr);
            synchronized (this.f35543a) {
                this.f35543a.position(0);
                messageDigest.update(this.f35543a.putLong(l.longValue()).array());
            }
        }
    }

    /* JADX INFO: renamed from: f6i$b */
    public class C5645b implements v6c.InterfaceC13888b<Integer> {

        /* JADX INFO: renamed from: a */
        public final ByteBuffer f35544a = ByteBuffer.allocate(4);

        @Override // p000.v6c.InterfaceC13888b
        public void update(@efb byte[] bArr, @efb Integer num, @efb MessageDigest messageDigest) {
            if (num == null) {
                return;
            }
            messageDigest.update(bArr);
            synchronized (this.f35544a) {
                this.f35544a.position(0);
                messageDigest.update(this.f35544a.putInt(num.intValue()).array());
            }
        }
    }

    /* JADX INFO: renamed from: f6i$c */
    public static final class C5646c implements InterfaceC5649f<AssetFileDescriptor> {
        private C5646c() {
        }

        public /* synthetic */ C5646c(C5644a c5644a) {
            this();
        }

        @Override // p000.f6i.InterfaceC5649f
        public void initialize(MediaMetadataRetriever mediaMetadataRetriever, AssetFileDescriptor assetFileDescriptor) {
            mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }
    }

    /* JADX INFO: renamed from: f6i$d */
    @c5e(23)
    public static final class C5647d implements InterfaceC5649f<ByteBuffer> {

        /* JADX INFO: renamed from: f6i$d$a */
        public class a extends MediaDataSource {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ ByteBuffer f35545a;

            public a(ByteBuffer byteBuffer) {
                this.f35545a = byteBuffer;
            }

            @Override // java.io.Closeable, java.lang.AutoCloseable
            public void close() {
            }

            @Override // android.media.MediaDataSource
            public long getSize() {
                return this.f35545a.limit();
            }

            @Override // android.media.MediaDataSource
            public int readAt(long j, byte[] bArr, int i, int i2) {
                if (j >= this.f35545a.limit()) {
                    return -1;
                }
                this.f35545a.position((int) j);
                int iMin = Math.min(i2, this.f35545a.remaining());
                this.f35545a.get(bArr, i, iMin);
                return iMin;
            }
        }

        @Override // p000.f6i.InterfaceC5649f
        public void initialize(MediaMetadataRetriever mediaMetadataRetriever, ByteBuffer byteBuffer) {
            mediaMetadataRetriever.setDataSource(new a(byteBuffer));
        }
    }

    /* JADX INFO: renamed from: f6i$e */
    @fdi
    public static class C5648e {
        public MediaMetadataRetriever build() {
            return new MediaMetadataRetriever();
        }
    }

    /* JADX INFO: renamed from: f6i$f */
    @fdi
    public interface InterfaceC5649f<T> {
        void initialize(MediaMetadataRetriever mediaMetadataRetriever, T t);
    }

    /* JADX INFO: renamed from: f6i$g */
    public static final class C5650g implements InterfaceC5649f<ParcelFileDescriptor> {
        @Override // p000.f6i.InterfaceC5649f
        public void initialize(MediaMetadataRetriever mediaMetadataRetriever, ParcelFileDescriptor parcelFileDescriptor) {
            mediaMetadataRetriever.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }
    }

    /* JADX INFO: renamed from: f6i$h */
    public static final class C5651h extends RuntimeException {
        private static final long serialVersionUID = -2556382523004027815L;

        public C5651h() {
            super("MediaMetadataRetriever failed to retrieve a frame without throwing, check the adb logs for .*MetadataRetriever.* prior to this exception for details");
        }
    }

    public f6i(e41 e41Var, InterfaceC5649f<T> interfaceC5649f) {
        this(e41Var, interfaceC5649f, f35539i);
    }

    public static b6e<AssetFileDescriptor, Bitmap> asset(e41 e41Var) {
        return new f6i(e41Var, new C5646c(null));
    }

    @c5e(api = 23)
    public static b6e<ByteBuffer, Bitmap> byteBuffer(e41 e41Var) {
        return new f6i(e41Var, new C5647d());
    }

    @hib
    private static Bitmap decodeFrame(MediaMetadataRetriever mediaMetadataRetriever, long j, int i, int i2, int i3, hn4 hn4Var) {
        Bitmap bitmapDecodeScaledFrame = (Build.VERSION.SDK_INT < 27 || i2 == Integer.MIN_VALUE || i3 == Integer.MIN_VALUE || hn4Var == hn4.f44197f) ? null : decodeScaledFrame(mediaMetadataRetriever, j, i, i2, i3, hn4Var);
        if (bitmapDecodeScaledFrame == null) {
            bitmapDecodeScaledFrame = decodeOriginalFrame(mediaMetadataRetriever, j, i);
        }
        if (bitmapDecodeScaledFrame != null) {
            return bitmapDecodeScaledFrame;
        }
        throw new C5651h();
    }

    private static Bitmap decodeOriginalFrame(MediaMetadataRetriever mediaMetadataRetriever, long j, int i) {
        return mediaMetadataRetriever.getFrameAtTime(j, i);
    }

    @hib
    @omg(27)
    private static Bitmap decodeScaledFrame(MediaMetadataRetriever mediaMetadataRetriever, long j, int i, int i2, int i3, hn4 hn4Var) {
        try {
            int i4 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
            int i5 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
            int i6 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
            if (i6 == 90 || i6 == 270) {
                i5 = i4;
                i4 = i5;
            }
            float scaleFactor = hn4Var.getScaleFactor(i4, i5, i2, i3);
            return mediaMetadataRetriever.getScaledFrameAtTime(j, i, Math.round(i4 * scaleFactor), Math.round(scaleFactor * i5));
        } catch (Throwable unused) {
            Log.isLoggable(f35534d, 3);
            return null;
        }
    }

    public static b6e<ParcelFileDescriptor, Bitmap> parcel(e41 e41Var) {
        return new f6i(e41Var, new C5650g());
    }

    @Override // p000.b6e
    public t5e<Bitmap> decode(@efb T t, int i, int i2, @efb i7c i7cVar) throws IOException {
        long jLongValue = ((Long) i7cVar.get(f35537g)).longValue();
        if (jLongValue < 0 && jLongValue != -1) {
            throw new IllegalArgumentException("Requested frame must be non-negative, or DEFAULT_FRAME, given: " + jLongValue);
        }
        Integer num = (Integer) i7cVar.get(f35538h);
        if (num == null) {
            num = 2;
        }
        hn4 hn4Var = (hn4) i7cVar.get(hn4.f44199h);
        if (hn4Var == null) {
            hn4Var = hn4.f44198g;
        }
        hn4 hn4Var2 = hn4Var;
        MediaMetadataRetriever mediaMetadataRetrieverBuild = this.f35542c.build();
        try {
            this.f35540a.initialize(mediaMetadataRetrieverBuild, t);
            return i41.obtain(decodeFrame(mediaMetadataRetrieverBuild, jLongValue, num.intValue(), i, i2, hn4Var2), this.f35541b);
        } finally {
            if (Build.VERSION.SDK_INT >= 29) {
                mediaMetadataRetrieverBuild.release();
            } else {
                mediaMetadataRetrieverBuild.release();
            }
        }
    }

    @Override // p000.b6e
    public boolean handles(@efb T t, @efb i7c i7cVar) {
        return true;
    }

    @fdi
    public f6i(e41 e41Var, InterfaceC5649f<T> interfaceC5649f, C5648e c5648e) {
        this.f35541b = e41Var;
        this.f35540a = interfaceC5649f;
        this.f35542c = c5648e;
    }
}
