package p000;

import androidx.recyclerview.widget.DiffUtil;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ps0 extends lt0<os0> {

    /* JADX INFO: renamed from: I */
    public final HashSet<Integer> f71782I;

    public ps0() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ int collapse$default(ps0 ps0Var, int i, boolean z, boolean z2, Object obj, int i2, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: collapse");
        }
        if ((i2 & 2) != 0) {
            z = true;
        }
        if ((i2 & 4) != 0) {
            z2 = true;
        }
        if ((i2 & 8) != 0) {
            obj = null;
        }
        return ps0Var.collapse(i, z, z2, obj);
    }

    public static /* synthetic */ int collapseAndChild$default(ps0 ps0Var, int i, boolean z, boolean z2, Object obj, int i2, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: collapseAndChild");
        }
        if ((i2 & 2) != 0) {
            z = true;
        }
        if ((i2 & 4) != 0) {
            z2 = true;
        }
        if ((i2 & 8) != 0) {
            obj = null;
        }
        return ps0Var.collapseAndChild(i, z, z2, obj);
    }

    public static /* synthetic */ int expand$default(ps0 ps0Var, int i, boolean z, boolean z2, Object obj, int i2, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: expand");
        }
        if ((i2 & 2) != 0) {
            z = true;
        }
        if ((i2 & 4) != 0) {
            z2 = true;
        }
        if ((i2 & 8) != 0) {
            obj = null;
        }
        return ps0Var.expand(i, z, z2, obj);
    }

    public static /* synthetic */ int expandAndChild$default(ps0 ps0Var, int i, boolean z, boolean z2, Object obj, int i2, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: expandAndChild");
        }
        if ((i2 & 2) != 0) {
            z = true;
        }
        if ((i2 & 4) != 0) {
            z2 = true;
        }
        if ((i2 & 8) != 0) {
            obj = null;
        }
        return ps0Var.expandAndChild(i, z, z2, obj);
    }

    public static /* synthetic */ void expandAndCollapseOther$default(ps0 ps0Var, int i, boolean z, boolean z2, boolean z3, boolean z4, Object obj, Object obj2, int i2, Object obj3) {
        if (obj3 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: expandAndCollapseOther");
        }
        ps0Var.expandAndCollapseOther(i, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? true : z2, (i2 & 8) != 0 ? true : z3, (i2 & 16) == 0 ? z4 : true, (i2 & 32) != 0 ? null : obj, (i2 & 64) == 0 ? obj2 : null);
    }

    public static /* synthetic */ int expandOrCollapse$default(ps0 ps0Var, int i, boolean z, boolean z2, Object obj, int i2, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: expandOrCollapse");
        }
        if ((i2 & 2) != 0) {
            z = true;
        }
        if ((i2 & 4) != 0) {
            z2 = true;
        }
        if ((i2 & 8) != 0) {
            obj = null;
        }
        return ps0Var.expandOrCollapse(i, z, z2, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final List<os0> flatData(Collection<? extends os0> collection, Boolean bool) {
        os0 footerNode;
        List<os0> childNode;
        ArrayList arrayList = new ArrayList();
        for (os0 os0Var : collection) {
            arrayList.add(os0Var);
            if (os0Var instanceof dr0) {
                if ((md8.areEqual(bool, Boolean.TRUE) || ((dr0) os0Var).isExpanded()) && (childNode = os0Var.getChildNode()) != null && !childNode.isEmpty()) {
                    arrayList.addAll(flatData(childNode, bool));
                }
                if (bool != null) {
                    ((dr0) os0Var).setExpanded(bool.booleanValue());
                }
            } else {
                List<os0> childNode2 = os0Var.getChildNode();
                if (childNode2 != null && !childNode2.isEmpty()) {
                    arrayList.addAll(flatData(childNode2, bool));
                }
            }
            if ((os0Var instanceof jeb) && (footerNode = ((jeb) os0Var).getFooterNode()) != null) {
                arrayList.add(footerNode);
            }
        }
        return arrayList;
    }

    private final int removeChildAt(int i) {
        os0 os0Var;
        List<os0> childNode;
        if (i >= getData().size() || (childNode = (os0Var = getData().get(i)).getChildNode()) == null || childNode.isEmpty()) {
            return 0;
        }
        if (!(os0Var instanceof dr0)) {
            List<os0> childNode2 = os0Var.getChildNode();
            if (childNode2 == null) {
                md8.throwNpe();
            }
            List listM19729y = m19729y(this, childNode2, null, 2, null);
            getData().removeAll(listM19729y);
            return listM19729y.size();
        }
        if (!((dr0) os0Var).isExpanded()) {
            return 0;
        }
        List<os0> childNode3 = os0Var.getChildNode();
        if (childNode3 == null) {
            md8.throwNpe();
        }
        List listM19729y2 = m19729y(this, childNode3, null, 2, null);
        getData().removeAll(listM19729y2);
        return listM19729y2.size();
    }

    private final int removeNodesAt(int i) {
        if (i >= getData().size()) {
            return 0;
        }
        int iRemoveChildAt = removeChildAt(i);
        getData().remove(i);
        int i2 = iRemoveChildAt + 1;
        Object obj = (os0) getData().get(i);
        if (!(obj instanceof jeb) || ((jeb) obj).getFooterNode() == null) {
            return i2;
        }
        getData().remove(i);
        return iRemoveChildAt + 2;
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ int m19727w(ps0 ps0Var, int i, boolean z, boolean z2, boolean z3, Object obj, int i2, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: collapse");
        }
        if ((i2 & 2) != 0) {
            z = false;
        }
        boolean z4 = z;
        boolean z5 = (i2 & 4) != 0 ? true : z2;
        boolean z6 = (i2 & 8) != 0 ? true : z3;
        if ((i2 & 16) != 0) {
            obj = null;
        }
        return ps0Var.collapse(i, z4, z5, z6, obj);
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ int m19728x(ps0 ps0Var, int i, boolean z, boolean z2, boolean z3, Object obj, int i2, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: expand");
        }
        if ((i2 & 2) != 0) {
            z = false;
        }
        boolean z4 = z;
        boolean z5 = (i2 & 4) != 0 ? true : z2;
        boolean z6 = (i2 & 8) != 0 ? true : z3;
        if ((i2 & 16) != 0) {
            obj = null;
        }
        return ps0Var.expand(i, z4, z5, z6, obj);
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ List m19729y(ps0 ps0Var, Collection collection, Boolean bool, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: flatData");
        }
        if ((i & 2) != 0) {
            bool = null;
        }
        return ps0Var.flatData(collection, bool);
    }

    public final void addFooterNodeProvider(@yfb qs0 qs0Var) {
        md8.checkParameterIsNotNull(qs0Var, "provider");
        addFullSpanNodeProvider(qs0Var);
    }

    public final void addFullSpanNodeProvider(@yfb qs0 qs0Var) {
        md8.checkParameterIsNotNull(qs0Var, "provider");
        this.f71782I.add(Integer.valueOf(qs0Var.getItemViewType()));
        addItemProvider(qs0Var);
    }

    @Override // p000.lt0
    public void addItemProvider(@yfb lr0<os0> lr0Var) {
        md8.checkParameterIsNotNull(lr0Var, "provider");
        if (!(lr0Var instanceof qs0)) {
            throw new IllegalStateException("Please add BaseNodeProvider, no BaseItemProvider!");
        }
        super.addItemProvider(lr0Var);
    }

    public final void addNodeProvider(@yfb qs0 qs0Var) {
        md8.checkParameterIsNotNull(qs0Var, "provider");
        addItemProvider(qs0Var);
    }

    @yn8
    public final int collapse(@h78(from = 0) int i) {
        return collapse$default(this, i, false, false, null, 14, null);
    }

    @yn8
    public final int collapseAndChild(@h78(from = 0) int i) {
        return collapseAndChild$default(this, i, false, false, null, 14, null);
    }

    @yn8
    public final int expand(@h78(from = 0) int i) {
        return expand$default(this, i, false, false, null, 14, null);
    }

    @yn8
    public final int expandAndChild(@h78(from = 0) int i) {
        return expandAndChild$default(this, i, false, false, null, 14, null);
    }

    @yn8
    public final void expandAndCollapseOther(@h78(from = 0) int i) {
        expandAndCollapseOther$default(this, i, false, false, false, false, null, null, 126, null);
    }

    @yn8
    public final int expandOrCollapse(@h78(from = 0) int i) {
        return expandOrCollapse$default(this, i, false, false, null, 14, null);
    }

    public final int findParentNode(@yfb os0 os0Var) {
        md8.checkParameterIsNotNull(os0Var, "node");
        int iIndexOf = getData().indexOf(os0Var);
        if (iIndexOf != -1 && iIndexOf != 0) {
            for (int i = iIndexOf - 1; i >= 0; i--) {
                List<os0> childNode = getData().get(i).getChildNode();
                if (childNode != null && childNode.contains(os0Var)) {
                    return i;
                }
            }
        }
        return -1;
    }

    @Override // p000.mt0
    /* JADX INFO: renamed from: j */
    public boolean mo10228j(int i) {
        return super.mo10228j(i) || this.f71782I.contains(Integer.valueOf(i));
    }

    public final void nodeAddData(@yfb os0 os0Var, @yfb os0 os0Var2) {
        md8.checkParameterIsNotNull(os0Var, "parentNode");
        md8.checkParameterIsNotNull(os0Var2, "data");
        List<os0> childNode = os0Var.getChildNode();
        if (childNode != null) {
            childNode.add(os0Var2);
            if (!(os0Var instanceof dr0) || ((dr0) os0Var).isExpanded()) {
                addData(getData().indexOf(os0Var) + childNode.size(), os0Var2);
            }
        }
    }

    public final void nodeRemoveData(@yfb os0 os0Var, int i) {
        md8.checkParameterIsNotNull(os0Var, "parentNode");
        List<os0> childNode = os0Var.getChildNode();
        if (childNode == null || i >= childNode.size()) {
            return;
        }
        if ((os0Var instanceof dr0) && !((dr0) os0Var).isExpanded()) {
            childNode.remove(i);
        } else {
            remove(getData().indexOf(os0Var) + 1 + i);
            childNode.remove(i);
        }
    }

    public final void nodeReplaceChildData(@yfb os0 os0Var, @yfb Collection<? extends os0> collection) {
        md8.checkParameterIsNotNull(os0Var, "parentNode");
        md8.checkParameterIsNotNull(collection, "newData");
        List<os0> childNode = os0Var.getChildNode();
        if (childNode != null) {
            if ((os0Var instanceof dr0) && !((dr0) os0Var).isExpanded()) {
                childNode.clear();
                childNode.addAll(collection);
                return;
            }
            int iIndexOf = getData().indexOf(os0Var);
            int iRemoveChildAt = removeChildAt(iIndexOf);
            childNode.clear();
            childNode.addAll(collection);
            List listM19729y = m19729y(this, collection, null, 2, null);
            int i = iIndexOf + 1;
            getData().addAll(i, listM19729y);
            int headerLayoutCount = i + getHeaderLayoutCount();
            if (iRemoveChildAt == listM19729y.size()) {
                notifyItemRangeChanged(headerLayoutCount, iRemoveChildAt);
            } else {
                notifyItemRangeRemoved(headerLayoutCount, iRemoveChildAt);
                notifyItemRangeInserted(headerLayoutCount, listM19729y.size());
            }
        }
    }

    public final void nodeSetData(@yfb os0 os0Var, int i, @yfb os0 os0Var2) {
        md8.checkParameterIsNotNull(os0Var, "parentNode");
        md8.checkParameterIsNotNull(os0Var2, "data");
        List<os0> childNode = os0Var.getChildNode();
        if (childNode == null || i >= childNode.size()) {
            return;
        }
        if ((os0Var instanceof dr0) && !((dr0) os0Var).isExpanded()) {
            childNode.set(i, os0Var2);
        } else {
            setData(getData().indexOf(os0Var) + 1 + i, os0Var2);
            childNode.set(i, os0Var2);
        }
    }

    @Override // p000.mt0
    public void removeAt(int i) {
        notifyItemRangeRemoved(i + getHeaderLayoutCount(), removeNodesAt(i));
        m17546b(0);
    }

    @Override // p000.mt0
    public void setDiffNewData(@gib List<os0> list) {
        if (hasEmptyView()) {
            setNewInstance(list);
        } else {
            super.setDiffNewData(m19729y(this, list != null ? list : new ArrayList(), null, 2, null));
        }
    }

    @Override // p000.mt0
    public void setList(@gib Collection<? extends os0> collection) {
        if (collection == null) {
            collection = new ArrayList<>();
        }
        super.setList(m19729y(this, collection, null, 2, null));
    }

    @Override // p000.mt0
    public void setNewInstance(@gib List<os0> list) {
        super.setNewInstance(m19729y(this, list != null ? list : new ArrayList(), null, 2, null));
    }

    public /* synthetic */ ps0(List list, int i, jt3 jt3Var) {
        this((i & 1) != 0 ? null : list);
    }

    @yn8
    public final int collapse(@h78(from = 0) int i, boolean z) {
        return collapse$default(this, i, z, false, null, 12, null);
    }

    @yn8
    public final int collapseAndChild(@h78(from = 0) int i, boolean z) {
        return collapseAndChild$default(this, i, z, false, null, 12, null);
    }

    @yn8
    public final int expand(@h78(from = 0) int i, boolean z) {
        return expand$default(this, i, z, false, null, 12, null);
    }

    @yn8
    public final int expandAndChild(@h78(from = 0) int i, boolean z) {
        return expandAndChild$default(this, i, z, false, null, 12, null);
    }

    @yn8
    public final void expandAndCollapseOther(@h78(from = 0) int i, boolean z) {
        expandAndCollapseOther$default(this, i, z, false, false, false, null, null, 124, null);
    }

    @yn8
    public final int expandOrCollapse(@h78(from = 0) int i, boolean z) {
        return expandOrCollapse$default(this, i, z, false, null, 12, null);
    }

    @Override // p000.mt0
    public void setData(int i, @yfb os0 os0Var) {
        md8.checkParameterIsNotNull(os0Var, "data");
        int iRemoveNodesAt = removeNodesAt(i);
        List listM19729y = m19729y(this, l82.arrayListOf(os0Var), null, 2, null);
        getData().addAll(i, listM19729y);
        if (iRemoveNodesAt == listM19729y.size()) {
            notifyItemRangeChanged(i + getHeaderLayoutCount(), iRemoveNodesAt);
        } else {
            notifyItemRangeRemoved(getHeaderLayoutCount() + i, iRemoveNodesAt);
            notifyItemRangeInserted(i + getHeaderLayoutCount(), listM19729y.size());
        }
    }

    public ps0(@gib List<os0> list) {
        super(null);
        this.f71782I = new HashSet<>();
        List<os0> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        getData().addAll(m19729y(this, list2, null, 2, null));
    }

    @Override // p000.mt0
    public void addData(int i, @yfb os0 os0Var) {
        md8.checkParameterIsNotNull(os0Var, "data");
        addData(i, (Collection<? extends os0>) l82.arrayListOf(os0Var));
    }

    @yn8
    public final int collapse(@h78(from = 0) int i, boolean z, boolean z2) {
        return collapse$default(this, i, z, z2, null, 8, null);
    }

    @yn8
    public final int collapseAndChild(@h78(from = 0) int i, boolean z, boolean z2) {
        return collapseAndChild$default(this, i, z, z2, null, 8, null);
    }

    @yn8
    public final int expand(@h78(from = 0) int i, boolean z, boolean z2) {
        return expand$default(this, i, z, z2, null, 8, null);
    }

    @yn8
    public final int expandAndChild(@h78(from = 0) int i, boolean z, boolean z2) {
        return expandAndChild$default(this, i, z, z2, null, 8, null);
    }

    @yn8
    public final void expandAndCollapseOther(@h78(from = 0) int i, boolean z, boolean z2) {
        expandAndCollapseOther$default(this, i, z, z2, false, false, null, null, 120, null);
    }

    @yn8
    public final int expandOrCollapse(@h78(from = 0) int i, boolean z, boolean z2) {
        return expandOrCollapse$default(this, i, z, z2, null, 8, null);
    }

    private final int collapse(@h78(from = 0) int i, boolean z, boolean z2, boolean z3, Object obj) {
        os0 os0Var = getData().get(i);
        if (os0Var instanceof dr0) {
            dr0 dr0Var = (dr0) os0Var;
            if (dr0Var.isExpanded()) {
                int headerLayoutCount = i + getHeaderLayoutCount();
                dr0Var.setExpanded(false);
                List<os0> childNode = os0Var.getChildNode();
                if (childNode != null && !childNode.isEmpty()) {
                    List<os0> childNode2 = os0Var.getChildNode();
                    if (childNode2 == null) {
                        md8.throwNpe();
                    }
                    List<os0> listFlatData = flatData(childNode2, z ? Boolean.FALSE : null);
                    int size = listFlatData.size();
                    getData().removeAll(listFlatData);
                    if (z3) {
                        if (z2) {
                            notifyItemChanged(headerLayoutCount, obj);
                            notifyItemRangeRemoved(headerLayoutCount + 1, size);
                        } else {
                            notifyDataSetChanged();
                        }
                    }
                    return size;
                }
                notifyItemChanged(headerLayoutCount, obj);
            }
        }
        return 0;
    }

    private final int expand(@h78(from = 0) int i, boolean z, boolean z2, boolean z3, Object obj) {
        os0 os0Var = getData().get(i);
        if (os0Var instanceof dr0) {
            dr0 dr0Var = (dr0) os0Var;
            if (!dr0Var.isExpanded()) {
                int headerLayoutCount = getHeaderLayoutCount() + i;
                dr0Var.setExpanded(true);
                List<os0> childNode = os0Var.getChildNode();
                if (childNode != null && !childNode.isEmpty()) {
                    List<os0> childNode2 = os0Var.getChildNode();
                    if (childNode2 == null) {
                        md8.throwNpe();
                    }
                    List<os0> listFlatData = flatData(childNode2, z ? Boolean.TRUE : null);
                    int size = listFlatData.size();
                    getData().addAll(i + 1, listFlatData);
                    if (z3) {
                        if (z2) {
                            notifyItemChanged(headerLayoutCount, obj);
                            notifyItemRangeInserted(headerLayoutCount + 1, size);
                        } else {
                            notifyDataSetChanged();
                        }
                    }
                    return size;
                }
                notifyItemChanged(headerLayoutCount, obj);
            }
        }
        return 0;
    }

    @Override // p000.mt0
    public void addData(@yfb os0 os0Var) {
        md8.checkParameterIsNotNull(os0Var, "data");
        addData((Collection<? extends os0>) l82.arrayListOf(os0Var));
    }

    @yn8
    public final int collapseAndChild(@h78(from = 0) int i, boolean z, boolean z2, @gib Object obj) {
        return collapse(i, true, z, z2, obj);
    }

    @yn8
    public final int expandAndChild(@h78(from = 0) int i, boolean z, boolean z2, @gib Object obj) {
        return expand(i, true, z, z2, obj);
    }

    @yn8
    public final void expandAndCollapseOther(@h78(from = 0) int i, boolean z, boolean z2, boolean z3) {
        expandAndCollapseOther$default(this, i, z, z2, z3, false, null, null, 112, null);
    }

    @yn8
    public final int expandOrCollapse(@h78(from = 0) int i, boolean z, boolean z2, @gib Object obj) {
        os0 os0Var = getData().get(i);
        if (!(os0Var instanceof dr0)) {
            return 0;
        }
        if (((dr0) os0Var).isExpanded()) {
            return collapse(i, false, z, z2, obj);
        }
        return expand(i, false, z, z2, obj);
    }

    public final int findParentNode(@h78(from = 0) int i) {
        if (i == 0) {
            return -1;
        }
        os0 os0Var = getData().get(i);
        for (int i2 = i - 1; i2 >= 0; i2--) {
            List<os0> childNode = getData().get(i2).getChildNode();
            if (childNode != null && childNode.contains(os0Var)) {
                return i2;
            }
        }
        return -1;
    }

    @Override // p000.mt0
    public void setDiffNewData(@yfb DiffUtil.DiffResult diffResult, @yfb List<os0> list) {
        md8.checkParameterIsNotNull(diffResult, "diffResult");
        md8.checkParameterIsNotNull(list, "list");
        if (hasEmptyView()) {
            setNewInstance(list);
        } else {
            super.setDiffNewData(diffResult, m19729y(this, list, null, 2, null));
        }
    }

    @Override // p000.mt0
    public void addData(int i, @yfb Collection<? extends os0> collection) {
        md8.checkParameterIsNotNull(collection, "newData");
        super.addData(i, (Collection) m19729y(this, collection, null, 2, null));
    }

    @yn8
    public final void expandAndCollapseOther(@h78(from = 0) int i, boolean z, boolean z2, boolean z3, boolean z4) {
        expandAndCollapseOther$default(this, i, z, z2, z3, z4, null, null, 96, null);
    }

    @yn8
    public final void expandAndCollapseOther(@h78(from = 0) int i, boolean z, boolean z2, boolean z3, boolean z4, @gib Object obj) {
        expandAndCollapseOther$default(this, i, z, z2, z3, z4, obj, null, 64, null);
    }

    @Override // p000.mt0
    public void addData(@yfb Collection<? extends os0> collection) {
        md8.checkParameterIsNotNull(collection, "newData");
        super.addData((Collection) m19729y(this, collection, null, 2, null));
    }

    @yn8
    public final void expandAndCollapseOther(@h78(from = 0) int i, boolean z, boolean z2, boolean z3, boolean z4, @gib Object obj, @gib Object obj2) {
        int i2;
        int size;
        int iExpand = expand(i, z, z3, z4, obj);
        if (iExpand == 0) {
            return;
        }
        int iFindParentNode = findParentNode(i);
        int i3 = iFindParentNode == -1 ? 0 : iFindParentNode + 1;
        if (i - i3 > 0) {
            int i4 = i3;
            i2 = i;
            do {
                int iCollapse = collapse(i4, z2, z3, z4, obj2);
                i4++;
                i2 -= iCollapse;
            } while (i4 < i2);
        } else {
            i2 = i;
        }
        if (iFindParentNode == -1) {
            size = getData().size() - 1;
        } else {
            List<os0> childNode = getData().get(iFindParentNode).getChildNode();
            size = iFindParentNode + (childNode != null ? childNode.size() : 0) + iExpand;
        }
        int i5 = i2 + iExpand;
        if (i5 < size) {
            int i6 = i5 + 1;
            while (i6 <= size) {
                int iCollapse2 = collapse(i6, z2, z3, z4, obj2);
                i6++;
                size -= iCollapse2;
            }
        }
    }

    public final void nodeAddData(@yfb os0 os0Var, int i, @yfb os0 os0Var2) {
        md8.checkParameterIsNotNull(os0Var, "parentNode");
        md8.checkParameterIsNotNull(os0Var2, "data");
        List<os0> childNode = os0Var.getChildNode();
        if (childNode != null) {
            childNode.add(i, os0Var2);
            if (!(os0Var instanceof dr0) || ((dr0) os0Var).isExpanded()) {
                addData(getData().indexOf(os0Var) + 1 + i, os0Var2);
            }
        }
    }

    public final void nodeRemoveData(@yfb os0 os0Var, @yfb os0 os0Var2) {
        md8.checkParameterIsNotNull(os0Var, "parentNode");
        md8.checkParameterIsNotNull(os0Var2, "childNode");
        List<os0> childNode = os0Var.getChildNode();
        if (childNode != null) {
            if ((os0Var instanceof dr0) && !((dr0) os0Var).isExpanded()) {
                childNode.remove(os0Var2);
            } else {
                remove(os0Var2);
                childNode.remove(os0Var2);
            }
        }
    }

    public final void nodeAddData(@yfb os0 os0Var, int i, @yfb Collection<? extends os0> collection) {
        md8.checkParameterIsNotNull(os0Var, "parentNode");
        md8.checkParameterIsNotNull(collection, "newData");
        List<os0> childNode = os0Var.getChildNode();
        if (childNode != null) {
            childNode.addAll(i, collection);
            if (!(os0Var instanceof dr0) || ((dr0) os0Var).isExpanded()) {
                addData(getData().indexOf(os0Var) + 1 + i, collection);
            }
        }
    }

    @yn8
    public final int collapse(@h78(from = 0) int i, boolean z, boolean z2, @gib Object obj) {
        return collapse(i, false, z, z2, obj);
    }

    @yn8
    public final int expand(@h78(from = 0) int i, boolean z, boolean z2, @gib Object obj) {
        return expand(i, false, z, z2, obj);
    }
}
