package p000;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: loaded from: classes6.dex */
public class tvi {

    /* JADX INFO: renamed from: a */
    public RandomAccessFile f86116a;

    /* JADX INFO: renamed from: b */
    public short f86117b;

    /* JADX INFO: renamed from: c */
    public int f86118c;

    /* JADX INFO: renamed from: d */
    public short f86119d;

    public tvi(File file, int i) throws IOException {
        m22878a(file, (short) 1, i, (short) 16);
    }

    /* JADX INFO: renamed from: a */
    public void m22879a() throws IOException {
        RandomAccessFile randomAccessFile = this.f86116a;
        if (randomAccessFile != null) {
            randomAccessFile.close();
            this.f86116a = null;
        }
    }

    /* JADX INFO: renamed from: b */
    public int m22883b() throws IOException {
        return (int) (this.f86116a.length() - 44);
    }

    /* JADX INFO: renamed from: c */
    public void m22884c() throws IOException {
        this.f86116a.seek(0L);
        m22881a("RIFF");
        m22880a(m22883b() + 36);
        m22881a("WAVE");
        m22881a("fmt ");
        m22880a(16);
        m22882a((short) 1);
        m22882a(this.f86117b);
        m22880a(this.f86118c);
        m22880a(((this.f86117b * this.f86118c) * this.f86119d) / 8);
        m22882a((short) ((this.f86117b * this.f86119d) / 8));
        m22882a(this.f86119d);
        m22881a("data");
        m22880a(m22883b());
    }

    /* JADX INFO: renamed from: a */
    public void m22880a(int i) throws IOException {
        this.f86116a.write(i);
        this.f86116a.write(i >> 8);
        this.f86116a.write(i >> 16);
        this.f86116a.write(i >> 24);
    }

    /* JADX INFO: renamed from: a */
    public void m22881a(String str) throws IOException {
        for (int i = 0; i < str.length(); i++) {
            this.f86116a.write(str.charAt(i));
        }
    }

    /* JADX INFO: renamed from: a */
    public void m22882a(short s) throws IOException {
        this.f86116a.write(s);
        this.f86116a.write(s >> 8);
    }

    /* JADX INFO: renamed from: a */
    private boolean m22878a(File file, short s, int i, short s2) throws IOException {
        if (file == null) {
            return false;
        }
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        this.f86116a = randomAccessFile;
        this.f86117b = s;
        this.f86118c = i;
        this.f86119d = s2;
        randomAccessFile.write(new byte[44]);
        return true;
    }
}
