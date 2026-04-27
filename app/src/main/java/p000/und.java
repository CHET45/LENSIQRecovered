package p000;

import com.blankj.utilcode.util.C2473f;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Locale;
import p000.tnd;

/* JADX INFO: loaded from: classes5.dex */
public class und implements xs5 {

    /* JADX INFO: renamed from: d */
    public static final Charset f88617d = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a */
    public final File f88618a;

    /* JADX INFO: renamed from: b */
    public final int f88619b;

    /* JADX INFO: renamed from: c */
    public tnd f88620c;

    /* JADX INFO: renamed from: und$a */
    public class C13617a implements tnd.InterfaceC13117d {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ byte[] f88621a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int[] f88622b;

        public C13617a(byte[] bArr, int[] iArr) {
            this.f88621a = bArr;
            this.f88622b = iArr;
        }

        @Override // p000.tnd.InterfaceC13117d
        public void read(InputStream inputStream, int i) throws IOException {
            try {
                inputStream.read(this.f88621a, this.f88622b[0], i);
                int[] iArr = this.f88622b;
                iArr[0] = iArr[0] + i;
            } finally {
                inputStream.close();
            }
        }
    }

    /* JADX INFO: renamed from: und$b */
    public static class C13618b {

        /* JADX INFO: renamed from: a */
        public final byte[] f88624a;

        /* JADX INFO: renamed from: b */
        public final int f88625b;

        public C13618b(byte[] bArr, int i) {
            this.f88624a = bArr;
            this.f88625b = i;
        }
    }

    public und(File file, int i) {
        this.f88618a = file;
        this.f88619b = i;
    }

    private void doWriteToLog(long j, String str) {
        if (this.f88620c == null) {
            return;
        }
        if (str == null) {
            str = "null";
        }
        try {
            int i = this.f88619b / 4;
            if (str.length() > i) {
                str = "..." + str.substring(str.length() - i);
            }
            this.f88620c.add(String.format(Locale.US, "%d %s%n", Long.valueOf(j), str.replaceAll(eu9.f34034d, C2473f.f17566z).replaceAll("\n", C2473f.f17566z)).getBytes(f88617d));
            while (!this.f88620c.isEmpty() && this.f88620c.usedBytes() > this.f88619b) {
                this.f88620c.remove();
            }
        } catch (IOException e) {
            ej9.getLogger().m10064e("There was a problem writing to the Crashlytics log.", e);
        }
    }

    private C13618b getLogBytes() {
        if (!this.f88618a.exists()) {
            return null;
        }
        openLogFile();
        tnd tndVar = this.f88620c;
        if (tndVar == null) {
            return null;
        }
        int[] iArr = {0};
        byte[] bArr = new byte[tndVar.usedBytes()];
        try {
            this.f88620c.forEach(new C13617a(bArr, iArr));
        } catch (IOException e) {
            ej9.getLogger().m10064e("A problem occurred while reading the Crashlytics log file.", e);
        }
        return new C13618b(bArr, iArr[0]);
    }

    private void openLogFile() {
        if (this.f88620c == null) {
            try {
                this.f88620c = new tnd(this.f88618a);
            } catch (IOException e) {
                ej9.getLogger().m10064e("Could not open log file: " + this.f88618a, e);
            }
        }
    }

    @Override // p000.xs5
    public void closeLogFile() {
        lc2.closeOrLog(this.f88620c, "There was a problem closing the Crashlytics log file.");
        this.f88620c = null;
    }

    @Override // p000.xs5
    public void deleteLogFile() {
        closeLogFile();
        this.f88618a.delete();
    }

    @Override // p000.xs5
    public byte[] getLogAsBytes() {
        C13618b logBytes = getLogBytes();
        if (logBytes == null) {
            return null;
        }
        int i = logBytes.f88625b;
        byte[] bArr = new byte[i];
        System.arraycopy(logBytes.f88624a, 0, bArr, 0, i);
        return bArr;
    }

    @Override // p000.xs5
    public String getLogAsString() {
        byte[] logAsBytes = getLogAsBytes();
        if (logAsBytes != null) {
            return new String(logAsBytes, f88617d);
        }
        return null;
    }

    @Override // p000.xs5
    public void writeToLog(long j, String str) {
        openLogFile();
        doWriteToLog(j, str);
    }
}
