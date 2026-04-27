package p000;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p000.if0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class xng extends lq0 {

    /* JADX INFO: renamed from: i */
    public final InterfaceC15216a f98680i;

    /* JADX INFO: renamed from: xng$a */
    public interface InterfaceC15216a {
        void flush(int i, int i2, int i3);

        void handleBuffer(ByteBuffer byteBuffer);
    }

    /* JADX INFO: renamed from: xng$b */
    public static final class C15217b implements InterfaceC15216a {

        /* JADX INFO: renamed from: j */
        public static final String f98681j = "WaveFileAudioBufferSink";

        /* JADX INFO: renamed from: k */
        public static final int f98682k = 4;

        /* JADX INFO: renamed from: l */
        public static final int f98683l = 40;

        /* JADX INFO: renamed from: m */
        public static final int f98684m = 44;

        /* JADX INFO: renamed from: a */
        public final String f98685a;

        /* JADX INFO: renamed from: b */
        public final byte[] f98686b;

        /* JADX INFO: renamed from: c */
        public final ByteBuffer f98687c;

        /* JADX INFO: renamed from: d */
        public int f98688d;

        /* JADX INFO: renamed from: e */
        public int f98689e;

        /* JADX INFO: renamed from: f */
        public int f98690f;

        /* JADX INFO: renamed from: g */
        @hib
        public RandomAccessFile f98691g;

        /* JADX INFO: renamed from: h */
        public int f98692h;

        /* JADX INFO: renamed from: i */
        public int f98693i;

        public C15217b(String str) {
            this.f98685a = str;
            byte[] bArr = new byte[1024];
            this.f98686b = bArr;
            this.f98687c = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
        }

        private String getNextOutputFileName() {
            String str = this.f98685a;
            int i = this.f98692h;
            this.f98692h = i + 1;
            return x0i.formatInvariant("%s-%04d.wav", str, Integer.valueOf(i));
        }

        private void maybePrepareFile() throws IOException {
            if (this.f98691g != null) {
                return;
            }
            RandomAccessFile randomAccessFile = new RandomAccessFile(getNextOutputFileName(), "rw");
            writeFileHeader(randomAccessFile);
            this.f98691g = randomAccessFile;
            this.f98693i = 44;
        }

        private void reset() throws IOException {
            RandomAccessFile randomAccessFile = this.f98691g;
            if (randomAccessFile == null) {
                return;
            }
            try {
                this.f98687c.clear();
                this.f98687c.putInt(this.f98693i - 8);
                randomAccessFile.seek(4L);
                randomAccessFile.write(this.f98686b, 0, 4);
                this.f98687c.clear();
                this.f98687c.putInt(this.f98693i - 44);
                randomAccessFile.seek(40L);
                randomAccessFile.write(this.f98686b, 0, 4);
            } catch (IOException e) {
                yh9.m25920w("WaveFileAudioBufferSink", "Error updating file size", e);
            }
            try {
                randomAccessFile.close();
            } finally {
                this.f98691g = null;
            }
        }

        private void writeBuffer(ByteBuffer byteBuffer) throws IOException {
            RandomAccessFile randomAccessFile = (RandomAccessFile) u80.checkNotNull(this.f98691g);
            while (byteBuffer.hasRemaining()) {
                int iMin = Math.min(byteBuffer.remaining(), this.f98686b.length);
                byteBuffer.get(this.f98686b, 0, iMin);
                randomAccessFile.write(this.f98686b, 0, iMin);
                this.f98693i += iMin;
            }
        }

        private void writeFileHeader(RandomAccessFile randomAccessFile) throws IOException {
            randomAccessFile.writeInt(1380533830);
            randomAccessFile.writeInt(-1);
            randomAccessFile.writeInt(1463899717);
            randomAccessFile.writeInt(1718449184);
            this.f98687c.clear();
            this.f98687c.putInt(16);
            this.f98687c.putShort((short) whi.getTypeForPcmEncoding(this.f98690f));
            this.f98687c.putShort((short) this.f98689e);
            this.f98687c.putInt(this.f98688d);
            int pcmFrameSize = x0i.getPcmFrameSize(this.f98690f, this.f98689e);
            this.f98687c.putInt(this.f98688d * pcmFrameSize);
            this.f98687c.putShort((short) pcmFrameSize);
            this.f98687c.putShort((short) ((pcmFrameSize * 8) / this.f98689e));
            randomAccessFile.write(this.f98686b, 0, this.f98687c.position());
            randomAccessFile.writeInt(1684108385);
            randomAccessFile.writeInt(-1);
        }

        @Override // p000.xng.InterfaceC15216a
        public void flush(int i, int i2, int i3) {
            try {
                reset();
            } catch (IOException e) {
                yh9.m25916e("WaveFileAudioBufferSink", "Error resetting", e);
            }
            this.f98688d = i;
            this.f98689e = i2;
            this.f98690f = i3;
        }

        @Override // p000.xng.InterfaceC15216a
        public void handleBuffer(ByteBuffer byteBuffer) {
            try {
                maybePrepareFile();
                writeBuffer(byteBuffer);
            } catch (IOException e) {
                yh9.m25916e("WaveFileAudioBufferSink", "Error writing data", e);
            }
        }
    }

    public xng(InterfaceC15216a interfaceC15216a) {
        this.f98680i = (InterfaceC15216a) u80.checkNotNull(interfaceC15216a);
    }

    private void flushSinkIfActive() {
        if (isActive()) {
            InterfaceC15216a interfaceC15216a = this.f98680i;
            if0.C7262a c7262a = this.f58444b;
            interfaceC15216a.flush(c7262a.f46720a, c7262a.f46721b, c7262a.f46722c);
        }
    }

    @Override // p000.lq0
    /* JADX INFO: renamed from: b */
    public void mo3214b() {
        flushSinkIfActive();
    }

    @Override // p000.lq0
    /* JADX INFO: renamed from: c */
    public void mo3215c() {
        flushSinkIfActive();
    }

    @Override // p000.lq0
    /* JADX INFO: renamed from: d */
    public void mo3216d() {
        flushSinkIfActive();
    }

    @Override // p000.lq0
    public if0.C7262a onConfigure(if0.C7262a c7262a) {
        return c7262a;
    }

    @Override // p000.if0
    public void queueInput(ByteBuffer byteBuffer) {
        int iRemaining = byteBuffer.remaining();
        if (iRemaining == 0) {
            return;
        }
        this.f98680i.handleBuffer(byteBuffer.asReadOnlyBuffer());
        m16315e(iRemaining).put(byteBuffer).flip();
    }
}
