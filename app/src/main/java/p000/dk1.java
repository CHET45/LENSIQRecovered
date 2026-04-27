package p000;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;
import p000.z33;

/* JADX INFO: loaded from: classes5.dex */
public class dk1 implements p9b {

    /* JADX INFO: renamed from: a */
    @hib
    public final byte[] f29858a;

    /* JADX INFO: renamed from: b */
    @efb
    public final String f29859b;

    /* JADX INFO: renamed from: c */
    @efb
    public final String f29860c;

    public dk1(@efb String str, @efb String str2, @hib byte[] bArr) {
        this.f29859b = str;
        this.f29860c = str2;
        this.f29858a = bArr;
    }

    @hib
    private byte[] asGzippedBytes() {
        if (isEmpty()) {
            return null;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                try {
                    gZIPOutputStream.write(this.f29858a);
                    gZIPOutputStream.finish();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    gZIPOutputStream.close();
                    byteArrayOutputStream.close();
                    return byteArray;
                } finally {
                }
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }

    private boolean isEmpty() {
        byte[] bArr = this.f29858a;
        return bArr == null || bArr.length == 0;
    }

    @Override // p000.p9b
    @hib
    public z33.AbstractC15964e.b asFilePayload() {
        byte[] bArrAsGzippedBytes = asGzippedBytes();
        if (bArrAsGzippedBytes == null) {
            return null;
        }
        return z33.AbstractC15964e.b.builder().setContents(bArrAsGzippedBytes).setFilename(this.f29859b).build();
    }

    @Override // p000.p9b
    @efb
    public String getReportsEndpointFilename() {
        return this.f29860c;
    }

    @Override // p000.p9b
    @hib
    public InputStream getStream() {
        if (isEmpty()) {
            return null;
        }
        return new ByteArrayInputStream(this.f29858a);
    }
}
