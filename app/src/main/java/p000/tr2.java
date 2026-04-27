package p000;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.support.customtabs.trusted.ITrustedWebActivityService;
import androidx.browser.trusted.C0563a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p000.lo1;

/* JADX INFO: loaded from: classes.dex */
public class tr2 implements ServiceConnection {

    /* JADX INFO: renamed from: C */
    public static final int f85646C = 1;

    /* JADX INFO: renamed from: F */
    public static final int f85647F = 2;

    /* JADX INFO: renamed from: H */
    public static final int f85648H = 3;

    /* JADX INFO: renamed from: m */
    public static final int f85649m = 0;

    /* JADX INFO: renamed from: a */
    @efb
    public final Runnable f85650a;

    /* JADX INFO: renamed from: b */
    @efb
    public final C13172a f85651b;

    /* JADX INFO: renamed from: c */
    public int f85652c;

    /* JADX INFO: renamed from: d */
    @hib
    public C0563a f85653d;

    /* JADX INFO: renamed from: e */
    @efb
    public List<lo1.C8911a<C0563a>> f85654e;

    /* JADX INFO: renamed from: f */
    @hib
    public Exception f85655f;

    /* JADX INFO: renamed from: tr2$a */
    public static class C13172a {
        @efb
        /* JADX INFO: renamed from: a */
        public C0563a m22755a(ComponentName componentName, IBinder iBinder) {
            return new C0563a(ITrustedWebActivityService.Stub.asInterface(iBinder), componentName);
        }
    }

    @ir9
    public tr2(@efb Runnable runnable) {
        this(runnable, new C13172a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$getServiceWrapper$0(lo1.C8911a c8911a) throws Exception {
        int i = this.f85652c;
        if (i == 0) {
            this.f85654e.add(c8911a);
        } else {
            if (i != 1) {
                if (i == 2) {
                    throw new IllegalStateException("Service has been disconnected.");
                }
                if (i != 3) {
                    throw new IllegalStateException("Connection state is invalid");
                }
                throw this.f85655f;
            }
            C0563a c0563a = this.f85653d;
            if (c0563a == null) {
                throw new IllegalStateException("ConnectionHolder state is incorrect.");
            }
            c8911a.set(c0563a);
        }
        return "ConnectionHolder, state = " + this.f85652c;
    }

    @ir9
    public void cancel(@efb Exception exc) {
        Iterator<lo1.C8911a<C0563a>> it = this.f85654e.iterator();
        while (it.hasNext()) {
            it.next().setException(exc);
        }
        this.f85654e.clear();
        this.f85650a.run();
        this.f85652c = 3;
        this.f85655f = exc;
    }

    @efb
    @ir9
    public ja9<C0563a> getServiceWrapper() {
        return lo1.getFuture(new lo1.InterfaceC8913c() { // from class: sr2
            @Override // p000.lo1.InterfaceC8913c
            public final Object attachCompleter(lo1.C8911a c8911a) {
                return this.f82681a.lambda$getServiceWrapper$0(c8911a);
            }
        });
    }

    @Override // android.content.ServiceConnection
    @ir9
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f85653d = this.f85651b.m22755a(componentName, iBinder);
        Iterator<lo1.C8911a<C0563a>> it = this.f85654e.iterator();
        while (it.hasNext()) {
            it.next().set(this.f85653d);
        }
        this.f85654e.clear();
        this.f85652c = 1;
    }

    @Override // android.content.ServiceConnection
    @ir9
    public void onServiceDisconnected(ComponentName componentName) {
        this.f85653d = null;
        this.f85650a.run();
        this.f85652c = 2;
    }

    @ir9
    public tr2(@efb Runnable runnable, @efb C13172a c13172a) {
        this.f85652c = 0;
        this.f85654e = new ArrayList();
        this.f85650a = runnable;
        this.f85651b = c13172a;
    }
}
