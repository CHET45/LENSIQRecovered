package p000;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes5.dex */
public class tnd implements Closeable {

    /* JADX INFO: renamed from: C */
    public static final int f85384C = 4096;

    /* JADX INFO: renamed from: F */
    public static final int f85385F = 16;

    /* JADX INFO: renamed from: m */
    public static final Logger f85386m = Logger.getLogger(tnd.class.getName());

    /* JADX INFO: renamed from: a */
    public final RandomAccessFile f85387a;

    /* JADX INFO: renamed from: b */
    public int f85388b;

    /* JADX INFO: renamed from: c */
    public int f85389c;

    /* JADX INFO: renamed from: d */
    public C13115b f85390d;

    /* JADX INFO: renamed from: e */
    public C13115b f85391e;

    /* JADX INFO: renamed from: f */
    public final byte[] f85392f;

    /* JADX INFO: renamed from: tnd$a */
    public class C13114a implements InterfaceC13117d {

        /* JADX INFO: renamed from: a */
        public boolean f85393a = true;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ StringBuilder f85394b;

        public C13114a(StringBuilder sb) {
            this.f85394b = sb;
        }

        @Override // p000.tnd.InterfaceC13117d
        public void read(InputStream inputStream, int i) throws IOException {
            if (this.f85393a) {
                this.f85393a = false;
            } else {
                this.f85394b.append(", ");
            }
            this.f85394b.append(i);
        }
    }

    /* JADX INFO: renamed from: tnd$b */
    public static class C13115b {

        /* JADX INFO: renamed from: c */
        public static final int f85396c = 4;

        /* JADX INFO: renamed from: d */
        public static final C13115b f85397d = new C13115b(0, 0);

        /* JADX INFO: renamed from: a */
        public final int f85398a;

        /* JADX INFO: renamed from: b */
        public final int f85399b;

        public C13115b(int i, int i2) {
            this.f85398a = i;
            this.f85399b = i2;
        }

        public String toString() {
            return getClass().getSimpleName() + "[position = " + this.f85398a + ", length = " + this.f85399b + "]";
        }
    }

    /* JADX INFO: renamed from: tnd$c */
    public final class C13116c extends InputStream {

        /* JADX INFO: renamed from: a */
        public int f85400a;

        /* JADX INFO: renamed from: b */
        public int f85401b;

        public /* synthetic */ C13116c(tnd tndVar, C13115b c13115b, C13114a c13114a) {
            this(c13115b);
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            tnd.nonNull(bArr, "buffer");
            if ((i | i2) < 0 || i2 > bArr.length - i) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i3 = this.f85401b;
            if (i3 <= 0) {
                return -1;
            }
            if (i2 > i3) {
                i2 = i3;
            }
            tnd.this.ringRead(this.f85400a, bArr, i, i2);
            this.f85400a = tnd.this.wrapPosition(this.f85400a + i2);
            this.f85401b -= i2;
            return i2;
        }

        private C13116c(C13115b c13115b) {
            this.f85400a = tnd.this.wrapPosition(c13115b.f85398a + 4);
            this.f85401b = c13115b.f85399b;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            if (this.f85401b == 0) {
                return -1;
            }
            tnd.this.f85387a.seek(this.f85400a);
            int i = tnd.this.f85387a.read();
            this.f85400a = tnd.this.wrapPosition(this.f85400a + 1);
            this.f85401b--;
            return i;
        }
    }

    /* JADX INFO: renamed from: tnd$d */
    public interface InterfaceC13117d {
        void read(InputStream inputStream, int i) throws IOException;
    }

    public tnd(File file) throws IOException {
        this.f85392f = new byte[16];
        if (!file.exists()) {
            initialize(file);
        }
        this.f85387a = open(file);
        readHeader();
    }

    private void expandIfNecessary(int i) throws IOException {
        int i2 = i + 4;
        int iRemainingBytes = remainingBytes();
        if (iRemainingBytes >= i2) {
            return;
        }
        int i3 = this.f85388b;
        do {
            iRemainingBytes += i3;
            i3 <<= 1;
        } while (iRemainingBytes < i2);
        setLength(i3);
        C13115b c13115b = this.f85391e;
        int iWrapPosition = wrapPosition(c13115b.f85398a + 4 + c13115b.f85399b);
        if (iWrapPosition < this.f85390d.f85398a) {
            FileChannel channel = this.f85387a.getChannel();
            channel.position(this.f85388b);
            long j = iWrapPosition - 4;
            if (channel.transferTo(16L, j, channel) != j) {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
        }
        int i4 = this.f85391e.f85398a;
        int i5 = this.f85390d.f85398a;
        if (i4 < i5) {
            int i6 = (this.f85388b + i4) - 16;
            writeHeader(i3, this.f85389c, i5, i6);
            this.f85391e = new C13115b(i6, this.f85391e.f85399b);
        } else {
            writeHeader(i3, this.f85389c, i5, i4);
        }
        this.f85388b = i3;
    }

    private static void initialize(File file) throws IOException {
        File file2 = new File(file.getPath() + ".tmp");
        RandomAccessFile randomAccessFileOpen = open(file2);
        try {
            randomAccessFileOpen.setLength(PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM);
            randomAccessFileOpen.seek(0L);
            byte[] bArr = new byte[16];
            writeInts(bArr, 4096, 0, 0, 0);
            randomAccessFileOpen.write(bArr);
            randomAccessFileOpen.close();
            if (!file2.renameTo(file)) {
                throw new IOException("Rename failed!");
            }
        } catch (Throwable th) {
            randomAccessFileOpen.close();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T> T nonNull(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    private static RandomAccessFile open(File file) throws FileNotFoundException {
        return new RandomAccessFile(file, "rwd");
    }

    private C13115b readElement(int i) throws IOException {
        if (i == 0) {
            return C13115b.f85397d;
        }
        this.f85387a.seek(i);
        return new C13115b(i, this.f85387a.readInt());
    }

    private void readHeader() throws IOException {
        this.f85387a.seek(0L);
        this.f85387a.readFully(this.f85392f);
        int i = readInt(this.f85392f, 0);
        this.f85388b = i;
        if (i <= this.f85387a.length()) {
            this.f85389c = readInt(this.f85392f, 4);
            int i2 = readInt(this.f85392f, 8);
            int i3 = readInt(this.f85392f, 12);
            this.f85390d = readElement(i2);
            this.f85391e = readElement(i3);
            return;
        }
        throw new IOException("File is truncated. Expected length: " + this.f85388b + ", Actual length: " + this.f85387a.length());
    }

    private static int readInt(byte[] bArr, int i) {
        return ((bArr[i] & 255) << 24) + ((bArr[i + 1] & 255) << 16) + ((bArr[i + 2] & 255) << 8) + (bArr[i + 3] & 255);
    }

    private int remainingBytes() {
        return this.f85388b - usedBytes();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ringRead(int i, byte[] bArr, int i2, int i3) throws IOException {
        int iWrapPosition = wrapPosition(i);
        int i4 = iWrapPosition + i3;
        int i5 = this.f85388b;
        if (i4 <= i5) {
            this.f85387a.seek(iWrapPosition);
            this.f85387a.readFully(bArr, i2, i3);
            return;
        }
        int i6 = i5 - iWrapPosition;
        this.f85387a.seek(iWrapPosition);
        this.f85387a.readFully(bArr, i2, i6);
        this.f85387a.seek(16L);
        this.f85387a.readFully(bArr, i2 + i6, i3 - i6);
    }

    private void ringWrite(int i, byte[] bArr, int i2, int i3) throws IOException {
        int iWrapPosition = wrapPosition(i);
        int i4 = iWrapPosition + i3;
        int i5 = this.f85388b;
        if (i4 <= i5) {
            this.f85387a.seek(iWrapPosition);
            this.f85387a.write(bArr, i2, i3);
            return;
        }
        int i6 = i5 - iWrapPosition;
        this.f85387a.seek(iWrapPosition);
        this.f85387a.write(bArr, i2, i6);
        this.f85387a.seek(16L);
        this.f85387a.write(bArr, i2 + i6, i3 - i6);
    }

    private void setLength(int i) throws IOException {
        this.f85387a.setLength(i);
        this.f85387a.getChannel().force(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int wrapPosition(int i) {
        int i2 = this.f85388b;
        return i < i2 ? i : (i + 16) - i2;
    }

    private void writeHeader(int i, int i2, int i3, int i4) throws IOException {
        writeInts(this.f85392f, i, i2, i3, i4);
        this.f85387a.seek(0L);
        this.f85387a.write(this.f85392f);
    }

    private static void writeInt(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) (i2 >> 24);
        bArr[i + 1] = (byte) (i2 >> 16);
        bArr[i + 2] = (byte) (i2 >> 8);
        bArr[i + 3] = (byte) i2;
    }

    private static void writeInts(byte[] bArr, int... iArr) {
        int i = 0;
        for (int i2 : iArr) {
            writeInt(bArr, i, i2);
            i += 4;
        }
    }

    public void add(byte[] bArr) throws IOException {
        add(bArr, 0, bArr.length);
    }

    public synchronized void clear() throws IOException {
        try {
            writeHeader(4096, 0, 0, 0);
            this.f85389c = 0;
            C13115b c13115b = C13115b.f85397d;
            this.f85390d = c13115b;
            this.f85391e = c13115b;
            if (this.f85388b > 4096) {
                setLength(4096);
            }
            this.f85388b = 4096;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        this.f85387a.close();
    }

    public synchronized void forEach(InterfaceC13117d interfaceC13117d) throws IOException {
        int iWrapPosition = this.f85390d.f85398a;
        for (int i = 0; i < this.f85389c; i++) {
            C13115b element = readElement(iWrapPosition);
            interfaceC13117d.read(new C13116c(this, element, null), element.f85399b);
            iWrapPosition = wrapPosition(element.f85398a + 4 + element.f85399b);
        }
    }

    public boolean hasSpaceFor(int i, int i2) {
        return (usedBytes() + 4) + i <= i2;
    }

    public synchronized boolean isEmpty() {
        return this.f85389c == 0;
    }

    public synchronized byte[] peek() throws IOException {
        if (isEmpty()) {
            return null;
        }
        C13115b c13115b = this.f85390d;
        int i = c13115b.f85399b;
        byte[] bArr = new byte[i];
        ringRead(c13115b.f85398a + 4, bArr, 0, i);
        return bArr;
    }

    public synchronized void remove() throws IOException {
        try {
            if (isEmpty()) {
                throw new NoSuchElementException();
            }
            if (this.f85389c == 1) {
                clear();
            } else {
                C13115b c13115b = this.f85390d;
                int iWrapPosition = wrapPosition(c13115b.f85398a + 4 + c13115b.f85399b);
                ringRead(iWrapPosition, this.f85392f, 0, 4);
                int i = readInt(this.f85392f, 0);
                writeHeader(this.f85388b, this.f85389c - 1, iWrapPosition, this.f85391e.f85398a);
                this.f85389c--;
                this.f85390d = new C13115b(iWrapPosition, i);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized int size() {
        return this.f85389c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(C4584d2.f28242k);
        sb.append("fileLength=");
        sb.append(this.f85388b);
        sb.append(", size=");
        sb.append(this.f85389c);
        sb.append(", first=");
        sb.append(this.f85390d);
        sb.append(", last=");
        sb.append(this.f85391e);
        sb.append(", element lengths=[");
        try {
            forEach(new C13114a(sb));
        } catch (IOException e) {
            f85386m.log(Level.WARNING, "read error", (Throwable) e);
        }
        sb.append("]]");
        return sb.toString();
    }

    public int usedBytes() {
        if (this.f85389c == 0) {
            return 16;
        }
        C13115b c13115b = this.f85391e;
        int i = c13115b.f85398a;
        int i2 = this.f85390d.f85398a;
        return i >= i2 ? (i - i2) + 4 + c13115b.f85399b + 16 : (((i + 4) + c13115b.f85399b) + this.f85388b) - i2;
    }

    public synchronized void add(byte[] bArr, int i, int i2) throws IOException {
        int iWrapPosition;
        try {
            nonNull(bArr, "buffer");
            if ((i | i2) < 0 || i2 > bArr.length - i) {
                throw new IndexOutOfBoundsException();
            }
            expandIfNecessary(i2);
            boolean zIsEmpty = isEmpty();
            if (zIsEmpty) {
                iWrapPosition = 16;
            } else {
                C13115b c13115b = this.f85391e;
                iWrapPosition = wrapPosition(c13115b.f85398a + 4 + c13115b.f85399b);
            }
            C13115b c13115b2 = new C13115b(iWrapPosition, i2);
            writeInt(this.f85392f, 0, i2);
            ringWrite(c13115b2.f85398a, this.f85392f, 0, 4);
            ringWrite(c13115b2.f85398a + 4, bArr, i, i2);
            writeHeader(this.f85388b, this.f85389c + 1, zIsEmpty ? c13115b2.f85398a : this.f85390d.f85398a, c13115b2.f85398a);
            this.f85391e = c13115b2;
            this.f85389c++;
            if (zIsEmpty) {
                this.f85390d = c13115b2;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public tnd(RandomAccessFile randomAccessFile) throws IOException {
        this.f85392f = new byte[16];
        this.f85387a = randomAccessFile;
        readHeader();
    }

    public synchronized void peek(InterfaceC13117d interfaceC13117d) throws IOException {
        if (this.f85389c > 0) {
            interfaceC13117d.read(new C13116c(this, this.f85390d, null), this.f85390d.f85399b);
        }
    }
}
