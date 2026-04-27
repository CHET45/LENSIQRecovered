package p000;

/* JADX INFO: loaded from: classes.dex */
public class wk1 {

    /* JADX INFO: renamed from: d */
    public static boolean f94462d;

    /* JADX INFO: renamed from: a */
    public String f94463a;

    /* JADX INFO: renamed from: b */
    public boolean f94464b = false;

    /* JADX INFO: renamed from: c */
    public int f94465c;

    /* JADX INFO: renamed from: wk1$a */
    public static /* synthetic */ class C14652a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f94466a;

        static {
            int[] iArr = new int[EnumC14653b.values().length];
            f94466a = iArr;
            try {
                iArr[EnumC14653b.OBJECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f94466a[EnumC14653b.ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f94466a[EnumC14653b.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f94466a[EnumC14653b.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f94466a[EnumC14653b.KEY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f94466a[EnumC14653b.TOKEN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX INFO: renamed from: wk1$b */
    public enum EnumC14653b {
        UNKNOWN,
        OBJECT,
        ARRAY,
        NUMBER,
        STRING,
        KEY,
        TOKEN
    }

    public wk1(String str) {
        this.f94463a = str;
    }

    private sk1 createElement(sk1 sk1Var, int i, EnumC14653b enumC14653b, boolean z, char[] cArr) {
        sk1 sk1VarAllocate;
        if (f94462d) {
            System.out.println("CREATE " + enumC14653b + " at " + cArr[i]);
        }
        switch (C14652a.f94466a[enumC14653b.ordinal()]) {
            case 1:
                sk1VarAllocate = vk1.allocate(cArr);
                i++;
                break;
            case 2:
                sk1VarAllocate = qk1.allocate(cArr);
                i++;
                break;
            case 3:
                sk1VarAllocate = zk1.allocate(cArr);
                break;
            case 4:
                sk1VarAllocate = uk1.allocate(cArr);
                break;
            case 5:
                sk1VarAllocate = tk1.allocate(cArr);
                break;
            case 6:
                sk1VarAllocate = al1.allocate(cArr);
                break;
            default:
                sk1VarAllocate = null;
                break;
        }
        if (sk1VarAllocate == null) {
            return null;
        }
        sk1VarAllocate.setLine(this.f94465c);
        if (z) {
            sk1VarAllocate.setStart(i);
        }
        if (sk1Var instanceof rk1) {
            sk1VarAllocate.setContainer((rk1) sk1Var);
        }
        return sk1VarAllocate;
    }

    private sk1 getNextJsonElement(int i, char c, sk1 sk1Var, char[] cArr) throws xk1 {
        if (c == '\t' || c == '\n' || c == '\r' || c == ' ') {
            return sk1Var;
        }
        if (c == '\"' || c == '\'') {
            return sk1Var instanceof vk1 ? createElement(sk1Var, i, EnumC14653b.KEY, true, cArr) : createElement(sk1Var, i, EnumC14653b.STRING, true, cArr);
        }
        if (c == '[') {
            return createElement(sk1Var, i, EnumC14653b.ARRAY, true, cArr);
        }
        if (c != ']') {
            if (c == '{') {
                return createElement(sk1Var, i, EnumC14653b.OBJECT, true, cArr);
            }
            if (c != '}') {
                switch (c) {
                    case '+':
                    case '-':
                    case '.':
                    case '0':
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':
                        return createElement(sk1Var, i, EnumC14653b.NUMBER, true, cArr);
                    case ',':
                    case ':':
                        return sk1Var;
                    case '/':
                        int i2 = i + 1;
                        if (i2 >= cArr.length || cArr[i2] != '/') {
                            return sk1Var;
                        }
                        this.f94464b = true;
                        return sk1Var;
                    default:
                        if (!(sk1Var instanceof rk1) || (sk1Var instanceof vk1)) {
                            return createElement(sk1Var, i, EnumC14653b.KEY, true, cArr);
                        }
                        sk1 sk1VarCreateElement = createElement(sk1Var, i, EnumC14653b.TOKEN, true, cArr);
                        al1 al1Var = (al1) sk1VarCreateElement;
                        if (al1Var.validate(c, i)) {
                            return sk1VarCreateElement;
                        }
                        throw new xk1("incorrect token <" + c + "> at line " + this.f94465c, al1Var);
                }
            }
        }
        sk1Var.setEnd(i - 1);
        sk1 container = sk1Var.getContainer();
        container.setEnd(i);
        return container;
    }

    public static vk1 parse(String str) throws xk1 {
        return new wk1(str).parse();
    }

    public vk1 parse() throws xk1 {
        char[] charArray = this.f94463a.toCharArray();
        int length = charArray.length;
        int i = 1;
        this.f94465c = 1;
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                i2 = -1;
                break;
            }
            char c = charArray[i2];
            if (c == '{') {
                break;
            }
            if (c == '\n') {
                this.f94465c++;
            }
            i2++;
        }
        if (i2 == -1) {
            throw new xk1("invalid json content", null);
        }
        vk1 vk1VarAllocate = vk1.allocate(charArray);
        vk1VarAllocate.setLine(this.f94465c);
        vk1VarAllocate.setStart(i2);
        int i3 = i2 + 1;
        sk1 container = vk1VarAllocate;
        while (i3 < length) {
            char c2 = charArray[i3];
            if (c2 == '\n') {
                this.f94465c += i;
            }
            if (this.f94464b) {
                if (c2 == '\n') {
                    this.f94464b = z;
                } else {
                    continue;
                    i3++;
                    i = 1;
                    z = false;
                }
            }
            if (container == null) {
                break;
            }
            if (container.isDone()) {
                container = getNextJsonElement(i3, c2, container, charArray);
            } else if (container instanceof vk1) {
                if (c2 == '}') {
                    container.setEnd(i3 - 1);
                } else {
                    container = getNextJsonElement(i3, c2, container, charArray);
                }
            } else if (!(container instanceof qk1)) {
                boolean z2 = container instanceof zk1;
                if (z2) {
                    long j = container.f82095b;
                    if (charArray[(int) j] == c2) {
                        container.setStart(j + 1);
                        container.setEnd(i3 - 1);
                    }
                } else {
                    if (container instanceof al1) {
                        al1 al1Var = (al1) container;
                        if (!al1Var.validate(c2, i3)) {
                            throw new xk1("parsing incorrect token " + al1Var.content() + " at line " + this.f94465c, al1Var);
                        }
                    }
                    if ((container instanceof tk1) || z2) {
                        long j2 = container.f82095b;
                        char c3 = charArray[(int) j2];
                        if ((c3 == '\'' || c3 == '\"') && c3 == c2) {
                            container.setStart(j2 + 1);
                            container.setEnd(i3 - 1);
                        }
                    }
                    if (!container.isDone() && (c2 == '}' || c2 == ']' || c2 == ',' || c2 == ' ' || c2 == '\t' || c2 == '\r' || c2 == '\n' || c2 == ':')) {
                        long j3 = i3 - 1;
                        container.setEnd(j3);
                        if (c2 == '}' || c2 == ']') {
                            container = container.getContainer();
                            container.setEnd(j3);
                            if (container instanceof tk1) {
                                container = container.getContainer();
                                container.setEnd(j3);
                            }
                        }
                    }
                }
            } else if (c2 == ']') {
                container.setEnd(i3 - 1);
            } else {
                container = getNextJsonElement(i3, c2, container, charArray);
            }
            if (container.isDone() && (!(container instanceof tk1) || ((tk1) container).f78534C.size() > 0)) {
                container = container.getContainer();
            }
            i3++;
            i = 1;
            z = false;
        }
        while (container != null && !container.isDone()) {
            if (container instanceof zk1) {
                container.setStart(((int) container.f82095b) + 1);
            }
            container.setEnd(length - 1);
            container = container.getContainer();
        }
        if (f94462d) {
            System.out.println("Root: " + vk1VarAllocate.toJSON());
        }
        return vk1VarAllocate;
    }
}
