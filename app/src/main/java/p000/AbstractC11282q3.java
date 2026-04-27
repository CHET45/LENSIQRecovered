package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p000.AbstractC0027a3;
import p000.psa;

/* JADX INFO: renamed from: q3 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC11282q3<MessageType extends psa> implements vhc<MessageType> {

    /* JADX INFO: renamed from: a */
    public static final yi5 f73083a = yi5.getEmptyRegistry();

    private MessageType checkMessageInitialized(MessageType message) throws be8 {
        if (message == null || message.isInitialized()) {
            return message;
        }
        throw newUninitializedMessageException(message).asInvalidProtocolBufferException().setUnfinishedMessage(message);
    }

    private tsh newUninitializedMessageException(MessageType message) {
        return message instanceof AbstractC0027a3 ? ((AbstractC0027a3) message).m84e() : new tsh(message);
    }

    @Override // p000.vhc
    public MessageType parseDelimitedFrom(InputStream inputStream, yi5 yi5Var) throws be8 {
        return (MessageType) checkMessageInitialized(parsePartialDelimitedFrom(inputStream, yi5Var));
    }

    @Override // p000.vhc
    public MessageType parsePartialDelimitedFrom(InputStream inputStream, yi5 yi5Var) throws be8 {
        try {
            int i = inputStream.read();
            if (i == -1) {
                return null;
            }
            return (MessageType) parsePartialFrom((InputStream) new AbstractC0027a3.a.C16336a(inputStream, e72.readRawVarint32(i, inputStream)), yi5Var);
        } catch (IOException e) {
            throw new be8(e);
        }
    }

    @Override // p000.vhc
    public MessageType parseDelimitedFrom(InputStream inputStream) throws be8 {
        return (MessageType) parseDelimitedFrom(inputStream, f73083a);
    }

    @Override // p000.vhc
    public MessageType parsePartialDelimitedFrom(InputStream inputStream) throws be8 {
        return (MessageType) parsePartialDelimitedFrom(inputStream, f73083a);
    }

    @Override // p000.vhc
    public MessageType parsePartialFrom(e72 input) throws be8 {
        return parsePartialFrom(input, f73083a);
    }

    @Override // p000.vhc
    public MessageType parsePartialFrom(wj1 data, yi5 extensionRegistry) throws be8 {
        e72 e72VarNewCodedInput = data.newCodedInput();
        MessageType partialFrom = parsePartialFrom(e72VarNewCodedInput, extensionRegistry);
        try {
            e72VarNewCodedInput.checkLastTagWas(0);
            return partialFrom;
        } catch (be8 e) {
            throw e.setUnfinishedMessage(partialFrom);
        }
    }

    @Override // p000.vhc
    public MessageType parseFrom(e72 e72Var, yi5 yi5Var) throws be8 {
        return (MessageType) checkMessageInitialized(parsePartialFrom(e72Var, yi5Var));
    }

    @Override // p000.vhc
    public MessageType parseFrom(e72 e72Var) throws be8 {
        return (MessageType) parseFrom(e72Var, f73083a);
    }

    @Override // p000.vhc
    public MessageType parseFrom(wj1 wj1Var, yi5 yi5Var) throws be8 {
        return (MessageType) checkMessageInitialized(parsePartialFrom(wj1Var, yi5Var));
    }

    @Override // p000.vhc
    public MessageType parsePartialFrom(wj1 wj1Var) throws be8 {
        return (MessageType) parsePartialFrom(wj1Var, f73083a);
    }

    @Override // p000.vhc
    public MessageType parseFrom(wj1 wj1Var) throws be8 {
        return (MessageType) parseFrom(wj1Var, f73083a);
    }

    @Override // p000.vhc
    public MessageType parsePartialFrom(byte[] data, int off, int len, yi5 extensionRegistry) throws be8 {
        e72 e72VarNewInstance = e72.newInstance(data, off, len);
        MessageType partialFrom = parsePartialFrom(e72VarNewInstance, extensionRegistry);
        try {
            e72VarNewInstance.checkLastTagWas(0);
            return partialFrom;
        } catch (be8 e) {
            throw e.setUnfinishedMessage(partialFrom);
        }
    }

    @Override // p000.vhc
    public MessageType parseFrom(ByteBuffer byteBuffer, yi5 yi5Var) throws be8 {
        e72 e72VarNewInstance = e72.newInstance(byteBuffer);
        MessageType partialFrom = parsePartialFrom(e72VarNewInstance, yi5Var);
        try {
            e72VarNewInstance.checkLastTagWas(0);
            return (MessageType) checkMessageInitialized(partialFrom);
        } catch (be8 e) {
            throw e.setUnfinishedMessage(partialFrom);
        }
    }

    @Override // p000.vhc
    public MessageType parsePartialFrom(byte[] bArr, int i, int i2) throws be8 {
        return (MessageType) parsePartialFrom(bArr, i, i2, f73083a);
    }

    @Override // p000.vhc
    public MessageType parsePartialFrom(byte[] bArr, yi5 yi5Var) throws be8 {
        return (MessageType) parsePartialFrom(bArr, 0, bArr.length, yi5Var);
    }

    @Override // p000.vhc
    public MessageType parseFrom(ByteBuffer byteBuffer) throws be8 {
        return (MessageType) parseFrom(byteBuffer, f73083a);
    }

    @Override // p000.vhc
    public MessageType parsePartialFrom(byte[] bArr) throws be8 {
        return (MessageType) parsePartialFrom(bArr, 0, bArr.length, f73083a);
    }

    @Override // p000.vhc
    public MessageType parseFrom(byte[] bArr, int i, int i2, yi5 yi5Var) throws be8 {
        return (MessageType) checkMessageInitialized(parsePartialFrom(bArr, i, i2, yi5Var));
    }

    @Override // p000.vhc
    public MessageType parsePartialFrom(InputStream input, yi5 extensionRegistry) throws be8 {
        e72 e72VarNewInstance = e72.newInstance(input);
        MessageType partialFrom = parsePartialFrom(e72VarNewInstance, extensionRegistry);
        try {
            e72VarNewInstance.checkLastTagWas(0);
            return partialFrom;
        } catch (be8 e) {
            throw e.setUnfinishedMessage(partialFrom);
        }
    }

    @Override // p000.vhc
    public MessageType parseFrom(byte[] bArr, int i, int i2) throws be8 {
        return (MessageType) parseFrom(bArr, i, i2, f73083a);
    }

    @Override // p000.vhc
    public MessageType parseFrom(byte[] bArr, yi5 yi5Var) throws be8 {
        return (MessageType) parseFrom(bArr, 0, bArr.length, yi5Var);
    }

    @Override // p000.vhc
    public MessageType parseFrom(byte[] bArr) throws be8 {
        return (MessageType) parseFrom(bArr, f73083a);
    }

    @Override // p000.vhc
    public MessageType parseFrom(InputStream inputStream, yi5 yi5Var) throws be8 {
        return (MessageType) checkMessageInitialized(parsePartialFrom(inputStream, yi5Var));
    }

    @Override // p000.vhc
    public MessageType parsePartialFrom(InputStream inputStream) throws be8 {
        return (MessageType) parsePartialFrom(inputStream, f73083a);
    }

    @Override // p000.vhc
    public MessageType parseFrom(InputStream inputStream) throws be8 {
        return (MessageType) parseFrom(inputStream, f73083a);
    }
}
