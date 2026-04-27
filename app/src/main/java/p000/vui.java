package p000;

import android.content.Context;
import android.media.AudioTrack;
import android.os.MemoryFile;
import com.blankj.utilcode.util.C2473f;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes6.dex */
public class vui {

    /* JADX INFO: renamed from: y */
    public static final int f92293y = 100;

    /* JADX INFO: renamed from: g */
    public int f92300g;

    /* JADX INFO: renamed from: h */
    public ArrayList<C14267a> f92301h;

    /* JADX INFO: renamed from: i */
    public Context f92302i;

    /* JADX INFO: renamed from: j */
    public int f92303j;

    /* JADX INFO: renamed from: k */
    public volatile long f92304k;

    /* JADX INFO: renamed from: m */
    public volatile long f92306m;

    /* JADX INFO: renamed from: q */
    public String f92310q;

    /* JADX INFO: renamed from: u */
    public int f92314u;

    /* JADX INFO: renamed from: a */
    public final int f92294a = 2;

    /* JADX INFO: renamed from: b */
    public final int f92295b = 1;

    /* JADX INFO: renamed from: c */
    public final int f92296c = 16000;

    /* JADX INFO: renamed from: d */
    public final int f92297d = 60;

    /* JADX INFO: renamed from: e */
    public final int f92298e = 500;

    /* JADX INFO: renamed from: f */
    public final int f92299f = 1920000;

    /* JADX INFO: renamed from: l */
    public MemoryFile f92305l = null;

    /* JADX INFO: renamed from: n */
    public volatile int f92307n = 0;

    /* JADX INFO: renamed from: o */
    public C14267a f92308o = null;

    /* JADX INFO: renamed from: p */
    public String f92309p = "";

    /* JADX INFO: renamed from: r */
    public byte[] f92311r = null;

    /* JADX INFO: renamed from: s */
    public int f92312s = 0;

    /* JADX INFO: renamed from: t */
    public int f92313t = 0;

    /* JADX INFO: renamed from: v */
    public final float f92315v = 0.95f;

    /* JADX INFO: renamed from: w */
    public boolean f92316w = true;

    /* JADX INFO: renamed from: x */
    public int f92317x = 0;

    /* JADX INFO: renamed from: vui$a */
    public class C14267a {

        /* JADX INFO: renamed from: a */
        public int f92318a;

        /* JADX INFO: renamed from: b */
        public long f92319b;

        /* JADX INFO: renamed from: c */
        public long f92320c;

        /* JADX INFO: renamed from: d */
        public int f92321d;

        public C14267a(long j, long j2, int i, int i2) {
            this.f92319b = j;
            this.f92320c = j2;
            this.f92321d = i;
            this.f92318a = i2;
        }
    }

    public vui(Context context, int i, int i2, String str, int i3) {
        this.f92300g = 1920000;
        this.f92301h = null;
        this.f92302i = null;
        this.f92303j = 16000;
        this.f92304k = 0L;
        this.f92306m = 0L;
        this.f92310q = null;
        this.f92314u = 100;
        this.f92302i = context;
        this.f92304k = 0L;
        this.f92301h = new ArrayList<>();
        this.f92306m = 0L;
        this.f92303j = i;
        this.f92310q = str;
        this.f92314u = i3;
        this.f92300g = (i * 2 * i2) + 1920000;
        xi9.m25209d("min audio seconds: " + i2 + ", max audio buf size: " + this.f92300g);
    }

    private String genFileName() {
        return st5.getUserPath(this.f92302i) + System.currentTimeMillis() + "tts.pcm";
    }

    private void readAudio(int i) throws IOException {
        if (this.f92311r == null) {
            this.f92311r = new byte[i * 10];
        }
        int length = this.f92311r.length;
        int i2 = (int) (this.f92306m - ((long) this.f92307n));
        if (i2 < length) {
            length = i2;
        }
        this.f92305l.readBytes(this.f92311r, this.f92307n, 0, length);
        this.f92307n += length;
        this.f92312s = 0;
        this.f92313t = length;
        xi9.m25209d("readAudio leave, dataSize=" + length + ", bufLen=" + i2);
    }

    private void writeToFile(byte[] bArr) throws IOException {
        if (bArr == null || bArr.length == 0) {
            return;
        }
        if (this.f92305l == null) {
            this.f92309p = genFileName();
            try {
                MemoryFile memoryFile = new MemoryFile(this.f92309p, this.f92300g);
                this.f92305l = memoryFile;
                memoryFile.allowPurging(false);
            } catch (Exception e) {
                sui.m22258b("AEE", "PcmBuffer:writeToFile:" + e.toString());
                return;
            }
        }
        this.f92305l.writeBytes(bArr, 0, (int) this.f92306m, bArr.length);
        this.f92306m += (long) bArr.length;
        sui.m22256a("TAG", "mTotalSize : " + this.f92306m);
    }

    public void beginRead() throws IOException {
        this.f92307n = 0;
        this.f92308o = null;
        if (this.f92301h.size() > 0) {
            this.f92308o = this.f92301h.get(0);
        }
    }

    public void deleteFile() {
        xi9.m25209d("deleteFile");
        try {
            MemoryFile memoryFile = this.f92305l;
            if (memoryFile != null) {
                memoryFile.close();
                this.f92305l = null;
            }
        } catch (Exception e) {
            xi9.m25212e(e);
        }
    }

    public void finalize() throws Throwable {
        deleteFile();
        super.finalize();
    }

    public boolean getEndWithNull() {
        return this.f92316w;
    }

    public int getMemFileLenth() {
        MemoryFile memoryFile = this.f92305l;
        if (memoryFile != null) {
            return memoryFile.length();
        }
        return 0;
    }

    public C14267a getPalyAudioInfo() {
        if (this.f92308o == null) {
            return null;
        }
        long j = this.f92307n - (this.f92313t - this.f92312s);
        C14267a c14267a = this.f92308o;
        if (j >= c14267a.f92319b && j <= c14267a.f92320c) {
            return c14267a;
        }
        synchronized (this.f92301h) {
            try {
                for (C14267a c14267a2 : this.f92301h) {
                    this.f92308o = c14267a2;
                    if (j >= c14267a2.f92319b && j <= c14267a2.f92320c) {
                        return c14267a2;
                    }
                }
                return null;
            } finally {
            }
        }
    }

    public int getPlayPercent() {
        if (this.f92306m <= 0) {
            return 0;
        }
        return (int) ((((long) (this.f92307n - (this.f92313t - this.f92312s))) * this.f92304k) / this.f92306m);
    }

    public int getRate() {
        return this.f92303j;
    }

    public long getTotalSize() {
        return this.f92306m;
    }

    public boolean hasMoreBuffer(int i) {
        return ((long) i) <= ((this.f92306m - ((long) this.f92307n)) + ((long) this.f92313t)) - ((long) this.f92312s);
    }

    public boolean isBufferingFinished() {
        return ((long) this.f92314u) == this.f92304k;
    }

    public boolean isOver() {
        return ((long) this.f92314u) == this.f92304k && ((long) this.f92307n) >= this.f92306m && this.f92312s >= this.f92313t;
    }

    public boolean playAble() {
        return ((long) this.f92307n) < this.f92306m || this.f92312s < this.f92313t;
    }

    public boolean readyToPlay(int i) {
        if (this.f92304k > this.f92314u * 0.95f) {
            return true;
        }
        return this.f92306m / 32 >= ((long) i) && 0 < this.f92306m;
    }

    public boolean renameToLocal(String str) {
        xi9.m25209d("save to local: format = " + str + " totalSize = " + this.f92306m + " maxSize=" + this.f92300g);
        if (st5.saveFile(this.f92305l, this.f92306m, this.f92310q)) {
            return st5.formatPcm(str, this.f92310q, getRate());
        }
        return false;
    }

    public void reset(Context context, int i, int i2, String str, int i3) {
        this.f92302i = context;
        this.f92304k = 0L;
        this.f92301h = new ArrayList<>();
        this.f92306m = 0L;
        this.f92303j = i;
        this.f92310q = str;
        this.f92314u = i3;
        this.f92307n = 0;
        this.f92312s = 0;
        this.f92313t = 0;
        this.f92300g = (this.f92303j * 2 * i2) + 1920000;
        xi9.m25209d("min audio seconds: " + i2 + ", max audio buf size: " + this.f92300g);
    }

    public void setAudioTrackBuffSize(int i) {
        this.f92317x = i;
    }

    public void setEndWithNull(boolean z) {
        this.f92316w = z;
    }

    public void setMaxFileSize(int i) {
        this.f92300g = i;
    }

    public void setPercent(int i) {
        if (i < 0 || i > this.f92314u) {
            return;
        }
        this.f92304k = i;
    }

    public void writeBuffer(ConcurrentLinkedQueue<byte[]> concurrentLinkedQueue) throws IOException {
        if (concurrentLinkedQueue == null) {
            return;
        }
        Iterator<byte[]> it = concurrentLinkedQueue.iterator();
        while (it.hasNext()) {
            writeToFile(it.next());
        }
    }

    public boolean writeStream(ArrayList<byte[]> arrayList, int i, int i2, int i3) {
        boolean z = false;
        try {
            xi9.m25215i("buffer percent = " + i + ", beg=" + i2 + ", end=" + i3);
            C14267a c14267a = new C14267a(this.f92306m, this.f92306m, i2, i3);
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                writeToFile(arrayList.get(i4));
            }
            c14267a.f92320c = this.f92306m;
            this.f92304k = i;
            synchronized (this.f92301h) {
                this.f92301h.add(c14267a);
            }
            z = true;
        } catch (IOException e) {
            xi9.m25215i(e.getMessage() + C2473f.f17566z);
            e.printStackTrace();
        }
        xi9.m25215i("allSize = " + this.f92306m + " maxSize=" + this.f92300g);
        return z;
    }

    public void writeTrack(AudioTrack audioTrack, int i) throws IOException {
        if (this.f92312s >= this.f92313t) {
            readAudio(i);
        }
        int i2 = i * 2;
        int i3 = this.f92313t;
        int i4 = this.f92312s;
        int i5 = i3 - i4;
        if (i2 <= i5) {
            i5 = i;
        }
        audioTrack.write(this.f92311r, i4, i5);
        this.f92312s += i5;
        if (isOver() && getEndWithNull()) {
            writeTrackBlankBlock(audioTrack, i);
        }
    }

    public void writeTrackBlankBlock(AudioTrack audioTrack, int i) {
        long j = this.f92306m;
        long j2 = this.f92317x;
        if (j < j2) {
            int i2 = (int) (j2 - this.f92306m);
            xi9.m25215i("mBuffer.writeTrack writeTrackBlankBlock size: " + i2);
            audioTrack.write(new byte[i2], 0, i2);
        }
    }
}
