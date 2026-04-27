package p000;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class an1 {

    /* JADX INFO: renamed from: b */
    public static final String f2140b = "com.crashlytics.settings.json";

    /* JADX INFO: renamed from: a */
    public final File f2141a;

    public an1(kt5 kt5Var) {
        this.f2141a = kt5Var.getCommonFile(f2140b);
    }

    private File getSettingsFile() {
        return this.f2141a;
    }

    public JSONObject readCachedSettings() throws Throwable {
        Throwable th;
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        ej9.getLogger().m10061d("Checking for cached settings...");
        FileInputStream fileInputStream2 = null;
        try {
            try {
                File settingsFile = getSettingsFile();
                if (settingsFile.exists()) {
                    fileInputStream = new FileInputStream(settingsFile);
                    try {
                        jSONObject = new JSONObject(lc2.streamToString(fileInputStream));
                        fileInputStream2 = fileInputStream;
                    } catch (Exception e) {
                        e = e;
                        ej9.getLogger().m10064e("Failed to fetch cached settings", e);
                        lc2.closeOrLog(fileInputStream, "Error while closing settings cache file.");
                        return null;
                    }
                } else {
                    ej9.getLogger().m10067v("Settings file does not exist.");
                    jSONObject = null;
                }
                lc2.closeOrLog(fileInputStream2, "Error while closing settings cache file.");
                return jSONObject;
            } catch (Exception e2) {
                e = e2;
                fileInputStream = null;
            } catch (Throwable th2) {
                th = th2;
                lc2.closeOrLog(null, "Error while closing settings cache file.");
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            lc2.closeOrLog(null, "Error while closing settings cache file.");
            throw th;
        }
    }

    public void writeCachedSettings(long j, JSONObject jSONObject) throws Throwable {
        ej9.getLogger().m10067v("Writing settings to cache file...");
        if (jSONObject == null) {
            return;
        }
        FileWriter fileWriter = null;
        try {
            try {
                jSONObject.put(i7f.f45936a, j);
                FileWriter fileWriter2 = new FileWriter(getSettingsFile());
                try {
                    fileWriter2.write(jSONObject.toString());
                    fileWriter2.flush();
                    lc2.closeOrLog(fileWriter2, "Failed to close settings writer.");
                } catch (Exception e) {
                    e = e;
                    fileWriter = fileWriter2;
                    ej9.getLogger().m10064e("Failed to cache settings", e);
                    lc2.closeOrLog(fileWriter, "Failed to close settings writer.");
                } catch (Throwable th) {
                    th = th;
                    fileWriter = fileWriter2;
                    lc2.closeOrLog(fileWriter, "Failed to close settings writer.");
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
