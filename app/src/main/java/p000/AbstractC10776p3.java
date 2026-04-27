package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p000.AbstractC1714b3;
import p000.qsa;

/* JADX INFO: renamed from: p3 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC10776p3<MessageType extends qsa> implements uhc<MessageType> {

    /* JADX INFO: renamed from: a */
    public static final zi5 f69518a = zi5.getEmptyRegistry();

    private MessageType checkMessageInitialized(MessageType message) throws ce8 {
        if (message == null || message.isInitialized()) {
            return message;
        }
        throw newUninitializedMessageException(message).asInvalidProtocolBufferException().setUnfinishedMessage(message);
    }

    private ssh newUninitializedMessageException(MessageType message) {
        return message instanceof AbstractC1714b3 ? ((AbstractC1714b3) message).m2860f() : new ssh(message);
    }

    @Override // p000.uhc
    public MessageType parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws ce8 {
        return (MessageType) checkMessageInitialized(parsePartialDelimitedFrom(inputStream, zi5Var));
    }

    @Override // p000.uhc
    public MessageType parsePartialDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws ce8 {
        try {
            int i = inputStream.read();
            if (i == -1) {
                return null;
            }
            return (MessageType) parsePartialFrom((InputStream) new AbstractC1714b3.a.C16409a(inputStream, f72.readRawVarint32(i, inputStream)), zi5Var);
        } catch (IOException e) {
            throw new ce8(e);
        }
    }

    @Override // p000.uhc
    public MessageType parseDelimitedFrom(InputStream inputStream) throws ce8 {
        return (MessageType) parseDelimitedFrom(inputStream, f69518a);
    }

    @Override // p000.uhc
    public MessageType parsePartialDelimitedFrom(InputStream inputStream) throws ce8 {
        return (MessageType) parsePartialDelimitedFrom(inputStream, f69518a);
    }

    @Override // p000.uhc
    public MessageType parsePartialFrom(f72 input) throws ce8 {
        return parsePartialFrom(input, f69518a);
    }

    @Override // p000.uhc
    public MessageType parsePartialFrom(vj1 data, zi5 extensionRegistry) throws ce8 {
        f72 f72VarNewCodedInput = data.newCodedInput();
        MessageType partialFrom = parsePartialFrom(f72VarNewCodedInput, extensionRegistry);
        try {
            f72VarNewCodedInput.checkLastTagWas(0);
            return partialFrom;
        } catch (ce8 e) {
            throw e.setUnfinishedMessage(partialFrom);
        }
    }

    @Override // p000.uhc
    public MessageType parseFrom(f72 f72Var, zi5 zi5Var) throws ce8 {
        return (MessageType) checkMessageInitialized(parsePartialFrom(f72Var, zi5Var));
    }

    @Override // p000.uhc
    public MessageType parseFrom(f72 f72Var) throws ce8 {
        return (MessageType) parseFrom(f72Var, f69518a);
    }

    @Override // p000.uhc
    public MessageType parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (MessageType) checkMessageInitialized(parsePartialFrom(vj1Var, zi5Var));
    }

    @Override // p000.uhc
    public MessageType parsePartialFrom(vj1 vj1Var) throws ce8 {
        return (MessageType) parsePartialFrom(vj1Var, f69518a);
    }

    @Override // p000.uhc
    public MessageType parseFrom(vj1 vj1Var) throws ce8 {
        return (MessageType) parseFrom(vj1Var, f69518a);
    }

    @Override // p000.uhc
    public MessageType parsePartialFrom(byte[] data, int off, int len, zi5 extensionRegistry) throws ce8 {
        f72 f72VarNewInstance = f72.newInstance(data, off, len);
        MessageType partialFrom = parsePartialFrom(f72VarNewInstance, extensionRegistry);
        try {
            f72VarNewInstance.checkLastTagWas(0);
            return partialFrom;
        } catch (ce8 e) {
            throw e.setUnfinishedMessage(partialFrom);
        }
    }

    @Override // p000.uhc
    public MessageType parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        f72 f72VarNewInstance = f72.newInstance(byteBuffer);
        MessageType partialFrom = parsePartialFrom(f72VarNewInstance, zi5Var);
        try {
            f72VarNewInstance.checkLastTagWas(0);
            return (MessageType) checkMessageInitialized(partialFrom);
        } catch (ce8 e) {
            throw e.setUnfinishedMessage(partialFrom);
        }
    }

    @Override // p000.uhc
    public MessageType parsePartialFrom(byte[] bArr, int i, int i2) throws ce8 {
        return (MessageType) parsePartialFrom(bArr, i, i2, f69518a);
    }

    @Override // p000.uhc
    public MessageType parsePartialFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (MessageType) parsePartialFrom(bArr, 0, bArr.length, zi5Var);
    }

    @Override // p000.uhc
    public MessageType parseFrom(ByteBuffer byteBuffer) throws ce8 {
        return (MessageType) parseFrom(byteBuffer, f69518a);
    }

    @Override // p000.uhc
    public MessageType parsePartialFrom(byte[] bArr) throws ce8 {
        return (MessageType) parsePartialFrom(bArr, 0, bArr.length, f69518a);
    }

    @Override // p000.uhc
    public MessageType parseFrom(byte[] bArr, int i, int i2, zi5 zi5Var) throws ce8 {
        return (MessageType) checkMessageInitialized(parsePartialFrom(bArr, i, i2, zi5Var));
    }

    @Override // p000.uhc
    public MessageType parsePartialFrom(InputStream input, zi5 extensionRegistry) throws ce8 {
        f72 f72VarNewInstance = f72.newInstance(input);
        MessageType partialFrom = parsePartialFrom(f72VarNewInstance, extensionRegistry);
        try {
            f72VarNewInstance.checkLastTagWas(0);
            return partialFrom;
        } catch (ce8 e) {
            throw e.setUnfinishedMessage(partialFrom);
        }
    }

    @Override // p000.uhc
    public MessageType parseFrom(byte[] bArr, int i, int i2) throws ce8 {
        return (MessageType) parseFrom(bArr, i, i2, f69518a);
    }

    @Override // p000.uhc
    public MessageType parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (MessageType) parseFrom(bArr, 0, bArr.length, zi5Var);
    }

    @Override // p000.uhc
    public MessageType parseFrom(byte[] bArr) throws ce8 {
        return (MessageType) parseFrom(bArr, f69518a);
    }

    @Override // p000.uhc
    public MessageType parseFrom(InputStream inputStream, zi5 zi5Var) throws ce8 {
        return (MessageType) checkMessageInitialized(parsePartialFrom(inputStream, zi5Var));
    }

    @Override // p000.uhc
    public MessageType parsePartialFrom(InputStream inputStream) throws ce8 {
        return (MessageType) parsePartialFrom(inputStream, f69518a);
    }

    @Override // p000.uhc
    public MessageType parseFrom(InputStream inputStream) throws ce8 {
        return (MessageType) parseFrom(inputStream, f69518a);
    }
}
