package p000;

import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes8.dex */
public class lnc extends fo2 {

    /* JADX INFO: renamed from: f */
    public static final String f58312f = "permessage-deflate";

    /* JADX INFO: renamed from: g */
    public static final String f58313g = "server_no_context_takeover";

    /* JADX INFO: renamed from: h */
    public static final String f58314h = "client_no_context_takeover";

    /* JADX INFO: renamed from: i */
    public static final String f58315i = "server_max_window_bits";

    /* JADX INFO: renamed from: j */
    public static final String f58316j = "client_max_window_bits";

    /* JADX INFO: renamed from: k */
    public static final int f58317k = 32768;

    /* JADX INFO: renamed from: l */
    public static final int f58318l = 32768;

    /* JADX INFO: renamed from: m */
    public static final byte[] f58319m = {0, 0, -1, -1};

    /* JADX INFO: renamed from: n */
    public static final int f58320n = 1024;

    /* JADX INFO: renamed from: a */
    public boolean f58321a = true;

    /* JADX INFO: renamed from: b */
    public boolean f58322b = false;

    /* JADX INFO: renamed from: c */
    public Map<String, String> f58323c = new LinkedHashMap();

    /* JADX INFO: renamed from: d */
    public Inflater f58324d = new Inflater(true);

    /* JADX INFO: renamed from: e */
    public Deflater f58325e = new Deflater(-1, true);

    private void decompress(byte[] bArr, ByteArrayOutputStream byteArrayOutputStream) throws DataFormatException {
        this.f58324d.setInput(bArr);
        byte[] bArr2 = new byte[1024];
        while (true) {
            int iInflate = this.f58324d.inflate(bArr2);
            if (iInflate <= 0) {
                return;
            } else {
                byteArrayOutputStream.write(bArr2, 0, iInflate);
            }
        }
    }

    private boolean endsWithTail(byte[] bArr) {
        if (bArr.length < 4) {
            return false;
        }
        int length = bArr.length;
        int i = 0;
        while (true) {
            byte[] bArr2 = f58319m;
            if (i >= bArr2.length) {
                return true;
            }
            if (bArr2[i] != bArr[(length - bArr2.length) + i]) {
                return false;
            }
            i++;
        }
    }

    @Override // p000.vu3, p000.up7
    public boolean acceptProvidedExtensionAsClient(String str) {
        for (String str2 : str.split(",")) {
            aj5 extensionRequest = aj5.parseExtensionRequest(str2);
            if (f58312f.equalsIgnoreCase(extensionRequest.getExtensionName())) {
                extensionRequest.getExtensionParameters();
                return true;
            }
        }
        return false;
    }

    @Override // p000.vu3, p000.up7
    public boolean acceptProvidedExtensionAsServer(String str) {
        for (String str2 : str.split(",")) {
            aj5 extensionRequest = aj5.parseExtensionRequest(str2);
            if (f58312f.equalsIgnoreCase(extensionRequest.getExtensionName())) {
                this.f58323c.putAll(extensionRequest.getExtensionParameters());
                if (this.f58323c.containsKey(f58314h)) {
                    this.f58322b = true;
                }
                return true;
            }
        }
        return false;
    }

    @Override // p000.vu3, p000.up7
    public up7 copyInstance() {
        return new lnc();
    }

    @Override // p000.vu3, p000.up7
    public void decodeFrame(nv6 nv6Var) throws ud8 {
        if (nv6Var instanceof dg3) {
            if (nv6Var.getOpcode() == o5c.CONTINUOUS && nv6Var.isRSV1()) {
                throw new ud8(1008, "RSV1 bit can only be set for the first frame.");
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                decompress(nv6Var.getPayloadData().array(), byteArrayOutputStream);
                if (this.f58324d.getRemaining() > 0) {
                    this.f58324d = new Inflater(true);
                    decompress(nv6Var.getPayloadData().array(), byteArrayOutputStream);
                }
                if (nv6Var.isFin()) {
                    decompress(f58319m, byteArrayOutputStream);
                    if (this.f58322b) {
                        this.f58324d = new Inflater(true);
                    }
                }
                if (nv6Var.isRSV1()) {
                    ((dg3) nv6Var).setRSV1(false);
                }
                ((ov6) nv6Var).setPayload(ByteBuffer.wrap(byteArrayOutputStream.toByteArray(), 0, byteArrayOutputStream.size()));
            } catch (DataFormatException e) {
                throw new ud8(1008, e.getMessage());
            }
        }
    }

    @Override // p000.vu3, p000.up7
    public void encodeFrame(nv6 nv6Var) {
        if (nv6Var instanceof dg3) {
            if (!(nv6Var instanceof hz2)) {
                ((dg3) nv6Var).setRSV1(true);
            }
            this.f58325e.setInput(nv6Var.getPayloadData().array());
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                int iDeflate = this.f58325e.deflate(bArr, 0, 1024, 2);
                if (iDeflate <= 0) {
                    break;
                } else {
                    byteArrayOutputStream.write(bArr, 0, iDeflate);
                }
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            int length = byteArray.length;
            if (nv6Var.isFin()) {
                if (endsWithTail(byteArray)) {
                    length -= f58319m.length;
                }
                if (this.f58321a) {
                    this.f58325e.end();
                    this.f58325e = new Deflater(-1, true);
                }
            }
            ((ov6) nv6Var).setPayload(ByteBuffer.wrap(byteArray, 0, length));
        }
    }

    @Override // p000.vu3, p000.up7
    public String getProvidedExtensionAsClient() {
        this.f58323c.put(f58314h, aj5.f1737c);
        this.f58323c.put(f58313g, aj5.f1737c);
        return "permessage-deflate; server_no_context_takeover; client_no_context_takeover";
    }

    @Override // p000.vu3, p000.up7
    public String getProvidedExtensionAsServer() {
        StringBuilder sb = new StringBuilder();
        sb.append("permessage-deflate; server_no_context_takeover");
        sb.append(this.f58322b ? "; client_no_context_takeover" : "");
        return sb.toString();
    }

    @Override // p000.fo2, p000.vu3, p000.up7
    public void isFrameValid(nv6 nv6Var) throws ud8 {
        if (((nv6Var instanceof etg) || (nv6Var instanceof b21)) && !nv6Var.isRSV1()) {
            throw new xd8("RSV1 bit must be set for DataFrames.");
        }
        if (!(nv6Var instanceof hz2) || (!nv6Var.isRSV1() && !nv6Var.isRSV2() && !nv6Var.isRSV3())) {
            super.isFrameValid(nv6Var);
            return;
        }
        throw new xd8("bad rsv RSV1: " + nv6Var.isRSV1() + " RSV2: " + nv6Var.isRSV2() + " RSV3: " + nv6Var.isRSV3());
    }

    @Override // p000.vu3, p000.up7
    public String toString() {
        return "PerMessageDeflateExtension";
    }
}
