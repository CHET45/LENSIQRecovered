package p000;

import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public class q33 {

    /* JADX INFO: renamed from: a */
    public final String f73086a;

    /* JADX INFO: renamed from: b */
    public final kt5 f73087b;

    public q33(String str, kt5 kt5Var) {
        this.f73086a = str;
        this.f73087b = kt5Var;
    }

    private File getMarkerFile() {
        return this.f73087b.getCommonFile(this.f73086a);
    }

    public boolean create() {
        try {
            return getMarkerFile().createNewFile();
        } catch (IOException e) {
            ej9.getLogger().m10064e("Error creating marker: " + this.f73086a, e);
            return false;
        }
    }

    public boolean isPresent() {
        return getMarkerFile().exists();
    }

    public boolean remove() {
        return getMarkerFile().delete();
    }
}
