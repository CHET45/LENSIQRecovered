package p000;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;
import p000.z33;

/* JADX INFO: loaded from: classes5.dex */
public class p43 {

    /* JADX INFO: renamed from: f */
    public static final int f69610f = 8;

    /* JADX INFO: renamed from: g */
    public static final String f69611g = "report";

    /* JADX INFO: renamed from: h */
    public static final String f69612h = "start-time";

    /* JADX INFO: renamed from: i */
    public static final String f69613i = "event";

    /* JADX INFO: renamed from: j */
    public static final int f69614j = 10;

    /* JADX INFO: renamed from: k */
    public static final String f69615k = "%010d";

    /* JADX INFO: renamed from: m */
    public static final String f69617m = "_";

    /* JADX INFO: renamed from: n */
    public static final String f69618n = "";

    /* JADX INFO: renamed from: a */
    public final AtomicInteger f69622a = new AtomicInteger(0);

    /* JADX INFO: renamed from: b */
    public final kt5 f69623b;

    /* JADX INFO: renamed from: c */
    public final q7f f69624c;

    /* JADX INFO: renamed from: d */
    public final z23 f69625d;

    /* JADX INFO: renamed from: e */
    public static final Charset f69609e = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: l */
    public static final int f69616l = 15;

    /* JADX INFO: renamed from: o */
    public static final k43 f69619o = new k43();

    /* JADX INFO: renamed from: p */
    public static final Comparator<? super File> f69620p = new Comparator() { // from class: l43
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return p43.lambda$static$0((File) obj, (File) obj2);
        }
    };

    /* JADX INFO: renamed from: q */
    public static final FilenameFilter f69621q = new FilenameFilter() { // from class: m43
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            return p43.lambda$static$1(file, str);
        }
    };

    public p43(kt5 kt5Var, q7f q7fVar, z23 z23Var) {
        this.f69623b = kt5Var;
        this.f69624c = q7fVar;
        this.f69625d = z23Var;
    }

    private SortedSet<String> capAndGetOpenSessions(@hib String str) {
        this.f69623b.cleanupPreviousFileSystems();
        SortedSet<String> openSessionIds = getOpenSessionIds();
        if (str != null) {
            openSessionIds.remove(str);
        }
        if (openSessionIds.size() <= 8) {
            return openSessionIds;
        }
        while (openSessionIds.size() > 8) {
            String strLast = openSessionIds.last();
            ej9.getLogger().m10061d("Removing session over cap: " + strLast);
            this.f69623b.deleteSessionFiles(strLast);
            openSessionIds.remove(strLast);
        }
        return openSessionIds;
    }

    private static int capFilesCount(List<File> list, int i) {
        int size = list.size();
        for (File file : list) {
            if (size <= i) {
                return size;
            }
            kt5.m14989b(file);
            size--;
        }
        return size;
    }

    private void capFinalizedReports() {
        int i = this.f69624c.getSettingsSync().f575a.f587b;
        List<File> allFinalizedReportFiles = getAllFinalizedReportFiles();
        int size = allFinalizedReportFiles.size();
        if (size <= i) {
            return;
        }
        Iterator<File> it = allFinalizedReportFiles.subList(i, size).iterator();
        while (it.hasNext()) {
            it.next().delete();
        }
    }

    private static long convertTimestampFromSecondsToMs(long j) {
        return j * 1000;
    }

    private void deleteFiles(List<File> list) {
        Iterator<File> it = list.iterator();
        while (it.hasNext()) {
            it.next().delete();
        }
    }

    @efb
    private static String generateEventFilename(int i, boolean z) {
        return "event" + String.format(Locale.US, f69615k, Integer.valueOf(i)) + (z ? f69617m : "");
    }

    private List<File> getAllFinalizedReportFiles() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f69623b.getPriorityReports());
        arrayList.addAll(this.f69623b.getNativeReports());
        Comparator<? super File> comparator = f69620p;
        Collections.sort(arrayList, comparator);
        List<File> reports = this.f69623b.getReports();
        Collections.sort(reports, comparator);
        arrayList.addAll(reports);
        return arrayList;
    }

    @efb
    private static String getEventNameWithoutPriority(@efb String str) {
        return str.substring(0, f69616l);
    }

    private static boolean isHighPriorityEventFile(@efb String str) {
        return str.startsWith("event") && str.endsWith(f69617m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isNormalPriorityEventFile(@efb File file, @efb String str) {
        return str.startsWith("event") && !str.endsWith(f69617m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$static$0(File file, File file2) {
        return file2.getName().compareTo(file.getName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$static$1(File file, String str) {
        return str.startsWith("event");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int oldestEventFileFirst(@efb File file, @efb File file2) {
        return getEventNameWithoutPriority(file.getName()).compareTo(getEventNameWithoutPriority(file2.getName()));
    }

    @efb
    private static String readTextFile(@efb File file) throws IOException {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int i = fileInputStream.read(bArr);
                if (i <= 0) {
                    String str = new String(byteArrayOutputStream.toByteArray(), f69609e);
                    fileInputStream.close();
                    return str;
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
    }

    private void synthesizeNativeReportFile(@efb File file, @efb z33.AbstractC15964e abstractC15964e, @efb String str, z33.AbstractC15960a abstractC15960a) {
        String appQualitySessionId = this.f69625d.getAppQualitySessionId(str);
        try {
            k43 k43Var = f69619o;
            writeTextFile(this.f69623b.getNativeReport(str), k43Var.reportToJson(k43Var.reportFromJson(readTextFile(file)).withNdkPayload(abstractC15964e).withApplicationExitInfo(abstractC15960a).withAppQualitySessionId(appQualitySessionId)));
        } catch (IOException e) {
            ej9.getLogger().m10070w("Could not synthesize final native report file for " + file, e);
        }
    }

    private void synthesizeReport(String str, long j) {
        boolean z;
        List<File> sessionFiles = this.f69623b.getSessionFiles(str, f69621q);
        if (sessionFiles.isEmpty()) {
            ej9.getLogger().m10067v("Session " + str + " has no events.");
            return;
        }
        Collections.sort(sessionFiles);
        ArrayList arrayList = new ArrayList();
        loop0: while (true) {
            z = false;
            for (File file : sessionFiles) {
                try {
                    arrayList.add(f69619o.eventFromJson(readTextFile(file)));
                } catch (IOException e) {
                    ej9.getLogger().m10070w("Could not add event to report for " + file, e);
                }
                if (z || isHighPriorityEventFile(file.getName())) {
                    z = true;
                }
            }
        }
        if (!arrayList.isEmpty()) {
            synthesizeReportFile(this.f69623b.getSessionFile(str, f69611g), arrayList, j, z, gzh.readUserId(str, this.f69623b), this.f69625d.getAppQualitySessionId(str));
        } else {
            ej9.getLogger().m10069w("Could not parse event files for session " + str);
        }
    }

    private void synthesizeReportFile(@efb File file, @efb List<z33.AbstractC15965f.d> list, long j, boolean z, @hib String str, @hib String str2) {
        try {
            k43 k43Var = f69619o;
            z33 z33VarWithEvents = k43Var.reportFromJson(readTextFile(file)).withSessionEndFields(j, z, str).withAppQualitySessionId(str2).withEvents(list);
            z33.AbstractC15965f session = z33VarWithEvents.getSession();
            if (session == null) {
                return;
            }
            ej9.getLogger().m10061d("appQualitySessionId: " + str2);
            writeTextFile(z ? this.f69623b.getPriorityReport(session.getIdentifier()) : this.f69623b.getReport(session.getIdentifier()), k43Var.reportToJson(z33VarWithEvents));
        } catch (IOException e) {
            ej9.getLogger().m10070w("Could not synthesize final report file for " + file, e);
        }
    }

    private int trimEvents(String str, int i) {
        List<File> sessionFiles = this.f69623b.getSessionFiles(str, new FilenameFilter() { // from class: n43
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str2) {
                return p43.isNormalPriorityEventFile(file, str2);
            }
        });
        Collections.sort(sessionFiles, new Comparator() { // from class: o43
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return p43.oldestEventFileFirst((File) obj, (File) obj2);
            }
        });
        return capFilesCount(sessionFiles, i);
    }

    private static void writeTextFile(File file, String str) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f69609e);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
        } catch (Throwable th) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public void deleteAllReports() {
        deleteFiles(this.f69623b.getReports());
        deleteFiles(this.f69623b.getPriorityReports());
        deleteFiles(this.f69623b.getNativeReports());
    }

    public void finalizeReports(@hib String str, long j) {
        for (String str2 : capAndGetOpenSessions(str)) {
            ej9.getLogger().m10067v("Finalizing report for session " + str2);
            synthesizeReport(str2, j);
            this.f69623b.deleteSessionFiles(str2);
        }
        capFinalizedReports();
    }

    public void finalizeSessionWithNativeEvent(String str, z33.AbstractC15964e abstractC15964e, z33.AbstractC15960a abstractC15960a) {
        File sessionFile = this.f69623b.getSessionFile(str, f69611g);
        ej9.getLogger().m10061d("Writing native session report for " + str + " to file: " + sessionFile);
        synthesizeNativeReportFile(sessionFile, abstractC15964e, str, abstractC15960a);
    }

    public SortedSet<String> getOpenSessionIds() {
        return new TreeSet(this.f69623b.getAllOpenSessionIds()).descendingSet();
    }

    public long getStartTimestampMillis(String str) {
        return this.f69623b.getSessionFile(str, "start-time").lastModified();
    }

    public boolean hasFinalizedReports() {
        return (this.f69623b.getReports().isEmpty() && this.f69623b.getPriorityReports().isEmpty() && this.f69623b.getNativeReports().isEmpty()) ? false : true;
    }

    @efb
    public List<q43> loadFinalizedReports() {
        List<File> allFinalizedReportFiles = getAllFinalizedReportFiles();
        ArrayList arrayList = new ArrayList();
        for (File file : allFinalizedReportFiles) {
            try {
                arrayList.add(q43.create(f69619o.reportFromJson(readTextFile(file)), file.getName(), file));
            } catch (IOException e) {
                ej9.getLogger().m10070w("Could not load report file " + file + "; deleting", e);
                file.delete();
            }
        }
        return arrayList;
    }

    public void persistEvent(@efb z33.AbstractC15965f.d dVar, @efb String str) {
        persistEvent(dVar, str, false);
    }

    public void persistReport(@efb z33 z33Var) {
        z33.AbstractC15965f session = z33Var.getSession();
        if (session == null) {
            ej9.getLogger().m10061d("Could not get session for report");
            return;
        }
        String identifier = session.getIdentifier();
        try {
            writeTextFile(this.f69623b.getSessionFile(identifier, f69611g), f69619o.reportToJson(z33Var));
            writeTextFile(this.f69623b.getSessionFile(identifier, "start-time"), "", session.getStartedAt());
        } catch (IOException e) {
            ej9.getLogger().m10062d("Could not persist report for session " + identifier, e);
        }
    }

    public void persistEvent(@efb z33.AbstractC15965f.d dVar, @efb String str, boolean z) {
        int i = this.f69624c.getSettingsSync().f575a.f586a;
        try {
            writeTextFile(this.f69623b.getSessionFile(str, generateEventFilename(this.f69622a.getAndIncrement(), z)), f69619o.eventToJson(dVar));
        } catch (IOException e) {
            ej9.getLogger().m10070w("Could not persist event for session " + str, e);
        }
        trimEvents(str, i);
    }

    private static void writeTextFile(File file, String str, long j) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f69609e);
        try {
            outputStreamWriter.write(str);
            file.setLastModified(convertTimestampFromSecondsToMs(j));
            outputStreamWriter.close();
        } catch (Throwable th) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
