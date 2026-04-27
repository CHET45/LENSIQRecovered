package p000;

import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public abstract class nj1 {
    public abstract void write(byte value) throws IOException;

    public abstract void write(ByteBuffer value) throws IOException;

    public abstract void write(byte[] value, int offset, int length) throws IOException;

    public abstract void writeLazy(ByteBuffer value) throws IOException;

    public abstract void writeLazy(byte[] value, int offset, int length) throws IOException;
}
