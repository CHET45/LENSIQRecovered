package p000;

import java.io.EOFException;
import java.io.IOException;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import p000.jm8;

/* JADX INFO: loaded from: classes3.dex */
public final class xm8 extends jm8 {

    /* JADX INFO: renamed from: Q */
    public static final long f98502Q = -922337203685477580L;

    /* JADX INFO: renamed from: Z1 */
    public static final int f98507Z1 = 0;

    /* JADX INFO: renamed from: a2 */
    public static final int f98508a2 = 1;

    /* JADX INFO: renamed from: b2 */
    public static final int f98509b2 = 2;

    /* JADX INFO: renamed from: c2 */
    public static final int f98510c2 = 3;

    /* JADX INFO: renamed from: d2 */
    public static final int f98511d2 = 4;

    /* JADX INFO: renamed from: e2 */
    public static final int f98512e2 = 5;

    /* JADX INFO: renamed from: f2 */
    public static final int f98513f2 = 6;

    /* JADX INFO: renamed from: g2 */
    public static final int f98514g2 = 7;

    /* JADX INFO: renamed from: h2 */
    public static final int f98515h2 = 8;

    /* JADX INFO: renamed from: i2 */
    public static final int f98516i2 = 9;

    /* JADX INFO: renamed from: j2 */
    public static final int f98517j2 = 10;

    /* JADX INFO: renamed from: k2 */
    public static final int f98518k2 = 11;

    /* JADX INFO: renamed from: l2 */
    public static final int f98519l2 = 12;

    /* JADX INFO: renamed from: m2 */
    public static final int f98520m2 = 13;

    /* JADX INFO: renamed from: n2 */
    public static final int f98521n2 = 14;

    /* JADX INFO: renamed from: o2 */
    public static final int f98522o2 = 15;

    /* JADX INFO: renamed from: p2 */
    public static final int f98523p2 = 16;

    /* JADX INFO: renamed from: q2 */
    public static final int f98524q2 = 17;

    /* JADX INFO: renamed from: r2 */
    public static final int f98525r2 = 18;

    /* JADX INFO: renamed from: s2 */
    public static final int f98526s2 = 0;

    /* JADX INFO: renamed from: t2 */
    public static final int f98527t2 = 1;

    /* JADX INFO: renamed from: u2 */
    public static final int f98528u2 = 2;

    /* JADX INFO: renamed from: v2 */
    public static final int f98529v2 = 3;

    /* JADX INFO: renamed from: w2 */
    public static final int f98530w2 = 4;

    /* JADX INFO: renamed from: x2 */
    public static final int f98531x2 = 5;

    /* JADX INFO: renamed from: y2 */
    public static final int f98532y2 = 6;

    /* JADX INFO: renamed from: z2 */
    public static final int f98533z2 = 7;

    /* JADX INFO: renamed from: C */
    public final BufferedSource f98534C;

    /* JADX INFO: renamed from: F */
    public final Buffer f98535F;

    /* JADX INFO: renamed from: H */
    public int f98536H = 0;

    /* JADX INFO: renamed from: L */
    public long f98537L;

    /* JADX INFO: renamed from: M */
    public int f98538M;

    /* JADX INFO: renamed from: N */
    @hib
    public String f98539N;

    /* JADX INFO: renamed from: X */
    public static final ByteString f98504X = ByteString.encodeUtf8("'\\");

    /* JADX INFO: renamed from: Y */
    public static final ByteString f98505Y = ByteString.encodeUtf8("\"\\");

    /* JADX INFO: renamed from: Z */
    public static final ByteString f98506Z = ByteString.encodeUtf8("{}[]:, \n\t\r\f/\\;#=");

    /* JADX INFO: renamed from: M1 */
    public static final ByteString f98501M1 = ByteString.encodeUtf8("\n\r");

    /* JADX INFO: renamed from: V1 */
    public static final ByteString f98503V1 = ByteString.encodeUtf8("*/");

    public xm8(BufferedSource bufferedSource) {
        if (bufferedSource == null) {
            throw new NullPointerException("source == null");
        }
        this.f98534C = bufferedSource;
        this.f98535F = bufferedSource.buffer();
        m14175b(6);
    }

    private void checkLenient() throws IOException {
        if (!this.f51178e) {
            throw m14176c("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    private int doPeek() throws IOException {
        int[] iArr = this.f51175b;
        int i = this.f51174a;
        int i2 = iArr[i - 1];
        if (i2 == 1) {
            iArr[i - 1] = 2;
        } else if (i2 == 2) {
            int iNextNonWhitespace = nextNonWhitespace(true);
            this.f98535F.readByte();
            if (iNextNonWhitespace != 44) {
                if (iNextNonWhitespace != 59) {
                    if (iNextNonWhitespace != 93) {
                        throw m14176c("Unterminated array");
                    }
                    this.f98536H = 4;
                    return 4;
                }
                checkLenient();
            }
        } else {
            if (i2 == 3 || i2 == 5) {
                iArr[i - 1] = 4;
                if (i2 == 5) {
                    int iNextNonWhitespace2 = nextNonWhitespace(true);
                    this.f98535F.readByte();
                    if (iNextNonWhitespace2 != 44) {
                        if (iNextNonWhitespace2 != 59) {
                            if (iNextNonWhitespace2 != 125) {
                                throw m14176c("Unterminated object");
                            }
                            this.f98536H = 2;
                            return 2;
                        }
                        checkLenient();
                    }
                }
                int iNextNonWhitespace3 = nextNonWhitespace(true);
                if (iNextNonWhitespace3 == 34) {
                    this.f98535F.readByte();
                    this.f98536H = 13;
                    return 13;
                }
                if (iNextNonWhitespace3 == 39) {
                    this.f98535F.readByte();
                    checkLenient();
                    this.f98536H = 12;
                    return 12;
                }
                if (iNextNonWhitespace3 != 125) {
                    checkLenient();
                    if (!isLiteral((char) iNextNonWhitespace3)) {
                        throw m14176c("Expected name");
                    }
                    this.f98536H = 14;
                    return 14;
                }
                if (i2 == 5) {
                    throw m14176c("Expected name");
                }
                this.f98535F.readByte();
                this.f98536H = 2;
                return 2;
            }
            if (i2 == 4) {
                iArr[i - 1] = 5;
                int iNextNonWhitespace4 = nextNonWhitespace(true);
                this.f98535F.readByte();
                if (iNextNonWhitespace4 != 58) {
                    if (iNextNonWhitespace4 != 61) {
                        throw m14176c("Expected ':'");
                    }
                    checkLenient();
                    if (this.f98534C.request(1L) && this.f98535F.getByte(0L) == 62) {
                        this.f98535F.readByte();
                    }
                }
            } else if (i2 == 6) {
                iArr[i - 1] = 7;
            } else if (i2 == 7) {
                if (nextNonWhitespace(false) == -1) {
                    this.f98536H = 18;
                    return 18;
                }
                checkLenient();
            } else if (i2 == 8) {
                throw new IllegalStateException("JsonReader is closed");
            }
        }
        int iNextNonWhitespace5 = nextNonWhitespace(true);
        if (iNextNonWhitespace5 == 34) {
            this.f98535F.readByte();
            this.f98536H = 9;
            return 9;
        }
        if (iNextNonWhitespace5 == 39) {
            checkLenient();
            this.f98535F.readByte();
            this.f98536H = 8;
            return 8;
        }
        if (iNextNonWhitespace5 != 44 && iNextNonWhitespace5 != 59) {
            if (iNextNonWhitespace5 == 91) {
                this.f98535F.readByte();
                this.f98536H = 3;
                return 3;
            }
            if (iNextNonWhitespace5 != 93) {
                if (iNextNonWhitespace5 == 123) {
                    this.f98535F.readByte();
                    this.f98536H = 1;
                    return 1;
                }
                int iPeekKeyword = peekKeyword();
                if (iPeekKeyword != 0) {
                    return iPeekKeyword;
                }
                int iPeekNumber = peekNumber();
                if (iPeekNumber != 0) {
                    return iPeekNumber;
                }
                if (!isLiteral(this.f98535F.getByte(0L))) {
                    throw m14176c("Expected value");
                }
                checkLenient();
                this.f98536H = 10;
                return 10;
            }
            if (i2 == 1) {
                this.f98535F.readByte();
                this.f98536H = 4;
                return 4;
            }
        }
        if (i2 != 1 && i2 != 2) {
            throw m14176c("Unexpected value");
        }
        checkLenient();
        this.f98536H = 7;
        return 7;
    }

    private int findName(String str, jm8.C7981a c7981a) {
        int length = c7981a.f51180a.length;
        for (int i = 0; i < length; i++) {
            if (str.equals(c7981a.f51180a[i])) {
                this.f98536H = 0;
                this.f51176c[this.f51174a - 1] = str;
                return i;
            }
        }
        return -1;
    }

    private boolean isLiteral(int i) throws IOException {
        if (i == 9 || i == 10 || i == 12 || i == 13 || i == 32) {
            return false;
        }
        if (i != 35) {
            if (i == 44) {
                return false;
            }
            if (i != 47 && i != 61) {
                if (i == 123 || i == 125 || i == 58) {
                    return false;
                }
                if (i != 59) {
                    switch (i) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        checkLenient();
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0025, code lost:
    
        r6.f98535F.skip(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002d, code lost:
    
        if (r2 != 47) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0037, code lost:
    
        if (r6.f98534C.request(2) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0039, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003a, code lost:
    
        checkLenient();
        r3 = r6.f98535F.getByte(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0047, code lost:
    
        if (r3 == 42) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0049, code lost:
    
        if (r3 == 47) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004b, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004c, code lost:
    
        r6.f98535F.readByte();
        r6.f98535F.readByte();
        skipToEndOfLine();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005a, code lost:
    
        r6.f98535F.readByte();
        r6.f98535F.readByte();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0068, code lost:
    
        if (skipToEndOfBlockComment() == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0071, code lost:
    
        throw m14176c("Unterminated comment");
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0074, code lost:
    
        if (r2 != 35) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0076, code lost:
    
        checkLenient();
        skipToEndOfLine();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007d, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int nextNonWhitespace(boolean r7) throws java.io.IOException {
        /*
            r6 = this;
            r0 = 0
        L1:
            r1 = r0
        L2:
            okio.BufferedSource r2 = r6.f98534C
            int r3 = r1 + 1
            long r4 = (long) r3
            boolean r2 = r2.request(r4)
            if (r2 == 0) goto L80
            okio.Buffer r2 = r6.f98535F
            long r4 = (long) r1
            byte r2 = r2.getByte(r4)
            r4 = 10
            if (r2 == r4) goto L7e
            r4 = 32
            if (r2 == r4) goto L7e
            r4 = 13
            if (r2 == r4) goto L7e
            r4 = 9
            if (r2 != r4) goto L25
            goto L7e
        L25:
            okio.Buffer r3 = r6.f98535F
            long r4 = (long) r1
            r3.skip(r4)
            r1 = 47
            if (r2 != r1) goto L72
            okio.BufferedSource r3 = r6.f98534C
            r4 = 2
            boolean r3 = r3.request(r4)
            if (r3 != 0) goto L3a
            return r2
        L3a:
            r6.checkLenient()
            okio.Buffer r3 = r6.f98535F
            r4 = 1
            byte r3 = r3.getByte(r4)
            r4 = 42
            if (r3 == r4) goto L5a
            if (r3 == r1) goto L4c
            return r2
        L4c:
            okio.Buffer r1 = r6.f98535F
            r1.readByte()
            okio.Buffer r1 = r6.f98535F
            r1.readByte()
            r6.skipToEndOfLine()
            goto L1
        L5a:
            okio.Buffer r1 = r6.f98535F
            r1.readByte()
            okio.Buffer r1 = r6.f98535F
            r1.readByte()
            boolean r1 = r6.skipToEndOfBlockComment()
            if (r1 == 0) goto L6b
            goto L1
        L6b:
            java.lang.String r7 = "Unterminated comment"
            gl8 r7 = r6.m14176c(r7)
            throw r7
        L72:
            r1 = 35
            if (r2 != r1) goto L7d
            r6.checkLenient()
            r6.skipToEndOfLine()
            goto L1
        L7d:
            return r2
        L7e:
            r1 = r3
            goto L2
        L80:
            if (r7 != 0) goto L84
            r7 = -1
            return r7
        L84:
            java.io.EOFException r7 = new java.io.EOFException
            java.lang.String r0 = "End of input"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.xm8.nextNonWhitespace(boolean):int");
    }

    private String nextQuotedValue(ByteString byteString) throws IOException {
        StringBuilder sb = null;
        while (true) {
            long jIndexOfElement = this.f98534C.indexOfElement(byteString);
            if (jIndexOfElement == -1) {
                throw m14176c("Unterminated string");
            }
            if (this.f98535F.getByte(jIndexOfElement) != 92) {
                if (sb == null) {
                    String utf8 = this.f98535F.readUtf8(jIndexOfElement);
                    this.f98535F.readByte();
                    return utf8;
                }
                sb.append(this.f98535F.readUtf8(jIndexOfElement));
                this.f98535F.readByte();
                return sb.toString();
            }
            if (sb == null) {
                sb = new StringBuilder();
            }
            sb.append(this.f98535F.readUtf8(jIndexOfElement));
            this.f98535F.readByte();
            sb.append(readEscapeCharacter());
        }
    }

    private String nextUnquotedValue() throws IOException {
        long jIndexOfElement = this.f98534C.indexOfElement(f98506Z);
        return jIndexOfElement != -1 ? this.f98535F.readUtf8(jIndexOfElement) : this.f98535F.readUtf8();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private int peekKeyword() throws IOException {
        String str;
        String str2;
        int i;
        byte b = this.f98535F.getByte(0L);
        if (b == 116 || b == 84) {
            str = "true";
            str2 = "TRUE";
            i = 5;
        } else if (b == 102 || b == 70) {
            str = "false";
            str2 = "FALSE";
            i = 6;
        } else {
            if (b != 110 && b != 78) {
                return 0;
            }
            str = "null";
            str2 = "NULL";
            i = 7;
        }
        int length = str.length();
        int i2 = 1;
        while (i2 < length) {
            int i3 = i2 + 1;
            if (!this.f98534C.request(i3)) {
                return 0;
            }
            byte b2 = this.f98535F.getByte(i2);
            if (b2 != str.charAt(i2) && b2 != str2.charAt(i2)) {
                return 0;
            }
            i2 = i3;
        }
        if (this.f98534C.request(length + 1) && isLiteral(this.f98535F.getByte(length))) {
            return 0;
        }
        this.f98535F.skip(length);
        this.f98536H = i;
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0081, code lost:
    
        if (isLiteral(r11) != false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0083, code lost:
    
        if (r6 != 2) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0085, code lost:
    
        if (r7 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x008b, code lost:
    
        if (r8 != Long.MIN_VALUE) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x008d, code lost:
    
        if (r10 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0091, code lost:
    
        if (r8 != 0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0093, code lost:
    
        if (r10 != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0095, code lost:
    
        if (r10 == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0098, code lost:
    
        r8 = -r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0099, code lost:
    
        r16.f98537L = r8;
        r16.f98535F.skip(r5);
        r16.f98536H = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00a5, code lost:
    
        return 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00a6, code lost:
    
        if (r6 == 2) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00a9, code lost:
    
        if (r6 == 4) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00ac, code lost:
    
        if (r6 != 7) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00af, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00b0, code lost:
    
        r16.f98538M = r5;
        r16.f98536H = 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00b6, code lost:
    
        return 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00b7, code lost:
    
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int peekNumber() throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.xm8.peekNumber():int");
    }

    private char readEscapeCharacter() throws IOException {
        int i;
        if (!this.f98534C.request(1L)) {
            throw m14176c("Unterminated escape sequence");
        }
        byte b = this.f98535F.readByte();
        if (b == 10 || b == 34 || b == 39 || b == 47 || b == 92) {
            return (char) b;
        }
        if (b == 98) {
            return '\b';
        }
        if (b == 102) {
            return '\f';
        }
        if (b == 110) {
            return '\n';
        }
        if (b == 114) {
            return '\r';
        }
        if (b == 116) {
            return '\t';
        }
        if (b != 117) {
            if (this.f51178e) {
                return (char) b;
            }
            throw m14176c("Invalid escape sequence: \\" + ((char) b));
        }
        if (!this.f98534C.request(4L)) {
            throw new EOFException("Unterminated escape sequence at path " + getPath());
        }
        char c = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            byte b2 = this.f98535F.getByte(i2);
            char c2 = (char) (c << 4);
            if (b2 >= 48 && b2 <= 57) {
                i = b2 - 48;
            } else if (b2 >= 97 && b2 <= 102) {
                i = b2 - 87;
            } else {
                if (b2 < 65 || b2 > 70) {
                    throw m14176c("\\u" + this.f98535F.readUtf8(4L));
                }
                i = b2 + k95.f53271v7;
            }
            c = (char) (c2 + i);
        }
        this.f98535F.skip(4L);
        return c;
    }

    private void skipQuotedValue(ByteString byteString) throws IOException {
        while (true) {
            long jIndexOfElement = this.f98534C.indexOfElement(byteString);
            if (jIndexOfElement == -1) {
                throw m14176c("Unterminated string");
            }
            if (this.f98535F.getByte(jIndexOfElement) != 92) {
                this.f98535F.skip(jIndexOfElement + 1);
                return;
            } else {
                this.f98535F.skip(jIndexOfElement + 1);
                readEscapeCharacter();
            }
        }
    }

    private boolean skipToEndOfBlockComment() throws IOException {
        BufferedSource bufferedSource = this.f98534C;
        ByteString byteString = f98503V1;
        long jIndexOf = bufferedSource.indexOf(byteString);
        boolean z = jIndexOf != -1;
        Buffer buffer = this.f98535F;
        buffer.skip(z ? jIndexOf + ((long) byteString.size()) : buffer.size());
        return z;
    }

    private void skipToEndOfLine() throws IOException {
        long jIndexOfElement = this.f98534C.indexOfElement(f98501M1);
        Buffer buffer = this.f98535F;
        buffer.skip(jIndexOfElement != -1 ? jIndexOfElement + 1 : buffer.size());
    }

    private void skipUnquotedValue() throws IOException {
        long jIndexOfElement = this.f98534C.indexOfElement(f98506Z);
        Buffer buffer = this.f98535F;
        if (jIndexOfElement == -1) {
            jIndexOfElement = buffer.size();
        }
        buffer.skip(jIndexOfElement);
    }

    @Override // p000.jm8
    public void beginArray() throws IOException {
        int iDoPeek = this.f98536H;
        if (iDoPeek == 0) {
            iDoPeek = doPeek();
        }
        if (iDoPeek == 3) {
            m14175b(1);
            this.f51177d[this.f51174a - 1] = 0;
            this.f98536H = 0;
        } else {
            throw new nk8("Expected BEGIN_ARRAY but was " + peek() + " at path " + getPath());
        }
    }

    @Override // p000.jm8
    public void beginObject() throws IOException {
        int iDoPeek = this.f98536H;
        if (iDoPeek == 0) {
            iDoPeek = doPeek();
        }
        if (iDoPeek == 1) {
            m14175b(3);
            this.f98536H = 0;
            return;
        }
        throw new nk8("Expected BEGIN_OBJECT but was " + peek() + " at path " + getPath());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f98536H = 0;
        this.f51175b[0] = 8;
        this.f51174a = 1;
        this.f98535F.clear();
        this.f98534C.close();
    }

    @Override // p000.jm8
    public void endArray() throws IOException {
        int iDoPeek = this.f98536H;
        if (iDoPeek == 0) {
            iDoPeek = doPeek();
        }
        if (iDoPeek != 4) {
            throw new nk8("Expected END_ARRAY but was " + peek() + " at path " + getPath());
        }
        int i = this.f51174a;
        this.f51174a = i - 1;
        int[] iArr = this.f51177d;
        int i2 = i - 2;
        iArr[i2] = iArr[i2] + 1;
        this.f98536H = 0;
    }

    @Override // p000.jm8
    public void endObject() throws IOException {
        int iDoPeek = this.f98536H;
        if (iDoPeek == 0) {
            iDoPeek = doPeek();
        }
        if (iDoPeek != 2) {
            throw new nk8("Expected END_OBJECT but was " + peek() + " at path " + getPath());
        }
        int i = this.f51174a;
        int i2 = i - 1;
        this.f51174a = i2;
        this.f51176c[i2] = null;
        int[] iArr = this.f51177d;
        int i3 = i - 2;
        iArr[i3] = iArr[i3] + 1;
        this.f98536H = 0;
    }

    @Override // p000.jm8
    public boolean hasNext() throws IOException {
        int iDoPeek = this.f98536H;
        if (iDoPeek == 0) {
            iDoPeek = doPeek();
        }
        return (iDoPeek == 2 || iDoPeek == 4 || iDoPeek == 18) ? false : true;
    }

    @Override // p000.jm8
    public boolean nextBoolean() throws IOException {
        int iDoPeek = this.f98536H;
        if (iDoPeek == 0) {
            iDoPeek = doPeek();
        }
        if (iDoPeek == 5) {
            this.f98536H = 0;
            int[] iArr = this.f51177d;
            int i = this.f51174a - 1;
            iArr[i] = iArr[i] + 1;
            return true;
        }
        if (iDoPeek == 6) {
            this.f98536H = 0;
            int[] iArr2 = this.f51177d;
            int i2 = this.f51174a - 1;
            iArr2[i2] = iArr2[i2] + 1;
            return false;
        }
        throw new nk8("Expected a boolean but was " + peek() + " at path " + getPath());
    }

    @Override // p000.jm8
    public double nextDouble() throws IOException {
        int iDoPeek = this.f98536H;
        if (iDoPeek == 0) {
            iDoPeek = doPeek();
        }
        if (iDoPeek == 16) {
            this.f98536H = 0;
            int[] iArr = this.f51177d;
            int i = this.f51174a - 1;
            iArr[i] = iArr[i] + 1;
            return this.f98537L;
        }
        if (iDoPeek == 17) {
            this.f98539N = this.f98535F.readUtf8(this.f98538M);
        } else if (iDoPeek == 9) {
            this.f98539N = nextQuotedValue(f98505Y);
        } else if (iDoPeek == 8) {
            this.f98539N = nextQuotedValue(f98504X);
        } else if (iDoPeek == 10) {
            this.f98539N = nextUnquotedValue();
        } else if (iDoPeek != 11) {
            throw new nk8("Expected a double but was " + peek() + " at path " + getPath());
        }
        this.f98536H = 11;
        try {
            double d = Double.parseDouble(this.f98539N);
            if (this.f51178e || !(Double.isNaN(d) || Double.isInfinite(d))) {
                this.f98539N = null;
                this.f98536H = 0;
                int[] iArr2 = this.f51177d;
                int i2 = this.f51174a - 1;
                iArr2[i2] = iArr2[i2] + 1;
                return d;
            }
            throw new gl8("JSON forbids NaN and infinities: " + d + " at path " + getPath());
        } catch (NumberFormatException unused) {
            throw new nk8("Expected a double but was " + this.f98539N + " at path " + getPath());
        }
    }

    @Override // p000.jm8
    public int nextInt() throws IOException {
        int iDoPeek = this.f98536H;
        if (iDoPeek == 0) {
            iDoPeek = doPeek();
        }
        if (iDoPeek == 16) {
            long j = this.f98537L;
            int i = (int) j;
            if (j == i) {
                this.f98536H = 0;
                int[] iArr = this.f51177d;
                int i2 = this.f51174a - 1;
                iArr[i2] = iArr[i2] + 1;
                return i;
            }
            throw new nk8("Expected an int but was " + this.f98537L + " at path " + getPath());
        }
        if (iDoPeek == 17) {
            this.f98539N = this.f98535F.readUtf8(this.f98538M);
        } else if (iDoPeek == 9 || iDoPeek == 8) {
            String strNextQuotedValue = iDoPeek == 9 ? nextQuotedValue(f98505Y) : nextQuotedValue(f98504X);
            this.f98539N = strNextQuotedValue;
            try {
                int i3 = Integer.parseInt(strNextQuotedValue);
                this.f98536H = 0;
                int[] iArr2 = this.f51177d;
                int i4 = this.f51174a - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return i3;
            } catch (NumberFormatException unused) {
            }
        } else if (iDoPeek != 11) {
            throw new nk8("Expected an int but was " + peek() + " at path " + getPath());
        }
        this.f98536H = 11;
        try {
            double d = Double.parseDouble(this.f98539N);
            int i5 = (int) d;
            if (i5 == d) {
                this.f98539N = null;
                this.f98536H = 0;
                int[] iArr3 = this.f51177d;
                int i6 = this.f51174a - 1;
                iArr3[i6] = iArr3[i6] + 1;
                return i5;
            }
            throw new nk8("Expected an int but was " + this.f98539N + " at path " + getPath());
        } catch (NumberFormatException unused2) {
            throw new nk8("Expected an int but was " + this.f98539N + " at path " + getPath());
        }
    }

    @Override // p000.jm8
    public String nextName() throws IOException {
        String strNextQuotedValue;
        int iDoPeek = this.f98536H;
        if (iDoPeek == 0) {
            iDoPeek = doPeek();
        }
        if (iDoPeek == 14) {
            strNextQuotedValue = nextUnquotedValue();
        } else if (iDoPeek == 13) {
            strNextQuotedValue = nextQuotedValue(f98505Y);
        } else if (iDoPeek == 12) {
            strNextQuotedValue = nextQuotedValue(f98504X);
        } else {
            if (iDoPeek != 15) {
                throw new nk8("Expected a name but was " + peek() + " at path " + getPath());
            }
            strNextQuotedValue = this.f98539N;
        }
        this.f98536H = 0;
        this.f51176c[this.f51174a - 1] = strNextQuotedValue;
        return strNextQuotedValue;
    }

    @Override // p000.jm8
    public String nextString() throws IOException {
        String utf8;
        int iDoPeek = this.f98536H;
        if (iDoPeek == 0) {
            iDoPeek = doPeek();
        }
        if (iDoPeek == 10) {
            utf8 = nextUnquotedValue();
        } else if (iDoPeek == 9) {
            utf8 = nextQuotedValue(f98505Y);
        } else if (iDoPeek == 8) {
            utf8 = nextQuotedValue(f98504X);
        } else if (iDoPeek == 11) {
            utf8 = this.f98539N;
            this.f98539N = null;
        } else if (iDoPeek == 16) {
            utf8 = Long.toString(this.f98537L);
        } else {
            if (iDoPeek != 17) {
                throw new nk8("Expected a string but was " + peek() + " at path " + getPath());
            }
            utf8 = this.f98535F.readUtf8(this.f98538M);
        }
        this.f98536H = 0;
        int[] iArr = this.f51177d;
        int i = this.f51174a - 1;
        iArr[i] = iArr[i] + 1;
        return utf8;
    }

    @Override // p000.jm8
    public jm8.EnumC7982b peek() throws IOException {
        int iDoPeek = this.f98536H;
        if (iDoPeek == 0) {
            iDoPeek = doPeek();
        }
        switch (iDoPeek) {
            case 1:
                return jm8.EnumC7982b.BEGIN_OBJECT;
            case 2:
                return jm8.EnumC7982b.END_OBJECT;
            case 3:
                return jm8.EnumC7982b.BEGIN_ARRAY;
            case 4:
                return jm8.EnumC7982b.END_ARRAY;
            case 5:
            case 6:
                return jm8.EnumC7982b.BOOLEAN;
            case 7:
                return jm8.EnumC7982b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return jm8.EnumC7982b.STRING;
            case 12:
            case 13:
            case 14:
            case 15:
                return jm8.EnumC7982b.NAME;
            case 16:
            case 17:
                return jm8.EnumC7982b.NUMBER;
            case 18:
                return jm8.EnumC7982b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    @Override // p000.jm8
    public int selectName(jm8.C7981a c7981a) throws IOException {
        int iDoPeek = this.f98536H;
        if (iDoPeek == 0) {
            iDoPeek = doPeek();
        }
        if (iDoPeek < 12 || iDoPeek > 15) {
            return -1;
        }
        if (iDoPeek == 15) {
            return findName(this.f98539N, c7981a);
        }
        int iSelect = this.f98534C.select(c7981a.f51181b);
        if (iSelect != -1) {
            this.f98536H = 0;
            this.f51176c[this.f51174a - 1] = c7981a.f51180a[iSelect];
            return iSelect;
        }
        String str = this.f51176c[this.f51174a - 1];
        String strNextName = nextName();
        int iFindName = findName(strNextName, c7981a);
        if (iFindName == -1) {
            this.f98536H = 15;
            this.f98539N = strNextName;
            this.f51176c[this.f51174a - 1] = str;
        }
        return iFindName;
    }

    @Override // p000.jm8
    public void skipName() throws IOException {
        if (this.f51179f) {
            throw new nk8("Cannot skip unexpected " + peek() + " at " + getPath());
        }
        int iDoPeek = this.f98536H;
        if (iDoPeek == 0) {
            iDoPeek = doPeek();
        }
        if (iDoPeek == 14) {
            skipUnquotedValue();
        } else if (iDoPeek == 13) {
            skipQuotedValue(f98505Y);
        } else if (iDoPeek == 12) {
            skipQuotedValue(f98504X);
        } else if (iDoPeek != 15) {
            throw new nk8("Expected a name but was " + peek() + " at path " + getPath());
        }
        this.f98536H = 0;
        this.f51176c[this.f51174a - 1] = "null";
    }

    @Override // p000.jm8
    public void skipValue() throws IOException {
        if (this.f51179f) {
            throw new nk8("Cannot skip unexpected " + peek() + " at " + getPath());
        }
        int i = 0;
        do {
            int iDoPeek = this.f98536H;
            if (iDoPeek == 0) {
                iDoPeek = doPeek();
            }
            if (iDoPeek == 3) {
                m14175b(1);
            } else if (iDoPeek == 1) {
                m14175b(3);
            } else {
                if (iDoPeek == 4) {
                    i--;
                    if (i < 0) {
                        throw new nk8("Expected a value but was " + peek() + " at path " + getPath());
                    }
                    this.f51174a--;
                } else if (iDoPeek == 2) {
                    i--;
                    if (i < 0) {
                        throw new nk8("Expected a value but was " + peek() + " at path " + getPath());
                    }
                    this.f51174a--;
                } else if (iDoPeek == 14 || iDoPeek == 10) {
                    skipUnquotedValue();
                } else if (iDoPeek == 9 || iDoPeek == 13) {
                    skipQuotedValue(f98505Y);
                } else if (iDoPeek == 8 || iDoPeek == 12) {
                    skipQuotedValue(f98504X);
                } else if (iDoPeek == 17) {
                    this.f98535F.skip(this.f98538M);
                } else if (iDoPeek == 18) {
                    throw new nk8("Expected a value but was " + peek() + " at path " + getPath());
                }
                this.f98536H = 0;
            }
            i++;
            this.f98536H = 0;
        } while (i != 0);
        int[] iArr = this.f51177d;
        int i2 = this.f51174a;
        int i3 = i2 - 1;
        iArr[i3] = iArr[i3] + 1;
        this.f51176c[i2 - 1] = "null";
    }

    public String toString() {
        return "JsonReader(" + this.f98534C + c0b.f15434d;
    }
}
