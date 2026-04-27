package p000;

import android.net.Uri;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import p000.uue;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public abstract class n3e {

    /* JADX INFO: renamed from: j */
    public static final long f63193j = -1;

    /* JADX INFO: renamed from: b */
    public final long f63194b;

    /* JADX INFO: renamed from: c */
    public final kq6 f63195c;

    /* JADX INFO: renamed from: d */
    public final kx7<ru0> f63196d;

    /* JADX INFO: renamed from: e */
    public final long f63197e;

    /* JADX INFO: renamed from: f */
    public final List<k74> f63198f;

    /* JADX INFO: renamed from: g */
    public final List<k74> f63199g;

    /* JADX INFO: renamed from: h */
    public final List<k74> f63200h;

    /* JADX INFO: renamed from: i */
    public final hpd f63201i;

    /* JADX INFO: renamed from: n3e$b */
    public static class C9680b extends n3e implements ff3 {

        /* JADX INFO: renamed from: k */
        @fdi
        public final uue.AbstractC13715a f63202k;

        public C9680b(long j, kq6 kq6Var, List<ru0> list, uue.AbstractC13715a abstractC13715a, @hib List<k74> list2, List<k74> list3, List<k74> list4) {
            super(j, kq6Var, list, abstractC13715a, list2, list3, list4);
            this.f63202k = abstractC13715a;
        }

        @Override // p000.ff3
        public long getAvailableSegmentCount(long j, long j2) {
            return this.f63202k.getAvailableSegmentCount(j, j2);
        }

        @Override // p000.n3e
        @hib
        public String getCacheKey() {
            return null;
        }

        @Override // p000.ff3
        public long getDurationUs(long j, long j2) {
            return this.f63202k.getSegmentDurationUs(j, j2);
        }

        @Override // p000.ff3
        public long getFirstAvailableSegmentNum(long j, long j2) {
            return this.f63202k.getFirstAvailableSegmentNum(j, j2);
        }

        @Override // p000.ff3
        public long getFirstSegmentNum() {
            return this.f63202k.getFirstSegmentNum();
        }

        @Override // p000.n3e
        public ff3 getIndex() {
            return this;
        }

        @Override // p000.n3e
        @hib
        public hpd getIndexUri() {
            return null;
        }

        @Override // p000.ff3
        public long getNextSegmentAvailableTimeUs(long j, long j2) {
            return this.f63202k.getNextSegmentAvailableTimeUs(j, j2);
        }

        @Override // p000.ff3
        public long getSegmentCount(long j) {
            return this.f63202k.getSegmentCount(j);
        }

        @Override // p000.ff3
        public long getSegmentNum(long j, long j2) {
            return this.f63202k.getSegmentNum(j, j2);
        }

        @Override // p000.ff3
        public hpd getSegmentUrl(long j) {
            return this.f63202k.getSegmentUrl(this, j);
        }

        @Override // p000.ff3
        public long getTimeUs(long j) {
            return this.f63202k.getSegmentTimeUs(j);
        }

        @Override // p000.ff3
        public boolean isExplicit() {
            return this.f63202k.isExplicit();
        }
    }

    /* JADX INFO: renamed from: n3e$c */
    public static class C9681c extends n3e {

        /* JADX INFO: renamed from: k */
        public final Uri f63203k;

        /* JADX INFO: renamed from: l */
        public final long f63204l;

        /* JADX INFO: renamed from: m */
        @hib
        public final String f63205m;

        /* JADX INFO: renamed from: n */
        @hib
        public final hpd f63206n;

        /* JADX INFO: renamed from: o */
        @hib
        public final mof f63207o;

        public C9681c(long j, kq6 kq6Var, List<ru0> list, uue.C13719e c13719e, @hib List<k74> list2, List<k74> list3, List<k74> list4, @hib String str, long j2) {
            super(j, kq6Var, list, c13719e, list2, list3, list4);
            this.f63203k = Uri.parse(list.get(0).f79575a);
            hpd index = c13719e.getIndex();
            this.f63206n = index;
            this.f63205m = str;
            this.f63204l = j2;
            this.f63207o = index != null ? null : new mof(new hpd(null, 0L, j2));
        }

        public static C9681c newInstance(long j, kq6 kq6Var, String str, long j2, long j3, long j4, long j5, List<k74> list, @hib String str2, long j6) {
            return new C9681c(j, kq6Var, kx7.m15111of(new ru0(str)), new uue.C13719e(new hpd(null, j2, (j3 - j2) + 1), 1L, 0L, j4, (j5 - j4) + 1), list, kx7.m15110of(), kx7.m15110of(), str2, j6);
        }

        @Override // p000.n3e
        @hib
        public String getCacheKey() {
            return this.f63205m;
        }

        @Override // p000.n3e
        @hib
        public ff3 getIndex() {
            return this.f63207o;
        }

        @Override // p000.n3e
        @hib
        public hpd getIndexUri() {
            return this.f63206n;
        }
    }

    public static n3e newInstance(long j, kq6 kq6Var, List<ru0> list, uue uueVar) {
        return newInstance(j, kq6Var, list, uueVar, null, kx7.m15110of(), kx7.m15110of(), null);
    }

    @hib
    public abstract String getCacheKey();

    @hib
    public abstract ff3 getIndex();

    @hib
    public abstract hpd getIndexUri();

    @hib
    public hpd getInitializationUri() {
        return this.f63201i;
    }

    private n3e(long j, kq6 kq6Var, List<ru0> list, uue uueVar, @hib List<k74> list2, List<k74> list3, List<k74> list4) {
        u80.checkArgument(!list.isEmpty());
        this.f63194b = j;
        this.f63195c = kq6Var;
        this.f63196d = kx7.copyOf((Collection) list);
        this.f63198f = list2 == null ? Collections.emptyList() : Collections.unmodifiableList(list2);
        this.f63199g = list3;
        this.f63200h = list4;
        this.f63201i = uueVar.getInitialization(this);
        this.f63197e = uueVar.getPresentationTimeOffsetUs();
    }

    public static n3e newInstance(long j, kq6 kq6Var, List<ru0> list, uue uueVar, @hib List<k74> list2, List<k74> list3, List<k74> list4, @hib String str) {
        if (uueVar instanceof uue.C13719e) {
            return new C9681c(j, kq6Var, list, (uue.C13719e) uueVar, list2, list3, list4, str, -1L);
        }
        if (uueVar instanceof uue.AbstractC13715a) {
            return new C9680b(j, kq6Var, list, (uue.AbstractC13715a) uueVar, list2, list3, list4);
        }
        throw new IllegalArgumentException("segmentBase must be of type SingleSegmentBase or MultiSegmentBase");
    }
}
