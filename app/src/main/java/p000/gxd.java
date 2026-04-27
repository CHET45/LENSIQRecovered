package p000;

/* JADX INFO: loaded from: classes.dex */
public interface gxd {
    String currentLayoutInformation();

    String currentMotionScene();

    long getLastModified();

    void onDimensions(int i, int i2);

    void onNewMotionScene(String str);

    void onProgress(float f);

    void setDrawDebug(int i);

    void setLayoutInformationMode(int i);
}
