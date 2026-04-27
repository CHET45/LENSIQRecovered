package p000;

/* JADX INFO: loaded from: classes8.dex */
public class g89 extends AbstractC5537f0 {

    /* JADX INFO: renamed from: a */
    public final f89 f38988a;

    /* JADX INFO: renamed from: b */
    public boolean f38989b;

    /* JADX INFO: renamed from: c */
    public int f38990c;

    /* JADX INFO: renamed from: g89$a */
    public static class C6164a extends AbstractC6046g0 {
        @Override // p000.n61
        public t61 tryStart(zhc zhcVar, xv9 xv9Var) {
            m61 matchedBlockParser = xv9Var.getMatchedBlockParser();
            if (zhcVar.getIndent() >= bic.f13817k) {
                return t61.none();
            }
            C6165b list = g89.parseList(zhcVar.getLine(), zhcVar.getNextNonSpaceIndex(), zhcVar.getColumn() + zhcVar.getIndent(), xv9Var.getParagraphContent() != null);
            if (list == null) {
                return t61.none();
            }
            int i = list.f38992b;
            g99 g99Var = new g99(i - zhcVar.getColumn());
            if ((matchedBlockParser instanceof g89) && g89.listsMatch((f89) matchedBlockParser.getBlock(), list.f38991a)) {
                return t61.m22390of(g99Var).atColumn(i);
            }
            g89 g89Var = new g89(list.f38991a);
            list.f38991a.setTight(true);
            return t61.m22390of(g89Var, g99Var).atColumn(i);
        }
    }

    /* JADX INFO: renamed from: g89$b */
    public static class C6165b {

        /* JADX INFO: renamed from: a */
        public final f89 f38991a;

        /* JADX INFO: renamed from: b */
        public final int f38992b;

        public C6165b(f89 f89Var, int i) {
            this.f38991a = f89Var;
            this.f38992b = i;
        }
    }

    /* JADX INFO: renamed from: g89$c */
    public static class C6166c {

        /* JADX INFO: renamed from: a */
        public final f89 f38993a;

        /* JADX INFO: renamed from: b */
        public final int f38994b;

        public C6166c(f89 f89Var, int i) {
            this.f38993a = f89Var;
            this.f38994b = i;
        }
    }

    public g89(f89 f89Var) {
        this.f38988a = f89Var;
    }

    private static boolean equals(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    private static boolean isSpaceTabOrEnd(CharSequence charSequence, int i) {
        char cCharAt;
        return i >= charSequence.length() || (cCharAt = charSequence.charAt(i)) == '\t' || cCharAt == ' ';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean listsMatch(f89 f89Var, f89 f89Var2) {
        if ((f89Var instanceof ig1) && (f89Var2 instanceof ig1)) {
            return equals(Character.valueOf(((ig1) f89Var).getBulletMarker()), Character.valueOf(((ig1) f89Var2).getBulletMarker()));
        }
        if ((f89Var instanceof p7c) && (f89Var2 instanceof p7c)) {
            return equals(Character.valueOf(((p7c) f89Var).getDelimiter()), Character.valueOf(((p7c) f89Var2).getDelimiter()));
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static C6165b parseList(CharSequence charSequence, int i, int i2, boolean z) {
        boolean z2;
        C6166c listMarker = parseListMarker(charSequence, i);
        if (listMarker == null) {
            return null;
        }
        f89 f89Var = listMarker.f38993a;
        int i3 = listMarker.f38994b;
        int i4 = i2 + (i3 - i);
        int length = charSequence.length();
        int iColumnsToNextTabStop = i4;
        while (true) {
            if (i3 >= length) {
                z2 = false;
                break;
            }
            char cCharAt = charSequence.charAt(i3);
            if (cCharAt != '\t') {
                if (cCharAt != ' ') {
                    z2 = true;
                    break;
                }
                iColumnsToNextTabStop++;
            } else {
                iColumnsToNextTabStop += bic.columnsToNextTabStop(iColumnsToNextTabStop);
            }
            i3++;
        }
        if (z && (((f89Var instanceof p7c) && ((p7c) f89Var).getStartNumber() != 1) || !z2)) {
            return null;
        }
        if (!z2 || iColumnsToNextTabStop - i4 > bic.f13817k) {
            iColumnsToNextTabStop = i4 + 1;
        }
        return new C6165b(f89Var, iColumnsToNextTabStop);
    }

    private static C6166c parseListMarker(CharSequence charSequence, int i) {
        char cCharAt = charSequence.charAt(i);
        if (cCharAt != '*' && cCharAt != '+' && cCharAt != '-') {
            return parseOrderedList(charSequence, i);
        }
        int i2 = i + 1;
        if (!isSpaceTabOrEnd(charSequence, i2)) {
            return null;
        }
        ig1 ig1Var = new ig1();
        ig1Var.setBulletMarker(cCharAt);
        return new C6166c(ig1Var, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0009  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static p000.g89.C6166c parseOrderedList(java.lang.CharSequence r6, int r7) {
        /*
            int r0 = r6.length()
            r1 = 0
            r2 = r7
        L6:
            r3 = 0
            if (r2 >= r0) goto L4b
            char r4 = r6.charAt(r2)
            r5 = 41
            if (r4 == r5) goto L23
            r5 = 46
            if (r4 == r5) goto L23
            switch(r4) {
                case 48: goto L19;
                case 49: goto L19;
                case 50: goto L19;
                case 51: goto L19;
                case 52: goto L19;
                case 53: goto L19;
                case 54: goto L19;
                case 55: goto L19;
                case 56: goto L19;
                case 57: goto L19;
                default: goto L18;
            }
        L18:
            return r3
        L19:
            int r1 = r1 + 1
            r4 = 9
            if (r1 <= r4) goto L20
            return r3
        L20:
            int r2 = r2 + 1
            goto L6
        L23:
            r0 = 1
            if (r1 < r0) goto L4b
            int r0 = r2 + 1
            boolean r1 = isSpaceTabOrEnd(r6, r0)
            if (r1 == 0) goto L4b
            java.lang.CharSequence r6 = r6.subSequence(r7, r2)
            java.lang.String r6 = r6.toString()
            p7c r7 = new p7c
            r7.<init>()
            int r6 = java.lang.Integer.parseInt(r6)
            r7.setStartNumber(r6)
            r7.setDelimiter(r4)
            g89$c r6 = new g89$c
            r6.<init>(r7, r0)
            return r6
        L4b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.g89.parseOrderedList(java.lang.CharSequence, int):g89$c");
    }

    @Override // p000.AbstractC5537f0, p000.m61
    public boolean canContain(b61 b61Var) {
        if (!(b61Var instanceof f99)) {
            return false;
        }
        if (this.f38989b && this.f38990c == 1) {
            this.f38988a.setTight(false);
            this.f38989b = false;
        }
        return true;
    }

    @Override // p000.m61
    public b61 getBlock() {
        return this.f38988a;
    }

    @Override // p000.AbstractC5537f0, p000.m61
    public boolean isContainer() {
        return true;
    }

    @Override // p000.m61
    public d61 tryContinue(zhc zhcVar) {
        if (zhcVar.isBlank()) {
            this.f38989b = true;
            this.f38990c = 0;
        } else if (this.f38989b) {
            this.f38990c++;
        }
        return d61.atIndex(zhcVar.getIndex());
    }
}
