package p000;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.text.NumberFormat;
import java.util.Properties;

/* JADX INFO: loaded from: classes7.dex */
public abstract class ku0 implements xog {

    /* JADX INFO: renamed from: b */
    public static final String f55318b = "suite";

    /* JADX INFO: renamed from: c */
    public static Properties f55319c = null;

    /* JADX INFO: renamed from: d */
    public static int f55320d = getPreference("maxmessage", 500);

    /* JADX INFO: renamed from: e */
    public static boolean f55321e = true;

    /* JADX INFO: renamed from: a */
    public boolean f55322a = true;

    /* JADX INFO: renamed from: b */
    public static boolean m14992b(String str) {
        String[] strArr = {"junit.framework.TestCase", "junit.framework.TestResult", "junit.framework.TestSuite", "junit.framework.Assert.", "junit.swingui.TestRunner", "junit.awtui.TestRunner", "junit.textui.TestRunner", "java.lang.reflect.Method.invoke("};
        for (int i = 0; i < 8; i++) {
            if (str.indexOf(strArr[i]) > 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static Properties m14993c() throws Throwable {
        if (f55319c == null) {
            Properties properties = new Properties();
            f55319c = properties;
            properties.put("loading", "true");
            f55319c.put("filterstack", "true");
            readPreferences();
        }
        return f55319c;
    }

    /* JADX INFO: renamed from: g */
    public static void m14994g(Properties properties) {
        f55319c = properties;
    }

    public static String getFilteredTrace(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return getFilteredTrace(stringWriter.toString());
    }

    public static String getPreference(String str) {
        return m14993c().getProperty(str);
    }

    private static File getPreferencesFile() {
        return new File(System.getProperty("user.home"), "junit.properties");
    }

    /* JADX INFO: renamed from: h */
    public static boolean m14995h() {
        return (getPreference("filterstack").equals("true") && f55321e) ? false : true;
    }

    private static void readPreferences() throws Throwable {
        FileInputStream fileInputStream;
        Throwable th;
        FileInputStream fileInputStream2 = null;
        try {
            try {
                fileInputStream = new FileInputStream(getPreferencesFile());
            } catch (IOException unused) {
            } catch (Throwable th2) {
                fileInputStream = null;
                th = th2;
            }
            try {
                m14994g(new Properties(m14993c()));
                m14993c().load(fileInputStream);
                fileInputStream.close();
            } catch (IOException unused2) {
                fileInputStream2 = fileInputStream;
                if (fileInputStream2 == null) {
                } else {
                    fileInputStream2.close();
                }
            } catch (Throwable th3) {
                th = th3;
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (IOException unused3) {
                    }
                }
                throw th;
            }
        } catch (IOException unused4) {
        }
    }

    public static void savePreferences() throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(getPreferencesFile());
        try {
            m14993c().store(fileOutputStream, "");
        } finally {
            fileOutputStream.close();
        }
    }

    public static void setPreference(String str, String str2) {
        m14993c().put(str, str2);
    }

    public static String truncate(String str) {
        if (f55320d == -1 || str.length() <= f55320d) {
            return str;
        }
        return str.substring(0, f55320d) + "...";
    }

    /* JADX INFO: renamed from: a */
    public void m14996a() {
    }

    @Override // p000.xog
    public synchronized void addError(pog pogVar, Throwable th) {
        testFailed(1, pogVar, th);
    }

    @Override // p000.xog
    public synchronized void addFailure(pog pogVar, t80 t80Var) {
        testFailed(2, pogVar, t80Var);
    }

    /* JADX INFO: renamed from: d */
    public Class<?> m14997d(String str) throws ClassNotFoundException {
        return Class.forName(str);
    }

    /* JADX INFO: renamed from: e */
    public String m14998e(String[] strArr) {
        String strExtractClassName = null;
        int i = 0;
        while (i < strArr.length) {
            if (strArr[i].equals("-noloading")) {
                setLoading(false);
            } else if (strArr[i].equals("-nofilterstack")) {
                f55321e = false;
            } else if (strArr[i].equals("-c")) {
                i++;
                if (strArr.length > i) {
                    strExtractClassName = extractClassName(strArr[i]);
                } else {
                    System.out.println("Missing Test class name");
                }
            } else {
                strExtractClassName = strArr[i];
            }
            i++;
        }
        return strExtractClassName;
    }

    public String elapsedTimeAsString(long j) {
        return NumberFormat.getInstance().format(j / 1000.0d);
    }

    @Override // p000.xog
    public synchronized void endTest(pog pogVar) {
        testEnded(pogVar.toString());
    }

    public String extractClassName(String str) {
        return str.startsWith("Default package for") ? str.substring(str.lastIndexOf(".") + 1) : str;
    }

    /* JADX INFO: renamed from: f */
    public abstract void mo12532f(String str);

    public pog getTest(String str) {
        if (str.length() <= 0) {
            m14996a();
            return null;
        }
        try {
            Class<?> clsM14997d = m14997d(str);
            try {
                Method method = clsM14997d.getMethod(f55318b, null);
                if (!Modifier.isStatic(method.getModifiers())) {
                    mo12532f("Suite() method must be static");
                    return null;
                }
                try {
                    pog pogVar = (pog) method.invoke(null, null);
                    if (pogVar == null) {
                        return pogVar;
                    }
                    m14996a();
                    return pogVar;
                } catch (IllegalAccessException e) {
                    mo12532f("Failed to invoke suite():" + e.toString());
                    return null;
                } catch (InvocationTargetException e2) {
                    mo12532f("Failed to invoke suite():" + e2.getTargetException().toString());
                    return null;
                }
            } catch (Exception unused) {
                m14996a();
                return new npg(clsM14997d);
            }
        } catch (ClassNotFoundException e3) {
            String message = e3.getMessage();
            if (message != null) {
                str = message;
            }
            mo12532f("Class not found \"" + str + "\"");
            return null;
        } catch (Exception e4) {
            mo12532f("Error: " + e4.toString());
            return null;
        }
    }

    /* JADX INFO: renamed from: i */
    public boolean m14999i() {
        return getPreference("loading").equals("true") && this.f55322a;
    }

    public void setLoading(boolean z) {
        this.f55322a = z;
    }

    @Override // p000.xog
    public synchronized void startTest(pog pogVar) {
        testStarted(pogVar.toString());
    }

    public abstract void testEnded(String str);

    public abstract void testFailed(int i, pog pogVar, Throwable th);

    public abstract void testStarted(String str);

    public static int getPreference(String str, int i) {
        String preference = getPreference(str);
        if (preference == null) {
            return i;
        }
        try {
            return Integer.parseInt(preference);
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    public static String getFilteredTrace(String str) {
        if (m14995h()) {
            return str;
        }
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        BufferedReader bufferedReader = new BufferedReader(new StringReader(str));
        while (true) {
            try {
                String line = bufferedReader.readLine();
                if (line != null) {
                    if (!m14992b(line)) {
                        printWriter.println(line);
                    }
                } else {
                    return stringWriter.toString();
                }
            } catch (Exception unused) {
                return str;
            }
        }
    }
}
