package p000;

import androidx.media3.common.C1213a;
import p000.u31;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public interface vs7 extends kl3<rl3, pv7, ws7> {

    /* JADX INFO: renamed from: vs7$a */
    public interface InterfaceC14247a {

        /* JADX INFO: renamed from: a */
        @Deprecated
        public static final InterfaceC14247a f92143a = new u31.C13346c();

        vs7 createImageDecoder();

        int supportsFormat(C1213a c1213a);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p000.kl3
    @hib
    pv7 dequeueOutputBuffer() throws ws7;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p000.kl3
    void queueInputBuffer(rl3 rl3Var) throws ws7;
}
