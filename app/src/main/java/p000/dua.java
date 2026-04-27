package p000;

import android.content.res.AssetManager;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@c5e(19)
@f00
@p7e({p7e.EnumC10826a.f69934a})
public class dua {

    /* JADX INFO: renamed from: a */
    public static final int f30884a = 1164798569;

    /* JADX INFO: renamed from: b */
    public static final int f30885b = 1701669481;

    /* JADX INFO: renamed from: c */
    public static final int f30886c = 1835365473;

    /* JADX INFO: renamed from: dua$a */
    public static class C4951a implements InterfaceC4954d {

        /* JADX INFO: renamed from: c */
        @efb
        public final ByteBuffer f30887c;

        public C4951a(@efb ByteBuffer byteBuffer) {
            this.f30887c = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // p000.dua.InterfaceC4954d
        public long getPosition() {
            return this.f30887c.position();
        }

        @Override // p000.dua.InterfaceC4954d
        public int readTag() throws IOException {
            return this.f30887c.getInt();
        }

        @Override // p000.dua.InterfaceC4954d
        public long readUnsignedInt() throws IOException {
            return dua.m9375d(this.f30887c.getInt());
        }

        @Override // p000.dua.InterfaceC4954d
        public int readUnsignedShort() throws IOException {
            return dua.m9376e(this.f30887c.getShort());
        }

        @Override // p000.dua.InterfaceC4954d
        public void skip(int i) throws IOException {
            ByteBuffer byteBuffer = this.f30887c;
            byteBuffer.position(byteBuffer.position() + i);
        }
    }

    /* JADX INFO: renamed from: dua$b */
    public static class C4952b implements InterfaceC4954d {

        /* JADX INFO: renamed from: c */
        @efb
        public final byte[] f30888c;

        /* JADX INFO: renamed from: d */
        @efb
        public final ByteBuffer f30889d;

        /* JADX INFO: renamed from: e */
        @efb
        public final InputStream f30890e;

        /* JADX INFO: renamed from: f */
        public long f30891f = 0;

        public C4952b(@efb InputStream inputStream) {
            this.f30890e = inputStream;
            byte[] bArr = new byte[4];
            this.f30888c = bArr;
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            this.f30889d = byteBufferWrap;
            byteBufferWrap.order(ByteOrder.BIG_ENDIAN);
        }

        private void read(@h78(from = 0, m12174to = 4) int i) throws IOException {
            if (this.f30890e.read(this.f30888c, 0, i) != i) {
                throw new IOException("read failed");
            }
            this.f30891f += (long) i;
        }

        @Override // p000.dua.InterfaceC4954d
        public long getPosition() {
            return this.f30891f;
        }

        @Override // p000.dua.InterfaceC4954d
        public int readTag() throws IOException {
            this.f30889d.position(0);
            read(4);
            return this.f30889d.getInt();
        }

        @Override // p000.dua.InterfaceC4954d
        public long readUnsignedInt() throws IOException {
            this.f30889d.position(0);
            read(4);
            return dua.m9375d(this.f30889d.getInt());
        }

        @Override // p000.dua.InterfaceC4954d
        public int readUnsignedShort() throws IOException {
            this.f30889d.position(0);
            read(2);
            return dua.m9376e(this.f30889d.getShort());
        }

        @Override // p000.dua.InterfaceC4954d
        public void skip(int i) throws IOException {
            while (i > 0) {
                int iSkip = (int) this.f30890e.skip(i);
                if (iSkip < 1) {
                    throw new IOException("Skip didn't move at least 1 byte forward");
                }
                i -= iSkip;
                this.f30891f += (long) iSkip;
            }
        }
    }

    /* JADX INFO: renamed from: dua$c */
    public static class C4953c {

        /* JADX INFO: renamed from: a */
        public final long f30892a;

        /* JADX INFO: renamed from: b */
        public final long f30893b;

        public C4953c(long j, long j2) {
            this.f30892a = j;
            this.f30893b = j2;
        }

        /* JADX INFO: renamed from: a */
        public long m9377a() {
            return this.f30893b;
        }

        /* JADX INFO: renamed from: b */
        public long m9378b() {
            return this.f30892a;
        }
    }

    /* JADX INFO: renamed from: dua$d */
    public interface InterfaceC4954d {

        /* JADX INFO: renamed from: a */
        public static final int f30894a = 2;

        /* JADX INFO: renamed from: b */
        public static final int f30895b = 4;

        long getPosition();

        int readTag() throws IOException;

        long readUnsignedInt() throws IOException;

        int readUnsignedShort() throws IOException;

        void skip(int i) throws IOException;
    }

    private dua() {
    }

    /* JADX INFO: renamed from: a */
    public static cua m9372a(AssetManager assetManager, String str) throws IOException {
        InputStream inputStreamOpen = assetManager.open(str);
        try {
            cua cuaVarM9373b = m9373b(inputStreamOpen);
            if (inputStreamOpen != null) {
                inputStreamOpen.close();
            }
            return cuaVarM9373b;
        } catch (Throwable th) {
            if (inputStreamOpen != null) {
                try {
                    inputStreamOpen.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public static cua m9373b(InputStream inputStream) throws IOException {
        C4952b c4952b = new C4952b(inputStream);
        C4953c c4953cFindOffsetInfo = findOffsetInfo(c4952b);
        c4952b.skip((int) (c4953cFindOffsetInfo.m9378b() - c4952b.getPosition()));
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate((int) c4953cFindOffsetInfo.m9377a());
        int i = inputStream.read(byteBufferAllocate.array());
        if (i == c4953cFindOffsetInfo.m9377a()) {
            return cua.getRootAsMetadataList(byteBufferAllocate);
        }
        throw new IOException("Needed " + c4953cFindOffsetInfo.m9377a() + " bytes, got " + i);
    }

    /* JADX INFO: renamed from: c */
    public static cua m9374c(ByteBuffer byteBuffer) throws IOException {
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.position((int) findOffsetInfo(new C4951a(byteBufferDuplicate)).m9378b());
        return cua.getRootAsMetadataList(byteBufferDuplicate);
    }

    /* JADX INFO: renamed from: d */
    public static long m9375d(int i) {
        return ((long) i) & 4294967295L;
    }

    /* JADX INFO: renamed from: e */
    public static int m9376e(short s) {
        return s & iqh.f48007d;
    }

    private static C4953c findOffsetInfo(InterfaceC4954d interfaceC4954d) throws IOException {
        long unsignedInt;
        interfaceC4954d.skip(4);
        int unsignedShort = interfaceC4954d.readUnsignedShort();
        if (unsignedShort > 100) {
            throw new IOException("Cannot read metadata.");
        }
        interfaceC4954d.skip(6);
        int i = 0;
        while (true) {
            if (i >= unsignedShort) {
                unsignedInt = -1;
                break;
            }
            int tag = interfaceC4954d.readTag();
            interfaceC4954d.skip(4);
            unsignedInt = interfaceC4954d.readUnsignedInt();
            interfaceC4954d.skip(4);
            if (1835365473 == tag) {
                break;
            }
            i++;
        }
        if (unsignedInt != -1) {
            interfaceC4954d.skip((int) (unsignedInt - interfaceC4954d.getPosition()));
            interfaceC4954d.skip(12);
            long unsignedInt2 = interfaceC4954d.readUnsignedInt();
            for (int i2 = 0; i2 < unsignedInt2; i2++) {
                int tag2 = interfaceC4954d.readTag();
                long unsignedInt3 = interfaceC4954d.readUnsignedInt();
                long unsignedInt4 = interfaceC4954d.readUnsignedInt();
                if (1164798569 == tag2 || 1701669481 == tag2) {
                    return new C4953c(unsignedInt3 + unsignedInt, unsignedInt4);
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }
}
