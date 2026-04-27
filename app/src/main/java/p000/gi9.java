package p000;

import java.io.File;

/* JADX INFO: loaded from: classes5.dex */
public class gi9 {

    /* JADX INFO: renamed from: c */
    public static final String f39871c = "userlog";

    /* JADX INFO: renamed from: d */
    public static final C6322b f39872d = new C6322b();

    /* JADX INFO: renamed from: e */
    public static final int f39873e = 65536;

    /* JADX INFO: renamed from: a */
    public final kt5 f39874a;

    /* JADX INFO: renamed from: b */
    public xs5 f39875b;

    /* JADX INFO: renamed from: gi9$b */
    public static final class C6322b implements xs5 {
        private C6322b() {
        }

        @Override // p000.xs5
        public void closeLogFile() {
        }

        @Override // p000.xs5
        public void deleteLogFile() {
        }

        @Override // p000.xs5
        public byte[] getLogAsBytes() {
            return null;
        }

        @Override // p000.xs5
        public String getLogAsString() {
            return null;
        }

        @Override // p000.xs5
        public void writeToLog(long j, String str) {
        }
    }

    public gi9(kt5 kt5Var) {
        this.f39874a = kt5Var;
        this.f39875b = f39872d;
    }

    private File getWorkingFileForSession(String str) {
        return this.f39874a.getSessionFile(str, f39871c);
    }

    /* JADX INFO: renamed from: a */
    public void m11689a(File file, int i) {
        this.f39875b = new und(file, i);
    }

    public void clearLog() {
        this.f39875b.deleteLogFile();
    }

    public byte[] getBytesForLog() {
        return this.f39875b.getLogAsBytes();
    }

    @hib
    public String getLogString() {
        return this.f39875b.getLogAsString();
    }

    public final void setCurrentSession(String str) {
        this.f39875b.closeLogFile();
        this.f39875b = f39872d;
        if (str == null) {
            return;
        }
        m11689a(getWorkingFileForSession(str), 65536);
    }

    public void writeToLog(long j, String str) {
        this.f39875b.writeToLog(j, str);
    }

    public gi9(kt5 kt5Var, String str) {
        this(kt5Var);
        setCurrentSession(str);
    }
}
