package p000;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p000.iu2;
import p000.yv0;

/* JADX INFO: loaded from: classes.dex */
public class o64 {

    /* JADX INFO: renamed from: j */
    public static final boolean f66535j = true;

    /* JADX INFO: renamed from: a */
    public ju2 f66536a;

    /* JADX INFO: renamed from: d */
    public ju2 f66539d;

    /* JADX INFO: renamed from: b */
    public boolean f66537b = true;

    /* JADX INFO: renamed from: c */
    public boolean f66538c = true;

    /* JADX INFO: renamed from: e */
    public ArrayList<wki> f66540e = new ArrayList<>();

    /* JADX INFO: renamed from: f */
    public ArrayList<zce> f66541f = new ArrayList<>();

    /* JADX INFO: renamed from: g */
    public yv0.InterfaceC15818b f66542g = null;

    /* JADX INFO: renamed from: h */
    public yv0.C15817a f66543h = new yv0.C15817a();

    /* JADX INFO: renamed from: i */
    public ArrayList<zce> f66544i = new ArrayList<>();

    public o64(ju2 ju2Var) {
        this.f66536a = ju2Var;
        this.f66539d = ju2Var;
    }

    private void applyGroup(p64 p64Var, int i, int i2, p64 p64Var2, ArrayList<zce> arrayList, zce zceVar) {
        wki wkiVar = p64Var.f69820d;
        if (wkiVar.f94564c == null) {
            ju2 ju2Var = this.f66536a;
            if (wkiVar == ju2Var.f48382e || wkiVar == ju2Var.f48384f) {
                return;
            }
            if (zceVar == null) {
                zceVar = new zce(wkiVar, i2);
                arrayList.add(zceVar);
            }
            wkiVar.f94564c = zceVar;
            zceVar.add(wkiVar);
            for (j64 j64Var : wkiVar.f94569h.f69827k) {
                if (j64Var instanceof p64) {
                    applyGroup((p64) j64Var, i, 0, p64Var2, arrayList, zceVar);
                }
            }
            for (j64 j64Var2 : wkiVar.f94570i.f69827k) {
                if (j64Var2 instanceof p64) {
                    applyGroup((p64) j64Var2, i, 1, p64Var2, arrayList, zceVar);
                }
            }
            if (i == 1 && (wkiVar instanceof k5i)) {
                for (j64 j64Var3 : ((k5i) wkiVar).f52615k.f69827k) {
                    if (j64Var3 instanceof p64) {
                        applyGroup((p64) j64Var3, i, 2, p64Var2, arrayList, zceVar);
                    }
                }
            }
            for (p64 p64Var3 : wkiVar.f94569h.f69828l) {
                if (p64Var3 == p64Var2) {
                    zceVar.f104799b = true;
                }
                applyGroup(p64Var3, i, 0, p64Var2, arrayList, zceVar);
            }
            for (p64 p64Var4 : wkiVar.f94570i.f69828l) {
                if (p64Var4 == p64Var2) {
                    zceVar.f104799b = true;
                }
                applyGroup(p64Var4, i, 1, p64Var2, arrayList, zceVar);
            }
            if (i == 1 && (wkiVar instanceof k5i)) {
                Iterator<p64> it = ((k5i) wkiVar).f52615k.f69828l.iterator();
                while (it.hasNext()) {
                    applyGroup(it.next(), i, 2, p64Var2, arrayList, zceVar);
                }
            }
        }
    }

    private boolean basicMeasureWidgets(ju2 ju2Var) {
        int width;
        iu2.EnumC7619b enumC7619b;
        int height;
        iu2.EnumC7619b enumC7619b2;
        iu2.EnumC7619b enumC7619b3;
        iu2.EnumC7619b enumC7619b4;
        for (iu2 iu2Var : ju2Var.f85148A1) {
            iu2.EnumC7619b[] enumC7619bArr = iu2Var.f48377b0;
            iu2.EnumC7619b enumC7619b5 = enumC7619bArr[0];
            iu2.EnumC7619b enumC7619b6 = enumC7619bArr[1];
            if (iu2Var.getVisibility() == 8) {
                iu2Var.f48374a = true;
            } else {
                if (iu2Var.f48330B < 1.0f && enumC7619b5 == iu2.EnumC7619b.MATCH_CONSTRAINT) {
                    iu2Var.f48418w = 2;
                }
                if (iu2Var.f48336E < 1.0f && enumC7619b6 == iu2.EnumC7619b.MATCH_CONSTRAINT) {
                    iu2Var.f48420x = 2;
                }
                if (iu2Var.getDimensionRatio() > 0.0f) {
                    iu2.EnumC7619b enumC7619b7 = iu2.EnumC7619b.MATCH_CONSTRAINT;
                    if (enumC7619b5 == enumC7619b7 && (enumC7619b6 == iu2.EnumC7619b.WRAP_CONTENT || enumC7619b6 == iu2.EnumC7619b.FIXED)) {
                        iu2Var.f48418w = 3;
                    } else if (enumC7619b6 == enumC7619b7 && (enumC7619b5 == iu2.EnumC7619b.WRAP_CONTENT || enumC7619b5 == iu2.EnumC7619b.FIXED)) {
                        iu2Var.f48420x = 3;
                    } else if (enumC7619b5 == enumC7619b7 && enumC7619b6 == enumC7619b7) {
                        if (iu2Var.f48418w == 0) {
                            iu2Var.f48418w = 3;
                        }
                        if (iu2Var.f48420x == 0) {
                            iu2Var.f48420x = 3;
                        }
                    }
                }
                iu2.EnumC7619b enumC7619b8 = iu2.EnumC7619b.MATCH_CONSTRAINT;
                if (enumC7619b5 == enumC7619b8 && iu2Var.f48418w == 1 && (iu2Var.f48360Q.f27600f == null || iu2Var.f48364S.f27600f == null)) {
                    enumC7619b5 = iu2.EnumC7619b.WRAP_CONTENT;
                }
                iu2.EnumC7619b enumC7619b9 = enumC7619b5;
                if (enumC7619b6 == enumC7619b8 && iu2Var.f48420x == 1 && (iu2Var.f48362R.f27600f == null || iu2Var.f48366T.f27600f == null)) {
                    enumC7619b6 = iu2.EnumC7619b.WRAP_CONTENT;
                }
                iu2.EnumC7619b enumC7619b10 = enumC7619b6;
                rl7 rl7Var = iu2Var.f48382e;
                rl7Var.f94565d = enumC7619b9;
                int i = iu2Var.f48418w;
                rl7Var.f94562a = i;
                k5i k5iVar = iu2Var.f48384f;
                k5iVar.f94565d = enumC7619b10;
                int i2 = iu2Var.f48420x;
                k5iVar.f94562a = i2;
                iu2.EnumC7619b enumC7619b11 = iu2.EnumC7619b.MATCH_PARENT;
                if ((enumC7619b9 == enumC7619b11 || enumC7619b9 == iu2.EnumC7619b.FIXED || enumC7619b9 == iu2.EnumC7619b.WRAP_CONTENT) && (enumC7619b10 == enumC7619b11 || enumC7619b10 == iu2.EnumC7619b.FIXED || enumC7619b10 == iu2.EnumC7619b.WRAP_CONTENT)) {
                    int width2 = iu2Var.getWidth();
                    if (enumC7619b9 == enumC7619b11) {
                        width = (ju2Var.getWidth() - iu2Var.f48360Q.f27601g) - iu2Var.f48364S.f27601g;
                        enumC7619b = iu2.EnumC7619b.FIXED;
                    } else {
                        width = width2;
                        enumC7619b = enumC7619b9;
                    }
                    int height2 = iu2Var.getHeight();
                    if (enumC7619b10 == enumC7619b11) {
                        height = (ju2Var.getHeight() - iu2Var.f48362R.f27601g) - iu2Var.f48366T.f27601g;
                        enumC7619b2 = iu2.EnumC7619b.FIXED;
                    } else {
                        height = height2;
                        enumC7619b2 = enumC7619b10;
                    }
                    measure(iu2Var, enumC7619b, width, enumC7619b2, height);
                    iu2Var.f48382e.f94566e.resolve(iu2Var.getWidth());
                    iu2Var.f48384f.f94566e.resolve(iu2Var.getHeight());
                    iu2Var.f48374a = true;
                } else {
                    if (enumC7619b9 == enumC7619b8 && (enumC7619b10 == (enumC7619b4 = iu2.EnumC7619b.WRAP_CONTENT) || enumC7619b10 == iu2.EnumC7619b.FIXED)) {
                        if (i == 3) {
                            if (enumC7619b10 == enumC7619b4) {
                                measure(iu2Var, enumC7619b4, 0, enumC7619b4, 0);
                            }
                            int height3 = iu2Var.getHeight();
                            int i3 = (int) ((height3 * iu2Var.f48385f0) + 0.5f);
                            iu2.EnumC7619b enumC7619b12 = iu2.EnumC7619b.FIXED;
                            measure(iu2Var, enumC7619b12, i3, enumC7619b12, height3);
                            iu2Var.f48382e.f94566e.resolve(iu2Var.getWidth());
                            iu2Var.f48384f.f94566e.resolve(iu2Var.getHeight());
                            iu2Var.f48374a = true;
                        } else if (i == 1) {
                            measure(iu2Var, enumC7619b4, 0, enumC7619b10, 0);
                            iu2Var.f48382e.f94566e.f1116m = iu2Var.getWidth();
                        } else if (i == 2) {
                            iu2.EnumC7619b enumC7619b13 = ju2Var.f48377b0[0];
                            iu2.EnumC7619b enumC7619b14 = iu2.EnumC7619b.FIXED;
                            if (enumC7619b13 == enumC7619b14 || enumC7619b13 == enumC7619b11) {
                                measure(iu2Var, enumC7619b14, (int) ((iu2Var.f48330B * ju2Var.getWidth()) + 0.5f), enumC7619b10, iu2Var.getHeight());
                                iu2Var.f48382e.f94566e.resolve(iu2Var.getWidth());
                                iu2Var.f48384f.f94566e.resolve(iu2Var.getHeight());
                                iu2Var.f48374a = true;
                            }
                        } else {
                            cu2[] cu2VarArr = iu2Var.f48372Y;
                            if (cu2VarArr[0].f27600f == null || cu2VarArr[1].f27600f == null) {
                                measure(iu2Var, enumC7619b4, 0, enumC7619b10, 0);
                                iu2Var.f48382e.f94566e.resolve(iu2Var.getWidth());
                                iu2Var.f48384f.f94566e.resolve(iu2Var.getHeight());
                                iu2Var.f48374a = true;
                            }
                        }
                    }
                    if (enumC7619b10 == enumC7619b8 && (enumC7619b9 == (enumC7619b3 = iu2.EnumC7619b.WRAP_CONTENT) || enumC7619b9 == iu2.EnumC7619b.FIXED)) {
                        if (i2 == 3) {
                            if (enumC7619b9 == enumC7619b3) {
                                measure(iu2Var, enumC7619b3, 0, enumC7619b3, 0);
                            }
                            int width3 = iu2Var.getWidth();
                            float f = iu2Var.f48385f0;
                            if (iu2Var.getDimensionRatioSide() == -1) {
                                f = 1.0f / f;
                            }
                            iu2.EnumC7619b enumC7619b15 = iu2.EnumC7619b.FIXED;
                            measure(iu2Var, enumC7619b15, width3, enumC7619b15, (int) ((width3 * f) + 0.5f));
                            iu2Var.f48382e.f94566e.resolve(iu2Var.getWidth());
                            iu2Var.f48384f.f94566e.resolve(iu2Var.getHeight());
                            iu2Var.f48374a = true;
                        } else if (i2 == 1) {
                            measure(iu2Var, enumC7619b9, 0, enumC7619b3, 0);
                            iu2Var.f48384f.f94566e.f1116m = iu2Var.getHeight();
                        } else if (i2 == 2) {
                            iu2.EnumC7619b enumC7619b16 = ju2Var.f48377b0[1];
                            iu2.EnumC7619b enumC7619b17 = iu2.EnumC7619b.FIXED;
                            if (enumC7619b16 == enumC7619b17 || enumC7619b16 == enumC7619b11) {
                                measure(iu2Var, enumC7619b9, iu2Var.getWidth(), enumC7619b17, (int) ((iu2Var.f48336E * ju2Var.getHeight()) + 0.5f));
                                iu2Var.f48382e.f94566e.resolve(iu2Var.getWidth());
                                iu2Var.f48384f.f94566e.resolve(iu2Var.getHeight());
                                iu2Var.f48374a = true;
                            }
                        } else {
                            cu2[] cu2VarArr2 = iu2Var.f48372Y;
                            if (cu2VarArr2[2].f27600f == null || cu2VarArr2[3].f27600f == null) {
                                measure(iu2Var, enumC7619b3, 0, enumC7619b10, 0);
                                iu2Var.f48382e.f94566e.resolve(iu2Var.getWidth());
                                iu2Var.f48384f.f94566e.resolve(iu2Var.getHeight());
                                iu2Var.f48374a = true;
                            }
                        }
                    }
                    if (enumC7619b9 == enumC7619b8 && enumC7619b10 == enumC7619b8) {
                        if (i == 1 || i2 == 1) {
                            iu2.EnumC7619b enumC7619b18 = iu2.EnumC7619b.WRAP_CONTENT;
                            measure(iu2Var, enumC7619b18, 0, enumC7619b18, 0);
                            iu2Var.f48382e.f94566e.f1116m = iu2Var.getWidth();
                            iu2Var.f48384f.f94566e.f1116m = iu2Var.getHeight();
                        } else if (i2 == 2 && i == 2) {
                            iu2.EnumC7619b[] enumC7619bArr2 = ju2Var.f48377b0;
                            iu2.EnumC7619b enumC7619b19 = enumC7619bArr2[0];
                            iu2.EnumC7619b enumC7619b20 = iu2.EnumC7619b.FIXED;
                            if (enumC7619b19 == enumC7619b20 && enumC7619bArr2[1] == enumC7619b20) {
                                measure(iu2Var, enumC7619b20, (int) ((iu2Var.f48330B * ju2Var.getWidth()) + 0.5f), enumC7619b20, (int) ((iu2Var.f48336E * ju2Var.getHeight()) + 0.5f));
                                iu2Var.f48382e.f94566e.resolve(iu2Var.getWidth());
                                iu2Var.f48384f.f94566e.resolve(iu2Var.getHeight());
                                iu2Var.f48374a = true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    private int computeWrap(ju2 ju2Var, int i) {
        int size = this.f66544i.size();
        long jMax = 0;
        for (int i2 = 0; i2 < size; i2++) {
            jMax = Math.max(jMax, this.f66544i.get(i2).computeWrapSize(ju2Var, i));
        }
        return (int) jMax;
    }

    private void displayGraph() {
        Iterator<wki> it = this.f66540e.iterator();
        String strGenerateDisplayGraph = "digraph {\n";
        while (it.hasNext()) {
            strGenerateDisplayGraph = generateDisplayGraph(it.next(), strGenerateDisplayGraph);
        }
        String str = strGenerateDisplayGraph + "\n}\n";
        System.out.println("content:<<\n" + str + "\n>>");
    }

    private void findGroup(wki wkiVar, int i, ArrayList<zce> arrayList) {
        for (j64 j64Var : wkiVar.f94569h.f69827k) {
            if (j64Var instanceof p64) {
                applyGroup((p64) j64Var, i, 0, wkiVar.f94570i, arrayList, null);
            } else if (j64Var instanceof wki) {
                applyGroup(((wki) j64Var).f94569h, i, 0, wkiVar.f94570i, arrayList, null);
            }
        }
        for (j64 j64Var2 : wkiVar.f94570i.f69827k) {
            if (j64Var2 instanceof p64) {
                applyGroup((p64) j64Var2, i, 1, wkiVar.f94569h, arrayList, null);
            } else if (j64Var2 instanceof wki) {
                applyGroup(((wki) j64Var2).f94570i, i, 1, wkiVar.f94569h, arrayList, null);
            }
        }
        if (i == 1) {
            for (j64 j64Var3 : ((k5i) wkiVar).f52615k.f69827k) {
                if (j64Var3 instanceof p64) {
                    applyGroup((p64) j64Var3, i, 2, null, arrayList, null);
                }
            }
        }
    }

    private String generateChainDisplayGraph(tt1 tt1Var, String str) {
        int i = tt1Var.f94567f;
        StringBuilder sb = new StringBuilder("subgraph ");
        sb.append("cluster_");
        sb.append(tt1Var.f94563b.getDebugName());
        if (i == 0) {
            sb.append("_h");
        } else {
            sb.append("_v");
        }
        sb.append(" {\n");
        String strGenerateDisplayGraph = "";
        for (wki wkiVar : tt1Var.f85803k) {
            sb.append(wkiVar.f94563b.getDebugName());
            if (i == 0) {
                sb.append("_HORIZONTAL");
            } else {
                sb.append("_VERTICAL");
            }
            sb.append(";\n");
            strGenerateDisplayGraph = generateDisplayGraph(wkiVar, strGenerateDisplayGraph);
        }
        sb.append("}\n");
        return str + strGenerateDisplayGraph + ((Object) sb);
    }

    private String generateDisplayGraph(wki wkiVar, String str) {
        boolean z;
        p64 p64Var = wkiVar.f94569h;
        p64 p64Var2 = wkiVar.f94570i;
        StringBuilder sb = new StringBuilder(str);
        if (!(wkiVar instanceof pj7) && p64Var.f69827k.isEmpty() && (p64Var2.f69827k.isEmpty() && p64Var.f69828l.isEmpty()) && p64Var2.f69828l.isEmpty()) {
            return str;
        }
        sb.append(nodeDefinition(wkiVar));
        boolean zIsCenteredConnection = isCenteredConnection(p64Var, p64Var2);
        String strGenerateDisplayNode = generateDisplayNode(p64Var2, zIsCenteredConnection, generateDisplayNode(p64Var, zIsCenteredConnection, str));
        boolean z2 = wkiVar instanceof k5i;
        if (z2) {
            strGenerateDisplayNode = generateDisplayNode(((k5i) wkiVar).f52615k, zIsCenteredConnection, strGenerateDisplayNode);
        }
        if ((wkiVar instanceof rl7) || (((z = wkiVar instanceof tt1)) && ((tt1) wkiVar).f94567f == 0)) {
            iu2.EnumC7619b horizontalDimensionBehaviour = wkiVar.f94563b.getHorizontalDimensionBehaviour();
            if (horizontalDimensionBehaviour == iu2.EnumC7619b.FIXED || horizontalDimensionBehaviour == iu2.EnumC7619b.WRAP_CONTENT) {
                if (!p64Var.f69828l.isEmpty() && p64Var2.f69828l.isEmpty()) {
                    sb.append("\n");
                    sb.append(p64Var2.name());
                    sb.append(" -> ");
                    sb.append(p64Var.name());
                    sb.append("\n");
                } else if (p64Var.f69828l.isEmpty() && !p64Var2.f69828l.isEmpty()) {
                    sb.append("\n");
                    sb.append(p64Var.name());
                    sb.append(" -> ");
                    sb.append(p64Var2.name());
                    sb.append("\n");
                }
            } else if (horizontalDimensionBehaviour == iu2.EnumC7619b.MATCH_CONSTRAINT && wkiVar.f94563b.getDimensionRatio() > 0.0f) {
                sb.append("\n");
                sb.append(wkiVar.f94563b.getDebugName());
                sb.append("_HORIZONTAL -> ");
                sb.append(wkiVar.f94563b.getDebugName());
                sb.append("_VERTICAL;\n");
            }
        } else if (z2 || (z && ((tt1) wkiVar).f94567f == 1)) {
            iu2.EnumC7619b verticalDimensionBehaviour = wkiVar.f94563b.getVerticalDimensionBehaviour();
            if (verticalDimensionBehaviour == iu2.EnumC7619b.FIXED || verticalDimensionBehaviour == iu2.EnumC7619b.WRAP_CONTENT) {
                if (!p64Var.f69828l.isEmpty() && p64Var2.f69828l.isEmpty()) {
                    sb.append("\n");
                    sb.append(p64Var2.name());
                    sb.append(" -> ");
                    sb.append(p64Var.name());
                    sb.append("\n");
                } else if (p64Var.f69828l.isEmpty() && !p64Var2.f69828l.isEmpty()) {
                    sb.append("\n");
                    sb.append(p64Var.name());
                    sb.append(" -> ");
                    sb.append(p64Var2.name());
                    sb.append("\n");
                }
            } else if (verticalDimensionBehaviour == iu2.EnumC7619b.MATCH_CONSTRAINT && wkiVar.f94563b.getDimensionRatio() > 0.0f) {
                sb.append("\n");
                sb.append(wkiVar.f94563b.getDebugName());
                sb.append("_VERTICAL -> ");
                sb.append(wkiVar.f94563b.getDebugName());
                sb.append("_HORIZONTAL;\n");
            }
        }
        return wkiVar instanceof tt1 ? generateChainDisplayGraph((tt1) wkiVar, strGenerateDisplayNode) : sb.toString();
    }

    private String generateDisplayNode(p64 p64Var, boolean z, String str) {
        StringBuilder sb = new StringBuilder(str);
        for (p64 p64Var2 : p64Var.f69828l) {
            String str2 = ("\n" + p64Var.name()) + " -> " + p64Var2.name();
            if (p64Var.f69822f > 0 || z || (p64Var.f69820d instanceof pj7)) {
                String str3 = str2 + "[";
                if (p64Var.f69822f > 0) {
                    str3 = str3 + "label=\"" + p64Var.f69822f + "\"";
                    if (z) {
                        str3 = str3 + ",";
                    }
                }
                if (z) {
                    str3 = str3 + " style=dashed ";
                }
                if (p64Var.f69820d instanceof pj7) {
                    str3 = str3 + " style=bold,color=gray ";
                }
                str2 = str3 + "]";
            }
            sb.append(str2 + "\n");
        }
        return sb.toString();
    }

    private boolean isCenteredConnection(p64 p64Var, p64 p64Var2) {
        Iterator<p64> it = p64Var.f69828l.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (it.next() != p64Var2) {
                i++;
            }
        }
        Iterator<p64> it2 = p64Var2.f69828l.iterator();
        int i2 = 0;
        while (it2.hasNext()) {
            if (it2.next() != p64Var) {
                i2++;
            }
        }
        return i > 0 && i2 > 0;
    }

    private void measure(iu2 iu2Var, iu2.EnumC7619b enumC7619b, int i, iu2.EnumC7619b enumC7619b2, int i2) {
        yv0.C15817a c15817a = this.f66543h;
        c15817a.f103047a = enumC7619b;
        c15817a.f103048b = enumC7619b2;
        c15817a.f103049c = i;
        c15817a.f103050d = i2;
        this.f66542g.measure(iu2Var, c15817a);
        iu2Var.setWidth(this.f66543h.f103051e);
        iu2Var.setHeight(this.f66543h.f103052f);
        iu2Var.setHasBaseline(this.f66543h.f103054h);
        iu2Var.setBaselineDistance(this.f66543h.f103053g);
    }

    private String nodeDefinition(wki wkiVar) {
        boolean z = wkiVar instanceof k5i;
        String debugName = wkiVar.f94563b.getDebugName();
        StringBuilder sb = new StringBuilder(debugName);
        iu2 iu2Var = wkiVar.f94563b;
        iu2.EnumC7619b horizontalDimensionBehaviour = !z ? iu2Var.getHorizontalDimensionBehaviour() : iu2Var.getVerticalDimensionBehaviour();
        zce zceVar = wkiVar.f94564c;
        if (z) {
            sb.append("_VERTICAL");
        } else {
            sb.append("_HORIZONTAL");
        }
        sb.append(" [shape=none, label=<");
        sb.append("<TABLE BORDER=\"0\" CELLSPACING=\"0\" CELLPADDING=\"2\">");
        sb.append("  <TR>");
        if (z) {
            sb.append("    <TD ");
            if (wkiVar.f94569h.f69826j) {
                sb.append(" BGCOLOR=\"green\"");
            }
            sb.append(" PORT=\"TOP\" BORDER=\"1\">T</TD>");
        } else {
            sb.append("    <TD ");
            if (wkiVar.f94569h.f69826j) {
                sb.append(" BGCOLOR=\"green\"");
            }
            sb.append(" PORT=\"LEFT\" BORDER=\"1\">L</TD>");
        }
        sb.append("    <TD BORDER=\"1\" ");
        boolean z2 = wkiVar.f94566e.f69826j;
        if (z2 && !wkiVar.f94563b.f48374a) {
            sb.append(" BGCOLOR=\"green\" ");
        } else if (z2) {
            sb.append(" BGCOLOR=\"lightgray\" ");
        } else if (wkiVar.f94563b.f48374a) {
            sb.append(" BGCOLOR=\"yellow\" ");
        }
        if (horizontalDimensionBehaviour == iu2.EnumC7619b.MATCH_CONSTRAINT) {
            sb.append("style=\"dashed\"");
        }
        sb.append(">");
        sb.append(debugName);
        if (zceVar != null) {
            sb.append(" [");
            sb.append(zceVar.f104803f + 1);
            sb.append(pj4.f71071b);
            sb.append(zce.f104797k);
            sb.append("]");
        }
        sb.append(" </TD>");
        if (z) {
            sb.append("    <TD ");
            if (((k5i) wkiVar).f52615k.f69826j) {
                sb.append(" BGCOLOR=\"green\"");
            }
            sb.append(" PORT=\"BASELINE\" BORDER=\"1\">b</TD>");
            sb.append("    <TD ");
            if (wkiVar.f94570i.f69826j) {
                sb.append(" BGCOLOR=\"green\"");
            }
            sb.append(" PORT=\"BOTTOM\" BORDER=\"1\">B</TD>");
        } else {
            sb.append("    <TD ");
            if (wkiVar.f94570i.f69826j) {
                sb.append(" BGCOLOR=\"green\"");
            }
            sb.append(" PORT=\"RIGHT\" BORDER=\"1\">R</TD>");
        }
        sb.append("  </TR></TABLE>");
        sb.append(">];\n");
        return sb.toString();
    }

    public void buildGraph() {
        buildGraph(this.f66540e);
        this.f66544i.clear();
        zce.f104797k = 0;
        findGroup(this.f66536a.f48382e, 0, this.f66544i);
        findGroup(this.f66536a.f48384f, 1, this.f66544i);
        this.f66537b = false;
    }

    public void defineTerminalWidgets(iu2.EnumC7619b enumC7619b, iu2.EnumC7619b enumC7619b2) {
        if (this.f66537b) {
            buildGraph();
            boolean z = false;
            for (iu2 iu2Var : this.f66536a.f85148A1) {
                boolean[] zArr = iu2Var.f48386g;
                zArr[0] = true;
                zArr[1] = true;
                if (iu2Var instanceof zp0) {
                    z = true;
                }
            }
            if (z) {
                return;
            }
            for (zce zceVar : this.f66544i) {
                iu2.EnumC7619b enumC7619b3 = iu2.EnumC7619b.WRAP_CONTENT;
                zceVar.defineTerminalWidgets(enumC7619b == enumC7619b3, enumC7619b2 == enumC7619b3);
            }
        }
    }

    public boolean directMeasure(boolean z) {
        boolean z2;
        boolean z3 = false;
        if (this.f66537b || this.f66538c) {
            for (iu2 iu2Var : this.f66536a.f85148A1) {
                iu2Var.ensureWidgetRuns();
                iu2Var.f48374a = false;
                iu2Var.f48382e.mo9898h();
                iu2Var.f48384f.mo9898h();
            }
            this.f66536a.ensureWidgetRuns();
            ju2 ju2Var = this.f66536a;
            ju2Var.f48374a = false;
            ju2Var.f48382e.mo9898h();
            this.f66536a.f48384f.mo9898h();
            this.f66538c = false;
        }
        if (basicMeasureWidgets(this.f66539d)) {
            return false;
        }
        this.f66536a.setX(0);
        this.f66536a.setY(0);
        iu2.EnumC7619b dimensionBehaviour = this.f66536a.getDimensionBehaviour(0);
        iu2.EnumC7619b dimensionBehaviour2 = this.f66536a.getDimensionBehaviour(1);
        if (this.f66537b) {
            buildGraph();
        }
        int x = this.f66536a.getX();
        int y = this.f66536a.getY();
        this.f66536a.f48382e.f94569h.resolve(x);
        this.f66536a.f48384f.f94569h.resolve(y);
        measureWidgets();
        iu2.EnumC7619b enumC7619b = iu2.EnumC7619b.WRAP_CONTENT;
        if (dimensionBehaviour == enumC7619b || dimensionBehaviour2 == enumC7619b) {
            if (z) {
                Iterator<wki> it = this.f66540e.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (!it.next().mo9899i()) {
                        z = false;
                        break;
                    }
                }
            }
            if (z && dimensionBehaviour == iu2.EnumC7619b.WRAP_CONTENT) {
                this.f66536a.setHorizontalDimensionBehaviour(iu2.EnumC7619b.FIXED);
                ju2 ju2Var2 = this.f66536a;
                ju2Var2.setWidth(computeWrap(ju2Var2, 0));
                ju2 ju2Var3 = this.f66536a;
                ju2Var3.f48382e.f94566e.resolve(ju2Var3.getWidth());
            }
            if (z && dimensionBehaviour2 == iu2.EnumC7619b.WRAP_CONTENT) {
                this.f66536a.setVerticalDimensionBehaviour(iu2.EnumC7619b.FIXED);
                ju2 ju2Var4 = this.f66536a;
                ju2Var4.setHeight(computeWrap(ju2Var4, 1));
                ju2 ju2Var5 = this.f66536a;
                ju2Var5.f48384f.f94566e.resolve(ju2Var5.getHeight());
            }
        }
        ju2 ju2Var6 = this.f66536a;
        iu2.EnumC7619b enumC7619b2 = ju2Var6.f48377b0[0];
        iu2.EnumC7619b enumC7619b3 = iu2.EnumC7619b.FIXED;
        if (enumC7619b2 == enumC7619b3 || enumC7619b2 == iu2.EnumC7619b.MATCH_PARENT) {
            int width = ju2Var6.getWidth() + x;
            this.f66536a.f48382e.f94570i.resolve(width);
            this.f66536a.f48382e.f94566e.resolve(width - x);
            measureWidgets();
            ju2 ju2Var7 = this.f66536a;
            iu2.EnumC7619b enumC7619b4 = ju2Var7.f48377b0[1];
            if (enumC7619b4 == enumC7619b3 || enumC7619b4 == iu2.EnumC7619b.MATCH_PARENT) {
                int height = ju2Var7.getHeight() + y;
                this.f66536a.f48384f.f94570i.resolve(height);
                this.f66536a.f48384f.f94566e.resolve(height - y);
            }
            measureWidgets();
            z2 = true;
        } else {
            z2 = false;
        }
        for (wki wkiVar : this.f66540e) {
            if (wkiVar.f94563b != this.f66536a || wkiVar.f94568g) {
                wkiVar.applyToWidget();
            }
        }
        Iterator<wki> it2 = this.f66540e.iterator();
        while (true) {
            if (!it2.hasNext()) {
                z3 = true;
                break;
            }
            wki next = it2.next();
            if (z2 || next.f94563b != this.f66536a) {
                if (!next.f94569h.f69826j || ((!next.f94570i.f69826j && !(next instanceof ed7)) || (!next.f94566e.f69826j && !(next instanceof tt1) && !(next instanceof ed7)))) {
                    break;
                }
            }
        }
        this.f66536a.setHorizontalDimensionBehaviour(dimensionBehaviour);
        this.f66536a.setVerticalDimensionBehaviour(dimensionBehaviour2);
        return z3;
    }

    public boolean directMeasureSetup(boolean z) {
        if (this.f66537b) {
            for (iu2 iu2Var : this.f66536a.f85148A1) {
                iu2Var.ensureWidgetRuns();
                iu2Var.f48374a = false;
                rl7 rl7Var = iu2Var.f48382e;
                rl7Var.f94566e.f69826j = false;
                rl7Var.f94568g = false;
                rl7Var.mo9898h();
                k5i k5iVar = iu2Var.f48384f;
                k5iVar.f94566e.f69826j = false;
                k5iVar.f94568g = false;
                k5iVar.mo9898h();
            }
            this.f66536a.ensureWidgetRuns();
            ju2 ju2Var = this.f66536a;
            ju2Var.f48374a = false;
            rl7 rl7Var2 = ju2Var.f48382e;
            rl7Var2.f94566e.f69826j = false;
            rl7Var2.f94568g = false;
            rl7Var2.mo9898h();
            k5i k5iVar2 = this.f66536a.f48384f;
            k5iVar2.f94566e.f69826j = false;
            k5iVar2.f94568g = false;
            k5iVar2.mo9898h();
            buildGraph();
        }
        if (basicMeasureWidgets(this.f66539d)) {
            return false;
        }
        this.f66536a.setX(0);
        this.f66536a.setY(0);
        this.f66536a.f48382e.f94569h.resolve(0);
        this.f66536a.f48384f.f94569h.resolve(0);
        return true;
    }

    public boolean directMeasureWithOrientation(boolean z, int i) {
        boolean z2;
        iu2.EnumC7619b enumC7619b;
        boolean z3 = false;
        iu2.EnumC7619b dimensionBehaviour = this.f66536a.getDimensionBehaviour(0);
        iu2.EnumC7619b dimensionBehaviour2 = this.f66536a.getDimensionBehaviour(1);
        int x = this.f66536a.getX();
        int y = this.f66536a.getY();
        if (z && (dimensionBehaviour == (enumC7619b = iu2.EnumC7619b.WRAP_CONTENT) || dimensionBehaviour2 == enumC7619b)) {
            Iterator<wki> it = this.f66540e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                wki next = it.next();
                if (next.f94567f == i && !next.mo9899i()) {
                    z = false;
                    break;
                }
            }
            if (i == 0) {
                if (z && dimensionBehaviour == iu2.EnumC7619b.WRAP_CONTENT) {
                    this.f66536a.setHorizontalDimensionBehaviour(iu2.EnumC7619b.FIXED);
                    ju2 ju2Var = this.f66536a;
                    ju2Var.setWidth(computeWrap(ju2Var, 0));
                    ju2 ju2Var2 = this.f66536a;
                    ju2Var2.f48382e.f94566e.resolve(ju2Var2.getWidth());
                }
            } else if (z && dimensionBehaviour2 == iu2.EnumC7619b.WRAP_CONTENT) {
                this.f66536a.setVerticalDimensionBehaviour(iu2.EnumC7619b.FIXED);
                ju2 ju2Var3 = this.f66536a;
                ju2Var3.setHeight(computeWrap(ju2Var3, 1));
                ju2 ju2Var4 = this.f66536a;
                ju2Var4.f48384f.f94566e.resolve(ju2Var4.getHeight());
            }
        }
        if (i == 0) {
            ju2 ju2Var5 = this.f66536a;
            iu2.EnumC7619b enumC7619b2 = ju2Var5.f48377b0[0];
            if (enumC7619b2 == iu2.EnumC7619b.FIXED || enumC7619b2 == iu2.EnumC7619b.MATCH_PARENT) {
                int width = ju2Var5.getWidth() + x;
                this.f66536a.f48382e.f94570i.resolve(width);
                this.f66536a.f48382e.f94566e.resolve(width - x);
                z2 = true;
            }
            z2 = false;
        } else {
            ju2 ju2Var6 = this.f66536a;
            iu2.EnumC7619b enumC7619b3 = ju2Var6.f48377b0[1];
            if (enumC7619b3 == iu2.EnumC7619b.FIXED || enumC7619b3 == iu2.EnumC7619b.MATCH_PARENT) {
                int height = ju2Var6.getHeight() + y;
                this.f66536a.f48384f.f94570i.resolve(height);
                this.f66536a.f48384f.f94566e.resolve(height - y);
                z2 = true;
            }
            z2 = false;
        }
        measureWidgets();
        for (wki wkiVar : this.f66540e) {
            if (wkiVar.f94567f == i && (wkiVar.f94563b != this.f66536a || wkiVar.f94568g)) {
                wkiVar.applyToWidget();
            }
        }
        Iterator<wki> it2 = this.f66540e.iterator();
        while (true) {
            if (!it2.hasNext()) {
                z3 = true;
                break;
            }
            wki next2 = it2.next();
            if (next2.f94567f == i && (z2 || next2.f94563b != this.f66536a)) {
                if (!next2.f94569h.f69826j || !next2.f94570i.f69826j || (!(next2 instanceof tt1) && !next2.f94566e.f69826j)) {
                    break;
                }
            }
        }
        this.f66536a.setHorizontalDimensionBehaviour(dimensionBehaviour);
        this.f66536a.setVerticalDimensionBehaviour(dimensionBehaviour2);
        return z3;
    }

    public void invalidateGraph() {
        this.f66537b = true;
    }

    public void invalidateMeasures() {
        this.f66538c = true;
    }

    public void measureWidgets() {
        ad4 ad4Var;
        for (iu2 iu2Var : this.f66536a.f85148A1) {
            if (!iu2Var.f48374a) {
                iu2.EnumC7619b[] enumC7619bArr = iu2Var.f48377b0;
                boolean z = false;
                iu2.EnumC7619b enumC7619b = enumC7619bArr[0];
                iu2.EnumC7619b enumC7619b2 = enumC7619bArr[1];
                int i = iu2Var.f48418w;
                int i2 = iu2Var.f48420x;
                iu2.EnumC7619b enumC7619b3 = iu2.EnumC7619b.WRAP_CONTENT;
                boolean z2 = enumC7619b == enumC7619b3 || (enumC7619b == iu2.EnumC7619b.MATCH_CONSTRAINT && i == 1);
                if (enumC7619b2 == enumC7619b3 || (enumC7619b2 == iu2.EnumC7619b.MATCH_CONSTRAINT && i2 == 1)) {
                    z = true;
                }
                ad4 ad4Var2 = iu2Var.f48382e.f94566e;
                boolean z3 = ad4Var2.f69826j;
                ad4 ad4Var3 = iu2Var.f48384f.f94566e;
                boolean z4 = ad4Var3.f69826j;
                if (z3 && z4) {
                    iu2.EnumC7619b enumC7619b4 = iu2.EnumC7619b.FIXED;
                    measure(iu2Var, enumC7619b4, ad4Var2.f69823g, enumC7619b4, ad4Var3.f69823g);
                    iu2Var.f48374a = true;
                } else if (z3 && z) {
                    measure(iu2Var, iu2.EnumC7619b.FIXED, ad4Var2.f69823g, enumC7619b3, ad4Var3.f69823g);
                    if (enumC7619b2 == iu2.EnumC7619b.MATCH_CONSTRAINT) {
                        iu2Var.f48384f.f94566e.f1116m = iu2Var.getHeight();
                    } else {
                        iu2Var.f48384f.f94566e.resolve(iu2Var.getHeight());
                        iu2Var.f48374a = true;
                    }
                } else if (z4 && z2) {
                    measure(iu2Var, enumC7619b3, ad4Var2.f69823g, iu2.EnumC7619b.FIXED, ad4Var3.f69823g);
                    if (enumC7619b == iu2.EnumC7619b.MATCH_CONSTRAINT) {
                        iu2Var.f48382e.f94566e.f1116m = iu2Var.getWidth();
                    } else {
                        iu2Var.f48382e.f94566e.resolve(iu2Var.getWidth());
                        iu2Var.f48374a = true;
                    }
                }
                if (iu2Var.f48374a && (ad4Var = iu2Var.f48384f.f52616l) != null) {
                    ad4Var.resolve(iu2Var.getBaselineDistance());
                }
            }
        }
    }

    public void setMeasurer(yv0.InterfaceC15818b interfaceC15818b) {
        this.f66542g = interfaceC15818b;
    }

    public void buildGraph(ArrayList<wki> arrayList) {
        arrayList.clear();
        this.f66539d.f48382e.mo9897d();
        this.f66539d.f48384f.mo9897d();
        arrayList.add(this.f66539d.f48382e);
        arrayList.add(this.f66539d.f48384f);
        HashSet hashSet = null;
        for (iu2 iu2Var : this.f66539d.f85148A1) {
            if (iu2Var instanceof dd7) {
                arrayList.add(new ed7(iu2Var));
            } else {
                if (iu2Var.isInHorizontalChain()) {
                    if (iu2Var.f48378c == null) {
                        iu2Var.f48378c = new tt1(iu2Var, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(iu2Var.f48378c);
                } else {
                    arrayList.add(iu2Var.f48382e);
                }
                if (iu2Var.isInVerticalChain()) {
                    if (iu2Var.f48380d == null) {
                        iu2Var.f48380d = new tt1(iu2Var, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(iu2Var.f48380d);
                } else {
                    arrayList.add(iu2Var.f48384f);
                }
                if (iu2Var instanceof qj7) {
                    arrayList.add(new pj7(iu2Var));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator<wki> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().mo9897d();
        }
        for (wki wkiVar : arrayList) {
            if (wkiVar.f94563b != this.f66539d) {
                wkiVar.mo9896c();
            }
        }
    }
}
