package p000;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class hqc {

    /* JADX INFO: renamed from: c */
    public static final String f44578c = "PersistedInstallation";

    /* JADX INFO: renamed from: d */
    public static final String f44579d = "Fid";

    /* JADX INFO: renamed from: e */
    public static final String f44580e = "AuthToken";

    /* JADX INFO: renamed from: f */
    public static final String f44581f = "RefreshToken";

    /* JADX INFO: renamed from: g */
    public static final String f44582g = "TokenCreationEpochInSecs";

    /* JADX INFO: renamed from: h */
    public static final String f44583h = "ExpiresInSecs";

    /* JADX INFO: renamed from: i */
    public static final String f44584i = "Status";

    /* JADX INFO: renamed from: j */
    public static final String f44585j = "FisError";

    /* JADX INFO: renamed from: a */
    public File f44586a;

    /* JADX INFO: renamed from: b */
    @efb
    public final lw5 f44587b;

    /* JADX INFO: renamed from: hqc$a */
    public enum EnumC6973a {
        ATTEMPT_MIGRATION,
        NOT_GENERATED,
        UNREGISTERED,
        REGISTERED,
        REGISTER_ERROR
    }

    public hqc(@efb lw5 lw5Var) {
        this.f44587b = lw5Var;
    }

    private File getDataFile() {
        if (this.f44586a == null) {
            synchronized (this) {
                try {
                    if (this.f44586a == null) {
                        this.f44586a = new File(this.f44587b.getApplicationContext().getFilesDir(), "PersistedInstallation." + this.f44587b.getPersistenceKey() + ".json");
                    }
                } finally {
                }
            }
        }
        return this.f44586a;
    }

    private JSONObject readJSONFromFile() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(getDataFile());
            while (true) {
                try {
                    int i = fileInputStream.read(bArr, 0, 16384);
                    if (i < 0) {
                        JSONObject jSONObject = new JSONObject(byteArrayOutputStream.toString());
                        fileInputStream.close();
                        return jSONObject;
                    }
                    byteArrayOutputStream.write(bArr, 0, i);
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        } catch (IOException | JSONException unused) {
            return new JSONObject();
        }
    }

    public void clearForTesting() {
        getDataFile().delete();
    }

    @efb
    public iqc insertOrUpdatePersistedInstallationEntry(@efb iqc iqcVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(f44579d, iqcVar.getFirebaseInstallationId());
            jSONObject.put(f44584i, iqcVar.getRegistrationStatus().ordinal());
            jSONObject.put(f44580e, iqcVar.getAuthToken());
            jSONObject.put(f44581f, iqcVar.getRefreshToken());
            jSONObject.put(f44582g, iqcVar.getTokenCreationEpochInSecs());
            jSONObject.put(f44583h, iqcVar.getExpiresInSecs());
            jSONObject.put(f44585j, iqcVar.getFisError());
            File fileCreateTempFile = File.createTempFile(f44578c, "tmp", this.f44587b.getApplicationContext().getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (!fileCreateTempFile.renameTo(getDataFile())) {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
        return iqcVar;
    }

    @efb
    public iqc readPersistedInstallationEntryValue() {
        JSONObject jSONFromFile = readJSONFromFile();
        String strOptString = jSONFromFile.optString(f44579d, null);
        int iOptInt = jSONFromFile.optInt(f44584i, EnumC6973a.ATTEMPT_MIGRATION.ordinal());
        String strOptString2 = jSONFromFile.optString(f44580e, null);
        String strOptString3 = jSONFromFile.optString(f44581f, null);
        long jOptLong = jSONFromFile.optLong(f44582g, 0L);
        long jOptLong2 = jSONFromFile.optLong(f44583h, 0L);
        return iqc.builder().setFirebaseInstallationId(strOptString).setRegistrationStatus(EnumC6973a.values()[iOptInt]).setAuthToken(strOptString2).setRefreshToken(strOptString3).setTokenCreationEpochInSecs(jOptLong).setExpiresInSecs(jOptLong2).setFisError(jSONFromFile.optString(f44585j, null)).build();
    }
}
