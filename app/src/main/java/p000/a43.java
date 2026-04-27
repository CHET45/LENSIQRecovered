package p000;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import p000.z33;

/* JADX INFO: loaded from: classes5.dex */
public class a43 {

    /* JADX INFO: renamed from: g */
    public static final Map<String, Integer> f342g;

    /* JADX INFO: renamed from: h */
    public static final String f343h;

    /* JADX INFO: renamed from: i */
    public static final int f344i = 3;

    /* JADX INFO: renamed from: j */
    public static final int f345j = 4;

    /* JADX INFO: renamed from: k */
    public static final int f346k = 3;

    /* JADX INFO: renamed from: l */
    public static final String f347l = "0";

    /* JADX INFO: renamed from: a */
    public final Context f348a;

    /* JADX INFO: renamed from: b */
    public final jr7 f349b;

    /* JADX INFO: renamed from: c */
    public final d30 f350c;

    /* JADX INFO: renamed from: d */
    public final m0g f351d;

    /* JADX INFO: renamed from: e */
    public final q7f f352e;

    /* JADX INFO: renamed from: f */
    public final bdd f353f = bdd.f13443a;

    static {
        HashMap map = new HashMap();
        f342g = map;
        map.put("armeabi", 5);
        map.put("armeabi-v7a", 6);
        map.put("arm64-v8a", 9);
        map.put("x86", 0);
        map.put("x86_64", 1);
        f343h = String.format(Locale.US, c33.f15644z, "20.0.3");
    }

    public a43(Context context, jr7 jr7Var, d30 d30Var, m0g m0gVar, q7f q7fVar) {
        this.f348a = context;
        this.f349b = jr7Var;
        this.f350c = d30Var;
        this.f351d = m0gVar;
        this.f352e = q7fVar;
    }

    private z33.AbstractC15960a addBuildIdInfo(z33.AbstractC15960a abstractC15960a) {
        List<z33.AbstractC15960a.a> listUnmodifiableList;
        if (!this.f352e.getSettingsSync().f576b.f585c || this.f350c.f28303c.size() <= 0) {
            listUnmodifiableList = null;
        } else {
            ArrayList arrayList = new ArrayList();
            for (pf1 pf1Var : this.f350c.f28303c) {
                arrayList.add(z33.AbstractC15960a.a.builder().setLibraryName(pf1Var.getLibraryName()).setArch(pf1Var.getArch()).setBuildId(pf1Var.getBuildId()).build());
            }
            listUnmodifiableList = Collections.unmodifiableList(arrayList);
        }
        return z33.AbstractC15960a.builder().setImportance(abstractC15960a.getImportance()).setProcessName(abstractC15960a.getProcessName()).setReasonCode(abstractC15960a.getReasonCode()).setTimestamp(abstractC15960a.getTimestamp()).setPid(abstractC15960a.getPid()).setPss(abstractC15960a.getPss()).setRss(abstractC15960a.getRss()).setTraceFile(abstractC15960a.getTraceFile()).setBuildIdMappingForArch(listUnmodifiableList).build();
    }

    private z33.AbstractC15962c buildReportData() {
        return z33.builder().setSdkVersion("20.0.3").setGmpAppId(this.f350c.f28301a).setInstallationUuid(this.f349b.getInstallIds().getCrashlyticsInstallId()).setFirebaseInstallationId(this.f349b.getInstallIds().getFirebaseInstallationId()).setFirebaseAuthenticationToken(this.f349b.getInstallIds().getFirebaseAuthenticationToken()).setBuildVersion(this.f350c.f28306f).setDisplayVersion(this.f350c.f28307g).setPlatform(4);
    }

    private static long ensureNonNegative(long j) {
        if (j > 0) {
            return j;
        }
        return 0L;
    }

    private static int getDeviceArchitecture() {
        Integer num;
        String str = Build.CPU_ABI;
        if (TextUtils.isEmpty(str) || (num = f342g.get(str.toLowerCase(Locale.US))) == null) {
            return 7;
        }
        return num.intValue();
    }

    private z33.AbstractC15965f.d.a.b.AbstractC16569a populateBinaryImageData() {
        return z33.AbstractC15965f.d.a.b.AbstractC16569a.builder().setBaseAddress(0L).setSize(0L).setName(this.f350c.f28305e).setUuid(this.f350c.f28302b).build();
    }

    private List<z33.AbstractC15965f.d.a.b.AbstractC16569a> populateBinaryImagesList() {
        return Collections.singletonList(populateBinaryImageData());
    }

    private z33.AbstractC15965f.d.a populateEventApplicationData(int i, zih zihVar, Thread thread, int i2, int i3, boolean z) {
        Boolean boolValueOf;
        z33.AbstractC15965f.d.a.c currentProcessDetails = this.f353f.getCurrentProcessDetails(this.f348a);
        if (currentProcessDetails.getImportance() > 0) {
            boolValueOf = Boolean.valueOf(currentProcessDetails.getImportance() != 100);
        } else {
            boolValueOf = null;
        }
        return z33.AbstractC15965f.d.a.builder().setBackground(boolValueOf).setCurrentProcessDetails(currentProcessDetails).setAppProcessDetails(this.f353f.getAppProcessDetails(this.f348a)).setUiOrientation(i).setExecution(populateExecutionData(zihVar, thread, i2, i3, z)).build();
    }

    private z33.AbstractC15965f.d.c populateEventDeviceData(int i) {
        fx0 fx0Var = fx0.get(this.f348a);
        Float batteryLevel = fx0Var.getBatteryLevel();
        Double dValueOf = batteryLevel != null ? Double.valueOf(batteryLevel.doubleValue()) : null;
        int batteryVelocity = fx0Var.getBatteryVelocity();
        boolean proximitySensorEnabled = lc2.getProximitySensorEnabled(this.f348a);
        return z33.AbstractC15965f.d.c.builder().setBatteryLevel(dValueOf).setBatteryVelocity(batteryVelocity).setProximityOn(proximitySensorEnabled).setOrientation(i).setRamUsed(ensureNonNegative(lc2.calculateTotalRamInBytes(this.f348a) - lc2.calculateFreeRamInBytes(this.f348a))).setDiskUsed(lc2.calculateUsedDiskSpaceInBytes(Environment.getDataDirectory().getPath())).build();
    }

    private z33.AbstractC15965f.d.a.b.c populateExceptionData(zih zihVar, int i, int i2) {
        return populateExceptionData(zihVar, i, i2, 0);
    }

    private z33.AbstractC15965f.d.a.b populateExecutionData(zih zihVar, Thread thread, int i, int i2, boolean z) {
        return z33.AbstractC15965f.d.a.b.builder().setThreads(populateThreadsList(zihVar, thread, i, z)).setException(populateExceptionData(zihVar, i, i2)).setSignal(populateSignalData()).setBinaries(populateBinaryImagesList()).build();
    }

    private z33.AbstractC15965f.d.a.b.e.AbstractC16576b populateFrameData(StackTraceElement stackTraceElement, z33.AbstractC15965f.d.a.b.e.AbstractC16576b.AbstractC16577a abstractC16577a) {
        long lineNumber = 0;
        long jMax = stackTraceElement.isNativeMethod() ? Math.max(stackTraceElement.getLineNumber(), 0L) : 0L;
        String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
        String fileName = stackTraceElement.getFileName();
        if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
            lineNumber = stackTraceElement.getLineNumber();
        }
        return abstractC16577a.setPc(jMax).setSymbol(str).setFile(fileName).setOffset(lineNumber).build();
    }

    private List<z33.AbstractC15965f.d.a.b.e.AbstractC16576b> populateFramesList(StackTraceElement[] stackTraceElementArr, int i) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            arrayList.add(populateFrameData(stackTraceElement, z33.AbstractC15965f.d.a.b.e.AbstractC16576b.builder().setImportance(i)));
        }
        return Collections.unmodifiableList(arrayList);
    }

    private z33.AbstractC15965f.a populateSessionApplicationData() {
        return z33.AbstractC15965f.a.builder().setIdentifier(this.f349b.getAppIdentifier()).setVersion(this.f350c.f28306f).setDisplayVersion(this.f350c.f28307g).setInstallationUuid(this.f349b.getInstallIds().getCrashlyticsInstallId()).setDevelopmentPlatform(this.f350c.f28308h.getDevelopmentPlatform()).setDevelopmentPlatformVersion(this.f350c.f28308h.getDevelopmentPlatformVersion()).build();
    }

    private z33.AbstractC15965f populateSessionData(String str, long j) {
        return z33.AbstractC15965f.builder().setStartedAt(j).setIdentifier(str).setGenerator(f343h).setApp(populateSessionApplicationData()).setOs(populateSessionOperatingSystemData()).setDevice(populateSessionDeviceData()).setGeneratorType(3).build();
    }

    private z33.AbstractC15965f.c populateSessionDeviceData() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        int deviceArchitecture = getDeviceArchitecture();
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        long jCalculateTotalRamInBytes = lc2.calculateTotalRamInBytes(this.f348a);
        long blockCount = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        boolean zIsEmulator = lc2.isEmulator();
        int deviceState = lc2.getDeviceState();
        String str = Build.MANUFACTURER;
        return z33.AbstractC15965f.c.builder().setArch(deviceArchitecture).setModel(Build.MODEL).setCores(iAvailableProcessors).setRam(jCalculateTotalRamInBytes).setDiskSpace(blockCount).setSimulator(zIsEmulator).setState(deviceState).setManufacturer(str).setModelClass(Build.PRODUCT).build();
    }

    private z33.AbstractC15965f.e populateSessionOperatingSystemData() {
        return z33.AbstractC15965f.e.builder().setPlatform(3).setVersion(Build.VERSION.RELEASE).setBuildVersion(Build.VERSION.CODENAME).setJailbroken(lc2.isRooted()).build();
    }

    private z33.AbstractC15965f.d.a.b.AbstractC16573d populateSignalData() {
        return z33.AbstractC15965f.d.a.b.AbstractC16573d.builder().setName(f347l).setCode(f347l).setAddress(0L).build();
    }

    private z33.AbstractC15965f.d.a.b.e populateThreadData(Thread thread, StackTraceElement[] stackTraceElementArr) {
        return populateThreadData(thread, stackTraceElementArr, 0);
    }

    private List<z33.AbstractC15965f.d.a.b.e> populateThreadsList(zih zihVar, Thread thread, int i, boolean z) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(populateThreadData(thread, zihVar.f105204c, i));
        if (z) {
            for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
                Thread key = entry.getKey();
                if (!key.equals(thread)) {
                    arrayList.add(populateThreadData(key, this.f351d.getTrimmedStackTrace(entry.getValue())));
                }
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    private z33.AbstractC15965f.d.a.c processDetailsFromApplicationExitInfo(z33.AbstractC15960a abstractC15960a) {
        return this.f353f.buildProcessDetails(abstractC15960a.getProcessName(), abstractC15960a.getPid(), abstractC15960a.getImportance());
    }

    public z33.AbstractC15965f.d captureAnrEventData(z33.AbstractC15960a abstractC15960a) {
        int i = this.f348a.getResources().getConfiguration().orientation;
        return z33.AbstractC15965f.d.builder().setType("anr").setTimestamp(abstractC15960a.getTimestamp()).setApp(populateEventApplicationData(i, addBuildIdInfo(abstractC15960a))).setDevice(populateEventDeviceData(i)).build();
    }

    public z33.AbstractC15965f.d captureEventData(Throwable th, Thread thread, String str, long j, int i, int i2, boolean z) {
        int i3 = this.f348a.getResources().getConfiguration().orientation;
        return z33.AbstractC15965f.d.builder().setType(str).setTimestamp(j).setApp(populateEventApplicationData(i3, zih.makeTrimmedThrowableData(th, this.f351d), thread, i, i2, z)).setDevice(populateEventDeviceData(i3)).build();
    }

    public z33 captureReportData(String str, long j) {
        return buildReportData().setSession(populateSessionData(str, j)).build();
    }

    private z33.AbstractC15965f.d.a.b.c populateExceptionData(zih zihVar, int i, int i2, int i3) {
        String str = zihVar.f105203b;
        String str2 = zihVar.f105202a;
        StackTraceElement[] stackTraceElementArr = zihVar.f105204c;
        int i4 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        zih zihVar2 = zihVar.f105205d;
        if (i3 >= i2) {
            zih zihVar3 = zihVar2;
            while (zihVar3 != null) {
                zihVar3 = zihVar3.f105205d;
                i4++;
            }
        }
        z33.AbstractC15965f.d.a.b.c.AbstractC16572a overflowCount = z33.AbstractC15965f.d.a.b.c.builder().setType(str).setReason(str2).setFrames(populateFramesList(stackTraceElementArr, i)).setOverflowCount(i4);
        if (zihVar2 != null && i4 == 0) {
            overflowCount.setCausedBy(populateExceptionData(zihVar2, i, i2, i3 + 1));
        }
        return overflowCount.build();
    }

    private z33.AbstractC15965f.d.a.b.e populateThreadData(Thread thread, StackTraceElement[] stackTraceElementArr, int i) {
        return z33.AbstractC15965f.d.a.b.e.builder().setName(thread.getName()).setImportance(i).setFrames(populateFramesList(stackTraceElementArr, i)).build();
    }

    private z33.AbstractC15965f.d.a.b populateExecutionData(z33.AbstractC15960a abstractC15960a) {
        return z33.AbstractC15965f.d.a.b.builder().setAppExitInfo(abstractC15960a).setSignal(populateSignalData()).setBinaries(populateBinaryImagesList()).build();
    }

    private z33.AbstractC15965f.d.a populateEventApplicationData(int i, z33.AbstractC15960a abstractC15960a) {
        return z33.AbstractC15965f.d.a.builder().setBackground(Boolean.valueOf(abstractC15960a.getImportance() != 100)).setCurrentProcessDetails(processDetailsFromApplicationExitInfo(abstractC15960a)).setUiOrientation(i).setExecution(populateExecutionData(abstractC15960a)).build();
    }
}
