package p000;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Iterator;
import java.util.List;
import java.util.zip.GZIPOutputStream;
import p000.g5f;
import p000.z33;
import p000.z3g;

/* JADX INFO: loaded from: classes5.dex */
public class h53 {

    /* JADX INFO: renamed from: d */
    public static final Charset f42391d = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: e */
    public static final String f42392e = "start-time";

    /* JADX INFO: renamed from: f */
    public static final String f42393f = "session.json";

    /* JADX INFO: renamed from: g */
    public static final String f42394g = "app.json";

    /* JADX INFO: renamed from: h */
    public static final String f42395h = "device.json";

    /* JADX INFO: renamed from: i */
    public static final String f42396i = "os.json";

    /* JADX INFO: renamed from: a */
    public final Context f42397a;

    /* JADX INFO: renamed from: b */
    public final k9b f42398b;

    /* JADX INFO: renamed from: c */
    public final kt5 f42399c;

    public h53(Context context, k9b k9bVar, kt5 kt5Var) {
        this.f42397a = context;
        this.f42398b = k9bVar;
        this.f42399c = kt5Var;
    }

    @c5e(api = 31)
    private static z33.AbstractC15960a convertApplicationExitInfoToModel(ApplicationExitInfo applicationExitInfo) {
        return z33.AbstractC15960a.builder().setImportance(applicationExitInfo.getImportance()).setProcessName(applicationExitInfo.getProcessName()).setReasonCode(applicationExitInfo.getReason()).setTimestamp(applicationExitInfo.getTimestamp()).setPid(applicationExitInfo.getPid()).setPss(applicationExitInfo.getPss()).setRss(applicationExitInfo.getRss()).setTraceFile(getTraceFileFromApplicationExitInfo(applicationExitInfo)).build();
    }

    @c5e(api = 31)
    @fdi
    public static String convertInputStreamToString(InputStream inputStream) throws IOException {
        if (inputStream == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int i = inputStream.read(bArr);
            if (i == -1) {
                return zipAndEncode(byteArrayOutputStream.toByteArray());
            }
            byteArrayOutputStream.write(bArr, 0, i);
        }
    }

    private z33.AbstractC15960a getApplicationExitInfo(String str) {
        if (Build.VERSION.SDK_INT >= 31) {
            return getNativeCrashApplicationExitInfo(str);
        }
        return null;
    }

    private g5f.C6138c getNativeCore(String str, File file) {
        return new g5f.C6138c(getSingleFileWithExtension(file, ".dmp"), getApplicationExitInfo(str));
    }

    @c5e(api = 31)
    private z33.AbstractC15960a getNativeCrashApplicationExitInfo(String str) {
        List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) this.f42397a.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
        File sessionFile = this.f42399c.getSessionFile(str, "start-time");
        return getRelevantApplicationExitInfo(sessionFile == null ? System.currentTimeMillis() : sessionFile.lastModified(), historicalProcessExitReasons);
    }

    @c5e(api = 31)
    private z33.AbstractC15960a getRelevantApplicationExitInfo(long j, List<ApplicationExitInfo> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<ApplicationExitInfo> it = list.iterator();
        while (it.hasNext()) {
            ApplicationExitInfo applicationExitInfoM26946a = zp6.m26946a(it.next());
            if (applicationExitInfoM26946a.getReason() == 5 && applicationExitInfoM26946a.getTimestamp() >= j) {
                arrayList.add(applicationExitInfoM26946a);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return convertApplicationExitInfoToModel(zp6.m26946a(arrayList.get(0)));
    }

    @hib
    private static File getSingleFileWithExtension(File file, String str) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return null;
        }
        for (File file2 : fileArrListFiles) {
            if (file2.getName().endsWith(str)) {
                return file2;
            }
        }
        return null;
    }

    @c5e(api = 31)
    private static String getTraceFileFromApplicationExitInfo(ApplicationExitInfo applicationExitInfo) {
        try {
            return convertInputStreamToString(applicationExitInfo.getTraceInputStream());
        } catch (IOException unused) {
            ej9.getLogger().m10069w("Failed to get input stream from ApplicationExitInfo");
            return null;
        }
    }

    private static void writeSessionJsonFile(kt5 kt5Var, String str, String str2, String str3) throws Throwable {
        writeTextFile(new File(kt5Var.getNativeSessionDir(str), str3), str2);
    }

    private static void writeTextFile(File file, String str) throws Throwable {
        BufferedWriter bufferedWriter = null;
        try {
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), f42391d));
            try {
                bufferedWriter2.write(str);
                lc2.closeOrLog(bufferedWriter2, "Failed to close " + file);
            } catch (IOException unused) {
                bufferedWriter = bufferedWriter2;
                lc2.closeOrLog(bufferedWriter, "Failed to close " + file);
            } catch (Throwable th) {
                th = th;
                bufferedWriter = bufferedWriter2;
                lc2.closeOrLog(bufferedWriter, "Failed to close " + file);
                throw th;
            }
        } catch (IOException unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @c5e(api = 31)
    private static String zipAndEncode(byte[] bArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            try {
                gZIPOutputStream.write(bArr);
                gZIPOutputStream.finish();
                String strEncodeToString = Base64.getEncoder().encodeToString(byteArrayOutputStream.toByteArray());
                gZIPOutputStream.close();
                byteArrayOutputStream.close();
                return strEncodeToString;
            } finally {
            }
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @efb
    public g5f getFilesForSession(String str) {
        File nativeSessionDir = this.f42399c.getNativeSessionDir(str);
        File file = new File(nativeSessionDir, "pending");
        ej9.getLogger().m10067v("Minidump directory: " + file.getAbsolutePath());
        File singleFileWithExtension = getSingleFileWithExtension(file, ".dmp");
        ej9 logger = ej9.getLogger();
        StringBuilder sb = new StringBuilder();
        sb.append("Minidump file ");
        sb.append((singleFileWithExtension == null || !singleFileWithExtension.exists()) ? "does not exist" : "exists");
        logger.m10067v(sb.toString());
        g5f.C6137b c6137b = new g5f.C6137b();
        if (nativeSessionDir != null && nativeSessionDir.exists() && file.exists()) {
            c6137b.m11407m(getNativeCore(str, file)).m11406l(getSingleFileWithExtension(nativeSessionDir, ".device_info")).m11409o(new File(nativeSessionDir, f42393f)).m11402h(new File(nativeSessionDir, f42394g)).m11405k(new File(nativeSessionDir, f42395h)).m11408n(new File(nativeSessionDir, f42396i));
        }
        return c6137b.m11404j();
    }

    public boolean hasCrashDataForSession(String str) {
        g5f.C6138c c6138c = getFilesForSession(str).f38826a;
        return c6138c != null && c6138c.m11410a();
    }

    public boolean initialize(String str, String str2, long j, z3g z3gVar) throws Throwable {
        File nativeSessionDir = this.f42399c.getNativeSessionDir(str);
        if (nativeSessionDir == null) {
            return false;
        }
        try {
            if (!this.f42398b.initialize(nativeSessionDir.getCanonicalPath(), this.f42397a.getAssets())) {
                return false;
            }
            writeBeginSession(str, str2, j);
            writeSessionApp(str, z3gVar.appData());
            writeSessionOs(str, z3gVar.osData());
            writeSessionDevice(str, z3gVar.deviceData());
            return true;
        } catch (IOException e) {
            ej9.getLogger().m10064e("Error initializing Crashlytics NDK", e);
            return false;
        }
    }

    public void writeBeginSession(String str, String str2, long j) throws Throwable {
        writeSessionJsonFile(this.f42399c, str, o5f.m18358a(str, str2, j), f42393f);
    }

    public void writeSessionApp(String str, z3g.AbstractC15979a abstractC15979a) throws Throwable {
        writeSessionJsonFile(this.f42399c, str, o5f.m18359b(abstractC15979a.appIdentifier(), abstractC15979a.versionCode(), abstractC15979a.versionName(), abstractC15979a.installUuid(), abstractC15979a.deliveryMechanism(), abstractC15979a.developmentPlatformProvider().getDevelopmentPlatform(), abstractC15979a.developmentPlatformProvider().getDevelopmentPlatformVersion()), f42394g);
    }

    public void writeSessionDevice(String str, z3g.AbstractC15980b abstractC15980b) throws Throwable {
        writeSessionJsonFile(this.f42399c, str, o5f.m18360c(abstractC15980b.arch(), abstractC15980b.model(), abstractC15980b.availableProcessors(), abstractC15980b.totalRam(), abstractC15980b.diskSpace(), abstractC15980b.isEmulator(), abstractC15980b.state(), abstractC15980b.manufacturer(), abstractC15980b.modelClass()), f42395h);
    }

    public void writeSessionOs(String str, z3g.AbstractC15981c abstractC15981c) throws Throwable {
        writeSessionJsonFile(this.f42399c, str, o5f.m18361d(abstractC15981c.osRelease(), abstractC15981c.osCodeName(), abstractC15981c.isRooted()), f42396i);
    }
}
