package p000;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes6.dex */
public class dh8 {

    /* JADX INFO: renamed from: a */
    public static final int f29650a = 1;

    /* JADX INFO: renamed from: b */
    public static final int f29651b = 2;

    /* JADX INFO: renamed from: c */
    public static final int f29652c = 3;

    /* JADX INFO: renamed from: d */
    public static final int f29653d = 4;

    /* JADX INFO: renamed from: e */
    public static final int f29654e = 5;

    /* JADX INFO: renamed from: f */
    public static int f29655f = 1;

    /* JADX INFO: renamed from: g */
    public static long f29656g = 314572800;

    /* JADX INFO: renamed from: h */
    public static final String f29657h = "ota:";

    /* JADX INFO: renamed from: i */
    public static final String f29658i = "logcat";

    /* JADX INFO: renamed from: j */
    public static boolean f29659j = true;

    /* JADX INFO: renamed from: k */
    public static boolean f29660k;

    /* JADX INFO: renamed from: l */
    public static boolean f29661l;

    /* JADX INFO: renamed from: m */
    public static String f29662m;

    /* JADX INFO: renamed from: n */
    @igg({"ConstantLocale"})
    public static final SimpleDateFormat f29663n = new SimpleDateFormat("yyyyMMddHHmmss.SSS", Locale.getDefault());

    /* JADX INFO: renamed from: o */
    @igg({"StaticFieldLeak"})
    public static C4787b f29664o;

    /* JADX INFO: renamed from: p */
    @igg({"StaticFieldLeak"})
    public static Context f29665p;

    /* JADX INFO: renamed from: q */
    public static InterfaceC4786a f29666q;

    /* JADX INFO: renamed from: dh8$a */
    public interface InterfaceC4786a {
        void output(String str);
    }

    public static void addLogOutput(String str) {
        if (f29661l) {
            if (f29664o == null) {
                m9141a(f29665p);
                SystemClock.sleep(20L);
            }
            C4787b c4787b = f29664o;
            if (c4787b != null) {
                c4787b.addLog(str.getBytes());
            }
        }
    }

    /* JADX INFO: renamed from: c */
    private static void m9148c(int i, String str, String str2) {
        String strM9139a = m9139a(m9137a(i), str, str2);
        InterfaceC4786a interfaceC4786a = f29666q;
        if (interfaceC4786a != null) {
            interfaceC4786a.output(strM9139a);
        } else {
            if (i < f29655f) {
                return;
            }
            addLogOutput(strM9139a);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m9151d(String str, String str2) {
        m9140a(2, str, str2);
    }

    public static boolean getSaveLogFile() {
        return f29661l;
    }

    public static String getSaveLogPath(Context context) {
        return m9143b(context, "logcat");
    }

    /* JADX INFO: renamed from: i */
    public static void m9156i(String str, String str2) {
        m9140a(3, str, str2);
    }

    public static boolean isIsLog() {
        return f29659j;
    }

    public static void setIsSaveLogFile(Context context, boolean z) {
        f29661l = z;
        if (z) {
            m9141a(context);
        } else {
            m9147c();
        }
    }

    public static void setIsTest(boolean z) {
        f29660k = z;
    }

    public static void setLog(boolean z) {
        f29659j = z;
    }

    public static void setLogOutput(InterfaceC4786a interfaceC4786a) {
        f29666q = interfaceC4786a;
    }

    /* JADX INFO: renamed from: v */
    public static void m9158v(String str, String str2) {
        m9140a(1, str, str2);
    }

    /* JADX INFO: renamed from: w */
    public static void m9160w(String str, String str2) {
        m9140a(4, str, str2);
    }

    /* JADX INFO: renamed from: a */
    private static String m9139a(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        sb.append(m9149d());
        sb.append(d99.f28832c);
        sb.append(str);
        sb.append(d99.f28832c);
        if (str2 == null) {
            str2 = "null";
        }
        sb.append(str2);
        sb.append(" :  ");
        if (str3 == null) {
            str3 = "null";
        }
        sb.append(str3);
        sb.append("\n");
        return sb.toString();
    }

    /* JADX INFO: renamed from: b */
    private static String m9144b(String str) {
        return f29657h + str;
    }

    /* JADX INFO: renamed from: d */
    public static void m9152d(String str, String str2, String str3) {
        m9151d(str, m9138a(str2, str3));
    }

    /* JADX INFO: renamed from: e */
    public static void m9154e(String str, String str2) {
        m9140a(5, str, str2);
    }

    /* JADX INFO: renamed from: i */
    public static void m9157i(String str, String str2, String str3) {
        m9156i(str, m9138a(str2, str3));
    }

    /* JADX INFO: renamed from: v */
    public static void m9159v(String str, String str2, String str3) {
        m9158v(str, m9138a(str2, str3));
    }

    /* JADX INFO: renamed from: w */
    public static void m9161w(String str, String str2, String str3) {
        m9160w(str, m9138a(str2, str3));
    }

    /* JADX INFO: renamed from: a */
    private static String m9138a(String str, String str2) {
        return String.format(Locale.ENGLISH, "[%s] >>> %s", str, str2);
    }

    /* JADX INFO: renamed from: b */
    private static void m9145b(int i, String str, String str2) {
        System.out.printf(Locale.ENGLISH, "%s\t%s\t%s%n", m9137a(i), str, str2);
    }

    /* JADX INFO: renamed from: e */
    public static void m9155e(String str, String str2, String str3) {
        m9154e(str, m9138a(str2, str3));
    }

    /* JADX INFO: renamed from: a */
    private static String m9137a(int i) {
        if (i == 1) {
            return "v";
        }
        if (i == 2) {
            return "d";
        }
        if (i == 3) {
            return "i";
        }
        if (i == 4) {
            return "w";
        }
        if (i != 5) {
            return "";
        }
        return "e";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static String m9149d() {
        return f29663n.format(Calendar.getInstance().getTime());
    }

    /* JADX INFO: renamed from: dh8$b */
    public static class C4787b extends Thread {

        /* JADX INFO: renamed from: a */
        public final LinkedBlockingQueue<byte[]> f29667a;

        /* JADX INFO: renamed from: b */
        public final Context f29668b;

        /* JADX INFO: renamed from: c */
        public volatile boolean f29669c;

        /* JADX INFO: renamed from: d */
        public volatile boolean f29670d;

        /* JADX INFO: renamed from: e */
        public long f29671e;

        /* JADX INFO: renamed from: f */
        public FileOutputStream f29672f;

        public C4787b(Context context) {
            super("SaveLogFileThread");
            this.f29667a = new LinkedBlockingQueue<>();
            this.f29668b = context;
        }

        /* JADX INFO: renamed from: a */
        private void m9162a() {
            if (this.f29669c) {
                synchronized (this.f29667a) {
                    this.f29667a.notify();
                }
            }
        }

        public void addLog(byte[] bArr) {
            if (bArr != null) {
                try {
                    this.f29667a.put(bArr);
                    m9162a();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        public synchronized void closeSaveFile() {
            this.f29670d = false;
            m9162a();
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            FileOutputStream fileOutputStream;
            this.f29670d = m9163a(this.f29668b);
            synchronized (this.f29667a) {
                while (this.f29670d) {
                    if (this.f29667a.isEmpty()) {
                        this.f29669c = true;
                        try {
                            this.f29667a.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    } else {
                        this.f29669c = false;
                        byte[] bArrPoll = this.f29667a.poll();
                        if (bArrPoll != null && (fileOutputStream = this.f29672f) != null) {
                            try {
                                fileOutputStream.write(bArrPoll);
                                this.f29671e += (long) bArrPoll.length;
                            } catch (IOException e2) {
                                e2.printStackTrace();
                            }
                            if (this.f29671e >= dh8.f29656g) {
                                try {
                                    this.f29672f.close();
                                } catch (IOException e3) {
                                    e3.printStackTrace();
                                }
                                this.f29670d = m9163a(this.f29668b);
                            }
                        }
                    }
                }
            }
            this.f29670d = false;
            this.f29669c = false;
            this.f29667a.clear();
            FileOutputStream fileOutputStream2 = this.f29672f;
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException e4) {
                    e4.printStackTrace();
                }
            }
            C4787b unused = dh8.f29664o = null;
        }

        @Override // java.lang.Thread
        public synchronized void start() {
            this.f29671e = 0L;
            this.f29670d = this.f29668b != null;
            super.start();
        }

        /* JADX INFO: renamed from: a */
        private boolean m9163a(Context context) {
            if (context == null) {
                return false;
            }
            if (TextUtils.isEmpty(dh8.f29662m)) {
                String unused = dh8.f29662m = dh8.m9143b(context, "logcat");
            }
            try {
                this.f29672f = new FileOutputStream(dh8.f29662m + "/ota_log_app_" + dh8.m9149d() + hi9.f43738c, true);
                this.f29671e = 0L;
                return true;
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                return false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static String m9143b(Context context, String... strArr) {
        File externalFilesDir;
        if (context == null || strArr == null || strArr.length == 0 || (externalFilesDir = context.getExternalFilesDir(null)) == null || !externalFilesDir.exists()) {
            return null;
        }
        StringBuilder sb = new StringBuilder(externalFilesDir.getPath());
        int i = 0;
        if (sb.toString().endsWith(pj4.f71071b)) {
            sb = new StringBuilder(sb.substring(0, sb.lastIndexOf(pj4.f71071b)));
        }
        int length = strArr.length;
        while (true) {
            if (i >= length) {
                break;
            }
            String str = strArr[i];
            sb.append(pj4.f71071b);
            sb.append(str);
            File file = new File(sb.toString());
            if ((!file.exists() || file.isFile()) && !file.mkdir()) {
                m9160w("jieli", "create dir failed. filePath = " + ((Object) sb));
                break;
            }
            i++;
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: c */
    private static void m9147c() {
        C4787b c4787b = f29664o;
        if (c4787b != null) {
            c4787b.closeSaveFile();
            f29664o = null;
        }
        f29665p = null;
    }

    /* JADX INFO: renamed from: a */
    private static void m9140a(int i, String str, String str2) {
        String strM9144b = m9144b(str);
        if (f29659j) {
            if (f29660k) {
                m9145b(i, strM9144b, str2);
            } else if (i != 1 && i != 2) {
                if (i == 3) {
                    Log.i(strM9144b, str2);
                } else if (i == 4) {
                    Log.w(strM9144b, str2);
                } else if (i != 5) {
                    return;
                } else {
                    Log.e(strM9144b, str2);
                }
            }
        }
        m9148c(i, strM9144b, str2);
    }

    /* JADX INFO: renamed from: a */
    private static void m9141a(Context context) {
        C4787b c4787b = f29664o;
        if (c4787b == null || !c4787b.f29670d) {
            if (f29665p == null) {
                if (context == null) {
                    context = kc2.getMainContext();
                }
                f29665p = context;
            }
            C4787b c4787b2 = new C4787b(f29665p);
            f29664o = c4787b2;
            c4787b2.start();
        }
    }
}
