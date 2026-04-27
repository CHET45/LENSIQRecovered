package p000;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes4.dex */
@ay1
public interface qsa extends rsa {

    /* JADX INFO: renamed from: qsa$a */
    public interface InterfaceC11668a extends rsa, Cloneable {
        qsa build();

        qsa buildPartial();

        @pp1
        InterfaceC11668a clear();

        /* JADX INFO: renamed from: clone */
        InterfaceC11668a mo27946clone();

        boolean mergeDelimitedFrom(InputStream input) throws IOException;

        boolean mergeDelimitedFrom(InputStream input, zi5 extensionRegistry) throws IOException;

        @pp1
        InterfaceC11668a mergeFrom(f72 input) throws IOException;

        @pp1
        InterfaceC11668a mergeFrom(f72 input, zi5 extensionRegistry) throws IOException;

        @pp1
        InterfaceC11668a mergeFrom(InputStream input) throws IOException;

        @pp1
        InterfaceC11668a mergeFrom(InputStream input, zi5 extensionRegistry) throws IOException;

        @pp1
        InterfaceC11668a mergeFrom(qsa other);

        @pp1
        InterfaceC11668a mergeFrom(vj1 data) throws ce8;

        @pp1
        InterfaceC11668a mergeFrom(vj1 data, zi5 extensionRegistry) throws ce8;

        @pp1
        InterfaceC11668a mergeFrom(byte[] data) throws ce8;

        @pp1
        InterfaceC11668a mergeFrom(byte[] data, int off, int len) throws ce8;

        @pp1
        InterfaceC11668a mergeFrom(byte[] data, int off, int len, zi5 extensionRegistry) throws ce8;

        @pp1
        InterfaceC11668a mergeFrom(byte[] data, zi5 extensionRegistry) throws ce8;
    }

    uhc<? extends qsa> getParserForType();

    int getSerializedSize();

    InterfaceC11668a newBuilderForType();

    InterfaceC11668a toBuilder();

    byte[] toByteArray();

    vj1 toByteString();

    void writeDelimitedTo(OutputStream output) throws IOException;

    void writeTo(j72 output) throws IOException;

    void writeTo(OutputStream output) throws IOException;
}
