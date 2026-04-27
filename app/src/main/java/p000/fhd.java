package p000;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes7.dex */
public final class fhd extends InputStream implements xo4, ss8 {

    /* JADX INFO: renamed from: a */
    @eib
    public qsa f36602a;

    /* JADX INFO: renamed from: b */
    public final uhc<?> f36603b;

    /* JADX INFO: renamed from: c */
    @eib
    public ByteArrayInputStream f36604c;

    public fhd(qsa qsaVar, uhc<?> uhcVar) {
        this.f36602a = qsaVar;
        this.f36603b = uhcVar;
    }

    /* JADX INFO: renamed from: a */
    public qsa m10905a() {
        qsa qsaVar = this.f36602a;
        if (qsaVar != null) {
            return qsaVar;
        }
        throw new IllegalStateException("message not available");
    }

    @Override // java.io.InputStream, p000.ss8
    public int available() {
        qsa qsaVar = this.f36602a;
        if (qsaVar != null) {
            return qsaVar.getSerializedSize();
        }
        ByteArrayInputStream byteArrayInputStream = this.f36604c;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.available();
        }
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public uhc<?> m10906b() {
        return this.f36603b;
    }

    @Override // p000.xo4
    public int drainTo(OutputStream outputStream) throws IOException {
        qsa qsaVar = this.f36602a;
        if (qsaVar != null) {
            int serializedSize = qsaVar.getSerializedSize();
            this.f36602a.writeTo(outputStream);
            this.f36602a = null;
            return serializedSize;
        }
        ByteArrayInputStream byteArrayInputStream = this.f36604c;
        if (byteArrayInputStream == null) {
            return 0;
        }
        int iM11687a = (int) ghd.m11687a(byteArrayInputStream, outputStream);
        this.f36604c = null;
        return iM11687a;
    }

    @Override // java.io.InputStream
    public int read() {
        if (this.f36602a != null) {
            this.f36604c = new ByteArrayInputStream(this.f36602a.toByteArray());
            this.f36602a = null;
        }
        ByteArrayInputStream byteArrayInputStream = this.f36604c;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.read();
        }
        return -1;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        qsa qsaVar = this.f36602a;
        if (qsaVar != null) {
            int serializedSize = qsaVar.getSerializedSize();
            if (serializedSize == 0) {
                this.f36602a = null;
                this.f36604c = null;
                return -1;
            }
            if (i2 >= serializedSize) {
                j72 j72VarNewInstance = j72.newInstance(bArr, i, serializedSize);
                this.f36602a.writeTo(j72VarNewInstance);
                j72VarNewInstance.flush();
                j72VarNewInstance.checkNoSpaceLeft();
                this.f36602a = null;
                this.f36604c = null;
                return serializedSize;
            }
            this.f36604c = new ByteArrayInputStream(this.f36602a.toByteArray());
            this.f36602a = null;
        }
        ByteArrayInputStream byteArrayInputStream = this.f36604c;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.read(bArr, i, i2);
        }
        return -1;
    }
}
