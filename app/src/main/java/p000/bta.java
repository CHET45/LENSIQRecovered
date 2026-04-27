package p000;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class bta {

    /* JADX INFO: renamed from: b */
    public static final Charset f14739b = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: c */
    public static final String f14740c = "userId";

    /* JADX INFO: renamed from: a */
    public final kt5 f14741a;

    /* JADX INFO: renamed from: bta$a */
    public class C2050a extends JSONObject {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f14742a;

        public C2050a(String str) throws JSONException {
            this.f14742a = str;
            put("userId", str);
        }
    }

    public bta(kt5 kt5Var) {
        this.f14741a = kt5Var;
    }

    private static Map<String, String> jsonToKeysData(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            map.put(next, valueOrNull(jSONObject, next));
        }
        return map;
    }

    private static List<oae> jsonToRolloutsState(String str) throws JSONException {
        JSONArray jSONArray = new JSONObject(str).getJSONArray(pae.f70165c);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            String string = jSONArray.getString(i);
            try {
                arrayList.add(oae.m18546a(string));
            } catch (Exception e) {
                ej9.getLogger().m10070w("Failed de-serializing rollouts state. " + string, e);
            }
        }
        return arrayList;
    }

    @hib
    private String jsonToUserId(String str) throws JSONException {
        return valueOrNull(new JSONObject(str), "userId");
    }

    private static String keysDataToJson(Map<String, String> map) {
        return new JSONObject(map).toString();
    }

    private static String rolloutsStateToJson(List<oae> list) {
        HashMap map = new HashMap();
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < list.size(); i++) {
            try {
                jSONArray.put(new JSONObject(oae.f67006b.encode(list.get(i))));
            } catch (JSONException e) {
                ej9.getLogger().m10070w("Exception parsing rollout assignment!", e);
            }
        }
        map.put(pae.f70165c, jSONArray);
        return new JSONObject(map).toString();
    }

    private static void safeDeleteCorruptFile(File file) {
        if (file.exists() && file.delete()) {
            ej9.getLogger().m10065i("Deleted corrupt file: " + file.getAbsolutePath());
        }
    }

    private static String userIdToJson(String str) throws JSONException {
        return new C2050a(str).toString();
    }

    private static String valueOrNull(JSONObject jSONObject, String str) {
        if (jSONObject.isNull(str)) {
            return null;
        }
        return jSONObject.optString(str, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.io.Closeable] */
    /* JADX INFO: renamed from: a */
    public Map<String, String> m3402a(String str, boolean z) throws Throwable {
        Throwable th;
        FileInputStream fileInputStream;
        Exception e;
        File internalKeysFileForSession = z ? getInternalKeysFileForSession(str) : getKeysFileForSession(str);
        if (!internalKeysFileForSession.exists() || internalKeysFileForSession.length() == 0) {
            safeDeleteCorruptFile(internalKeysFileForSession, "The file has a length of zero for session: " + str);
            return Collections.emptyMap();
        }
        try {
            try {
                fileInputStream = new FileInputStream(internalKeysFileForSession);
            } catch (Exception e2) {
                fileInputStream = null;
                e = e2;
            } catch (Throwable th2) {
                ?? r1 = 0;
                th = th2;
                lc2.closeOrLog(r1, "Failed to close user metadata file.");
                throw th;
            }
            try {
                Map<String, String> mapJsonToKeysData = jsonToKeysData(lc2.streamToString(fileInputStream));
                lc2.closeOrLog(fileInputStream, "Failed to close user metadata file.");
                return mapJsonToKeysData;
            } catch (Exception e3) {
                e = e3;
                ej9.getLogger().m10070w("Error deserializing user metadata.", e);
                safeDeleteCorruptFile(internalKeysFileForSession);
                lc2.closeOrLog(fileInputStream, "Failed to close user metadata file.");
                return Collections.emptyMap();
            }
        } catch (Throwable th3) {
            th = th3;
            lc2.closeOrLog(r1, "Failed to close user metadata file.");
            throw th;
        }
    }

    @efb
    public File getInternalKeysFileForSession(String str) {
        return this.f14741a.getSessionFile(str, gzh.f41894j);
    }

    @efb
    public File getKeysFileForSession(String str) {
        return this.f14741a.getSessionFile(str, "keys");
    }

    @efb
    public File getRolloutsStateForSession(String str) {
        return this.f14741a.getSessionFile(str, gzh.f41895k);
    }

    @efb
    public File getUserDataFileForSession(String str) {
        return this.f14741a.getSessionFile(str, gzh.f41892h);
    }

    public Map<String, String> readKeyData(String str) {
        return m3402a(str, false);
    }

    public List<oae> readRolloutsState(String str) throws Throwable {
        File rolloutsStateForSession = getRolloutsStateForSession(str);
        if (!rolloutsStateForSession.exists() || rolloutsStateForSession.length() == 0) {
            safeDeleteCorruptFile(rolloutsStateForSession, "The file has a length of zero for session: " + str);
            return Collections.emptyList();
        }
        FileInputStream fileInputStream = null;
        try {
            try {
                FileInputStream fileInputStream2 = new FileInputStream(rolloutsStateForSession);
                try {
                    List<oae> listJsonToRolloutsState = jsonToRolloutsState(lc2.streamToString(fileInputStream2));
                    ej9.getLogger().m10061d("Loaded rollouts state:\n" + listJsonToRolloutsState + "\nfor session " + str);
                    lc2.closeOrLog(fileInputStream2, "Failed to close rollouts state file.");
                    return listJsonToRolloutsState;
                } catch (Exception e) {
                    e = e;
                    fileInputStream = fileInputStream2;
                    ej9.getLogger().m10070w("Error deserializing rollouts state.", e);
                    safeDeleteCorruptFile(rolloutsStateForSession);
                    lc2.closeOrLog(fileInputStream, "Failed to close rollouts state file.");
                    return Collections.emptyList();
                } catch (Throwable th) {
                    th = th;
                    fileInputStream = fileInputStream2;
                    lc2.closeOrLog(fileInputStream, "Failed to close rollouts state file.");
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    @hib
    public String readUserId(String str) throws Throwable {
        FileInputStream fileInputStream;
        File userDataFileForSession = getUserDataFileForSession(str);
        FileInputStream fileInputStream2 = null;
        if (!userDataFileForSession.exists() || userDataFileForSession.length() == 0) {
            ej9.getLogger().m10061d("No userId set for session " + str);
            safeDeleteCorruptFile(userDataFileForSession);
            return null;
        }
        try {
            fileInputStream = new FileInputStream(userDataFileForSession);
        } catch (Exception e) {
            e = e;
            fileInputStream = null;
        } catch (Throwable th) {
            th = th;
            lc2.closeOrLog(fileInputStream2, "Failed to close user metadata file.");
            throw th;
        }
        try {
            try {
                String strJsonToUserId = jsonToUserId(lc2.streamToString(fileInputStream));
                ej9.getLogger().m10061d("Loaded userId " + strJsonToUserId + " for session " + str);
                lc2.closeOrLog(fileInputStream, "Failed to close user metadata file.");
                return strJsonToUserId;
            } catch (Throwable th2) {
                th = th2;
                fileInputStream2 = fileInputStream;
                lc2.closeOrLog(fileInputStream2, "Failed to close user metadata file.");
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            ej9.getLogger().m10070w("Error deserializing user metadata.", e);
            safeDeleteCorruptFile(userDataFileForSession);
            lc2.closeOrLog(fileInputStream, "Failed to close user metadata file.");
            return null;
        }
    }

    public void writeKeyData(String str, Map<String, String> map) throws Throwable {
        writeKeyData(str, map, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    public void writeRolloutState(String str, List<oae> list) throws Throwable {
        Throwable th;
        BufferedWriter bufferedWriter;
        Exception e;
        String strRolloutsStateToJson;
        File rolloutsStateForSession = getRolloutsStateForSession(str);
        ?? IsEmpty = list.isEmpty();
        if (IsEmpty != 0) {
            safeDeleteCorruptFile(rolloutsStateForSession, "Rollout state is empty for session: " + str);
            return;
        }
        try {
            try {
                strRolloutsStateToJson = rolloutsStateToJson(list);
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(rolloutsStateForSession), f14739b));
            } catch (Exception e2) {
                bufferedWriter = null;
                e = e2;
            } catch (Throwable th2) {
                IsEmpty = 0;
                th = th2;
                lc2.closeOrLog(IsEmpty, "Failed to close rollouts state file.");
                throw th;
            }
            try {
                bufferedWriter.write(strRolloutsStateToJson);
                bufferedWriter.flush();
                IsEmpty = bufferedWriter;
            } catch (Exception e3) {
                e = e3;
                ej9.getLogger().m10070w("Error serializing rollouts state.", e);
                safeDeleteCorruptFile(rolloutsStateForSession);
                IsEmpty = bufferedWriter;
            }
            lc2.closeOrLog(IsEmpty, "Failed to close rollouts state file.");
        } catch (Throwable th3) {
            th = th3;
            lc2.closeOrLog(IsEmpty, "Failed to close rollouts state file.");
            throw th;
        }
    }

    public void writeUserData(String str, String str2) throws Throwable {
        File userDataFileForSession = getUserDataFileForSession(str);
        BufferedWriter bufferedWriter = null;
        try {
            try {
                String strUserIdToJson = userIdToJson(str2);
                BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(userDataFileForSession), f14739b));
                try {
                    bufferedWriter2.write(strUserIdToJson);
                    bufferedWriter2.flush();
                    lc2.closeOrLog(bufferedWriter2, "Failed to close user metadata file.");
                } catch (Exception e) {
                    e = e;
                    bufferedWriter = bufferedWriter2;
                    ej9.getLogger().m10070w("Error serializing user metadata.", e);
                    lc2.closeOrLog(bufferedWriter, "Failed to close user metadata file.");
                } catch (Throwable th) {
                    th = th;
                    bufferedWriter = bufferedWriter2;
                    lc2.closeOrLog(bufferedWriter, "Failed to close user metadata file.");
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    public void writeKeyData(String str, Map<String, String> map, boolean z) throws Throwable {
        File internalKeysFileForSession = z ? getInternalKeysFileForSession(str) : getKeysFileForSession(str);
        BufferedWriter bufferedWriter = null;
        try {
            try {
                String strKeysDataToJson = keysDataToJson(map);
                BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(internalKeysFileForSession), f14739b));
                try {
                    bufferedWriter2.write(strKeysDataToJson);
                    bufferedWriter2.flush();
                    lc2.closeOrLog(bufferedWriter2, "Failed to close key/value metadata file.");
                } catch (Exception e) {
                    e = e;
                    bufferedWriter = bufferedWriter2;
                    ej9.getLogger().m10070w("Error serializing key/value metadata.", e);
                    safeDeleteCorruptFile(internalKeysFileForSession);
                    lc2.closeOrLog(bufferedWriter, "Failed to close key/value metadata file.");
                } catch (Throwable th) {
                    th = th;
                    bufferedWriter = bufferedWriter2;
                    lc2.closeOrLog(bufferedWriter, "Failed to close key/value metadata file.");
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static void safeDeleteCorruptFile(File file, String str) {
        if (file.exists() && file.delete()) {
            ej9.getLogger().m10065i(String.format("Deleted corrupt file: %s\nReason: %s", file.getAbsolutePath(), str));
        }
    }
}
