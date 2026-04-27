package p000;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes8.dex */
public interface nv6 {
    void append(nv6 nv6Var);

    o5c getOpcode();

    ByteBuffer getPayloadData();

    boolean getTransfereMasked();

    boolean isFin();

    boolean isRSV1();

    boolean isRSV2();

    boolean isRSV3();
}
