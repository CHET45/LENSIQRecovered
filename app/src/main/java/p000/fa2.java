package p000;

import android.content.Context;
import android.util.Pair;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class fa2 {

    /* JADX INFO: renamed from: a */
    public static final short f35825a = 2;

    /* JADX INFO: renamed from: b */
    public static final short f35826b = 1;

    /* JADX INFO: renamed from: c */
    public static final short f35827c = 512;

    /* JADX INFO: renamed from: d */
    public static final short f35828d = 513;

    /* JADX INFO: renamed from: e */
    public static final short f35829e = 514;

    /* JADX INFO: renamed from: f */
    public static final byte f35830f = 1;

    /* JADX INFO: renamed from: g */
    public static final byte f35831g = 127;

    /* JADX INFO: renamed from: h */
    public static final String f35832h = "color";

    /* JADX INFO: renamed from: i */
    public static byte f35833i;

    /* JADX INFO: renamed from: j */
    public static final C5695d f35834j = new C5695d(1, "android");

    /* JADX INFO: renamed from: k */
    public static final Comparator<C5693b> f35835k = new C5692a();

    /* JADX INFO: renamed from: fa2$a */
    public class C5692a implements Comparator<C5693b> {
        @Override // java.util.Comparator
        public int compare(C5693b c5693b, C5693b c5693b2) {
            return c5693b.f35838c - c5693b2.f35838c;
        }
    }

    /* JADX INFO: renamed from: fa2$b */
    public static class C5693b {

        /* JADX INFO: renamed from: a */
        public final byte f35836a;

        /* JADX INFO: renamed from: b */
        public final byte f35837b;

        /* JADX INFO: renamed from: c */
        public final short f35838c;

        /* JADX INFO: renamed from: d */
        public final String f35839d;

        /* JADX INFO: renamed from: e */
        @g92
        public final int f35840e;

        public C5693b(int i, String str, int i2) {
            this.f35839d = str;
            this.f35840e = i2;
            this.f35838c = (short) (65535 & i);
            this.f35837b = (byte) ((i >> 16) & 255);
            this.f35836a = (byte) ((i >> 24) & 255);
        }
    }

    /* JADX INFO: renamed from: fa2$c */
    public static class C5694c {

        /* JADX INFO: renamed from: f */
        public static final short f35841f = 288;

        /* JADX INFO: renamed from: g */
        public static final int f35842g = 128;

        /* JADX INFO: renamed from: a */
        public final C5696e f35843a;

        /* JADX INFO: renamed from: b */
        public final C5695d f35844b;

        /* JADX INFO: renamed from: c */
        public final C5699h f35845c = new C5699h(false, "?1", "?2", "?3", "?4", "?5", "color");

        /* JADX INFO: renamed from: d */
        public final C5699h f35846d;

        /* JADX INFO: renamed from: e */
        public final C5702k f35847e;

        public C5694c(C5695d c5695d, List<C5693b> list) {
            this.f35844b = c5695d;
            String[] strArr = new String[list.size()];
            for (int i = 0; i < list.size(); i++) {
                strArr[i] = list.get(i).f35839d;
            }
            this.f35846d = new C5699h(true, strArr);
            this.f35847e = new C5702k(list);
            this.f35843a = new C5696e(fa2.f35827c, f35841f, m10747a());
        }

        /* JADX INFO: renamed from: a */
        public int m10747a() {
            return this.f35845c.m10754a() + 288 + this.f35846d.m10754a() + this.f35847e.m10760a();
        }

        /* JADX INFO: renamed from: b */
        public void m10748b(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            this.f35843a.m10751a(byteArrayOutputStream);
            byteArrayOutputStream.write(fa2.intToByteArray(this.f35844b.f35848a));
            char[] charArray = this.f35844b.f35849b.toCharArray();
            for (int i = 0; i < 128; i++) {
                if (i < charArray.length) {
                    byteArrayOutputStream.write(fa2.charToByteArray(charArray[i]));
                } else {
                    byteArrayOutputStream.write(fa2.charToByteArray((char) 0));
                }
            }
            byteArrayOutputStream.write(fa2.intToByteArray(288));
            byteArrayOutputStream.write(fa2.intToByteArray(0));
            byteArrayOutputStream.write(fa2.intToByteArray(this.f35845c.m10754a() + 288));
            byteArrayOutputStream.write(fa2.intToByteArray(0));
            byteArrayOutputStream.write(fa2.intToByteArray(0));
            this.f35845c.m10755b(byteArrayOutputStream);
            this.f35846d.m10755b(byteArrayOutputStream);
            this.f35847e.m10761b(byteArrayOutputStream);
        }
    }

    /* JADX INFO: renamed from: fa2$d */
    public static class C5695d {

        /* JADX INFO: renamed from: a */
        public final int f35848a;

        /* JADX INFO: renamed from: b */
        public final String f35849b;

        public C5695d(int i, String str) {
            this.f35848a = i;
            this.f35849b = str;
        }
    }

    /* JADX INFO: renamed from: fa2$e */
    public static class C5696e {

        /* JADX INFO: renamed from: a */
        public final short f35850a;

        /* JADX INFO: renamed from: b */
        public final short f35851b;

        /* JADX INFO: renamed from: c */
        public final int f35852c;

        public C5696e(short s, short s2, int i) {
            this.f35850a = s;
            this.f35851b = s2;
            this.f35852c = i;
        }

        /* JADX INFO: renamed from: a */
        public void m10751a(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            byteArrayOutputStream.write(fa2.shortToByteArray(this.f35850a));
            byteArrayOutputStream.write(fa2.shortToByteArray(this.f35851b));
            byteArrayOutputStream.write(fa2.intToByteArray(this.f35852c));
        }
    }

    /* JADX INFO: renamed from: fa2$f */
    public static class C5697f {

        /* JADX INFO: renamed from: c */
        public static final short f35853c = 8;

        /* JADX INFO: renamed from: d */
        public static final short f35854d = 2;

        /* JADX INFO: renamed from: e */
        public static final short f35855e = 8;

        /* JADX INFO: renamed from: f */
        public static final byte f35856f = 28;

        /* JADX INFO: renamed from: g */
        public static final int f35857g = 16;

        /* JADX INFO: renamed from: a */
        public final int f35858a;

        /* JADX INFO: renamed from: b */
        public final int f35859b;

        public C5697f(int i, @g92 int i2) {
            this.f35858a = i;
            this.f35859b = i2;
        }

        /* JADX INFO: renamed from: a */
        public void m10752a(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            byteArrayOutputStream.write(fa2.shortToByteArray((short) 8));
            byteArrayOutputStream.write(fa2.shortToByteArray((short) 2));
            byteArrayOutputStream.write(fa2.intToByteArray(this.f35858a));
            byteArrayOutputStream.write(fa2.shortToByteArray((short) 8));
            byteArrayOutputStream.write(new byte[]{0, 28});
            byteArrayOutputStream.write(fa2.intToByteArray(this.f35859b));
        }
    }

    /* JADX INFO: renamed from: fa2$g */
    public static class C5698g {

        /* JADX INFO: renamed from: e */
        public static final short f35860e = 12;

        /* JADX INFO: renamed from: a */
        public final C5696e f35861a;

        /* JADX INFO: renamed from: b */
        public final int f35862b;

        /* JADX INFO: renamed from: d */
        public final List<C5694c> f35864d = new ArrayList();

        /* JADX INFO: renamed from: c */
        public final C5699h f35863c = new C5699h(new String[0]);

        public C5698g(Map<C5695d, List<C5693b>> map) {
            this.f35862b = map.size();
            for (Map.Entry<C5695d, List<C5693b>> entry : map.entrySet()) {
                List<C5693b> value = entry.getValue();
                Collections.sort(value, fa2.f35835k);
                this.f35864d.add(new C5694c(entry.getKey(), value));
            }
            this.f35861a = new C5696e((short) 2, (short) 12, getOverallSize());
        }

        private int getOverallSize() {
            Iterator<C5694c> it = this.f35864d.iterator();
            int iM10747a = 0;
            while (it.hasNext()) {
                iM10747a += it.next().m10747a();
            }
            return this.f35863c.m10754a() + 12 + iM10747a;
        }

        /* JADX INFO: renamed from: a */
        public void m10753a(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            this.f35861a.m10751a(byteArrayOutputStream);
            byteArrayOutputStream.write(fa2.intToByteArray(this.f35862b));
            this.f35863c.m10755b(byteArrayOutputStream);
            Iterator<C5694c> it = this.f35864d.iterator();
            while (it.hasNext()) {
                it.next().m10748b(byteArrayOutputStream);
            }
        }
    }

    /* JADX INFO: renamed from: fa2$h */
    public static class C5699h {

        /* JADX INFO: renamed from: m */
        public static final short f35865m = 28;

        /* JADX INFO: renamed from: n */
        public static final int f35866n = 256;

        /* JADX INFO: renamed from: o */
        public static final int f35867o = -1;

        /* JADX INFO: renamed from: a */
        public final C5696e f35868a;

        /* JADX INFO: renamed from: b */
        public final int f35869b;

        /* JADX INFO: renamed from: c */
        public final int f35870c;

        /* JADX INFO: renamed from: d */
        public final int f35871d;

        /* JADX INFO: renamed from: e */
        public final int f35872e;

        /* JADX INFO: renamed from: f */
        public final List<Integer> f35873f;

        /* JADX INFO: renamed from: g */
        public final List<Integer> f35874g;

        /* JADX INFO: renamed from: h */
        public final List<byte[]> f35875h;

        /* JADX INFO: renamed from: i */
        public final List<List<C5700i>> f35876i;

        /* JADX INFO: renamed from: j */
        public final boolean f35877j;

        /* JADX INFO: renamed from: k */
        public final int f35878k;

        /* JADX INFO: renamed from: l */
        public final int f35879l;

        public C5699h(String... strArr) {
            this(false, strArr);
        }

        private Pair<byte[], List<C5700i>> processString(String str) {
            return new Pair<>(this.f35877j ? fa2.stringToByteArrayUtf8(str) : fa2.stringToByteArray(str), Collections.emptyList());
        }

        /* JADX INFO: renamed from: a */
        public int m10754a() {
            return this.f35879l;
        }

        /* JADX INFO: renamed from: b */
        public void m10755b(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            this.f35868a.m10751a(byteArrayOutputStream);
            byteArrayOutputStream.write(fa2.intToByteArray(this.f35869b));
            byteArrayOutputStream.write(fa2.intToByteArray(this.f35870c));
            byteArrayOutputStream.write(fa2.intToByteArray(this.f35877j ? 256 : 0));
            byteArrayOutputStream.write(fa2.intToByteArray(this.f35871d));
            byteArrayOutputStream.write(fa2.intToByteArray(this.f35872e));
            Iterator<Integer> it = this.f35873f.iterator();
            while (it.hasNext()) {
                byteArrayOutputStream.write(fa2.intToByteArray(it.next().intValue()));
            }
            Iterator<Integer> it2 = this.f35874g.iterator();
            while (it2.hasNext()) {
                byteArrayOutputStream.write(fa2.intToByteArray(it2.next().intValue()));
            }
            Iterator<byte[]> it3 = this.f35875h.iterator();
            while (it3.hasNext()) {
                byteArrayOutputStream.write(it3.next());
            }
            int i = this.f35878k;
            if (i > 0) {
                byteArrayOutputStream.write(new byte[i]);
            }
            Iterator<List<C5700i>> it4 = this.f35876i.iterator();
            while (it4.hasNext()) {
                Iterator<C5700i> it5 = it4.next().iterator();
                while (it5.hasNext()) {
                    it5.next().m10757b(byteArrayOutputStream);
                }
                byteArrayOutputStream.write(fa2.intToByteArray(-1));
            }
        }

        public C5699h(boolean z, String... strArr) {
            this.f35873f = new ArrayList();
            this.f35874g = new ArrayList();
            this.f35875h = new ArrayList();
            this.f35876i = new ArrayList();
            this.f35877j = z;
            int length = 0;
            for (String str : strArr) {
                Pair<byte[], List<C5700i>> pairProcessString = processString(str);
                this.f35873f.add(Integer.valueOf(length));
                Object obj = pairProcessString.first;
                length += ((byte[]) obj).length;
                this.f35875h.add((byte[]) obj);
                this.f35876i.add((List) pairProcessString.second);
            }
            int size = 0;
            for (List<C5700i> list : this.f35876i) {
                for (C5700i c5700i : list) {
                    this.f35873f.add(Integer.valueOf(length));
                    length += c5700i.f35880a.length;
                    this.f35875h.add(c5700i.f35880a);
                }
                this.f35874g.add(Integer.valueOf(size));
                size += (list.size() * 12) + 4;
            }
            int i = length % 4;
            int i2 = i == 0 ? 0 : 4 - i;
            this.f35878k = i2;
            int size2 = this.f35875h.size();
            this.f35869b = size2;
            this.f35870c = this.f35875h.size() - strArr.length;
            boolean z2 = this.f35875h.size() - strArr.length > 0;
            if (!z2) {
                this.f35874g.clear();
                this.f35876i.clear();
            }
            int size3 = (size2 * 4) + 28 + (this.f35874g.size() * 4);
            this.f35871d = size3;
            int i3 = length + i2;
            this.f35872e = z2 ? size3 + i3 : 0;
            int i4 = size3 + i3 + (z2 ? size : 0);
            this.f35879l = i4;
            this.f35868a = new C5696e((short) 1, (short) 28, i4);
        }
    }

    /* JADX INFO: renamed from: fa2$i */
    public static class C5700i {

        /* JADX INFO: renamed from: a */
        public byte[] f35880a;

        /* JADX INFO: renamed from: b */
        public int f35881b;

        /* JADX INFO: renamed from: c */
        public int f35882c;

        /* JADX INFO: renamed from: d */
        public int f35883d;

        private C5700i() {
        }

        /* JADX INFO: renamed from: b */
        public void m10757b(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            byteArrayOutputStream.write(fa2.intToByteArray(this.f35881b));
            byteArrayOutputStream.write(fa2.intToByteArray(this.f35882c));
            byteArrayOutputStream.write(fa2.intToByteArray(this.f35883d));
        }
    }

    /* JADX INFO: renamed from: fa2$j */
    public static class C5701j {

        /* JADX INFO: renamed from: f */
        public static final int f35884f = -1;

        /* JADX INFO: renamed from: g */
        public static final short f35885g = 84;

        /* JADX INFO: renamed from: h */
        public static final byte f35886h = 64;

        /* JADX INFO: renamed from: a */
        public final C5696e f35887a;

        /* JADX INFO: renamed from: b */
        public final int f35888b;

        /* JADX INFO: renamed from: c */
        public final byte[] f35889c;

        /* JADX INFO: renamed from: d */
        public final int[] f35890d;

        /* JADX INFO: renamed from: e */
        public final C5697f[] f35891e;

        public C5701j(List<C5693b> list, Set<Short> set, int i) {
            byte[] bArr = new byte[64];
            this.f35889c = bArr;
            this.f35888b = i;
            bArr[0] = 64;
            this.f35891e = new C5697f[list.size()];
            for (int i2 = 0; i2 < list.size(); i2++) {
                this.f35891e[i2] = new C5697f(i2, list.get(i2).f35840e);
            }
            this.f35890d = new int[i];
            int i3 = 0;
            for (short s = 0; s < i; s = (short) (s + 1)) {
                if (set.contains(Short.valueOf(s))) {
                    this.f35890d[s] = i3;
                    i3 += 16;
                } else {
                    this.f35890d[s] = -1;
                }
            }
            this.f35887a = new C5696e(fa2.f35828d, (short) 84, m10758a());
        }

        private int getEntryStart() {
            return getOffsetTableSize() + 84;
        }

        private int getOffsetTableSize() {
            return this.f35890d.length * 4;
        }

        /* JADX INFO: renamed from: a */
        public int m10758a() {
            return getEntryStart() + (this.f35891e.length * 16);
        }

        /* JADX INFO: renamed from: b */
        public void m10759b(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            this.f35887a.m10751a(byteArrayOutputStream);
            byteArrayOutputStream.write(new byte[]{fa2.f35833i, 0, 0, 0});
            byteArrayOutputStream.write(fa2.intToByteArray(this.f35888b));
            byteArrayOutputStream.write(fa2.intToByteArray(getEntryStart()));
            byteArrayOutputStream.write(this.f35889c);
            for (int i : this.f35890d) {
                byteArrayOutputStream.write(fa2.intToByteArray(i));
            }
            for (C5697f c5697f : this.f35891e) {
                c5697f.m10752a(byteArrayOutputStream);
            }
        }
    }

    /* JADX INFO: renamed from: fa2$k */
    public static class C5702k {

        /* JADX INFO: renamed from: e */
        public static final short f35892e = 16;

        /* JADX INFO: renamed from: f */
        public static final int f35893f = 1073741824;

        /* JADX INFO: renamed from: a */
        public final C5696e f35894a;

        /* JADX INFO: renamed from: b */
        public final int f35895b;

        /* JADX INFO: renamed from: c */
        public final int[] f35896c;

        /* JADX INFO: renamed from: d */
        public final C5701j f35897d;

        public C5702k(List<C5693b> list) {
            this.f35895b = list.get(list.size() - 1).f35838c + 1;
            HashSet hashSet = new HashSet();
            Iterator<C5693b> it = list.iterator();
            while (it.hasNext()) {
                hashSet.add(Short.valueOf(it.next().f35838c));
            }
            this.f35896c = new int[this.f35895b];
            for (short s = 0; s < this.f35895b; s = (short) (s + 1)) {
                if (hashSet.contains(Short.valueOf(s))) {
                    this.f35896c[s] = 1073741824;
                }
            }
            this.f35894a = new C5696e(fa2.f35829e, (short) 16, getChunkSize());
            this.f35897d = new C5701j(list, hashSet, this.f35895b);
        }

        private int getChunkSize() {
            return (this.f35895b * 4) + 16;
        }

        /* JADX INFO: renamed from: a */
        public int m10760a() {
            return getChunkSize() + this.f35897d.m10758a();
        }

        /* JADX INFO: renamed from: b */
        public void m10761b(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            this.f35894a.m10751a(byteArrayOutputStream);
            byteArrayOutputStream.write(new byte[]{fa2.f35833i, 0, 0, 0});
            byteArrayOutputStream.write(fa2.intToByteArray(this.f35895b));
            for (int i : this.f35896c) {
                byteArrayOutputStream.write(fa2.intToByteArray(i));
            }
            this.f35897d.m10759b(byteArrayOutputStream);
        }
    }

    private fa2() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] charToByteArray(char c) {
        return new byte[]{(byte) (c & 255), (byte) ((c >> '\b') & 255)};
    }

    /* JADX INFO: renamed from: h */
    public static byte[] m10741h(Context context, Map<Integer, Integer> map) throws IOException {
        C5695d c5695d;
        if (map.entrySet().isEmpty()) {
            throw new IllegalArgumentException("No color resources provided for harmonization.");
        }
        C5695d c5695d2 = new C5695d(127, context.getPackageName());
        HashMap map2 = new HashMap();
        C5693b c5693b = null;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            C5693b c5693b2 = new C5693b(entry.getKey().intValue(), context.getResources().getResourceName(entry.getKey().intValue()), entry.getValue().intValue());
            if (!context.getResources().getResourceTypeName(entry.getKey().intValue()).equals("color")) {
                throw new IllegalArgumentException("Non color resource found: name=" + c5693b2.f35839d + ", typeId=" + Integer.toHexString(c5693b2.f35837b & 255));
            }
            if (c5693b2.f35836a == 1) {
                c5695d = f35834j;
            } else {
                if (c5693b2.f35836a != 127) {
                    throw new IllegalArgumentException("Not supported with unknown package id: " + ((int) c5693b2.f35836a));
                }
                c5695d = c5695d2;
            }
            if (!map2.containsKey(c5695d)) {
                map2.put(c5695d, new ArrayList());
            }
            ((List) map2.get(c5695d)).add(c5693b2);
            c5693b = c5693b2;
        }
        byte b = c5693b.f35837b;
        f35833i = b;
        if (b == 0) {
            throw new IllegalArgumentException("No color resources found for harmonization.");
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        new C5698g(map2).m10753a(byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] intToByteArray(int i) {
        return new byte[]{(byte) (i & 255), (byte) ((i >> 8) & 255), (byte) ((i >> 16) & 255), (byte) ((i >> 24) & 255)};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] shortToByteArray(short s) {
        return new byte[]{(byte) (s & 255), (byte) ((s >> 8) & 255)};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] stringToByteArray(String str) {
        char[] charArray = str.toCharArray();
        int length = charArray.length * 2;
        byte[] bArr = new byte[length + 4];
        byte[] bArrShortToByteArray = shortToByteArray((short) charArray.length);
        bArr[0] = bArrShortToByteArray[0];
        bArr[1] = bArrShortToByteArray[1];
        for (int i = 0; i < charArray.length; i++) {
            byte[] bArrCharToByteArray = charToByteArray(charArray[i]);
            int i2 = i * 2;
            bArr[i2 + 2] = bArrCharToByteArray[0];
            bArr[i2 + 3] = bArrCharToByteArray[1];
        }
        bArr[length + 2] = 0;
        bArr[length + 3] = 0;
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] stringToByteArrayUtf8(String str) {
        byte[] bytes = str.getBytes(Charset.forName("UTF-8"));
        byte length = (byte) bytes.length;
        int length2 = bytes.length;
        byte[] bArr = new byte[length2 + 3];
        System.arraycopy(bytes, 0, bArr, 2, length);
        bArr[1] = length;
        bArr[0] = length;
        bArr[length2 + 2] = 0;
        return bArr;
    }
}
