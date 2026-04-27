package p000;

import android.os.Handler;
import java.io.IOException;
import p000.h62;
import p000.peg;

/* JADX INFO: loaded from: classes3.dex */
public interface una {

    /* JADX INFO: renamed from: una$a */
    public interface InterfaceC13611a {

        /* JADX INFO: renamed from: a */
        @ovh
        public static final InterfaceC13611a f88602a = loa.f58363b;

        @ovh
        una createMediaSource(nfa nfaVar);

        @ovh
        @Deprecated
        default InterfaceC13611a experimentalParseSubtitlesDuringExtraction(boolean z) {
            return this;
        }

        @op1
        @ovh
        default InterfaceC13611a experimentalSetCodecsToParseWithinGopSampleDependencies(int i) {
            return this;
        }

        @ovh
        int[] getSupportedTypes();

        @ovh
        default InterfaceC13611a setCmcdConfigurationFactory(h62.InterfaceC6721c interfaceC6721c) {
            return this;
        }

        @ovh
        InterfaceC13611a setDrmSessionManagerProvider(sr4 sr4Var);

        @ovh
        InterfaceC13611a setLoadErrorHandlingPolicy(hc9 hc9Var);

        @ovh
        default InterfaceC13611a setSubtitleParserFactory(peg.InterfaceC10936a interfaceC10936a) {
            return this;
        }
    }

    /* JADX INFO: renamed from: una$b */
    @ovh
    public static final class C13612b {

        /* JADX INFO: renamed from: a */
        public final Object f88603a;

        /* JADX INFO: renamed from: b */
        public final int f88604b;

        /* JADX INFO: renamed from: c */
        public final int f88605c;

        /* JADX INFO: renamed from: d */
        public final long f88606d;

        /* JADX INFO: renamed from: e */
        public final int f88607e;

        public C13612b(Object obj) {
            this(obj, -1L);
        }

        public C13612b copyWithPeriodUid(Object obj) {
            return this.f88603a.equals(obj) ? this : new C13612b(obj, this.f88604b, this.f88605c, this.f88606d, this.f88607e);
        }

        public C13612b copyWithWindowSequenceNumber(long j) {
            return this.f88606d == j ? this : new C13612b(this.f88603a, this.f88604b, this.f88605c, j, this.f88607e);
        }

        public boolean equals(@hib Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C13612b)) {
                return false;
            }
            C13612b c13612b = (C13612b) obj;
            return this.f88603a.equals(c13612b.f88603a) && this.f88604b == c13612b.f88604b && this.f88605c == c13612b.f88605c && this.f88606d == c13612b.f88606d && this.f88607e == c13612b.f88607e;
        }

        public int hashCode() {
            return ((((((((527 + this.f88603a.hashCode()) * 31) + this.f88604b) * 31) + this.f88605c) * 31) + ((int) this.f88606d)) * 31) + this.f88607e;
        }

        public boolean isAd() {
            return this.f88604b != -1;
        }

        public C13612b(Object obj, long j) {
            this(obj, -1, -1, j, -1);
        }

        public C13612b(Object obj, long j, int i) {
            this(obj, -1, -1, j, i);
        }

        public C13612b(Object obj, int i, int i2, long j) {
            this(obj, i, i2, j, -1);
        }

        private C13612b(Object obj, int i, int i2, long j, int i3) {
            this.f88603a = obj;
            this.f88604b = i;
            this.f88605c = i2;
            this.f88606d = j;
            this.f88607e = i3;
        }
    }

    /* JADX INFO: renamed from: una$c */
    @ovh
    public interface InterfaceC13613c {
        void onSourceInfoRefreshed(una unaVar, q1h q1hVar);
    }

    @ovh
    void addDrmEventListener(Handler handler, nr4 nr4Var);

    @ovh
    void addEventListener(Handler handler, joa joaVar);

    @ovh
    default boolean canUpdateMediaItem(nfa nfaVar) {
        return false;
    }

    @ovh
    mja createPeriod(C13612b c13612b, InterfaceC5892fn interfaceC5892fn, long j);

    @ovh
    void disable(InterfaceC13613c interfaceC13613c);

    @ovh
    void enable(InterfaceC13613c interfaceC13613c);

    @hib
    @ovh
    default q1h getInitialTimeline() {
        return null;
    }

    @ovh
    nfa getMediaItem();

    @ovh
    default boolean isSingleWindow() {
        return true;
    }

    @ovh
    void maybeThrowSourceInfoRefreshError() throws IOException;

    @ovh
    @Deprecated
    default void prepareSource(InterfaceC13613c interfaceC13613c, @hib qdh qdhVar) {
        prepareSource(interfaceC13613c, qdhVar, j0d.f49299d);
    }

    @ovh
    void prepareSource(InterfaceC13613c interfaceC13613c, @hib qdh qdhVar, j0d j0dVar);

    @ovh
    void releasePeriod(mja mjaVar);

    @ovh
    void releaseSource(InterfaceC13613c interfaceC13613c);

    @ovh
    void removeDrmEventListener(nr4 nr4Var);

    @ovh
    void removeEventListener(joa joaVar);

    @ovh
    default void updateMediaItem(nfa nfaVar) {
    }
}
