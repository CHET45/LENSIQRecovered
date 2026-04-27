package p000;

import java.io.File;
import java.util.concurrent.atomic.AtomicReference;
import p000.z24;
import p000.z33;

/* JADX INFO: loaded from: classes5.dex */
public final class u33 implements r33 {

    /* JADX INFO: renamed from: c */
    public static final r9b f86708c = new C13348b();

    /* JADX INFO: renamed from: a */
    public final z24<r33> f86709a;

    /* JADX INFO: renamed from: b */
    public final AtomicReference<r33> f86710b = new AtomicReference<>(null);

    /* JADX INFO: renamed from: u33$b */
    public static final class C13348b implements r9b {
        private C13348b() {
        }

        @Override // p000.r9b
        public File getAppFile() {
            return null;
        }

        @Override // p000.r9b
        public z33.AbstractC15960a getApplicationExitInto() {
            return null;
        }

        @Override // p000.r9b
        public File getBinaryImagesFile() {
            return null;
        }

        @Override // p000.r9b
        public File getDeviceFile() {
            return null;
        }

        @Override // p000.r9b
        public File getMetadataFile() {
            return null;
        }

        @Override // p000.r9b
        public File getMinidumpFile() {
            return null;
        }

        @Override // p000.r9b
        public File getOsFile() {
            return null;
        }

        @Override // p000.r9b
        public File getSessionFile() {
            return null;
        }
    }

    public u33(z24<r33> z24Var) {
        this.f86709a = z24Var;
        z24Var.whenAvailable(new z24.InterfaceC15937a() { // from class: s33
            @Override // p000.z24.InterfaceC15937a
            public final void handle(eid eidVar) {
                this.f80490a.lambda$new$0(eidVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(eid eidVar) {
        ej9.getLogger().m10061d("Crashlytics native component now available.");
        this.f86710b.set((r33) eidVar.get());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$prepareNativeSession$1(String str, String str2, long j, z3g z3gVar, eid eidVar) {
        ((r33) eidVar.get()).prepareNativeSession(str, str2, j, z3gVar);
    }

    @Override // p000.r33
    @efb
    public r9b getSessionFileProvider(@efb String str) {
        r33 r33Var = this.f86710b.get();
        return r33Var == null ? f86708c : r33Var.getSessionFileProvider(str);
    }

    @Override // p000.r33
    public boolean hasCrashDataForCurrentSession() {
        r33 r33Var = this.f86710b.get();
        return r33Var != null && r33Var.hasCrashDataForCurrentSession();
    }

    @Override // p000.r33
    public boolean hasCrashDataForSession(@efb String str) {
        r33 r33Var = this.f86710b.get();
        return r33Var != null && r33Var.hasCrashDataForSession(str);
    }

    @Override // p000.r33
    public void prepareNativeSession(@efb final String str, @efb final String str2, final long j, @efb final z3g z3gVar) {
        ej9.getLogger().m10067v("Deferring native open session: " + str);
        this.f86709a.whenAvailable(new z24.InterfaceC15937a() { // from class: t33
            @Override // p000.z24.InterfaceC15937a
            public final void handle(eid eidVar) {
                u33.lambda$prepareNativeSession$1(str, str2, j, z3gVar, eidVar);
            }
        });
    }
}
