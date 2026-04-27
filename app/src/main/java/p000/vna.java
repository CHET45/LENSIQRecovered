package p000;

import android.os.Handler;
import com.google.android.exoplayer2.drm.InterfaceC3005e;
import java.io.IOException;
import p000.k62;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface vna {

    /* JADX INFO: renamed from: vna$a */
    public interface InterfaceC14174a {

        /* JADX INFO: renamed from: a */
        public static final InterfaceC14174a f91785a = moa.f61634b;

        vna createMediaSource(aga agaVar);

        int[] getSupportedTypes();

        default InterfaceC14174a setCmcdConfigurationFactory(k62.InterfaceC8208b interfaceC8208b) {
            return this;
        }

        InterfaceC14174a setDrmSessionManagerProvider(rr4 rr4Var);

        InterfaceC14174a setLoadErrorHandlingPolicy(ic9 ic9Var);
    }

    /* JADX INFO: renamed from: vna$b */
    public static final class C14175b extends pja {
        public C14175b(Object obj) {
            super(obj);
        }

        public C14175b(Object obj, long j) {
            super(obj, j);
        }

        @Override // p000.pja
        public C14175b copyWithPeriodUid(Object obj) {
            return new C14175b(super.copyWithPeriodUid(obj));
        }

        @Override // p000.pja
        public C14175b copyWithWindowSequenceNumber(long j) {
            return new C14175b(super.copyWithWindowSequenceNumber(j));
        }

        public C14175b(Object obj, long j, int i) {
            super(obj, j, i);
        }

        public C14175b(Object obj, int i, int i2, long j) {
            super(obj, i, i2, j);
        }

        public C14175b(pja pjaVar) {
            super(pjaVar);
        }
    }

    /* JADX INFO: renamed from: vna$c */
    public interface InterfaceC14176c {
        void onSourceInfoRefreshed(vna vnaVar, t1h t1hVar);
    }

    void addDrmEventListener(Handler handler, InterfaceC3005e interfaceC3005e);

    void addEventListener(Handler handler, koa koaVar);

    nja createPeriod(C14175b c14175b, InterfaceC6430gn interfaceC6430gn, long j);

    void disable(InterfaceC14176c interfaceC14176c);

    void enable(InterfaceC14176c interfaceC14176c);

    @hib
    default t1h getInitialTimeline() {
        return null;
    }

    aga getMediaItem();

    default boolean isSingleWindow() {
        return true;
    }

    void maybeThrowSourceInfoRefreshError() throws IOException;

    @Deprecated
    default void prepareSource(InterfaceC14176c interfaceC14176c, @hib pdh pdhVar) {
        prepareSource(interfaceC14176c, pdhVar, k0d.f52345b);
    }

    void prepareSource(InterfaceC14176c interfaceC14176c, @hib pdh pdhVar, k0d k0dVar);

    void releasePeriod(nja njaVar);

    void releaseSource(InterfaceC14176c interfaceC14176c);

    void removeDrmEventListener(InterfaceC3005e interfaceC3005e);

    void removeEventListener(koa koaVar);
}
