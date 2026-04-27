package p000;

import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.TimeZone;
import okhttp3.internal.p017ws.WebSocketProtocol;
import org.tensorflow.lite.schema.BuiltinOptions;

/* JADX INFO: loaded from: classes8.dex */
public class rn4 extends qn4 {

    /* JADX INFO: renamed from: m */
    public static final String f78770m = "Sec-WebSocket-Key";

    /* JADX INFO: renamed from: n */
    public static final String f78771n = "Sec-WebSocket-Protocol";

    /* JADX INFO: renamed from: o */
    public static final String f78772o = "Sec-WebSocket-Extensions";

    /* JADX INFO: renamed from: p */
    public static final String f78773p = "Sec-WebSocket-Accept";

    /* JADX INFO: renamed from: q */
    public static final String f78774q = "Upgrade";

    /* JADX INFO: renamed from: r */
    public static final String f78775r = "Connection";

    /* JADX INFO: renamed from: s */
    public static final /* synthetic */ boolean f78776s = false;

    /* JADX INFO: renamed from: c */
    public final jj9 f78777c;

    /* JADX INFO: renamed from: d */
    public up7 f78778d;

    /* JADX INFO: renamed from: e */
    public List<up7> f78779e;

    /* JADX INFO: renamed from: f */
    public fq7 f78780f;

    /* JADX INFO: renamed from: g */
    public List<fq7> f78781g;

    /* JADX INFO: renamed from: h */
    public nv6 f78782h;

    /* JADX INFO: renamed from: i */
    public final List<ByteBuffer> f78783i;

    /* JADX INFO: renamed from: j */
    public ByteBuffer f78784j;

    /* JADX INFO: renamed from: k */
    public final Random f78785k;

    /* JADX INFO: renamed from: l */
    public int f78786l;

    /* JADX INFO: renamed from: rn4$a */
    public class C12166a {

        /* JADX INFO: renamed from: a */
        public int f78787a;

        /* JADX INFO: renamed from: b */
        public int f78788b;

        public C12166a(int i, int i2) {
            this.f78787a = i;
            this.f78788b = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int getPayloadLength() {
            return this.f78787a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int getRealPackageSize() {
            return this.f78788b;
        }
    }

    public rn4() {
        this((List<up7>) Collections.emptyList());
    }

    private void addToBufferList(ByteBuffer byteBuffer) {
        synchronized (this.f78783i) {
            this.f78783i.add(byteBuffer);
        }
    }

    private void checkBufferLimit() throws t59 {
        long byteBufferListSize = getByteBufferListSize();
        if (byteBufferListSize <= this.f78786l) {
            return;
        }
        clearBufferList();
        this.f78777c.trace("Payload limit reached. Allowed: {} Current: {}", Integer.valueOf(this.f78786l), Long.valueOf(byteBufferListSize));
        throw new t59(this.f78786l);
    }

    private void clearBufferList() {
        synchronized (this.f78783i) {
            this.f78783i.clear();
        }
    }

    private te7 containsRequestedProtocol(String str) {
        for (fq7 fq7Var : this.f78781g) {
            if (fq7Var.acceptProvidedProtocol(str)) {
                this.f78780f = fq7Var;
                this.f78777c.trace("acceptHandshake - Matching protocol found: {}", fq7Var);
                return te7.MATCHED;
            }
        }
        return te7.NOT_MATCHED;
    }

    private ByteBuffer createByteBufferFromFramedata(nv6 nv6Var) {
        ByteBuffer payloadData = nv6Var.getPayloadData();
        int i = 0;
        boolean z = this.f74997a == kae.CLIENT;
        int sizeBytes = getSizeBytes(payloadData);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate((sizeBytes > 1 ? sizeBytes + 1 : sizeBytes) + 1 + (z ? 4 : 0) + payloadData.remaining());
        byte bFromOpcode = (byte) (fromOpcode(nv6Var.getOpcode()) | ((byte) (nv6Var.isFin() ? -128 : 0)));
        if (nv6Var.isRSV1()) {
            bFromOpcode = (byte) (bFromOpcode | getRSVByte(1));
        }
        if (nv6Var.isRSV2()) {
            bFromOpcode = (byte) (bFromOpcode | getRSVByte(2));
        }
        if (nv6Var.isRSV3()) {
            bFromOpcode = (byte) (getRSVByte(3) | bFromOpcode);
        }
        byteBufferAllocate.put(bFromOpcode);
        byte[] byteArray = toByteArray(payloadData.remaining(), sizeBytes);
        if (sizeBytes == 1) {
            byteBufferAllocate.put((byte) (byteArray[0] | getMaskByte(z)));
        } else if (sizeBytes == 2) {
            byteBufferAllocate.put((byte) (getMaskByte(z) | BuiltinOptions.RightShiftOptions));
            byteBufferAllocate.put(byteArray);
        } else {
            if (sizeBytes != 8) {
                throw new IllegalStateException("Size representation not supported/specified");
            }
            byteBufferAllocate.put((byte) (getMaskByte(z) | 127));
            byteBufferAllocate.put(byteArray);
        }
        if (z) {
            ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(4);
            byteBufferAllocate2.putInt(this.f78785k.nextInt());
            byteBufferAllocate.put(byteBufferAllocate2.array());
            while (payloadData.hasRemaining()) {
                byteBufferAllocate.put((byte) (payloadData.get() ^ byteBufferAllocate2.get(i % 4)));
                i++;
            }
        } else {
            byteBufferAllocate.put(payloadData);
            payloadData.flip();
        }
        byteBufferAllocate.flip();
        return byteBufferAllocate;
    }

    private byte fromOpcode(o5c o5cVar) {
        if (o5cVar == o5c.CONTINUOUS) {
            return (byte) 0;
        }
        if (o5cVar == o5c.TEXT) {
            return (byte) 1;
        }
        if (o5cVar == o5c.BINARY) {
            return (byte) 2;
        }
        if (o5cVar == o5c.CLOSING) {
            return (byte) 8;
        }
        if (o5cVar == o5c.PING) {
            return (byte) 9;
        }
        if (o5cVar == o5c.PONG) {
            return (byte) 10;
        }
        throw new IllegalArgumentException("Don't know how to handle " + o5cVar.toString());
    }

    private String generateFinalKey(String str) {
        try {
            return cq0.encodeBytes(MessageDigest.getInstance("SHA1").digest((str.trim() + WebSocketProtocol.ACCEPT_MAGIC).getBytes()));
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException(e);
        }
    }

    private long getByteBufferListSize() {
        long jLimit;
        synchronized (this.f78783i) {
            try {
                Iterator<ByteBuffer> it = this.f78783i.iterator();
                jLimit = 0;
                while (it.hasNext()) {
                    jLimit += (long) it.next().limit();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return jLimit;
    }

    private byte getMaskByte(boolean z) {
        return z ? (byte) -128 : (byte) 0;
    }

    private ByteBuffer getPayloadFromByteBufferList() throws t59 {
        ByteBuffer byteBufferAllocate;
        synchronized (this.f78783i) {
            try {
                Iterator<ByteBuffer> it = this.f78783i.iterator();
                long jLimit = 0;
                while (it.hasNext()) {
                    jLimit += (long) it.next().limit();
                }
                checkBufferLimit();
                byteBufferAllocate = ByteBuffer.allocate((int) jLimit);
                Iterator<ByteBuffer> it2 = this.f78783i.iterator();
                while (it2.hasNext()) {
                    byteBufferAllocate.put(it2.next());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        byteBufferAllocate.flip();
        return byteBufferAllocate;
    }

    private byte getRSVByte(int i) {
        if (i == 1) {
            return (byte) 64;
        }
        if (i == 2) {
            return (byte) 32;
        }
        return i == 3 ? (byte) 16 : (byte) 0;
    }

    private String getServerTime() {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat.format(calendar.getTime());
    }

    private int getSizeBytes(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() <= 125) {
            return 1;
        }
        return byteBuffer.remaining() <= 65535 ? 2 : 8;
    }

    private void logRuntimeException(mii miiVar, RuntimeException runtimeException) {
        this.f78777c.error("Runtime exception during onWebsocketMessage", (Throwable) runtimeException);
        miiVar.getWebSocketListener().onWebsocketError(miiVar, runtimeException);
    }

    private void processFrameBinary(mii miiVar, nv6 nv6Var) {
        try {
            miiVar.getWebSocketListener().onWebsocketMessage(miiVar, nv6Var.getPayloadData());
        } catch (RuntimeException e) {
            logRuntimeException(miiVar, e);
        }
    }

    private void processFrameClosing(mii miiVar, nv6 nv6Var) {
        int closeCode;
        String message;
        if (nv6Var instanceof l52) {
            l52 l52Var = (l52) nv6Var;
            closeCode = l52Var.getCloseCode();
            message = l52Var.getMessage();
        } else {
            closeCode = 1005;
            message = "";
        }
        if (miiVar.getReadyState() == rrd.CLOSING) {
            miiVar.closeConnection(closeCode, message, true);
        } else if (getCloseHandshakeType() == m52.TWOWAY) {
            miiVar.close(closeCode, message, true);
        } else {
            miiVar.flushAndClose(closeCode, message, false);
        }
    }

    private void processFrameContinuousAndNonFin(mii miiVar, nv6 nv6Var, o5c o5cVar) throws ud8 {
        o5c o5cVar2 = o5c.CONTINUOUS;
        if (o5cVar != o5cVar2) {
            processFrameIsNotFin(nv6Var);
        } else if (nv6Var.isFin()) {
            processFrameIsFin(miiVar, nv6Var);
        } else if (this.f78782h == null) {
            this.f78777c.error("Protocol error: Continuous frame sequence was not started.");
            throw new ud8(1002, "Continuous frame sequence was not started.");
        }
        if (o5cVar == o5c.TEXT && !ww1.isValidUTF8(nv6Var.getPayloadData())) {
            this.f78777c.error("Protocol error: Payload is not UTF8");
            throw new ud8(1007);
        }
        if (o5cVar != o5cVar2 || this.f78782h == null) {
            return;
        }
        addToBufferList(nv6Var.getPayloadData());
    }

    private void processFrameIsFin(mii miiVar, nv6 nv6Var) throws ud8 {
        if (this.f78782h == null) {
            this.f78777c.trace("Protocol error: Previous continuous frame sequence not completed.");
            throw new ud8(1002, "Continuous frame sequence was not started.");
        }
        addToBufferList(nv6Var.getPayloadData());
        checkBufferLimit();
        if (this.f78782h.getOpcode() == o5c.TEXT) {
            ((ov6) this.f78782h).setPayload(getPayloadFromByteBufferList());
            ((ov6) this.f78782h).isValid();
            try {
                miiVar.getWebSocketListener().onWebsocketMessage(miiVar, ww1.stringUtf8(this.f78782h.getPayloadData()));
            } catch (RuntimeException e) {
                logRuntimeException(miiVar, e);
            }
        } else if (this.f78782h.getOpcode() == o5c.BINARY) {
            ((ov6) this.f78782h).setPayload(getPayloadFromByteBufferList());
            ((ov6) this.f78782h).isValid();
            try {
                miiVar.getWebSocketListener().onWebsocketMessage(miiVar, this.f78782h.getPayloadData());
            } catch (RuntimeException e2) {
                logRuntimeException(miiVar, e2);
            }
        }
        this.f78782h = null;
        clearBufferList();
    }

    private void processFrameIsNotFin(nv6 nv6Var) throws ud8 {
        if (this.f78782h != null) {
            this.f78777c.trace("Protocol error: Previous continuous frame sequence not completed.");
            throw new ud8(1002, "Previous continuous frame sequence not completed.");
        }
        this.f78782h = nv6Var;
        addToBufferList(nv6Var.getPayloadData());
        checkBufferLimit();
    }

    private void processFrameText(mii miiVar, nv6 nv6Var) throws ud8 {
        try {
            miiVar.getWebSocketListener().onWebsocketMessage(miiVar, ww1.stringUtf8(nv6Var.getPayloadData()));
        } catch (RuntimeException e) {
            logRuntimeException(miiVar, e);
        }
    }

    private byte[] toByteArray(long j, int i) {
        byte[] bArr = new byte[i];
        int i2 = (i * 8) - 8;
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) (j >>> (i2 - (i3 * 8)));
        }
        return bArr;
    }

    private o5c toOpcode(byte b) throws xd8 {
        if (b == 0) {
            return o5c.CONTINUOUS;
        }
        if (b == 1) {
            return o5c.TEXT;
        }
        if (b == 2) {
            return o5c.BINARY;
        }
        switch (b) {
            case 8:
                return o5c.CLOSING;
            case 9:
                return o5c.PING;
            case 10:
                return o5c.PONG;
            default:
                throw new xd8("Unknown opcode " + ((int) b));
        }
    }

    private nv6 translateSingleFrame(ByteBuffer byteBuffer) throws jz7, ud8 {
        if (byteBuffer == null) {
            throw new IllegalArgumentException();
        }
        int iRemaining = byteBuffer.remaining();
        int realPackageSize = 2;
        translateSingleFrameCheckPacketSize(iRemaining, 2);
        byte b = byteBuffer.get();
        boolean z = (b >> 8) != 0;
        boolean z2 = (b & 64) != 0;
        boolean z3 = (b & 32) != 0;
        boolean z4 = (b & 16) != 0;
        byte b2 = byteBuffer.get();
        boolean z5 = (b2 & (-128)) != 0;
        int payloadLength = (byte) (b2 & 127);
        o5c opcode = toOpcode((byte) (b & 15));
        if (payloadLength < 0 || payloadLength > 125) {
            C12166a c12166aTranslateSingleFramePayloadLength = translateSingleFramePayloadLength(byteBuffer, opcode, payloadLength, iRemaining, 2);
            payloadLength = c12166aTranslateSingleFramePayloadLength.getPayloadLength();
            realPackageSize = c12166aTranslateSingleFramePayloadLength.getRealPackageSize();
        }
        translateSingleFrameCheckLengthLimit(payloadLength);
        translateSingleFrameCheckPacketSize(iRemaining, realPackageSize + (z5 ? 4 : 0) + payloadLength);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(checkAlloc(payloadLength));
        if (z5) {
            byte[] bArr = new byte[4];
            byteBuffer.get(bArr);
            for (int i = 0; i < payloadLength; i++) {
                byteBufferAllocate.put((byte) (byteBuffer.get() ^ bArr[i % 4]));
            }
        } else {
            byteBufferAllocate.put(byteBuffer.array(), byteBuffer.position(), byteBufferAllocate.limit());
            byteBuffer.position(byteBuffer.position() + byteBufferAllocate.limit());
        }
        ov6 ov6Var = ov6.get(opcode);
        ov6Var.setFin(z);
        ov6Var.setRSV1(z2);
        ov6Var.setRSV2(z3);
        ov6Var.setRSV3(z4);
        byteBufferAllocate.flip();
        ov6Var.setPayload(byteBufferAllocate);
        getExtension().isFrameValid(ov6Var);
        getExtension().decodeFrame(ov6Var);
        if (this.f78777c.isTraceEnabled()) {
            this.f78777c.trace("afterDecoding({}): {}", Integer.valueOf(ov6Var.getPayloadData().remaining()), ov6Var.getPayloadData().remaining() > 1000 ? "too big to display" : new String(ov6Var.getPayloadData().array()));
        }
        ov6Var.isValid();
        return ov6Var;
    }

    private void translateSingleFrameCheckLengthLimit(long j) throws t59 {
        if (j > 2147483647L) {
            this.f78777c.trace("Limit exedeed: Payloadsize is to big...");
            throw new t59("Payloadsize is to big...");
        }
        int i = this.f78786l;
        if (j > i) {
            this.f78777c.trace("Payload limit reached. Allowed: {} Current: {}", Integer.valueOf(i), Long.valueOf(j));
            throw new t59("Payload limit reached.", this.f78786l);
        }
        if (j >= 0) {
            return;
        }
        this.f78777c.trace("Limit underflow: Payloadsize is to little...");
        throw new t59("Payloadsize is to little...");
    }

    private void translateSingleFrameCheckPacketSize(int i, int i2) throws jz7 {
        if (i >= i2) {
            return;
        }
        this.f78777c.trace("Incomplete frame: maxpacketsize < realpacketsize");
        throw new jz7(i2);
    }

    private C12166a translateSingleFramePayloadLength(ByteBuffer byteBuffer, o5c o5cVar, int i, int i2, int i3) throws jz7, t59, xd8 {
        int i4;
        int iIntValue;
        if (o5cVar == o5c.PING || o5cVar == o5c.PONG || o5cVar == o5c.CLOSING) {
            this.f78777c.trace("Invalid frame: more than 125 octets");
            throw new xd8("more than 125 octets");
        }
        if (i == 126) {
            i4 = i3 + 2;
            translateSingleFrameCheckPacketSize(i2, i4);
            iIntValue = new BigInteger(new byte[]{0, byteBuffer.get(), byteBuffer.get()}).intValue();
        } else {
            i4 = i3 + 8;
            translateSingleFrameCheckPacketSize(i2, i4);
            byte[] bArr = new byte[8];
            for (int i5 = 0; i5 < 8; i5++) {
                bArr[i5] = byteBuffer.get();
            }
            long jLongValue = new BigInteger(bArr).longValue();
            translateSingleFrameCheckLengthLimit(jLongValue);
            iIntValue = (int) jLongValue;
        }
        return new C12166a(iIntValue, i4);
    }

    @Override // p000.qn4
    public te7 acceptHandshakeAsClient(z32 z32Var, f3f f3fVar) throws yd8 {
        if (!m20460a(f3fVar)) {
            this.f78777c.trace("acceptHandshakeAsClient - Missing/wrong upgrade or connection in handshake.");
            return te7.NOT_MATCHED;
        }
        if (!z32Var.hasFieldValue("Sec-WebSocket-Key") || !f3fVar.hasFieldValue("Sec-WebSocket-Accept")) {
            this.f78777c.trace("acceptHandshakeAsClient - Missing Sec-WebSocket-Key or Sec-WebSocket-Accept");
            return te7.NOT_MATCHED;
        }
        if (!generateFinalKey(z32Var.getFieldValue("Sec-WebSocket-Key")).equals(f3fVar.getFieldValue("Sec-WebSocket-Accept"))) {
            this.f78777c.trace("acceptHandshakeAsClient - Wrong key for Sec-WebSocket-Key.");
            return te7.NOT_MATCHED;
        }
        te7 te7Var = te7.NOT_MATCHED;
        String fieldValue = f3fVar.getFieldValue("Sec-WebSocket-Extensions");
        Iterator<up7> it = this.f78779e.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            up7 next = it.next();
            if (next.acceptProvidedExtensionAsClient(fieldValue)) {
                this.f78778d = next;
                te7Var = te7.MATCHED;
                this.f78777c.trace("acceptHandshakeAsClient - Matching extension found: {}", next);
                break;
            }
        }
        te7 te7VarContainsRequestedProtocol = containsRequestedProtocol(f3fVar.getFieldValue("Sec-WebSocket-Protocol"));
        te7 te7Var2 = te7.MATCHED;
        if (te7VarContainsRequestedProtocol == te7Var2 && te7Var == te7Var2) {
            return te7Var2;
        }
        this.f78777c.trace("acceptHandshakeAsClient - No matching extension or protocol found.");
        return te7.NOT_MATCHED;
    }

    @Override // p000.qn4
    public te7 acceptHandshakeAsServer(z32 z32Var) throws yd8 {
        if (m20461b(z32Var) != 13) {
            this.f78777c.trace("acceptHandshakeAsServer - Wrong websocket version.");
            return te7.NOT_MATCHED;
        }
        te7 te7Var = te7.NOT_MATCHED;
        String fieldValue = z32Var.getFieldValue("Sec-WebSocket-Extensions");
        Iterator<up7> it = this.f78779e.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            up7 next = it.next();
            if (next.acceptProvidedExtensionAsServer(fieldValue)) {
                this.f78778d = next;
                te7Var = te7.MATCHED;
                this.f78777c.trace("acceptHandshakeAsServer - Matching extension found: {}", next);
                break;
            }
        }
        te7 te7VarContainsRequestedProtocol = containsRequestedProtocol(z32Var.getFieldValue("Sec-WebSocket-Protocol"));
        te7 te7Var2 = te7.MATCHED;
        if (te7VarContainsRequestedProtocol == te7Var2 && te7Var == te7Var2) {
            return te7Var2;
        }
        this.f78777c.trace("acceptHandshakeAsServer - No matching extension or protocol found.");
        return te7.NOT_MATCHED;
    }

    @Override // p000.qn4
    public qn4 copyInstance() {
        ArrayList arrayList = new ArrayList();
        Iterator<up7> it = getKnownExtensions().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().copyInstance());
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator<fq7> it2 = getKnownProtocols().iterator();
        while (it2.hasNext()) {
            arrayList2.add(it2.next().copyInstance());
        }
        return new rn4(arrayList, arrayList2, this.f78786l);
    }

    @Override // p000.qn4
    public ByteBuffer createBinaryFrame(nv6 nv6Var) {
        getExtension().encodeFrame(nv6Var);
        if (this.f78777c.isTraceEnabled()) {
            this.f78777c.trace("afterEnconding({}): {}", Integer.valueOf(nv6Var.getPayloadData().remaining()), nv6Var.getPayloadData().remaining() > 1000 ? "too big to display" : new String(nv6Var.getPayloadData().array()));
        }
        return createByteBufferFromFramedata(nv6Var);
    }

    @Override // p000.qn4
    public List<nv6> createFrames(ByteBuffer byteBuffer, boolean z) {
        b21 b21Var = new b21();
        b21Var.setPayload(byteBuffer);
        b21Var.setTransferemasked(z);
        try {
            b21Var.isValid();
            return Collections.singletonList(b21Var);
        } catch (ud8 e) {
            throw new dgb(e);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        rn4 rn4Var = (rn4) obj;
        if (this.f78786l != rn4Var.getMaxFrameSize()) {
            return false;
        }
        up7 up7Var = this.f78778d;
        if (up7Var == null ? rn4Var.getExtension() != null : !up7Var.equals(rn4Var.getExtension())) {
            return false;
        }
        fq7 fq7Var = this.f78780f;
        fq7 protocol = rn4Var.getProtocol();
        return fq7Var != null ? fq7Var.equals(protocol) : protocol == null;
    }

    @Override // p000.qn4
    public m52 getCloseHandshakeType() {
        return m52.TWOWAY;
    }

    public up7 getExtension() {
        return this.f78778d;
    }

    public List<up7> getKnownExtensions() {
        return this.f78779e;
    }

    public List<fq7> getKnownProtocols() {
        return this.f78781g;
    }

    public int getMaxFrameSize() {
        return this.f78786l;
    }

    public fq7 getProtocol() {
        return this.f78780f;
    }

    public int hashCode() {
        up7 up7Var = this.f78778d;
        int iHashCode = (up7Var != null ? up7Var.hashCode() : 0) * 31;
        fq7 fq7Var = this.f78780f;
        int iHashCode2 = (iHashCode + (fq7Var != null ? fq7Var.hashCode() : 0)) * 31;
        int i = this.f78786l;
        return iHashCode2 + (i ^ (i >>> 32));
    }

    @Override // p000.qn4
    public a42 postProcessHandshakeRequestAsClient(a42 a42Var) {
        a42Var.put("Upgrade", "websocket");
        a42Var.put("Connection", "Upgrade");
        byte[] bArr = new byte[16];
        this.f78785k.nextBytes(bArr);
        a42Var.put("Sec-WebSocket-Key", cq0.encodeBytes(bArr));
        a42Var.put(go7.f40519a2, "13");
        StringBuilder sb = new StringBuilder();
        for (up7 up7Var : this.f78779e) {
            if (up7Var.getProvidedExtensionAsClient() != null && up7Var.getProvidedExtensionAsClient().length() != 0) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(up7Var.getProvidedExtensionAsClient());
            }
        }
        if (sb.length() != 0) {
            a42Var.put("Sec-WebSocket-Extensions", sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        for (fq7 fq7Var : this.f78781g) {
            if (fq7Var.getProvidedProtocol().length() != 0) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(fq7Var.getProvidedProtocol());
            }
        }
        if (sb2.length() != 0) {
            a42Var.put("Sec-WebSocket-Protocol", sb2.toString());
        }
        return a42Var;
    }

    @Override // p000.qn4
    public qe7 postProcessHandshakeResponseAsServer(z32 z32Var, g3f g3fVar) throws yd8 {
        g3fVar.put("Upgrade", "websocket");
        g3fVar.put("Connection", z32Var.getFieldValue("Connection"));
        String fieldValue = z32Var.getFieldValue("Sec-WebSocket-Key");
        if (fieldValue == null) {
            throw new yd8("missing Sec-WebSocket-Key");
        }
        g3fVar.put("Sec-WebSocket-Accept", generateFinalKey(fieldValue));
        if (getExtension().getProvidedExtensionAsServer().length() != 0) {
            g3fVar.put("Sec-WebSocket-Extensions", getExtension().getProvidedExtensionAsServer());
        }
        if (getProtocol() != null && getProtocol().getProvidedProtocol().length() != 0) {
            g3fVar.put("Sec-WebSocket-Protocol", getProtocol().getProvidedProtocol());
        }
        g3fVar.setHttpStatusMessage("Web Socket Protocol Handshake");
        g3fVar.put(go7.f40445C0, "TooTallNate Java-WebSocket");
        g3fVar.put(go7.f40528d, getServerTime());
        return g3fVar;
    }

    @Override // p000.qn4
    public void processFrame(mii miiVar, nv6 nv6Var) throws ud8 {
        o5c opcode = nv6Var.getOpcode();
        if (opcode == o5c.CLOSING) {
            processFrameClosing(miiVar, nv6Var);
            return;
        }
        if (opcode == o5c.PING) {
            miiVar.getWebSocketListener().onWebsocketPing(miiVar, nv6Var);
            return;
        }
        if (opcode == o5c.PONG) {
            miiVar.updateLastPong();
            miiVar.getWebSocketListener().onWebsocketPong(miiVar, nv6Var);
            return;
        }
        if (!nv6Var.isFin() || opcode == o5c.CONTINUOUS) {
            processFrameContinuousAndNonFin(miiVar, nv6Var, opcode);
            return;
        }
        if (this.f78782h != null) {
            this.f78777c.error("Protocol error: Continuous frame sequence not completed.");
            throw new ud8(1002, "Continuous frame sequence not completed.");
        }
        if (opcode == o5c.TEXT) {
            processFrameText(miiVar, nv6Var);
        } else if (opcode == o5c.BINARY) {
            processFrameBinary(miiVar, nv6Var);
        } else {
            this.f78777c.error("non control or continious frame expected");
            throw new ud8(1002, "non control or continious frame expected");
        }
    }

    @Override // p000.qn4
    public void reset() {
        this.f78784j = null;
        up7 up7Var = this.f78778d;
        if (up7Var != null) {
            up7Var.reset();
        }
        this.f78778d = new vu3();
        this.f78780f = null;
    }

    @Override // p000.qn4
    public String toString() {
        String string = super.toString();
        if (getExtension() != null) {
            string = string + " extension: " + getExtension().toString();
        }
        if (getProtocol() != null) {
            string = string + " protocol: " + getProtocol().toString();
        }
        return string + " max frame size: " + this.f78786l;
    }

    @Override // p000.qn4
    public List<nv6> translateFrame(ByteBuffer byteBuffer) throws ud8 {
        LinkedList linkedList;
        while (true) {
            linkedList = new LinkedList();
            if (this.f78784j == null) {
                break;
            }
            try {
                byteBuffer.mark();
                int iRemaining = byteBuffer.remaining();
                int iRemaining2 = this.f78784j.remaining();
                if (iRemaining2 > iRemaining) {
                    this.f78784j.put(byteBuffer.array(), byteBuffer.position(), iRemaining);
                    byteBuffer.position(byteBuffer.position() + iRemaining);
                    return Collections.emptyList();
                }
                this.f78784j.put(byteBuffer.array(), byteBuffer.position(), iRemaining2);
                byteBuffer.position(byteBuffer.position() + iRemaining2);
                linkedList.add(translateSingleFrame((ByteBuffer) this.f78784j.duplicate().position(0)));
                this.f78784j = null;
            } catch (jz7 e) {
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(checkAlloc(e.getPreferredSize()));
                this.f78784j.rewind();
                byteBufferAllocate.put(this.f78784j);
                this.f78784j = byteBufferAllocate;
            }
        }
        while (byteBuffer.hasRemaining()) {
            byteBuffer.mark();
            try {
                linkedList.add(translateSingleFrame(byteBuffer));
            } catch (jz7 e2) {
                byteBuffer.reset();
                ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(checkAlloc(e2.getPreferredSize()));
                this.f78784j = byteBufferAllocate2;
                byteBufferAllocate2.put(byteBuffer);
            }
        }
        return linkedList;
    }

    public rn4(up7 up7Var) {
        this((List<up7>) Collections.singletonList(up7Var));
    }

    public rn4(List<up7> list) {
        this(list, (List<fq7>) Collections.singletonList(new thd("")));
    }

    public rn4(List<up7> list, List<fq7> list2) {
        this(list, list2, Integer.MAX_VALUE);
    }

    public rn4(List<up7> list, int i) {
        this(list, Collections.singletonList(new thd("")), i);
    }

    public rn4(List<up7> list, List<fq7> list2, int i) {
        this.f78777c = kj9.getLogger((Class<?>) rn4.class);
        this.f78778d = new vu3();
        this.f78785k = new Random();
        if (list != null && list2 != null && i >= 1) {
            this.f78779e = new ArrayList(list.size());
            this.f78781g = new ArrayList(list2.size());
            this.f78783i = new ArrayList();
            Iterator<up7> it = list.iterator();
            boolean z = false;
            while (it.hasNext()) {
                if (it.next().getClass().equals(vu3.class)) {
                    z = true;
                }
            }
            this.f78779e.addAll(list);
            if (!z) {
                List<up7> list3 = this.f78779e;
                list3.add(list3.size(), this.f78778d);
            }
            this.f78781g.addAll(list2);
            this.f78786l = i;
            return;
        }
        throw new IllegalArgumentException();
    }

    @Override // p000.qn4
    public List<nv6> createFrames(String str, boolean z) {
        etg etgVar = new etg();
        etgVar.setPayload(ByteBuffer.wrap(ww1.utf8Bytes(str)));
        etgVar.setTransferemasked(z);
        try {
            etgVar.isValid();
            return Collections.singletonList(etgVar);
        } catch (ud8 e) {
            throw new dgb(e);
        }
    }
}
