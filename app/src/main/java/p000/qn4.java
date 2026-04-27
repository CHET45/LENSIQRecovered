package p000;

import com.blankj.utilcode.util.C2473f;
import com.eyevue.glassapp.bluetooth.ota.OtaConstant;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes8.dex */
public abstract class qn4 {

    /* JADX INFO: renamed from: a */
    public kae f74997a = null;

    /* JADX INFO: renamed from: b */
    public o5c f74998b = null;

    public static ByteBuffer readLine(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining());
        byte b = 48;
        while (byteBuffer.hasRemaining()) {
            byte b2 = byteBuffer.get();
            byteBufferAllocate.put(b2);
            if (b == 13 && b2 == 10) {
                byteBufferAllocate.limit(byteBufferAllocate.position() - 2);
                byteBufferAllocate.position(0);
                return byteBufferAllocate;
            }
            b = b2;
        }
        byteBuffer.position(byteBuffer.position() - byteBufferAllocate.position());
        return null;
    }

    public static String readStringLine(ByteBuffer byteBuffer) {
        ByteBuffer line = readLine(byteBuffer);
        if (line == null) {
            return null;
        }
        return ww1.stringAscii(line.array(), 0, line.limit());
    }

    public static qe7 translateHandshakeHttp(ByteBuffer byteBuffer, kae kaeVar) throws yd8 {
        String stringLine = readStringLine(byteBuffer);
        if (stringLine == null) {
            throw new kz7(byteBuffer.capacity() + 128);
        }
        String[] strArrSplit = stringLine.split(C2473f.f17566z, 3);
        if (strArrSplit.length != 3) {
            throw new yd8();
        }
        qe7 qe7VarTranslateHandshakeHttpClient = kaeVar == kae.CLIENT ? translateHandshakeHttpClient(strArrSplit, stringLine) : translateHandshakeHttpServer(strArrSplit, stringLine);
        String stringLine2 = readStringLine(byteBuffer);
        while (stringLine2 != null && stringLine2.length() > 0) {
            String[] strArrSplit2 = stringLine2.split(g1i.f38277c, 2);
            if (strArrSplit2.length != 2) {
                throw new yd8("not an http header");
            }
            if (qe7VarTranslateHandshakeHttpClient.hasFieldValue(strArrSplit2[0])) {
                qe7VarTranslateHandshakeHttpClient.put(strArrSplit2[0], qe7VarTranslateHandshakeHttpClient.getFieldValue(strArrSplit2[0]) + "; " + strArrSplit2[1].replaceFirst("^ +", ""));
            } else {
                qe7VarTranslateHandshakeHttpClient.put(strArrSplit2[0], strArrSplit2[1].replaceFirst("^ +", ""));
            }
            stringLine2 = readStringLine(byteBuffer);
        }
        if (stringLine2 != null) {
            return qe7VarTranslateHandshakeHttpClient;
        }
        throw new kz7();
    }

    private static qe7 translateHandshakeHttpClient(String[] strArr, String str) throws yd8 {
        if (!"101".equals(strArr[1])) {
            throw new yd8(String.format("Invalid status code received: %s Status line: %s", strArr[1], str));
        }
        if (!"HTTP/1.1".equalsIgnoreCase(strArr[0])) {
            throw new yd8(String.format("Invalid status line received: %s Status line: %s", strArr[0], str));
        }
        se7 se7Var = new se7();
        se7Var.setHttpStatus(Short.parseShort(strArr[1]));
        se7Var.setHttpStatusMessage(strArr[2]);
        return se7Var;
    }

    private static qe7 translateHandshakeHttpServer(String[] strArr, String str) throws yd8 {
        if (!"GET".equalsIgnoreCase(strArr[0])) {
            throw new yd8(String.format("Invalid request method received: %s Status line: %s", strArr[0], str));
        }
        if (!"HTTP/1.1".equalsIgnoreCase(strArr[2])) {
            throw new yd8(String.format("Invalid status line received: %s Status line: %s", strArr[2], str));
        }
        re7 re7Var = new re7();
        re7Var.setResourceDescriptor(strArr[1]);
        return re7Var;
    }

    /* JADX INFO: renamed from: a */
    public boolean m20460a(ue7 ue7Var) {
        return ue7Var.getFieldValue("Upgrade").equalsIgnoreCase("websocket") && ue7Var.getFieldValue("Connection").toLowerCase(Locale.ENGLISH).contains(OtaConstant.DIR_UPGRADE);
    }

    public abstract te7 acceptHandshakeAsClient(z32 z32Var, f3f f3fVar) throws yd8;

    public abstract te7 acceptHandshakeAsServer(z32 z32Var) throws yd8;

    /* JADX INFO: renamed from: b */
    public int m20461b(ue7 ue7Var) {
        String fieldValue = ue7Var.getFieldValue(go7.f40519a2);
        if (fieldValue.length() > 0) {
            try {
                return new Integer(fieldValue.trim()).intValue();
            } catch (NumberFormatException unused) {
            }
        }
        return -1;
    }

    public int checkAlloc(int i) throws ud8 {
        if (i >= 0) {
            return i;
        }
        throw new ud8(1002, "Negative count");
    }

    public List<nv6> continuousFrame(o5c o5cVar, ByteBuffer byteBuffer, boolean z) {
        ov6 b21Var;
        o5c o5cVar2 = o5c.BINARY;
        if (o5cVar != o5cVar2 && o5cVar != o5c.TEXT) {
            throw new IllegalArgumentException("Only Opcode.BINARY or  Opcode.TEXT are allowed");
        }
        if (this.f74998b != null) {
            b21Var = new hz2();
        } else {
            this.f74998b = o5cVar;
            b21Var = o5cVar == o5cVar2 ? new b21() : o5cVar == o5c.TEXT ? new etg() : null;
        }
        b21Var.setPayload(byteBuffer);
        b21Var.setFin(z);
        try {
            b21Var.isValid();
            if (z) {
                this.f74998b = null;
            } else {
                this.f74998b = o5cVar;
            }
            return Collections.singletonList(b21Var);
        } catch (ud8 e) {
            throw new IllegalArgumentException(e);
        }
    }

    public abstract qn4 copyInstance();

    public abstract ByteBuffer createBinaryFrame(nv6 nv6Var);

    public abstract List<nv6> createFrames(String str, boolean z);

    public abstract List<nv6> createFrames(ByteBuffer byteBuffer, boolean z);

    @Deprecated
    public List<ByteBuffer> createHandshake(ue7 ue7Var, kae kaeVar) {
        return createHandshake(ue7Var);
    }

    public abstract m52 getCloseHandshakeType();

    public kae getRole() {
        return this.f74997a;
    }

    public abstract a42 postProcessHandshakeRequestAsClient(a42 a42Var) throws yd8;

    public abstract qe7 postProcessHandshakeResponseAsServer(z32 z32Var, g3f g3fVar) throws yd8;

    public abstract void processFrame(mii miiVar, nv6 nv6Var) throws ud8;

    public abstract void reset();

    public void setParseMode(kae kaeVar) {
        this.f74997a = kaeVar;
    }

    public String toString() {
        return getClass().getSimpleName();
    }

    public abstract List<nv6> translateFrame(ByteBuffer byteBuffer) throws ud8;

    public ue7 translateHandshake(ByteBuffer byteBuffer) throws yd8 {
        return translateHandshakeHttp(byteBuffer, this.f74997a);
    }

    public List<ByteBuffer> createHandshake(ue7 ue7Var) {
        return createHandshake(ue7Var, true);
    }

    @Deprecated
    public List<ByteBuffer> createHandshake(ue7 ue7Var, kae kaeVar, boolean z) {
        return createHandshake(ue7Var, z);
    }

    public List<ByteBuffer> createHandshake(ue7 ue7Var, boolean z) {
        StringBuilder sb = new StringBuilder(100);
        if (ue7Var instanceof z32) {
            sb.append("GET ");
            sb.append(((z32) ue7Var).getResourceDescriptor());
            sb.append(" HTTP/1.1");
        } else if (ue7Var instanceof f3f) {
            sb.append("HTTP/1.1 101 ");
            sb.append(((f3f) ue7Var).getHttpStatusMessage());
        } else {
            throw new IllegalArgumentException("unknown role");
        }
        sb.append("\r\n");
        Iterator<String> itIterateHttpFields = ue7Var.iterateHttpFields();
        while (itIterateHttpFields.hasNext()) {
            String next = itIterateHttpFields.next();
            String fieldValue = ue7Var.getFieldValue(next);
            sb.append(next);
            sb.append(": ");
            sb.append(fieldValue);
            sb.append("\r\n");
        }
        sb.append("\r\n");
        byte[] bArrAsciiBytes = ww1.asciiBytes(sb.toString());
        byte[] content = z ? ue7Var.getContent() : null;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate((content == null ? 0 : content.length) + bArrAsciiBytes.length);
        byteBufferAllocate.put(bArrAsciiBytes);
        if (content != null) {
            byteBufferAllocate.put(content);
        }
        byteBufferAllocate.flip();
        return Collections.singletonList(byteBufferAllocate);
    }
}
