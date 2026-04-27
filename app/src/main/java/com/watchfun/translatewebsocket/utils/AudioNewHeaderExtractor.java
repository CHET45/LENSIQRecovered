package com.watchfun.translatewebsocket.utils;

import java.io.IOException;
import java.io.PrintStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.file.Files;
import java.nio.file.Paths;

/* JADX INFO: loaded from: classes7.dex */
public class AudioNewHeaderExtractor {
    public static final int HEADER_LENGTH = 12;
    public static final int MESSAGE_ID_LENGTH = 4;
    public static final int START_TIME_ID_LENGTH = 8;

    public static class MessageHeaders {
        private final byte[] pcmData;
        private final int sessionId;
        private final long startTimeId;

        public MessageHeaders(long j, int i, byte[] bArr) {
            this.startTimeId = j;
            this.sessionId = i;
            this.pcmData = bArr;
        }

        public byte[] getPcmData() {
            return this.pcmData;
        }

        public int getPcmDataLength() {
            byte[] bArr = this.pcmData;
            if (bArr != null) {
                return bArr.length;
            }
            return 0;
        }

        public int getSessionId() {
            return this.sessionId;
        }

        public long getStartTimeId() {
            return this.startTimeId;
        }

        public String toString() {
            return String.format("MessageHeaders{startTimeId=%d, sessionId=%d, pcmDataLength=%d}", Long.valueOf(this.startTimeId), Integer.valueOf(this.sessionId), Integer.valueOf(getPcmDataLength()));
        }
    }

    public static byte[] byteBufferToByteArraySafe(ByteBuffer byteBuffer) {
        if (byteBuffer == null || !byteBuffer.hasRemaining()) {
            return new byte[0];
        }
        int iPosition = byteBuffer.position();
        try {
            byte[] bArr = new byte[byteBuffer.remaining()];
            byteBuffer.get(bArr);
            return bArr;
        } finally {
            byteBuffer.position(iPosition);
        }
    }

    public static byte[] extractPcmData(byte[] bArr) {
        if (bArr == null || bArr.length < 12) {
            throw new IllegalArgumentException("数据长度不足以提取PCM数据");
        }
        int length = bArr.length - 12;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 12, bArr2, 0, length);
        return bArr2;
    }

    public static int extractSessionId(byte[] bArr) {
        if (bArr == null || bArr.length < 12) {
            throw new IllegalArgumentException("数据长度不足以提取messageId");
        }
        return ByteBuffer.wrap(bArr, 8, 4).order(ByteOrder.BIG_ENDIAN).getInt();
    }

    public static long extractStartTimeId(byte[] bArr) {
        if (bArr == null || bArr.length < 8) {
            throw new IllegalArgumentException("数据长度不足以提取startTimeId");
        }
        return ByteBuffer.wrap(bArr, 0, 8).order(ByteOrder.BIG_ENDIAN).getLong();
    }

    public static boolean hasHeaders(byte[] bArr) {
        return bArr != null && bArr.length >= 12;
    }

    public static boolean hasOnlyHeaders(byte[] bArr) {
        return bArr != null && bArr.length == 12;
    }

    public static void main(String[] strArr) {
        try {
            byte[] allBytes = Files.readAllBytes(Paths.get("D:\\chunk_1.pcm", new String[0]));
            if (!hasHeaders(allBytes)) {
                System.out.println("文件数据长度不足，无法包含消息头部");
                return;
            }
            byte[] bArrExtractPcmData = extractPcmData(allBytes);
            long jExtractStartTimeId = extractStartTimeId(allBytes);
            int iExtractSessionId = extractSessionId(allBytes);
            PrintStream printStream = System.out;
            printStream.println("快速提取 - StartTimeId: " + jExtractStartTimeId);
            printStream.println("快速提取 - SessionId: " + iExtractSessionId);
            printStream.println("PCM数据长度: " + bArrExtractPcmData.length + " 字节");
            StringBuilder sb = new StringBuilder();
            for (byte b : bArrExtractPcmData) {
                sb.append(String.format("%02X ", Byte.valueOf(b)));
            }
            System.out.println("PCM数据（十六进制）: " + sb.toString().trim());
        } catch (IOException e) {
            PrintStream printStream2 = System.err;
            printStream2.println("读取文件出错: " + e.getMessage());
            printStream2.println("请确保 D:\\chunk_1.pcm 文件存在于当前目录");
        } catch (Exception e2) {
            System.err.println("测试出错: " + e2.getMessage());
            e2.printStackTrace();
        }
    }

    public static byte[] wrapAudioWithHeader(byte[] bArr, long j, int i) {
        if (bArr == null) {
            bArr = new byte[0];
        }
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(bArr.length + 12).order(ByteOrder.BIG_ENDIAN);
        byteBufferOrder.putLong(j);
        byteBufferOrder.putInt(i);
        byteBufferOrder.put(bArr);
        return byteBufferOrder.array();
    }
}
