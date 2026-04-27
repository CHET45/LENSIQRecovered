package p000;

import java.util.HashMap;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class fxd {

    /* JADX INFO: renamed from: b */
    public static final fxd f37986b = new fxd();

    /* JADX INFO: renamed from: a */
    public HashMap<String, gxd> f37987a = new HashMap<>();

    public static fxd getInstance() {
        return f37986b;
    }

    public String currentContent(String str) {
        gxd gxdVar = this.f37987a.get(str);
        if (gxdVar != null) {
            return gxdVar.currentMotionScene();
        }
        return null;
    }

    public String currentLayoutInformation(String str) {
        gxd gxdVar = this.f37987a.get(str);
        if (gxdVar != null) {
            return gxdVar.currentLayoutInformation();
        }
        return null;
    }

    public long getLastModified(String str) {
        gxd gxdVar = this.f37987a.get(str);
        if (gxdVar != null) {
            return gxdVar.getLastModified();
        }
        return Long.MAX_VALUE;
    }

    public Set<String> getLayoutList() {
        return this.f37987a.keySet();
    }

    public void register(String str, gxd gxdVar) {
        this.f37987a.put(str, gxdVar);
    }

    public void setDrawDebug(String str, int i) {
        gxd gxdVar = this.f37987a.get(str);
        if (gxdVar != null) {
            gxdVar.setDrawDebug(i);
        }
    }

    public void setLayoutInformationMode(String str, int i) {
        gxd gxdVar = this.f37987a.get(str);
        if (gxdVar != null) {
            gxdVar.setLayoutInformationMode(i);
        }
    }

    public void unregister(String str, gxd gxdVar) {
        this.f37987a.remove(str);
    }

    public void updateContent(String str, String str2) {
        gxd gxdVar = this.f37987a.get(str);
        if (gxdVar != null) {
            gxdVar.onNewMotionScene(str2);
        }
    }

    public void updateDimensions(String str, int i, int i2) {
        gxd gxdVar = this.f37987a.get(str);
        if (gxdVar != null) {
            gxdVar.onDimensions(i, i2);
        }
    }

    public void updateProgress(String str, float f) {
        gxd gxdVar = this.f37987a.get(str);
        if (gxdVar != null) {
            gxdVar.onProgress(f);
        }
    }
}
