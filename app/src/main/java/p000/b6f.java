package p000;

import android.app.ApplicationExitInfo;
import android.content.Context;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.concurrent.Executor;
import p000.z33;

/* JADX INFO: loaded from: classes5.dex */
public class b6f {

    /* JADX INFO: renamed from: h */
    public static final String f12804h = "crash";

    /* JADX INFO: renamed from: i */
    public static final String f12805i = "error";

    /* JADX INFO: renamed from: j */
    public static final int f12806j = 4;

    /* JADX INFO: renamed from: k */
    public static final int f12807k = 8;

    /* JADX INFO: renamed from: l */
    public static final int f12808l = 8192;

    /* JADX INFO: renamed from: a */
    public final a43 f12809a;

    /* JADX INFO: renamed from: b */
    public final p43 f12810b;

    /* JADX INFO: renamed from: c */
    public final ji3 f12811c;

    /* JADX INFO: renamed from: d */
    public final gi9 f12812d;

    /* JADX INFO: renamed from: e */
    public final gzh f12813e;

    /* JADX INFO: renamed from: f */
    public final jr7 f12814f;

    /* JADX INFO: renamed from: g */
    public final g53 f12815g;

    public b6f(a43 a43Var, p43 p43Var, ji3 ji3Var, gi9 gi9Var, gzh gzhVar, jr7 jr7Var, g53 g53Var) {
        this.f12809a = a43Var;
        this.f12810b = p43Var;
        this.f12811c = ji3Var;
        this.f12812d = gi9Var;
        this.f12813e = gzhVar;
        this.f12814f = jr7Var;
        this.f12815g = g53Var;
    }

    private z33.AbstractC15965f.d addLogsAndCustomKeysToEvent(z33.AbstractC15965f.d dVar, gi9 gi9Var, gzh gzhVar) {
        return addLogsCustomKeysAndEventKeysToEvent(dVar, gi9Var, gzhVar, Collections.emptyMap());
    }

    private z33.AbstractC15965f.d addLogsCustomKeysAndEventKeysToEvent(z33.AbstractC15965f.d dVar, gi9 gi9Var, gzh gzhVar, Map<String, String> map) {
        z33.AbstractC15965f.d.b builder = dVar.toBuilder();
        String logString = gi9Var.getLogString();
        if (logString != null) {
            builder.setLog(z33.AbstractC15965f.d.AbstractC16579d.builder().setContent(logString).build());
        } else {
            ej9.getLogger().m10067v("No log data to include with this event.");
        }
        List<z33.AbstractC15963d> sortedCustomAttributes = getSortedCustomAttributes(gzhVar.getCustomKeys(map));
        List<z33.AbstractC15963d> sortedCustomAttributes2 = getSortedCustomAttributes(gzhVar.getInternalKeys());
        if (!sortedCustomAttributes.isEmpty() || !sortedCustomAttributes2.isEmpty()) {
            builder.setApp(dVar.getApp().toBuilder().setCustomAttributes(sortedCustomAttributes).setInternalKeys(sortedCustomAttributes2).build());
        }
        return builder.build();
    }

    private z33.AbstractC15965f.d addMetaDataToEvent(z33.AbstractC15965f.d dVar, Map<String, String> map) {
        return addRolloutsStateToEvent(addLogsCustomKeysAndEventKeysToEvent(dVar, this.f12812d, this.f12813e, map), this.f12813e);
    }

    private z33.AbstractC15965f.d addRolloutsStateToEvent(z33.AbstractC15965f.d dVar, gzh gzhVar) {
        List<z33.AbstractC15965f.d.e> rolloutsState = gzhVar.getRolloutsState();
        if (rolloutsState.isEmpty()) {
            return dVar;
        }
        z33.AbstractC15965f.d.b builder = dVar.toBuilder();
        builder.setRollouts(z33.AbstractC15965f.d.f.builder().setRolloutAssignments(rolloutsState).build());
        return builder.build();
    }

    @c5e(api = 30)
    private static z33.AbstractC15960a convertApplicationExitInfo(ApplicationExitInfo applicationExitInfo) {
        String strConvertInputStreamToString = null;
        try {
            InputStream traceInputStream = applicationExitInfo.getTraceInputStream();
            if (traceInputStream != null) {
                strConvertInputStreamToString = convertInputStreamToString(traceInputStream);
            }
        } catch (IOException e) {
            ej9.getLogger().m10069w("Could not get input trace in application exit info: " + applicationExitInfo.toString() + " Error: " + e);
        }
        return z33.AbstractC15960a.builder().setImportance(applicationExitInfo.getImportance()).setProcessName(applicationExitInfo.getProcessName()).setReasonCode(applicationExitInfo.getReason()).setTimestamp(applicationExitInfo.getTimestamp()).setPid(applicationExitInfo.getPid()).setPss(applicationExitInfo.getPss()).setRss(applicationExitInfo.getRss()).setTraceFile(strConvertInputStreamToString).build();
    }

    @c5e(api = 19)
    @fdi
    public static String convertInputStreamToString(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream;
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
        } catch (Throwable th) {
            try {
                bufferedInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
        try {
            byte[] bArr = new byte[8192];
            while (true) {
                int i = bufferedInputStream.read(bArr);
                if (i == -1) {
                    String string = byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
                    byteArrayOutputStream.close();
                    bufferedInputStream.close();
                    return string;
                }
                byteArrayOutputStream.write(bArr, 0, i);
                bufferedInputStream.close();
                throw th;
            }
        } finally {
        }
    }

    public static b6f create(Context context, jr7 jr7Var, kt5 kt5Var, d30 d30Var, gi9 gi9Var, gzh gzhVar, m0g m0gVar, q7f q7fVar, n2c n2cVar, z23 z23Var, g53 g53Var) {
        return new b6f(new a43(context, jr7Var, d30Var, m0gVar, q7fVar), new p43(kt5Var, q7fVar, z23Var), ji3.create(context, q7fVar, n2cVar), gi9Var, gzhVar, jr7Var, g53Var);
    }

    private q43 ensureHasFid(q43 q43Var) {
        if (q43Var.getReport().getFirebaseInstallationId() != null && q43Var.getReport().getFirebaseAuthenticationToken() != null) {
            return q43Var;
        }
        my5 my5VarFetchTrueFid = this.f12814f.fetchTrueFid(true);
        return q43.create(q43Var.getReport().withFirebaseInstallationId(my5VarFetchTrueFid.getFid()).withFirebaseAuthenticationToken(my5VarFetchTrueFid.getAuthToken()), q43Var.getSessionId(), q43Var.getReportFile());
    }

    @c5e(api = 30)
    @hib
    private ApplicationExitInfo findRelevantApplicationExitInfo(String str, List<ApplicationExitInfo> list) {
        long startTimestampMillis = this.f12810b.getStartTimestampMillis(str);
        Iterator<ApplicationExitInfo> it = list.iterator();
        while (it.hasNext()) {
            ApplicationExitInfo applicationExitInfoM26946a = zp6.m26946a(it.next());
            if (applicationExitInfoM26946a.getTimestamp() < startTimestampMillis) {
                return null;
            }
            if (applicationExitInfoM26946a.getReason() == 6) {
                return applicationExitInfoM26946a;
            }
        }
        return null;
    }

    @efb
    private static List<z33.AbstractC15963d> getSortedCustomAttributes(@efb Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayList.add(z33.AbstractC15963d.builder().setKey(entry.getKey()).setValue(entry.getValue()).build());
        }
        Collections.sort(arrayList, new Comparator() { // from class: a6f
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return b6f.lambda$getSortedCustomAttributes$1((z33.AbstractC15963d) obj, (z33.AbstractC15963d) obj2);
            }
        });
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$getSortedCustomAttributes$1(z33.AbstractC15963d abstractC15963d, z33.AbstractC15963d abstractC15963d2) {
        return abstractC15963d.getKey().compareTo(abstractC15963d2.getKey());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$persistEvent$0(z33.AbstractC15965f.d dVar, p65 p65Var, boolean z) {
        ej9.getLogger().m10061d("disk worker: log non-fatal event to persistence");
        this.f12810b.persistEvent(dVar, p65Var.getSessionId(), z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean onReportSendComplete(@efb Task<q43> task) {
        if (!task.isSuccessful()) {
            ej9.getLogger().m10070w("Crashlytics report could not be enqueued to DataTransport", task.getException());
            return false;
        }
        q43 result = task.getResult();
        ej9.getLogger().m10061d("Crashlytics report successfully enqueued to DataTransport: " + result.getSessionId());
        File reportFile = result.getReportFile();
        if (reportFile.delete()) {
            ej9.getLogger().m10061d("Deleted report file: " + reportFile.getPath());
            return true;
        }
        ej9.getLogger().m10069w("Crashlytics could not delete report file: " + reportFile.getPath());
        return true;
    }

    private void persistEvent(@efb Throwable th, @efb Thread thread, @efb String str, @efb final p65 p65Var, boolean z) {
        final boolean zEquals = str.equals("crash");
        final z33.AbstractC15965f.d dVarAddMetaDataToEvent = addMetaDataToEvent(this.f12809a.captureEventData(th, thread, str, p65Var.getTimestamp(), 4, 8, z), p65Var.getAdditionalCustomKeys());
        if (z) {
            this.f12810b.persistEvent(dVarAddMetaDataToEvent, p65Var.getSessionId(), zEquals);
        } else {
            this.f12815g.f38790b.submit(new Runnable() { // from class: z5f
                @Override // java.lang.Runnable
                public final void run() {
                    this.f104251a.lambda$persistEvent$0(dVarAddMetaDataToEvent, p65Var, zEquals);
                }
            });
        }
    }

    public void finalizeSessionWithNativeEvent(@efb String str, @efb List<p9b> list, z33.AbstractC15960a abstractC15960a) {
        ej9.getLogger().m10061d("SessionReportingCoordinator#finalizeSessionWithNativeEvent");
        ArrayList arrayList = new ArrayList();
        Iterator<p9b> it = list.iterator();
        while (it.hasNext()) {
            z33.AbstractC15964e.b bVarAsFilePayload = it.next().asFilePayload();
            if (bVarAsFilePayload != null) {
                arrayList.add(bVarAsFilePayload);
            }
        }
        this.f12810b.finalizeSessionWithNativeEvent(str, z33.AbstractC15964e.builder().setFiles(Collections.unmodifiableList(arrayList)).build(), abstractC15960a);
    }

    public void finalizeSessions(long j, @hib String str) {
        this.f12810b.finalizeReports(str, j);
    }

    public boolean hasReportsToSend() {
        return this.f12810b.hasFinalizedReports();
    }

    public SortedSet<String> listSortedOpenSessionIds() {
        return this.f12810b.getOpenSessionIds();
    }

    public void onBeginSession(@efb String str, long j) {
        this.f12810b.persistReport(this.f12809a.captureReportData(str, j));
    }

    public void persistFatalEvent(@efb Throwable th, @efb Thread thread, @efb String str, long j) {
        ej9.getLogger().m10067v("Persisting fatal event for session " + str);
        persistEvent(th, thread, "crash", new p65(str, j), true);
    }

    public void persistNonFatalEvent(@efb Throwable th, @efb Thread thread, @efb p65 p65Var) {
        ej9.getLogger().m10067v("Persisting non-fatal event for session " + p65Var.getSessionId());
        persistEvent(th, thread, "error", p65Var, false);
    }

    @c5e(api = 30)
    public void persistRelevantAppExitInfoEvent(String str, List<ApplicationExitInfo> list, gi9 gi9Var, gzh gzhVar) {
        ApplicationExitInfo applicationExitInfoFindRelevantApplicationExitInfo = findRelevantApplicationExitInfo(str, list);
        if (applicationExitInfoFindRelevantApplicationExitInfo == null) {
            ej9.getLogger().m10067v("No relevant ApplicationExitInfo occurred during session: " + str);
            return;
        }
        z33.AbstractC15965f.d dVarCaptureAnrEventData = this.f12809a.captureAnrEventData(convertApplicationExitInfo(applicationExitInfoFindRelevantApplicationExitInfo));
        ej9.getLogger().m10061d("Persisting anr for session " + str);
        this.f12810b.persistEvent(addRolloutsStateToEvent(addLogsAndCustomKeysToEvent(dVarCaptureAnrEventData, gi9Var, gzhVar), gzhVar), str, true);
    }

    public void removeAllReports() {
        this.f12810b.deleteAllReports();
    }

    public Task<Void> sendReports(@efb Executor executor) {
        return sendReports(executor, null);
    }

    public Task<Void> sendReports(@efb Executor executor, @hib String str) {
        List<q43> listLoadFinalizedReports = this.f12810b.loadFinalizedReports();
        ArrayList arrayList = new ArrayList();
        for (q43 q43Var : listLoadFinalizedReports) {
            if (str == null || str.equals(q43Var.getSessionId())) {
                arrayList.add(this.f12811c.enqueueReport(ensureHasFid(q43Var), str != null).continueWith(executor, new Continuation() { // from class: y5f
                    @Override // com.google.android.gms.tasks.Continuation
                    public final Object then(Task task) {
                        return Boolean.valueOf(this.f100439a.onReportSendComplete(task));
                    }
                }));
            }
        }
        return Tasks.whenAll(arrayList);
    }
}
