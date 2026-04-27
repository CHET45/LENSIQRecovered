package p000;

import android.graphics.Rect;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import p000.aga;
import p000.iga;
import p000.lzc;
import p000.t1h;
import p000.y7h;
import p000.yhf;
import p000.za9;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public abstract class yhf extends at0 {

    /* JADX INFO: renamed from: g1 */
    public static final long f101523g1 = 1000;

    /* JADX INFO: renamed from: Z0 */
    public final za9<lzc.InterfaceC9049g> f101524Z0;

    /* JADX INFO: renamed from: a1 */
    public final Looper f101525a1;

    /* JADX INFO: renamed from: b1 */
    public final pe7 f101526b1;

    /* JADX INFO: renamed from: c1 */
    public final HashSet<ja9<?>> f101527c1;

    /* JADX INFO: renamed from: d1 */
    public final t1h.C12849b f101528d1;

    /* JADX INFO: renamed from: e1 */
    public C15674g f101529e1;

    /* JADX INFO: renamed from: f1 */
    public boolean f101530f1;

    /* JADX INFO: renamed from: yhf$b */
    public static final class C15669b {

        /* JADX INFO: renamed from: a */
        public final Object f101531a;

        /* JADX INFO: renamed from: b */
        public final y7h f101532b;

        /* JADX INFO: renamed from: c */
        public final aga f101533c;

        /* JADX INFO: renamed from: d */
        @hib
        public final iga f101534d;

        /* JADX INFO: renamed from: e */
        @hib
        public final Object f101535e;

        /* JADX INFO: renamed from: f */
        @hib
        public final aga.C0239g f101536f;

        /* JADX INFO: renamed from: g */
        public final long f101537g;

        /* JADX INFO: renamed from: h */
        public final long f101538h;

        /* JADX INFO: renamed from: i */
        public final long f101539i;

        /* JADX INFO: renamed from: j */
        public final boolean f101540j;

        /* JADX INFO: renamed from: k */
        public final boolean f101541k;

        /* JADX INFO: renamed from: l */
        public final long f101542l;

        /* JADX INFO: renamed from: m */
        public final long f101543m;

        /* JADX INFO: renamed from: n */
        public final long f101544n;

        /* JADX INFO: renamed from: o */
        public final boolean f101545o;

        /* JADX INFO: renamed from: p */
        public final kx7<C15670c> f101546p;

        /* JADX INFO: renamed from: q */
        public final long[] f101547q;

        /* JADX INFO: renamed from: r */
        public final iga f101548r;

        /* JADX INFO: renamed from: yhf$b$a */
        public static final class a {

            /* JADX INFO: renamed from: a */
            public Object f101549a;

            /* JADX INFO: renamed from: b */
            public y7h f101550b;

            /* JADX INFO: renamed from: c */
            public aga f101551c;

            /* JADX INFO: renamed from: d */
            @hib
            public iga f101552d;

            /* JADX INFO: renamed from: e */
            @hib
            public Object f101553e;

            /* JADX INFO: renamed from: f */
            @hib
            public aga.C0239g f101554f;

            /* JADX INFO: renamed from: g */
            public long f101555g;

            /* JADX INFO: renamed from: h */
            public long f101556h;

            /* JADX INFO: renamed from: i */
            public long f101557i;

            /* JADX INFO: renamed from: j */
            public boolean f101558j;

            /* JADX INFO: renamed from: k */
            public boolean f101559k;

            /* JADX INFO: renamed from: l */
            public long f101560l;

            /* JADX INFO: renamed from: m */
            public long f101561m;

            /* JADX INFO: renamed from: n */
            public long f101562n;

            /* JADX INFO: renamed from: o */
            public boolean f101563o;

            /* JADX INFO: renamed from: p */
            public kx7<C15670c> f101564p;

            public C15669b build() {
                return new C15669b(this);
            }

            @op1
            public a setDefaultPositionUs(long j) {
                u80.checkArgument(j >= 0);
                this.f101560l = j;
                return this;
            }

            @op1
            public a setDurationUs(long j) {
                u80.checkArgument(j == -9223372036854775807L || j >= 0);
                this.f101561m = j;
                return this;
            }

            @op1
            public a setElapsedRealtimeEpochOffsetMs(long j) {
                this.f101557i = j;
                return this;
            }

            @op1
            public a setIsDynamic(boolean z) {
                this.f101559k = z;
                return this;
            }

            @op1
            public a setIsPlaceholder(boolean z) {
                this.f101563o = z;
                return this;
            }

            @op1
            public a setIsSeekable(boolean z) {
                this.f101558j = z;
                return this;
            }

            @op1
            public a setLiveConfiguration(@hib aga.C0239g c0239g) {
                this.f101554f = c0239g;
                return this;
            }

            @op1
            public a setManifest(@hib Object obj) {
                this.f101553e = obj;
                return this;
            }

            @op1
            public a setMediaItem(aga agaVar) {
                this.f101551c = agaVar;
                return this;
            }

            @op1
            public a setMediaMetadata(@hib iga igaVar) {
                this.f101552d = igaVar;
                return this;
            }

            @op1
            public a setPeriods(List<C15670c> list) {
                int size = list.size();
                int i = 0;
                while (i < size - 1) {
                    u80.checkArgument(list.get(i).f101566b != -9223372036854775807L, "Periods other than last need a duration");
                    int i2 = i + 1;
                    for (int i3 = i2; i3 < size; i3++) {
                        u80.checkArgument(!list.get(i).f101565a.equals(list.get(i3).f101565a), "Duplicate PeriodData UIDs in period list");
                    }
                    i = i2;
                }
                this.f101564p = kx7.copyOf((Collection) list);
                return this;
            }

            @op1
            public a setPositionInFirstPeriodUs(long j) {
                u80.checkArgument(j >= 0);
                this.f101562n = j;
                return this;
            }

            @op1
            public a setPresentationStartTimeMs(long j) {
                this.f101555g = j;
                return this;
            }

            @op1
            public a setTracks(y7h y7hVar) {
                this.f101550b = y7hVar;
                return this;
            }

            @op1
            public a setUid(Object obj) {
                this.f101549a = obj;
                return this;
            }

            @op1
            public a setWindowStartTimeMs(long j) {
                this.f101556h = j;
                return this;
            }

            public a(Object obj) {
                this.f101549a = obj;
                this.f101550b = y7h.f100701b;
                this.f101551c = aga.f1436H;
                this.f101552d = null;
                this.f101553e = null;
                this.f101554f = null;
                this.f101555g = -9223372036854775807L;
                this.f101556h = -9223372036854775807L;
                this.f101557i = -9223372036854775807L;
                this.f101558j = false;
                this.f101559k = false;
                this.f101560l = 0L;
                this.f101561m = -9223372036854775807L;
                this.f101562n = 0L;
                this.f101563o = false;
                this.f101564p = kx7.m15110of();
            }

            private a(C15669b c15669b) {
                this.f101549a = c15669b.f101531a;
                this.f101550b = c15669b.f101532b;
                this.f101551c = c15669b.f101533c;
                this.f101552d = c15669b.f101534d;
                this.f101553e = c15669b.f101535e;
                this.f101554f = c15669b.f101536f;
                this.f101555g = c15669b.f101537g;
                this.f101556h = c15669b.f101538h;
                this.f101557i = c15669b.f101539i;
                this.f101558j = c15669b.f101540j;
                this.f101559k = c15669b.f101541k;
                this.f101560l = c15669b.f101542l;
                this.f101561m = c15669b.f101543m;
                this.f101562n = c15669b.f101544n;
                this.f101563o = c15669b.f101545o;
                this.f101564p = c15669b.f101546p;
            }
        }

        private static iga getCombinedMediaMetadata(aga agaVar, y7h y7hVar) {
            iga.C7275b c7275b = new iga.C7275b();
            int size = y7hVar.getGroups().size();
            for (int i = 0; i < size; i++) {
                y7h.C15542a c15542a = y7hVar.getGroups().get(i);
                for (int i2 = 0; i2 < c15542a.f100710a; i2++) {
                    if (c15542a.isTrackSelected(i2)) {
                        kq6 trackFormat = c15542a.getTrackFormat(i2);
                        if (trackFormat.f54987H != null) {
                            for (int i3 = 0; i3 < trackFormat.f54987H.length(); i3++) {
                                trackFormat.f54987H.get(i3).populateMediaMetadata(c7275b);
                            }
                        }
                    }
                }
            }
            return c7275b.populate(agaVar.f1449e).build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public t1h.C12849b getPeriod(int i, int i2, t1h.C12849b c12849b) {
            if (this.f101546p.isEmpty()) {
                Object obj = this.f101531a;
                c12849b.set(obj, obj, i, this.f101544n + this.f101543m, 0L, C10354of.f67450M, this.f101545o);
            } else {
                C15670c c15670c = this.f101546p.get(i2);
                Object obj2 = c15670c.f101565a;
                c12849b.set(obj2, Pair.create(this.f101531a, obj2), i, c15670c.f101566b, this.f101547q[i2], c15670c.f101567c, c15670c.f101568d);
            }
            return c12849b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Object getPeriodUid(int i) {
            if (this.f101546p.isEmpty()) {
                return this.f101531a;
            }
            return Pair.create(this.f101531a, this.f101546p.get(i).f101565a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public t1h.C12851d getWindow(int i, t1h.C12851d c12851d) {
            c12851d.set(this.f101531a, this.f101533c, this.f101535e, this.f101537g, this.f101538h, this.f101539i, this.f101540j, this.f101541k, this.f101536f, this.f101542l, this.f101543m, i, (i + (this.f101546p.isEmpty() ? 1 : this.f101546p.size())) - 1, this.f101544n);
            c12851d.f83428M = this.f101545o;
            return c12851d;
        }

        public a buildUpon() {
            return new a();
        }

        public boolean equals(@hib Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C15669b)) {
                return false;
            }
            C15669b c15669b = (C15669b) obj;
            return this.f101531a.equals(c15669b.f101531a) && this.f101532b.equals(c15669b.f101532b) && this.f101533c.equals(c15669b.f101533c) && x0i.areEqual(this.f101534d, c15669b.f101534d) && x0i.areEqual(this.f101535e, c15669b.f101535e) && x0i.areEqual(this.f101536f, c15669b.f101536f) && this.f101537g == c15669b.f101537g && this.f101538h == c15669b.f101538h && this.f101539i == c15669b.f101539i && this.f101540j == c15669b.f101540j && this.f101541k == c15669b.f101541k && this.f101542l == c15669b.f101542l && this.f101543m == c15669b.f101543m && this.f101544n == c15669b.f101544n && this.f101545o == c15669b.f101545o && this.f101546p.equals(c15669b.f101546p);
        }

        public int hashCode() {
            int iHashCode = (((((217 + this.f101531a.hashCode()) * 31) + this.f101532b.hashCode()) * 31) + this.f101533c.hashCode()) * 31;
            iga igaVar = this.f101534d;
            int iHashCode2 = (iHashCode + (igaVar == null ? 0 : igaVar.hashCode())) * 31;
            Object obj = this.f101535e;
            int iHashCode3 = (iHashCode2 + (obj == null ? 0 : obj.hashCode())) * 31;
            aga.C0239g c0239g = this.f101536f;
            int iHashCode4 = (iHashCode3 + (c0239g != null ? c0239g.hashCode() : 0)) * 31;
            long j = this.f101537g;
            int i = (iHashCode4 + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.f101538h;
            int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            long j3 = this.f101539i;
            int i3 = (((((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.f101540j ? 1 : 0)) * 31) + (this.f101541k ? 1 : 0)) * 31;
            long j4 = this.f101542l;
            int i4 = (i3 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
            long j5 = this.f101543m;
            int i5 = (i4 + ((int) (j5 ^ (j5 >>> 32)))) * 31;
            long j6 = this.f101544n;
            return ((((i5 + ((int) (j6 ^ (j6 >>> 32)))) * 31) + (this.f101545o ? 1 : 0)) * 31) + this.f101546p.hashCode();
        }

        private C15669b(a aVar) {
            int i = 0;
            if (aVar.f101554f == null) {
                u80.checkArgument(aVar.f101555g == -9223372036854775807L, "presentationStartTimeMs can only be set if liveConfiguration != null");
                u80.checkArgument(aVar.f101556h == -9223372036854775807L, "windowStartTimeMs can only be set if liveConfiguration != null");
                u80.checkArgument(aVar.f101557i == -9223372036854775807L, "elapsedRealtimeEpochOffsetMs can only be set if liveConfiguration != null");
            } else if (aVar.f101555g != -9223372036854775807L && aVar.f101556h != -9223372036854775807L) {
                u80.checkArgument(aVar.f101556h >= aVar.f101555g, "windowStartTimeMs can't be less than presentationStartTimeMs");
            }
            int size = aVar.f101564p.size();
            if (aVar.f101561m != -9223372036854775807L) {
                u80.checkArgument(aVar.f101560l <= aVar.f101561m, "defaultPositionUs can't be greater than durationUs");
            }
            this.f101531a = aVar.f101549a;
            this.f101532b = aVar.f101550b;
            this.f101533c = aVar.f101551c;
            this.f101534d = aVar.f101552d;
            this.f101535e = aVar.f101553e;
            this.f101536f = aVar.f101554f;
            this.f101537g = aVar.f101555g;
            this.f101538h = aVar.f101556h;
            this.f101539i = aVar.f101557i;
            this.f101540j = aVar.f101558j;
            this.f101541k = aVar.f101559k;
            this.f101542l = aVar.f101560l;
            this.f101543m = aVar.f101561m;
            long j = aVar.f101562n;
            this.f101544n = j;
            this.f101545o = aVar.f101563o;
            kx7<C15670c> kx7Var = aVar.f101564p;
            this.f101546p = kx7Var;
            long[] jArr = new long[kx7Var.size()];
            this.f101547q = jArr;
            if (!kx7Var.isEmpty()) {
                jArr[0] = -j;
                while (i < size - 1) {
                    long[] jArr2 = this.f101547q;
                    int i2 = i + 1;
                    jArr2[i2] = jArr2[i] + this.f101546p.get(i).f101566b;
                    i = i2;
                }
            }
            iga igaVar = this.f101534d;
            this.f101548r = igaVar == null ? getCombinedMediaMetadata(this.f101533c, this.f101532b) : igaVar;
        }
    }

    /* JADX INFO: renamed from: yhf$c */
    public static final class C15670c {

        /* JADX INFO: renamed from: a */
        public final Object f101565a;

        /* JADX INFO: renamed from: b */
        public final long f101566b;

        /* JADX INFO: renamed from: c */
        public final C10354of f101567c;

        /* JADX INFO: renamed from: d */
        public final boolean f101568d;

        /* JADX INFO: renamed from: yhf$c$a */
        public static final class a {

            /* JADX INFO: renamed from: a */
            public Object f101569a;

            /* JADX INFO: renamed from: b */
            public long f101570b;

            /* JADX INFO: renamed from: c */
            public C10354of f101571c;

            /* JADX INFO: renamed from: d */
            public boolean f101572d;

            public C15670c build() {
                return new C15670c(this);
            }

            @op1
            public a setAdPlaybackState(C10354of c10354of) {
                this.f101571c = c10354of;
                return this;
            }

            @op1
            public a setDurationUs(long j) {
                u80.checkArgument(j == -9223372036854775807L || j >= 0);
                this.f101570b = j;
                return this;
            }

            @op1
            public a setIsPlaceholder(boolean z) {
                this.f101572d = z;
                return this;
            }

            @op1
            public a setUid(Object obj) {
                this.f101569a = obj;
                return this;
            }

            public a(Object obj) {
                this.f101569a = obj;
                this.f101570b = 0L;
                this.f101571c = C10354of.f67450M;
                this.f101572d = false;
            }

            private a(C15670c c15670c) {
                this.f101569a = c15670c.f101565a;
                this.f101570b = c15670c.f101566b;
                this.f101571c = c15670c.f101567c;
                this.f101572d = c15670c.f101568d;
            }
        }

        public a buildUpon() {
            return new a();
        }

        public boolean equals(@hib Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C15670c)) {
                return false;
            }
            C15670c c15670c = (C15670c) obj;
            return this.f101565a.equals(c15670c.f101565a) && this.f101566b == c15670c.f101566b && this.f101567c.equals(c15670c.f101567c) && this.f101568d == c15670c.f101568d;
        }

        public int hashCode() {
            int iHashCode = (217 + this.f101565a.hashCode()) * 31;
            long j = this.f101566b;
            return ((((iHashCode + ((int) (j ^ (j >>> 32)))) * 31) + this.f101567c.hashCode()) * 31) + (this.f101568d ? 1 : 0);
        }

        private C15670c(a aVar) {
            this.f101565a = aVar.f101569a;
            this.f101566b = aVar.f101570b;
            this.f101567c = aVar.f101571c;
            this.f101568d = aVar.f101572d;
        }
    }

    /* JADX INFO: renamed from: yhf$d */
    public static final class C15671d {
        private C15671d() {
        }
    }

    /* JADX INFO: renamed from: yhf$e */
    public static final class C15672e extends t1h {

        /* JADX INFO: renamed from: C */
        public final int[] f101573C;

        /* JADX INFO: renamed from: F */
        public final HashMap<Object, Integer> f101574F;

        /* JADX INFO: renamed from: f */
        public final kx7<C15669b> f101575f;

        /* JADX INFO: renamed from: m */
        public final int[] f101576m;

        public C15672e(kx7<C15669b> kx7Var) {
            int size = kx7Var.size();
            this.f101575f = kx7Var;
            this.f101576m = new int[size];
            int periodCountInMediaItem = 0;
            for (int i = 0; i < size; i++) {
                C15669b c15669b = kx7Var.get(i);
                this.f101576m[i] = periodCountInMediaItem;
                periodCountInMediaItem += getPeriodCountInMediaItem(c15669b);
            }
            this.f101573C = new int[periodCountInMediaItem];
            this.f101574F = new HashMap<>();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                C15669b c15669b2 = kx7Var.get(i3);
                for (int i4 = 0; i4 < getPeriodCountInMediaItem(c15669b2); i4++) {
                    this.f101574F.put(c15669b2.getPeriodUid(i4), Integer.valueOf(i2));
                    this.f101573C[i2] = i3;
                    i2++;
                }
            }
        }

        private static int getPeriodCountInMediaItem(C15669b c15669b) {
            if (c15669b.f101546p.isEmpty()) {
                return 1;
            }
            return c15669b.f101546p.size();
        }

        @Override // p000.t1h
        public int getFirstWindowIndex(boolean z) {
            return super.getFirstWindowIndex(z);
        }

        @Override // p000.t1h
        public int getIndexOfPeriod(Object obj) {
            Integer num = this.f101574F.get(obj);
            if (num == null) {
                return -1;
            }
            return num.intValue();
        }

        @Override // p000.t1h
        public int getLastWindowIndex(boolean z) {
            return super.getLastWindowIndex(z);
        }

        @Override // p000.t1h
        public int getNextWindowIndex(int i, int i2, boolean z) {
            return super.getNextWindowIndex(i, i2, z);
        }

        @Override // p000.t1h
        public t1h.C12849b getPeriod(int i, t1h.C12849b c12849b, boolean z) {
            int i2 = this.f101573C[i];
            return this.f101575f.get(i2).getPeriod(i2, i - this.f101576m[i2], c12849b);
        }

        @Override // p000.t1h
        public t1h.C12849b getPeriodByUid(Object obj, t1h.C12849b c12849b) {
            return getPeriod(((Integer) u80.checkNotNull(this.f101574F.get(obj))).intValue(), c12849b, true);
        }

        @Override // p000.t1h
        public int getPeriodCount() {
            return this.f101573C.length;
        }

        @Override // p000.t1h
        public int getPreviousWindowIndex(int i, int i2, boolean z) {
            return super.getPreviousWindowIndex(i, i2, z);
        }

        @Override // p000.t1h
        public Object getUidOfPeriod(int i) {
            int i2 = this.f101573C[i];
            return this.f101575f.get(i2).getPeriodUid(i - this.f101576m[i2]);
        }

        @Override // p000.t1h
        public t1h.C12851d getWindow(int i, t1h.C12851d c12851d, long j) {
            return this.f101575f.get(i).getWindow(this.f101576m[i], c12851d);
        }

        @Override // p000.t1h
        public int getWindowCount() {
            return this.f101575f.size();
        }
    }

    /* JADX INFO: renamed from: yhf$f */
    public interface InterfaceC15673f {

        /* JADX INFO: renamed from: a */
        public static final InterfaceC15673f f101577a = getConstant(0);

        static InterfaceC15673f getConstant(final long j) {
            return new InterfaceC15673f() { // from class: whf
                @Override // p000.yhf.InterfaceC15673f
                public final long get() {
                    return yhf.InterfaceC15673f.lambda$getConstant$0(j);
                }
            };
        }

        static InterfaceC15673f getExtrapolating(final long j, final float f) {
            final long jElapsedRealtime = SystemClock.elapsedRealtime();
            return new InterfaceC15673f() { // from class: uhf
                @Override // p000.yhf.InterfaceC15673f
                public final long get() {
                    return yhf.InterfaceC15673f.lambda$getExtrapolating$1(j, jElapsedRealtime, f);
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ long lambda$getConstant$0(long j) {
            return j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ long lambda$getExtrapolating$1(long j, long j2, float f) {
            return j + ((long) ((SystemClock.elapsedRealtime() - j2) * f));
        }

        long get();
    }

    /* JADX INFO: renamed from: yhf$g */
    public static final class C15674g {

        /* JADX INFO: renamed from: A */
        public final iga f101578A;

        /* JADX INFO: renamed from: B */
        public final int f101579B;

        /* JADX INFO: renamed from: C */
        public final int f101580C;

        /* JADX INFO: renamed from: D */
        public final int f101581D;

        /* JADX INFO: renamed from: E */
        public final InterfaceC15673f f101582E;

        /* JADX INFO: renamed from: F */
        public final InterfaceC15673f f101583F;

        /* JADX INFO: renamed from: G */
        public final InterfaceC15673f f101584G;

        /* JADX INFO: renamed from: H */
        public final InterfaceC15673f f101585H;

        /* JADX INFO: renamed from: I */
        public final InterfaceC15673f f101586I;

        /* JADX INFO: renamed from: J */
        public final boolean f101587J;

        /* JADX INFO: renamed from: K */
        public final int f101588K;

        /* JADX INFO: renamed from: L */
        public final long f101589L;

        /* JADX INFO: renamed from: a */
        public final lzc.C9045c f101590a;

        /* JADX INFO: renamed from: b */
        public final boolean f101591b;

        /* JADX INFO: renamed from: c */
        public final int f101592c;

        /* JADX INFO: renamed from: d */
        public final int f101593d;

        /* JADX INFO: renamed from: e */
        public final int f101594e;

        /* JADX INFO: renamed from: f */
        @hib
        public final lyc f101595f;

        /* JADX INFO: renamed from: g */
        public final int f101596g;

        /* JADX INFO: renamed from: h */
        public final boolean f101597h;

        /* JADX INFO: renamed from: i */
        public final boolean f101598i;

        /* JADX INFO: renamed from: j */
        public final long f101599j;

        /* JADX INFO: renamed from: k */
        public final long f101600k;

        /* JADX INFO: renamed from: l */
        public final long f101601l;

        /* JADX INFO: renamed from: m */
        public final qyc f101602m;

        /* JADX INFO: renamed from: n */
        public final j7h f101603n;

        /* JADX INFO: renamed from: o */
        public final yc0 f101604o;

        /* JADX INFO: renamed from: p */
        @y46(from = 0.0d, m25645to = 1.0d)
        public final float f101605p;

        /* JADX INFO: renamed from: q */
        public final z7i f101606q;

        /* JADX INFO: renamed from: r */
        public final y93 f101607r;

        /* JADX INFO: renamed from: s */
        public final p84 f101608s;

        /* JADX INFO: renamed from: t */
        @h78(from = 0)
        public final int f101609t;

        /* JADX INFO: renamed from: u */
        public final boolean f101610u;

        /* JADX INFO: renamed from: v */
        public final ypf f101611v;

        /* JADX INFO: renamed from: w */
        public final boolean f101612w;

        /* JADX INFO: renamed from: x */
        public final Metadata f101613x;

        /* JADX INFO: renamed from: y */
        public final kx7<C15669b> f101614y;

        /* JADX INFO: renamed from: z */
        public final t1h f101615z;

        /* JADX INFO: renamed from: yhf$g$a */
        public static final class a {

            /* JADX INFO: renamed from: A */
            public iga f101616A;

            /* JADX INFO: renamed from: B */
            public int f101617B;

            /* JADX INFO: renamed from: C */
            public int f101618C;

            /* JADX INFO: renamed from: D */
            public int f101619D;

            /* JADX INFO: renamed from: E */
            @hib
            public Long f101620E;

            /* JADX INFO: renamed from: F */
            public InterfaceC15673f f101621F;

            /* JADX INFO: renamed from: G */
            @hib
            public Long f101622G;

            /* JADX INFO: renamed from: H */
            public InterfaceC15673f f101623H;

            /* JADX INFO: renamed from: I */
            public InterfaceC15673f f101624I;

            /* JADX INFO: renamed from: J */
            public InterfaceC15673f f101625J;

            /* JADX INFO: renamed from: K */
            public InterfaceC15673f f101626K;

            /* JADX INFO: renamed from: L */
            public boolean f101627L;

            /* JADX INFO: renamed from: M */
            public int f101628M;

            /* JADX INFO: renamed from: N */
            public long f101629N;

            /* JADX INFO: renamed from: a */
            public lzc.C9045c f101630a;

            /* JADX INFO: renamed from: b */
            public boolean f101631b;

            /* JADX INFO: renamed from: c */
            public int f101632c;

            /* JADX INFO: renamed from: d */
            public int f101633d;

            /* JADX INFO: renamed from: e */
            public int f101634e;

            /* JADX INFO: renamed from: f */
            @hib
            public lyc f101635f;

            /* JADX INFO: renamed from: g */
            public int f101636g;

            /* JADX INFO: renamed from: h */
            public boolean f101637h;

            /* JADX INFO: renamed from: i */
            public boolean f101638i;

            /* JADX INFO: renamed from: j */
            public long f101639j;

            /* JADX INFO: renamed from: k */
            public long f101640k;

            /* JADX INFO: renamed from: l */
            public long f101641l;

            /* JADX INFO: renamed from: m */
            public qyc f101642m;

            /* JADX INFO: renamed from: n */
            public j7h f101643n;

            /* JADX INFO: renamed from: o */
            public yc0 f101644o;

            /* JADX INFO: renamed from: p */
            public float f101645p;

            /* JADX INFO: renamed from: q */
            public z7i f101646q;

            /* JADX INFO: renamed from: r */
            public y93 f101647r;

            /* JADX INFO: renamed from: s */
            public p84 f101648s;

            /* JADX INFO: renamed from: t */
            public int f101649t;

            /* JADX INFO: renamed from: u */
            public boolean f101650u;

            /* JADX INFO: renamed from: v */
            public ypf f101651v;

            /* JADX INFO: renamed from: w */
            public boolean f101652w;

            /* JADX INFO: renamed from: x */
            public Metadata f101653x;

            /* JADX INFO: renamed from: y */
            public kx7<C15669b> f101654y;

            /* JADX INFO: renamed from: z */
            public t1h f101655z;

            public C15674g build() {
                return new C15674g(this);
            }

            @op1
            public a clearPositionDiscontinuity() {
                this.f101627L = false;
                return this;
            }

            @op1
            public a setAdBufferedPositionMs(InterfaceC15673f interfaceC15673f) {
                this.f101625J = interfaceC15673f;
                return this;
            }

            @op1
            public a setAdPositionMs(long j) {
                this.f101622G = Long.valueOf(j);
                return this;
            }

            @op1
            public a setAudioAttributes(yc0 yc0Var) {
                this.f101644o = yc0Var;
                return this;
            }

            @op1
            public a setAvailableCommands(lzc.C9045c c9045c) {
                this.f101630a = c9045c;
                return this;
            }

            @op1
            public a setContentBufferedPositionMs(InterfaceC15673f interfaceC15673f) {
                this.f101624I = interfaceC15673f;
                return this;
            }

            @op1
            public a setContentPositionMs(long j) {
                this.f101620E = Long.valueOf(j);
                return this;
            }

            @op1
            public a setCurrentAd(int i, int i2) {
                u80.checkArgument((i == -1) == (i2 == -1));
                this.f101618C = i;
                this.f101619D = i2;
                return this;
            }

            @op1
            public a setCurrentCues(y93 y93Var) {
                this.f101647r = y93Var;
                return this;
            }

            @op1
            public a setCurrentMediaItemIndex(int i) {
                this.f101617B = i;
                return this;
            }

            @op1
            public a setDeviceInfo(p84 p84Var) {
                this.f101648s = p84Var;
                return this;
            }

            @op1
            public a setDeviceVolume(@h78(from = 0) int i) {
                u80.checkArgument(i >= 0);
                this.f101649t = i;
                return this;
            }

            @op1
            public a setIsDeviceMuted(boolean z) {
                this.f101650u = z;
                return this;
            }

            @op1
            public a setIsLoading(boolean z) {
                this.f101638i = z;
                return this;
            }

            @op1
            public a setMaxSeekToPreviousPositionMs(long j) {
                this.f101641l = j;
                return this;
            }

            @op1
            public a setNewlyRenderedFirstFrame(boolean z) {
                this.f101652w = z;
                return this;
            }

            @op1
            public a setPlayWhenReady(boolean z, int i) {
                this.f101631b = z;
                this.f101632c = i;
                return this;
            }

            @op1
            public a setPlaybackParameters(qyc qycVar) {
                this.f101642m = qycVar;
                return this;
            }

            @op1
            public a setPlaybackState(int i) {
                this.f101633d = i;
                return this;
            }

            @op1
            public a setPlaybackSuppressionReason(int i) {
                this.f101634e = i;
                return this;
            }

            @op1
            public a setPlayerError(@hib lyc lycVar) {
                this.f101635f = lycVar;
                return this;
            }

            @op1
            public a setPlaylist(List<C15669b> list) {
                HashSet hashSet = new HashSet();
                for (int i = 0; i < list.size(); i++) {
                    u80.checkArgument(hashSet.add(list.get(i).f101531a), "Duplicate MediaItemData UID in playlist");
                }
                this.f101654y = kx7.copyOf((Collection) list);
                this.f101655z = new C15672e(this.f101654y);
                return this;
            }

            @op1
            public a setPlaylistMetadata(iga igaVar) {
                this.f101616A = igaVar;
                return this;
            }

            @op1
            public a setPositionDiscontinuity(int i, long j) {
                this.f101627L = true;
                this.f101628M = i;
                this.f101629N = j;
                return this;
            }

            @op1
            public a setRepeatMode(int i) {
                this.f101636g = i;
                return this;
            }

            @op1
            public a setSeekBackIncrementMs(long j) {
                this.f101639j = j;
                return this;
            }

            @op1
            public a setSeekForwardIncrementMs(long j) {
                this.f101640k = j;
                return this;
            }

            @op1
            public a setShuffleModeEnabled(boolean z) {
                this.f101637h = z;
                return this;
            }

            @op1
            public a setSurfaceSize(ypf ypfVar) {
                this.f101651v = ypfVar;
                return this;
            }

            @op1
            public a setTimedMetadata(Metadata metadata) {
                this.f101653x = metadata;
                return this;
            }

            @op1
            public a setTotalBufferedDurationMs(InterfaceC15673f interfaceC15673f) {
                this.f101626K = interfaceC15673f;
                return this;
            }

            @op1
            public a setTrackSelectionParameters(j7h j7hVar) {
                this.f101643n = j7hVar;
                return this;
            }

            @op1
            public a setVideoSize(z7i z7iVar) {
                this.f101646q = z7iVar;
                return this;
            }

            @op1
            public a setVolume(@y46(from = 0.0d, m25645to = 1.0d) float f) {
                u80.checkArgument(f >= 0.0f && f <= 1.0f);
                this.f101645p = f;
                return this;
            }

            public a() {
                this.f101630a = lzc.C9045c.f59438b;
                this.f101631b = false;
                this.f101632c = 1;
                this.f101633d = 1;
                this.f101634e = 0;
                this.f101635f = null;
                this.f101636g = 0;
                this.f101637h = false;
                this.f101638i = false;
                this.f101639j = 5000L;
                this.f101640k = 15000L;
                this.f101641l = 3000L;
                this.f101642m = qyc.f76311d;
                this.f101643n = j7h.f49729g2;
                this.f101644o = yc0.f101069m;
                this.f101645p = 1.0f;
                this.f101646q = z7i.f104340F;
                this.f101647r = y93.f100822c;
                this.f101648s = p84.f69964m;
                this.f101649t = 0;
                this.f101650u = false;
                this.f101651v = ypf.f102624c;
                this.f101652w = false;
                this.f101653x = new Metadata(-9223372036854775807L, new Metadata.Entry[0]);
                this.f101654y = kx7.m15110of();
                this.f101655z = t1h.f83385a;
                this.f101616A = iga.f46799B3;
                this.f101617B = -1;
                this.f101618C = -1;
                this.f101619D = -1;
                this.f101620E = null;
                this.f101621F = InterfaceC15673f.getConstant(-9223372036854775807L);
                this.f101622G = null;
                InterfaceC15673f interfaceC15673f = InterfaceC15673f.f101577a;
                this.f101623H = interfaceC15673f;
                this.f101624I = InterfaceC15673f.getConstant(-9223372036854775807L);
                this.f101625J = interfaceC15673f;
                this.f101626K = interfaceC15673f;
                this.f101627L = false;
                this.f101628M = 5;
                this.f101629N = 0L;
            }

            @op1
            public a setAdPositionMs(InterfaceC15673f interfaceC15673f) {
                this.f101622G = null;
                this.f101623H = interfaceC15673f;
                return this;
            }

            @op1
            public a setContentPositionMs(InterfaceC15673f interfaceC15673f) {
                this.f101620E = null;
                this.f101621F = interfaceC15673f;
                return this;
            }

            private a(C15674g c15674g) {
                this.f101630a = c15674g.f101590a;
                this.f101631b = c15674g.f101591b;
                this.f101632c = c15674g.f101592c;
                this.f101633d = c15674g.f101593d;
                this.f101634e = c15674g.f101594e;
                this.f101635f = c15674g.f101595f;
                this.f101636g = c15674g.f101596g;
                this.f101637h = c15674g.f101597h;
                this.f101638i = c15674g.f101598i;
                this.f101639j = c15674g.f101599j;
                this.f101640k = c15674g.f101600k;
                this.f101641l = c15674g.f101601l;
                this.f101642m = c15674g.f101602m;
                this.f101643n = c15674g.f101603n;
                this.f101644o = c15674g.f101604o;
                this.f101645p = c15674g.f101605p;
                this.f101646q = c15674g.f101606q;
                this.f101647r = c15674g.f101607r;
                this.f101648s = c15674g.f101608s;
                this.f101649t = c15674g.f101609t;
                this.f101650u = c15674g.f101610u;
                this.f101651v = c15674g.f101611v;
                this.f101652w = c15674g.f101612w;
                this.f101653x = c15674g.f101613x;
                this.f101654y = c15674g.f101614y;
                this.f101655z = c15674g.f101615z;
                this.f101616A = c15674g.f101578A;
                this.f101617B = c15674g.f101579B;
                this.f101618C = c15674g.f101580C;
                this.f101619D = c15674g.f101581D;
                this.f101620E = null;
                this.f101621F = c15674g.f101582E;
                this.f101622G = null;
                this.f101623H = c15674g.f101583F;
                this.f101624I = c15674g.f101584G;
                this.f101625J = c15674g.f101585H;
                this.f101626K = c15674g.f101586I;
                this.f101627L = c15674g.f101587J;
                this.f101628M = c15674g.f101588K;
                this.f101629N = c15674g.f101589L;
            }
        }

        public a buildUpon() {
            return new a();
        }

        public boolean equals(@hib Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C15674g)) {
                return false;
            }
            C15674g c15674g = (C15674g) obj;
            return this.f101591b == c15674g.f101591b && this.f101592c == c15674g.f101592c && this.f101590a.equals(c15674g.f101590a) && this.f101593d == c15674g.f101593d && this.f101594e == c15674g.f101594e && x0i.areEqual(this.f101595f, c15674g.f101595f) && this.f101596g == c15674g.f101596g && this.f101597h == c15674g.f101597h && this.f101598i == c15674g.f101598i && this.f101599j == c15674g.f101599j && this.f101600k == c15674g.f101600k && this.f101601l == c15674g.f101601l && this.f101602m.equals(c15674g.f101602m) && this.f101603n.equals(c15674g.f101603n) && this.f101604o.equals(c15674g.f101604o) && this.f101605p == c15674g.f101605p && this.f101606q.equals(c15674g.f101606q) && this.f101607r.equals(c15674g.f101607r) && this.f101608s.equals(c15674g.f101608s) && this.f101609t == c15674g.f101609t && this.f101610u == c15674g.f101610u && this.f101611v.equals(c15674g.f101611v) && this.f101612w == c15674g.f101612w && this.f101613x.equals(c15674g.f101613x) && this.f101614y.equals(c15674g.f101614y) && this.f101578A.equals(c15674g.f101578A) && this.f101579B == c15674g.f101579B && this.f101580C == c15674g.f101580C && this.f101581D == c15674g.f101581D && this.f101582E.equals(c15674g.f101582E) && this.f101583F.equals(c15674g.f101583F) && this.f101584G.equals(c15674g.f101584G) && this.f101585H.equals(c15674g.f101585H) && this.f101586I.equals(c15674g.f101586I) && this.f101587J == c15674g.f101587J && this.f101588K == c15674g.f101588K && this.f101589L == c15674g.f101589L;
        }

        public int hashCode() {
            int iHashCode = (((((((((217 + this.f101590a.hashCode()) * 31) + (this.f101591b ? 1 : 0)) * 31) + this.f101592c) * 31) + this.f101593d) * 31) + this.f101594e) * 31;
            lyc lycVar = this.f101595f;
            int iHashCode2 = (((((((iHashCode + (lycVar == null ? 0 : lycVar.hashCode())) * 31) + this.f101596g) * 31) + (this.f101597h ? 1 : 0)) * 31) + (this.f101598i ? 1 : 0)) * 31;
            long j = this.f101599j;
            int i = (iHashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.f101600k;
            int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            long j3 = this.f101601l;
            int iHashCode3 = (((((((((((((((((((((((((((((((((((((((((((((((((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + this.f101602m.hashCode()) * 31) + this.f101603n.hashCode()) * 31) + this.f101604o.hashCode()) * 31) + Float.floatToRawIntBits(this.f101605p)) * 31) + this.f101606q.hashCode()) * 31) + this.f101607r.hashCode()) * 31) + this.f101608s.hashCode()) * 31) + this.f101609t) * 31) + (this.f101610u ? 1 : 0)) * 31) + this.f101611v.hashCode()) * 31) + (this.f101612w ? 1 : 0)) * 31) + this.f101613x.hashCode()) * 31) + this.f101614y.hashCode()) * 31) + this.f101578A.hashCode()) * 31) + this.f101579B) * 31) + this.f101580C) * 31) + this.f101581D) * 31) + this.f101582E.hashCode()) * 31) + this.f101583F.hashCode()) * 31) + this.f101584G.hashCode()) * 31) + this.f101585H.hashCode()) * 31) + this.f101586I.hashCode()) * 31) + (this.f101587J ? 1 : 0)) * 31) + this.f101588K) * 31;
            long j4 = this.f101589L;
            return iHashCode3 + ((int) (j4 ^ (j4 >>> 32)));
        }

        private C15674g(a aVar) {
            int i;
            if (aVar.f101655z.isEmpty()) {
                u80.checkArgument(aVar.f101633d == 1 || aVar.f101633d == 4, "Empty playlist only allowed in STATE_IDLE or STATE_ENDED");
                u80.checkArgument(aVar.f101618C == -1 && aVar.f101619D == -1, "Ads not allowed if playlist is empty");
            } else {
                int i2 = aVar.f101617B;
                if (i2 == -1) {
                    i = 0;
                } else {
                    u80.checkArgument(aVar.f101617B < aVar.f101655z.getWindowCount(), "currentMediaItemIndex must be less than playlist.size()");
                    i = i2;
                }
                if (aVar.f101618C != -1) {
                    t1h.C12849b c12849b = new t1h.C12849b();
                    aVar.f101655z.getPeriod(yhf.getPeriodIndexFromWindowPosition(aVar.f101655z, i, aVar.f101620E != null ? aVar.f101620E.longValue() : aVar.f101621F.get(), new t1h.C12851d(), c12849b), c12849b);
                    u80.checkArgument(aVar.f101618C < c12849b.getAdGroupCount(), "PeriodData has less ad groups than adGroupIndex");
                    int adCountInAdGroup = c12849b.getAdCountInAdGroup(aVar.f101618C);
                    if (adCountInAdGroup != -1) {
                        u80.checkArgument(aVar.f101619D < adCountInAdGroup, "Ad group has less ads than adIndexInGroupIndex");
                    }
                }
            }
            if (aVar.f101635f != null) {
                u80.checkArgument(aVar.f101633d == 1, "Player error only allowed in STATE_IDLE");
            }
            if (aVar.f101633d == 1 || aVar.f101633d == 4) {
                u80.checkArgument(!aVar.f101638i, "isLoading only allowed when not in STATE_IDLE or STATE_ENDED");
            }
            InterfaceC15673f extrapolating = aVar.f101620E != null ? (aVar.f101618C == -1 && aVar.f101631b && aVar.f101633d == 3 && aVar.f101634e == 0 && aVar.f101620E.longValue() != -9223372036854775807L) ? InterfaceC15673f.getExtrapolating(aVar.f101620E.longValue(), aVar.f101642m.f76315a) : InterfaceC15673f.getConstant(aVar.f101620E.longValue()) : aVar.f101621F;
            InterfaceC15673f extrapolating2 = aVar.f101622G != null ? (aVar.f101618C != -1 && aVar.f101631b && aVar.f101633d == 3 && aVar.f101634e == 0) ? InterfaceC15673f.getExtrapolating(aVar.f101622G.longValue(), 1.0f) : InterfaceC15673f.getConstant(aVar.f101622G.longValue()) : aVar.f101623H;
            this.f101590a = aVar.f101630a;
            this.f101591b = aVar.f101631b;
            this.f101592c = aVar.f101632c;
            this.f101593d = aVar.f101633d;
            this.f101594e = aVar.f101634e;
            this.f101595f = aVar.f101635f;
            this.f101596g = aVar.f101636g;
            this.f101597h = aVar.f101637h;
            this.f101598i = aVar.f101638i;
            this.f101599j = aVar.f101639j;
            this.f101600k = aVar.f101640k;
            this.f101601l = aVar.f101641l;
            this.f101602m = aVar.f101642m;
            this.f101603n = aVar.f101643n;
            this.f101604o = aVar.f101644o;
            this.f101605p = aVar.f101645p;
            this.f101606q = aVar.f101646q;
            this.f101607r = aVar.f101647r;
            this.f101608s = aVar.f101648s;
            this.f101609t = aVar.f101649t;
            this.f101610u = aVar.f101650u;
            this.f101611v = aVar.f101651v;
            this.f101612w = aVar.f101652w;
            this.f101613x = aVar.f101653x;
            this.f101614y = aVar.f101654y;
            this.f101615z = aVar.f101655z;
            this.f101578A = aVar.f101616A;
            this.f101579B = aVar.f101617B;
            this.f101580C = aVar.f101618C;
            this.f101581D = aVar.f101619D;
            this.f101582E = extrapolating;
            this.f101583F = extrapolating2;
            this.f101584G = aVar.f101624I;
            this.f101585H = aVar.f101625J;
            this.f101586I = aVar.f101626K;
            this.f101587J = aVar.f101627L;
            this.f101588K = aVar.f101628M;
            this.f101589L = aVar.f101629N;
        }
    }

    public yhf(Looper looper) {
        this(looper, h52.f42390a);
    }

    private static C15674g buildStateForNewPosition(C15674g.a aVar, C15674g c15674g, long j, List<C15669b> list, int i, long j2, boolean z) {
        long positionOrDefaultInMediaItem = getPositionOrDefaultInMediaItem(j, c15674g);
        boolean z2 = false;
        if (!list.isEmpty() && (i == -1 || i >= list.size())) {
            j2 = -9223372036854775807L;
            i = 0;
        }
        if (!list.isEmpty() && j2 == -9223372036854775807L) {
            j2 = x0i.usToMs(list.get(i).f101542l);
        }
        boolean z3 = c15674g.f101614y.isEmpty() || list.isEmpty();
        if (!z3 && !c15674g.f101614y.get(getCurrentMediaItemIndexInternal(c15674g)).f101531a.equals(list.get(i).f101531a)) {
            z2 = true;
        }
        if (z3 || z2 || j2 < positionOrDefaultInMediaItem) {
            aVar.setCurrentMediaItemIndex(i).setCurrentAd(-1, -1).setContentPositionMs(j2).setContentBufferedPositionMs(InterfaceC15673f.getConstant(j2)).setTotalBufferedDurationMs(InterfaceC15673f.f101577a);
        } else if (j2 == positionOrDefaultInMediaItem) {
            aVar.setCurrentMediaItemIndex(i);
            if (c15674g.f101580C == -1 || !z) {
                aVar.setCurrentAd(-1, -1).setTotalBufferedDurationMs(InterfaceC15673f.getConstant(getContentBufferedPositionMsInternal(c15674g) - positionOrDefaultInMediaItem));
            } else {
                aVar.setTotalBufferedDurationMs(InterfaceC15673f.getConstant(c15674g.f101585H.get() - c15674g.f101583F.get()));
            }
        } else {
            aVar.setCurrentMediaItemIndex(i).setCurrentAd(-1, -1).setContentPositionMs(j2).setContentBufferedPositionMs(InterfaceC15673f.getConstant(Math.max(getContentBufferedPositionMsInternal(c15674g), j2))).setTotalBufferedDurationMs(InterfaceC15673f.getConstant(Math.max(0L, c15674g.f101586I.get() - (j2 - positionOrDefaultInMediaItem))));
        }
        return aVar.build();
    }

    private void clearVideoOutput(@hib Object obj) {
        verifyApplicationThreadAndInitState();
        final C15674g c15674g = this.f101529e1;
        if (shouldHandleCommand(27)) {
            updateStateForPendingOperation(m26006q0(obj), new lfg() { // from class: mgf
                @Override // p000.lfg
                public final Object get() {
                    return yhf.lambda$clearVideoOutput$21(c15674g);
                }
            });
        }
    }

    private static long getContentBufferedPositionMsInternal(C15674g c15674g) {
        return getPositionOrDefaultInMediaItem(c15674g.f101584G.get(), c15674g);
    }

    private static long getContentPositionMsInternal(C15674g c15674g) {
        return getPositionOrDefaultInMediaItem(c15674g.f101582E.get(), c15674g);
    }

    private static int getCurrentMediaItemIndexInternal(C15674g c15674g) {
        int i = c15674g.f101579B;
        if (i != -1) {
            return i;
        }
        return 0;
    }

    private static int getCurrentPeriodIndexInternal(C15674g c15674g, t1h.C12851d c12851d, t1h.C12849b c12849b) {
        int currentMediaItemIndexInternal = getCurrentMediaItemIndexInternal(c15674g);
        return c15674g.f101615z.isEmpty() ? currentMediaItemIndexInternal : getPeriodIndexFromWindowPosition(c15674g.f101615z, currentMediaItemIndexInternal, getContentPositionMsInternal(c15674g), c12851d, c12849b);
    }

    private static long getCurrentPeriodOrAdPositionMs(C15674g c15674g, Object obj, t1h.C12849b c12849b) {
        return c15674g.f101580C != -1 ? c15674g.f101583F.get() : getContentPositionMsInternal(c15674g) - c15674g.f101615z.getPeriodByUid(obj, c12849b).getPositionInWindowMs();
    }

    private static y7h getCurrentTracksInternal(C15674g c15674g) {
        return c15674g.f101614y.isEmpty() ? y7h.f100701b : c15674g.f101614y.get(getCurrentMediaItemIndexInternal(c15674g)).f101532b;
    }

    private static int getMediaItemIndexInNewPlaylist(List<C15669b> list, t1h t1hVar, int i, t1h.C12849b c12849b) {
        if (list.isEmpty()) {
            if (i < t1hVar.getWindowCount()) {
                return i;
            }
            return -1;
        }
        Object periodUid = list.get(i).getPeriodUid(0);
        if (t1hVar.getIndexOfPeriod(periodUid) == -1) {
            return -1;
        }
        return t1hVar.getPeriodByUid(periodUid, c12849b).f83398c;
    }

    private static int getMediaItemTransitionReason(C15674g c15674g, C15674g c15674g2, int i, boolean z, t1h.C12851d c12851d) {
        t1h t1hVar = c15674g.f101615z;
        t1h t1hVar2 = c15674g2.f101615z;
        if (t1hVar2.isEmpty() && t1hVar.isEmpty()) {
            return -1;
        }
        if (t1hVar2.isEmpty() != t1hVar.isEmpty()) {
            return 3;
        }
        Object obj = c15674g.f101615z.getWindow(getCurrentMediaItemIndexInternal(c15674g), c12851d).f83434a;
        Object obj2 = c15674g2.f101615z.getWindow(getCurrentMediaItemIndexInternal(c15674g2), c12851d).f83434a;
        if ((obj instanceof C15671d) && !(obj2 instanceof C15671d)) {
            return -1;
        }
        if (!obj.equals(obj2)) {
            if (i == 0) {
                return 1;
            }
            return i == 1 ? 2 : 3;
        }
        if (i != 0 || getContentPositionMsInternal(c15674g) <= getContentPositionMsInternal(c15674g2)) {
            return (i == 1 && z) ? 2 : -1;
        }
        return 0;
    }

    private static iga getMediaMetadataInternal(C15674g c15674g) {
        return c15674g.f101614y.isEmpty() ? iga.f46799B3 : c15674g.f101614y.get(getCurrentMediaItemIndexInternal(c15674g)).f101548r;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getPeriodIndexFromWindowPosition(t1h t1hVar, int i, long j, t1h.C12851d c12851d, t1h.C12849b c12849b) {
        return t1hVar.getIndexOfPeriod(t1hVar.getPeriodPositionUs(c12851d, c12849b, i, x0i.msToUs(j)).first);
    }

    private static long getPeriodOrAdDurationMs(C15674g c15674g, Object obj, t1h.C12849b c12849b) {
        c15674g.f101615z.getPeriodByUid(obj, c12849b);
        int i = c15674g.f101580C;
        return x0i.usToMs(i == -1 ? c12849b.f83399d : c12849b.getAdDurationUs(i, c15674g.f101581D));
    }

    private static int getPositionDiscontinuityReason(C15674g c15674g, C15674g c15674g2, boolean z, t1h.C12851d c12851d, t1h.C12849b c12849b) {
        if (c15674g2.f101587J) {
            return c15674g2.f101588K;
        }
        if (z) {
            return 1;
        }
        if (c15674g.f101614y.isEmpty()) {
            return -1;
        }
        if (c15674g2.f101614y.isEmpty()) {
            return 4;
        }
        Object uidOfPeriod = c15674g.f101615z.getUidOfPeriod(getCurrentPeriodIndexInternal(c15674g, c12851d, c12849b));
        Object uidOfPeriod2 = c15674g2.f101615z.getUidOfPeriod(getCurrentPeriodIndexInternal(c15674g2, c12851d, c12849b));
        if ((uidOfPeriod instanceof C15671d) && !(uidOfPeriod2 instanceof C15671d)) {
            return -1;
        }
        if (uidOfPeriod2.equals(uidOfPeriod) && c15674g.f101580C == c15674g2.f101580C && c15674g.f101581D == c15674g2.f101581D) {
            long currentPeriodOrAdPositionMs = getCurrentPeriodOrAdPositionMs(c15674g, uidOfPeriod, c12849b);
            if (Math.abs(currentPeriodOrAdPositionMs - getCurrentPeriodOrAdPositionMs(c15674g2, uidOfPeriod2, c12849b)) < 1000) {
                return -1;
            }
            long periodOrAdDurationMs = getPeriodOrAdDurationMs(c15674g, uidOfPeriod, c12849b);
            return (periodOrAdDurationMs == -9223372036854775807L || currentPeriodOrAdPositionMs < periodOrAdDurationMs) ? 5 : 0;
        }
        if (c15674g2.f101615z.getIndexOfPeriod(uidOfPeriod) == -1) {
            return 4;
        }
        long currentPeriodOrAdPositionMs2 = getCurrentPeriodOrAdPositionMs(c15674g, uidOfPeriod, c12849b);
        long periodOrAdDurationMs2 = getPeriodOrAdDurationMs(c15674g, uidOfPeriod, c12849b);
        return (periodOrAdDurationMs2 == -9223372036854775807L || currentPeriodOrAdPositionMs2 < periodOrAdDurationMs2) ? 3 : 0;
    }

    private static lzc.C9053k getPositionInfo(C15674g c15674g, boolean z, t1h.C12851d c12851d, t1h.C12849b c12849b) {
        Object obj;
        aga agaVar;
        Object obj2;
        int i;
        long j;
        long contentPositionMsInternal;
        int currentMediaItemIndexInternal = getCurrentMediaItemIndexInternal(c15674g);
        if (c15674g.f101615z.isEmpty()) {
            obj = null;
            agaVar = null;
            obj2 = null;
            i = -1;
        } else {
            int currentPeriodIndexInternal = getCurrentPeriodIndexInternal(c15674g, c12851d, c12849b);
            Object obj3 = c15674g.f101615z.getPeriod(currentPeriodIndexInternal, c12849b, true).f83397b;
            Object obj4 = c15674g.f101615z.getWindow(currentMediaItemIndexInternal, c12851d).f83434a;
            i = currentPeriodIndexInternal;
            agaVar = c12851d.f83436c;
            obj = obj4;
            obj2 = obj3;
        }
        if (z) {
            j = c15674g.f101589L;
            contentPositionMsInternal = c15674g.f101580C == -1 ? j : getContentPositionMsInternal(c15674g);
        } else {
            long contentPositionMsInternal2 = getContentPositionMsInternal(c15674g);
            j = c15674g.f101580C != -1 ? c15674g.f101583F.get() : contentPositionMsInternal2;
            contentPositionMsInternal = contentPositionMsInternal2;
        }
        return new lzc.C9053k(obj, currentMediaItemIndexInternal, agaVar, obj2, i, j, contentPositionMsInternal, c15674g.f101580C, c15674g.f101581D);
    }

    private static long getPositionOrDefaultInMediaItem(long j, C15674g c15674g) {
        if (j != -9223372036854775807L) {
            return j;
        }
        if (c15674g.f101614y.isEmpty()) {
            return 0L;
        }
        return x0i.usToMs(c15674g.f101614y.get(getCurrentMediaItemIndexInternal(c15674g)).f101542l);
    }

    private static C15674g getStateWithNewPlaylist(C15674g c15674g, List<C15669b> list, t1h.C12849b c12849b) {
        C15674g.a aVarBuildUpon = c15674g.buildUpon();
        aVarBuildUpon.setPlaylist(list);
        t1h t1hVar = aVarBuildUpon.f101655z;
        long j = c15674g.f101582E.get();
        int currentMediaItemIndexInternal = getCurrentMediaItemIndexInternal(c15674g);
        int mediaItemIndexInNewPlaylist = getMediaItemIndexInNewPlaylist(c15674g.f101614y, t1hVar, currentMediaItemIndexInternal, c12849b);
        long j2 = mediaItemIndexInNewPlaylist == -1 ? -9223372036854775807L : j;
        for (int i = currentMediaItemIndexInternal + 1; mediaItemIndexInNewPlaylist == -1 && i < c15674g.f101614y.size(); i++) {
            mediaItemIndexInNewPlaylist = getMediaItemIndexInNewPlaylist(c15674g.f101614y, t1hVar, i, c12849b);
        }
        if (c15674g.f101593d != 1 && mediaItemIndexInNewPlaylist == -1) {
            aVarBuildUpon.setPlaybackState(4).setIsLoading(false);
        }
        return buildStateForNewPosition(aVarBuildUpon, c15674g, j, list, mediaItemIndexInNewPlaylist, j2, true);
    }

    private static C15674g getStateWithNewPlaylistAndPosition(C15674g c15674g, List<C15669b> list, int i, long j) {
        C15674g.a aVarBuildUpon = c15674g.buildUpon();
        aVarBuildUpon.setPlaylist(list);
        if (c15674g.f101593d != 1) {
            if (list.isEmpty() || (i != -1 && i >= list.size())) {
                aVarBuildUpon.setPlaybackState(4).setIsLoading(false);
            } else {
                aVarBuildUpon.setPlaybackState(2);
            }
        }
        return buildStateForNewPosition(aVarBuildUpon, c15674g, c15674g.f101582E.get(), list, i, j, false);
    }

    private static ypf getSurfaceHolderSize(SurfaceHolder surfaceHolder) {
        if (!surfaceHolder.getSurface().isValid()) {
            return ypf.f102625d;
        }
        Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
        return new ypf(surfaceFrame.width(), surfaceFrame.height());
    }

    private static int getTimelineChangeReason(List<C15669b> list, List<C15669b> list2) {
        if (list.size() != list2.size()) {
            return 0;
        }
        int i = 0;
        while (true) {
            if (i >= list.size()) {
                return 1;
            }
            Object obj = list.get(i).f101531a;
            Object obj2 = list2.get(i).f101531a;
            boolean z = (obj instanceof C15671d) && !(obj2 instanceof C15671d);
            if (!obj.equals(obj2) && !z) {
                return 0;
            }
            i++;
        }
    }

    private static boolean isPlaying(C15674g c15674g) {
        return c15674g.f101591b && c15674g.f101593d == 3 && c15674g.f101594e == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ C15674g lambda$addMediaItems$3(C15674g c15674g, List list, int i) {
        ArrayList arrayList = new ArrayList(c15674g.f101614y);
        for (int i2 = 0; i2 < list.size(); i2++) {
            arrayList.add(i2 + i, m26002m0((aga) list.get(i2)));
        }
        return !c15674g.f101614y.isEmpty() ? getStateWithNewPlaylist(c15674g, arrayList, this.f101528d1) : getStateWithNewPlaylistAndPosition(c15674g, arrayList, c15674g.f101579B, c15674g.f101582E.get());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ C15674g lambda$clearVideoOutput$21(C15674g c15674g) {
        return c15674g.buildUpon().setSurfaceSize(ypf.f102625d).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ C15674g lambda$decreaseDeviceVolume$26(C15674g c15674g) {
        return c15674g.buildUpon().setDeviceVolume(Math.max(0, c15674g.f101609t - 1)).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ C15674g lambda$decreaseDeviceVolume$27(C15674g c15674g) {
        return c15674g.buildUpon().setDeviceVolume(Math.max(0, c15674g.f101609t - 1)).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ja9 lambda$handleReplaceMediaItems$30(ja9 ja9Var, Object obj) throws Exception {
        return ja9Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ C15674g lambda$increaseDeviceVolume$24(C15674g c15674g) {
        return c15674g.buildUpon().setDeviceVolume(c15674g.f101609t + 1).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ C15674g lambda$increaseDeviceVolume$25(C15674g c15674g) {
        return c15674g.buildUpon().setDeviceVolume(c15674g.f101609t + 1).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ C15674g lambda$moveMediaItems$4(C15674g c15674g, int i, int i2, int i3) {
        ArrayList arrayList = new ArrayList(c15674g.f101614y);
        x0i.moveItems(arrayList, i, i2, i3);
        return getStateWithNewPlaylist(c15674g, arrayList, this.f101528d1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(lzc.InterfaceC9049g interfaceC9049g, i36 i36Var) {
        interfaceC9049g.onEvents(this, new lzc.C9048f(i36Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ C15674g lambda$prepare$7(C15674g c15674g) {
        return c15674g.buildUpon().setPlayerError(null).setPlaybackState(c15674g.f101615z.isEmpty() ? 4 : 2).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ C15674g lambda$release$13(C15674g c15674g) {
        return c15674g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ C15674g lambda$removeMediaItems$6(C15674g c15674g, int i, int i2) {
        ArrayList arrayList = new ArrayList(c15674g.f101614y);
        x0i.removeRange(arrayList, i, i2);
        return getStateWithNewPlaylist(c15674g, arrayList, this.f101528d1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ C15674g lambda$replaceMediaItems$5(C15674g c15674g, List list, int i, int i2) {
        ArrayList arrayList = new ArrayList(c15674g.f101614y);
        for (int i3 = 0; i3 < list.size(); i3++) {
            arrayList.add(i3 + i, m26002m0((aga) list.get(i3)));
        }
        C15674g stateWithNewPlaylist = !c15674g.f101614y.isEmpty() ? getStateWithNewPlaylist(c15674g, arrayList, this.f101528d1) : getStateWithNewPlaylistAndPosition(c15674g, arrayList, c15674g.f101579B, c15674g.f101582E.get());
        if (i2 >= i) {
            return stateWithNewPlaylist;
        }
        x0i.removeRange(arrayList, i2, i);
        return getStateWithNewPlaylist(stateWithNewPlaylist, arrayList, this.f101528d1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ C15674g lambda$seekTo$10(C15674g c15674g, int i, long j) {
        return getStateWithNewPlaylistAndPosition(c15674g, c15674g.f101614y, i, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ C15674g lambda$setDeviceMuted$28(C15674g c15674g, boolean z) {
        return c15674g.buildUpon().setIsDeviceMuted(z).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ C15674g lambda$setDeviceMuted$29(C15674g c15674g, boolean z) {
        return c15674g.buildUpon().setIsDeviceMuted(z).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ C15674g lambda$setDeviceVolume$22(C15674g c15674g, int i) {
        return c15674g.buildUpon().setDeviceVolume(i).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ C15674g lambda$setDeviceVolume$23(C15674g c15674g, int i) {
        return c15674g.buildUpon().setDeviceVolume(i).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ C15674g lambda$setMediaItemsInternal$2(List list, C15674g c15674g, int i, long j) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            arrayList.add(m26002m0((aga) list.get(i2)));
        }
        return getStateWithNewPlaylistAndPosition(c15674g, arrayList, i, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ C15674g lambda$setPlayWhenReady$1(C15674g c15674g, boolean z) {
        return c15674g.buildUpon().setPlayWhenReady(z, 1).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ C15674g lambda$setPlaybackParameters$11(C15674g c15674g, qyc qycVar) {
        return c15674g.buildUpon().setPlaybackParameters(qycVar).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ C15674g lambda$setPlaylistMetadata$15(C15674g c15674g, iga igaVar) {
        return c15674g.buildUpon().setPlaylistMetadata(igaVar).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ C15674g lambda$setRepeatMode$8(C15674g c15674g, int i) {
        return c15674g.buildUpon().setRepeatMode(i).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ C15674g lambda$setShuffleModeEnabled$9(C15674g c15674g, boolean z) {
        return c15674g.buildUpon().setShuffleModeEnabled(z).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ C15674g lambda$setTrackSelectionParameters$14(C15674g c15674g, j7h j7hVar) {
        return c15674g.buildUpon().setTrackSelectionParameters(j7hVar).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ C15674g lambda$setVideoSurface$17(C15674g c15674g) {
        return c15674g.buildUpon().setSurfaceSize(ypf.f102624c).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ C15674g lambda$setVideoSurfaceHolder$18(C15674g c15674g, SurfaceHolder surfaceHolder) {
        return c15674g.buildUpon().setSurfaceSize(getSurfaceHolderSize(surfaceHolder)).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ C15674g lambda$setVideoSurfaceView$19(C15674g c15674g, SurfaceView surfaceView) {
        return c15674g.buildUpon().setSurfaceSize(getSurfaceHolderSize(surfaceView.getHolder())).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ C15674g lambda$setVideoTextureView$20(C15674g c15674g, ypf ypfVar) {
        return c15674g.buildUpon().setSurfaceSize(ypfVar).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ C15674g lambda$setVolume$16(C15674g c15674g, float f) {
        return c15674g.buildUpon().setVolume(f).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ C15674g lambda$stop$12(C15674g c15674g) {
        return c15674g.buildUpon().setPlaybackState(1).setTotalBufferedDurationMs(InterfaceC15673f.f101577a).setContentBufferedPositionMs(InterfaceC15673f.getConstant(getContentPositionMsInternal(c15674g))).setAdBufferedPositionMs(c15674g.f101583F).setIsLoading(false).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateStateAndInformListeners$31(C15674g c15674g, int i, lzc.InterfaceC9049g interfaceC9049g) {
        interfaceC9049g.onTimelineChanged(c15674g.f101615z, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateStateAndInformListeners$32(int i, lzc.C9053k c9053k, lzc.C9053k c9053k2, lzc.InterfaceC9049g interfaceC9049g) {
        interfaceC9049g.onPositionDiscontinuity(i);
        interfaceC9049g.onPositionDiscontinuity(c9053k, c9053k2, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateStateAndInformListeners$34(C15674g c15674g, lzc.InterfaceC9049g interfaceC9049g) {
        interfaceC9049g.onPlayerErrorChanged(c15674g.f101595f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateStateAndInformListeners$35(C15674g c15674g, lzc.InterfaceC9049g interfaceC9049g) {
        interfaceC9049g.onPlayerError((lyc) x0i.castNonNull(c15674g.f101595f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateStateAndInformListeners$36(C15674g c15674g, lzc.InterfaceC9049g interfaceC9049g) {
        interfaceC9049g.onTrackSelectionParametersChanged(c15674g.f101603n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateStateAndInformListeners$39(C15674g c15674g, lzc.InterfaceC9049g interfaceC9049g) {
        interfaceC9049g.onLoadingChanged(c15674g.f101598i);
        interfaceC9049g.onIsLoadingChanged(c15674g.f101598i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateStateAndInformListeners$40(C15674g c15674g, lzc.InterfaceC9049g interfaceC9049g) {
        interfaceC9049g.onPlayerStateChanged(c15674g.f101591b, c15674g.f101593d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateStateAndInformListeners$41(C15674g c15674g, lzc.InterfaceC9049g interfaceC9049g) {
        interfaceC9049g.onPlaybackStateChanged(c15674g.f101593d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateStateAndInformListeners$42(C15674g c15674g, lzc.InterfaceC9049g interfaceC9049g) {
        interfaceC9049g.onPlayWhenReadyChanged(c15674g.f101591b, c15674g.f101592c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateStateAndInformListeners$43(C15674g c15674g, lzc.InterfaceC9049g interfaceC9049g) {
        interfaceC9049g.onPlaybackSuppressionReasonChanged(c15674g.f101594e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateStateAndInformListeners$44(C15674g c15674g, lzc.InterfaceC9049g interfaceC9049g) {
        interfaceC9049g.onIsPlayingChanged(isPlaying(c15674g));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateStateAndInformListeners$45(C15674g c15674g, lzc.InterfaceC9049g interfaceC9049g) {
        interfaceC9049g.onPlaybackParametersChanged(c15674g.f101602m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateStateAndInformListeners$46(C15674g c15674g, lzc.InterfaceC9049g interfaceC9049g) {
        interfaceC9049g.onRepeatModeChanged(c15674g.f101596g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateStateAndInformListeners$47(C15674g c15674g, lzc.InterfaceC9049g interfaceC9049g) {
        interfaceC9049g.onShuffleModeEnabledChanged(c15674g.f101597h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateStateAndInformListeners$48(C15674g c15674g, lzc.InterfaceC9049g interfaceC9049g) {
        interfaceC9049g.onSeekBackIncrementChanged(c15674g.f101599j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateStateAndInformListeners$49(C15674g c15674g, lzc.InterfaceC9049g interfaceC9049g) {
        interfaceC9049g.onSeekForwardIncrementChanged(c15674g.f101600k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateStateAndInformListeners$50(C15674g c15674g, lzc.InterfaceC9049g interfaceC9049g) {
        interfaceC9049g.onMaxSeekToPreviousPositionChanged(c15674g.f101601l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateStateAndInformListeners$51(C15674g c15674g, lzc.InterfaceC9049g interfaceC9049g) {
        interfaceC9049g.onAudioAttributesChanged(c15674g.f101604o);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateStateAndInformListeners$52(C15674g c15674g, lzc.InterfaceC9049g interfaceC9049g) {
        interfaceC9049g.onVideoSizeChanged(c15674g.f101606q);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateStateAndInformListeners$53(C15674g c15674g, lzc.InterfaceC9049g interfaceC9049g) {
        interfaceC9049g.onDeviceInfoChanged(c15674g.f101608s);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateStateAndInformListeners$54(C15674g c15674g, lzc.InterfaceC9049g interfaceC9049g) {
        interfaceC9049g.onPlaylistMetadataChanged(c15674g.f101578A);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateStateAndInformListeners$55(C15674g c15674g, lzc.InterfaceC9049g interfaceC9049g) {
        interfaceC9049g.onSurfaceSizeChanged(c15674g.f101611v.getWidth(), c15674g.f101611v.getHeight());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateStateAndInformListeners$56(C15674g c15674g, lzc.InterfaceC9049g interfaceC9049g) {
        interfaceC9049g.onVolumeChanged(c15674g.f101605p);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateStateAndInformListeners$57(C15674g c15674g, lzc.InterfaceC9049g interfaceC9049g) {
        interfaceC9049g.onDeviceVolumeChanged(c15674g.f101609t, c15674g.f101610u);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateStateAndInformListeners$58(C15674g c15674g, lzc.InterfaceC9049g interfaceC9049g) {
        interfaceC9049g.onCues(c15674g.f101607r.f100826a);
        interfaceC9049g.onCues(c15674g.f101607r);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateStateAndInformListeners$59(C15674g c15674g, lzc.InterfaceC9049g interfaceC9049g) {
        interfaceC9049g.onMetadata(c15674g.f101613x);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateStateAndInformListeners$60(C15674g c15674g, lzc.InterfaceC9049g interfaceC9049g) {
        interfaceC9049g.onAvailableCommandsChanged(c15674g.f101590a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateStateForPendingOperation$61(ja9 ja9Var) {
        x0i.castNonNull(this.f101529e1);
        this.f101527c1.remove(ja9Var);
        if (!this.f101527c1.isEmpty() || this.f101530f1) {
            return;
        }
        updateStateAndInformListeners(m26004o0(), false, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void postOrRunOnApplicationHandler(Runnable runnable) {
        if (this.f101526b1.getLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            this.f101526b1.post(runnable);
        }
    }

    @g5e({"state"})
    private void setMediaItemsInternal(final List<aga> list, final int i, final long j) {
        u80.checkArgument(i == -1 || i >= 0);
        final C15674g c15674g = this.f101529e1;
        if (shouldHandleCommand(20) || (list.size() == 1 && shouldHandleCommand(31))) {
            updateStateForPendingOperation(m25991B0(list, i, j), new lfg() { // from class: ygf
                @Override // p000.lfg
                public final Object get() {
                    return this.f101443a.lambda$setMediaItemsInternal$2(list, c15674g, i, j);
                }
            });
        }
    }

    @g5e({"state"})
    private boolean shouldHandleCommand(int i) {
        return !this.f101530f1 && this.f101529e1.f101590a.contains(i);
    }

    @g5e({"state"})
    private void updateStateAndInformListeners(final C15674g c15674g, boolean z, boolean z2) {
        C15674g c15674g2 = this.f101529e1;
        this.f101529e1 = c15674g;
        if (c15674g.f101587J || c15674g.f101612w) {
            this.f101529e1 = c15674g.buildUpon().clearPositionDiscontinuity().setNewlyRenderedFirstFrame(false).build();
        }
        boolean z3 = c15674g2.f101591b != c15674g.f101591b;
        boolean z4 = c15674g2.f101593d != c15674g.f101593d;
        y7h currentTracksInternal = getCurrentTracksInternal(c15674g2);
        final y7h currentTracksInternal2 = getCurrentTracksInternal(c15674g);
        iga mediaMetadataInternal = getMediaMetadataInternal(c15674g2);
        final iga mediaMetadataInternal2 = getMediaMetadataInternal(c15674g);
        final int positionDiscontinuityReason = getPositionDiscontinuityReason(c15674g2, c15674g, z, this.f11826Y0, this.f101528d1);
        boolean zEquals = c15674g2.f101615z.equals(c15674g.f101615z);
        final int mediaItemTransitionReason = getMediaItemTransitionReason(c15674g2, c15674g, positionDiscontinuityReason, z2, this.f11826Y0);
        if (!zEquals) {
            final int timelineChangeReason = getTimelineChangeReason(c15674g2.f101614y, c15674g.f101614y);
            this.f101524Z0.queueEvent(0, new za9.InterfaceC16057a() { // from class: nhf
                @Override // p000.za9.InterfaceC16057a
                public final void invoke(Object obj) {
                    yhf.lambda$updateStateAndInformListeners$31(c15674g, timelineChangeReason, (lzc.InterfaceC9049g) obj);
                }
            });
        }
        if (positionDiscontinuityReason != -1) {
            final lzc.C9053k positionInfo = getPositionInfo(c15674g2, false, this.f11826Y0, this.f101528d1);
            final lzc.C9053k positionInfo2 = getPositionInfo(c15674g, c15674g.f101587J, this.f11826Y0, this.f101528d1);
            this.f101524Z0.queueEvent(11, new za9.InterfaceC16057a() { // from class: odf
                @Override // p000.za9.InterfaceC16057a
                public final void invoke(Object obj) {
                    yhf.lambda$updateStateAndInformListeners$32(positionDiscontinuityReason, positionInfo, positionInfo2, (lzc.InterfaceC9049g) obj);
                }
            });
        }
        if (mediaItemTransitionReason != -1) {
            final aga agaVar = c15674g.f101615z.isEmpty() ? null : c15674g.f101614y.get(getCurrentMediaItemIndexInternal(c15674g)).f101533c;
            this.f101524Z0.queueEvent(1, new za9.InterfaceC16057a() { // from class: kef
                @Override // p000.za9.InterfaceC16057a
                public final void invoke(Object obj) {
                    ((lzc.InterfaceC9049g) obj).onMediaItemTransition(agaVar, mediaItemTransitionReason);
                }
            });
        }
        if (!x0i.areEqual(c15674g2.f101595f, c15674g.f101595f)) {
            this.f101524Z0.queueEvent(10, new za9.InterfaceC16057a() { // from class: pef
                @Override // p000.za9.InterfaceC16057a
                public final void invoke(Object obj) {
                    yhf.lambda$updateStateAndInformListeners$34(c15674g, (lzc.InterfaceC9049g) obj);
                }
            });
            if (c15674g.f101595f != null) {
                this.f101524Z0.queueEvent(10, new za9.InterfaceC16057a() { // from class: sef
                    @Override // p000.za9.InterfaceC16057a
                    public final void invoke(Object obj) {
                        yhf.lambda$updateStateAndInformListeners$35(c15674g, (lzc.InterfaceC9049g) obj);
                    }
                });
            }
        }
        if (!c15674g2.f101603n.equals(c15674g.f101603n)) {
            this.f101524Z0.queueEvent(19, new za9.InterfaceC16057a() { // from class: uef
                @Override // p000.za9.InterfaceC16057a
                public final void invoke(Object obj) {
                    yhf.lambda$updateStateAndInformListeners$36(c15674g, (lzc.InterfaceC9049g) obj);
                }
            });
        }
        if (!currentTracksInternal.equals(currentTracksInternal2)) {
            this.f101524Z0.queueEvent(2, new za9.InterfaceC16057a() { // from class: wef
                @Override // p000.za9.InterfaceC16057a
                public final void invoke(Object obj) {
                    ((lzc.InterfaceC9049g) obj).onTracksChanged(currentTracksInternal2);
                }
            });
        }
        if (!mediaMetadataInternal.equals(mediaMetadataInternal2)) {
            this.f101524Z0.queueEvent(14, new za9.InterfaceC16057a() { // from class: yef
                @Override // p000.za9.InterfaceC16057a
                public final void invoke(Object obj) {
                    ((lzc.InterfaceC9049g) obj).onMediaMetadataChanged(mediaMetadataInternal2);
                }
            });
        }
        if (c15674g2.f101598i != c15674g.f101598i) {
            this.f101524Z0.queueEvent(3, new za9.InterfaceC16057a() { // from class: aff
                @Override // p000.za9.InterfaceC16057a
                public final void invoke(Object obj) {
                    yhf.lambda$updateStateAndInformListeners$39(c15674g, (lzc.InterfaceC9049g) obj);
                }
            });
        }
        if (z3 || z4) {
            this.f101524Z0.queueEvent(-1, new za9.InterfaceC16057a() { // from class: cff
                @Override // p000.za9.InterfaceC16057a
                public final void invoke(Object obj) {
                    yhf.lambda$updateStateAndInformListeners$40(c15674g, (lzc.InterfaceC9049g) obj);
                }
            });
        }
        if (z4) {
            this.f101524Z0.queueEvent(4, new za9.InterfaceC16057a() { // from class: phf
                @Override // p000.za9.InterfaceC16057a
                public final void invoke(Object obj) {
                    yhf.lambda$updateStateAndInformListeners$41(c15674g, (lzc.InterfaceC9049g) obj);
                }
            });
        }
        if (z3 || c15674g2.f101592c != c15674g.f101592c) {
            this.f101524Z0.queueEvent(5, new za9.InterfaceC16057a() { // from class: rhf
                @Override // p000.za9.InterfaceC16057a
                public final void invoke(Object obj) {
                    yhf.lambda$updateStateAndInformListeners$42(c15674g, (lzc.InterfaceC9049g) obj);
                }
            });
        }
        if (c15674g2.f101594e != c15674g.f101594e) {
            this.f101524Z0.queueEvent(6, new za9.InterfaceC16057a() { // from class: xcf
                @Override // p000.za9.InterfaceC16057a
                public final void invoke(Object obj) {
                    yhf.lambda$updateStateAndInformListeners$43(c15674g, (lzc.InterfaceC9049g) obj);
                }
            });
        }
        if (isPlaying(c15674g2) != isPlaying(c15674g)) {
            this.f101524Z0.queueEvent(7, new za9.InterfaceC16057a() { // from class: adf
                @Override // p000.za9.InterfaceC16057a
                public final void invoke(Object obj) {
                    yhf.lambda$updateStateAndInformListeners$44(c15674g, (lzc.InterfaceC9049g) obj);
                }
            });
        }
        if (!c15674g2.f101602m.equals(c15674g.f101602m)) {
            this.f101524Z0.queueEvent(12, new za9.InterfaceC16057a() { // from class: cdf
                @Override // p000.za9.InterfaceC16057a
                public final void invoke(Object obj) {
                    yhf.lambda$updateStateAndInformListeners$45(c15674g, (lzc.InterfaceC9049g) obj);
                }
            });
        }
        if (c15674g2.f101596g != c15674g.f101596g) {
            this.f101524Z0.queueEvent(8, new za9.InterfaceC16057a() { // from class: edf
                @Override // p000.za9.InterfaceC16057a
                public final void invoke(Object obj) {
                    yhf.lambda$updateStateAndInformListeners$46(c15674g, (lzc.InterfaceC9049g) obj);
                }
            });
        }
        if (c15674g2.f101597h != c15674g.f101597h) {
            this.f101524Z0.queueEvent(9, new za9.InterfaceC16057a() { // from class: gdf
                @Override // p000.za9.InterfaceC16057a
                public final void invoke(Object obj) {
                    yhf.lambda$updateStateAndInformListeners$47(c15674g, (lzc.InterfaceC9049g) obj);
                }
            });
        }
        if (c15674g2.f101599j != c15674g.f101599j) {
            this.f101524Z0.queueEvent(16, new za9.InterfaceC16057a() { // from class: idf
                @Override // p000.za9.InterfaceC16057a
                public final void invoke(Object obj) {
                    yhf.lambda$updateStateAndInformListeners$48(c15674g, (lzc.InterfaceC9049g) obj);
                }
            });
        }
        if (c15674g2.f101600k != c15674g.f101600k) {
            this.f101524Z0.queueEvent(17, new za9.InterfaceC16057a() { // from class: kdf
                @Override // p000.za9.InterfaceC16057a
                public final void invoke(Object obj) {
                    yhf.lambda$updateStateAndInformListeners$49(c15674g, (lzc.InterfaceC9049g) obj);
                }
            });
        }
        if (c15674g2.f101601l != c15674g.f101601l) {
            this.f101524Z0.queueEvent(18, new za9.InterfaceC16057a() { // from class: mdf
                @Override // p000.za9.InterfaceC16057a
                public final void invoke(Object obj) {
                    yhf.lambda$updateStateAndInformListeners$50(c15674g, (lzc.InterfaceC9049g) obj);
                }
            });
        }
        if (!c15674g2.f101604o.equals(c15674g.f101604o)) {
            this.f101524Z0.queueEvent(20, new za9.InterfaceC16057a() { // from class: qdf
                @Override // p000.za9.InterfaceC16057a
                public final void invoke(Object obj) {
                    yhf.lambda$updateStateAndInformListeners$51(c15674g, (lzc.InterfaceC9049g) obj);
                }
            });
        }
        if (!c15674g2.f101606q.equals(c15674g.f101606q)) {
            this.f101524Z0.queueEvent(25, new za9.InterfaceC16057a() { // from class: tdf
                @Override // p000.za9.InterfaceC16057a
                public final void invoke(Object obj) {
                    yhf.lambda$updateStateAndInformListeners$52(c15674g, (lzc.InterfaceC9049g) obj);
                }
            });
        }
        if (!c15674g2.f101608s.equals(c15674g.f101608s)) {
            this.f101524Z0.queueEvent(29, new za9.InterfaceC16057a() { // from class: wdf
                @Override // p000.za9.InterfaceC16057a
                public final void invoke(Object obj) {
                    yhf.lambda$updateStateAndInformListeners$53(c15674g, (lzc.InterfaceC9049g) obj);
                }
            });
        }
        if (!c15674g2.f101578A.equals(c15674g.f101578A)) {
            this.f101524Z0.queueEvent(15, new za9.InterfaceC16057a() { // from class: ydf
                @Override // p000.za9.InterfaceC16057a
                public final void invoke(Object obj) {
                    yhf.lambda$updateStateAndInformListeners$54(c15674g, (lzc.InterfaceC9049g) obj);
                }
            });
        }
        if (c15674g.f101612w) {
            this.f101524Z0.queueEvent(26, new se5());
        }
        if (!c15674g2.f101611v.equals(c15674g.f101611v)) {
            this.f101524Z0.queueEvent(24, new za9.InterfaceC16057a() { // from class: aef
                @Override // p000.za9.InterfaceC16057a
                public final void invoke(Object obj) {
                    yhf.lambda$updateStateAndInformListeners$55(c15674g, (lzc.InterfaceC9049g) obj);
                }
            });
        }
        if (c15674g2.f101605p != c15674g.f101605p) {
            this.f101524Z0.queueEvent(22, new za9.InterfaceC16057a() { // from class: cef
                @Override // p000.za9.InterfaceC16057a
                public final void invoke(Object obj) {
                    yhf.lambda$updateStateAndInformListeners$56(c15674g, (lzc.InterfaceC9049g) obj);
                }
            });
        }
        if (c15674g2.f101609t != c15674g.f101609t || c15674g2.f101610u != c15674g.f101610u) {
            this.f101524Z0.queueEvent(30, new za9.InterfaceC16057a() { // from class: eef
                @Override // p000.za9.InterfaceC16057a
                public final void invoke(Object obj) {
                    yhf.lambda$updateStateAndInformListeners$57(c15674g, (lzc.InterfaceC9049g) obj);
                }
            });
        }
        if (!c15674g2.f101607r.equals(c15674g.f101607r)) {
            this.f101524Z0.queueEvent(27, new za9.InterfaceC16057a() { // from class: gef
                @Override // p000.za9.InterfaceC16057a
                public final void invoke(Object obj) {
                    yhf.lambda$updateStateAndInformListeners$58(c15674g, (lzc.InterfaceC9049g) obj);
                }
            });
        }
        if (!c15674g2.f101613x.equals(c15674g.f101613x) && c15674g.f101613x.f19555b != -9223372036854775807L) {
            this.f101524Z0.queueEvent(28, new za9.InterfaceC16057a() { // from class: ief
                @Override // p000.za9.InterfaceC16057a
                public final void invoke(Object obj) {
                    yhf.lambda$updateStateAndInformListeners$59(c15674g, (lzc.InterfaceC9049g) obj);
                }
            });
        }
        if (!c15674g2.f101590a.equals(c15674g.f101590a)) {
            this.f101524Z0.queueEvent(13, new za9.InterfaceC16057a() { // from class: mef
                @Override // p000.za9.InterfaceC16057a
                public final void invoke(Object obj) {
                    yhf.lambda$updateStateAndInformListeners$60(c15674g, (lzc.InterfaceC9049g) obj);
                }
            });
        }
        this.f101524Z0.flushEvents();
    }

    @g5e({"state"})
    private void updateStateForPendingOperation(ja9<?> ja9Var, lfg<C15674g> lfgVar) {
        updateStateForPendingOperation(ja9Var, lfgVar, false, false);
    }

    @z25({"state"})
    private void verifyApplicationThreadAndInitState() {
        if (Thread.currentThread() != this.f101525a1.getThread()) {
            throw new IllegalStateException(x0i.formatInvariant("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), this.f101525a1.getThread().getName()));
        }
        if (this.f101529e1 == null) {
            this.f101529e1 = m26004o0();
        }
    }

    @vp6
    /* JADX INFO: renamed from: A0 */
    public ja9<?> m25990A0(@h78(from = 0) int i, int i2) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_SET_DEVICE_VOLUME or COMMAND_SET_DEVICE_VOLUME_WITH_FLAGS");
    }

    @vp6
    /* JADX INFO: renamed from: B0 */
    public ja9<?> m25991B0(List<aga> list, int i, long j) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_SET_MEDIA_ITEM(S)");
    }

    @vp6
    /* JADX INFO: renamed from: C0 */
    public ja9<?> m25992C0(boolean z) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_PLAY_PAUSE");
    }

    @vp6
    /* JADX INFO: renamed from: D0 */
    public ja9<?> m25993D0(qyc qycVar) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_SET_SPEED_AND_PITCH");
    }

    @vp6
    /* JADX INFO: renamed from: E0 */
    public ja9<?> m25994E0(iga igaVar) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_SET_PLAYLIST_METADATA");
    }

    @vp6
    /* JADX INFO: renamed from: F0 */
    public ja9<?> m25995F0(int i) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_SET_REPEAT_MODE");
    }

    @vp6
    /* JADX INFO: renamed from: G0 */
    public ja9<?> m25996G0(boolean z) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_SET_SHUFFLE_MODE");
    }

    @vp6
    /* JADX INFO: renamed from: H0 */
    public ja9<?> m25997H0(j7h j7hVar) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_SET_TRACK_SELECTION_PARAMETERS");
    }

    @vp6
    /* JADX INFO: renamed from: I0 */
    public ja9<?> m25998I0(Object obj) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_SET_VIDEO_SURFACE");
    }

    @vp6
    /* JADX INFO: renamed from: J0 */
    public ja9<?> m25999J0(@y46(from = 0.0d, m25645to = 1.0d) float f) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_SET_VOLUME");
    }

    @vp6
    /* JADX INFO: renamed from: K0 */
    public ja9<?> m26000K0() {
        throw new IllegalStateException("Missing implementation to handle COMMAND_STOP");
    }

    /* JADX INFO: renamed from: L0 */
    public final void m26001L0() {
        verifyApplicationThreadAndInitState();
        if (!this.f101527c1.isEmpty() || this.f101530f1) {
            return;
        }
        updateStateAndInformListeners(m26004o0(), false, false);
    }

    @Override // p000.lzc
    public final void addListener(lzc.InterfaceC9049g interfaceC9049g) {
        this.f101524Z0.add((lzc.InterfaceC9049g) u80.checkNotNull(interfaceC9049g));
    }

    @Override // p000.lzc
    public final void addMediaItems(int i, final List<aga> list) {
        verifyApplicationThreadAndInitState();
        u80.checkArgument(i >= 0);
        final C15674g c15674g = this.f101529e1;
        int size = c15674g.f101614y.size();
        if (!shouldHandleCommand(20) || list.isEmpty()) {
            return;
        }
        final int iMin = Math.min(i, size);
        updateStateForPendingOperation(m26005p0(iMin, list), new lfg() { // from class: vcf
            @Override // p000.lfg
            public final Object get() {
                return this.f90691a.lambda$addMediaItems$3(c15674g, list, iMin);
            }
        });
    }

    @Override // p000.lzc
    public final void clearVideoSurface() {
        clearVideoOutput(null);
    }

    @Override // p000.lzc
    public final void clearVideoSurfaceHolder(@hib SurfaceHolder surfaceHolder) {
        clearVideoOutput(surfaceHolder);
    }

    @Override // p000.lzc
    public final void clearVideoSurfaceView(@hib SurfaceView surfaceView) {
        clearVideoOutput(surfaceView);
    }

    @Override // p000.lzc
    public final void clearVideoTextureView(@hib TextureView textureView) {
        clearVideoOutput(textureView);
    }

    @Override // p000.lzc
    @Deprecated
    public final void decreaseDeviceVolume() {
        verifyApplicationThreadAndInitState();
        final C15674g c15674g = this.f101529e1;
        if (shouldHandleCommand(26)) {
            updateStateForPendingOperation(m26007r0(1), new lfg() { // from class: yff
                @Override // p000.lfg
                public final Object get() {
                    return yhf.lambda$decreaseDeviceVolume$26(c15674g);
                }
            });
        }
    }

    @Override // p000.lzc
    public final Looper getApplicationLooper() {
        return this.f101525a1;
    }

    @Override // p000.lzc
    public final yc0 getAudioAttributes() {
        verifyApplicationThreadAndInitState();
        return this.f101529e1.f101604o;
    }

    @Override // p000.lzc
    public final lzc.C9045c getAvailableCommands() {
        verifyApplicationThreadAndInitState();
        return this.f101529e1.f101590a;
    }

    @Override // p000.lzc
    public final long getBufferedPosition() {
        verifyApplicationThreadAndInitState();
        return isPlayingAd() ? Math.max(this.f101529e1.f101585H.get(), this.f101529e1.f101583F.get()) : getContentBufferedPosition();
    }

    @Override // p000.lzc
    public final long getContentBufferedPosition() {
        verifyApplicationThreadAndInitState();
        return Math.max(getContentBufferedPositionMsInternal(this.f101529e1), getContentPositionMsInternal(this.f101529e1));
    }

    @Override // p000.lzc
    public final long getContentPosition() {
        verifyApplicationThreadAndInitState();
        return getContentPositionMsInternal(this.f101529e1);
    }

    @Override // p000.lzc
    public final int getCurrentAdGroupIndex() {
        verifyApplicationThreadAndInitState();
        return this.f101529e1.f101580C;
    }

    @Override // p000.lzc
    public final int getCurrentAdIndexInAdGroup() {
        verifyApplicationThreadAndInitState();
        return this.f101529e1.f101581D;
    }

    @Override // p000.lzc
    public final y93 getCurrentCues() {
        verifyApplicationThreadAndInitState();
        return this.f101529e1.f101607r;
    }

    @Override // p000.lzc
    public final int getCurrentMediaItemIndex() {
        verifyApplicationThreadAndInitState();
        return getCurrentMediaItemIndexInternal(this.f101529e1);
    }

    @Override // p000.lzc
    public final int getCurrentPeriodIndex() {
        verifyApplicationThreadAndInitState();
        return getCurrentPeriodIndexInternal(this.f101529e1, this.f11826Y0, this.f101528d1);
    }

    @Override // p000.lzc
    public final long getCurrentPosition() {
        verifyApplicationThreadAndInitState();
        return isPlayingAd() ? this.f101529e1.f101583F.get() : getContentPosition();
    }

    @Override // p000.lzc
    public final t1h getCurrentTimeline() {
        verifyApplicationThreadAndInitState();
        return this.f101529e1.f101615z;
    }

    @Override // p000.lzc
    public final y7h getCurrentTracks() {
        verifyApplicationThreadAndInitState();
        return getCurrentTracksInternal(this.f101529e1);
    }

    @Override // p000.lzc
    public final p84 getDeviceInfo() {
        verifyApplicationThreadAndInitState();
        return this.f101529e1.f101608s;
    }

    @Override // p000.lzc
    public final int getDeviceVolume() {
        verifyApplicationThreadAndInitState();
        return this.f101529e1.f101609t;
    }

    @Override // p000.lzc
    public final long getDuration() {
        verifyApplicationThreadAndInitState();
        if (!isPlayingAd()) {
            return getContentDuration();
        }
        this.f101529e1.f101615z.getPeriod(getCurrentPeriodIndex(), this.f101528d1);
        t1h.C12849b c12849b = this.f101528d1;
        C15674g c15674g = this.f101529e1;
        return x0i.usToMs(c12849b.getAdDurationUs(c15674g.f101580C, c15674g.f101581D));
    }

    @Override // p000.lzc
    public final long getMaxSeekToPreviousPosition() {
        verifyApplicationThreadAndInitState();
        return this.f101529e1.f101601l;
    }

    @Override // p000.lzc
    public final iga getMediaMetadata() {
        verifyApplicationThreadAndInitState();
        return getMediaMetadataInternal(this.f101529e1);
    }

    @Override // p000.lzc
    public final boolean getPlayWhenReady() {
        verifyApplicationThreadAndInitState();
        return this.f101529e1.f101591b;
    }

    @Override // p000.lzc
    public final qyc getPlaybackParameters() {
        verifyApplicationThreadAndInitState();
        return this.f101529e1.f101602m;
    }

    @Override // p000.lzc
    public final int getPlaybackState() {
        verifyApplicationThreadAndInitState();
        return this.f101529e1.f101593d;
    }

    @Override // p000.lzc
    public final int getPlaybackSuppressionReason() {
        verifyApplicationThreadAndInitState();
        return this.f101529e1.f101594e;
    }

    @Override // p000.lzc
    @hib
    public final lyc getPlayerError() {
        verifyApplicationThreadAndInitState();
        return this.f101529e1.f101595f;
    }

    @Override // p000.lzc
    public final iga getPlaylistMetadata() {
        verifyApplicationThreadAndInitState();
        return this.f101529e1.f101578A;
    }

    @Override // p000.lzc
    public final int getRepeatMode() {
        verifyApplicationThreadAndInitState();
        return this.f101529e1.f101596g;
    }

    @Override // p000.lzc
    public final long getSeekBackIncrement() {
        verifyApplicationThreadAndInitState();
        return this.f101529e1.f101599j;
    }

    @Override // p000.lzc
    public final long getSeekForwardIncrement() {
        verifyApplicationThreadAndInitState();
        return this.f101529e1.f101600k;
    }

    @Override // p000.lzc
    public final boolean getShuffleModeEnabled() {
        verifyApplicationThreadAndInitState();
        return this.f101529e1.f101597h;
    }

    @Override // p000.lzc
    public final ypf getSurfaceSize() {
        verifyApplicationThreadAndInitState();
        return this.f101529e1.f101611v;
    }

    @Override // p000.lzc
    public final long getTotalBufferedDuration() {
        verifyApplicationThreadAndInitState();
        return this.f101529e1.f101586I.get();
    }

    @Override // p000.lzc
    public final j7h getTrackSelectionParameters() {
        verifyApplicationThreadAndInitState();
        return this.f101529e1.f101603n;
    }

    @Override // p000.lzc
    public final z7i getVideoSize() {
        verifyApplicationThreadAndInitState();
        return this.f101529e1.f101606q;
    }

    @Override // p000.lzc
    public final float getVolume() {
        verifyApplicationThreadAndInitState();
        return this.f101529e1.f101605p;
    }

    @Override // p000.lzc
    @Deprecated
    public final void increaseDeviceVolume() {
        verifyApplicationThreadAndInitState();
        final C15674g c15674g = this.f101529e1;
        if (shouldHandleCommand(26)) {
            updateStateForPendingOperation(m26008s0(1), new lfg() { // from class: zcf
                @Override // p000.lfg
                public final Object get() {
                    return yhf.lambda$increaseDeviceVolume$24(c15674g);
                }
            });
        }
    }

    @Override // p000.lzc
    public final boolean isDeviceMuted() {
        verifyApplicationThreadAndInitState();
        return this.f101529e1.f101610u;
    }

    @Override // p000.lzc
    public final boolean isLoading() {
        verifyApplicationThreadAndInitState();
        return this.f101529e1.f101598i;
    }

    @Override // p000.lzc
    public final boolean isPlayingAd() {
        verifyApplicationThreadAndInitState();
        return this.f101529e1.f101580C != -1;
    }

    @vp6
    /* JADX INFO: renamed from: m0 */
    public C15669b m26002m0(aga agaVar) {
        return new C15669b.a(new C15671d()).setMediaItem(agaVar).setIsDynamic(true).setIsPlaceholder(true).build();
    }

    @Override // p000.lzc
    public final void moveMediaItems(final int i, int i2, int i3) {
        verifyApplicationThreadAndInitState();
        u80.checkArgument(i >= 0 && i2 >= i && i3 >= 0);
        final C15674g c15674g = this.f101529e1;
        int size = c15674g.f101614y.size();
        if (!shouldHandleCommand(20) || size == 0 || i >= size) {
            return;
        }
        final int iMin = Math.min(i2, size);
        final int iMin2 = Math.min(i3, c15674g.f101614y.size() - (iMin - i));
        if (i == iMin || iMin2 == i) {
            return;
        }
        updateStateForPendingOperation(m26009t0(i, iMin, iMin2), new lfg() { // from class: fhf
            @Override // p000.lfg
            public final Object get() {
                return this.f36606a.lambda$moveMediaItems$4(c15674g, i, iMin, iMin2);
            }
        });
    }

    @vp6
    /* JADX INFO: renamed from: n0 */
    public C15674g m26003n0(C15674g c15674g) {
        return c15674g;
    }

    @vp6
    /* JADX INFO: renamed from: o0 */
    public abstract C15674g m26004o0();

    @vp6
    /* JADX INFO: renamed from: p0 */
    public ja9<?> m26005p0(int i, List<aga> list) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_CHANGE_MEDIA_ITEMS");
    }

    @Override // p000.lzc
    public final void prepare() {
        verifyApplicationThreadAndInitState();
        final C15674g c15674g = this.f101529e1;
        if (shouldHandleCommand(2)) {
            updateStateForPendingOperation(m26010u0(), new lfg() { // from class: wff
                @Override // p000.lfg
                public final Object get() {
                    return yhf.lambda$prepare$7(c15674g);
                }
            });
        }
    }

    @vp6
    /* JADX INFO: renamed from: q0 */
    public ja9<?> m26006q0(@hib Object obj) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_SET_VIDEO_SURFACE");
    }

    @vp6
    /* JADX INFO: renamed from: r0 */
    public ja9<?> m26007r0(int i) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_ADJUST_DEVICE_VOLUME or COMMAND_ADJUST_DEVICE_VOLUME_WITH_FLAGS");
    }

    @Override // p000.lzc
    public final void release() {
        verifyApplicationThreadAndInitState();
        final C15674g c15674g = this.f101529e1;
        if (shouldHandleCommand(32)) {
            updateStateForPendingOperation(m26011v0(), new lfg() { // from class: gff
                @Override // p000.lfg
                public final Object get() {
                    return yhf.lambda$release$13(c15674g);
                }
            });
            this.f101530f1 = true;
            this.f101524Z0.release();
            this.f101529e1 = this.f101529e1.buildUpon().setPlaybackState(1).setTotalBufferedDurationMs(InterfaceC15673f.f101577a).setContentBufferedPositionMs(InterfaceC15673f.getConstant(getContentPositionMsInternal(c15674g))).setAdBufferedPositionMs(c15674g.f101583F).setIsLoading(false).build();
        }
    }

    @Override // p000.lzc
    public final void removeListener(lzc.InterfaceC9049g interfaceC9049g) {
        verifyApplicationThreadAndInitState();
        this.f101524Z0.remove(interfaceC9049g);
    }

    @Override // p000.lzc
    public final void removeMediaItems(final int i, int i2) {
        final int iMin;
        verifyApplicationThreadAndInitState();
        u80.checkArgument(i >= 0 && i2 >= i);
        final C15674g c15674g = this.f101529e1;
        int size = c15674g.f101614y.size();
        if (!shouldHandleCommand(20) || size == 0 || i >= size || i == (iMin = Math.min(i2, size))) {
            return;
        }
        updateStateForPendingOperation(m26012w0(i, iMin), new lfg() { // from class: sgf
            @Override // p000.lfg
            public final Object get() {
                return this.f81742a.lambda$removeMediaItems$6(c15674g, i, iMin);
            }
        });
    }

    @Override // p000.lzc
    public final void replaceMediaItems(final int i, int i2, final List<aga> list) {
        verifyApplicationThreadAndInitState();
        u80.checkArgument(i >= 0 && i <= i2);
        final C15674g c15674g = this.f101529e1;
        int size = c15674g.f101614y.size();
        if (!shouldHandleCommand(20) || i > size) {
            return;
        }
        final int iMin = Math.min(i2, size);
        updateStateForPendingOperation(m26013x0(i, iMin, list), new lfg() { // from class: lhf
            @Override // p000.lfg
            public final Object get() {
                return this.f57637a.lambda$replaceMediaItems$5(c15674g, list, iMin, i);
            }
        });
    }

    @vp6
    /* JADX INFO: renamed from: s0 */
    public ja9<?> m26008s0(int i) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_ADJUST_DEVICE_VOLUME or COMMAND_ADJUST_DEVICE_VOLUME_WITH_FLAGS");
    }

    @Override // p000.at0
    @fdi(otherwise = 4)
    public final void seekTo(final int i, final long j, int i2, boolean z) {
        verifyApplicationThreadAndInitState();
        u80.checkArgument(i >= 0);
        final C15674g c15674g = this.f101529e1;
        if (!shouldHandleCommand(i2) || isPlayingAd()) {
            return;
        }
        if (c15674g.f101614y.isEmpty() || i < c15674g.f101614y.size()) {
            updateStateForPendingOperation(m26014y0(i, j, i2), new lfg() { // from class: egf
                @Override // p000.lfg
                public final Object get() {
                    return yhf.lambda$seekTo$10(c15674g, i, j);
                }
            }, true, z);
        }
    }

    @Override // p000.lzc
    @Deprecated
    public final void setDeviceMuted(final boolean z) {
        verifyApplicationThreadAndInitState();
        final C15674g c15674g = this.f101529e1;
        if (shouldHandleCommand(26)) {
            updateStateForPendingOperation(m26015z0(z, 1), new lfg() { // from class: kgf
                @Override // p000.lfg
                public final Object get() {
                    return yhf.lambda$setDeviceMuted$28(c15674g, z);
                }
            });
        }
    }

    @Override // p000.lzc
    @Deprecated
    public final void setDeviceVolume(final int i) {
        verifyApplicationThreadAndInitState();
        final C15674g c15674g = this.f101529e1;
        if (shouldHandleCommand(25)) {
            updateStateForPendingOperation(m25990A0(i, 1), new lfg() { // from class: nff
                @Override // p000.lfg
                public final Object get() {
                    return yhf.lambda$setDeviceVolume$22(c15674g, i);
                }
            });
        }
    }

    @Override // p000.lzc
    public final void setMediaItems(List<aga> list, boolean z) {
        verifyApplicationThreadAndInitState();
        setMediaItemsInternal(list, z ? -1 : this.f101529e1.f101579B, z ? -9223372036854775807L : this.f101529e1.f101582E.get());
    }

    @Override // p000.lzc
    public final void setPlayWhenReady(final boolean z) {
        verifyApplicationThreadAndInitState();
        final C15674g c15674g = this.f101529e1;
        if (shouldHandleCommand(1)) {
            updateStateForPendingOperation(m25992C0(z), new lfg() { // from class: eff
                @Override // p000.lfg
                public final Object get() {
                    return yhf.lambda$setPlayWhenReady$1(c15674g, z);
                }
            });
        }
    }

    @Override // p000.lzc
    public final void setPlaybackParameters(final qyc qycVar) {
        verifyApplicationThreadAndInitState();
        final C15674g c15674g = this.f101529e1;
        if (shouldHandleCommand(13)) {
            updateStateForPendingOperation(m25993D0(qycVar), new lfg() { // from class: ahf
                @Override // p000.lfg
                public final Object get() {
                    return yhf.lambda$setPlaybackParameters$11(c15674g, qycVar);
                }
            });
        }
    }

    @Override // p000.lzc
    public final void setPlaylistMetadata(final iga igaVar) {
        verifyApplicationThreadAndInitState();
        final C15674g c15674g = this.f101529e1;
        if (shouldHandleCommand(19)) {
            updateStateForPendingOperation(m25994E0(igaVar), new lfg() { // from class: qgf
                @Override // p000.lfg
                public final Object get() {
                    return yhf.lambda$setPlaylistMetadata$15(c15674g, igaVar);
                }
            });
        }
    }

    @Override // p000.lzc
    public final void setRepeatMode(final int i) {
        verifyApplicationThreadAndInitState();
        final C15674g c15674g = this.f101529e1;
        if (shouldHandleCommand(15)) {
            updateStateForPendingOperation(m25995F0(i), new lfg() { // from class: sff
                @Override // p000.lfg
                public final Object get() {
                    return yhf.lambda$setRepeatMode$8(c15674g, i);
                }
            });
        }
    }

    @Override // p000.lzc
    public final void setShuffleModeEnabled(final boolean z) {
        verifyApplicationThreadAndInitState();
        final C15674g c15674g = this.f101529e1;
        if (shouldHandleCommand(14)) {
            updateStateForPendingOperation(m25996G0(z), new lfg() { // from class: ref
                @Override // p000.lfg
                public final Object get() {
                    return yhf.lambda$setShuffleModeEnabled$9(c15674g, z);
                }
            });
        }
    }

    @Override // p000.lzc
    public final void setTrackSelectionParameters(final j7h j7hVar) {
        verifyApplicationThreadAndInitState();
        final C15674g c15674g = this.f101529e1;
        if (shouldHandleCommand(29)) {
            updateStateForPendingOperation(m25997H0(j7hVar), new lfg() { // from class: dhf
                @Override // p000.lfg
                public final Object get() {
                    return yhf.lambda$setTrackSelectionParameters$14(c15674g, j7hVar);
                }
            });
        }
    }

    @Override // p000.lzc
    public final void setVideoSurface(@hib Surface surface) {
        verifyApplicationThreadAndInitState();
        final C15674g c15674g = this.f101529e1;
        if (shouldHandleCommand(27)) {
            if (surface == null) {
                clearVideoSurface();
            } else {
                updateStateForPendingOperation(m25998I0(surface), new lfg() { // from class: off
                    @Override // p000.lfg
                    public final Object get() {
                        return yhf.lambda$setVideoSurface$17(c15674g);
                    }
                });
            }
        }
    }

    @Override // p000.lzc
    public final void setVideoSurfaceHolder(@hib final SurfaceHolder surfaceHolder) {
        verifyApplicationThreadAndInitState();
        final C15674g c15674g = this.f101529e1;
        if (shouldHandleCommand(27)) {
            if (surfaceHolder == null) {
                clearVideoSurface();
            } else {
                updateStateForPendingOperation(m25998I0(surfaceHolder), new lfg() { // from class: wgf
                    @Override // p000.lfg
                    public final Object get() {
                        return yhf.lambda$setVideoSurfaceHolder$18(c15674g, surfaceHolder);
                    }
                });
            }
        }
    }

    @Override // p000.lzc
    public final void setVideoSurfaceView(@hib final SurfaceView surfaceView) {
        verifyApplicationThreadAndInitState();
        final C15674g c15674g = this.f101529e1;
        if (shouldHandleCommand(27)) {
            if (surfaceView == null) {
                clearVideoSurface();
            } else {
                updateStateForPendingOperation(m25998I0(surfaceView), new lfg() { // from class: vdf
                    @Override // p000.lfg
                    public final Object get() {
                        return yhf.lambda$setVideoSurfaceView$19(c15674g, surfaceView);
                    }
                });
            }
        }
    }

    @Override // p000.lzc
    public final void setVideoTextureView(@hib TextureView textureView) {
        verifyApplicationThreadAndInitState();
        final C15674g c15674g = this.f101529e1;
        if (shouldHandleCommand(27)) {
            if (textureView == null) {
                clearVideoSurface();
            } else {
                final ypf ypfVar = textureView.isAvailable() ? new ypf(textureView.getWidth(), textureView.getHeight()) : ypf.f102625d;
                updateStateForPendingOperation(m25998I0(textureView), new lfg() { // from class: jgf
                    @Override // p000.lfg
                    public final Object get() {
                        return yhf.lambda$setVideoTextureView$20(c15674g, ypfVar);
                    }
                });
            }
        }
    }

    @Override // p000.lzc
    public final void setVolume(final float f) {
        verifyApplicationThreadAndInitState();
        final C15674g c15674g = this.f101529e1;
        if (shouldHandleCommand(24)) {
            updateStateForPendingOperation(m25999J0(f), new lfg() { // from class: lff
                @Override // p000.lfg
                public final Object get() {
                    return yhf.lambda$setVolume$16(c15674g, f);
                }
            });
        }
    }

    @Override // p000.lzc
    public final void stop() {
        verifyApplicationThreadAndInitState();
        final C15674g c15674g = this.f101529e1;
        if (shouldHandleCommand(3)) {
            updateStateForPendingOperation(m26000K0(), new lfg() { // from class: uff
                @Override // p000.lfg
                public final Object get() {
                    return yhf.lambda$stop$12(c15674g);
                }
            });
        }
    }

    @vp6
    /* JADX INFO: renamed from: t0 */
    public ja9<?> m26009t0(int i, int i2, int i3) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_CHANGE_MEDIA_ITEMS");
    }

    @vp6
    /* JADX INFO: renamed from: u0 */
    public ja9<?> m26010u0() {
        throw new IllegalStateException("Missing implementation to handle COMMAND_PREPARE");
    }

    @vp6
    /* JADX INFO: renamed from: v0 */
    public ja9<?> m26011v0() {
        throw new IllegalStateException("Missing implementation to handle COMMAND_RELEASE");
    }

    @vp6
    /* JADX INFO: renamed from: w0 */
    public ja9<?> m26012w0(int i, int i2) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_CHANGE_MEDIA_ITEMS");
    }

    @vp6
    /* JADX INFO: renamed from: x0 */
    public ja9<?> m26013x0(int i, int i2, List<aga> list) {
        ja9<?> ja9VarM26005p0 = m26005p0(i2, list);
        final ja9<?> ja9VarM26012w0 = m26012w0(i, i2);
        return x0i.transformFutureAsync(ja9VarM26005p0, new v90() { // from class: ogf
            @Override // p000.v90
            public final ja9 apply(Object obj) {
                return yhf.lambda$handleReplaceMediaItems$30(ja9VarM26012w0, obj);
            }
        });
    }

    @vp6
    /* JADX INFO: renamed from: y0 */
    public ja9<?> m26014y0(int i, long j, int i2) {
        throw new IllegalStateException("Missing implementation to handle one of the COMMAND_SEEK_*");
    }

    @vp6
    /* JADX INFO: renamed from: z0 */
    public ja9<?> m26015z0(boolean z, int i) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_ADJUST_DEVICE_VOLUME or COMMAND_ADJUST_DEVICE_VOLUME_WITH_FLAGS");
    }

    public yhf(Looper looper, h52 h52Var) {
        this.f101525a1 = looper;
        this.f101526b1 = h52Var.createHandler(looper, null);
        this.f101527c1 = new HashSet<>();
        this.f101528d1 = new t1h.C12849b();
        this.f101524Z0 = new za9<>(looper, h52Var, new za9.InterfaceC16058b() { // from class: hhf
            @Override // p000.za9.InterfaceC16058b
            public final void invoke(Object obj, i36 i36Var) {
                this.f43654a.lambda$new$0((lzc.InterfaceC9049g) obj, i36Var);
            }
        });
    }

    @g5e({"state"})
    private void updateStateForPendingOperation(final ja9<?> ja9Var, lfg<C15674g> lfgVar, boolean z, boolean z2) {
        if (ja9Var.isDone() && this.f101527c1.isEmpty()) {
            updateStateAndInformListeners(m26004o0(), z, z2);
            return;
        }
        this.f101527c1.add(ja9Var);
        updateStateAndInformListeners(m26003n0(lfgVar.get()), z, z2);
        ja9Var.addListener(new Runnable() { // from class: agf
            @Override // java.lang.Runnable
            public final void run() {
                this.f1585a.lambda$updateStateForPendingOperation$61(ja9Var);
            }
        }, new Executor() { // from class: cgf
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                this.f16497a.postOrRunOnApplicationHandler(runnable);
            }
        });
    }

    @Override // p000.lzc
    public final void clearVideoSurface(@hib Surface surface) {
        clearVideoOutput(surface);
    }

    @Override // p000.lzc
    public final void setMediaItems(List<aga> list, int i, long j) {
        verifyApplicationThreadAndInitState();
        if (i == -1) {
            C15674g c15674g = this.f101529e1;
            int i2 = c15674g.f101579B;
            long j2 = c15674g.f101582E.get();
            i = i2;
            j = j2;
        }
        setMediaItemsInternal(list, i, j);
    }

    @Override // p000.lzc
    public final void decreaseDeviceVolume(int i) {
        verifyApplicationThreadAndInitState();
        final C15674g c15674g = this.f101529e1;
        if (shouldHandleCommand(34)) {
            updateStateForPendingOperation(m26007r0(i), new lfg() { // from class: iff
                @Override // p000.lfg
                public final Object get() {
                    return yhf.lambda$decreaseDeviceVolume$27(c15674g);
                }
            });
        }
    }

    @Override // p000.lzc
    public final void increaseDeviceVolume(int i) {
        verifyApplicationThreadAndInitState();
        final C15674g c15674g = this.f101529e1;
        if (shouldHandleCommand(34)) {
            updateStateForPendingOperation(m26008s0(i), new lfg() { // from class: qff
                @Override // p000.lfg
                public final Object get() {
                    return yhf.lambda$increaseDeviceVolume$25(c15674g);
                }
            });
        }
    }

    @Override // p000.lzc
    public final void setDeviceMuted(final boolean z, int i) {
        verifyApplicationThreadAndInitState();
        final C15674g c15674g = this.f101529e1;
        if (shouldHandleCommand(34)) {
            updateStateForPendingOperation(m26015z0(z, i), new lfg() { // from class: ugf
                @Override // p000.lfg
                public final Object get() {
                    return yhf.lambda$setDeviceMuted$29(c15674g, z);
                }
            });
        }
    }

    @Override // p000.lzc
    public final void setDeviceVolume(final int i, int i2) {
        verifyApplicationThreadAndInitState();
        final C15674g c15674g = this.f101529e1;
        if (shouldHandleCommand(33)) {
            updateStateForPendingOperation(m25990A0(i, i2), new lfg() { // from class: hgf
                @Override // p000.lfg
                public final Object get() {
                    return yhf.lambda$setDeviceVolume$23(c15674g, i);
                }
            });
        }
    }
}
