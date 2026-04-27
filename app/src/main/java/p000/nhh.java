package p000;

import android.content.Context;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Callable;
import p000.a65;
import p000.p7e;

/* JADX INFO: loaded from: classes4.dex */
@qpf
public class nhh implements ihh {

    /* JADX INFO: renamed from: e */
    public static volatile ohh f64560e;

    /* JADX INFO: renamed from: a */
    public final g52 f64561a;

    /* JADX INFO: renamed from: b */
    public final g52 f64562b;

    /* JADX INFO: renamed from: c */
    public final soe f64563c;

    /* JADX INFO: renamed from: d */
    public final nxh f64564d;

    @a28
    public nhh(@ehi g52 g52Var, @pya g52 g52Var2, soe soeVar, nxh nxhVar, wpi wpiVar) {
        this.f64561a = g52Var;
        this.f64562b = g52Var2;
        this.f64563c = soeVar;
        this.f64564d = nxhVar;
        wpiVar.ensureContextsScheduled();
    }

    @fdi
    @p7e({p7e.EnumC10826a.f69938e})
    /* JADX INFO: renamed from: a */
    public static void m17960a(ohh ohhVar, Callable<Void> callable) throws Throwable {
        ohh ohhVar2;
        synchronized (nhh.class) {
            ohhVar2 = f64560e;
            f64560e = ohhVar;
        }
        try {
            callable.call();
            synchronized (nhh.class) {
                f64560e = ohhVar2;
            }
        } catch (Throwable th) {
            synchronized (nhh.class) {
                f64560e = ohhVar2;
                throw th;
            }
        }
    }

    private a65 convert(oye oyeVar) {
        a65.AbstractC0073a code = a65.builder().setEventMillis(this.f64561a.getTime()).setUptimeMillis(this.f64562b.getTime()).setTransportName(oyeVar.getTransportName()).setEncodedPayload(new k15(oyeVar.getEncoding(), oyeVar.getPayload())).setCode(oyeVar.mo19099a().getCode());
        if (oyeVar.mo19099a().getProductData() != null && oyeVar.mo19099a().getProductData().getProductId() != null) {
            code.setProductId(oyeVar.mo19099a().getProductData().getProductId());
        }
        if (oyeVar.mo19099a().getEventContext() != null) {
            u55 eventContext = oyeVar.mo19099a().getEventContext();
            if (eventContext.getPseudonymousId() != null) {
                code.setPseudonymousId(eventContext.getPseudonymousId());
            }
            if (eventContext.getExperimentIdsClear() != null) {
                code.setExperimentIdsClear(eventContext.getExperimentIdsClear());
            }
            if (eventContext.getExperimentIdsEncrypted() != null) {
                code.setExperimentIdsEncrypted(eventContext.getExperimentIdsEncrypted());
            }
        }
        return code.build();
    }

    public static nhh getInstance() {
        ohh ohhVar = f64560e;
        if (ohhVar != null) {
            return ohhVar.mo18710b();
        }
        throw new IllegalStateException("Not initialized!");
    }

    private static Set<q15> getSupportedEncodings(w74 w74Var) {
        return w74Var instanceof i15 ? Collections.unmodifiableSet(((i15) w74Var).getSupportedEncodings()) : Collections.singleton(q15.m19986of("proto"));
    }

    public static void initialize(Context context) {
        if (f64560e == null) {
            synchronized (nhh.class) {
                try {
                    if (f64560e == null) {
                        f64560e = ve3.builder().setApplicationContext(context).build();
                    }
                } finally {
                }
            }
        }
    }

    @p7e({p7e.EnumC10826a.f69935b})
    public nxh getUploader() {
        return this.f64564d;
    }

    @Deprecated
    public dhh newFactory(String str) {
        return new ehh(getSupportedEncodings(null), chh.builder().setBackendName(str).build(), this);
    }

    @Override // p000.ihh
    public void send(oye oyeVar, qhh qhhVar) {
        this.f64563c.schedule(oyeVar.getTransportContext().withPriority(oyeVar.mo19099a().getPriority()), convert(oyeVar), qhhVar);
    }

    public dhh newFactory(w74 w74Var) {
        return new ehh(getSupportedEncodings(w74Var), chh.builder().setBackendName(w74Var.getName()).setExtras(w74Var.getExtras()).build(), this);
    }
}
