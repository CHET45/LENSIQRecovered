package p000;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
@ey1
public interface psa extends ssa {

    /* JADX INFO: renamed from: psa$a */
    public interface InterfaceC11106a extends ssa, Cloneable {
        psa build();

        psa buildPartial();

        @qp1
        InterfaceC11106a clear();

        /* JADX INFO: renamed from: clone */
        InterfaceC11106a mo27182clone();

        boolean mergeDelimitedFrom(InputStream input) throws IOException;

        boolean mergeDelimitedFrom(InputStream input, yi5 extensionRegistry) throws IOException;

        @qp1
        InterfaceC11106a mergeFrom(e72 input) throws IOException;

        @qp1
        InterfaceC11106a mergeFrom(e72 input, yi5 extensionRegistry) throws IOException;

        @qp1
        InterfaceC11106a mergeFrom(InputStream input) throws IOException;

        @qp1
        InterfaceC11106a mergeFrom(InputStream input, yi5 extensionRegistry) throws IOException;

        @qp1
        InterfaceC11106a mergeFrom(psa other);

        @qp1
        InterfaceC11106a mergeFrom(wj1 data) throws be8;

        @qp1
        InterfaceC11106a mergeFrom(wj1 data, yi5 extensionRegistry) throws be8;

        @qp1
        InterfaceC11106a mergeFrom(byte[] data) throws be8;

        @qp1
        InterfaceC11106a mergeFrom(byte[] data, int off, int len) throws be8;

        @qp1
        InterfaceC11106a mergeFrom(byte[] data, int off, int len, yi5 extensionRegistry) throws be8;

        @qp1
        InterfaceC11106a mergeFrom(byte[] data, yi5 extensionRegistry) throws be8;
    }

    vhc<? extends psa> getParserForType();

    int getSerializedSize();

    InterfaceC11106a newBuilderForType();

    InterfaceC11106a toBuilder();

    byte[] toByteArray();

    wj1 toByteString();

    void writeDelimitedTo(OutputStream output) throws IOException;

    void writeTo(i72 output) throws IOException;

    void writeTo(OutputStream output) throws IOException;
}
