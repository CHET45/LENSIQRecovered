package p000;

import com.zlw.main.recorderlib.recorder.C4442a;
import com.zlw.main.recorderlib.recorder.RecordService;
import com.zlw.main.recorderlib.recorder.mp3.Mp3Encoder;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class m0b extends Thread {

    /* JADX INFO: renamed from: C */
    public static final String f59549C = "m0b";

    /* JADX INFO: renamed from: b */
    public File f59551b;

    /* JADX INFO: renamed from: c */
    public FileOutputStream f59552c;

    /* JADX INFO: renamed from: d */
    public byte[] f59553d;

    /* JADX INFO: renamed from: e */
    public InterfaceC9072b f59554e;

    /* JADX INFO: renamed from: a */
    public List<C9071a> f59550a = Collections.synchronizedList(new LinkedList());

    /* JADX INFO: renamed from: f */
    public volatile boolean f59555f = false;

    /* JADX INFO: renamed from: m */
    public volatile boolean f59556m = true;

    /* JADX INFO: renamed from: m0b$a */
    public static class C9071a {

        /* JADX INFO: renamed from: a */
        public short[] f59557a;

        /* JADX INFO: renamed from: b */
        public int f59558b;

        public C9071a(short[] sArr, int i) {
            this.f59557a = (short[]) sArr.clone();
            this.f59558b = i;
        }

        /* JADX INFO: renamed from: a */
        public short[] m16542a() {
            return this.f59557a;
        }

        /* JADX INFO: renamed from: b */
        public int m16543b() {
            return this.f59558b;
        }
    }

    /* JADX INFO: renamed from: m0b$b */
    public interface InterfaceC9072b {
        void onFinish();
    }

    public m0b(File file, int i) {
        this.f59551b = file;
        this.f59553d = new byte[(int) ((((double) (i * 2)) * 1.25d) + 7200.0d)];
        C4442a currentConfig = RecordService.getCurrentConfig();
        int sampleRate = currentConfig.getSampleRate();
        ij9.m13143w(f59549C, "in_sampleRate:%s，getChannelCount:%s ，out_sampleRate：%s 位宽： %s,", Integer.valueOf(sampleRate), Integer.valueOf(currentConfig.getChannelCount()), Integer.valueOf(sampleRate), Integer.valueOf(currentConfig.getRealEncoding()));
        Mp3Encoder.init(sampleRate, currentConfig.getChannelCount(), sampleRate, currentConfig.getRealEncoding());
    }

    private void finish() {
        this.f59556m = false;
        int iFlush = Mp3Encoder.flush(this.f59553d);
        if (iFlush > 0) {
            try {
                this.f59552c.write(this.f59553d, 0, iFlush);
                this.f59552c.close();
            } catch (IOException e) {
                ij9.m13137e(f59549C, e.getMessage(), new Object[0]);
            }
        }
        ij9.m13135d(f59549C, "转换结束 :%s", Long.valueOf(this.f59551b.length()));
        InterfaceC9072b interfaceC9072b = this.f59554e;
        if (interfaceC9072b != null) {
            interfaceC9072b.onFinish();
        }
    }

    private void lameData(C9071a c9071a) {
        if (c9071a == null) {
            return;
        }
        short[] sArrM16542a = c9071a.m16542a();
        int iM16543b = c9071a.m16543b();
        if (iM16543b > 0) {
            int iEncode = Mp3Encoder.encode(sArrM16542a, sArrM16542a, iM16543b, this.f59553d);
            if (iEncode < 0) {
                ij9.m13137e(f59549C, "Lame encoded size: " + iEncode, new Object[0]);
            }
            try {
                this.f59552c.write(this.f59553d, 0, iEncode);
            } catch (IOException e) {
                ij9.m13138e(e, f59549C, "Unable to write to file", new Object[0]);
            }
        }
    }

    private C9071a next() {
        while (true) {
            List<C9071a> list = this.f59550a;
            if (list != null && list.size() != 0) {
                return this.f59550a.remove(0);
            }
            try {
                if (this.f59555f) {
                    finish();
                }
                synchronized (this) {
                    wait();
                }
            } catch (Exception e) {
                ij9.m13138e(e, f59549C, e.getMessage(), new Object[0]);
            }
        }
    }

    public void addChangeBuffer(C9071a c9071a) {
        if (c9071a != null) {
            this.f59550a.add(c9071a);
            synchronized (this) {
                notify();
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        try {
            this.f59552c = new FileOutputStream(this.f59551b);
            while (this.f59556m) {
                C9071a next = next();
                ij9.m13141v(f59549C, "处理数据：%s", next == null ? "null" : Integer.valueOf(next.m16543b()));
                lameData(next);
            }
        } catch (FileNotFoundException e) {
            ij9.m13138e(e, f59549C, e.getMessage(), new Object[0]);
        }
    }

    public void stopSafe(InterfaceC9072b interfaceC9072b) {
        this.f59554e = interfaceC9072b;
        this.f59555f = true;
        synchronized (this) {
            notify();
        }
    }
}
