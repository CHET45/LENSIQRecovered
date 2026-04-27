package p000;

import java.io.File;
import p000.g5f;
import p000.z33;

/* JADX INFO: loaded from: classes5.dex */
public class h5f implements r9b {

    /* JADX INFO: renamed from: a */
    public final g5f f42421a;

    public h5f(g5f g5fVar) {
        this.f42421a = g5fVar;
    }

    @Override // p000.r9b
    public File getAppFile() {
        return this.f42421a.f38830e;
    }

    @Override // p000.r9b
    public z33.AbstractC15960a getApplicationExitInto() {
        g5f.C6138c c6138c = this.f42421a.f38826a;
        if (c6138c != null) {
            return c6138c.f38841b;
        }
        return null;
    }

    @Override // p000.r9b
    public File getBinaryImagesFile() {
        return this.f42421a.f38827b;
    }

    @Override // p000.r9b
    public File getDeviceFile() {
        return this.f42421a.f38831f;
    }

    @Override // p000.r9b
    public File getMetadataFile() {
        return this.f42421a.f38828c;
    }

    @Override // p000.r9b
    public File getMinidumpFile() {
        return this.f42421a.f38826a.f38840a;
    }

    @Override // p000.r9b
    public File getOsFile() {
        return this.f42421a.f38832g;
    }

    @Override // p000.r9b
    public File getSessionFile() {
        return this.f42421a.f38829d;
    }
}
