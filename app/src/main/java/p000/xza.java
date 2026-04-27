package p000;

import com.google.android.exoplayer2.metadata.mp4.MotionPhotoMetadata;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class xza {

    /* JADX INFO: renamed from: a */
    public final long f99779a;

    /* JADX INFO: renamed from: b */
    public final List<C15359a> f99780b;

    /* JADX INFO: renamed from: xza$a */
    public static final class C15359a {

        /* JADX INFO: renamed from: a */
        public final String f99781a;

        /* JADX INFO: renamed from: b */
        public final String f99782b;

        /* JADX INFO: renamed from: c */
        public final long f99783c;

        /* JADX INFO: renamed from: d */
        public final long f99784d;

        public C15359a(String str, String str2, long j, long j2) {
            this.f99781a = str;
            this.f99782b = str2;
            this.f99783c = j;
            this.f99784d = j2;
        }
    }

    public xza(long j, List<C15359a> list) {
        this.f99779a = j;
        this.f99780b = list;
    }

    @hib
    public MotionPhotoMetadata getMotionPhotoMetadata(long j) {
        long j2;
        if (this.f99780b.size() < 2) {
            return null;
        }
        long j3 = j;
        long j4 = -1;
        long j5 = -1;
        long j6 = -1;
        long j7 = -1;
        boolean z = false;
        for (int size = this.f99780b.size() - 1; size >= 0; size--) {
            C15359a c15359a = this.f99780b.get(size);
            boolean zEquals = "video/mp4".equals(c15359a.f99781a) | z;
            if (size == 0) {
                j3 -= c15359a.f99784d;
                j2 = 0;
            } else {
                j2 = j3 - c15359a.f99783c;
            }
            long j8 = j3;
            j3 = j2;
            if (!zEquals || j3 == j8) {
                z = zEquals;
            } else {
                j7 = j8 - j3;
                j6 = j3;
                z = false;
            }
            if (size == 0) {
                j4 = j3;
                j5 = j8;
            }
        }
        if (j6 == -1 || j7 == -1 || j4 == -1 || j5 == -1) {
            return null;
        }
        return new MotionPhotoMetadata(j4, j5, this.f99779a, j6, j7);
    }
}
