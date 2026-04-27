package p000;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class wza {

    /* JADX INFO: renamed from: a */
    public final long f95847a;

    /* JADX INFO: renamed from: b */
    public final List<C14849a> f95848b;

    /* JADX INFO: renamed from: wza$a */
    public static final class C14849a {

        /* JADX INFO: renamed from: a */
        public final String f95849a;

        /* JADX INFO: renamed from: b */
        public final String f95850b;

        /* JADX INFO: renamed from: c */
        public final long f95851c;

        /* JADX INFO: renamed from: d */
        public final long f95852d;

        public C14849a(String str, String str2, long j, long j2) {
            this.f95849a = str;
            this.f95850b = str2;
            this.f95851c = j;
            this.f95852d = j2;
        }
    }

    public wza(long j, List<C14849a> list) {
        this.f95847a = j;
        this.f95848b = list;
    }

    @hib
    public yza getMotionPhotoMetadata(long j) {
        long j2;
        if (this.f95848b.size() < 2) {
            return null;
        }
        long j3 = j;
        long j4 = -1;
        long j5 = -1;
        long j6 = -1;
        long j7 = -1;
        boolean z = false;
        for (int size = this.f95848b.size() - 1; size >= 0; size--) {
            C14849a c14849a = this.f95848b.get(size);
            boolean zEquals = "video/mp4".equals(c14849a.f95849a) | z;
            if (size == 0) {
                j3 -= c14849a.f95852d;
                j2 = 0;
            } else {
                j2 = j3 - c14849a.f95851c;
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
        return new yza(j4, j5, this.f95847a, j6, j7);
    }
}
