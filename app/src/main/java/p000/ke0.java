package p000;

import java.io.IOException;
import java.io.PrintStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.file.Files;
import java.nio.file.Paths;

/* JADX INFO: loaded from: classes6.dex */
public class ke0 {

    /* JADX INFO: renamed from: a */
    public static final int f53678a = 12;

    /* JADX INFO: renamed from: b */
    public static final int f53679b = 8;

    /* JADX INFO: renamed from: c */
    public static final int f53680c = 4;

    /* JADX INFO: renamed from: ke0$a */
    public static class C8292a {

        /* JADX INFO: renamed from: a */
        public final long f53681a;

        /* JADX INFO: renamed from: b */
        public final int f53682b;

        /* JADX INFO: renamed from: c */
        public final byte[] f53683c;

        public C8292a(long j, int i, byte[] bArr) {
            this.f53681a = j;
            this.f53682b = i;
            this.f53683c = bArr;
        }

        public int getMessageId() {
            return this.f53682b;
        }

        public byte[] getPcmData() {
            return this.f53683c;
        }

        public int getPcmDataLength() {
            byte[] bArr = this.f53683c;
            if (bArr != null) {
                return bArr.length;
            }
            return 0;
        }

        public long getStartTimeId() {
            return this.f53681a;
        }

        public String toString() {
            return String.format("MessageHeaders{startTimeId=%d, messageId=%d, pcmDataLength=%d}", Long.valueOf(this.f53681a), Integer.valueOf(this.f53682b), Integer.valueOf(getPcmDataLength()));
        }
    }

    public static int extractMessageId(byte[] bArr) {
        if (bArr == null || bArr.length < 12) {
            throw new IllegalArgumentException("数据长度不足以提取messageId");
        }
        return ByteBuffer.wrap(bArr, 8, 4).order(ByteOrder.BIG_ENDIAN).getInt();
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
            int iExtractMessageId = extractMessageId(allBytes);
            PrintStream printStream = System.out;
            printStream.println("快速提取 - StartTimeId: " + jExtractStartTimeId);
            printStream.println("快速提取 - MessageId: " + iExtractMessageId);
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
}
