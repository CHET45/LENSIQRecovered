package p000;

import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public abstract class uue {

    /* JADX INFO: renamed from: a */
    @hib
    public final hpd f89159a;

    /* JADX INFO: renamed from: b */
    public final long f89160b;

    /* JADX INFO: renamed from: c */
    public final long f89161c;

    /* JADX INFO: renamed from: uue$a */
    public static abstract class AbstractC13715a extends uue {

        /* JADX INFO: renamed from: d */
        public final long f89162d;

        /* JADX INFO: renamed from: e */
        public final long f89163e;

        /* JADX INFO: renamed from: f */
        @hib
        public final List<C13718d> f89164f;

        /* JADX INFO: renamed from: g */
        public final long f89165g;

        /* JADX INFO: renamed from: h */
        public final long f89166h;

        /* JADX INFO: renamed from: i */
        @fdi
        public final long f89167i;

        public AbstractC13715a(@hib hpd hpdVar, long j, long j2, long j3, long j4, @hib List<C13718d> list, long j5, long j6, long j7) {
            super(hpdVar, j, j2);
            this.f89162d = j3;
            this.f89163e = j4;
            this.f89164f = list;
            this.f89167i = j5;
            this.f89165g = j6;
            this.f89166h = j7;
        }

        public long getAvailableSegmentCount(long j, long j2) {
            long segmentCount = getSegmentCount(j);
            return segmentCount != -1 ? segmentCount : (int) (getSegmentNum((j2 - this.f89166h) + this.f89167i, j) - getFirstAvailableSegmentNum(j, j2));
        }

        public long getFirstAvailableSegmentNum(long j, long j2) {
            if (getSegmentCount(j) == -1) {
                long j3 = this.f89165g;
                if (j3 != -9223372036854775807L) {
                    return Math.max(getFirstSegmentNum(), getSegmentNum((j2 - this.f89166h) - j3, j));
                }
            }
            return getFirstSegmentNum();
        }

        public long getFirstSegmentNum() {
            return this.f89162d;
        }

        public long getNextSegmentAvailableTimeUs(long j, long j2) {
            if (this.f89164f != null) {
                return -9223372036854775807L;
            }
            long firstAvailableSegmentNum = getFirstAvailableSegmentNum(j, j2) + getAvailableSegmentCount(j, j2);
            return (getSegmentTimeUs(firstAvailableSegmentNum) + getSegmentDurationUs(firstAvailableSegmentNum, j)) - this.f89167i;
        }

        public abstract long getSegmentCount(long j);

        public final long getSegmentDurationUs(long j, long j2) {
            List<C13718d> list = this.f89164f;
            if (list != null) {
                return (list.get((int) (j - this.f89162d)).f89173b * 1000000) / this.f89160b;
            }
            long segmentCount = getSegmentCount(j2);
            return (segmentCount == -1 || j != (getFirstSegmentNum() + segmentCount) - 1) ? (this.f89163e * 1000000) / this.f89160b : j2 - getSegmentTimeUs(j);
        }

        public long getSegmentNum(long j, long j2) {
            long firstSegmentNum = getFirstSegmentNum();
            long segmentCount = getSegmentCount(j2);
            if (segmentCount == 0) {
                return firstSegmentNum;
            }
            if (this.f89164f == null) {
                long j3 = this.f89162d + (j / ((this.f89163e * 1000000) / this.f89160b));
                return j3 < firstSegmentNum ? firstSegmentNum : segmentCount == -1 ? j3 : Math.min(j3, (firstSegmentNum + segmentCount) - 1);
            }
            long j4 = (segmentCount + firstSegmentNum) - 1;
            long j5 = firstSegmentNum;
            while (j5 <= j4) {
                long j6 = ((j4 - j5) / 2) + j5;
                long segmentTimeUs = getSegmentTimeUs(j6);
                if (segmentTimeUs < j) {
                    j5 = j6 + 1;
                } else {
                    if (segmentTimeUs <= j) {
                        return j6;
                    }
                    j4 = j6 - 1;
                }
            }
            return j5 == firstSegmentNum ? j5 : j4;
        }

        public final long getSegmentTimeUs(long j) {
            List<C13718d> list = this.f89164f;
            return x0i.scaleLargeTimestamp(list != null ? list.get((int) (j - this.f89162d)).f89172a - this.f89161c : (j - this.f89162d) * this.f89163e, 1000000L, this.f89160b);
        }

        public abstract hpd getSegmentUrl(n3e n3eVar, long j);

        public boolean isExplicit() {
            return this.f89164f != null;
        }
    }

    /* JADX INFO: renamed from: uue$b */
    public static final class C13716b extends AbstractC13715a {

        /* JADX INFO: renamed from: j */
        @hib
        public final List<hpd> f89168j;

        public C13716b(hpd hpdVar, long j, long j2, long j3, long j4, @hib List<C13718d> list, long j5, @hib List<hpd> list2, long j6, long j7) {
            super(hpdVar, j, j2, j3, j4, list, j5, j6, j7);
            this.f89168j = list2;
        }

        @Override // p000.uue.AbstractC13715a
        public long getSegmentCount(long j) {
            return this.f89168j.size();
        }

        @Override // p000.uue.AbstractC13715a
        public hpd getSegmentUrl(n3e n3eVar, long j) {
            return this.f89168j.get((int) (j - this.f89162d));
        }

        @Override // p000.uue.AbstractC13715a
        public boolean isExplicit() {
            return true;
        }
    }

    /* JADX INFO: renamed from: uue$c */
    public static final class C13717c extends AbstractC13715a {

        /* JADX INFO: renamed from: j */
        @hib
        public final iyh f89169j;

        /* JADX INFO: renamed from: k */
        @hib
        public final iyh f89170k;

        /* JADX INFO: renamed from: l */
        public final long f89171l;

        public C13717c(hpd hpdVar, long j, long j2, long j3, long j4, long j5, @hib List<C13718d> list, long j6, @hib iyh iyhVar, @hib iyh iyhVar2, long j7, long j8) {
            super(hpdVar, j, j2, j3, j5, list, j6, j7, j8);
            this.f89169j = iyhVar;
            this.f89170k = iyhVar2;
            this.f89171l = j4;
        }

        @Override // p000.uue
        @hib
        public hpd getInitialization(n3e n3eVar) {
            iyh iyhVar = this.f89169j;
            if (iyhVar == null) {
                return super.getInitialization(n3eVar);
            }
            kq6 kq6Var = n3eVar.f63195c;
            return new hpd(iyhVar.buildUri(kq6Var.f54998a, 0L, kq6Var.f54985C, 0L), 0L, -1L);
        }

        @Override // p000.uue.AbstractC13715a
        public long getSegmentCount(long j) {
            if (this.f89164f != null) {
                return r0.size();
            }
            long j2 = this.f89171l;
            if (j2 != -1) {
                return (j2 - this.f89162d) + 1;
            }
            if (j != -9223372036854775807L) {
                return s11.divide(BigInteger.valueOf(j).multiply(BigInteger.valueOf(this.f89160b)), BigInteger.valueOf(this.f89163e).multiply(BigInteger.valueOf(1000000L)), RoundingMode.CEILING).longValue();
            }
            return -1L;
        }

        @Override // p000.uue.AbstractC13715a
        public hpd getSegmentUrl(n3e n3eVar, long j) {
            List<C13718d> list = this.f89164f;
            long j2 = list != null ? list.get((int) (j - this.f89162d)).f89172a : (j - this.f89162d) * this.f89163e;
            iyh iyhVar = this.f89170k;
            kq6 kq6Var = n3eVar.f63195c;
            return new hpd(iyhVar.buildUri(kq6Var.f54998a, j, kq6Var.f54985C, j2), 0L, -1L);
        }
    }

    /* JADX INFO: renamed from: uue$d */
    public static final class C13718d {

        /* JADX INFO: renamed from: a */
        public final long f89172a;

        /* JADX INFO: renamed from: b */
        public final long f89173b;

        public C13718d(long j, long j2) {
            this.f89172a = j;
            this.f89173b = j2;
        }

        public boolean equals(@hib Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C13718d.class != obj.getClass()) {
                return false;
            }
            C13718d c13718d = (C13718d) obj;
            return this.f89172a == c13718d.f89172a && this.f89173b == c13718d.f89173b;
        }

        public int hashCode() {
            return (((int) this.f89172a) * 31) + ((int) this.f89173b);
        }
    }

    public uue(@hib hpd hpdVar, long j, long j2) {
        this.f89159a = hpdVar;
        this.f89160b = j;
        this.f89161c = j2;
    }

    @hib
    public hpd getInitialization(n3e n3eVar) {
        return this.f89159a;
    }

    public long getPresentationTimeOffsetUs() {
        return x0i.scaleLargeTimestamp(this.f89161c, 1000000L, this.f89160b);
    }

    /* JADX INFO: renamed from: uue$e */
    public static class C13719e extends uue {

        /* JADX INFO: renamed from: d */
        public final long f89174d;

        /* JADX INFO: renamed from: e */
        public final long f89175e;

        public C13719e(@hib hpd hpdVar, long j, long j2, long j3, long j4) {
            super(hpdVar, j, j2);
            this.f89174d = j3;
            this.f89175e = j4;
        }

        @hib
        public hpd getIndex() {
            long j = this.f89175e;
            if (j <= 0) {
                return null;
            }
            return new hpd(null, this.f89174d, j);
        }

        public C13719e() {
            this(null, 1L, 0L, 0L, 0L);
        }
    }
}
