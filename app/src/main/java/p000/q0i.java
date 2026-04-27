package p000;

import android.content.Context;
import android.database.Cursor;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.StatFs;
import android.util.Log;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ThreadFactory;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p000.en4;
import p000.pm4;
import p000.zk4;

/* JADX INFO: loaded from: classes6.dex */
public class q0i {

    /* JADX INFO: renamed from: a */
    public static final String f72714a = "HEAD";

    /* JADX INFO: renamed from: b */
    public static final String f72715b = "Range";

    /* JADX INFO: renamed from: c */
    public static final String f72716c = "If-Match";

    /* JADX INFO: renamed from: d */
    public static final String f72717d = "User-Agent";

    /* JADX INFO: renamed from: e */
    public static final String f72718e = "Content-Length";

    /* JADX INFO: renamed from: f */
    public static final String f72719f = "Content-Range";

    /* JADX INFO: renamed from: g */
    public static final String f72720g = "Etag";

    /* JADX INFO: renamed from: h */
    public static final String f72721h = "Transfer-Encoding";

    /* JADX INFO: renamed from: i */
    public static final String f72722i = "Accept-Ranges";

    /* JADX INFO: renamed from: j */
    public static final String f72723j = "Content-Disposition";

    /* JADX INFO: renamed from: k */
    public static final String f72724k = "chunked";

    /* JADX INFO: renamed from: l */
    public static final int f72725l = -1;

    /* JADX INFO: renamed from: m */
    public static final int f72726m = 416;

    /* JADX INFO: renamed from: n */
    public static InterfaceC11246c f72727n = new C11245b();

    /* JADX INFO: renamed from: q0i$a */
    public static class ThreadFactoryC11244a implements ThreadFactory {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f72728a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f72729b;

        public ThreadFactoryC11244a(String str, boolean z) {
            this.f72728a = str;
            this.f72729b = z;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(@efb Runnable runnable) {
            Thread thread = new Thread(runnable, this.f72728a);
            thread.setDaemon(this.f72729b);
            return thread;
        }
    }

    /* JADX INFO: renamed from: q0i$b */
    public static class C11245b implements InterfaceC11246c {
        @Override // p000.q0i.InterfaceC11246c
        /* JADX INFO: renamed from: d */
        public void mo19917d(String str, String str2) {
        }

        @Override // p000.q0i.InterfaceC11246c
        /* JADX INFO: renamed from: e */
        public void mo19918e(String str, String str2, Exception exc) {
        }

        @Override // p000.q0i.InterfaceC11246c
        /* JADX INFO: renamed from: i */
        public void mo19919i(String str, String str2) {
        }

        @Override // p000.q0i.InterfaceC11246c
        /* JADX INFO: renamed from: w */
        public void mo19920w(String str, String str2) {
        }
    }

    /* JADX INFO: renamed from: q0i$c */
    public interface InterfaceC11246c {
        /* JADX INFO: renamed from: d */
        void mo19917d(String str, String str2);

        /* JADX INFO: renamed from: e */
        void mo19918e(String str, String str2, Exception exc);

        /* JADX INFO: renamed from: i */
        void mo19919i(String str, String str2);

        /* JADX INFO: renamed from: w */
        void mo19920w(String str, String str2);
    }

    public static void addDefaultUserAgent(@efb zk4 zk4Var) {
        zk4Var.addHeader("User-Agent", "OkDownload/1.0.7");
    }

    public static void addRequestHeaderFields(@efb Map<String, List<String>> map, @efb zk4 zk4Var) {
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            String key = entry.getKey();
            Iterator<String> it = entry.getValue().iterator();
            while (it.hasNext()) {
                zk4Var.addHeader(key, it.next());
            }
        }
    }

    public static void addUserRequestHeaderField(@efb Map<String, List<String>> map, @efb zk4 zk4Var) throws IOException {
        inspectUserHeader(map);
        addRequestHeaderFields(map, zk4Var);
    }

    public static void assembleBlock(@efb cn4 cn4Var, @efb bd1 bd1Var, long j, boolean z) {
        int iDetermineBlockCount = e0c.with().downloadStrategy().isUseMultiBlock(z) ? e0c.with().downloadStrategy().determineBlockCount(cn4Var, j) : 1;
        bd1Var.resetBlockInfos();
        long j2 = iDetermineBlockCount;
        long j3 = j / j2;
        long j4 = 0;
        int i = 0;
        long j5 = 0;
        while (i < iDetermineBlockCount) {
            j4 += j5;
            j5 = i == 0 ? (j % j2) + j3 : j3;
            bd1Var.addBlock(new h61(j4, j5));
            i++;
        }
    }

    public static boolean checkPermission(String str) {
        return e0c.with().context().checkCallingOrSelfPermission(str) == 0;
    }

    @efb
    public static zk4.InterfaceC16165b createDefaultConnectionFactory() {
        try {
            return (zk4.InterfaceC16165b) pm4.C11025a.class.getDeclaredConstructor(null).newInstance(null);
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
            return new en4.C5403b();
        }
    }

    @efb
    public static an4 createDefaultDatabase(Context context) {
        try {
            return (an4) Class.forName("com.liulishuo.okdownload.core.breakpoint.BreakpointStoreOnSQLite").getDeclaredConstructor(Context.class).newInstance(context);
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
            return new hd1();
        }
    }

    @efb
    public static an4 createRemitDatabase(@efb an4 an4Var) {
        try {
            an4Var = (an4) an4Var.getClass().getMethod("createRemitSelf", null).invoke(an4Var, null);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
        m19913d("Util", "Get final download store is " + an4Var);
        return an4Var;
    }

    /* JADX INFO: renamed from: d */
    public static void m19913d(String str, String str2) {
        InterfaceC11246c interfaceC11246c = f72727n;
        if (interfaceC11246c != null) {
            interfaceC11246c.mo19917d(str, str2);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m19914e(String str, String str2, Exception exc) {
        InterfaceC11246c interfaceC11246c = f72727n;
        if (interfaceC11246c != null) {
            interfaceC11246c.mo19918e(str, str2, exc);
        } else {
            Log.e(str, str2, exc);
        }
    }

    public static void enableConsoleLog() {
        f72727n = null;
    }

    @hib
    public static String getFilenameFromContentUri(@efb Uri uri) {
        Cursor cursorQuery = e0c.with().context().getContentResolver().query(uri, null, null, null, null);
        if (cursorQuery == null) {
            return null;
        }
        try {
            cursorQuery.moveToFirst();
            return cursorQuery.getString(cursorQuery.getColumnIndex("_display_name"));
        } finally {
            cursorQuery.close();
        }
    }

    public static long getFreeSpaceBytes(@efb StatFs statFs) {
        return statFs.getAvailableBytes();
    }

    public static InterfaceC11246c getLogger() {
        return f72727n;
    }

    @efb
    @SuppressFBWarnings({"DMI"})
    public static File getParentFile(File file) {
        File parentFile = file.getParentFile();
        return parentFile == null ? new File(pj4.f71071b) : parentFile;
    }

    public static long getSizeFromContentUri(@efb Uri uri) {
        Cursor cursorQuery = e0c.with().context().getContentResolver().query(uri, null, null, null, null);
        if (cursorQuery == null) {
            return 0L;
        }
        try {
            cursorQuery.moveToFirst();
            return cursorQuery.getLong(cursorQuery.getColumnIndex("_size"));
        } finally {
            cursorQuery.close();
        }
    }

    public static String humanReadableBytes(long j, boolean z) {
        int i = z ? 1000 : 1024;
        if (j < i) {
            return j + " B";
        }
        double d = j;
        double d2 = i;
        int iLog = (int) (Math.log(d) / Math.log(d2));
        StringBuilder sb = new StringBuilder();
        sb.append((z ? "kMGTPE" : "KMGTPE").charAt(iLog - 1));
        sb.append(z ? "" : "i");
        return String.format(Locale.ENGLISH, "%.1f %sB", Double.valueOf(d / Math.pow(d2, iLog)), sb.toString());
    }

    /* JADX INFO: renamed from: i */
    public static void m19915i(String str, String str2) {
        InterfaceC11246c interfaceC11246c = f72727n;
        if (interfaceC11246c != null) {
            interfaceC11246c.mo19919i(str, str2);
        } else {
            Log.i(str, str2);
        }
    }

    public static void inspectUserHeader(@efb Map<String, List<String>> map) throws IOException {
        if (map.containsKey("If-Match") || map.containsKey("Range")) {
            throw new IOException("If-Match and Range only can be handle by internal!");
        }
    }

    public static boolean isCorrectFull(long j, long j2) {
        return j == j2;
    }

    public static boolean isEmpty(@hib CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    public static boolean isNetworkAvailable(ConnectivityManager connectivityManager) {
        if (connectivityManager == null) {
            m19916w("Util", "failed to get connectivity manager!");
            return true;
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public static boolean isNetworkNotOnWifiType(ConnectivityManager connectivityManager) {
        if (connectivityManager == null) {
            m19916w("Util", "failed to get connectivity manager!");
            return true;
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo == null || activeNetworkInfo.getType() != 1;
    }

    public static boolean isUriContentScheme(@efb Uri uri) {
        return uri.getScheme().equals("content");
    }

    public static boolean isUriFileScheme(@efb Uri uri) {
        return uri.getScheme().equals("file");
    }

    @hib
    public static String md5(String str) {
        byte[] bArrDigest;
        try {
            bArrDigest = MessageDigest.getInstance("MD5").digest(str.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException unused) {
            bArrDigest = null;
        }
        if (bArrDigest == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder(bArrDigest.length * 2);
        for (byte b : bArrDigest) {
            int i = b & 255;
            if (i < 16) {
                sb.append('0');
            }
            sb.append(Integer.toHexString(i));
        }
        return sb.toString();
    }

    public static long parseContentLength(@hib String str) {
        if (str == null) {
            return -1L;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            m19913d("Util", "parseContentLength failed parse for '" + str + "'");
            return -1L;
        }
    }

    public static long parseContentLengthFromContentRange(@hib String str) {
        if (str != null && str.length() != 0) {
            try {
                Matcher matcher = Pattern.compile("bytes (\\d+)-(\\d+)/\\d+").matcher(str);
                if (matcher.find()) {
                    return (Long.parseLong(matcher.group(2)) - Long.parseLong(matcher.group(1))) + 1;
                }
            } catch (Exception e) {
                m19916w("Util", "parse content-length from content-range failed " + e);
            }
        }
        return -1L;
    }

    public static void resetBlockIfDirty(h61 h61Var) {
        if (h61Var.getCurrentOffset() >= 0 && h61Var.getCurrentOffset() <= h61Var.getContentLength()) {
            return;
        }
        m19916w("resetBlockIfDirty", "block is dirty so have to reset: " + h61Var);
        h61Var.resetBlock();
    }

    public static void setLogger(@hib InterfaceC11246c interfaceC11246c) {
        f72727n = interfaceC11246c;
    }

    public static ThreadFactory threadFactory(String str, boolean z) {
        return new ThreadFactoryC11244a(str, z);
    }

    /* JADX INFO: renamed from: w */
    public static void m19916w(String str, String str2) {
        InterfaceC11246c interfaceC11246c = f72727n;
        if (interfaceC11246c != null) {
            interfaceC11246c.mo19920w(str, str2);
        } else {
            Log.w(str, str2);
        }
    }
}
