package p000;

import android.net.Uri;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Pair;
import androidx.media3.common.C1213a;
import androidx.media3.common.DrmInitData;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import p000.ar4;
import p000.gh3;
import p000.ju3;
import p000.nfa;
import p000.nr4;
import p000.una;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class tyb {

    /* JADX INFO: renamed from: f */
    public static final C1213a f86340f = new C1213a.b().setDrmInitData(new DrmInitData(new DrmInitData.SchemeData[0])).build();

    /* JADX INFO: renamed from: a */
    public final ConditionVariable f86341a;

    /* JADX INFO: renamed from: b */
    public final ju3 f86342b;

    /* JADX INFO: renamed from: c */
    public final HandlerThread f86343c;

    /* JADX INFO: renamed from: d */
    public final Handler f86344d;

    /* JADX INFO: renamed from: e */
    public final nr4.C10020a f86345e;

    /* JADX INFO: renamed from: tyb$a */
    public class C13288a implements nr4 {
        public C13288a() {
        }

        @Override // p000.nr4
        public void onDrmKeysLoaded(int i, @hib una.C13612b c13612b) {
            tyb.this.f86341a.open();
        }

        @Override // p000.nr4
        public void onDrmKeysRemoved(int i, @hib una.C13612b c13612b) {
            tyb.this.f86341a.open();
        }

        @Override // p000.nr4
        public void onDrmKeysRestored(int i, @hib una.C13612b c13612b) {
            tyb.this.f86341a.open();
        }

        @Override // p000.nr4
        public void onDrmSessionManagerError(int i, @hib una.C13612b c13612b, Exception exc) {
            tyb.this.f86341a.open();
        }
    }

    public tyb(ju3 ju3Var, nr4.C10020a c10020a) {
        this.f86342b = ju3Var;
        this.f86345e = c10020a;
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:OfflineLicenseHelper");
        this.f86343c = handlerThread;
        handlerThread.start();
        this.f86344d = new Handler(handlerThread.getLooper());
        this.f86341a = new ConditionVariable();
        c10020a.addEventListener(new Handler(handlerThread.getLooper()), new C13288a());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private ar4 acquireFirstSessionOnHandlerThread(final int i, @hib final byte[] bArr, final C1213a c1213a) throws ar4.C1571a {
        v80.checkNotNull(c1213a.f8295s);
        final y6f y6fVarCreate = y6f.create();
        this.f86341a.close();
        this.f86344d.post(new Runnable() { // from class: myb
            @Override // java.lang.Runnable
            public final void run() {
                this.f62792a.lambda$acquireFirstSessionOnHandlerThread$2(i, bArr, y6fVarCreate, c1213a);
            }
        });
        try {
            final ar4 ar4Var = (ar4) y6fVarCreate.get();
            this.f86341a.block();
            final y6f y6fVarCreate2 = y6f.create();
            this.f86344d.post(new Runnable() { // from class: oyb
                @Override // java.lang.Runnable
                public final void run() {
                    this.f69200a.lambda$acquireFirstSessionOnHandlerThread$3(ar4Var, y6fVarCreate2);
                }
            });
            try {
                if (y6fVarCreate2.get() == 0) {
                    return ar4Var;
                }
                throw ((ar4.C1571a) y6fVarCreate2.get());
            } catch (InterruptedException | ExecutionException e) {
                throw new IllegalStateException(e);
            }
        } catch (InterruptedException | ExecutionException e2) {
            throw new IllegalStateException(e2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private byte[] acquireSessionAndGetOfflineLicenseKeySetIdOnHandlerThread(int i, @hib byte[] bArr, C1213a c1213a) throws ar4.C1571a {
        final ar4 ar4VarAcquireFirstSessionOnHandlerThread = acquireFirstSessionOnHandlerThread(i, bArr, c1213a);
        final y6f y6fVarCreate = y6f.create();
        this.f86344d.post(new Runnable() { // from class: syb
            @Override // java.lang.Runnable
            public final void run() {
                this.f83224a.m22930xfae744aa(y6fVarCreate, ar4VarAcquireFirstSessionOnHandlerThread);
            }
        });
        try {
            try {
                return (byte[]) v80.checkNotNull((byte[]) y6fVarCreate.get());
            } catch (InterruptedException | ExecutionException e) {
                throw new IllegalStateException(e);
            }
        } finally {
            releaseManagerOnHandlerThread();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$acquireFirstSessionOnHandlerThread$2(int i, byte[] bArr, y6f y6fVar, C1213a c1213a) {
        try {
            this.f86342b.setPlayer((Looper) v80.checkNotNull(Looper.myLooper()), j0d.f49299d);
            this.f86342b.prepare();
            try {
                this.f86342b.setMode(i, bArr);
                y6fVar.set((ar4) v80.checkNotNull(this.f86342b.acquireSession(this.f86345e, c1213a)));
            } catch (Throwable th) {
                this.f86342b.release();
                throw th;
            }
        } catch (Throwable th2) {
            y6fVar.setException(th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$acquireFirstSessionOnHandlerThread$3(ar4 ar4Var, y6f y6fVar) {
        try {
            ar4.C1571a error = ar4Var.getError();
            if (ar4Var.getState() == 1) {
                ar4Var.release(this.f86345e);
                this.f86342b.release();
            }
            y6fVar.set(error);
        } catch (Throwable th) {
            y6fVar.setException(th);
            ar4Var.release(this.f86345e);
            this.f86342b.release();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lambda$acquireSessionAndGetOfflineLicenseKeySetIdOnHandlerThread$1 */
    public /* synthetic */ void m22930xfae744aa(y6f y6fVar, ar4 ar4Var) {
        try {
            y6fVar.set(ar4Var.getOfflineLicenseKeySetId());
        } finally {
            try {
            } finally {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getLicenseDurationRemainingSec$0(y6f y6fVar, ar4 ar4Var) {
        try {
            y6fVar.set((Pair) v80.checkNotNull(ski.getLicenseDurationRemainingSec(ar4Var)));
        } finally {
            try {
            } finally {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$releaseManagerOnHandlerThread$4(y6f y6fVar) {
        try {
            this.f86342b.release();
            y6fVar.set(null);
        } catch (Throwable th) {
            y6fVar.setException(th);
        }
    }

    public static tyb newWidevineInstance(nfa.C9854f c9854f, gh3.InterfaceC6313a interfaceC6313a, nr4.C10020a c10020a) {
        v80.checkArgument(c9854f.f64363a.equals(jk1.f50928n2));
        return newWidevineInstance(((Uri) v80.checkNotNull(c9854f.f64365c)).toString(), c9854f.f64370h, c9854f.f64367e, interfaceC6313a, null, c10020a);
    }

    private void releaseManagerOnHandlerThread() {
        final y6f y6fVarCreate = y6f.create();
        this.f86344d.post(new Runnable() { // from class: qyb
            @Override // java.lang.Runnable
            public final void run() {
                this.f76309a.lambda$releaseManagerOnHandlerThread$4(y6fVarCreate);
            }
        });
        try {
            y6fVarCreate.get();
        } catch (InterruptedException | ExecutionException e) {
            throw new IllegalStateException(e);
        }
    }

    public synchronized byte[] downloadLicense(C1213a c1213a) throws ar4.C1571a {
        v80.checkArgument(c1213a.f8295s != null);
        return acquireSessionAndGetOfflineLicenseKeySetIdOnHandlerThread(2, null, c1213a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public synchronized Pair<Long, Long> getLicenseDurationRemainingSec(byte[] bArr) throws ar4.C1571a {
        final y6f y6fVarCreate;
        v80.checkNotNull(bArr);
        try {
            final ar4 ar4VarAcquireFirstSessionOnHandlerThread = acquireFirstSessionOnHandlerThread(1, bArr, f86340f);
            y6fVarCreate = y6f.create();
            this.f86344d.post(new Runnable() { // from class: kyb
                @Override // java.lang.Runnable
                public final void run() {
                    this.f55639a.lambda$getLicenseDurationRemainingSec$0(y6fVarCreate, ar4VarAcquireFirstSessionOnHandlerThread);
                }
            });
            try {
                try {
                } catch (InterruptedException | ExecutionException e) {
                    throw new IllegalStateException(e);
                }
            } finally {
                releaseManagerOnHandlerThread();
            }
        } catch (ar4.C1571a e2) {
            if (e2.getCause() instanceof qs8) {
                return Pair.create(0L, 0L);
            }
            throw e2;
        }
        return (Pair) y6fVarCreate.get();
    }

    public void release() {
        this.f86343c.quit();
    }

    public synchronized void releaseLicense(byte[] bArr) throws ar4.C1571a {
        v80.checkNotNull(bArr);
        acquireSessionAndGetOfflineLicenseKeySetIdOnHandlerThread(3, bArr, f86340f);
    }

    public synchronized byte[] renewLicense(byte[] bArr) throws ar4.C1571a {
        v80.checkNotNull(bArr);
        return acquireSessionAndGetOfflineLicenseKeySetIdOnHandlerThread(2, bArr, f86340f);
    }

    public static tyb newWidevineInstance(String str, gh3.InterfaceC6313a interfaceC6313a, nr4.C10020a c10020a) {
        return newWidevineInstance(str, false, interfaceC6313a, c10020a);
    }

    public static tyb newWidevineInstance(String str, boolean z, gh3.InterfaceC6313a interfaceC6313a, nr4.C10020a c10020a) {
        return newWidevineInstance(str, z, interfaceC6313a, null, c10020a);
    }

    public static tyb newWidevineInstance(String str, boolean z, gh3.InterfaceC6313a interfaceC6313a, @hib Map<String, String> map, nr4.C10020a c10020a) {
        return newWidevineInstance(str, z, null, interfaceC6313a, map, c10020a);
    }

    private static tyb newWidevineInstance(String str, boolean z, @hib Map<String, String> map, gh3.InterfaceC6313a interfaceC6313a, @hib Map<String, String> map2, nr4.C10020a c10020a) {
        ho7 ho7Var = new ho7(str, z, interfaceC6313a);
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                ho7Var.setKeyRequestProperty(entry.getKey(), entry.getValue());
            }
        }
        return new tyb(new ju3.C8086b().setKeyRequestParameters(map2).build(ho7Var), c10020a);
    }
}
