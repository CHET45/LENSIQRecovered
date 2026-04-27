package p000;

import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import okhttp3.internal.p017ws.WebSocketProtocol;
import p000.gy4;

/* JADX INFO: loaded from: classes4.dex */
public class jy4 implements Closeable, gy4 {

    /* JADX INFO: renamed from: a */
    public final int f52227a = 1179403647;

    /* JADX INFO: renamed from: b */
    public final FileChannel f52228b;

    public jy4(final File file) throws FileNotFoundException {
        if (file == null || !file.exists()) {
            throw new IllegalArgumentException("File is null or does not exist");
        }
        this.f52228b = new FileInputStream(file).getChannel();
    }

    private long offsetFromVma(final gy4.AbstractC6647b header, final long numEntries, final long vma) throws IOException {
        for (long j = 0; j < numEntries; j++) {
            gy4.AbstractC6648c programHeader = header.getProgramHeader(j);
            if (programHeader.f41803a == 1) {
                long j2 = programHeader.f41805c;
                if (j2 <= vma && vma <= programHeader.f41806d + j2) {
                    return (vma - j2) + programHeader.f41804b;
                }
            }
        }
        throw new IllegalStateException("Could not map vma to file offset!");
    }

    /* JADX INFO: renamed from: a */
    public void m14377a(final ByteBuffer buffer, long offset, final int length) throws IOException {
        buffer.position(0);
        buffer.limit(length);
        long j = 0;
        while (j < length) {
            int i = this.f52228b.read(buffer, offset + j);
            if (i == -1) {
                throw new EOFException();
            }
            j += (long) i;
        }
        buffer.position(0);
    }

    /* JADX INFO: renamed from: b */
    public short m14378b(final ByteBuffer buffer, final long offset) throws IOException {
        m14377a(buffer, offset, 1);
        return (short) (buffer.get() & 255);
    }

    /* JADX INFO: renamed from: c */
    public int m14379c(final ByteBuffer buffer, final long offset) throws IOException {
        m14377a(buffer, offset, 2);
        return buffer.getShort() & iqh.f48007d;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f52228b.close();
    }

    /* JADX INFO: renamed from: d */
    public long m14380d(final ByteBuffer buffer, final long offset) throws IOException {
        m14377a(buffer, offset, 8);
        return buffer.getLong();
    }

    /* JADX INFO: renamed from: e */
    public String m14381e(final ByteBuffer buffer, long offset) throws IOException {
        StringBuilder sb = new StringBuilder();
        while (true) {
            long j = 1 + offset;
            short sM14378b = m14378b(buffer, offset);
            if (sM14378b == 0) {
                return sb.toString();
            }
            sb.append((char) sM14378b);
            offset = j;
        }
    }

    /* JADX INFO: renamed from: f */
    public long m14382f(final ByteBuffer buffer, final long offset) throws IOException {
        m14377a(buffer, offset, 4);
        return ((long) buffer.getInt()) & 4294967295L;
    }

    public gy4.AbstractC6647b parseHeader() throws IOException {
        this.f52228b.position(0L);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        if (m14382f(byteBufferAllocate, 0L) != 1179403647) {
            throw new IllegalArgumentException("Invalid ELF Magic!");
        }
        short sM14378b = m14378b(byteBufferAllocate, 4L);
        boolean z = m14378b(byteBufferAllocate, 5L) == 2;
        if (sM14378b == 1) {
            return new hy4(z, this);
        }
        if (sM14378b == 2) {
            return new iy4(z, this);
        }
        throw new IllegalStateException("Invalid class type!");
    }

    public List<String> parseNeededDependencies() throws IOException {
        long j;
        gy4.AbstractC6646a dynamicStructure;
        this.f52228b.position(0L);
        ArrayList arrayList = new ArrayList();
        gy4.AbstractC6647b header = parseHeader();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.order(header.f41792a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j2 = header.f41797f;
        int i = 0;
        if (j2 == WebSocketProtocol.PAYLOAD_SHORT_MAX) {
            j2 = header.getSectionHeader(0).f41807a;
        }
        long j3 = 0;
        while (true) {
            if (j3 >= j2) {
                j = 0;
                break;
            }
            gy4.AbstractC6648c programHeader = header.getProgramHeader(j3);
            if (programHeader.f41803a == 2) {
                j = programHeader.f41804b;
                break;
            }
            j3++;
        }
        if (j == 0) {
            return Collections.unmodifiableList(arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        long j4 = 0;
        do {
            dynamicStructure = header.getDynamicStructure(j, i);
            long j5 = dynamicStructure.f41787a;
            if (j5 == 1) {
                arrayList2.add(Long.valueOf(dynamicStructure.f41788b));
            } else if (j5 == 5) {
                j4 = dynamicStructure.f41788b;
            }
            i++;
        } while (dynamicStructure.f41787a != 0);
        if (j4 == 0) {
            throw new IllegalStateException("String table offset not found!");
        }
        long jOffsetFromVma = offsetFromVma(header, j2, j4);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList.add(m14381e(byteBufferAllocate, ((Long) it.next()).longValue() + jOffsetFromVma));
        }
        return arrayList;
    }
}
