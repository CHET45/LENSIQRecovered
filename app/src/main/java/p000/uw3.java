package p000;

import android.content.Context;
import android.os.Build;
import android.os.HandlerThread;
import java.io.IOException;
import p000.dda;
import p000.mig;
import p000.va0;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class uw3 implements dda.InterfaceC4752b {

    /* JADX INFO: renamed from: g */
    public static final int f89255g = 0;

    /* JADX INFO: renamed from: h */
    public static final int f89256h = 1;

    /* JADX INFO: renamed from: i */
    public static final int f89257i = 2;

    /* JADX INFO: renamed from: j */
    public static final String f89258j = "DMCodecAdapterFactory";

    /* JADX INFO: renamed from: b */
    @hib
    public final Context f89259b;

    /* JADX INFO: renamed from: c */
    @hib
    public final lfg<HandlerThread> f89260c;

    /* JADX INFO: renamed from: d */
    @hib
    public final lfg<HandlerThread> f89261d;

    /* JADX INFO: renamed from: e */
    public int f89262e;

    /* JADX INFO: renamed from: f */
    public boolean f89263f;

    @Deprecated
    public uw3() {
        this.f89262e = 0;
        this.f89263f = false;
        this.f89259b = null;
        this.f89260c = null;
        this.f89261d = null;
    }

    private boolean shouldUseAsynchronousAdapterInDefaultMode() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            return true;
        }
        Context context = this.f89259b;
        return context != null && i >= 28 && context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen");
    }

    @Override // p000.dda.InterfaceC4752b
    public dda createAdapter(dda.C4751a c4751a) throws IOException {
        lfg<HandlerThread> lfgVar;
        int i = this.f89262e;
        if (i != 1 && (i != 0 || !shouldUseAsynchronousAdapterInDefaultMode())) {
            return new mig.C9362b().createAdapter(c4751a);
        }
        int trackType = rva.getTrackType(c4751a.f29422c.f8291o);
        xh9.m25146i("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + t0i.getTrackTypeString(trackType));
        lfg<HandlerThread> lfgVar2 = this.f89260c;
        va0.C13960b c13960b = (lfgVar2 == null || (lfgVar = this.f89261d) == null) ? new va0.C13960b(trackType) : new va0.C13960b(lfgVar2, lfgVar);
        c13960b.experimentalSetAsyncCryptoFlagEnabled(this.f89263f);
        return c13960b.createAdapter(c4751a);
    }

    @op1
    public uw3 experimentalSetAsyncCryptoFlagEnabled(boolean z) {
        this.f89263f = z;
        return this;
    }

    @op1
    public uw3 forceDisableAsynchronous() {
        this.f89262e = 2;
        return this;
    }

    @op1
    public uw3 forceEnableAsynchronous() {
        this.f89262e = 1;
        return this;
    }

    public uw3(Context context) {
        this(context, null, null);
    }

    public uw3(Context context, @hib lfg<HandlerThread> lfgVar, @hib lfg<HandlerThread> lfgVar2) {
        this.f89259b = context;
        this.f89262e = 0;
        this.f89263f = false;
        this.f89260c = lfgVar;
        this.f89261d = lfgVar2;
    }
}
