package p000;

import android.graphics.Rect;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.media3.common.C1213a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import p000.eta;
import p000.hga;
import p000.izc;
import p000.kx7;
import p000.nfa;
import p000.q1h;
import p000.thf;
import p000.x7h;
import p000.ya9;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public abstract class thf extends bt0 {

    /* JADX INFO: renamed from: k1 */
    public static final long f84745k1 = 1000;

    /* JADX INFO: renamed from: d1 */
    public final ya9<izc.InterfaceC7680g> f84746d1;

    /* JADX INFO: renamed from: e1 */
    public final Looper f84747e1;

    /* JADX INFO: renamed from: f1 */
    public final oe7 f84748f1;

    /* JADX INFO: renamed from: g1 */
    public final HashSet<ja9<?>> f84749g1;

    /* JADX INFO: renamed from: h1 */
    public final q1h.C11270b f84750h1;

    /* JADX INFO: renamed from: i1 */
    public C13049h f84751i1;

    /* JADX INFO: renamed from: j1 */
    public boolean f84752j1;

    /* JADX INFO: renamed from: thf$b */
    public static final class C13043b implements InterfaceC13048g {

        /* JADX INFO: renamed from: b */
        public final InterfaceC13048g f84753b;

        /* JADX INFO: renamed from: c */
        public long f84754c = -9223372036854775807L;

        public C13043b(InterfaceC13048g interfaceC13048g) {
            this.f84753b = interfaceC13048g;
        }

        public void disconnect(long j) {
            this.f84754c = j;
        }

        @Override // p000.thf.InterfaceC13048g
        public long get() {
            long j = this.f84754c;
            return j != -9223372036854775807L ? j : this.f84753b.get();
        }
    }

    /* JADX INFO: renamed from: thf$c */
    public static final class C13044c {

        /* JADX INFO: renamed from: a */
        public final Object f84755a;

        /* JADX INFO: renamed from: b */
        public final x7h f84756b;

        /* JADX INFO: renamed from: c */
        public final nfa f84757c;

        /* JADX INFO: renamed from: d */
        @hib
        public final hga f84758d;

        /* JADX INFO: renamed from: e */
        @hib
        public final Object f84759e;

        /* JADX INFO: renamed from: f */
        @hib
        public final nfa.C9855g f84760f;

        /* JADX INFO: renamed from: g */
        public final long f84761g;

        /* JADX INFO: renamed from: h */
        public final long f84762h;

        /* JADX INFO: renamed from: i */
        public final long f84763i;

        /* JADX INFO: renamed from: j */
        public final boolean f84764j;

        /* JADX INFO: renamed from: k */
        public final boolean f84765k;

        /* JADX INFO: renamed from: l */
        public final long f84766l;

        /* JADX INFO: renamed from: m */
        public final long f84767m;

        /* JADX INFO: renamed from: n */
        public final long f84768n;

        /* JADX INFO: renamed from: o */
        public final boolean f84769o;

        /* JADX INFO: renamed from: p */
        public final kx7<C13045d> f84770p;

        /* JADX INFO: renamed from: q */
        public final long[] f84771q;

        /* JADX INFO: renamed from: thf$c$a */
        public static final class a {

            /* JADX INFO: renamed from: a */
            public Object f84772a;

            /* JADX INFO: renamed from: b */
            public x7h f84773b;

            /* JADX INFO: renamed from: c */
            public nfa f84774c;

            /* JADX INFO: renamed from: d */
            @hib
            public hga f84775d;

            /* JADX INFO: renamed from: e */
            @hib
            public Object f84776e;

            /* JADX INFO: renamed from: f */
            @hib
            public nfa.C9855g f84777f;

            /* JADX INFO: renamed from: g */
            public long f84778g;

            /* JADX INFO: renamed from: h */
            public long f84779h;

            /* JADX INFO: renamed from: i */
            public long f84780i;

            /* JADX INFO: renamed from: j */
            public boolean f84781j;

            /* JADX INFO: renamed from: k */
            public boolean f84782k;

            /* JADX INFO: renamed from: l */
            public long f84783l;

            /* JADX INFO: renamed from: m */
            public long f84784m;

            /* JADX INFO: renamed from: n */
            public long f84785n;

            /* JADX INFO: renamed from: o */
            public boolean f84786o;

            /* JADX INFO: renamed from: p */
            public kx7<C13045d> f84787p;

            public C13044c build() {
                return new C13044c(this);
            }

            @op1
            public a setDefaultPositionUs(long j) {
                v80.checkArgument(j >= 0);
                this.f84783l = j;
                return this;
            }

            @op1
            public a setDurationUs(long j) {
                v80.checkArgument(j == -9223372036854775807L || j >= 0);
                this.f84784m = j;
                return this;
            }

            @op1
            public a setElapsedRealtimeEpochOffsetMs(long j) {
                this.f84780i = j;
                return this;
            }

            @op1
            public a setIsDynamic(boolean z) {
                this.f84782k = z;
                return this;
            }

            @op1
            public a setIsPlaceholder(boolean z) {
                this.f84786o = z;
                return this;
            }

            @op1
            public a setIsSeekable(boolean z) {
                this.f84781j = z;
                return this;
            }

            @op1
            public a setLiveConfiguration(@hib nfa.C9855g c9855g) {
                this.f84777f = c9855g;
                return this;
            }

            @op1
            public a setManifest(@hib Object obj) {
                this.f84776e = obj;
                return this;
            }

            @op1
            public a setMediaItem(nfa nfaVar) {
                this.f84774c = nfaVar;
                return this;
            }

            @op1
            public a setMediaMetadata(@hib hga hgaVar) {
                this.f84775d = hgaVar;
                return this;
            }

            @op1
            public a setPeriods(List<C13045d> list) {
                int size = list.size();
                int i = 0;
                while (i < size - 1) {
                    v80.checkArgument(list.get(i).f84789b != -9223372036854775807L, "Periods other than last need a duration");
                    int i2 = i + 1;
                    for (int i3 = i2; i3 < size; i3++) {
                        v80.checkArgument(!list.get(i).f84788a.equals(list.get(i3).f84788a), "Duplicate PeriodData UIDs in period list");
                    }
                    i = i2;
                }
                this.f84787p = kx7.copyOf((Collection) list);
                return this;
            }

            @op1
            public a setPositionInFirstPeriodUs(long j) {
                v80.checkArgument(j >= 0);
                this.f84785n = j;
                return this;
            }

            @op1
            public a setPresentationStartTimeMs(long j) {
                this.f84778g = j;
                return this;
            }

            @op1
            public a setTracks(x7h x7hVar) {
                this.f84773b = x7hVar;
                return this;
            }

            @op1
            public a setUid(Object obj) {
                this.f84772a = obj;
                return this;
            }

            @op1
            public a setWindowStartTimeMs(long j) {
                this.f84779h = j;
                return this;
            }

            public a(Object obj) {
                this.f84772a = obj;
                this.f84773b = x7h.f97105b;
                this.f84774c = nfa.f64297j;
                this.f84775d = null;
                this.f84776e = null;
                this.f84777f = null;
                this.f84778g = -9223372036854775807L;
                this.f84779h = -9223372036854775807L;
                this.f84780i = -9223372036854775807L;
                this.f84781j = false;
                this.f84782k = false;
                this.f84783l = 0L;
                this.f84784m = -9223372036854775807L;
                this.f84785n = 0L;
                this.f84786o = false;
                this.f84787p = kx7.m15110of();
            }

            private a(C13044c c13044c) {
                this.f84772a = c13044c.f84755a;
                this.f84773b = c13044c.f84756b;
                this.f84774c = c13044c.f84757c;
                this.f84775d = c13044c.f84758d;
                this.f84776e = c13044c.f84759e;
                this.f84777f = c13044c.f84760f;
                this.f84778g = c13044c.f84761g;
                this.f84779h = c13044c.f84762h;
                this.f84780i = c13044c.f84763i;
                this.f84781j = c13044c.f84764j;
                this.f84782k = c13044c.f84765k;
                this.f84783l = c13044c.f84766l;
                this.f84784m = c13044c.f84767m;
                this.f84785n = c13044c.f84768n;
                this.f84786o = c13044c.f84769o;
                this.f84787p = c13044c.f84770p;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static C13044c buildFromState(C13049h c13049h, int i, q1h.C11270b c11270b, q1h.C11272d c11272d) {
            boolean z = thf.getCurrentMediaItemIndexInternal(c13049h) == i;
            c13049h.f84839y.getWindow(i, c11272d);
            kx7.C8541a c8541aBuilder = kx7.builder();
            for (int i2 = c11272d.f72984n; i2 <= c11272d.f72985o; i2++) {
                c13049h.f84839y.getPeriod(i2, c11270b, true);
                c8541aBuilder.add(new C13045d.a(v80.checkNotNull(c11270b.f72945b)).setAdPlaybackState(c11270b.f72950g).setDurationUs(c11270b.f72947d).setIsPlaceholder(c11270b.f72949f).build());
            }
            return new a(c11272d.f72971a).setDefaultPositionUs(c11272d.f72982l).setDurationUs(c11272d.f72983m).setElapsedRealtimeEpochOffsetMs(c11272d.f72977g).setIsDynamic(c11272d.f72979i).setIsPlaceholder(c11272d.f72981k).setIsSeekable(c11272d.f72978h).setLiveConfiguration(c11272d.f72980j).setManifest(c11272d.f72974d).setMediaItem(c11272d.f72973c).setMediaMetadata(z ? c13049h.f84801A : null).setPeriods(c8541aBuilder.build()).setPositionInFirstPeriodUs(c11272d.f72986p).setPresentationStartTimeMs(c11272d.f72975e).setTracks(z ? c13049h.f84840z : x7h.f97105b).setWindowStartTimeMs(c11272d.f72976f).build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public q1h.C11270b getPeriod(int i, int i2, q1h.C11270b c11270b) {
            if (this.f84770p.isEmpty()) {
                Object obj = this.f84755a;
                long j = this.f84768n;
                c11270b.set(obj, obj, i, j + this.f84767m, -j, C9343mf.f60836l, this.f84769o);
            } else {
                C13045d c13045d = this.f84770p.get(i2);
                Object obj2 = c13045d.f84788a;
                c11270b.set(obj2, Pair.create(this.f84755a, obj2), i, c13045d.f84789b, this.f84771q[i2], c13045d.f84790c, c13045d.f84791d);
            }
            return c11270b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Object getPeriodUid(int i) {
            if (this.f84770p.isEmpty()) {
                return this.f84755a;
            }
            return Pair.create(this.f84755a, this.f84770p.get(i).f84788a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public q1h.C11272d getWindow(int i, q1h.C11272d c11272d) {
            c11272d.set(this.f84755a, this.f84757c, this.f84759e, this.f84761g, this.f84762h, this.f84763i, this.f84764j, this.f84765k, this.f84760f, this.f84766l, this.f84767m, i, (i + (this.f84770p.isEmpty() ? 1 : this.f84770p.size())) - 1, this.f84768n);
            c11272d.f72981k = this.f84769o;
            return c11272d;
        }

        public a buildUpon() {
            return new a();
        }

        public boolean equals(@hib Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C13044c)) {
                return false;
            }
            C13044c c13044c = (C13044c) obj;
            return this.f84755a.equals(c13044c.f84755a) && this.f84756b.equals(c13044c.f84756b) && this.f84757c.equals(c13044c.f84757c) && Objects.equals(this.f84758d, c13044c.f84758d) && Objects.equals(this.f84759e, c13044c.f84759e) && Objects.equals(this.f84760f, c13044c.f84760f) && this.f84761g == c13044c.f84761g && this.f84762h == c13044c.f84762h && this.f84763i == c13044c.f84763i && this.f84764j == c13044c.f84764j && this.f84765k == c13044c.f84765k && this.f84766l == c13044c.f84766l && this.f84767m == c13044c.f84767m && this.f84768n == c13044c.f84768n && this.f84769o == c13044c.f84769o && this.f84770p.equals(c13044c.f84770p);
        }

        public int hashCode() {
            int iHashCode = (((((217 + this.f84755a.hashCode()) * 31) + this.f84756b.hashCode()) * 31) + this.f84757c.hashCode()) * 31;
            hga hgaVar = this.f84758d;
            int iHashCode2 = (iHashCode + (hgaVar == null ? 0 : hgaVar.hashCode())) * 31;
            Object obj = this.f84759e;
            int iHashCode3 = (iHashCode2 + (obj == null ? 0 : obj.hashCode())) * 31;
            nfa.C9855g c9855g = this.f84760f;
            int iHashCode4 = (iHashCode3 + (c9855g != null ? c9855g.hashCode() : 0)) * 31;
            long j = this.f84761g;
            int i = (iHashCode4 + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.f84762h;
            int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            long j3 = this.f84763i;
            int i3 = (((((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.f84764j ? 1 : 0)) * 31) + (this.f84765k ? 1 : 0)) * 31;
            long j4 = this.f84766l;
            int i4 = (i3 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
            long j5 = this.f84767m;
            int i5 = (i4 + ((int) (j5 ^ (j5 >>> 32)))) * 31;
            long j6 = this.f84768n;
            return ((((i5 + ((int) (j6 ^ (j6 >>> 32)))) * 31) + (this.f84769o ? 1 : 0)) * 31) + this.f84770p.hashCode();
        }

        private C13044c(a aVar) {
            int i = 0;
            if (aVar.f84777f == null) {
                v80.checkArgument(aVar.f84778g == -9223372036854775807L, "presentationStartTimeMs can only be set if liveConfiguration != null");
                v80.checkArgument(aVar.f84779h == -9223372036854775807L, "windowStartTimeMs can only be set if liveConfiguration != null");
                v80.checkArgument(aVar.f84780i == -9223372036854775807L, "elapsedRealtimeEpochOffsetMs can only be set if liveConfiguration != null");
            } else if (aVar.f84778g != -9223372036854775807L && aVar.f84779h != -9223372036854775807L) {
                v80.checkArgument(aVar.f84779h >= aVar.f84778g, "windowStartTimeMs can't be less than presentationStartTimeMs");
            }
            int size = aVar.f84787p.size();
            if (aVar.f84784m != -9223372036854775807L) {
                v80.checkArgument(aVar.f84783l <= aVar.f84784m, "defaultPositionUs can't be greater than durationUs");
            }
            this.f84755a = aVar.f84772a;
            this.f84756b = aVar.f84773b;
            this.f84757c = aVar.f84774c;
            this.f84758d = aVar.f84775d;
            this.f84759e = aVar.f84776e;
            this.f84760f = aVar.f84777f;
            this.f84761g = aVar.f84778g;
            this.f84762h = aVar.f84779h;
            this.f84763i = aVar.f84780i;
            this.f84764j = aVar.f84781j;
            this.f84765k = aVar.f84782k;
            this.f84766l = aVar.f84783l;
            this.f84767m = aVar.f84784m;
            long j = aVar.f84785n;
            this.f84768n = j;
            this.f84769o = aVar.f84786o;
            kx7<C13045d> kx7Var = aVar.f84787p;
            this.f84770p = kx7Var;
            long[] jArr = new long[kx7Var.size()];
            this.f84771q = jArr;
            if (kx7Var.isEmpty()) {
                return;
            }
            jArr[0] = -j;
            while (i < size - 1) {
                long[] jArr2 = this.f84771q;
                int i2 = i + 1;
                jArr2[i2] = jArr2[i] + this.f84770p.get(i).f84789b;
                i = i2;
            }
        }
    }

    /* JADX INFO: renamed from: thf$d */
    public static final class C13045d {

        /* JADX INFO: renamed from: a */
        public final Object f84788a;

        /* JADX INFO: renamed from: b */
        public final long f84789b;

        /* JADX INFO: renamed from: c */
        public final C9343mf f84790c;

        /* JADX INFO: renamed from: d */
        public final boolean f84791d;

        /* JADX INFO: renamed from: thf$d$a */
        public static final class a {

            /* JADX INFO: renamed from: a */
            public Object f84792a;

            /* JADX INFO: renamed from: b */
            public long f84793b;

            /* JADX INFO: renamed from: c */
            public C9343mf f84794c;

            /* JADX INFO: renamed from: d */
            public boolean f84795d;

            public C13045d build() {
                return new C13045d(this);
            }

            @op1
            public a setAdPlaybackState(C9343mf c9343mf) {
                this.f84794c = c9343mf;
                return this;
            }

            @op1
            public a setDurationUs(long j) {
                v80.checkArgument(j == -9223372036854775807L || j >= 0);
                this.f84793b = j;
                return this;
            }

            @op1
            public a setIsPlaceholder(boolean z) {
                this.f84795d = z;
                return this;
            }

            @op1
            public a setUid(Object obj) {
                this.f84792a = obj;
                return this;
            }

            public a(Object obj) {
                this.f84792a = obj;
                this.f84793b = 0L;
                this.f84794c = C9343mf.f60836l;
                this.f84795d = false;
            }

            private a(C13045d c13045d) {
                this.f84792a = c13045d.f84788a;
                this.f84793b = c13045d.f84789b;
                this.f84794c = c13045d.f84790c;
                this.f84795d = c13045d.f84791d;
            }
        }

        public a buildUpon() {
            return new a();
        }

        public boolean equals(@hib Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C13045d)) {
                return false;
            }
            C13045d c13045d = (C13045d) obj;
            return this.f84788a.equals(c13045d.f84788a) && this.f84789b == c13045d.f84789b && this.f84790c.equals(c13045d.f84790c) && this.f84791d == c13045d.f84791d;
        }

        public int hashCode() {
            int iHashCode = (217 + this.f84788a.hashCode()) * 31;
            long j = this.f84789b;
            return ((((iHashCode + ((int) (j ^ (j >>> 32)))) * 31) + this.f84790c.hashCode()) * 31) + (this.f84791d ? 1 : 0);
        }

        private C13045d(a aVar) {
            this.f84788a = aVar.f84792a;
            this.f84789b = aVar.f84793b;
            this.f84790c = aVar.f84794c;
            this.f84791d = aVar.f84795d;
        }
    }

    /* JADX INFO: renamed from: thf$e */
    public static final class C13046e {
        private C13046e() {
        }
    }

    /* JADX INFO: renamed from: thf$f */
    public static final class C13047f extends q1h {

        /* JADX INFO: renamed from: e */
        public final kx7<C13044c> f84796e;

        /* JADX INFO: renamed from: f */
        public final int[] f84797f;

        /* JADX INFO: renamed from: g */
        public final int[] f84798g;

        /* JADX INFO: renamed from: h */
        public final HashMap<Object, Integer> f84799h;

        public C13047f(List<C13044c> list) {
            int size = list.size();
            this.f84796e = kx7.copyOf((Collection) list);
            this.f84797f = new int[size];
            int periodCountInMediaItem = 0;
            for (int i = 0; i < size; i++) {
                C13044c c13044c = list.get(i);
                this.f84797f[i] = periodCountInMediaItem;
                periodCountInMediaItem += getPeriodCountInMediaItem(c13044c);
            }
            this.f84798g = new int[periodCountInMediaItem];
            this.f84799h = new HashMap<>();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                C13044c c13044c2 = list.get(i3);
                for (int i4 = 0; i4 < getPeriodCountInMediaItem(c13044c2); i4++) {
                    this.f84799h.put(c13044c2.getPeriodUid(i4), Integer.valueOf(i2));
                    this.f84798g[i2] = i3;
                    i2++;
                }
            }
        }

        private static int getPeriodCountInMediaItem(C13044c c13044c) {
            if (c13044c.f84770p.isEmpty()) {
                return 1;
            }
            return c13044c.f84770p.size();
        }

        @Override // p000.q1h
        public int getFirstWindowIndex(boolean z) {
            return super.getFirstWindowIndex(z);
        }

        @Override // p000.q1h
        public int getIndexOfPeriod(Object obj) {
            Integer num = this.f84799h.get(obj);
            if (num == null) {
                return -1;
            }
            return num.intValue();
        }

        @Override // p000.q1h
        public int getLastWindowIndex(boolean z) {
            return super.getLastWindowIndex(z);
        }

        @Override // p000.q1h
        public int getNextWindowIndex(int i, int i2, boolean z) {
            return super.getNextWindowIndex(i, i2, z);
        }

        @Override // p000.q1h
        public q1h.C11270b getPeriod(int i, q1h.C11270b c11270b, boolean z) {
            int i2 = this.f84798g[i];
            return this.f84796e.get(i2).getPeriod(i2, i - this.f84797f[i2], c11270b);
        }

        @Override // p000.q1h
        public q1h.C11270b getPeriodByUid(Object obj, q1h.C11270b c11270b) {
            return getPeriod(((Integer) v80.checkNotNull(this.f84799h.get(obj))).intValue(), c11270b, true);
        }

        @Override // p000.q1h
        public int getPeriodCount() {
            return this.f84798g.length;
        }

        @Override // p000.q1h
        public int getPreviousWindowIndex(int i, int i2, boolean z) {
            return super.getPreviousWindowIndex(i, i2, z);
        }

        @Override // p000.q1h
        public Object getUidOfPeriod(int i) {
            int i2 = this.f84798g[i];
            return this.f84796e.get(i2).getPeriodUid(i - this.f84797f[i2]);
        }

        @Override // p000.q1h
        public q1h.C11272d getWindow(int i, q1h.C11272d c11272d, long j) {
            return this.f84796e.get(i).getWindow(this.f84797f[i], c11272d);
        }

        @Override // p000.q1h
        public int getWindowCount() {
            return this.f84796e.size();
        }
    }

    /* JADX INFO: renamed from: thf$g */
    public interface InterfaceC13048g {

        /* JADX INFO: renamed from: a */
        public static final InterfaceC13048g f84800a = getConstant(0);

        static InterfaceC13048g getConstant(final long j) {
            return new InterfaceC13048g() { // from class: xhf
                @Override // p000.thf.InterfaceC13048g
                public final long get() {
                    return thf.InterfaceC13048g.lambda$getConstant$0(j);
                }
            };
        }

        static InterfaceC13048g getExtrapolating(final long j, final float f) {
            final long jElapsedRealtime = SystemClock.elapsedRealtime();
            return new InterfaceC13048g() { // from class: vhf
                @Override // p000.thf.InterfaceC13048g
                public final long get() {
                    return thf.InterfaceC13048g.lambda$getExtrapolating$1(j, jElapsedRealtime, f);
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

    /* JADX INFO: renamed from: thf$h */
    public static final class C13049h {

        /* JADX INFO: renamed from: A */
        public final hga f84801A;

        /* JADX INFO: renamed from: B */
        public final hga f84802B;

        /* JADX INFO: renamed from: C */
        public final int f84803C;

        /* JADX INFO: renamed from: D */
        public final int f84804D;

        /* JADX INFO: renamed from: E */
        public final int f84805E;

        /* JADX INFO: renamed from: F */
        public final InterfaceC13048g f84806F;

        /* JADX INFO: renamed from: G */
        public final InterfaceC13048g f84807G;

        /* JADX INFO: renamed from: H */
        public final InterfaceC13048g f84808H;

        /* JADX INFO: renamed from: I */
        public final InterfaceC13048g f84809I;

        /* JADX INFO: renamed from: J */
        public final InterfaceC13048g f84810J;

        /* JADX INFO: renamed from: K */
        public final boolean f84811K;

        /* JADX INFO: renamed from: L */
        public final int f84812L;

        /* JADX INFO: renamed from: M */
        public final long f84813M;

        /* JADX INFO: renamed from: N */
        public final boolean f84814N;

        /* JADX INFO: renamed from: a */
        public final izc.C7676c f84815a;

        /* JADX INFO: renamed from: b */
        public final boolean f84816b;

        /* JADX INFO: renamed from: c */
        public final int f84817c;

        /* JADX INFO: renamed from: d */
        public final int f84818d;

        /* JADX INFO: renamed from: e */
        public final int f84819e;

        /* JADX INFO: renamed from: f */
        @hib
        public final kyc f84820f;

        /* JADX INFO: renamed from: g */
        public final int f84821g;

        /* JADX INFO: renamed from: h */
        public final boolean f84822h;

        /* JADX INFO: renamed from: i */
        public final boolean f84823i;

        /* JADX INFO: renamed from: j */
        public final long f84824j;

        /* JADX INFO: renamed from: k */
        public final long f84825k;

        /* JADX INFO: renamed from: l */
        public final long f84826l;

        /* JADX INFO: renamed from: m */
        public final ryc f84827m;

        /* JADX INFO: renamed from: n */
        public final h7h f84828n;

        /* JADX INFO: renamed from: o */
        public final uc0 f84829o;

        /* JADX INFO: renamed from: p */
        @y46(from = 0.0d, m25645to = 1.0d)
        public final float f84830p;

        /* JADX INFO: renamed from: q */
        public final a8i f84831q;

        /* JADX INFO: renamed from: r */
        public final z93 f84832r;

        /* JADX INFO: renamed from: s */
        public final o84 f84833s;

        /* JADX INFO: renamed from: t */
        @h78(from = 0)
        public final int f84834t;

        /* JADX INFO: renamed from: u */
        public final boolean f84835u;

        /* JADX INFO: renamed from: v */
        public final xpf f84836v;

        /* JADX INFO: renamed from: w */
        public final boolean f84837w;

        /* JADX INFO: renamed from: x */
        public final eta f84838x;

        /* JADX INFO: renamed from: y */
        public final q1h f84839y;

        /* JADX INFO: renamed from: z */
        public final x7h f84840z;

        /* JADX INFO: renamed from: thf$h$a */
        public static final class a {

            /* JADX INFO: renamed from: A */
            @hib
            public x7h f84841A;

            /* JADX INFO: renamed from: B */
            @hib
            public hga f84842B;

            /* JADX INFO: renamed from: C */
            public hga f84843C;

            /* JADX INFO: renamed from: D */
            public int f84844D;

            /* JADX INFO: renamed from: E */
            public int f84845E;

            /* JADX INFO: renamed from: F */
            public int f84846F;

            /* JADX INFO: renamed from: G */
            @hib
            public Long f84847G;

            /* JADX INFO: renamed from: H */
            public InterfaceC13048g f84848H;

            /* JADX INFO: renamed from: I */
            @hib
            public Long f84849I;

            /* JADX INFO: renamed from: J */
            public InterfaceC13048g f84850J;

            /* JADX INFO: renamed from: K */
            public InterfaceC13048g f84851K;

            /* JADX INFO: renamed from: L */
            public InterfaceC13048g f84852L;

            /* JADX INFO: renamed from: M */
            public InterfaceC13048g f84853M;

            /* JADX INFO: renamed from: N */
            public boolean f84854N;

            /* JADX INFO: renamed from: O */
            public int f84855O;

            /* JADX INFO: renamed from: P */
            public long f84856P;

            /* JADX INFO: renamed from: a */
            public izc.C7676c f84857a;

            /* JADX INFO: renamed from: b */
            public boolean f84858b;

            /* JADX INFO: renamed from: c */
            public int f84859c;

            /* JADX INFO: renamed from: d */
            public int f84860d;

            /* JADX INFO: renamed from: e */
            public int f84861e;

            /* JADX INFO: renamed from: f */
            @hib
            public kyc f84862f;

            /* JADX INFO: renamed from: g */
            public int f84863g;

            /* JADX INFO: renamed from: h */
            public boolean f84864h;

            /* JADX INFO: renamed from: i */
            public boolean f84865i;

            /* JADX INFO: renamed from: j */
            public long f84866j;

            /* JADX INFO: renamed from: k */
            public long f84867k;

            /* JADX INFO: renamed from: l */
            public long f84868l;

            /* JADX INFO: renamed from: m */
            public ryc f84869m;

            /* JADX INFO: renamed from: n */
            public h7h f84870n;

            /* JADX INFO: renamed from: o */
            public uc0 f84871o;

            /* JADX INFO: renamed from: p */
            public float f84872p;

            /* JADX INFO: renamed from: q */
            public a8i f84873q;

            /* JADX INFO: renamed from: r */
            public z93 f84874r;

            /* JADX INFO: renamed from: s */
            public o84 f84875s;

            /* JADX INFO: renamed from: t */
            public int f84876t;

            /* JADX INFO: renamed from: u */
            public boolean f84877u;

            /* JADX INFO: renamed from: v */
            public xpf f84878v;

            /* JADX INFO: renamed from: w */
            public boolean f84879w;

            /* JADX INFO: renamed from: x */
            public eta f84880x;

            /* JADX INFO: renamed from: y */
            @hib
            public kx7<C13044c> f84881y;

            /* JADX INFO: renamed from: z */
            public q1h f84882z;

            public C13049h build() {
                return new C13049h(this);
            }

            @op1
            public a clearPositionDiscontinuity() {
                this.f84854N = false;
                return this;
            }

            @op1
            public a setAdBufferedPositionMs(InterfaceC13048g interfaceC13048g) {
                this.f84852L = interfaceC13048g;
                return this;
            }

            @op1
            public a setAdPositionMs(long j) {
                this.f84849I = Long.valueOf(j);
                return this;
            }

            @op1
            public a setAudioAttributes(uc0 uc0Var) {
                this.f84871o = uc0Var;
                return this;
            }

            @op1
            public a setAvailableCommands(izc.C7676c c7676c) {
                this.f84857a = c7676c;
                return this;
            }

            @op1
            public a setContentBufferedPositionMs(InterfaceC13048g interfaceC13048g) {
                this.f84851K = interfaceC13048g;
                return this;
            }

            @op1
            public a setContentPositionMs(long j) {
                this.f84847G = Long.valueOf(j);
                return this;
            }

            @op1
            public a setCurrentAd(int i, int i2) {
                v80.checkArgument((i == -1) == (i2 == -1));
                this.f84845E = i;
                this.f84846F = i2;
                return this;
            }

            @op1
            public a setCurrentCues(z93 z93Var) {
                this.f84874r = z93Var;
                return this;
            }

            @op1
            public a setCurrentMediaItemIndex(int i) {
                this.f84844D = i;
                return this;
            }

            @op1
            public a setDeviceInfo(o84 o84Var) {
                this.f84875s = o84Var;
                return this;
            }

            @op1
            public a setDeviceVolume(@h78(from = 0) int i) {
                v80.checkArgument(i >= 0);
                this.f84876t = i;
                return this;
            }

            @op1
            public a setIsDeviceMuted(boolean z) {
                this.f84877u = z;
                return this;
            }

            @op1
            public a setIsLoading(boolean z) {
                this.f84865i = z;
                return this;
            }

            @op1
            public a setMaxSeekToPreviousPositionMs(long j) {
                this.f84868l = j;
                return this;
            }

            @op1
            public a setNewlyRenderedFirstFrame(boolean z) {
                this.f84879w = z;
                return this;
            }

            @op1
            public a setPlayWhenReady(boolean z, int i) {
                this.f84858b = z;
                this.f84859c = i;
                return this;
            }

            @op1
            public a setPlaybackParameters(ryc rycVar) {
                this.f84869m = rycVar;
                return this;
            }

            @op1
            public a setPlaybackState(int i) {
                this.f84860d = i;
                return this;
            }

            @op1
            public a setPlaybackSuppressionReason(int i) {
                this.f84861e = i;
                return this;
            }

            @op1
            public a setPlayerError(@hib kyc kycVar) {
                this.f84862f = kycVar;
                return this;
            }

            @op1
            public a setPlaylist(List<C13044c> list) {
                HashSet hashSet = new HashSet();
                for (int i = 0; i < list.size(); i++) {
                    v80.checkArgument(hashSet.add(list.get(i).f84755a), "Duplicate MediaItemData UID in playlist");
                }
                this.f84881y = kx7.copyOf((Collection) list);
                this.f84882z = new C13047f(this.f84881y);
                this.f84841A = null;
                this.f84842B = null;
                return this;
            }

            @op1
            public a setPlaylistMetadata(hga hgaVar) {
                this.f84843C = hgaVar;
                return this;
            }

            @op1
            public a setPositionDiscontinuity(int i, long j) {
                this.f84854N = true;
                this.f84855O = i;
                this.f84856P = j;
                return this;
            }

            @op1
            public a setRepeatMode(int i) {
                this.f84863g = i;
                return this;
            }

            @op1
            public a setSeekBackIncrementMs(long j) {
                this.f84866j = j;
                return this;
            }

            @op1
            public a setSeekForwardIncrementMs(long j) {
                this.f84867k = j;
                return this;
            }

            @op1
            public a setShuffleModeEnabled(boolean z) {
                this.f84864h = z;
                return this;
            }

            @op1
            public a setSurfaceSize(xpf xpfVar) {
                this.f84878v = xpfVar;
                return this;
            }

            @op1
            public a setTimedMetadata(eta etaVar) {
                this.f84880x = etaVar;
                return this;
            }

            @op1
            public a setTotalBufferedDurationMs(InterfaceC13048g interfaceC13048g) {
                this.f84853M = interfaceC13048g;
                return this;
            }

            @op1
            public a setTrackSelectionParameters(h7h h7hVar) {
                this.f84870n = h7hVar;
                return this;
            }

            @op1
            public a setVideoSize(a8i a8iVar) {
                this.f84873q = a8iVar;
                return this;
            }

            @op1
            public a setVolume(@y46(from = 0.0d, m25645to = 1.0d) float f) {
                v80.checkArgument(f >= 0.0f && f <= 1.0f);
                this.f84872p = f;
                return this;
            }

            public a() {
                this.f84857a = izc.C7676c.f49118b;
                this.f84858b = false;
                this.f84859c = 1;
                this.f84860d = 1;
                this.f84861e = 0;
                this.f84862f = null;
                this.f84863g = 0;
                this.f84864h = false;
                this.f84865i = false;
                this.f84866j = 5000L;
                this.f84867k = 15000L;
                this.f84868l = 3000L;
                this.f84869m = ryc.f80104d;
                this.f84870n = h7h.f42758F;
                this.f84871o = uc0.f87467h;
                this.f84872p = 1.0f;
                this.f84873q = a8i.f643h;
                this.f84874r = z93.f104438d;
                this.f84875s = o84.f66636g;
                this.f84876t = 0;
                this.f84877u = false;
                this.f84878v = xpf.f98880c;
                this.f84879w = false;
                this.f84880x = new eta(-9223372036854775807L, new eta.InterfaceC5464a[0]);
                this.f84881y = kx7.m15110of();
                this.f84882z = q1h.f72935a;
                this.f84841A = null;
                this.f84842B = null;
                this.f84843C = hga.f43470X0;
                this.f84844D = -1;
                this.f84845E = -1;
                this.f84846F = -1;
                this.f84847G = null;
                this.f84848H = InterfaceC13048g.getConstant(-9223372036854775807L);
                this.f84849I = null;
                InterfaceC13048g interfaceC13048g = InterfaceC13048g.f84800a;
                this.f84850J = interfaceC13048g;
                this.f84851K = InterfaceC13048g.getConstant(-9223372036854775807L);
                this.f84852L = interfaceC13048g;
                this.f84853M = interfaceC13048g;
                this.f84854N = false;
                this.f84855O = 5;
                this.f84856P = 0L;
            }

            @op1
            public a setAdPositionMs(InterfaceC13048g interfaceC13048g) {
                this.f84849I = null;
                this.f84850J = interfaceC13048g;
                return this;
            }

            @op1
            public a setContentPositionMs(InterfaceC13048g interfaceC13048g) {
                this.f84847G = null;
                this.f84848H = interfaceC13048g;
                return this;
            }

            @op1
            public a setPlaylist(q1h q1hVar, x7h x7hVar, @hib hga hgaVar) {
                this.f84881y = null;
                this.f84882z = q1hVar;
                this.f84841A = x7hVar;
                this.f84842B = hgaVar;
                return this;
            }

            private a(C13049h c13049h) {
                this.f84857a = c13049h.f84815a;
                this.f84858b = c13049h.f84816b;
                this.f84859c = c13049h.f84817c;
                this.f84860d = c13049h.f84818d;
                this.f84861e = c13049h.f84819e;
                this.f84862f = c13049h.f84820f;
                this.f84863g = c13049h.f84821g;
                this.f84864h = c13049h.f84822h;
                this.f84865i = c13049h.f84823i;
                this.f84866j = c13049h.f84824j;
                this.f84867k = c13049h.f84825k;
                this.f84868l = c13049h.f84826l;
                this.f84869m = c13049h.f84827m;
                this.f84870n = c13049h.f84828n;
                this.f84871o = c13049h.f84829o;
                this.f84872p = c13049h.f84830p;
                this.f84873q = c13049h.f84831q;
                this.f84874r = c13049h.f84832r;
                this.f84875s = c13049h.f84833s;
                this.f84876t = c13049h.f84834t;
                this.f84877u = c13049h.f84835u;
                this.f84878v = c13049h.f84836v;
                this.f84879w = c13049h.f84837w;
                this.f84880x = c13049h.f84838x;
                q1h q1hVar = c13049h.f84839y;
                this.f84882z = q1hVar;
                if (q1hVar instanceof C13047f) {
                    this.f84881y = ((C13047f) q1hVar).f84796e;
                } else {
                    this.f84841A = c13049h.f84840z;
                    this.f84842B = c13049h.f84814N ? null : c13049h.f84801A;
                }
                this.f84843C = c13049h.f84802B;
                this.f84844D = c13049h.f84803C;
                this.f84845E = c13049h.f84804D;
                this.f84846F = c13049h.f84805E;
                this.f84847G = null;
                this.f84848H = c13049h.f84806F;
                this.f84849I = null;
                this.f84850J = c13049h.f84807G;
                this.f84851K = c13049h.f84808H;
                this.f84852L = c13049h.f84809I;
                this.f84853M = c13049h.f84810J;
                this.f84854N = c13049h.f84811K;
                this.f84855O = c13049h.f84812L;
                this.f84856P = c13049h.f84813M;
            }
        }

        public a buildUpon() {
            return new a();
        }

        public boolean equals(@hib Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C13049h)) {
                return false;
            }
            C13049h c13049h = (C13049h) obj;
            return this.f84816b == c13049h.f84816b && this.f84817c == c13049h.f84817c && this.f84815a.equals(c13049h.f84815a) && this.f84818d == c13049h.f84818d && this.f84819e == c13049h.f84819e && Objects.equals(this.f84820f, c13049h.f84820f) && this.f84821g == c13049h.f84821g && this.f84822h == c13049h.f84822h && this.f84823i == c13049h.f84823i && this.f84824j == c13049h.f84824j && this.f84825k == c13049h.f84825k && this.f84826l == c13049h.f84826l && this.f84827m.equals(c13049h.f84827m) && this.f84828n.equals(c13049h.f84828n) && this.f84829o.equals(c13049h.f84829o) && this.f84830p == c13049h.f84830p && this.f84831q.equals(c13049h.f84831q) && this.f84832r.equals(c13049h.f84832r) && this.f84833s.equals(c13049h.f84833s) && this.f84834t == c13049h.f84834t && this.f84835u == c13049h.f84835u && this.f84836v.equals(c13049h.f84836v) && this.f84837w == c13049h.f84837w && this.f84838x.equals(c13049h.f84838x) && this.f84839y.equals(c13049h.f84839y) && this.f84840z.equals(c13049h.f84840z) && this.f84801A.equals(c13049h.f84801A) && this.f84802B.equals(c13049h.f84802B) && this.f84803C == c13049h.f84803C && this.f84804D == c13049h.f84804D && this.f84805E == c13049h.f84805E && this.f84806F.equals(c13049h.f84806F) && this.f84807G.equals(c13049h.f84807G) && this.f84808H.equals(c13049h.f84808H) && this.f84809I.equals(c13049h.f84809I) && this.f84810J.equals(c13049h.f84810J) && this.f84811K == c13049h.f84811K && this.f84812L == c13049h.f84812L && this.f84813M == c13049h.f84813M;
        }

        public kx7<C13044c> getPlaylist() {
            q1h q1hVar = this.f84839y;
            if (q1hVar instanceof C13047f) {
                return ((C13047f) q1hVar).f84796e;
            }
            q1h.C11272d c11272d = new q1h.C11272d();
            q1h.C11270b c11270b = new q1h.C11270b();
            kx7.C8541a c8541aBuilderWithExpectedSize = kx7.builderWithExpectedSize(this.f84839y.getWindowCount());
            for (int i = 0; i < this.f84839y.getWindowCount(); i++) {
                c8541aBuilderWithExpectedSize.add(C13044c.buildFromState(this, i, c11270b, c11272d));
            }
            return c8541aBuilderWithExpectedSize.build();
        }

        public int hashCode() {
            int iHashCode = (((((((((217 + this.f84815a.hashCode()) * 31) + (this.f84816b ? 1 : 0)) * 31) + this.f84817c) * 31) + this.f84818d) * 31) + this.f84819e) * 31;
            kyc kycVar = this.f84820f;
            int iHashCode2 = (((((((iHashCode + (kycVar == null ? 0 : kycVar.hashCode())) * 31) + this.f84821g) * 31) + (this.f84822h ? 1 : 0)) * 31) + (this.f84823i ? 1 : 0)) * 31;
            long j = this.f84824j;
            int i = (iHashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.f84825k;
            int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            long j3 = this.f84826l;
            int iHashCode3 = (((((((((((((((((((((((((((((((((((((((((((((((((((((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + this.f84827m.hashCode()) * 31) + this.f84828n.hashCode()) * 31) + this.f84829o.hashCode()) * 31) + Float.floatToRawIntBits(this.f84830p)) * 31) + this.f84831q.hashCode()) * 31) + this.f84832r.hashCode()) * 31) + this.f84833s.hashCode()) * 31) + this.f84834t) * 31) + (this.f84835u ? 1 : 0)) * 31) + this.f84836v.hashCode()) * 31) + (this.f84837w ? 1 : 0)) * 31) + this.f84838x.hashCode()) * 31) + this.f84839y.hashCode()) * 31) + this.f84840z.hashCode()) * 31) + this.f84801A.hashCode()) * 31) + this.f84802B.hashCode()) * 31) + this.f84803C) * 31) + this.f84804D) * 31) + this.f84805E) * 31) + this.f84806F.hashCode()) * 31) + this.f84807G.hashCode()) * 31) + this.f84808H.hashCode()) * 31) + this.f84809I.hashCode()) * 31) + this.f84810J.hashCode()) * 31) + (this.f84811K ? 1 : 0)) * 31) + this.f84812L) * 31;
            long j4 = this.f84813M;
            return iHashCode3 + ((int) (j4 ^ (j4 >>> 32)));
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:56:0x010c  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x0124  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x0139  */
        /* JADX WARN: Removed duplicated region for block: B:81:0x018b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private C13049h(p000.thf.C13049h.a r18) {
            /*
                Method dump skipped, instruction units count: 673
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.thf.C13049h.<init>(thf$h$a):void");
        }
    }

    public thf(Looper looper) {
        this(looper, j52.f49539a);
    }

    private static List<C13044c> buildMutablePlaylistFromState(C13049h c13049h, q1h.C11270b c11270b, q1h.C11272d c11272d) {
        if (c13049h.f84839y instanceof C13047f) {
            return new ArrayList(((C13047f) c13049h.f84839y).f84796e);
        }
        ArrayList arrayList = new ArrayList(c13049h.f84839y.getWindowCount());
        for (int i = 0; i < c13049h.f84839y.getWindowCount(); i++) {
            arrayList.add(C13044c.buildFromState(c13049h, i, c11270b, c11272d));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static C13049h buildStateForNewPosition(C13049h.a aVar, C13049h c13049h, long j, q1h q1hVar, int i, long j2, boolean z, q1h.C11272d c11272d) {
        long defaultPositionMs;
        int i2 = i;
        long positionOrDefaultInMediaItem = getPositionOrDefaultInMediaItem(j, c13049h, c11272d);
        boolean z2 = false;
        if (q1hVar.isEmpty() || (i2 != -1 && i2 < q1hVar.getWindowCount())) {
            defaultPositionMs = j2;
        } else {
            defaultPositionMs = -9223372036854775807L;
            i2 = 0;
        }
        if (!q1hVar.isEmpty() && defaultPositionMs == -9223372036854775807L) {
            defaultPositionMs = q1hVar.getWindow(i2, c11272d).getDefaultPositionMs();
        }
        boolean z3 = c13049h.f84839y.isEmpty() || q1hVar.isEmpty();
        boolean z4 = (z3 || c13049h.f84839y.getWindow(getCurrentMediaItemIndexInternal(c13049h), c11272d).f72971a.equals(q1hVar.getWindow(i2, c11272d).f72971a)) ? false : true;
        if (q1hVar.isEmpty()) {
            aVar.setPlaylist(q1hVar, x7h.f97105b, null);
        } else if (q1hVar instanceof C13047f) {
            C13044c c13044c = (C13044c) ((C13047f) q1hVar).f84796e.get(i2);
            aVar.setPlaylist(q1hVar, c13044c.f84756b, c13044c.f84758d);
        } else {
            if (!z3 && !z4) {
                z2 = true;
            }
            aVar.setPlaylist(q1hVar, z2 ? c13049h.f84840z : x7h.f97105b, z2 ? c13049h.f84801A : null);
        }
        if (z3 || z4 || defaultPositionMs < positionOrDefaultInMediaItem) {
            aVar.setCurrentMediaItemIndex(i2).setCurrentAd(-1, -1).setContentPositionMs(defaultPositionMs).setContentBufferedPositionMs(InterfaceC13048g.getConstant(defaultPositionMs)).setTotalBufferedDurationMs(InterfaceC13048g.f84800a);
        } else if (defaultPositionMs == positionOrDefaultInMediaItem) {
            aVar.setCurrentMediaItemIndex(i2);
            if (c13049h.f84804D == -1 || !z) {
                aVar.setCurrentAd(-1, -1).setTotalBufferedDurationMs(InterfaceC13048g.getConstant(getContentBufferedPositionMsInternal(c13049h, c11272d) - positionOrDefaultInMediaItem));
            } else {
                aVar.setTotalBufferedDurationMs(InterfaceC13048g.getConstant(c13049h.f84809I.get() - c13049h.f84807G.get()));
            }
        } else {
            aVar.setCurrentMediaItemIndex(i2).setCurrentAd(-1, -1).setContentPositionMs(defaultPositionMs).setContentBufferedPositionMs(InterfaceC13048g.getConstant(Math.max(getContentBufferedPositionMsInternal(c13049h, c11272d), defaultPositionMs))).setTotalBufferedDurationMs(InterfaceC13048g.getConstant(Math.max(0L, c13049h.f84810J.get() - (defaultPositionMs - positionOrDefaultInMediaItem))));
        }
        return aVar.build();
    }

    private void clearVideoOutput(@hib Object obj) {
        verifyApplicationThreadAndInitState();
        final C13049h c13049h = this.f84751i1;
        if (shouldHandleCommand(27)) {
            updateStateForPendingOperation(mo16376u0(obj), new lfg() { // from class: ngf
                @Override // p000.lfg
                public final Object get() {
                    return thf.lambda$clearVideoOutput$21(c13049h);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static hga getCombinedMediaMetadata(nfa nfaVar, x7h x7hVar) {
        hga.C6845b c6845b = new hga.C6845b();
        int size = x7hVar.getGroups().size();
        for (int i = 0; i < size; i++) {
            x7h.C14971a c14971a = x7hVar.getGroups().get(i);
            for (int i2 = 0; i2 < c14971a.f97112a; i2++) {
                if (c14971a.isTrackSelected(i2)) {
                    C1213a trackFormat = c14971a.getTrackFormat(i2);
                    if (trackFormat.f8288l != null) {
                        for (int i3 = 0; i3 < trackFormat.f8288l.length(); i3++) {
                            trackFormat.f8288l.get(i3).populateMediaMetadata(c6845b);
                        }
                    }
                }
            }
        }
        return c6845b.populate(nfaVar.f64308e).build();
    }

    private static long getContentBufferedPositionMsInternal(C13049h c13049h, q1h.C11272d c11272d) {
        return getPositionOrDefaultInMediaItem(c13049h.f84808H.get(), c13049h, c11272d);
    }

    private static long getContentPositionMsInternal(C13049h c13049h, q1h.C11272d c11272d) {
        return getPositionOrDefaultInMediaItem(c13049h.f84806F.get(), c13049h, c11272d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getCurrentMediaItemIndexInternal(C13049h c13049h) {
        int i = c13049h.f84803C;
        if (i != -1) {
            return i;
        }
        return 0;
    }

    private static int getCurrentPeriodIndexInternal(C13049h c13049h, q1h.C11272d c11272d, q1h.C11270b c11270b) {
        int currentMediaItemIndexInternal = getCurrentMediaItemIndexInternal(c13049h);
        return c13049h.f84839y.isEmpty() ? currentMediaItemIndexInternal : getPeriodIndexFromWindowPosition(c13049h.f84839y, currentMediaItemIndexInternal, getContentPositionMsInternal(c13049h, c11272d), c11272d, c11270b);
    }

    private static long getCurrentPeriodOrAdPositionMs(C13049h c13049h, Object obj, q1h.C11270b c11270b, q1h.C11272d c11272d) {
        return c13049h.f84804D != -1 ? c13049h.f84807G.get() : getContentPositionMsInternal(c13049h, c11272d) - c13049h.f84839y.getPeriodByUid(obj, c11270b).getPositionInWindowMs();
    }

    private static int getMediaItemIndexInNewPlaylist(q1h q1hVar, q1h q1hVar2, int i, q1h.C11270b c11270b, q1h.C11272d c11272d) {
        if (q1hVar.isEmpty()) {
            if (i < q1hVar2.getWindowCount()) {
                return i;
            }
            return -1;
        }
        Object objCheckNotNull = v80.checkNotNull(q1hVar.getPeriod(q1hVar.getWindow(i, c11272d).f72984n, c11270b, true).f72945b);
        if (q1hVar2.getIndexOfPeriod(objCheckNotNull) == -1) {
            return -1;
        }
        return q1hVar2.getPeriodByUid(objCheckNotNull, c11270b).f72946c;
    }

    private static int getMediaItemTransitionReason(C13049h c13049h, C13049h c13049h2, int i, boolean z, q1h.C11272d c11272d) {
        q1h q1hVar = c13049h.f84839y;
        q1h q1hVar2 = c13049h2.f84839y;
        if (q1hVar2.isEmpty() && q1hVar.isEmpty()) {
            return -1;
        }
        if (q1hVar2.isEmpty() != q1hVar.isEmpty()) {
            return 3;
        }
        Object obj = c13049h.f84839y.getWindow(getCurrentMediaItemIndexInternal(c13049h), c11272d).f72971a;
        Object obj2 = c13049h2.f84839y.getWindow(getCurrentMediaItemIndexInternal(c13049h2), c11272d).f72971a;
        if ((obj instanceof C13046e) && !(obj2 instanceof C13046e)) {
            return -1;
        }
        if (!obj.equals(obj2)) {
            if (i == 0) {
                return 1;
            }
            return i == 1 ? 2 : 3;
        }
        if (i != 0 || getContentPositionMsInternal(c13049h, c11272d) <= getContentPositionMsInternal(c13049h2, c11272d)) {
            return (i == 1 && z) ? 2 : -1;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getPeriodIndexFromWindowPosition(q1h q1hVar, int i, long j, q1h.C11272d c11272d, q1h.C11270b c11270b) {
        return q1hVar.getIndexOfPeriod(q1hVar.getPeriodPositionUs(c11272d, c11270b, i, t0i.msToUs(j)).first);
    }

    private static long getPeriodOrAdDurationMs(C13049h c13049h, Object obj, q1h.C11270b c11270b) {
        c13049h.f84839y.getPeriodByUid(obj, c11270b);
        int i = c13049h.f84804D;
        return t0i.usToMs(i == -1 ? c11270b.f72947d : c11270b.getAdDurationUs(i, c13049h.f84805E));
    }

    private static int getPositionDiscontinuityReason(C13049h c13049h, C13049h c13049h2, boolean z, q1h.C11272d c11272d, q1h.C11270b c11270b) {
        if (c13049h2.f84811K) {
            return c13049h2.f84812L;
        }
        if (z) {
            return 1;
        }
        if (c13049h.f84839y.isEmpty()) {
            return -1;
        }
        if (c13049h2.f84839y.isEmpty()) {
            return 4;
        }
        Object uidOfPeriod = c13049h.f84839y.getUidOfPeriod(getCurrentPeriodIndexInternal(c13049h, c11272d, c11270b));
        Object uidOfPeriod2 = c13049h2.f84839y.getUidOfPeriod(getCurrentPeriodIndexInternal(c13049h2, c11272d, c11270b));
        if ((uidOfPeriod instanceof C13046e) && !(uidOfPeriod2 instanceof C13046e)) {
            return -1;
        }
        if (uidOfPeriod2.equals(uidOfPeriod) && c13049h.f84804D == c13049h2.f84804D && c13049h.f84805E == c13049h2.f84805E) {
            long currentPeriodOrAdPositionMs = getCurrentPeriodOrAdPositionMs(c13049h, uidOfPeriod, c11270b, c11272d);
            if (Math.abs(currentPeriodOrAdPositionMs - getCurrentPeriodOrAdPositionMs(c13049h2, uidOfPeriod2, c11270b, c11272d)) < 1000) {
                return -1;
            }
            long periodOrAdDurationMs = getPeriodOrAdDurationMs(c13049h, uidOfPeriod, c11270b);
            return (periodOrAdDurationMs == -9223372036854775807L || currentPeriodOrAdPositionMs < periodOrAdDurationMs) ? 5 : 0;
        }
        if (c13049h2.f84839y.getIndexOfPeriod(uidOfPeriod) == -1) {
            return 4;
        }
        long currentPeriodOrAdPositionMs2 = getCurrentPeriodOrAdPositionMs(c13049h, uidOfPeriod, c11270b, c11272d);
        long periodOrAdDurationMs2 = getPeriodOrAdDurationMs(c13049h, uidOfPeriod, c11270b);
        return (periodOrAdDurationMs2 == -9223372036854775807L || currentPeriodOrAdPositionMs2 < periodOrAdDurationMs2) ? 3 : 0;
    }

    private static izc.C7684k getPositionInfo(C13049h c13049h, boolean z, q1h.C11272d c11272d, q1h.C11270b c11270b) {
        Object obj;
        Object obj2;
        nfa nfaVar;
        int i;
        long j;
        long contentPositionMsInternal;
        int currentMediaItemIndexInternal = getCurrentMediaItemIndexInternal(c13049h);
        if (c13049h.f84839y.isEmpty()) {
            obj = null;
            obj2 = null;
            nfaVar = null;
            i = -1;
        } else {
            int currentPeriodIndexInternal = getCurrentPeriodIndexInternal(c13049h, c11272d, c11270b);
            Object obj3 = c13049h.f84839y.getPeriod(currentPeriodIndexInternal, c11270b, true).f72945b;
            Object obj4 = c13049h.f84839y.getWindow(currentMediaItemIndexInternal, c11272d).f72971a;
            nfaVar = c11272d.f72973c;
            obj2 = obj3;
            obj = obj4;
            i = currentPeriodIndexInternal;
        }
        if (z) {
            j = c13049h.f84813M;
            contentPositionMsInternal = c13049h.f84804D == -1 ? j : getContentPositionMsInternal(c13049h, c11272d);
        } else {
            long contentPositionMsInternal2 = getContentPositionMsInternal(c13049h, c11272d);
            j = c13049h.f84804D != -1 ? c13049h.f84807G.get() : contentPositionMsInternal2;
            contentPositionMsInternal = contentPositionMsInternal2;
        }
        return new izc.C7684k(obj, currentMediaItemIndexInternal, nfaVar, obj2, i, j, contentPositionMsInternal, c13049h.f84804D, c13049h.f84805E);
    }

    private static long getPositionOrDefaultInMediaItem(long j, C13049h c13049h, q1h.C11272d c11272d) {
        if (j != -9223372036854775807L) {
            return j;
        }
        if (c13049h.f84839y.isEmpty()) {
            return 0L;
        }
        return c13049h.f84839y.getWindow(getCurrentMediaItemIndexInternal(c13049h), c11272d).getDefaultPositionMs();
    }

    private static C13049h getStateWithNewPlaylist(C13049h c13049h, List<C13044c> list, q1h.C11270b c11270b, q1h.C11272d c11272d) {
        C13049h.a aVarBuildUpon = c13049h.buildUpon();
        C13047f c13047f = new C13047f(list);
        q1h q1hVar = c13049h.f84839y;
        long j = c13049h.f84806F.get();
        int currentMediaItemIndexInternal = getCurrentMediaItemIndexInternal(c13049h);
        int mediaItemIndexInNewPlaylist = getMediaItemIndexInNewPlaylist(q1hVar, c13047f, currentMediaItemIndexInternal, c11270b, c11272d);
        long j2 = mediaItemIndexInNewPlaylist == -1 ? -9223372036854775807L : j;
        for (int i = currentMediaItemIndexInternal + 1; mediaItemIndexInNewPlaylist == -1 && i < q1hVar.getWindowCount(); i++) {
            mediaItemIndexInNewPlaylist = getMediaItemIndexInNewPlaylist(q1hVar, c13047f, i, c11270b, c11272d);
        }
        if (c13049h.f84818d != 1 && mediaItemIndexInNewPlaylist == -1) {
            aVarBuildUpon.setPlaybackState(4).setIsLoading(false);
        }
        return buildStateForNewPosition(aVarBuildUpon, c13049h, j, c13047f, mediaItemIndexInNewPlaylist, j2, true, c11272d);
    }

    private static C13049h getStateWithNewPlaylistAndPosition(C13049h c13049h, @hib List<C13044c> list, int i, long j, q1h.C11272d c11272d) {
        C13049h.a aVarBuildUpon = c13049h.buildUpon();
        q1h c13047f = list == null ? c13049h.f84839y : new C13047f(list);
        if (c13049h.f84818d != 1) {
            if (c13047f.isEmpty() || (i != -1 && i >= c13047f.getWindowCount())) {
                aVarBuildUpon.setPlaybackState(4).setIsLoading(false);
            } else {
                aVarBuildUpon.setPlaybackState(2);
            }
        }
        return buildStateForNewPosition(aVarBuildUpon, c13049h, c13049h.f84806F.get(), c13047f, i, j, false, c11272d);
    }

    private static xpf getSurfaceHolderSize(SurfaceHolder surfaceHolder) {
        if (!surfaceHolder.getSurface().isValid()) {
            return xpf.f98881d;
        }
        Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
        return new xpf(surfaceFrame.width(), surfaceFrame.height());
    }

    private static int getTimelineChangeReason(q1h q1hVar, q1h q1hVar2, q1h.C11272d c11272d) {
        if (q1hVar.getWindowCount() != q1hVar2.getWindowCount()) {
            return 0;
        }
        int i = 0;
        while (true) {
            if (i >= q1hVar.getWindowCount()) {
                return 1;
            }
            Object obj = q1hVar.getWindow(i, c11272d).f72971a;
            Object obj2 = q1hVar2.getWindow(i, c11272d).f72971a;
            boolean z = (obj instanceof C13046e) && !(obj2 instanceof C13046e);
            if (!obj.equals(obj2) && !z) {
                return 0;
            }
            i++;
        }
    }

    private static boolean isPlaying(C13049h c13049h) {
        return c13049h.f84816b && c13049h.f84818d == 3 && c13049h.f84819e == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ C13049h lambda$addMediaItems$3(C13049h c13049h, List list, int i) {
        List<C13044c> listBuildMutablePlaylistFromState = buildMutablePlaylistFromState(c13049h, this.f84750h1, this.f14707c1);
        for (int i2 = 0; i2 < list.size(); i2++) {
            listBuildMutablePlaylistFromState.add(i2 + i, m22597q0((nfa) list.get(i2)));
        }
        return !c13049h.f84839y.isEmpty() ? getStateWithNewPlaylist(c13049h, listBuildMutablePlaylistFromState, this.f84750h1, this.f14707c1) : getStateWithNewPlaylistAndPosition(c13049h, listBuildMutablePlaylistFromState, c13049h.f84803C, c13049h.f84806F.get(), this.f14707c1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ C13049h lambda$clearVideoOutput$21(C13049h c13049h) {
        return c13049h.buildUpon().setSurfaceSize(xpf.f98881d).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ C13049h lambda$decreaseDeviceVolume$26(C13049h c13049h) {
        return c13049h.buildUpon().setDeviceVolume(Math.max(0, c13049h.f84834t - 1)).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ C13049h lambda$decreaseDeviceVolume$27(C13049h c13049h) {
        return c13049h.buildUpon().setDeviceVolume(Math.max(0, c13049h.f84834t - 1)).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ja9 lambda$handleReplaceMediaItems$31(ja9 ja9Var, Object obj) throws Exception {
        return ja9Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ C13049h lambda$increaseDeviceVolume$24(C13049h c13049h) {
        return c13049h.buildUpon().setDeviceVolume(c13049h.f84834t + 1).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ C13049h lambda$increaseDeviceVolume$25(C13049h c13049h) {
        return c13049h.buildUpon().setDeviceVolume(c13049h.f84834t + 1).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ C13049h lambda$moveMediaItems$4(C13049h c13049h, int i, int i2, int i3) {
        List<C13044c> listBuildMutablePlaylistFromState = buildMutablePlaylistFromState(c13049h, this.f84750h1, this.f14707c1);
        t0i.moveItems(listBuildMutablePlaylistFromState, i, i2, i3);
        return getStateWithNewPlaylist(c13049h, listBuildMutablePlaylistFromState, this.f84750h1, this.f14707c1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(izc.InterfaceC7680g interfaceC7680g, h36 h36Var) {
        interfaceC7680g.onEvents(this, new izc.C7679f(h36Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ C13049h lambda$prepare$7(C13049h c13049h) {
        return c13049h.buildUpon().setPlayerError(null).setPlaybackState(c13049h.f84839y.isEmpty() ? 4 : 2).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ C13049h lambda$release$13(C13049h c13049h) {
        return c13049h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ C13049h lambda$removeMediaItems$6(C13049h c13049h, int i, int i2) {
        List<C13044c> listBuildMutablePlaylistFromState = buildMutablePlaylistFromState(c13049h, this.f84750h1, this.f14707c1);
        t0i.removeRange(listBuildMutablePlaylistFromState, i, i2);
        return getStateWithNewPlaylist(c13049h, listBuildMutablePlaylistFromState, this.f84750h1, this.f14707c1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ C13049h lambda$replaceMediaItems$5(C13049h c13049h, List list, int i, int i2) {
        List<C13044c> listBuildMutablePlaylistFromState = buildMutablePlaylistFromState(c13049h, this.f84750h1, this.f14707c1);
        for (int i3 = 0; i3 < list.size(); i3++) {
            listBuildMutablePlaylistFromState.add(i3 + i, m22597q0((nfa) list.get(i3)));
        }
        C13049h stateWithNewPlaylist = !c13049h.f84839y.isEmpty() ? getStateWithNewPlaylist(c13049h, listBuildMutablePlaylistFromState, this.f84750h1, this.f14707c1) : getStateWithNewPlaylistAndPosition(c13049h, listBuildMutablePlaylistFromState, c13049h.f84803C, c13049h.f84806F.get(), this.f14707c1);
        if (i2 >= i) {
            return stateWithNewPlaylist;
        }
        t0i.removeRange(listBuildMutablePlaylistFromState, i2, i);
        return getStateWithNewPlaylist(stateWithNewPlaylist, listBuildMutablePlaylistFromState, this.f84750h1, this.f14707c1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ C13049h lambda$seekTo$10(boolean z, C13049h c13049h, int i, long j) {
        return z ? c13049h : getStateWithNewPlaylistAndPosition(c13049h, null, i, j, this.f14707c1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ C13049h lambda$setAudioAttributes$30(C13049h c13049h, uc0 uc0Var) {
        return c13049h.buildUpon().setAudioAttributes(uc0Var).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ C13049h lambda$setDeviceMuted$28(C13049h c13049h, boolean z) {
        return c13049h.buildUpon().setIsDeviceMuted(z).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ C13049h lambda$setDeviceMuted$29(C13049h c13049h, boolean z) {
        return c13049h.buildUpon().setIsDeviceMuted(z).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ C13049h lambda$setDeviceVolume$22(C13049h c13049h, int i) {
        return c13049h.buildUpon().setDeviceVolume(i).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ C13049h lambda$setDeviceVolume$23(C13049h c13049h, int i) {
        return c13049h.buildUpon().setDeviceVolume(i).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ C13049h lambda$setMediaItemsInternal$2(List list, C13049h c13049h, int i, long j) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            arrayList.add(m22597q0((nfa) list.get(i2)));
        }
        return getStateWithNewPlaylistAndPosition(c13049h, arrayList, i, j, this.f14707c1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ C13049h lambda$setPlayWhenReady$1(C13049h c13049h, boolean z) {
        return c13049h.buildUpon().setPlayWhenReady(z, 1).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ C13049h lambda$setPlaybackParameters$11(C13049h c13049h, ryc rycVar) {
        return c13049h.buildUpon().setPlaybackParameters(rycVar).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ C13049h lambda$setPlaylistMetadata$15(C13049h c13049h, hga hgaVar) {
        return c13049h.buildUpon().setPlaylistMetadata(hgaVar).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ C13049h lambda$setRepeatMode$8(C13049h c13049h, int i) {
        return c13049h.buildUpon().setRepeatMode(i).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ C13049h lambda$setShuffleModeEnabled$9(C13049h c13049h, boolean z) {
        return c13049h.buildUpon().setShuffleModeEnabled(z).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ C13049h lambda$setTrackSelectionParameters$14(C13049h c13049h, h7h h7hVar) {
        return c13049h.buildUpon().setTrackSelectionParameters(h7hVar).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ C13049h lambda$setVideoSurface$17(C13049h c13049h) {
        return c13049h.buildUpon().setSurfaceSize(xpf.f98880c).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ C13049h lambda$setVideoSurfaceHolder$18(C13049h c13049h, SurfaceHolder surfaceHolder) {
        return c13049h.buildUpon().setSurfaceSize(getSurfaceHolderSize(surfaceHolder)).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ C13049h lambda$setVideoSurfaceView$19(C13049h c13049h, SurfaceView surfaceView) {
        return c13049h.buildUpon().setSurfaceSize(getSurfaceHolderSize(surfaceView.getHolder())).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ C13049h lambda$setVideoTextureView$20(C13049h c13049h, xpf xpfVar) {
        return c13049h.buildUpon().setSurfaceSize(xpfVar).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ C13049h lambda$setVolume$16(C13049h c13049h, float f) {
        return c13049h.buildUpon().setVolume(f).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ C13049h lambda$stop$12(C13049h c13049h) {
        return c13049h.buildUpon().setPlaybackState(1).setTotalBufferedDurationMs(InterfaceC13048g.f84800a).setContentBufferedPositionMs(InterfaceC13048g.getConstant(getContentPositionMsInternal(c13049h, this.f14707c1))).setAdBufferedPositionMs(c13049h.f84807G).setIsLoading(false).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateStateAndInformListeners$32(C13049h c13049h, int i, izc.InterfaceC7680g interfaceC7680g) {
        interfaceC7680g.onTimelineChanged(c13049h.f84839y, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateStateAndInformListeners$33(int i, izc.C7684k c7684k, izc.C7684k c7684k2, izc.InterfaceC7680g interfaceC7680g) {
        interfaceC7680g.onPositionDiscontinuity(i);
        interfaceC7680g.onPositionDiscontinuity(c7684k, c7684k2, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateStateAndInformListeners$35(C13049h c13049h, izc.InterfaceC7680g interfaceC7680g) {
        interfaceC7680g.onPlayerErrorChanged(c13049h.f84820f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateStateAndInformListeners$36(C13049h c13049h, izc.InterfaceC7680g interfaceC7680g) {
        interfaceC7680g.onPlayerError((kyc) t0i.castNonNull(c13049h.f84820f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateStateAndInformListeners$37(C13049h c13049h, izc.InterfaceC7680g interfaceC7680g) {
        interfaceC7680g.onTrackSelectionParametersChanged(c13049h.f84828n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateStateAndInformListeners$38(C13049h c13049h, izc.InterfaceC7680g interfaceC7680g) {
        interfaceC7680g.onTracksChanged(c13049h.f84840z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateStateAndInformListeners$39(C13049h c13049h, izc.InterfaceC7680g interfaceC7680g) {
        interfaceC7680g.onMediaMetadataChanged(c13049h.f84801A);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateStateAndInformListeners$40(C13049h c13049h, izc.InterfaceC7680g interfaceC7680g) {
        interfaceC7680g.onLoadingChanged(c13049h.f84823i);
        interfaceC7680g.onIsLoadingChanged(c13049h.f84823i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateStateAndInformListeners$41(C13049h c13049h, izc.InterfaceC7680g interfaceC7680g) {
        interfaceC7680g.onPlayerStateChanged(c13049h.f84816b, c13049h.f84818d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateStateAndInformListeners$42(C13049h c13049h, izc.InterfaceC7680g interfaceC7680g) {
        interfaceC7680g.onPlaybackStateChanged(c13049h.f84818d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateStateAndInformListeners$43(C13049h c13049h, izc.InterfaceC7680g interfaceC7680g) {
        interfaceC7680g.onPlayWhenReadyChanged(c13049h.f84816b, c13049h.f84817c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateStateAndInformListeners$44(C13049h c13049h, izc.InterfaceC7680g interfaceC7680g) {
        interfaceC7680g.onPlaybackSuppressionReasonChanged(c13049h.f84819e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateStateAndInformListeners$45(C13049h c13049h, izc.InterfaceC7680g interfaceC7680g) {
        interfaceC7680g.onIsPlayingChanged(isPlaying(c13049h));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateStateAndInformListeners$46(C13049h c13049h, izc.InterfaceC7680g interfaceC7680g) {
        interfaceC7680g.onPlaybackParametersChanged(c13049h.f84827m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateStateAndInformListeners$47(C13049h c13049h, izc.InterfaceC7680g interfaceC7680g) {
        interfaceC7680g.onRepeatModeChanged(c13049h.f84821g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateStateAndInformListeners$48(C13049h c13049h, izc.InterfaceC7680g interfaceC7680g) {
        interfaceC7680g.onShuffleModeEnabledChanged(c13049h.f84822h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateStateAndInformListeners$49(C13049h c13049h, izc.InterfaceC7680g interfaceC7680g) {
        interfaceC7680g.onSeekBackIncrementChanged(c13049h.f84824j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateStateAndInformListeners$50(C13049h c13049h, izc.InterfaceC7680g interfaceC7680g) {
        interfaceC7680g.onSeekForwardIncrementChanged(c13049h.f84825k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateStateAndInformListeners$51(C13049h c13049h, izc.InterfaceC7680g interfaceC7680g) {
        interfaceC7680g.onMaxSeekToPreviousPositionChanged(c13049h.f84826l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateStateAndInformListeners$52(C13049h c13049h, izc.InterfaceC7680g interfaceC7680g) {
        interfaceC7680g.onAudioAttributesChanged(c13049h.f84829o);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateStateAndInformListeners$53(C13049h c13049h, izc.InterfaceC7680g interfaceC7680g) {
        interfaceC7680g.onVideoSizeChanged(c13049h.f84831q);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateStateAndInformListeners$54(C13049h c13049h, izc.InterfaceC7680g interfaceC7680g) {
        interfaceC7680g.onDeviceInfoChanged(c13049h.f84833s);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateStateAndInformListeners$55(C13049h c13049h, izc.InterfaceC7680g interfaceC7680g) {
        interfaceC7680g.onPlaylistMetadataChanged(c13049h.f84802B);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateStateAndInformListeners$56(C13049h c13049h, izc.InterfaceC7680g interfaceC7680g) {
        interfaceC7680g.onSurfaceSizeChanged(c13049h.f84836v.getWidth(), c13049h.f84836v.getHeight());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateStateAndInformListeners$57(C13049h c13049h, izc.InterfaceC7680g interfaceC7680g) {
        interfaceC7680g.onVolumeChanged(c13049h.f84830p);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateStateAndInformListeners$58(C13049h c13049h, izc.InterfaceC7680g interfaceC7680g) {
        interfaceC7680g.onDeviceVolumeChanged(c13049h.f84834t, c13049h.f84835u);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateStateAndInformListeners$59(C13049h c13049h, izc.InterfaceC7680g interfaceC7680g) {
        interfaceC7680g.onCues(c13049h.f84832r.f104441a);
        interfaceC7680g.onCues(c13049h.f84832r);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateStateAndInformListeners$60(C13049h c13049h, izc.InterfaceC7680g interfaceC7680g) {
        interfaceC7680g.onMetadata(c13049h.f84838x);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateStateAndInformListeners$61(C13049h c13049h, izc.InterfaceC7680g interfaceC7680g) {
        interfaceC7680g.onAvailableCommandsChanged(c13049h.f84815a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateStateForPendingOperation$62(ja9 ja9Var) {
        t0i.castNonNull(this.f84751i1);
        this.f84749g1.remove(ja9Var);
        if (!this.f84749g1.isEmpty() || this.f84752j1) {
            return;
        }
        updateStateAndInformListeners(mo16374s0(), false, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void postOrRunOnApplicationHandler(Runnable runnable) {
        if (this.f84748f1.getLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            this.f84748f1.post(runnable);
        }
    }

    @g5e({"state"})
    private void setMediaItemsInternal(final List<nfa> list, final int i, final long j) {
        v80.checkArgument(i == -1 || i >= 0);
        final C13049h c13049h = this.f84751i1;
        if (shouldHandleCommand(20) || (list.size() == 1 && shouldHandleCommand(31))) {
            updateStateForPendingOperation(mo16362G0(list, i, j), new lfg() { // from class: bff
                @Override // p000.lfg
                public final Object get() {
                    return this.f13653a.lambda$setMediaItemsInternal$2(list, c13049h, i, j);
                }
            });
        }
    }

    @g5e({"state"})
    private boolean shouldHandleCommand(int i) {
        return !this.f84752j1 && this.f84751i1.f84815a.contains(i);
    }

    @g5e({"state"})
    private void updateStateAndInformListeners(final C13049h c13049h, boolean z, boolean z2) {
        C13049h c13049h2 = this.f84751i1;
        this.f84751i1 = c13049h;
        if (c13049h.f84811K || c13049h.f84837w) {
            this.f84751i1 = c13049h.buildUpon().clearPositionDiscontinuity().setNewlyRenderedFirstFrame(false).build();
        }
        boolean z3 = c13049h2.f84816b != c13049h.f84816b;
        boolean z4 = c13049h2.f84818d != c13049h.f84818d;
        final int positionDiscontinuityReason = getPositionDiscontinuityReason(c13049h2, c13049h, z, this.f14707c1, this.f84750h1);
        boolean zEquals = c13049h2.f84839y.equals(c13049h.f84839y);
        final int mediaItemTransitionReason = getMediaItemTransitionReason(c13049h2, c13049h, positionDiscontinuityReason, z2, this.f14707c1);
        if (!zEquals) {
            final int timelineChangeReason = getTimelineChangeReason(c13049h2.f84839y, c13049h.f84839y, this.f14707c1);
            this.f84746d1.queueEvent(0, new ya9.InterfaceC15590a() { // from class: kff
                @Override // p000.ya9.InterfaceC15590a
                public final void invoke(Object obj) {
                    thf.lambda$updateStateAndInformListeners$32(c13049h, timelineChangeReason, (izc.InterfaceC7680g) obj);
                }
            });
        }
        if (positionDiscontinuityReason != -1) {
            final izc.C7684k positionInfo = getPositionInfo(c13049h2, false, this.f14707c1, this.f84750h1);
            final izc.C7684k positionInfo2 = getPositionInfo(c13049h, c13049h.f84811K, this.f14707c1, this.f84750h1);
            this.f84746d1.queueEvent(11, new ya9.InterfaceC15590a() { // from class: hdf
                @Override // p000.ya9.InterfaceC15590a
                public final void invoke(Object obj) {
                    thf.lambda$updateStateAndInformListeners$33(positionDiscontinuityReason, positionInfo, positionInfo2, (izc.InterfaceC7680g) obj);
                }
            });
        }
        if (mediaItemTransitionReason != -1) {
            final nfa nfaVar = c13049h.f84839y.isEmpty() ? null : c13049h.f84839y.getWindow(getCurrentMediaItemIndexInternal(c13049h), this.f14707c1).f72973c;
            this.f84746d1.queueEvent(1, new ya9.InterfaceC15590a() { // from class: fef
                @Override // p000.ya9.InterfaceC15590a
                public final void invoke(Object obj) {
                    ((izc.InterfaceC7680g) obj).onMediaItemTransition(nfaVar, mediaItemTransitionReason);
                }
            });
        }
        if (!Objects.equals(c13049h2.f84820f, c13049h.f84820f)) {
            this.f84746d1.queueEvent(10, new ya9.InterfaceC15590a() { // from class: jef
                @Override // p000.ya9.InterfaceC15590a
                public final void invoke(Object obj) {
                    thf.lambda$updateStateAndInformListeners$35(c13049h, (izc.InterfaceC7680g) obj);
                }
            });
            if (c13049h.f84820f != null) {
                this.f84746d1.queueEvent(10, new ya9.InterfaceC15590a() { // from class: lef
                    @Override // p000.ya9.InterfaceC15590a
                    public final void invoke(Object obj) {
                        thf.lambda$updateStateAndInformListeners$36(c13049h, (izc.InterfaceC7680g) obj);
                    }
                });
            }
        }
        if (!c13049h2.f84828n.equals(c13049h.f84828n)) {
            this.f84746d1.queueEvent(19, new ya9.InterfaceC15590a() { // from class: nef
                @Override // p000.ya9.InterfaceC15590a
                public final void invoke(Object obj) {
                    thf.lambda$updateStateAndInformListeners$37(c13049h, (izc.InterfaceC7680g) obj);
                }
            });
        }
        if (!c13049h2.f84840z.equals(c13049h.f84840z)) {
            this.f84746d1.queueEvent(2, new ya9.InterfaceC15590a() { // from class: qef
                @Override // p000.ya9.InterfaceC15590a
                public final void invoke(Object obj) {
                    thf.lambda$updateStateAndInformListeners$38(c13049h, (izc.InterfaceC7680g) obj);
                }
            });
        }
        if (!c13049h2.f84801A.equals(c13049h.f84801A)) {
            this.f84746d1.queueEvent(14, new ya9.InterfaceC15590a() { // from class: tef
                @Override // p000.ya9.InterfaceC15590a
                public final void invoke(Object obj) {
                    thf.lambda$updateStateAndInformListeners$39(c13049h, (izc.InterfaceC7680g) obj);
                }
            });
        }
        if (c13049h2.f84823i != c13049h.f84823i) {
            this.f84746d1.queueEvent(3, new ya9.InterfaceC15590a() { // from class: vef
                @Override // p000.ya9.InterfaceC15590a
                public final void invoke(Object obj) {
                    thf.lambda$updateStateAndInformListeners$40(c13049h, (izc.InterfaceC7680g) obj);
                }
            });
        }
        if (z3 || z4) {
            this.f84746d1.queueEvent(-1, new ya9.InterfaceC15590a() { // from class: xef
                @Override // p000.ya9.InterfaceC15590a
                public final void invoke(Object obj) {
                    thf.lambda$updateStateAndInformListeners$41(c13049h, (izc.InterfaceC7680g) obj);
                }
            });
        }
        if (z4) {
            this.f84746d1.queueEvent(4, new ya9.InterfaceC15590a() { // from class: ggf
                @Override // p000.ya9.InterfaceC15590a
                public final void invoke(Object obj) {
                    thf.lambda$updateStateAndInformListeners$42(c13049h, (izc.InterfaceC7680g) obj);
                }
            });
        }
        if (z3 || c13049h2.f84817c != c13049h.f84817c) {
            this.f84746d1.queueEvent(5, new ya9.InterfaceC15590a() { // from class: chf
                @Override // p000.ya9.InterfaceC15590a
                public final void invoke(Object obj) {
                    thf.lambda$updateStateAndInformListeners$43(c13049h, (izc.InterfaceC7680g) obj);
                }
            });
        }
        if (c13049h2.f84819e != c13049h.f84819e) {
            this.f84746d1.queueEvent(6, new ya9.InterfaceC15590a() { // from class: mhf
                @Override // p000.ya9.InterfaceC15590a
                public final void invoke(Object obj) {
                    thf.lambda$updateStateAndInformListeners$44(c13049h, (izc.InterfaceC7680g) obj);
                }
            });
        }
        if (isPlaying(c13049h2) != isPlaying(c13049h)) {
            this.f84746d1.queueEvent(7, new ya9.InterfaceC15590a() { // from class: ohf
                @Override // p000.ya9.InterfaceC15590a
                public final void invoke(Object obj) {
                    thf.lambda$updateStateAndInformListeners$45(c13049h, (izc.InterfaceC7680g) obj);
                }
            });
        }
        if (!c13049h2.f84827m.equals(c13049h.f84827m)) {
            this.f84746d1.queueEvent(12, new ya9.InterfaceC15590a() { // from class: qhf
                @Override // p000.ya9.InterfaceC15590a
                public final void invoke(Object obj) {
                    thf.lambda$updateStateAndInformListeners$46(c13049h, (izc.InterfaceC7680g) obj);
                }
            });
        }
        if (c13049h2.f84821g != c13049h.f84821g) {
            this.f84746d1.queueEvent(8, new ya9.InterfaceC15590a() { // from class: shf
                @Override // p000.ya9.InterfaceC15590a
                public final void invoke(Object obj) {
                    thf.lambda$updateStateAndInformListeners$47(c13049h, (izc.InterfaceC7680g) obj);
                }
            });
        }
        if (c13049h2.f84822h != c13049h.f84822h) {
            this.f84746d1.queueEvent(9, new ya9.InterfaceC15590a() { // from class: ycf
                @Override // p000.ya9.InterfaceC15590a
                public final void invoke(Object obj) {
                    thf.lambda$updateStateAndInformListeners$48(c13049h, (izc.InterfaceC7680g) obj);
                }
            });
        }
        if (c13049h2.f84824j != c13049h.f84824j) {
            this.f84746d1.queueEvent(16, new ya9.InterfaceC15590a() { // from class: bdf
                @Override // p000.ya9.InterfaceC15590a
                public final void invoke(Object obj) {
                    thf.lambda$updateStateAndInformListeners$49(c13049h, (izc.InterfaceC7680g) obj);
                }
            });
        }
        if (c13049h2.f84825k != c13049h.f84825k) {
            this.f84746d1.queueEvent(17, new ya9.InterfaceC15590a() { // from class: ddf
                @Override // p000.ya9.InterfaceC15590a
                public final void invoke(Object obj) {
                    thf.lambda$updateStateAndInformListeners$50(c13049h, (izc.InterfaceC7680g) obj);
                }
            });
        }
        if (c13049h2.f84826l != c13049h.f84826l) {
            this.f84746d1.queueEvent(18, new ya9.InterfaceC15590a() { // from class: fdf
                @Override // p000.ya9.InterfaceC15590a
                public final void invoke(Object obj) {
                    thf.lambda$updateStateAndInformListeners$51(c13049h, (izc.InterfaceC7680g) obj);
                }
            });
        }
        if (!c13049h2.f84829o.equals(c13049h.f84829o)) {
            this.f84746d1.queueEvent(20, new ya9.InterfaceC15590a() { // from class: jdf
                @Override // p000.ya9.InterfaceC15590a
                public final void invoke(Object obj) {
                    thf.lambda$updateStateAndInformListeners$52(c13049h, (izc.InterfaceC7680g) obj);
                }
            });
        }
        if (!c13049h2.f84831q.equals(c13049h.f84831q)) {
            this.f84746d1.queueEvent(25, new ya9.InterfaceC15590a() { // from class: ldf
                @Override // p000.ya9.InterfaceC15590a
                public final void invoke(Object obj) {
                    thf.lambda$updateStateAndInformListeners$53(c13049h, (izc.InterfaceC7680g) obj);
                }
            });
        }
        if (!c13049h2.f84833s.equals(c13049h.f84833s)) {
            this.f84746d1.queueEvent(29, new ya9.InterfaceC15590a() { // from class: ndf
                @Override // p000.ya9.InterfaceC15590a
                public final void invoke(Object obj) {
                    thf.lambda$updateStateAndInformListeners$54(c13049h, (izc.InterfaceC7680g) obj);
                }
            });
        }
        if (!c13049h2.f84802B.equals(c13049h.f84802B)) {
            this.f84746d1.queueEvent(15, new ya9.InterfaceC15590a() { // from class: pdf
                @Override // p000.ya9.InterfaceC15590a
                public final void invoke(Object obj) {
                    thf.lambda$updateStateAndInformListeners$55(c13049h, (izc.InterfaceC7680g) obj);
                }
            });
        }
        if (c13049h.f84837w) {
            this.f84746d1.queueEvent(26, new rdf());
        }
        if (!c13049h2.f84836v.equals(c13049h.f84836v)) {
            this.f84746d1.queueEvent(24, new ya9.InterfaceC15590a() { // from class: udf
                @Override // p000.ya9.InterfaceC15590a
                public final void invoke(Object obj) {
                    thf.lambda$updateStateAndInformListeners$56(c13049h, (izc.InterfaceC7680g) obj);
                }
            });
        }
        if (c13049h2.f84830p != c13049h.f84830p) {
            this.f84746d1.queueEvent(22, new ya9.InterfaceC15590a() { // from class: xdf
                @Override // p000.ya9.InterfaceC15590a
                public final void invoke(Object obj) {
                    thf.lambda$updateStateAndInformListeners$57(c13049h, (izc.InterfaceC7680g) obj);
                }
            });
        }
        if (c13049h2.f84834t != c13049h.f84834t || c13049h2.f84835u != c13049h.f84835u) {
            this.f84746d1.queueEvent(30, new ya9.InterfaceC15590a() { // from class: zdf
                @Override // p000.ya9.InterfaceC15590a
                public final void invoke(Object obj) {
                    thf.lambda$updateStateAndInformListeners$58(c13049h, (izc.InterfaceC7680g) obj);
                }
            });
        }
        if (!c13049h2.f84832r.equals(c13049h.f84832r)) {
            this.f84746d1.queueEvent(27, new ya9.InterfaceC15590a() { // from class: bef
                @Override // p000.ya9.InterfaceC15590a
                public final void invoke(Object obj) {
                    thf.lambda$updateStateAndInformListeners$59(c13049h, (izc.InterfaceC7680g) obj);
                }
            });
        }
        if (!c13049h2.f84838x.equals(c13049h.f84838x) && c13049h.f84838x.f34010b != -9223372036854775807L) {
            this.f84746d1.queueEvent(28, new ya9.InterfaceC15590a() { // from class: def
                @Override // p000.ya9.InterfaceC15590a
                public final void invoke(Object obj) {
                    thf.lambda$updateStateAndInformListeners$60(c13049h, (izc.InterfaceC7680g) obj);
                }
            });
        }
        if (!c13049h2.f84815a.equals(c13049h.f84815a)) {
            this.f84746d1.queueEvent(13, new ya9.InterfaceC15590a() { // from class: hef
                @Override // p000.ya9.InterfaceC15590a
                public final void invoke(Object obj) {
                    thf.lambda$updateStateAndInformListeners$61(c13049h, (izc.InterfaceC7680g) obj);
                }
            });
        }
        this.f84746d1.flushEvents();
    }

    @g5e({"state"})
    private void updateStateForPendingOperation(ja9<?> ja9Var, lfg<C13049h> lfgVar) {
        updateStateForPendingOperation(ja9Var, lfgVar, false, false);
    }

    @z25({"state"})
    private void verifyApplicationThreadAndInitState() {
        verifyApplicationThread();
        if (this.f84751i1 == null) {
            this.f84751i1 = mo16374s0();
        }
    }

    @vp6
    /* JADX INFO: renamed from: A0 */
    public ja9<?> mo16356A0(int i, int i2) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_CHANGE_MEDIA_ITEMS");
    }

    @vp6
    /* JADX INFO: renamed from: B0 */
    public ja9<?> mo16357B0(int i, int i2, List<nfa> list) {
        ja9<?> ja9VarMo16375t0 = mo16375t0(i2, list);
        if (i == i2) {
            return ja9VarMo16375t0;
        }
        final ja9<?> ja9VarMo16356A0 = mo16356A0(i, i2);
        return t0i.transformFutureAsync(ja9VarMo16375t0, new v90() { // from class: zgf
            @Override // p000.v90
            public final ja9 apply(Object obj) {
                return thf.lambda$handleReplaceMediaItems$31(ja9VarMo16356A0, obj);
            }
        });
    }

    @vp6
    /* JADX INFO: renamed from: C0 */
    public ja9<?> mo16358C0(int i, long j, int i2) {
        throw new IllegalStateException("Missing implementation to handle one of the COMMAND_SEEK_*");
    }

    @vp6
    /* JADX INFO: renamed from: D0 */
    public ja9<?> mo16359D0(uc0 uc0Var, boolean z) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_SET_AUDIO_ATTRIBUTES");
    }

    @vp6
    /* JADX INFO: renamed from: E0 */
    public ja9<?> mo16360E0(boolean z, int i) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_ADJUST_DEVICE_VOLUME or COMMAND_ADJUST_DEVICE_VOLUME_WITH_FLAGS");
    }

    @vp6
    /* JADX INFO: renamed from: F0 */
    public ja9<?> mo16361F0(@h78(from = 0) int i, int i2) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_SET_DEVICE_VOLUME or COMMAND_SET_DEVICE_VOLUME_WITH_FLAGS");
    }

    @vp6
    /* JADX INFO: renamed from: G0 */
    public ja9<?> mo16362G0(List<nfa> list, int i, long j) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_SET_MEDIA_ITEM(S)");
    }

    @vp6
    /* JADX INFO: renamed from: H0 */
    public ja9<?> mo16363H0(boolean z) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_PLAY_PAUSE");
    }

    @vp6
    /* JADX INFO: renamed from: I0 */
    public ja9<?> mo16364I0(ryc rycVar) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_SET_SPEED_AND_PITCH");
    }

    @vp6
    /* JADX INFO: renamed from: J0 */
    public ja9<?> mo16365J0(hga hgaVar) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_SET_PLAYLIST_METADATA");
    }

    @vp6
    /* JADX INFO: renamed from: K0 */
    public ja9<?> mo16366K0(int i) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_SET_REPEAT_MODE");
    }

    @vp6
    /* JADX INFO: renamed from: L0 */
    public ja9<?> mo16367L0(boolean z) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_SET_SHUFFLE_MODE");
    }

    @vp6
    /* JADX INFO: renamed from: M0 */
    public ja9<?> mo16368M0(h7h h7hVar) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_SET_TRACK_SELECTION_PARAMETERS");
    }

    @vp6
    /* JADX INFO: renamed from: N0 */
    public ja9<?> mo16369N0(Object obj) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_SET_VIDEO_SURFACE");
    }

    @vp6
    /* JADX INFO: renamed from: O0 */
    public ja9<?> mo16370O0(@y46(from = 0.0d, m25645to = 1.0d) float f) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_SET_VOLUME");
    }

    @vp6
    /* JADX INFO: renamed from: P0 */
    public ja9<?> mo16371P0() {
        throw new IllegalStateException("Missing implementation to handle COMMAND_STOP");
    }

    /* JADX INFO: renamed from: Q0 */
    public final void m22596Q0() {
        verifyApplicationThreadAndInitState();
        if (!this.f84749g1.isEmpty() || this.f84752j1) {
            return;
        }
        updateStateAndInformListeners(mo16374s0(), false, false);
    }

    @Override // p000.bt0
    /* JADX INFO: renamed from: a */
    public final void mo1848a(final int i, final long j, int i2, boolean z) {
        verifyApplicationThreadAndInitState();
        v80.checkArgument(i == -1 || i >= 0);
        final C13049h c13049h = this.f84751i1;
        if (shouldHandleCommand(i2)) {
            boolean z2 = i == -1 || isPlayingAd() || (!c13049h.f84839y.isEmpty() && i >= c13049h.f84839y.getWindowCount());
            final boolean z3 = z2;
            updateStateForPendingOperation(mo16358C0(i, j, i2), new lfg() { // from class: vgf
                @Override // p000.lfg
                public final Object get() {
                    return this.f91113a.lambda$seekTo$10(z3, c13049h, i, j);
                }
            }, !z2, z);
        }
    }

    @Override // p000.izc
    public final void addListener(izc.InterfaceC7680g interfaceC7680g) {
        this.f84746d1.add((izc.InterfaceC7680g) v80.checkNotNull(interfaceC7680g));
    }

    @Override // p000.izc
    public final void addMediaItems(int i, final List<nfa> list) {
        verifyApplicationThreadAndInitState();
        v80.checkArgument(i >= 0);
        final C13049h c13049h = this.f84751i1;
        int windowCount = c13049h.f84839y.getWindowCount();
        if (!shouldHandleCommand(20) || list.isEmpty()) {
            return;
        }
        final int iMin = Math.min(i, windowCount);
        updateStateForPendingOperation(mo16375t0(iMin, list), new lfg() { // from class: mff
            @Override // p000.lfg
            public final Object get() {
                return this.f60900a.lambda$addMediaItems$3(c13049h, list, iMin);
            }
        });
    }

    @Override // p000.izc
    public final void clearVideoSurface() {
        clearVideoOutput(null);
    }

    @Override // p000.izc
    public final void clearVideoSurfaceHolder(@hib SurfaceHolder surfaceHolder) {
        clearVideoOutput(surfaceHolder);
    }

    @Override // p000.izc
    public final void clearVideoSurfaceView(@hib SurfaceView surfaceView) {
        clearVideoOutput(surfaceView);
    }

    @Override // p000.izc
    public final void clearVideoTextureView(@hib TextureView textureView) {
        clearVideoOutput(textureView);
    }

    @Override // p000.izc
    @Deprecated
    public final void decreaseDeviceVolume() {
        verifyApplicationThreadAndInitState();
        final C13049h c13049h = this.f84751i1;
        if (shouldHandleCommand(26)) {
            updateStateForPendingOperation(mo16377v0(1), new lfg() { // from class: tff
                @Override // p000.lfg
                public final Object get() {
                    return thf.lambda$decreaseDeviceVolume$26(c13049h);
                }
            });
        }
    }

    @Override // p000.izc
    public final Looper getApplicationLooper() {
        return this.f84747e1;
    }

    @Override // p000.izc
    public final uc0 getAudioAttributes() {
        verifyApplicationThreadAndInitState();
        return this.f84751i1.f84829o;
    }

    @Override // p000.izc
    public final izc.C7676c getAvailableCommands() {
        verifyApplicationThreadAndInitState();
        return this.f84751i1.f84815a;
    }

    @Override // p000.izc
    public final long getBufferedPosition() {
        verifyApplicationThreadAndInitState();
        return isPlayingAd() ? Math.max(this.f84751i1.f84809I.get(), this.f84751i1.f84807G.get()) : getContentBufferedPosition();
    }

    @Override // p000.izc
    public final long getContentBufferedPosition() {
        verifyApplicationThreadAndInitState();
        return Math.max(getContentBufferedPositionMsInternal(this.f84751i1, this.f14707c1), getContentPositionMsInternal(this.f84751i1, this.f14707c1));
    }

    @Override // p000.izc
    public final long getContentPosition() {
        verifyApplicationThreadAndInitState();
        return getContentPositionMsInternal(this.f84751i1, this.f14707c1);
    }

    @Override // p000.izc
    public final int getCurrentAdGroupIndex() {
        verifyApplicationThreadAndInitState();
        return this.f84751i1.f84804D;
    }

    @Override // p000.izc
    public final int getCurrentAdIndexInAdGroup() {
        verifyApplicationThreadAndInitState();
        return this.f84751i1.f84805E;
    }

    @Override // p000.izc
    public final z93 getCurrentCues() {
        verifyApplicationThreadAndInitState();
        return this.f84751i1.f84832r;
    }

    @Override // p000.izc
    public final int getCurrentMediaItemIndex() {
        verifyApplicationThreadAndInitState();
        return getCurrentMediaItemIndexInternal(this.f84751i1);
    }

    @Override // p000.izc
    public final int getCurrentPeriodIndex() {
        verifyApplicationThreadAndInitState();
        return getCurrentPeriodIndexInternal(this.f84751i1, this.f14707c1, this.f84750h1);
    }

    @Override // p000.izc
    public final long getCurrentPosition() {
        verifyApplicationThreadAndInitState();
        return isPlayingAd() ? this.f84751i1.f84807G.get() : getContentPosition();
    }

    @Override // p000.izc
    public final q1h getCurrentTimeline() {
        verifyApplicationThreadAndInitState();
        return this.f84751i1.f84839y;
    }

    @Override // p000.izc
    public final x7h getCurrentTracks() {
        verifyApplicationThreadAndInitState();
        return this.f84751i1.f84840z;
    }

    @Override // p000.izc
    public final o84 getDeviceInfo() {
        verifyApplicationThreadAndInitState();
        return this.f84751i1.f84833s;
    }

    @Override // p000.izc
    public final int getDeviceVolume() {
        verifyApplicationThreadAndInitState();
        return this.f84751i1.f84834t;
    }

    @Override // p000.izc
    public final long getDuration() {
        verifyApplicationThreadAndInitState();
        if (!isPlayingAd()) {
            return getContentDuration();
        }
        this.f84751i1.f84839y.getPeriod(getCurrentPeriodIndex(), this.f84750h1);
        q1h.C11270b c11270b = this.f84750h1;
        C13049h c13049h = this.f84751i1;
        return t0i.usToMs(c11270b.getAdDurationUs(c13049h.f84804D, c13049h.f84805E));
    }

    @Override // p000.izc
    public final long getMaxSeekToPreviousPosition() {
        verifyApplicationThreadAndInitState();
        return this.f84751i1.f84826l;
    }

    @Override // p000.izc
    public final hga getMediaMetadata() {
        verifyApplicationThreadAndInitState();
        return this.f84751i1.f84801A;
    }

    @Override // p000.izc
    public final boolean getPlayWhenReady() {
        verifyApplicationThreadAndInitState();
        return this.f84751i1.f84816b;
    }

    @Override // p000.izc
    public final ryc getPlaybackParameters() {
        verifyApplicationThreadAndInitState();
        return this.f84751i1.f84827m;
    }

    @Override // p000.izc
    public final int getPlaybackState() {
        verifyApplicationThreadAndInitState();
        return this.f84751i1.f84818d;
    }

    @Override // p000.izc
    public final int getPlaybackSuppressionReason() {
        verifyApplicationThreadAndInitState();
        return this.f84751i1.f84819e;
    }

    @Override // p000.izc
    @hib
    public final kyc getPlayerError() {
        verifyApplicationThreadAndInitState();
        return this.f84751i1.f84820f;
    }

    @Override // p000.izc
    public final hga getPlaylistMetadata() {
        verifyApplicationThreadAndInitState();
        return this.f84751i1.f84802B;
    }

    @Override // p000.izc
    public final int getRepeatMode() {
        verifyApplicationThreadAndInitState();
        return this.f84751i1.f84821g;
    }

    @Override // p000.izc
    public final long getSeekBackIncrement() {
        verifyApplicationThreadAndInitState();
        return this.f84751i1.f84824j;
    }

    @Override // p000.izc
    public final long getSeekForwardIncrement() {
        verifyApplicationThreadAndInitState();
        return this.f84751i1.f84825k;
    }

    @Override // p000.izc
    public final boolean getShuffleModeEnabled() {
        verifyApplicationThreadAndInitState();
        return this.f84751i1.f84822h;
    }

    @Override // p000.izc
    public final xpf getSurfaceSize() {
        verifyApplicationThreadAndInitState();
        return this.f84751i1.f84836v;
    }

    @Override // p000.izc
    public final long getTotalBufferedDuration() {
        verifyApplicationThreadAndInitState();
        return this.f84751i1.f84810J.get();
    }

    @Override // p000.izc
    public final h7h getTrackSelectionParameters() {
        verifyApplicationThreadAndInitState();
        return this.f84751i1.f84828n;
    }

    @Override // p000.izc
    public final a8i getVideoSize() {
        verifyApplicationThreadAndInitState();
        return this.f84751i1.f84831q;
    }

    @Override // p000.izc
    public final float getVolume() {
        verifyApplicationThreadAndInitState();
        return this.f84751i1.f84830p;
    }

    @Override // p000.izc
    @Deprecated
    public final void increaseDeviceVolume() {
        verifyApplicationThreadAndInitState();
        final C13049h c13049h = this.f84751i1;
        if (shouldHandleCommand(26)) {
            updateStateForPendingOperation(mo16378w0(1), new lfg() { // from class: rgf
                @Override // p000.lfg
                public final Object get() {
                    return thf.lambda$increaseDeviceVolume$24(c13049h);
                }
            });
        }
    }

    @Override // p000.izc
    public final boolean isDeviceMuted() {
        verifyApplicationThreadAndInitState();
        return this.f84751i1.f84835u;
    }

    @Override // p000.izc
    public final boolean isLoading() {
        verifyApplicationThreadAndInitState();
        return this.f84751i1.f84823i;
    }

    @Override // p000.izc
    public final boolean isPlayingAd() {
        verifyApplicationThreadAndInitState();
        return this.f84751i1.f84804D != -1;
    }

    @Override // p000.izc
    public final void moveMediaItems(final int i, int i2, int i3) {
        verifyApplicationThreadAndInitState();
        v80.checkArgument(i >= 0 && i2 >= i && i3 >= 0);
        final C13049h c13049h = this.f84751i1;
        int windowCount = c13049h.f84839y.getWindowCount();
        if (!shouldHandleCommand(20) || windowCount == 0 || i >= windowCount) {
            return;
        }
        final int iMin = Math.min(i2, windowCount);
        final int iMin2 = Math.min(i3, windowCount - (iMin - i));
        if (i == iMin || iMin2 == i) {
            return;
        }
        updateStateForPendingOperation(mo16379x0(i, iMin, iMin2), new lfg() { // from class: pgf
            @Override // p000.lfg
            public final Object get() {
                return this.f70711a.lambda$moveMediaItems$4(c13049h, i, iMin, iMin2);
            }
        });
    }

    @Override // p000.izc
    public final void prepare() {
        verifyApplicationThreadAndInitState();
        final C13049h c13049h = this.f84751i1;
        if (shouldHandleCommand(2)) {
            updateStateForPendingOperation(mo16380y0(), new lfg() { // from class: ehf
                @Override // p000.lfg
                public final Object get() {
                    return thf.lambda$prepare$7(c13049h);
                }
            });
        }
    }

    @vp6
    /* JADX INFO: renamed from: q0 */
    public C13044c m22597q0(nfa nfaVar) {
        return new C13044c.a(new C13046e()).setMediaItem(nfaVar).setIsDynamic(true).setIsPlaceholder(true).build();
    }

    @vp6
    /* JADX INFO: renamed from: r0 */
    public C13049h m22598r0(C13049h c13049h) {
        return c13049h;
    }

    @Override // p000.izc
    public final void release() {
        verifyApplicationThreadAndInitState();
        final C13049h c13049h = this.f84751i1;
        if (shouldHandleCommand(32)) {
            updateStateForPendingOperation(mo16381z0(), new lfg() { // from class: fgf
                @Override // p000.lfg
                public final Object get() {
                    return thf.lambda$release$13(c13049h);
                }
            });
            this.f84752j1 = true;
            this.f84746d1.release();
            this.f84751i1 = this.f84751i1.buildUpon().setPlaybackState(1).setTotalBufferedDurationMs(InterfaceC13048g.f84800a).setContentBufferedPositionMs(InterfaceC13048g.getConstant(getContentPositionMsInternal(c13049h, this.f14707c1))).setAdBufferedPositionMs(c13049h.f84807G).setIsLoading(false).build();
        }
    }

    @Override // p000.izc
    public final void removeListener(izc.InterfaceC7680g interfaceC7680g) {
        verifyApplicationThreadAndInitState();
        this.f84746d1.remove(interfaceC7680g);
    }

    @Override // p000.izc
    public final void removeMediaItems(final int i, int i2) {
        final int iMin;
        verifyApplicationThreadAndInitState();
        v80.checkArgument(i >= 0 && i2 >= i);
        final C13049h c13049h = this.f84751i1;
        int windowCount = c13049h.f84839y.getWindowCount();
        if (!shouldHandleCommand(20) || windowCount == 0 || i >= windowCount || i == (iMin = Math.min(i2, windowCount))) {
            return;
        }
        updateStateForPendingOperation(mo16356A0(i, iMin), new lfg() { // from class: xgf
            @Override // p000.lfg
            public final Object get() {
                return this.f97732a.lambda$removeMediaItems$6(c13049h, i, iMin);
            }
        });
    }

    @Override // p000.izc
    public final void replaceMediaItems(final int i, int i2, final List<nfa> list) {
        verifyApplicationThreadAndInitState();
        v80.checkArgument(i >= 0 && i <= i2);
        final C13049h c13049h = this.f84751i1;
        int windowCount = c13049h.f84839y.getWindowCount();
        if (!shouldHandleCommand(20) || i > windowCount) {
            return;
        }
        final int iMin = Math.min(i2, windowCount);
        updateStateForPendingOperation(mo16357B0(i, iMin, list), new lfg() { // from class: zef
            @Override // p000.lfg
            public final Object get() {
                return this.f104947a.lambda$replaceMediaItems$5(c13049h, list, iMin, i);
            }
        });
    }

    @vp6
    /* JADX INFO: renamed from: s0 */
    public abstract C13049h mo16374s0();

    @Override // p000.izc
    public final void setAudioAttributes(final uc0 uc0Var, boolean z) {
        verifyApplicationThreadAndInitState();
        final C13049h c13049h = this.f84751i1;
        if (shouldHandleCommand(35)) {
            updateStateForPendingOperation(mo16359D0(uc0Var, z), new lfg() { // from class: tgf
                @Override // p000.lfg
                public final Object get() {
                    return thf.lambda$setAudioAttributes$30(c13049h, uc0Var);
                }
            });
        }
    }

    @Override // p000.izc
    @Deprecated
    public final void setDeviceMuted(final boolean z) {
        verifyApplicationThreadAndInitState();
        final C13049h c13049h = this.f84751i1;
        if (shouldHandleCommand(26)) {
            updateStateForPendingOperation(mo16360E0(z, 1), new lfg() { // from class: lgf
                @Override // p000.lfg
                public final Object get() {
                    return thf.lambda$setDeviceMuted$28(c13049h, z);
                }
            });
        }
    }

    @Override // p000.izc
    @Deprecated
    public final void setDeviceVolume(final int i) {
        verifyApplicationThreadAndInitState();
        final C13049h c13049h = this.f84751i1;
        if (shouldHandleCommand(25)) {
            updateStateForPendingOperation(mo16361F0(i, 1), new lfg() { // from class: sdf
                @Override // p000.lfg
                public final Object get() {
                    return thf.lambda$setDeviceVolume$22(c13049h, i);
                }
            });
        }
    }

    @Override // p000.izc
    public final void setMediaItems(List<nfa> list, boolean z) {
        verifyApplicationThreadAndInitState();
        setMediaItemsInternal(list, z ? -1 : this.f84751i1.f84803C, z ? -9223372036854775807L : this.f84751i1.f84806F.get());
    }

    @Override // p000.izc
    public final void setPlayWhenReady(final boolean z) {
        verifyApplicationThreadAndInitState();
        final C13049h c13049h = this.f84751i1;
        if (shouldHandleCommand(1)) {
            updateStateForPendingOperation(mo16363H0(z), new lfg() { // from class: wcf
                @Override // p000.lfg
                public final Object get() {
                    return thf.lambda$setPlayWhenReady$1(c13049h, z);
                }
            });
        }
    }

    @Override // p000.izc
    public final void setPlaybackParameters(final ryc rycVar) {
        verifyApplicationThreadAndInitState();
        final C13049h c13049h = this.f84751i1;
        if (shouldHandleCommand(13)) {
            updateStateForPendingOperation(mo16364I0(rycVar), new lfg() { // from class: ihf
                @Override // p000.lfg
                public final Object get() {
                    return thf.lambda$setPlaybackParameters$11(c13049h, rycVar);
                }
            });
        }
    }

    @Override // p000.izc
    public final void setPlaylistMetadata(final hga hgaVar) {
        verifyApplicationThreadAndInitState();
        final C13049h c13049h = this.f84751i1;
        if (shouldHandleCommand(19)) {
            updateStateForPendingOperation(mo16365J0(hgaVar), new lfg() { // from class: xff
                @Override // p000.lfg
                public final Object get() {
                    return thf.lambda$setPlaylistMetadata$15(c13049h, hgaVar);
                }
            });
        }
    }

    @Override // p000.izc
    public final void setRepeatMode(final int i) {
        verifyApplicationThreadAndInitState();
        final C13049h c13049h = this.f84751i1;
        if (shouldHandleCommand(15)) {
            updateStateForPendingOperation(mo16366K0(i), new lfg() { // from class: zff
                @Override // p000.lfg
                public final Object get() {
                    return thf.lambda$setRepeatMode$8(c13049h, i);
                }
            });
        }
    }

    @Override // p000.izc
    public final void setShuffleModeEnabled(final boolean z) {
        verifyApplicationThreadAndInitState();
        final C13049h c13049h = this.f84751i1;
        if (shouldHandleCommand(14)) {
            updateStateForPendingOperation(mo16367L0(z), new lfg() { // from class: pff
                @Override // p000.lfg
                public final Object get() {
                    return thf.lambda$setShuffleModeEnabled$9(c13049h, z);
                }
            });
        }
    }

    @Override // p000.izc
    public final void setTrackSelectionParameters(final h7h h7hVar) {
        verifyApplicationThreadAndInitState();
        final C13049h c13049h = this.f84751i1;
        if (shouldHandleCommand(29)) {
            updateStateForPendingOperation(mo16368M0(h7hVar), new lfg() { // from class: khf
                @Override // p000.lfg
                public final Object get() {
                    return thf.lambda$setTrackSelectionParameters$14(c13049h, h7hVar);
                }
            });
        }
    }

    @Override // p000.izc
    public final void setVideoSurface(@hib Surface surface) {
        verifyApplicationThreadAndInitState();
        final C13049h c13049h = this.f84751i1;
        if (shouldHandleCommand(27)) {
            if (surface == null) {
                clearVideoSurface();
            } else {
                updateStateForPendingOperation(mo16369N0(surface), new lfg() { // from class: dff
                    @Override // p000.lfg
                    public final Object get() {
                        return thf.lambda$setVideoSurface$17(c13049h);
                    }
                });
            }
        }
    }

    @Override // p000.izc
    public final void setVideoSurfaceHolder(@hib final SurfaceHolder surfaceHolder) {
        verifyApplicationThreadAndInitState();
        final C13049h c13049h = this.f84751i1;
        if (shouldHandleCommand(27)) {
            if (surfaceHolder == null) {
                clearVideoSurface();
            } else {
                updateStateForPendingOperation(mo16369N0(surfaceHolder), new lfg() { // from class: dgf
                    @Override // p000.lfg
                    public final Object get() {
                        return thf.lambda$setVideoSurfaceHolder$18(c13049h, surfaceHolder);
                    }
                });
            }
        }
    }

    @Override // p000.izc
    public final void setVideoSurfaceView(@hib final SurfaceView surfaceView) {
        verifyApplicationThreadAndInitState();
        final C13049h c13049h = this.f84751i1;
        if (shouldHandleCommand(27)) {
            if (surfaceView == null) {
                clearVideoSurface();
            } else {
                updateStateForPendingOperation(mo16369N0(surfaceView), new lfg() { // from class: igf
                    @Override // p000.lfg
                    public final Object get() {
                        return thf.lambda$setVideoSurfaceView$19(c13049h, surfaceView);
                    }
                });
            }
        }
    }

    @Override // p000.izc
    public final void setVideoTextureView(@hib TextureView textureView) {
        verifyApplicationThreadAndInitState();
        final C13049h c13049h = this.f84751i1;
        if (shouldHandleCommand(27)) {
            if (textureView == null) {
                clearVideoSurface();
            } else {
                final xpf xpfVar = textureView.isAvailable() ? new xpf(textureView.getWidth(), textureView.getHeight()) : xpf.f98881d;
                updateStateForPendingOperation(mo16369N0(textureView), new lfg() { // from class: oef
                    @Override // p000.lfg
                    public final Object get() {
                        return thf.lambda$setVideoTextureView$20(c13049h, xpfVar);
                    }
                });
            }
        }
    }

    @Override // p000.izc
    public final void setVolume(final float f) {
        verifyApplicationThreadAndInitState();
        final C13049h c13049h = this.f84751i1;
        if (shouldHandleCommand(24)) {
            updateStateForPendingOperation(mo16370O0(f), new lfg() { // from class: bgf
                @Override // p000.lfg
                public final Object get() {
                    return thf.lambda$setVolume$16(c13049h, f);
                }
            });
        }
    }

    @Override // p000.izc
    public final void stop() {
        verifyApplicationThreadAndInitState();
        final C13049h c13049h = this.f84751i1;
        if (shouldHandleCommand(3)) {
            updateStateForPendingOperation(mo16371P0(), new lfg() { // from class: bhf
                @Override // p000.lfg
                public final Object get() {
                    return this.f13758a.lambda$stop$12(c13049h);
                }
            });
        }
    }

    @vp6
    /* JADX INFO: renamed from: t0 */
    public ja9<?> mo16375t0(int i, List<nfa> list) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_CHANGE_MEDIA_ITEMS");
    }

    @vp6
    /* JADX INFO: renamed from: u0 */
    public ja9<?> mo16376u0(@hib Object obj) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_SET_VIDEO_SURFACE");
    }

    @vp6
    /* JADX INFO: renamed from: v0 */
    public ja9<?> mo16377v0(int i) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_ADJUST_DEVICE_VOLUME or COMMAND_ADJUST_DEVICE_VOLUME_WITH_FLAGS");
    }

    public final void verifyApplicationThread() {
        if (Thread.currentThread() != this.f84747e1.getThread()) {
            throw new IllegalStateException(t0i.formatInvariant("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\n", Thread.currentThread().getName(), this.f84747e1.getThread().getName()));
        }
    }

    @vp6
    /* JADX INFO: renamed from: w0 */
    public ja9<?> mo16378w0(int i) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_ADJUST_DEVICE_VOLUME or COMMAND_ADJUST_DEVICE_VOLUME_WITH_FLAGS");
    }

    @vp6
    /* JADX INFO: renamed from: x0 */
    public ja9<?> mo16379x0(int i, int i2, int i3) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_CHANGE_MEDIA_ITEMS");
    }

    @vp6
    /* JADX INFO: renamed from: y0 */
    public ja9<?> mo16380y0() {
        throw new IllegalStateException("Missing implementation to handle COMMAND_PREPARE");
    }

    @vp6
    /* JADX INFO: renamed from: z0 */
    public ja9<?> mo16381z0() {
        throw new IllegalStateException("Missing implementation to handle COMMAND_RELEASE");
    }

    public thf(Looper looper, j52 j52Var) {
        this.f84747e1 = looper;
        this.f84748f1 = j52Var.createHandler(looper, null);
        this.f84749g1 = new HashSet<>();
        this.f84750h1 = new q1h.C11270b();
        this.f84746d1 = new ya9<>(looper, j52Var, new ya9.InterfaceC15591b() { // from class: vff
            @Override // p000.ya9.InterfaceC15591b
            public final void invoke(Object obj, h36 h36Var) {
                this.f91012a.lambda$new$0((izc.InterfaceC7680g) obj, h36Var);
            }
        });
    }

    @g5e({"state"})
    private void updateStateForPendingOperation(final ja9<?> ja9Var, lfg<C13049h> lfgVar, boolean z, boolean z2) {
        if (ja9Var.isDone() && this.f84749g1.isEmpty()) {
            updateStateAndInformListeners(mo16374s0(), z, z2);
            return;
        }
        this.f84749g1.add(ja9Var);
        updateStateAndInformListeners(m22598r0(lfgVar.get()), z, z2);
        ja9Var.addListener(new Runnable() { // from class: fff
            @Override // java.lang.Runnable
            public final void run() {
                this.f36455a.lambda$updateStateForPendingOperation$62(ja9Var);
            }
        }, new Executor() { // from class: hff
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                this.f43399a.postOrRunOnApplicationHandler(runnable);
            }
        });
    }

    @Override // p000.izc
    public final void clearVideoSurface(@hib Surface surface) {
        clearVideoOutput(surface);
    }

    @Override // p000.izc
    public final void setMediaItems(List<nfa> list, int i, long j) {
        verifyApplicationThreadAndInitState();
        if (i == -1) {
            C13049h c13049h = this.f84751i1;
            int i2 = c13049h.f84803C;
            long j2 = c13049h.f84806F.get();
            i = i2;
            j = j2;
        }
        setMediaItemsInternal(list, i, j);
    }

    @Override // p000.izc
    public final void decreaseDeviceVolume(int i) {
        verifyApplicationThreadAndInitState();
        final C13049h c13049h = this.f84751i1;
        if (shouldHandleCommand(34)) {
            updateStateForPendingOperation(mo16377v0(i), new lfg() { // from class: ghf
                @Override // p000.lfg
                public final Object get() {
                    return thf.lambda$decreaseDeviceVolume$27(c13049h);
                }
            });
        }
    }

    @Override // p000.izc
    public final void increaseDeviceVolume(int i) {
        verifyApplicationThreadAndInitState();
        final C13049h c13049h = this.f84751i1;
        if (shouldHandleCommand(34)) {
            updateStateForPendingOperation(mo16378w0(i), new lfg() { // from class: jff
                @Override // p000.lfg
                public final Object get() {
                    return thf.lambda$increaseDeviceVolume$25(c13049h);
                }
            });
        }
    }

    @Override // p000.izc
    public final void setDeviceMuted(final boolean z, int i) {
        verifyApplicationThreadAndInitState();
        final C13049h c13049h = this.f84751i1;
        if (shouldHandleCommand(34)) {
            updateStateForPendingOperation(mo16360E0(z, i), new lfg() { // from class: jhf
                @Override // p000.lfg
                public final Object get() {
                    return thf.lambda$setDeviceMuted$29(c13049h, z);
                }
            });
        }
    }

    @Override // p000.izc
    public final void setDeviceVolume(final int i, int i2) {
        verifyApplicationThreadAndInitState();
        final C13049h c13049h = this.f84751i1;
        if (shouldHandleCommand(33)) {
            updateStateForPendingOperation(mo16361F0(i, i2), new lfg() { // from class: rff
                @Override // p000.lfg
                public final Object get() {
                    return thf.lambda$setDeviceVolume$23(c13049h, i);
                }
            });
        }
    }
}
