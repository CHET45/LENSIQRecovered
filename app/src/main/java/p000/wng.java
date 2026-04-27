package p000;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p000.hf0;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class wng extends mq0 {

    /* JADX INFO: renamed from: i */
    public final InterfaceC14709a f94865i;

    /* JADX INFO: renamed from: wng$a */
    public interface InterfaceC14709a {
        void flush(int i, int i2, int i3);

        void handleBuffer(ByteBuffer byteBuffer);
    }

    /* JADX INFO: renamed from: wng$b */
    public static final class C14710b implements InterfaceC14709a {

        /* JADX INFO: renamed from: j */
        public static final String f94866j = "WaveFileAudioBufferSink";

        /* JADX INFO: renamed from: k */
        public static final int f94867k = 4;

        /* JADX INFO: renamed from: l */
        public static final int f94868l = 40;

        /* JADX INFO: renamed from: m */
        public static final int f94869m = 44;

        /* JADX INFO: renamed from: a */
        public final String f94870a;

        /* JADX INFO: renamed from: b */
        public final byte[] f94871b;

        /* JADX INFO: renamed from: c */
        public final ByteBuffer f94872c;

        /* JADX INFO: renamed from: d */
        public int f94873d;

        /* JADX INFO: renamed from: e */
        public int f94874e;

        /* JADX INFO: renamed from: f */
        public int f94875f;

        /* JADX INFO: renamed from: g */
        @hib
        public RandomAccessFile f94876g;

        /* JADX INFO: renamed from: h */
        public int f94877h;

        /* JADX INFO: renamed from: i */
        public int f94878i;

        public C14710b(String str) {
            this.f94870a = str;
            byte[] bArr = new byte[1024];
            this.f94871b = bArr;
            this.f94872c = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
        }

        private String getNextOutputFileName() {
            String str = this.f94870a;
            int i = this.f94877h;
            this.f94877h = i + 1;
            return t0i.formatInvariant("%s-%04d.wav", str, Integer.valueOf(i));
        }

        private void maybePrepareFile() throws IOException {
            if (this.f94876g != null) {
                return;
            }
            RandomAccessFile randomAccessFile = new RandomAccessFile(getNextOutputFileName(), "rw");
            writeFileHeader(randomAccessFile);
            this.f94876g = randomAccessFile;
            this.f94878i = 44;
        }

        private void reset() throws IOException {
            RandomAccessFile randomAccessFile = this.f94876g;
            if (randomAccessFile == null) {
                return;
            }
            try {
                this.f94872c.clear();
                this.f94872c.putInt(this.f94878i - 8);
                randomAccessFile.seek(4L);
                randomAccessFile.write(this.f94871b, 0, 4);
                this.f94872c.clear();
                this.f94872c.putInt(this.f94878i - 44);
                randomAccessFile.seek(40L);
                randomAccessFile.write(this.f94871b, 0, 4);
            } catch (IOException e) {
                xh9.m25149w("WaveFileAudioBufferSink", "Error updating file size", e);
            }
            try {
                randomAccessFile.close();
            } finally {
                this.f94876g = null;
            }
        }

        private void writeBuffer(ByteBuffer byteBuffer) throws IOException {
            RandomAccessFile randomAccessFile = (RandomAccessFile) v80.checkNotNull(this.f94876g);
            while (byteBuffer.hasRemaining()) {
                int iMin = Math.min(byteBuffer.remaining(), this.f94871b.length);
                byteBuffer.get(this.f94871b, 0, iMin);
                randomAccessFile.write(this.f94871b, 0, iMin);
                this.f94878i += iMin;
            }
        }

        private void writeFileHeader(RandomAccessFile randomAccessFile) throws IOException {
            randomAccessFile.writeInt(1380533830);
            randomAccessFile.writeInt(-1);
            randomAccessFile.writeInt(1463899717);
            randomAccessFile.writeInt(1718449184);
            this.f94872c.clear();
            this.f94872c.putInt(16);
            this.f94872c.putShort((short) xhi.getTypeForPcmEncoding(this.f94875f));
            this.f94872c.putShort((short) this.f94874e);
            this.f94872c.putInt(this.f94873d);
            int pcmFrameSize = t0i.getPcmFrameSize(this.f94875f, this.f94874e);
            this.f94872c.putInt(this.f94873d * pcmFrameSize);
            this.f94872c.putShort((short) pcmFrameSize);
            this.f94872c.putShort((short) ((pcmFrameSize * 8) / this.f94874e));
            randomAccessFile.write(this.f94871b, 0, this.f94872c.position());
            randomAccessFile.writeInt(1684108385);
            randomAccessFile.writeInt(-1);
        }

        @Override // p000.wng.InterfaceC14709a
        public void flush(int i, int i2, int i3) {
            try {
                reset();
            } catch (IOException e) {
                xh9.m25145e("WaveFileAudioBufferSink", "Error resetting", e);
            }
            this.f94873d = i;
            this.f94874e = i2;
            this.f94875f = i3;
        }

        @Override // p000.wng.InterfaceC14709a
        public void handleBuffer(ByteBuffer byteBuffer) {
            try {
                maybePrepareFile();
                writeBuffer(byteBuffer);
            } catch (IOException e) {
                xh9.m25145e("WaveFileAudioBufferSink", "Error writing data", e);
            }
        }
    }

    public wng(InterfaceC14709a interfaceC14709a) {
        this.f94865i = (InterfaceC14709a) v80.checkNotNull(interfaceC14709a);
    }

    private void flushSinkIfActive() {
        if (isActive()) {
            InterfaceC14709a interfaceC14709a = this.f94865i;
            hf0.C6832a c6832a = this.f61732b;
            interfaceC14709a.flush(c6832a.f43350a, c6832a.f43351b, c6832a.f43352c);
        }
    }

    @Override // p000.mq0
    public hf0.C6832a onConfigure(hf0.C6832a c6832a) {
        return c6832a;
    }

    @Override // p000.mq0
    public void onFlush() {
        flushSinkIfActive();
    }

    @Override // p000.mq0
    public void onQueueEndOfStream() {
        flushSinkIfActive();
    }

    @Override // p000.mq0
    public void onReset() {
        flushSinkIfActive();
    }

    @Override // p000.hf0
    public void queueInput(ByteBuffer byteBuffer) {
        int iRemaining = byteBuffer.remaining();
        if (iRemaining == 0) {
            return;
        }
        this.f94865i.handleBuffer(t0i.createReadOnlyByteBuffer(byteBuffer));
        m17515b(iRemaining).put(byteBuffer).flip();
    }
}
