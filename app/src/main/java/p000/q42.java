package p000;

import p000.rn1;

/* JADX INFO: loaded from: classes7.dex */
@lg5("https://github.com/grpc/grpc-java/issues/2861")
@kyg
public abstract class q42 extends g6g {

    /* JADX INFO: renamed from: a */
    public static final rn1.C12165c<Long> f73176a = rn1.C12165c.create("io.grpc.ClientStreamTracer.NAME_RESOLUTION_DELAYED");

    /* JADX INFO: renamed from: q42$a */
    public static abstract class AbstractC11305a {
        public q42 newClientStreamTracer(C11306b c11306b, fta ftaVar) {
            throw new UnsupportedOperationException("Not implemented");
        }
    }

    /* JADX INFO: renamed from: q42$b */
    @lg5("https://github.com/grpc/grpc-java/issues/2861")
    public static final class C11306b {

        /* JADX INFO: renamed from: a */
        public final rn1 f73177a;

        /* JADX INFO: renamed from: b */
        public final int f73178b;

        /* JADX INFO: renamed from: c */
        public final boolean f73179c;

        /* JADX INFO: renamed from: q42$b$a */
        public static final class a {

            /* JADX INFO: renamed from: a */
            public rn1 f73180a = rn1.f78745k;

            /* JADX INFO: renamed from: b */
            public int f73181b;

            /* JADX INFO: renamed from: c */
            public boolean f73182c;

            public C11306b build() {
                return new C11306b(this.f73180a, this.f73181b, this.f73182c);
            }

            public a setCallOptions(rn1 rn1Var) {
                this.f73180a = (rn1) v7d.checkNotNull(rn1Var, "callOptions cannot be null");
                return this;
            }

            public a setIsTransparentRetry(boolean z) {
                this.f73182c = z;
                return this;
            }

            public a setPreviousAttempts(int i) {
                this.f73181b = i;
                return this;
            }
        }

        public C11306b(rn1 rn1Var, int i, boolean z) {
            this.f73177a = (rn1) v7d.checkNotNull(rn1Var, "callOptions");
            this.f73178b = i;
            this.f73179c = z;
        }

        public static a newBuilder() {
            return new a();
        }

        public rn1 getCallOptions() {
            return this.f73177a;
        }

        public int getPreviousAttempts() {
            return this.f73178b;
        }

        public boolean isTransparentRetry() {
            return this.f73179c;
        }

        public a toBuilder() {
            return new a().setCallOptions(this.f73177a).setPreviousAttempts(this.f73178b).setIsTransparentRetry(this.f73179c);
        }

        public String toString() {
            return yya.toStringHelper(this).add("callOptions", this.f73177a).add("previousAttempts", this.f73178b).add("isTransparentRetry", this.f73179c).toString();
        }
    }

    public void createPendingStream() {
    }

    public void inboundHeaders() {
    }

    public void inboundTrailers(fta ftaVar) {
    }

    public void outboundHeaders() {
    }

    public void streamCreated(sc0 sc0Var, fta ftaVar) {
    }
}
